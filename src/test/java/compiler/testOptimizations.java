package compiler;


import compiler.frontend.IRBuilder;
import compiler.optimization.CondConstProp;
import compiler.optimization.DeadCodeElimination;
import compiler.optimization.MergeBlocks;
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
		String exported = Compiler.exportIR(ir);
		System.out.println(exported);

		MergeBlocks optiMergeBlocks = new MergeBlocks(ir);
		optiMergeBlocks.runOptimization();

		CondConstProp optiCondConst = new CondConstProp(ir);
		optiCondConst.runOptimization();

		DeadCodeElimination optiDeadCode = new DeadCodeElimination(ir);
		optiDeadCode.runOptimization();

		optiMergeBlocks.runOptimization();

		String exportOptimized = Compiler.exportIR(ir);
		System.out.println(exportOptimized);
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
