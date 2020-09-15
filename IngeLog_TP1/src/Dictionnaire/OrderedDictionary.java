package Dictionnaire;

public class OrderedDictionary extends AbstractDictionary{
	
	public OrderedDictionary(String[] tabmot, String[] tabdef, int n){
		super(n);
	}

	public int indexOf(Object key){
		return super.indexOf(key);
	}
	
	public int newIndexOf(Object key){
		int index=0;
		Object[] oldKeys = this.getTabkey();
		Object[] oldValues = this.getTabval();
		Object[] newTabk = new Object[oldKeys.length +1];
		Object[] newTabv = new Object[oldValues.length +1];
		this.setTabkey(newTabk);
		this.setTabval(newTabv);
		
		while(this.getTabkey()[index]!=null){
			index++;	
		}
	
		return index;
	}
}
