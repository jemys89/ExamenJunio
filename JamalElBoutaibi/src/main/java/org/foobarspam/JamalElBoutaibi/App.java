package org.foobarspam.JamalElBoutaibi;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main( String[] args ){
        
		// Crea una estructura de datos llamada setMrMe donde almacenar los Mr Meeseeks creados
		// Crea una estructura de datos llamada ids donde almacenar los ids de los Mr Meeseeks creados
	
	ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
	ArrayList<Integer> ids = new ArrayList<Integer>();
		        
		ProxyMrMeeseeks box = new ProxyMrMeeseeks();
		       
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
		
		
		
		
		
		listMrMeeseeks(setMrMe);
		System.out.println();
		
		collectIds(setMrMe, ids);
		
		System.out.println("Adios, Mr Meeseeks...");
		for(Integer id : ids){
			explodeMrMeeseeks(setMrMe, id);   
		}
		
	    }

			public static void listMrMeeseeks(ArrayList<MrMeeseeks> setMrM){
				
				for(MrMeeseeks mrsee : setMrM){
					System.out.println(mrsee.getId());
				}
	
			}
			
			public static void collectIds(ArrayList<MrMeeseeks> setMrm, ArrayList<Integer> ids){
				for(MrMeeseeks mrmee : setMrm){
					ids.add(mrmee.getId());
				}
			}
			
			public static void explodeMrMeeseeks(ArrayList<MrMeeseeks>setMrMe,Integer id){
//				int contador = 0;
//				for(MrMeeseeks mrmee : setMrMe){
//					contador++;
//					if(mrmee.getId() == id){
//						setMrMe.remove(contador);
//					}
//				}
			for(int i = 0; i < setMrMe.size();i++){
				if(setMrMe.get(i).getId() == id){
					setMrMe.get(i).stopExisting();
					setMrMe.remove(i);
				}
			}
			}

		/* collectIds(setMrMe, ids)
		 * Almacena en un array los ids de los Mr Meeseeks creados
		 */

		/* listMrMeeseeks(setMrMe)
		 * Lista los ids de todos los Mr Meeseeks creados
		 */

		/* explodeMrMeeseeks(setMrMe, id)
		 * elimna del conjunto de Mr Meeseeks creados el que ya ha completado su cometido
		 */	

}
