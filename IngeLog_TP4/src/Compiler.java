import java.io.File;


public class Compiler {
	
protected Lexer lexer;
protected Parser parser;
protected Generator gen;

public void compile(ProgText t){
	//framework ; code generique utilisé sans etre modif pour toute utilisation du framework
	System.out.println("Compiling a " + factory.getLanguage() + " program.");
	ScanedText t2=lexer.scan(t);
	AST tree = parser.parse(t2);
	File f = gen.generate(tree);
	System.out.println("Compilation finished");

	}

}