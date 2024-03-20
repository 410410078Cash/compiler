lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/

/* Keywords */
RETURN  : 'return';
VOID    : 'void';

/* Functions */
MAIN    : 'main';
PRINTF  : 'printf';


/* Data types */
INT     : 'int';
FLOAT   : 'float';
DOUBLE  : 'double';
SHORT   : 'short';
CHAR    : 'char';
CONST   : 'const';

/* Control Structure */
IF         : 'if';
ELSE       : 'else';
FOR        : 'for';
WHILE      : 'while';
BREAK      : 'break';
CONTINUE   : 'continue';

/*----------------------*/
/*      Operators       */
/*----------------------*/

/* Logical Operators */
LOGICAL_AND        : '&&';
LOGICAL_OR         : '||';
LOGICAL_NOT        : '!';
LOGICAL_EQUAL      : '==';
LOGICAL_NOT_EQUAL  : '!=';
LESS_THAN          : '<';
LESS_THAN_EQUAL    : '<=';
GREATER_THAN       : '>';
GREATER_THAN_EQUAL : '>=';
ASSIGN             : '=';

/* Arithmetic Operators */
PLUS            : '+';
MINUS           : '-';
MULTIPLY        : '*';
DIVIDE          : '/';
MODULUS         : '%';

/* Increment and Decrement Operators */
INCREMENT       : '++';
DECREMENT       : '--';

/* Bitwise Operators */
BITWISE_AND     : '&';
BITWISE_OR      : '|';
BITWISE_NOT     : '~';
BITWISE_XOR     : '^';

/*----------------------*/
/*        MISC          */
/*----------------------*/

/* Punctuation */
COMMA           : ',';
SEMICOLON       : ';';
COLON           : ':';
LEFT_PAREN      : '(';
RIGHT_PAREN     : ')';
LEFT_BRACE      : '{';
RIGHT_BRACE     : '}';


/* Identifiers */
fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;

/* Mew Line and Whitespaces */

NEW_LINE: '\n';

WHITE_SPACE  : (' '|'\r'|'\t')+;

/* String Literal */
STRING_LITERAL : '"' ( STRING_ESC | ~('\\'|'"') )* '"';
fragment STRING_ESC : '\\' ( '"' | '\\' | 'n' | 'r' | 't' );

/* Character Literal */
CHAR_LITERAL : '\'' ( CHAR_ESC | ~('\\'|'\'') ) '\'';
fragment CHAR_ESC : '\\' ( '\'' | '\\' | 'n' | 'r' | 't' );

/* Comments */
SINGLE_COMMENT : '//'(.)*'\n';
MULTI_COMMENT : '/*' (options{greedy=false;}: .)* '*/'; 
