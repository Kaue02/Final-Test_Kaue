package br.com.test;

import org.junit.internal.builders.NullBuilder;
import org.junit.jupiter.api.Test;

import br.com.code.*;
import junit.framework.Assert;

public class GameTest {
	
	@Test
	void testPlayerName() {
		Player p = new Player("Player 1", new Ryu(null, 0, 0, null));
		String name = p.getNome();
		
		Assert.assertEquals("Player 1", name);
	}
	
	@Test
	void testFighterName() {
		Player p = new Player("Player 1", new Ryu(null, 0, 0, null));
		String name = p.getFighter().getName();
		
		Assert.assertEquals("Ryu", name);
	}
	
	@Test
	void testPlayerReceiveDamage() {
		Player p = new Player("Player 1", new Ryu(null, 0, 0, null));
		p.getFighter().tomaDano(p.getFighter());
		int rest = p.getFighter().getLife();
		
		Assert.assertEquals(62, rest);
	}
	
	@Test
	void testGameDamage() {
		Player p1 = new Player("Player 1", new Zangief(null, 0, 0, null));
		Player p2 = new Player("Player 2", new Ryu(null, 0, 0, null));
		p2.getFighter().ataca(p1.getFighter());
		p1.getFighter().ataca(p2.getFighter());
		
		int rest1  = p1.getFighter().getLife();
		int rest2  = p2.getFighter().getLife();
		
		Assert.assertEquals(true, rest1 > rest2);
		}
	
	}
	
	

