public class Personagem {
	private String name;
	private int atention;

	public String getName() {
		return name;
	}

	public int getAtention() {
		return this.atention;
	}

	public void setAtention(int atencao) {
		this.atention += atencao;
		if (this.atention > 100) {
			this.atention = 100;
		} else if (this.atention <= 0) {
			System.out.println(this.name + " está completamente desfocado de sua tarefa");
		}
	}

	public Personagem(String nome, int atencao) {
		this.name = nome;
		this.atention = atencao;
	}
}