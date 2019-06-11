// Generated from C:/Users/Martijn/PycharmProjects/DesignProject/parse_function\Function.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SQRT=1, MULT=2, DIV=3, PLUS=4, MINUS=5, POWER=6, LBRACKET=7, RBRACKET=8, 
		UNDERSCORE=9, VAR=10, NUM=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SQRT", "MULT", "DIV", "PLUS", "MINUS", "POWER", "LBRACKET", "RBRACKET", 
		"UNDERSCORE", "VAR", "NUM", "LETTER", "DIGIT", "WHITESPACE", "A", "B", 
		"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
		"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'*'", "'/'", "'+'", "'-'", "'^'", "'('", "')'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SQRT", "MULT", "DIV", "PLUS", "MINUS", "POWER", "LBRACKET", "RBRACKET", 
		"UNDERSCORE", "VAR", "NUM", "WHITESPACE"
	};
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


	public FunctionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Function.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\7\13m\n\13\f\13\16\13p\13\13\3\f\6\fs\n\f\r\f"+
		"\16\ft\3\f\3\f\6\fy\n\f\r\f\16\fz\5\f}\n\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\2\33\2\35\16\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65"+
		"\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2\3\2 \4\2..\60\60\4\2C\\"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg"+
		"\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2P"+
		"Ppp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4"+
		"\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\3S\3\2\2\2\5X\3\2"+
		"\2\2\7Z\3\2\2\2\t\\\3\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17b\3\2\2\2\21d\3\2"+
		"\2\2\23f\3\2\2\2\25h\3\2\2\2\27r\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2"+
		"\35\u0082\3\2\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u008c"+
		"\3\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2"+
		"/\u0096\3\2\2\2\61\u0098\3\2\2\2\63\u009a\3\2\2\2\65\u009c\3\2\2\2\67"+
		"\u009e\3\2\2\29\u00a0\3\2\2\2;\u00a2\3\2\2\2=\u00a4\3\2\2\2?\u00a6\3\2"+
		"\2\2A\u00a8\3\2\2\2C\u00aa\3\2\2\2E\u00ac\3\2\2\2G\u00ae\3\2\2\2I\u00b0"+
		"\3\2\2\2K\u00b2\3\2\2\2M\u00b4\3\2\2\2O\u00b6\3\2\2\2Q\u00b8\3\2\2\2S"+
		"T\5C\"\2TU\5? \2UV\5A!\2VW\5E#\2W\4\3\2\2\2XY\7,\2\2Y\6\3\2\2\2Z[\7\61"+
		"\2\2[\b\3\2\2\2\\]\7-\2\2]\n\3\2\2\2^_\7/\2\2_\f\3\2\2\2`a\7`\2\2a\16"+
		"\3\2\2\2bc\7*\2\2c\20\3\2\2\2de\7+\2\2e\22\3\2\2\2fg\7a\2\2g\24\3\2\2"+
		"\2hn\5\31\r\2im\5\31\r\2jm\5\33\16\2km\5\23\n\2li\3\2\2\2lj\3\2\2\2lk"+
		"\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\26\3\2\2\2pn\3\2\2\2qs\5\33\16"+
		"\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2vx\t\2\2\2wy\5\33"+
		"\16\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|v\3\2\2\2|}\3"+
		"\2\2\2}\30\3\2\2\2~\177\t\3\2\2\177\32\3\2\2\2\u0080\u0081\t\4\2\2\u0081"+
		"\34\3\2\2\2\u0082\u0083\t\5\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\17\2"+
		"\2\u0085\36\3\2\2\2\u0086\u0087\t\6\2\2\u0087 \3\2\2\2\u0088\u0089\t\7"+
		"\2\2\u0089\"\3\2\2\2\u008a\u008b\t\b\2\2\u008b$\3\2\2\2\u008c\u008d\t"+
		"\t\2\2\u008d&\3\2\2\2\u008e\u008f\t\n\2\2\u008f(\3\2\2\2\u0090\u0091\t"+
		"\13\2\2\u0091*\3\2\2\2\u0092\u0093\t\f\2\2\u0093,\3\2\2\2\u0094\u0095"+
		"\t\r\2\2\u0095.\3\2\2\2\u0096\u0097\t\16\2\2\u0097\60\3\2\2\2\u0098\u0099"+
		"\t\17\2\2\u0099\62\3\2\2\2\u009a\u009b\t\20\2\2\u009b\64\3\2\2\2\u009c"+
		"\u009d\t\21\2\2\u009d\66\3\2\2\2\u009e\u009f\t\22\2\2\u009f8\3\2\2\2\u00a0"+
		"\u00a1\t\23\2\2\u00a1:\3\2\2\2\u00a2\u00a3\t\24\2\2\u00a3<\3\2\2\2\u00a4"+
		"\u00a5\t\25\2\2\u00a5>\3\2\2\2\u00a6\u00a7\t\26\2\2\u00a7@\3\2\2\2\u00a8"+
		"\u00a9\t\27\2\2\u00a9B\3\2\2\2\u00aa\u00ab\t\30\2\2\u00abD\3\2\2\2\u00ac"+
		"\u00ad\t\31\2\2\u00adF\3\2\2\2\u00ae\u00af\t\32\2\2\u00afH\3\2\2\2\u00b0"+
		"\u00b1\t\33\2\2\u00b1J\3\2\2\2\u00b2\u00b3\t\34\2\2\u00b3L\3\2\2\2\u00b4"+
		"\u00b5\t\35\2\2\u00b5N\3\2\2\2\u00b6\u00b7\t\36\2\2\u00b7P\3\2\2\2\u00b8"+
		"\u00b9\t\37\2\2\u00b9R\3\2\2\2\b\2lntz|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}