package br.com.code;

public class Player {
	private String name;
	private Fighter fighter;
	
	public Player(String name, Fighter fighter) {
		this.fighter = fighter;
		this.name = name;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Fighter getFighter() {
		return fighter;
	}

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}
	
	
}
