package Dictionnaire;
import java.util.*;

public abstract class AbstractDictionary implements IDictionary {

	private Object tabkey[];
	private Object tabval[];
	private int size;
	
	public AbstractDictionary(int n) {
		this.tabkey = new Object[n];
		this.tabval = new Object[n];
	}
	
	public AbstractDictionary(Object[] tabkey, Object[] tabval, int size) {
		super();
		this.tabkey = tabkey;
		this.tabval = tabval;
		this.size = size;
	}
	
	public AbstractDictionary(){
		this.tabkey = new Object[0];
		this.tabval = new Object[0];
	}

	public Object[] getTabkey() {
		return tabkey;
	}

	public void setTabkey(Object[] tabkey) {
		this.tabkey = tabkey;
	}

	public Object[] getTabval() {
		return tabval;
	}

	public void setTabval(Object[] tabval) {
		this.tabval = tabval;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int taille) {
		this.size = taille;
	}
	
	
	
	public boolean isEmpty(){
		if(this.size()>0){
			return false;
		}
		else return true;
		
	}
	
	protected int indexOf(Object key){
		int i=0;
		while(key!=tabkey[i]){
			i++;
		}
		if(key==tabkey[i]) return i;
		else return -1;
	}
	
	public Object get(Object key){
		if(this.indexOf(key)==-1){
			System.out.println("Erreur d'index de la clé");
			return null;
		}
		else return this.tabval[this.indexOf(key)];
	}
	
	public AbstractDictionary put(Object key, Object val){
		
		if(containsKey(key)){
			int i=this.indexOf(key);
			this.tabval[i]=val;
		}
		else {
			int i=this.newIndexOf(key);
			this.tabkey[i]=key;
			this.tabval[i]=val;
			this.size++;
		}
		return this;
	}
	
	protected abstract int newIndexOf(Object key);
	
	public int size(){
		int res=0;
		for(int i=0;i<this.tabkey.length;i++){
			if(tabkey[i]!=null) res++;
		}
		return res;
	}
	
	
	public boolean containsKey(Object key){
		boolean b=false;
		for(int i=0;i<this.size();i++){
			if(this.tabkey[i]==key) b=true;
		}
		return b;
	}
	
}
	
