// $ANTLR 3.5.3 mylexer.g 2024-03-20 01:45:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int ASSIGN=4;
	public static final int BITWISE_AND=5;
	public static final int BITWISE_NOT=6;
	public static final int BITWISE_OR=7;
	public static final int BITWISE_XOR=8;
	public static final int BREAK=9;
	public static final int CHAR=10;
	public static final int CHAR_ESC=11;
	public static final int CHAR_LITERAL=12;
	public static final int COLON=13;
	public static final int COMMA=14;
	public static final int CONST=15;
	public static final int CONTINUE=16;
	public static final int DECREMENT=17;
	public static final int DEC_NUM=18;
	public static final int DIGIT=19;
	public static final int DIVIDE=20;
	public static final int DOUBLE=21;
	public static final int ELSE=22;
	public static final int FLOAT=23;
	public static final int FLOAT_NUM=24;
	public static final int FLOAT_NUM1=25;
	public static final int FLOAT_NUM2=26;
	public static final int FLOAT_NUM3=27;
	public static final int FOR=28;
	public static final int GREATER_THAN=29;
	public static final int GREATER_THAN_EQUAL=30;
	public static final int ID=31;
	public static final int IF=32;
	public static final int INCREMENT=33;
	public static final int INT=34;
	public static final int LEFT_BRACE=35;
	public static final int LEFT_PAREN=36;
	public static final int LESS_THAN=37;
	public static final int LESS_THAN_EQUAL=38;
	public static final int LETTER=39;
	public static final int LOGICAL_AND=40;
	public static final int LOGICAL_EQUAL=41;
	public static final int LOGICAL_NOT=42;
	public static final int LOGICAL_NOT_EQUAL=43;
	public static final int LOGICAL_OR=44;
	public static final int MAIN=45;
	public static final int MINUS=46;
	public static final int MODULUS=47;
	public static final int MULTIPLY=48;
	public static final int MULTI_COMMENT=49;
	public static final int NEW_LINE=50;
	public static final int PLUS=51;
	public static final int PRINTF=52;
	public static final int RETURN=53;
	public static final int RIGHT_BRACE=54;
	public static final int RIGHT_PAREN=55;
	public static final int SEMICOLON=56;
	public static final int SHORT=57;
	public static final int SINGLE_COMMENT=58;
	public static final int STRING_ESC=59;
	public static final int STRING_LITERAL=60;
	public static final int VOID=61;
	public static final int WHILE=62;
	public static final int WHITE_SPACE=63;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:9: ( 'return' )
			// mylexer.g:12:11: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:13:9: ( 'void' )
			// mylexer.g:13:11: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:9: ( 'main' )
			// mylexer.g:16:11: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:9: ( 'printf' )
			// mylexer.g:17:11: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:9: ( 'int' )
			// mylexer.g:21:11: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:9: ( 'float' )
			// mylexer.g:22:11: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:9: ( 'double' )
			// mylexer.g:23:11: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:9: ( 'short' )
			// mylexer.g:24:11: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:9: ( 'char' )
			// mylexer.g:25:11: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:9: ( 'const' )
			// mylexer.g:26:11: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:29:12: ( 'if' )
			// mylexer.g:29:14: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:30:12: ( 'else' )
			// mylexer.g:30:14: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:31:12: ( 'for' )
			// mylexer.g:31:14: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:32:12: ( 'while' )
			// mylexer.g:32:14: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:33:12: ( 'break' )
			// mylexer.g:33:14: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:34:12: ( 'continue' )
			// mylexer.g:34:14: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "LOGICAL_AND"
	public final void mLOGICAL_AND() throws RecognitionException {
		try {
			int _type = LOGICAL_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:41:20: ( '&&' )
			// mylexer.g:41:22: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAL_AND"

	// $ANTLR start "LOGICAL_OR"
	public final void mLOGICAL_OR() throws RecognitionException {
		try {
			int _type = LOGICAL_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:42:20: ( '||' )
			// mylexer.g:42:22: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAL_OR"

	// $ANTLR start "LOGICAL_NOT"
	public final void mLOGICAL_NOT() throws RecognitionException {
		try {
			int _type = LOGICAL_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:43:20: ( '!' )
			// mylexer.g:43:22: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAL_NOT"

	// $ANTLR start "LOGICAL_EQUAL"
	public final void mLOGICAL_EQUAL() throws RecognitionException {
		try {
			int _type = LOGICAL_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:44:20: ( '==' )
			// mylexer.g:44:22: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAL_EQUAL"

	// $ANTLR start "LOGICAL_NOT_EQUAL"
	public final void mLOGICAL_NOT_EQUAL() throws RecognitionException {
		try {
			int _type = LOGICAL_NOT_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:20: ( '!=' )
			// mylexer.g:45:22: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAL_NOT_EQUAL"

	// $ANTLR start "LESS_THAN"
	public final void mLESS_THAN() throws RecognitionException {
		try {
			int _type = LESS_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:46:20: ( '<' )
			// mylexer.g:46:22: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_THAN"

	// $ANTLR start "LESS_THAN_EQUAL"
	public final void mLESS_THAN_EQUAL() throws RecognitionException {
		try {
			int _type = LESS_THAN_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:20: ( '<=' )
			// mylexer.g:47:22: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_THAN_EQUAL"

	// $ANTLR start "GREATER_THAN"
	public final void mGREATER_THAN() throws RecognitionException {
		try {
			int _type = GREATER_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:48:20: ( '>' )
			// mylexer.g:48:22: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_THAN"

	// $ANTLR start "GREATER_THAN_EQUAL"
	public final void mGREATER_THAN_EQUAL() throws RecognitionException {
		try {
			int _type = GREATER_THAN_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:49:20: ( '>=' )
			// mylexer.g:49:22: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_THAN_EQUAL"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:20: ( '=' )
			// mylexer.g:50:22: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:17: ( '+' )
			// mylexer.g:53:19: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:17: ( '-' )
			// mylexer.g:54:19: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULTIPLY"
	public final void mMULTIPLY() throws RecognitionException {
		try {
			int _type = MULTIPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:17: ( '*' )
			// mylexer.g:55:19: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLY"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:17: ( '/' )
			// mylexer.g:56:19: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "MODULUS"
	public final void mMODULUS() throws RecognitionException {
		try {
			int _type = MODULUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:17: ( '%' )
			// mylexer.g:57:19: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULUS"

	// $ANTLR start "INCREMENT"
	public final void mINCREMENT() throws RecognitionException {
		try {
			int _type = INCREMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:17: ( '++' )
			// mylexer.g:60:19: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCREMENT"

	// $ANTLR start "DECREMENT"
	public final void mDECREMENT() throws RecognitionException {
		try {
			int _type = DECREMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:17: ( '--' )
			// mylexer.g:61:19: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECREMENT"

	// $ANTLR start "BITWISE_AND"
	public final void mBITWISE_AND() throws RecognitionException {
		try {
			int _type = BITWISE_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:17: ( '&' )
			// mylexer.g:64:19: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISE_AND"

	// $ANTLR start "BITWISE_OR"
	public final void mBITWISE_OR() throws RecognitionException {
		try {
			int _type = BITWISE_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:17: ( '|' )
			// mylexer.g:65:19: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISE_OR"

	// $ANTLR start "BITWISE_NOT"
	public final void mBITWISE_NOT() throws RecognitionException {
		try {
			int _type = BITWISE_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:17: ( '~' )
			// mylexer.g:66:19: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISE_NOT"

	// $ANTLR start "BITWISE_XOR"
	public final void mBITWISE_XOR() throws RecognitionException {
		try {
			int _type = BITWISE_XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:17: ( '^' )
			// mylexer.g:67:19: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISE_XOR"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:74:17: ( ',' )
			// mylexer.g:74:19: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:75:17: ( ';' )
			// mylexer.g:75:19: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:17: ( ':' )
			// mylexer.g:76:19: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "LEFT_PAREN"
	public final void mLEFT_PAREN() throws RecognitionException {
		try {
			int _type = LEFT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:77:17: ( '(' )
			// mylexer.g:77:19: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_PAREN"

	// $ANTLR start "RIGHT_PAREN"
	public final void mRIGHT_PAREN() throws RecognitionException {
		try {
			int _type = RIGHT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:78:17: ( ')' )
			// mylexer.g:78:19: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_PAREN"

	// $ANTLR start "LEFT_BRACE"
	public final void mLEFT_BRACE() throws RecognitionException {
		try {
			int _type = LEFT_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:79:17: ( '{' )
			// mylexer.g:79:19: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_BRACE"

	// $ANTLR start "RIGHT_BRACE"
	public final void mRIGHT_BRACE() throws RecognitionException {
		try {
			int _type = RIGHT_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:80:17: ( '}' )
			// mylexer.g:80:19: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_BRACE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:84:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:85:16: ( '0' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:87:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:87:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:87:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='0') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// mylexer.g:87:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:87:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:87:28: ( DIGIT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:89:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:89:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:89:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:91:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt4=3;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// mylexer.g:91:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:91:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:91:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:92:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:92:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:92:22: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('.'); 
			// mylexer.g:92:33: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:93:20: ( '.' ( DIGIT )+ )
			// mylexer.g:93:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:93:25: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:94:20: ( ( DIGIT )+ )
			// mylexer.g:94:22: ( DIGIT )+
			{
			// mylexer.g:94:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:98:9: ( '\\n' )
			// mylexer.g:98:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "WHITE_SPACE"
	public final void mWHITE_SPACE() throws RecognitionException {
		try {
			int _type = WHITE_SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:100:14: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:100:16: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:100:16: ( ' ' | '\\r' | '\\t' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\t'||LA9_0=='\r'||LA9_0==' ') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITE_SPACE"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:103:16: ( '\"' ( STRING_ESC |~ ( '\\\\' | '\"' ) )* '\"' )
			// mylexer.g:103:18: '\"' ( STRING_ESC |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// mylexer.g:103:22: ( STRING_ESC |~ ( '\\\\' | '\"' ) )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\\') ) {
					alt10=1;
				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:103:24: STRING_ESC
					{
					mSTRING_ESC(); 

					}
					break;
				case 2 :
					// mylexer.g:103:37: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "STRING_ESC"
	public final void mSTRING_ESC() throws RecognitionException {
		try {
			// mylexer.g:104:21: ( '\\\\' ( '\"' | '\\\\' | 'n' | 'r' | 't' ) )
			// mylexer.g:104:23: '\\\\' ( '\"' | '\\\\' | 'n' | 'r' | 't' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\\'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_ESC"

	// $ANTLR start "CHAR_LITERAL"
	public final void mCHAR_LITERAL() throws RecognitionException {
		try {
			int _type = CHAR_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:107:14: ( '\\'' ( CHAR_ESC |~ ( '\\\\' | '\\'' ) ) '\\'' )
			// mylexer.g:107:16: '\\'' ( CHAR_ESC |~ ( '\\\\' | '\\'' ) ) '\\''
			{
			match('\''); 
			// mylexer.g:107:21: ( CHAR_ESC |~ ( '\\\\' | '\\'' ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\\') ) {
				alt11=1;
			}
			else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '&')||(LA11_0 >= '(' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// mylexer.g:107:23: CHAR_ESC
					{
					mCHAR_ESC(); 

					}
					break;
				case 2 :
					// mylexer.g:107:34: ~ ( '\\\\' | '\\'' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_LITERAL"

	// $ANTLR start "CHAR_ESC"
	public final void mCHAR_ESC() throws RecognitionException {
		try {
			// mylexer.g:108:19: ( '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' ) )
			// mylexer.g:108:21: '\\\\' ( '\\'' | '\\\\' | 'n' | 'r' | 't' )
			{
			match('\\'); 
			if ( input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_ESC"

	// $ANTLR start "SINGLE_COMMENT"
	public final void mSINGLE_COMMENT() throws RecognitionException {
		try {
			int _type = SINGLE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:111:16: ( '//' ( . )* '\\n' )
			// mylexer.g:111:18: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:111:22: ( . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\n') ) {
					alt12=2;
				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:111:23: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLE_COMMENT"

	// $ANTLR start "MULTI_COMMENT"
	public final void mMULTI_COMMENT() throws RecognitionException {
		try {
			int _type = MULTI_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:112:15: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:112:17: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:112:22: ( options {greedy=false; } : . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='*') ) {
					int LA13_1 = input.LA(2);
					if ( (LA13_1=='/') ) {
						alt13=2;
					}
					else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
						alt13=1;
					}

				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:112:47: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTI_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( RETURN | VOID | MAIN | PRINTF | INT | FLOAT | DOUBLE | SHORT | CHAR | CONST | IF | ELSE | FOR | WHILE | BREAK | CONTINUE | LOGICAL_AND | LOGICAL_OR | LOGICAL_NOT | LOGICAL_EQUAL | LOGICAL_NOT_EQUAL | LESS_THAN | LESS_THAN_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | ASSIGN | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | INCREMENT | DECREMENT | BITWISE_AND | BITWISE_OR | BITWISE_NOT | BITWISE_XOR | COMMA | SEMICOLON | COLON | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACE | RIGHT_BRACE | DEC_NUM | ID | FLOAT_NUM | NEW_LINE | WHITE_SPACE | STRING_LITERAL | CHAR_LITERAL | SINGLE_COMMENT | MULTI_COMMENT )
		int alt14=53;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// mylexer.g:1:10: RETURN
				{
				mRETURN(); 

				}
				break;
			case 2 :
				// mylexer.g:1:17: VOID
				{
				mVOID(); 

				}
				break;
			case 3 :
				// mylexer.g:1:22: MAIN
				{
				mMAIN(); 

				}
				break;
			case 4 :
				// mylexer.g:1:27: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 5 :
				// mylexer.g:1:34: INT
				{
				mINT(); 

				}
				break;
			case 6 :
				// mylexer.g:1:38: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 7 :
				// mylexer.g:1:44: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:51: SHORT
				{
				mSHORT(); 

				}
				break;
			case 9 :
				// mylexer.g:1:57: CHAR
				{
				mCHAR(); 

				}
				break;
			case 10 :
				// mylexer.g:1:62: CONST
				{
				mCONST(); 

				}
				break;
			case 11 :
				// mylexer.g:1:68: IF
				{
				mIF(); 

				}
				break;
			case 12 :
				// mylexer.g:1:71: ELSE
				{
				mELSE(); 

				}
				break;
			case 13 :
				// mylexer.g:1:76: FOR
				{
				mFOR(); 

				}
				break;
			case 14 :
				// mylexer.g:1:80: WHILE
				{
				mWHILE(); 

				}
				break;
			case 15 :
				// mylexer.g:1:86: BREAK
				{
				mBREAK(); 

				}
				break;
			case 16 :
				// mylexer.g:1:92: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 17 :
				// mylexer.g:1:101: LOGICAL_AND
				{
				mLOGICAL_AND(); 

				}
				break;
			case 18 :
				// mylexer.g:1:113: LOGICAL_OR
				{
				mLOGICAL_OR(); 

				}
				break;
			case 19 :
				// mylexer.g:1:124: LOGICAL_NOT
				{
				mLOGICAL_NOT(); 

				}
				break;
			case 20 :
				// mylexer.g:1:136: LOGICAL_EQUAL
				{
				mLOGICAL_EQUAL(); 

				}
				break;
			case 21 :
				// mylexer.g:1:150: LOGICAL_NOT_EQUAL
				{
				mLOGICAL_NOT_EQUAL(); 

				}
				break;
			case 22 :
				// mylexer.g:1:168: LESS_THAN
				{
				mLESS_THAN(); 

				}
				break;
			case 23 :
				// mylexer.g:1:178: LESS_THAN_EQUAL
				{
				mLESS_THAN_EQUAL(); 

				}
				break;
			case 24 :
				// mylexer.g:1:194: GREATER_THAN
				{
				mGREATER_THAN(); 

				}
				break;
			case 25 :
				// mylexer.g:1:207: GREATER_THAN_EQUAL
				{
				mGREATER_THAN_EQUAL(); 

				}
				break;
			case 26 :
				// mylexer.g:1:226: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 27 :
				// mylexer.g:1:233: PLUS
				{
				mPLUS(); 

				}
				break;
			case 28 :
				// mylexer.g:1:238: MINUS
				{
				mMINUS(); 

				}
				break;
			case 29 :
				// mylexer.g:1:244: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 30 :
				// mylexer.g:1:253: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 31 :
				// mylexer.g:1:260: MODULUS
				{
				mMODULUS(); 

				}
				break;
			case 32 :
				// mylexer.g:1:268: INCREMENT
				{
				mINCREMENT(); 

				}
				break;
			case 33 :
				// mylexer.g:1:278: DECREMENT
				{
				mDECREMENT(); 

				}
				break;
			case 34 :
				// mylexer.g:1:288: BITWISE_AND
				{
				mBITWISE_AND(); 

				}
				break;
			case 35 :
				// mylexer.g:1:300: BITWISE_OR
				{
				mBITWISE_OR(); 

				}
				break;
			case 36 :
				// mylexer.g:1:311: BITWISE_NOT
				{
				mBITWISE_NOT(); 

				}
				break;
			case 37 :
				// mylexer.g:1:323: BITWISE_XOR
				{
				mBITWISE_XOR(); 

				}
				break;
			case 38 :
				// mylexer.g:1:335: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 39 :
				// mylexer.g:1:341: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 40 :
				// mylexer.g:1:351: COLON
				{
				mCOLON(); 

				}
				break;
			case 41 :
				// mylexer.g:1:357: LEFT_PAREN
				{
				mLEFT_PAREN(); 

				}
				break;
			case 42 :
				// mylexer.g:1:368: RIGHT_PAREN
				{
				mRIGHT_PAREN(); 

				}
				break;
			case 43 :
				// mylexer.g:1:380: LEFT_BRACE
				{
				mLEFT_BRACE(); 

				}
				break;
			case 44 :
				// mylexer.g:1:391: RIGHT_BRACE
				{
				mRIGHT_BRACE(); 

				}
				break;
			case 45 :
				// mylexer.g:1:403: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 46 :
				// mylexer.g:1:411: ID
				{
				mID(); 

				}
				break;
			case 47 :
				// mylexer.g:1:414: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 48 :
				// mylexer.g:1:424: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 49 :
				// mylexer.g:1:433: WHITE_SPACE
				{
				mWHITE_SPACE(); 

				}
				break;
			case 50 :
				// mylexer.g:1:445: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 51 :
				// mylexer.g:1:460: CHAR_LITERAL
				{
				mCHAR_LITERAL(); 

				}
				break;
			case 52 :
				// mylexer.g:1:473: SINGLE_COMMENT
				{
				mSINGLE_COMMENT(); 

				}
				break;
			case 53 :
				// mylexer.g:1:488: MULTI_COMMENT
				{
				mMULTI_COMMENT(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA4_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA4_eofS =
		"\5\uffff";
	static final String DFA4_minS =
		"\2\56\3\uffff";
	static final String DFA4_maxS =
		"\2\71\3\uffff";
	static final String DFA4_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA4_specialS =
		"\5\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "91:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA14_eotS =
		"\1\uffff\14\43\1\71\1\73\1\75\1\77\1\101\1\103\1\105\1\107\1\uffff\1\112"+
		"\12\uffff\2\113\6\uffff\5\43\1\122\11\43\24\uffff\1\113\4\43\1\140\1\uffff"+
		"\1\43\1\142\10\43\1\154\1\155\1\43\1\uffff\1\43\1\uffff\2\43\1\162\2\43"+
		"\1\165\3\43\2\uffff\1\43\1\172\1\43\1\174\1\uffff\1\175\1\43\1\uffff\1"+
		"\177\1\u0080\1\u0081\1\u0082\1\uffff\1\u0083\2\uffff\1\43\5\uffff\1\43"+
		"\1\u0086\1\uffff";
	static final String DFA14_eofS =
		"\u0087\uffff";
	static final String DFA14_minS =
		"\1\11\1\145\1\157\1\141\1\162\1\146\1\154\1\157\2\150\1\154\1\150\1\162"+
		"\1\46\1\174\4\75\1\53\1\55\1\uffff\1\52\12\uffff\2\56\6\uffff\1\164\3"+
		"\151\1\164\1\60\1\157\1\162\1\165\1\157\1\141\1\156\1\163\1\151\1\145"+
		"\24\uffff\1\56\1\165\1\144\2\156\1\60\1\uffff\1\141\1\60\1\142\2\162\1"+
		"\163\1\145\1\154\1\141\1\162\2\60\1\164\1\uffff\1\164\1\uffff\1\154\1"+
		"\164\1\60\1\164\1\151\1\60\1\145\1\153\1\156\2\uffff\1\146\1\60\1\145"+
		"\1\60\1\uffff\1\60\1\156\1\uffff\4\60\1\uffff\1\60\2\uffff\1\165\5\uffff"+
		"\1\145\1\60\1\uffff";
	static final String DFA14_maxS =
		"\1\176\1\145\1\157\1\141\1\162\1\156\2\157\1\150\1\157\1\154\1\150\1\162"+
		"\1\46\1\174\4\75\1\53\1\55\1\uffff\1\57\12\uffff\2\71\6\uffff\1\164\3"+
		"\151\1\164\1\172\1\157\1\162\1\165\1\157\1\141\1\156\1\163\1\151\1\145"+
		"\24\uffff\1\71\1\165\1\144\2\156\1\172\1\uffff\1\141\1\172\1\142\2\162"+
		"\1\164\1\145\1\154\1\141\1\162\2\172\1\164\1\uffff\1\164\1\uffff\1\154"+
		"\1\164\1\172\1\164\1\151\1\172\1\145\1\153\1\156\2\uffff\1\146\1\172\1"+
		"\145\1\172\1\uffff\1\172\1\156\1\uffff\4\172\1\uffff\1\172\2\uffff\1\165"+
		"\5\uffff\1\145\1\172\1\uffff";
	static final String DFA14_acceptS =
		"\25\uffff\1\35\1\uffff\1\37\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1"+
		"\54\2\uffff\1\56\1\57\1\60\1\61\1\62\1\63\17\uffff\1\21\1\42\1\22\1\43"+
		"\1\25\1\23\1\24\1\32\1\27\1\26\1\31\1\30\1\40\1\33\1\41\1\34\1\64\1\65"+
		"\1\36\1\55\6\uffff\1\13\15\uffff\1\5\1\uffff\1\15\11\uffff\1\2\1\3\4\uffff"+
		"\1\11\2\uffff\1\14\4\uffff\1\6\1\uffff\1\10\1\12\1\uffff\1\16\1\17\1\1"+
		"\1\4\1\7\2\uffff\1\20";
	static final String DFA14_specialS =
		"\u0087\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\46\1\45\2\uffff\1\46\22\uffff\1\46\1\17\1\47\2\uffff\1\27\1\15\1\50"+
			"\1\35\1\36\1\25\1\23\1\32\1\24\1\44\1\26\1\41\11\42\1\34\1\33\1\21\1"+
			"\20\1\22\2\uffff\32\43\3\uffff\1\31\1\43\1\uffff\1\43\1\14\1\11\1\7\1"+
			"\12\1\6\2\43\1\5\3\43\1\3\2\43\1\4\1\43\1\1\1\10\2\43\1\2\1\13\3\43\1"+
			"\37\1\16\1\40\1\30",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\56\7\uffff\1\55",
			"\1\57\2\uffff\1\60",
			"\1\61",
			"\1\62",
			"\1\63\6\uffff\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\72",
			"\1\74",
			"\1\76",
			"\1\100",
			"\1\102",
			"\1\104",
			"\1\106",
			"",
			"\1\111\4\uffff\1\110",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44\1\uffff\12\44",
			"\1\44\1\uffff\12\114",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44\1\uffff\12\114",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\141",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\156",
			"",
			"\1\157",
			"",
			"\1\160",
			"\1\161",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\163",
			"\1\164",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\166",
			"\1\167",
			"\1\170",
			"",
			"",
			"\1\171",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\173",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\176",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\1\u0084",
			"",
			"",
			"",
			"",
			"",
			"\1\u0085",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( RETURN | VOID | MAIN | PRINTF | INT | FLOAT | DOUBLE | SHORT | CHAR | CONST | IF | ELSE | FOR | WHILE | BREAK | CONTINUE | LOGICAL_AND | LOGICAL_OR | LOGICAL_NOT | LOGICAL_EQUAL | LOGICAL_NOT_EQUAL | LESS_THAN | LESS_THAN_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | ASSIGN | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | INCREMENT | DECREMENT | BITWISE_AND | BITWISE_OR | BITWISE_NOT | BITWISE_XOR | COMMA | SEMICOLON | COLON | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACE | RIGHT_BRACE | DEC_NUM | ID | FLOAT_NUM | NEW_LINE | WHITE_SPACE | STRING_LITERAL | CHAR_LITERAL | SINGLE_COMMENT | MULTI_COMMENT );";
		}
	}

}
