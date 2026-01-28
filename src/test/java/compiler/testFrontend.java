package compiler;


import compiler.frontend.SymbolChecker;
import compiler.frontend.SymbolTable;
import compiler.frontend.SymbolTableLevel;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import ir.core.IRTopLevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class testFrontend {

	private void testPattern(String path, Boolean expected) {
		String contentInit = Compiler.readFile(path);
		ParseTree tree = Compiler.parse(contentInit);
		SymbolChecker symCheck = new SymbolChecker();
		Boolean check = symCheck.visit(tree);
		HashMap<List<Integer>, SymbolTableLevel> levelTable = symCheck.getTable().getLevelTable();
		assert(check == expected);//Ok if no exception before
	}
	
	@Test
	void testParserAdd() {
		testPattern("src/test/resources/add.sc", true);
	}

	@Test
	void testParserFact() {
		testPattern("src/test/resources/fact.sc", true);
	}
	
	@Test
	void testParserHello() {
		testPattern("src/test/resources/hello.sc", true);
	}
	
	@Test
	void testParserMax() {
		testPattern("src/test/resources/max.sc", true);
	}
	
	@Test
	void testParserPower() {
		testPattern("src/test/resources/power.sc", true);
	}

	@Test
	void testParserSum() {
		testPattern("src/test/resources/sum.sc", true);
	}
	
	@Test
	void testParserFunctions() {
		testPattern("src/test/resources/functions.sc", true);
	}
	
	@Test
	void testParserPrint() {
		testPattern("src/test/resources/print.sc", false);
	}

	@Test
	void testParserPerf() {
		testPattern("src/test/resources/perf.sc", true);
	}
}
