package compiler;


import compiler.frontend.IRBuilder;
import compiler.optimization.CondConstProp;
import compiler.optimization.DeadCodeElimination;
import ir.core.IRTopLevel;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

class testOptimizations {

	private void testPattern(String path) {
		String contentInit = Compiler.readFile(path);
		System.out.println("Initial content is : \n" + contentInit);
		ParseTree tree = Compiler.parse(contentInit);
		System.out.println("Parsed !");

		IRTopLevel ir = IRBuilder.buildTopLevel(tree);
		/////// Optimizations
		// DeadCodeElimination opti1 = new DeadCodeElimination(ir);
		// opti1.runOptimization();
		String exported = Compiler.exportIR(ir);
		System.out.println(exported);

		CondConstProp optiCondConst = new CondConstProp(ir);
		optiCondConst.runOptimization();
		///////
	}

	@Test
	void testElementaryTest() {
		testPattern("src/test/resources/elementary_test.sc");
	}

	@Test
	void testOptiTest() {
		testPattern("src/test/resources/opti_test.sc");
	}
}
