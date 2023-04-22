import java.util.ArrayList;
import java.util.Scanner;

public class Cap {
  private String text;
  private ArrayList<Escolha> choices;

  private Personagem chars;
  private int atentionV;

  public Cap(
    String texto, ArrayList<Escolha> escolhas, Personagem personagem, int atencao) {
    this.text = texto;
    this.choices = escolhas;
    this.chars = personagem;
    this.atentionV = atencao;
  }

  public void setChoices(ArrayList<Escolha> escolhas) {
    this.choices = escolhas;
  }

  /**
   * Mostra o capitulo x, incluindo seu nome, personagem e alteração, escolhas (caso houver),
   * e o re-executa caso houver um proximo até o fim.
   */
  public void Mostrar() {
    this.chars.setAtention(this.atentionV);

    System.out.println(
        "-----------\n" +
            this.text + "\n" +
            this.chars.getName() + ": " + this.chars.getAtention());

    if (choices != null) {
      int i = 1;

      for (Escolha escolha : choices) {
        System.out.println(i + ". [" + escolha.getName() + "]");
        i++;
      }

      Scanner scanner = new Scanner(System.in);
      String playerCh = scanner.nextLine();

      for (Escolha escolha : choices) {
        if (playerCh.equals(escolha.getName())) {
          Cap proximo = escolha.getNext();
          if (proximo != null) {
            proximo.Mostrar();
            return;
          } else {
            System.out.println("Escolha inválida");
          }
        }

        scanner.close();
      }
    }
  }
}