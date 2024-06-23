// Generated from Expr.txt by ANTLR 4.13.1
package com.example.demo;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, LogicalAnd=8, 
		LogicalOr=9, Equal=10, NotEqual=11, LessThan=12, GreaterThan=13, LessEqual=14, 
		GreaterEqual=15, Add=16, Subtract=17, Multiply=18, Divide=19, INT=20, 
		NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "LogicalAnd", 
			"LogicalOr", "Equal", "NotEqual", "LessThan", "GreaterThan", "LessEqual", 
			"GreaterEqual", "Add", "Subtract", "Multiply", "Divide", "INT", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'('", "')'", "'then'", "'else'", "'while'", "'do'", "'&&'", 
			"'||'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "LogicalAnd", "LogicalOr", 
			"Equal", "NotEqual", "LessThan", "GreaterThan", "LessEqual", "GreaterEqual", 
			"Add", "Subtract", "Multiply", "Divide", "INT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.txt"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016v\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0004\u0013g\b\u0013\u000b\u0013\f\u0013h\u0001\u0014\u0004\u0014l\b"+
		"\u0014\u000b\u0014\f\u0014m\u0001\u0015\u0004\u0015q\b\u0015\u000b\u0015"+
		"\f\u0015r\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0003\u0001\u0000"+
		"09\u0002\u0000\n\n\r\r\u0002\u0000\t\t  x\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0001-\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000\u0000\u00052"+
		"\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t9\u0001\u0000"+
		"\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000"+
		"\u000fG\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013M"+
		"\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017S\u0001\u0000"+
		"\u0000\u0000\u0019U\u0001\u0000\u0000\u0000\u001bW\u0001\u0000\u0000\u0000"+
		"\u001dZ\u0001\u0000\u0000\u0000\u001f]\u0001\u0000\u0000\u0000!_\u0001"+
		"\u0000\u0000\u0000#a\u0001\u0000\u0000\u0000%c\u0001\u0000\u0000\u0000"+
		"\'f\u0001\u0000\u0000\u0000)k\u0001\u0000\u0000\u0000+p\u0001\u0000\u0000"+
		"\u0000-.\u0005i\u0000\u0000./\u0005f\u0000\u0000/\u0002\u0001\u0000\u0000"+
		"\u000001\u0005(\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0005)\u0000"+
		"\u00003\u0006\u0001\u0000\u0000\u000045\u0005t\u0000\u000056\u0005h\u0000"+
		"\u000067\u0005e\u0000\u000078\u0005n\u0000\u00008\b\u0001\u0000\u0000"+
		"\u00009:\u0005e\u0000\u0000:;\u0005l\u0000\u0000;<\u0005s\u0000\u0000"+
		"<=\u0005e\u0000\u0000=\n\u0001\u0000\u0000\u0000>?\u0005w\u0000\u0000"+
		"?@\u0005h\u0000\u0000@A\u0005i\u0000\u0000AB\u0005l\u0000\u0000BC\u0005"+
		"e\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005d\u0000\u0000EF\u0005"+
		"o\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005&\u0000\u0000HI\u0005"+
		"&\u0000\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005|\u0000\u0000KL\u0005"+
		"|\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005=\u0000\u0000NO\u0005"+
		"=\u0000\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005!\u0000\u0000QR\u0005"+
		"=\u0000\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0005<\u0000\u0000T\u0018"+
		"\u0001\u0000\u0000\u0000UV\u0005>\u0000\u0000V\u001a\u0001\u0000\u0000"+
		"\u0000WX\u0005<\u0000\u0000XY\u0005=\u0000\u0000Y\u001c\u0001\u0000\u0000"+
		"\u0000Z[\u0005>\u0000\u0000[\\\u0005=\u0000\u0000\\\u001e\u0001\u0000"+
		"\u0000\u0000]^\u0005+\u0000\u0000^ \u0001\u0000\u0000\u0000_`\u0005-\u0000"+
		"\u0000`\"\u0001\u0000\u0000\u0000ab\u0005*\u0000\u0000b$\u0001\u0000\u0000"+
		"\u0000cd\u0005/\u0000\u0000d&\u0001\u0000\u0000\u0000eg\u0007\u0000\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i(\u0001\u0000\u0000\u0000jl\u0007"+
		"\u0001\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n*\u0001\u0000\u0000"+
		"\u0000oq\u0007\u0002\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0006\u0015\u0000\u0000u,\u0001\u0000\u0000\u0000"+
		"\u0004\u0000hmr\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}