import java.util.*;
public class Exercicio2_7 {

	public static void main(String[] args) {
		// 1 - variaveis
		byte tempoCasa;
		float salario;
		float bonus;
		float valeTransp;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o tempo de casa do empregado: ");
		tempoCasa = leia.nextByte();
		
		System.out.print("Digite o salario: ");
		salario = leia.nextFloat();
		
		// 3 - calculos
//		if (tempoCasa <= 5 && salario <= 300) {
//			bonus = 50;
//			valeTransp = (float)0.05 * salario;
//		} else if (tempoCasa <= 5 && salario > 300) {
//			bonus = 80;
//			valeTransp = (float)0.06 * salario;
//		} else if (tempoCasa <= 10 && salario <= 500) {
//			bonus = (float)0.15 * salario;
//			valeTransp = 70;
//		} else if (tempoCasa <= 10 && salario <= 2000) {
//			bonus = (float)0.13 * salario;
//			valeTransp = 90;
//		} else if (tempoCasa <= 10) { // salario > 2000
//			bonus = (float)0.12 * salario;
//			valeTransp = (float)0.08 * salario;
//		} else {
//			bonus = 300;
//			valeTransp = (float)0.04 * salario;
//		}
		
		
		if (tempoCasa <= 5) {
			if (salario <= 300) {
				bonus = 50;
				valeTransp = (float)0.05 * salario;
			} else {
				bonus = 80;
				valeTransp = (float)0.06 * salario;
			}
		} else if (tempoCasa <= 10) {
			if (salario <= 500) {
				bonus = (float)0.15 * salario;
				valeTransp = 70;
			} else if (salario <= 2000) {
				bonus = (float)0.13 * salario;
				valeTransp = 90;
			} else {
				bonus = (float)0.12 * salario;
				valeTransp = (float)0.08 * salario;
			}
		} else { // tempoCasa > 10
			bonus = 300;
			valeTransp = (float)0.04 * salario;
		}
		
		// 4 - saidas de dados
		System.out.println("Bonus salarial: " + bonus);
		System.out.println("Desconto de vale transporte: " + valeTransp);
	}

}
