package org.foobarspam.JamalElBoutaibi;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

//cambia el nombre de la clase
public class MrMeeseeks implements DOABLE{	

	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	
	private static String[] messageOnRequest ={"Oh yeeahh!, Yes ma'am!","Oh yeeahh!, can doo!","Oh yeeahh!, SIII PUEDO!"};
	
	private String messageOnDone = null;
	private String messageOnExplode = null;
			
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}
	
	public static String[] getMessageOnRequest(){
		return messageOnRequest;
	}
		
		public Integer getId(){
			return this.id;
		}
		
		public static String generateMessageOnRequest(){
			int random = ThreadLocalRandom.current().nextInt(0,getMessageOnRequest().length);
			return getMessageOnRequest()[random];
		}
		
		public void sayMessageOnRequest(){
			System.out.println("All done!");
		
		}
		
		public void sayMessageOnCreate(){
			System.out.println("I'm MrMeeseeks " + getId() + " Look and mee");
		}
		
		public void sayMessageOnDone(){
			System.out.println(generateMessageOnRequest());
		}
		
		public void sayMessageOnExplore(){
			
		}
		
		public void formulateRequest(String message, String messageC){
			sayMessageOnDone();
			doRequest(message, messageC);
			sayMessageOnRequest();
			
		}
		
		public void doRequest(String request, String doRequest){
			System.out.println(request + " " + doRequest);
		}
		
		public void stopExisting(){
			System.out.println("Pooooooofff " + this.getId());
		}

		public Object doRequest(Object pedido, Object requeste) {
			// TODO Auto-generated method stub
			
			
			return null;
		}

	



	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
      * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
      */	
}
