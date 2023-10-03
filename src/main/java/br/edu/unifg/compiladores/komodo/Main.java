
package br.edu.unifg.compiladores.komodo;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "modo";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		KomodoLexer lexer = new KomodoLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		KomodoParser parser = new KomodoParser(tokens);

		KomodoParser.StartContext tree = parser.start();

		KomodoCustomVisitor visitor = new KomodoCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
