grammar SimpleC;

@header {
    package antlr;
}

IDENTIFIER : [a-zA-Z]+ [0-9a-zA-Z]*;
INTEGER : '-'? [0-9]+;

WS  :   ( ' ' | '\t' | '\r' '\n' | '\n' ) -> skip;



translationUnit : functionDefinition+;

functionDefinition : returnType=type name=IDENTIFIER '(' (args+=functionArgument ',')* args+=functionArgument? ')' body=blockStatement ;

functionArgument : argType=type name=IDENTIFIER ('[' size=INTEGER ']')?;

type : 'void'  	#VoidType
	| 'int' 	#IntType
	| 'unsigned int'  	#UintType;

statement : blockStatement | expressionStatement | returnStatement | assignStatement | declStatement | ifStatement | whileStatement | forStatement;

blockStatement : '{' statements+=statement* '}';

declStatement : varType=type var=IDENTIFIER '=' expr=expression ';';

assign : var=IDENTIFIER '=' expr=expression;

assignStatement : expr=assign ';';

ifStatement : 'if' '(' expr=expression ')' ifBlock=blockStatement ('else' elseBlock=blockStatement)?;

whileStatement : 'while' '(' expr=expression ')' whileBlock=blockStatement;

forStatement : 'for' '(' expr1=declStatement expr2=expression ';' expr3=assign ')' forBlock=blockStatement;


returnStatement : 'return' expr=expression?';';

expressionStatement : expr=expression ';';

expression : expr1=expression '*' expr2=expression 	#MulExpr 
		| expr1=expression '/' expr2=expression 	#DivExpr
		| expr1=expression '+' expr2=expression  #AddExpr
		| expr1=expression '-' expr2=expression 	#SubExpr 
		| expr1=expression '<' expr2=expression 	#CmpLtExpr
		| expr1=expression '>' expr2=expression 	#CmpGtExpr
		|'-' expr1=expression					#OppExpr
	    | '(' expr1=expression ')' 		    #ExprNode
		| name=IDENTIFIER 					#IdNode
		| functionCall                  #functionCallExpr
		| INTEGER 						#IntNode;
		
           
functionCall : name=IDENTIFIER '(' (args+=expression ',')* args+=expression? ')';


