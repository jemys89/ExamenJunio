package org.foobarspam.JamalElBoutaibi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestMrMeeseeks {
	
	
//	assertThat(actual).isNotSameAs(expected)
//	assertThat(actual).isNull()
//	assertThat(actual).isEqualTo(expected)
//	assertThat(myList).isEmpty()

	@Test
	public void test() {
		

		ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
		ArrayList<Integer> ids = new ArrayList<Integer>();
		
		MrMeeseeks mrMeeseeks = new MrMeeseeks();
		
		ProxyMrMeeseeks box = new ProxyMrMeeseeks();
	
		
		assertThat(setMrMe).isEmpty();
		assertThat(ids).isEmpty();
		
		
		
		
		
		
			box.pushButton(setMrMe);
			System.out.println("Open Jerry's stupid mayonnaise jar");
			box.getMrMe().formulateRequest("Open", "stupid jar");
			
			System.out.println();
			
			
			
			box.pushButton(setMrMe);    
			System.out.println("I wanna be popular at school!");
			box.getMrMe().formulateRequest("Be", "popular at school");
			System.out.println();

		
			
		
			
			box.pushButton(setMrMe);
			System.out.println("I wanna be a more complete woman!");
			box.getMrMe().formulateRequest("Be", "a more complete woman");
			System.out.println();
			
			System.out.println("Estos son los Mr Meeseeks creados:");
			
			
			
			
			
			App.listMrMeeseeks(setMrMe);
			System.out.println();
			
			App.collectIds(setMrMe, ids);
			
			
			//COMPROBAMOS QUE SE HAN AÑADIDO 
			assertThat(setMrMe).hasSize(3);
			
			System.out.println("Adios, Mr Meeseeks...");
			for(Integer id : ids){
				App.explodeMrMeeseeks(setMrMe, id);   
			}
			
			
			//COMPROBAMOS QUE SE HAN ELIMINADO
			assertThat(setMrMe).isEmpty();
			
			
		
		
	}

}
