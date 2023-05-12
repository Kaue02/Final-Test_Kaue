package br.com.code;

public class Zangief extends Fighter {

	private static final int META_ESPECIAL = 4;

	public Zangief(String name, int power, int life, Special special) {
		super(name = "Zangief", power = 6, life = 90, special);
		this.special = new Special("Screw Pile Driver", 8);
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
		System.out.println("Double Lariat");
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