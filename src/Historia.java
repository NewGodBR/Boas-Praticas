import java.util.Scanner;
import java.util.HashMap;

public class Historia {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
/* 
* Ler/Criar os Dicionários
*/
    HashMap<String, Personagem> personagens = LeitorArquivos.lerPersonagens();

    HashMap<String, Cap> capitulos = LeitorArquivos.lerCapitulos();
/*
 * Executável 
 */
    Cap cabeca = capitulos.get("encontrododesastre");

    cabeca.Mostrar();

    scanner.close();
  }
}
