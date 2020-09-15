package Dictionnaire;

public class DicoMain {

	public static void main(String[] args) {
		
		Object TabMot1[] = {"hugo","paul","pierre"};
        Object TabDef1[] = {"Victor Hugo","Paul Verlaine","Pierre et le loup"};
        FastDictionary dicRapVid = new FastDictionary();
        FastDictionary dicRapRempli = new FastDictionary(TabMot1,TabDef1,3);

        System.out.println(dicRapRempli.indexOf("bob"));
        System.out.println(dicRapRempli.indexOf("pierre"));
        System.out.println(dicRapRempli.newIndexOf("arthur"));
        System.out.println(dicRapRempli.indexOf("arthur"));
        System.out.println(dicRapRempli.get("pierre"));
        System.out.println(dicRapRempli.put("Georges","Georges Frêche"));
        System.out.println(dicRapRempli.containsKey("Georges"));
        System.out.println(dicRapRempli.containsKey("Bob"));           
        
        System.out.println(dicRapRempli.isEmpty());
        System.out.println(dicRapVid.isEmpty());

	}

}

