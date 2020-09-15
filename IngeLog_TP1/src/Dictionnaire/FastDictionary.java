package Dictionnaire;

public class FastDictionary extends AbstractDictionary {

	public FastDictionary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FastDictionary(int n) {
		super(n);
	}

	public FastDictionary(Object[] tabkey, Object[] tabval, int size) {
		super(tabkey, tabval, size);
		// TODO Auto-generated constructor stub
	}

	


	public int indexOf(Object key) {
		if(!containsKey(key)){return -1;}
		int cpt=0;
		int hash = key.hashCode();
		if (hash < 0) hash = -1 * hash;
		int i = hash % getTabkey().length;
		while ((!(key.equals(getTabkey()[i]))) && (getTabkey()[i] != null)) {
			i = (i + 1) % getTabkey().length;
			cpt++;
			if(cpt>getTabkey().length){
				System.out.println("On a parcouru le tableau en entier");
			}
		}
		if (getTabkey()[i] == null) return -1;
		else return i;
	}
	
	public int newIndexOf(Object key) {
//		System.out.println(this.mustGrow());
//		System.out.println(this.size());
//		System.out.println(this.getTabkey().length);
		if (this.mustGrow()) this.grow();
		
		
		
		int hash = key.hashCode();
		if (hash < 0) hash = -1 * hash;
		int i = hash % this.getTabkey().length;
		if (this.getTabkey()[i] == null) return i;
		else {
			do {
				if (i + 1 < this.getTabkey().length)
					i++;
				else
					i = 0;
			} while (this.getTabkey()[i] != null);
			return i;
		}
	}
	

	public int size(){
		return super.size();
	}
	
	
	
//	public boolean mustGrow(){
//		if((double)(3.0/4.0)*(double)this.getTabkey().length < this.size()){
//			return false;
//		}
//		return true;
//	}
	
	public boolean mustGrow(){
		if(((double)this.size()/(double)this.getTabkey().length) >= (3.0/4.0)) {
			return true;
		}
		return false;
	}
	
	public void grow(){		
		Object[] oldKeys = this.getTabkey();
		Object[] oldValues = this.getTabval();
		Object[] newTabk = new Object[oldKeys.length *2];
		Object[] newTabv = new Object[oldValues.length *2];
		this.setTabkey(newTabk);
		this.setTabval(newTabv);

		for (int i = 0; i < oldKeys.length; i++) {
			if (oldKeys[i] != null) {
				this.put(oldKeys[i], oldValues[i]);
			}
		}
		System.out.println("taille du tableau: " + this.getTabkey().length + "\n");
	}
	
	
	
	
	
}