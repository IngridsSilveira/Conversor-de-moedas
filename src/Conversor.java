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
		
		String valor;
		String msg;
		int opcao;
		opcao = Integer.parseInt(TiposDeMoedas);
		
		if(opcao == 1) {
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Euros:");
			double valorReal = Double.parseDouble(valor);
			
			final double euro = 0.19;
			
			double valorConvertido = valorReal * euro;
			
			msg = "O valor em Euro é: " + valorConvertido;
			
			String msg2 = "Deseja continuar?";
			
			JOptionPane.showMessageDialog(null, msg);
			
			int teste = JOptionPane.showConfirmDialog(null, msg2);
			
			if(teste == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Programa retornado");
			}
			
			else if(teste == JOptionPane.NO_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Programa finalizado");
			}
			else if(teste == JOptionPane.CANCEL_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Programa concluído");
			}
			
		} 
		
		else if (opcao == 2) {
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Dólares:");
			double valorReal = Double.parseDouble(valor);
			final double dolar = 0.19;
			double valorConvertido = valorReal * dolar;
			msg = "O valor em Dólar é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 3) {
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Peso Argentino:");
			double valorReal = Double.parseDouble(valor);
			final double argentino = 26.11;
			double valorConvertido = valorReal * argentino;
			msg = "O valor em Peso Argentino é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 4) {
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter para Peso Chileno:");
			double valorReal = Double.parseDouble(valor);
			final double chileno = 175.44;
			double valorConvertido = valorReal * chileno;
			msg = "O valor em Peso Chileno é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 5) {
			valor = JOptionPane.showInputDialog("Digite o valor em Euros que deseja converter para Reais:");
			double valorEuro = Double.parseDouble(valor);
			final double reais = 5.25;
			double valorConvertido = valorEuro * reais;
			msg = "O valor em Reais é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 6) {
			valor = JOptionPane.showInputDialog("Digite o valor em Dólares que deseja converter para Reais:");
			double valorDolar = Double.parseDouble(valor);
			final double reais = 5.19;
			double valorConvertido = valorDolar * reais;
			msg = "O valor em Reais é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 7) {
			valor = JOptionPane.showInputDialog("Digite o valor em Peso Argentino que deseja converter para Reais:");
			double valorArgentino = Double.parseDouble(valor);
			final double reais = 0.038;
			double valorConvertido = valorArgentino * reais;
			msg = "O valor em Reais é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (opcao == 8) {
			valor = JOptionPane.showInputDialog("Digite o valor em Peso Chileno que deseja converter para Reais:");
			double valorChileno = Double.parseDouble(valor);
			final double reais = 0.0057;
			double valorConvertido = valorChileno * reais;
			msg = "O valor em Reais é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}