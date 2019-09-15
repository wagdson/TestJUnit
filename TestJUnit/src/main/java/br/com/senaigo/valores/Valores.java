package br.com.senaigo.valores;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.print.attribute.standard.RequestingUserName;
/**
 * 
 * @author Wagdson
 */
public class Valores implements ValoresITF {
	
	ArrayList <Integer> listValores = new ArrayList<Integer>();
	public boolean ins(int v) {
	if(v <= 0  || listValores.size() > 10){
		return false;
	}
		listValores.add(v);
		return true;
		
	}

	public int del(int i) {
		if(listValores.size() < 1 || i> listValores.size()){
			return -1;
		}
		int v = listValores.get(i);
	listValores.remove(i);
		return v;
	}

	public int size() {
		if(listValores.size()  == 1)
			return 0;
		
		return  listValores.size();
	}

	public double mean() {
		if(listValores.size() == 1)
			return -1;
		
		float media = 0;
		for (int i = 0; i < listValores.size(); i++) {
			media += listValores.get(i);
		}
		
		return media / listValores.size();
	}

	public int greater() {
		int maior = 0;
		if(listValores.size() == 1)
			return -1;
		for (int i = 0; i < listValores.size(); i++) {
			
			if (listValores.get(i) > maior) {
				maior = listValores.get(i);
			}
			
		}
		return maior;
	}

	public int lower() {
		int menor = listValores.get(0);
		if(listValores.size() == 0)
			return -1;
		for (int i = 1; i < listValores.size(); i++) {
			
			if (listValores.get(i) < menor) {
				menor = listValores.get(i);
			}
			
		}
		return menor;
	}

}
