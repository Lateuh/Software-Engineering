
public class CompilerFactory {
	protected String language;
	public CompilerFactory();
	
	public String getLanguage(){
		return language;
	}
	
	public static CompilerFactory getFactory(String language) throws Exception{
		Class c = Class.forName("compiler." + language + "Factory");
		return ((CompilerFactory)(c.newInstance()));
		
	}
	
	
	public abstract Lexer createLexer();
	public abstract Parser createParser();
	public abstract Generator createGenerator();
	// public abstract PrettyPrinter createPrettyPrinter();
}
