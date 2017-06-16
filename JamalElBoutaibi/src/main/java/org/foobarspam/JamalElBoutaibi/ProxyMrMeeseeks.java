package org.foobarspam.JamalElBoutaibi;

import java.util.ArrayList;

public class ProxyMrMeeseeks extends MrMeeseeks{

	
	MrMeeseeks mrMesee = new MrMeeseeks();
	
	public ProxyMrMeeseeks(){
		
	}
	
	public void pushButton(ArrayList<MrMeeseeks> setMrMe){
		createMrMeeseeks(setMrMe);
	}
	
	public MrMeeseeks getMrMe(){
		
	
		return this.mrMesee;
	}
	
	public void createMrMeeseeks(ArrayList<MrMeeseeks> mrsMeeseeks){
		MrMeeseeks mrMeseeCreado = new MrMeeseeks();
		mrMeseeCreado.sayMessageOnCreate();
		mrsMeeseeks.add(mrMeseeCreado);
	}
	
	

}
