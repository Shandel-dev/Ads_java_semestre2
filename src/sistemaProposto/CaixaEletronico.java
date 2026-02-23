package sistemaProposto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	static final String TITLE_MAIN = "Caixa Eletrônico | FATEC-ZL";
	static final int[] BANKNOTE_VALUES = { 2, 5, 10, 20, 50, 100 };
	static final String[] BANK_NAMES = { "Banco do Brasil", "Santander", "Itaú", "Caixa" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String options[] = { "Carregar Notas", "Retirar Notas", "Estatística", "Sair" };

		int[] quantityBanknotes = new int[6];
		ArrayList<Integer>[] banks = new ArrayList[BANK_NAMES.length];

		for (int i = 0; i < banks.length; i++)
			banks[i] = new ArrayList<Integer>();
		int op = 0;

		do {
			op = JOptionPane.showOptionDialog(null, "Menu Principal", TITLE_MAIN, JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			switch (op) {

			// opção FAZER DEPOSITO
			case 0:
				quantityBanknotes = loadBankNotes(quantityBanknotes);
				break;

			// opção FAZER SAQUE
			case 1:
				int[] bankNotesWithDrawal = cashWithdrawal(quantityBanknotes, banks);
				for (int i = 0; i < quantityBanknotes.length; i++)
					quantityBanknotes[i] -= bankNotesWithDrawal[i];

				break;

			// opção LER ESTATÍSTICAS
			case 2:
				menuEstatistica(banks, quantityBanknotes);
				break;

			// opção SAIR DO PROGRAMA
			case 3:
			default:
				JOptionPane.showMessageDialog(null, "Encerrando programa...", TITLE_MAIN, JOptionPane.WARNING_MESSAGE);
				op = 3;
				break;
			}
		} while (op != 3);
	}

	// DEPOSITAR
	public static int[] loadBankNotes(int[] banknotesAvailable) {
		// 1.1. Carregar a quantidade de notas em uma área da memória com 6 ocorrências
		final String TITLE_LOAD = "Depósito bancário | FATEC-ZL";
		StringBuilder depositReport = new StringBuilder();

		int[] currQuantityBanknotes = Arrays.copyOf(banknotesAvailable, banknotesAvailable.length);
		int[] banknotesDeposited = new int[6];
		int typeDeposit = typeDepositMenu(TITLE_LOAD);

		switch (typeDeposit) {

		case 0:
			banknotesDeposited = getListPersonalizedBanknotes(TITLE_LOAD);
			if (banknotesDeposited == null)
				return banknotesAvailable;
			break;

		case 1:
			Integer quantity = getFixedBanknotesQuantity(TITLE_LOAD);
			if (quantity == null)
				return banknotesAvailable;
			Arrays.fill(banknotesDeposited, quantity);
			break;

		case 2:
		default:
			JOptionPane.showMessageDialog(null, "Operação cancelada!");
			return banknotesAvailable;
		}

		int subtotal = calculateSubtotalDeposit(banknotesDeposited);

		if (subtotal != 0) {
			depositReport.append(reportBuilder(banknotesDeposited));
			for (int i = 0; i < currQuantityBanknotes.length; i++) {
				currQuantityBanknotes[i] += banknotesDeposited[i];
			}
			JOptionPane.showMessageDialog(null, depositReport, TITLE_LOAD, JOptionPane.INFORMATION_MESSAGE);
		}

		return currQuantityBanknotes;
	}

	public static int calculateSubtotalDeposit(int[] banknotesDeposited) {
		int subtotal = 0;

		for (int i = 0; i < banknotesDeposited.length; i++)
			subtotal += banknotesDeposited[i] * BANKNOTE_VALUES[i];

		return subtotal;
	}

	public static int typeDepositMenu(String TITLE_LOAD) {
		String[] options = { "PERSONALIZADO", "FIXO", "Cancelar" };

		int opMenu = JOptionPane.showOptionDialog(null, "Selecione o tipo de depósito: \nPERSONALIZADO\nVocê informa a quantidade de cédulas para cada valor separadamente\nFIXO\nVocê informa um único número, aplicado a todos os valores.", TITLE_LOAD, JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		if (opMenu == -1)
			return 2;

		return opMenu;
	}

	public static int[] getListPersonalizedBanknotes(String TITLE_LOAD) {
		int[] applyBanknotes = new int[6];

		for (int i = 0; i < applyBanknotes.length; i++) {
			boolean isValid = false;

			do {
				try {
					String inputUser = JOptionPane.showInputDialog(null, "Depósito em dinheiro: \nInforme a quantidade de cédulas de R$ "
							+ BANKNOTE_VALUES[i] + ":", TITLE_LOAD, JOptionPane.INFORMATION_MESSAGE);
					if (inputUser == null)
						return null;

					applyBanknotes[i] = Integer.parseInt(inputUser);

					if (applyBanknotes[i] < 0)
						throw new IllegalArgumentException("O valor do depósito não pode ser negativo!");

					isValid = true;
				} catch (NumberFormatException e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Formato inválido! Insira o valor em números inteiros!", TITLE_LOAD, JOptionPane.WARNING_MESSAGE);
				} catch (IllegalArgumentException e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage(), TITLE_LOAD, JOptionPane.WARNING_MESSAGE);
				}

			} while (!isValid);
		}
		return applyBanknotes;
	}

	public static Integer getFixedBanknotesQuantity(String title) {

		Integer quantityBanknote = null;
		boolean isValid = false;

		do {

			String inputUser = JOptionPane.showInputDialog(null, "Informe a quantidade de cédulas que será depositada para cada valor:", title, JOptionPane.QUESTION_MESSAGE);

			if (inputUser == null) {
				return null; // cancelamento explícito
			}

			try {

				int parsedValue = Integer.parseInt(inputUser);

				if (parsedValue < 0) {
					JOptionPane.showMessageDialog(null, "A quantidade não pode ser negativa!", title, JOptionPane.WARNING_MESSAGE);
				} else {
					quantityBanknote = parsedValue;
					isValid = true;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato inválido! Insira um número inteiro.", title, JOptionPane.WARNING_MESSAGE);
			}

		} while (!isValid);

		return quantityBanknote;
	}

	public static String reportBuilder(int[] banknotesDeposited) {
		StringBuilder report = new StringBuilder();

		report.append("RELATÓRIO DE DEPÓSITOS\n");
		report.append("-".repeat(50) + "\n");
		report.append(String.format("%-10s%-10s%-10s%n", "QTD", "CÉDULA", "SUBTOTAL"));
		report.append("-".repeat(50) + "\n");

		for (int i = 0; i < banknotesDeposited.length; i++) {
			int subtotal = BANKNOTE_VALUES[i] * banknotesDeposited[i];
			report.append(String.format("%03d        R$ %3d      |    R$%-5d%n", banknotesDeposited[i], BANKNOTE_VALUES[i], subtotal));
		}

		report.append("-".repeat(50));

		return report.toString();

	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	// SAQUE
	public static int[] cashWithdrawal(int[] banknotesAvailable, ArrayList<Integer>[] bankList) {
		// 1.2. Solicitar que o cliente faça a retirada de valores obedecendo ao
		// critério do maior pelo menor.
		// 1.3. Dar a opção para o cliente escolher o valor e a quantidade de notas. P.
		// ex.: 1 x 20, 2 x 10
		// 1.4. Caso não tenha o valor da maior cédula, disponibilizar a próxima.
		// 1.5. Se o valor a ser solicitado for maior que o saldo total do caixa, enviar
		// a mensagem “EXCEDEU O LIMITE DO CAIXA”.
		// 1.7. No momento da solicitação do valor, coletar também o código do banco que
		// o cliente tem conta, segundo:
		int[] withdrawalBanknotes = new int[6];
		int valueTotal = 0;

		String TITLE_WITHDRAWAL = "Saque | FATEC -ZL";
		String reportWithdrawal = "";

		int optionBank = typeBank(TITLE_WITHDRAWAL);
		if (optionBank < 0)
			return new int[6];

		int opWithdrawal = typeWithdrawal(TITLE_WITHDRAWAL);

		switch (opWithdrawal) {
		case 0:
			withdrawalBanknotes = calculateAutomaticWithdrawal(TITLE_WITHDRAWAL, banknotesAvailable);
			if (withdrawalBanknotes == null)
				return new int[6]; // caso operação cancelada
			break;
		case 1:
			withdrawalBanknotes = calculateManualWithdrawal(TITLE_WITHDRAWAL, banknotesAvailable);
			if (withdrawalBanknotes == null)
				return new int[6]; // caso operação cancelada
			break;
		default:
			// caso selecionado Cancelar ou 'X' da janela
			return new int[6];
		}

		valueTotal = calculateSubtotal(withdrawalBanknotes);

		// armazena o valor do saque no seu respectivo banco
		if (valueTotal != 0) {
			bankList[optionBank].add(valueTotal);
			reportWithdrawal = reportWithdrawalBuild(withdrawalBanknotes, valueTotal);
		} else {
			reportWithdrawal = "Excedeu o limite de caixa ou \no nosso caixa não possui as combinações de notas necessárias para atender ao valor solicitado!";
		}

		JOptionPane.showMessageDialog(null, reportWithdrawal.toString());
		return withdrawalBanknotes;
	}

	public static int typeWithdrawal(String TITLE_WITHDRAWAL) {

		String[] options = { "Digitar valor", "Escolher notas" };

		int opWithdrawal = 0;
		opWithdrawal = JOptionPane.showOptionDialog(null, "Qual opção de saque deseja?", TITLE_WITHDRAWAL, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		return opWithdrawal;
	}

	public static int typeBank(String TITLE_WITHDRAWAL) {
		int optionBank = JOptionPane.showOptionDialog(null, "Em qual banco você tem conta?", TITLE_WITHDRAWAL, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, BANK_NAMES, BANK_NAMES);
		return optionBank;
	}

	public static int[] calculateAutomaticWithdrawal(String TITLE_WITHDRAWAL, int[] banknotesAvailable) {

		int[] usedBanknotes = new int[6];

		Integer requestValue = requestWithdrawalValue(TITLE_WITHDRAWAL);

		// CASO CANCELAMENTO
		if (requestValue == null)
			return null;

		// verifica se usuario continuou a operação ou clicou em cancelar

		if (!withdrawalAvailable(requestValue, banknotesAvailable, usedBanknotes))
			Arrays.fill(usedBanknotes, 0);

		return usedBanknotes;

	}

	public static boolean withdrawalAvailable(int withdrawal, int[] banknotesAvailable, int[] usedBanknotes) {
		for (int i = banknotesAvailable.length - 1; i >= 0; i--) {
			if (banknotesAvailable[i] > 0) {

				// Quantas notas seriam necessárias desse valor
				int qtdNecessaria = withdrawal / BANKNOTE_VALUES[i];

				// Usa o mínimo entre o necessário e o disponível
				int qtdUsada = Math.min(qtdNecessaria, banknotesAvailable[i]);

				withdrawal -= qtdUsada * BANKNOTE_VALUES[i];

				usedBanknotes[i] = qtdUsada;
			}
		}
		return (withdrawal == 0);
	}

	public static Integer requestWithdrawalValue(String TITLE_WITHDRAWAL) {
		int value = 0;

		do {
			try {
				String inputValue = JOptionPane.showInputDialog(null, "Insira o valor do saque desejado: ", TITLE_WITHDRAWAL, JOptionPane.QUESTION_MESSAGE);

				// caso usuario feche janela ou clique em Cancelar
				if (inputValue == null)
					return null;
				value = Integer.parseInt(inputValue);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Formato inválido de saque! Tente novamente!", TITLE_WITHDRAWAL, JOptionPane.WARNING_MESSAGE);
			} catch (IllegalArgumentException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e.getMessage(), TITLE_WITHDRAWAL, JOptionPane.WARNING_MESSAGE);
			}
			if (value == -1)
				throw new IllegalStateException("Operação cancelada!");
		} while (value < 1);

		return value;
	}

	public static int[] calculateManualWithdrawal(String TITLE_WITHDRAWAL, int[] banknotesAvailable) {
		int[] usedBanknotes = new int[6];

		int[] requestBanknotes = requestListBanknotes(banknotesAvailable, TITLE_WITHDRAWAL);
		if (requestBanknotes == null)
			return null;

		for (int i = 0; i < requestBanknotes.length; i++) {
			if (requestBanknotes[i] <= banknotesAvailable[i]) {
				usedBanknotes[i] = requestBanknotes[i];
			} else {
				Arrays.fill(usedBanknotes, 0);
				break;
			}
		}

		return usedBanknotes;
	}

	public static int[] requestListBanknotes(int[] banknotesAvailable, String TITLE_WITHDRAWAL) {
		int[] banknotesRequest = new int[6];

		for (int i = banknotesAvailable.length - 1; i >= 0; i--) {

			if (banknotesAvailable[i] > 0) {
				boolean valido = false;
				int qtdBanknote = 0;

				while (!valido) {
					try {
						String msgRequest = String.format("Quantas cédulas de R$ %d deseja?%n(Notas disponíveis: %d cédulas)", BANKNOTE_VALUES[i], banknotesAvailable[i]);

						String inputUser = JOptionPane.showInputDialog(null, msgRequest, TITLE_WITHDRAWAL, JOptionPane.QUESTION_MESSAGE);

						if (inputUser == null)
							return null;

						qtdBanknote = Integer.parseInt(inputUser);

						if (qtdBanknote < 0)
							throw new IllegalArgumentException("A qtd. de cédulas a sacar deve ser maior que 0!");

						valido = true;

					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Formato inválido!", TITLE_WITHDRAWAL, JOptionPane.WARNING_MESSAGE);
					} catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, e.getMessage(), TITLE_WITHDRAWAL, JOptionPane.WARNING_MESSAGE);
					}
				}

				banknotesRequest[i] = qtdBanknote;

			} else {
				JOptionPane.showMessageDialog(null, "Cédulas de R$ " + BANKNOTE_VALUES[i]
						+ " indisponíveis em nosso caixa!\n", TITLE_WITHDRAWAL, JOptionPane.WARNING_MESSAGE);
			}

		}

		return banknotesRequest;
	}

	public static int calculateSubtotal(int[] withdrawalBanknotes) {
		int subtotal = 0;
		for (int i = 0; i < withdrawalBanknotes.length; i++)
			subtotal += withdrawalBanknotes[i] * BANKNOTE_VALUES[i];
		return subtotal;
	}

	public static String reportWithdrawalBuild(int[] withdrawalBanknotes, int totalValue) {
		if (totalValue == 0) {
			return "EXCEDEU LIMITE DE CAIXA";
		} else {
			StringBuilder report = new StringBuilder("SAQUE REALIZADO COM SUCESSO!\n");
			int total = 0;

			report.append("-".repeat(30));
			report.append("\nQTD | CÉDULA\n");
			for (int i = 0; i < withdrawalBanknotes.length; i++) {
				if (withdrawalBanknotes[i] != 0) {
					report.append(String.format("%03d | R$ %d%n", withdrawalBanknotes[i], BANKNOTE_VALUES[i]));
					total += withdrawalBanknotes[i] * BANKNOTE_VALUES[i];
				}
			}
			report.append("-".repeat(30));
			report.append("\nTotal: R$ " + total);
			return report.toString();
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	public static void menuEstatistica(ArrayList<Integer>[] banks, int[] banknotesAvailables) {

		final String TITLE_STATISTICS = "Estatísticas | Fatec-ZL";
		String reportBanks[] = reportBanksBuilder(banks);
		String cashReport = reportCashBuild(banknotesAvailables);

		for (int i = 0; i < reportBanks.length; i++) {
			String msgEstatisticas = String.format("%d. %s%n%s", (i + 1), BANK_NAMES[i], reportBanks[i]);

			JOptionPane.showMessageDialog(null, msgEstatisticas, TITLE_STATISTICS, JOptionPane.INFORMATION_MESSAGE);
		}

		JOptionPane.showMessageDialog(null, cashReport, TITLE_STATISTICS, JOptionPane.INFORMATION_MESSAGE);

		// &nbsp; = " ";
		/*
		 * 1.8. No final, exibir a estatística, separada por bancos, com: 1.8.1. O maior
		 * e o menor valor sacado; 1.8.2. A média dos saques; 1.8.3. Valor total dos
		 * saques; 1.8.4. Valor das sobras dos caixas.
		 */
	}

	public static String[] reportBanksBuilder(ArrayList<Integer>[] banks) {
		String[] reports = new String[banks.length];
		Locale localFormat = Locale.forLanguageTag("pt-br");

		for (int i = 0; i < reports.length; i++) {
			StringBuilder rp = new StringBuilder();

			double[] dados = { maiorSaque(banks[i]), menorSaque(banks[i]), mediaSaques(banks[i]),
					totalValorSaques(banks[i]) };
			String[] lblText = { "Maior saque", "Menor saque", "Média de valor dos saques", "Valor total dos saques" };

			for (int j = 0; j < dados.length; j++) {
				rp.append(String.format(localFormat, "%s: R$ %,.2f%n", lblText[j], dados[j]));
			}

			reports[i] = rp.toString();
		}

		return reports;
	}

	public static double maiorSaque(ArrayList<Integer> bank) {
		if (bank.size() == 0)
			return 0;
		int maior = bank.get(0);
		for (int i : bank)
			if (i > maior)
				maior = i;
		return (double) maior;
	}

	public static double menorSaque(ArrayList<Integer> bank) {
		if (bank.size() == 0)
			return 0;
		int menor = bank.get(0);
		for (int saque : bank)
			if (saque < menor)
				menor = saque;
		return (double) menor;
	}

	public static double mediaSaques(ArrayList<Integer> bank) {

		if (bank.size() == 0)
			return 0.0;

		int total = 0;
		for (int saque : bank)
			total += saque;
		return (double) total / bank.size();
	}

	public static double totalValorSaques(ArrayList<Integer> bank) {
		if (bank.size() == 0)
			return 0;
		int total = 0;

		for (int saque : bank)
			total += saque;
		return (double) total;
	}

	public static String reportCashBuild(int[] banknotesAvailable) {

		StringBuilder report = new StringBuilder("<html><pre>");

		report.append(String.format("%s| %6s | %8s%n", "Cédula", "Qtd.", "Subtotal"));

		for (int i = 0; i < banknotesAvailable.length; i++) {
			double subtotal = (double) banknotesAvailable[i] * BANKNOTE_VALUES[i];

			report.append(String.format(Locale.forLanguageTag("pt-BR"), "R$%3d | %6d | R$%8.2f%n", BANKNOTE_VALUES[i], banknotesAvailable[i], subtotal));
		}

		report.append("</pre></html>");

		return report.toString();
	}

}
