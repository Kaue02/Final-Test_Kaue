package br.com.code;

public abstract class Fighter {

	private String name;
	private int power;
	private int life;
	protected Special special;
	private int contaHit;


	public Fighter(String name, int power, int life, Special special) {
		this.name = name;
		this.power = power;
		this.life = life;
		this.special = special;

	}

	public abstract void tomaDano(Fighter f);
	
	public abstract void tomaDanoEspecial(Fighter f);

	public abstract void ataca(Fighter f);

	public abstract void especial(Fighter f);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public Special getSpecial() {
		return special;
	}

	public void setSpecial(Special special) {
		this.special = special;
	}

	public int getContaHit() {
		return contaHit;
	}

	public void setContaHit(int contaHit) {
		this.contaHit = contaHit;
	}
	

}
