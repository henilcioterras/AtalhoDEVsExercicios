
public class ContarPalavraFrase {
	
	public static int contaPalavra(String frase, String palavra) {
		String palavraAchada="";
		int numVezes=0;
		
		for(int i = 0;i<= frase.length() - palavra.length();i++) {
				for(int j = i; j <= ( i + palavra.length()-1);j++) {
					palavraAchada+=frase.charAt(j);
				}
				if(palavraAchada.equals(palavra)) numVezes++;
				palavraAchada="";
		}
		
		return numVezes;
	}

	public static void main(String[] args) {
		String frase = "ANAN E MARIANA GOSTAM DE BANANA";
		String palavra = "E";
	
		System.out.println(contaPalavra(frase, palavra));

	}

}
