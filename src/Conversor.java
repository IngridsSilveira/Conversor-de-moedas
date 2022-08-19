import javax.swing.JOptionPane;

public class Conversor {
	public static void main(String[] args) {
		
		String TiposDeMoedas;
		TiposDeMoedas = JOptionPane.showInputDialog("Escolha a opção de conversão desejada: "
				+ "\n1 - Reais para Euros; "
				+ "\n2 - Reais para Dólares; "
				+ "\n3 - Reais para Peso Argentino;"
				+ "\n4 - Reais para Peso Chileno;"
				+ "\n5 - Euros para Reais;"
				+ "\n6 - Dólares para Reais;"
				+ "\n7 - Peso Argentino para Reais;"
				+ "\n8 - Peso Chileno para Reais.");
		
		int opcao;
		opcao = Integer.parseInt(TiposDeMoedas);
		
		if(opcao == 1) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Euros:");
			double valorReal = Double.parseDouble(valor);
			final double euro = 0.19;
			double valorConvertido = valorReal * euro;
			String msg;
			msg = "O valor em Euro é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		} 
		
		else if (opcao == 2) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Dólares:");
			double valorReal = Double.parseDouble(valor);
			final double dolar = 0.19;
			double valorConvertido = valorReal * dolar;
			String msg;
			msg = "O valor em Dólar é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 3) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Peso Argentino:");
			double valorReal = Double.parseDouble(valor);
			final double argentino = 26.11;
			double valorConvertido = valorReal * argentino;
			String msg;
			msg = "O valor em Peso Argentino é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 4) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Peso Chileno:");
			double valorReal = Double.parseDouble(valor);
			final double chileno = 175.44;
			double valorConvertido = valorReal * chileno;
			String msg;
			msg = "O valor em Peso Chileno é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 5) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Euros que deseja converter para Reais:");
			double valorEuro = Double.parseDouble(valor);
			final double reais = 5.25;
			double valorConvertido = valorEuro * reais;
			String msg;
			msg = "O valor em Reais é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 6) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Dólares que deseja converter para Reais:");
			double valorDolar = Double.parseDouble(valor);
			final double reais = 5.19;
			double valorConvertido = valorDolar * reais;
			String msg;
			msg = "O valor em Reais é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 7) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Peso Argentino que deseja converter para Reais:");
			double valorArgentino = Double.parseDouble(valor);
			final double reais = 0.038;
			double valorConvertido = valorArgentino * reais;
			String msg;
			msg = "O valor em Reais é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 8) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Peso Chileno que deseja converter para Reais:");
			double valorChileno = Double.parseDouble(valor);
			final double reais = 0.0057;
			double valorConvertido = valorChileno * reais;
			String msg;
			msg = "O valor em Reais é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}