lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/

/* type define */
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
FLOAT_TYPE : 'float';
DOUBLE_TYPE : 'double';
STRING_TYPE : 'string';
CONST_TYPE : 'const';
VOID_TYPE : 'void';
RETURN_TYPE : 'return';

/* flow ccontrol */
WHILE : 'while';
FOR : 'for';
IF : 'if';
ELSE : 'else';
BREAK : 'break';
CONTINUE : 'continue';

/* function */
MAIN : 'main';
PRINTF : 'printf';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

/* LOGICAL */
EQ_OP : '==';
LE_OP : '<=';
LT_OP : '<';
GE_OP : '>=';
GT_OP : '>';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
AND_OP : '&&';
OR_OP : '||';

/* ARITHMETIC */
ADD : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MODULUS : '%';

/* BIT */
BIT_AND : '&';
BIT_OR : '|';

/* NOT */
NOT : '!';

/* ASSIGN */
NORMAL_ASSIGN : '=';
MULTIPLY_ASSIGN : '*=';
DIVIDE_ASSIGN : '/=';
MODULUS_ASSIGN : '%=';
ADD_ASSIGN : '+=';
MINUS_ASSIGN : '-=';

/* Punctuation */
LEFT_PARENTHESIS : '(';
RIGHT_PAARENTHESIS : ')';
LEFT_SQU_BRACKET : '[';
RIGHT_SQU_BRACKET : ']';
LEFT_CUR_BRACKET : '{';
RIGHT_CUR_BRACKET : '}';
QUOTATION : ',';
SEMICOLON : ';';



DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);
ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';

/* Char obj */
STRING_OBJ : '"'( ONLY_ALLOW | ~( '"' | '\\' ) )*'"';
CHAR_OBJ : '\''(LETTER | DIGIT)'\'';
fragment ONLY_ALLOW : '\\'( 'n' | 'r' | 't' | '"');

NEW_LINE: '\n';
fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+
    ;
