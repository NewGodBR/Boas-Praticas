public class Escolha {
private String name;
private Cap next;

public String getName() {
  return name;
}

public Cap getNext() {
  return next;
}

public void setCapProx(Cap proximo) {
  this.next = proximo;
}

public Escolha(String texto, Cap proximo) {
  this.name = texto;
  this.next = proximo;
}

}