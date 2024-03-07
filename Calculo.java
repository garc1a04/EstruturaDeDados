package Cap1.TempoDeExecucao;

public class Calculo {
	
	public static int calcularMenor(int[] arrayInt) {
		int Menor = arrayInt[0];

		for(int i = 1;i<arrayInt.length;i++) {
				if(arrayInt[i]<Menor) {
					Menor = arrayInt[i];
				}
		}
		
		return Menor;
	}
}
