package compiler;


import compiler.frontend.IRBuilder;
import ir.core.IRTopLevel;
import ir.importExport.IRExport;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import compiler.frontend.SimpleCPrinter;

class testIRImport {

	private void testPattern(String path) {
		String contentInit = Compiler.readFile(path);
		System.out.println("Initial content is : \n" + contentInit);
		ParseTree tree = Compiler.parse(contentInit);
		System.out.println("Parsed !");

		IRTopLevel ir = IRBuilder.buildTopLevel(tree);
		String exported = Compiler.exportIR(ir);
		System.out.println(exported);
	}
	
	@Test
	void testParserAdd() {
		testPattern("src/test/resources/add.sc");
	}

	@Test
	void testParserFact() {
		testPattern("src/test/resources/fact.sc");
	}
	
	@Test
	void testParserHello() {
		testPattern("src/test/resources/hello.sc");
	}
	
	@Test
	void testParserMax() {
		testPattern("src/test/resources/max.sc");
	}
	
	@Test
	void testParserPower() {
		testPattern("src/test/resources/power.sc");
	}

	@Test
	void testParserSum() {
		testPattern("src/test/resources/sum.sc");
	}
	
	@Test
	void testParserFunctions() {
		testPattern("src/test/resources/functions.sc");
	}
	
	@Test
	void testParserPrint() {
		testPattern("src/test/resources/print.sc");
	}
}
