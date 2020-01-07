public class IniciaisMaiusculas{
	public static void main(String[] args){
		//frase a ser posto com iniciais maiúsculas
		String frase = "tExTo deScoNfiGurAdo De tEsTe";
		alteraTodasAsPalavras(frase);
		alteraTodasAsPalavrasENaoconectivos(frase);
	}
	
	public static void alteraTodasAsPalavras(String frase){
		//dividindo frase em palavras 
		String[] palavras = frase.split(" ");
		StringBuilder sb = new StringBuilder();
		//looping 
		for(int i = 0; i < palavras.length; i++){
			//pega a palavra do indice atual do array
			String palavra = palavras[i];
			//altera a primeira letra para maiuscula
			palavra = palavra.substring(0, 1).toUpperCase() + palavra.substring(1);
			//adiciona a uma frase atualizada
			sb.append(" ").append(palavra);
		}
		System.out.println(sb.toString().replaceFirst(" ", ""));
	}
	
	public static void alteraTodasAsPalavrasENaoconectivos(String frase){
		//nova string
		String novaFrase = "";
		//looping corrige se houver letras amiusculas no meio das palavras
		for(String palavra : frase.toLowerCase().split(" ")){
			//valida de a palavra esta vazia
			if(!"".equals(palavra)){
				//valida se a frase esta vazia
				if(!"".equals(novaFrase)){
					novaFrase += " ";
				}
				//valida se a palavra possui menos de 2 caracteres
				if(palavra.length() > 2){
					//altera a primeira letra para maiuscula e atribui a nova frase
					novaFrase += palavra.substring(0, 1).toUpperCase() + palavra.substring(1);
				} else {
					novaFrase += palavra;
				}
			}
		}
		System.out.println(novaFrase);
	}
}