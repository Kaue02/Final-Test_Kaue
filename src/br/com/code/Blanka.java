package br.com.code;

public class Blanka extends Fighter {

	private static final int META_ESPECIAL = 5;

	public Blanka(String name, int power, int life, Special special) {
		super(name = "Blanka", power = 5, life = 100, special);
		this.special = new Special("Ground Shave roll", 7);
	}

	@Override
	public void tomaDano(Fighter enemy) {
		enemy.setLife(enemy.getLife() - getPower());
	}

	@Override
	public void tomaDanoEspecial(Fighter enemy) {
		enemy.setLife(enemy.getLife() - getSpecial().getValueSpecial() * getPower());
	}

	@Override
	public void ataca(Fighter enemy) {
		enemy.tomaDano(enemy);
		if (getContaHit() < META_ESPECIAL) {
			setContaHit(getContaHit() + 1);
		}
	}

	@Override
	public void especial(Fighter enemy) {
		if (getContaHit() >= META_ESPECIAL) {
			System.out.println("-----------------------------------------------");
			System.out.println(enemy.getSpecial().getName());
			System.out.println("-----------------------------------------------");
			enemy.tomaDanoEspecial(enemy);
			setContaHit(0);
		} else {
			System.out.println("Ainda faltam " + (META_ESPECIAL - getContaHit()) + " hits para usar o especial");
		}
	}
}