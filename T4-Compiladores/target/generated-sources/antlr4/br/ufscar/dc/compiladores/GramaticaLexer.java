// Generated from br/ufscar/dc/compiladores/Gramatica.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PALAVRA_CHAVE=3, CAMPO=4, CADEIA=5, COMENTARIO=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PALAVRA_CHAVE", "CAMPO", "CADEIA", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio_receita'", "'fim_receita'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PALAVRA_CHAVE", "CAMPO", "CADEIA", "COMENTARIO", "WS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u0182\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4G\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0169\n\5\3\6\3\6\7\6\u016d\n\6\f\6\16\6"+
		"\u0170\13\6\3\6\3\6\3\7\3\7\7\7\u0176\n\7\f\7\16\7\u0179\13\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\5\2"+
		"\f\f\17\17$$\5\2\f\f\17\17\177\177\5\2\13\f\17\17\"\"\2\u0198\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\3\21\3\2\2\2\5 \3\2\2\2\7F\3\2\2\2\t\u0168\3\2\2\2\13\u016a\3"+
		"\2\2\2\r\u0173\3\2\2\2\17\u017e\3\2\2\2\21\22\7k\2\2\22\23\7p\2\2\23\24"+
		"\7k\2\2\24\25\7e\2\2\25\26\7k\2\2\26\27\7q\2\2\27\30\7a\2\2\30\31\7t\2"+
		"\2\31\32\7g\2\2\32\33\7e\2\2\33\34\7g\2\2\34\35\7k\2\2\35\36\7v\2\2\36"+
		"\37\7c\2\2\37\4\3\2\2\2 !\7h\2\2!\"\7k\2\2\"#\7o\2\2#$\7a\2\2$%\7t\2\2"+
		"%&\7g\2\2&\'\7e\2\2\'(\7g\2\2()\7k\2\2)*\7v\2\2*+\7c\2\2+\6\3\2\2\2,-"+
		"\7k\2\2-.\7p\2\2./\7k\2\2/\60\7e\2\2\60\61\7k\2\2\61\62\7q\2\2\62\63\7"+
		"a\2\2\63\64\7t\2\2\64\65\7g\2\2\65\66\7e\2\2\66\67\7g\2\2\678\7k\2\28"+
		"9\7v\2\29:\7c\2\2:G\7<\2\2;<\7h\2\2<=\7k\2\2=>\7o\2\2>?\7a\2\2?@\7t\2"+
		"\2@A\7g\2\2AB\7e\2\2BC\7g\2\2CD\7k\2\2DE\7v\2\2EG\7c\2\2F,\3\2\2\2F;\3"+
		"\2\2\2G\b\3\2\2\2HI\7p\2\2IJ\7q\2\2JK\7o\2\2KL\7g\2\2LM\7a\2\2MN\7o\2"+
		"\2NO\7g\2\2OP\7f\2\2PQ\7k\2\2QR\7e\2\2RS\7q\2\2S\u0169\7<\2\2TU\7t\2\2"+
		"UV\7w\2\2VW\7c\2\2WX\7a\2\2XY\7o\2\2YZ\7g\2\2Z[\7f\2\2[\\\7k\2\2\\]\7"+
		"e\2\2]^\7q\2\2^\u0169\7<\2\2_`\7p\2\2`a\7w\2\2ab\7o\2\2bc\7g\2\2cd\7t"+
		"\2\2de\7q\2\2ef\7a\2\2fg\7o\2\2gh\7g\2\2hi\7k\2\2ij\7e\2\2jk\7q\2\2k\u0169"+
		"\7<\2\2lm\7d\2\2mn\7c\2\2no\7k\2\2op\7t\2\2pq\7t\2\2qr\7q\2\2rs\7a\2\2"+
		"st\7o\2\2tu\7g\2\2uv\7f\2\2vw\7k\2\2wx\7e\2\2xy\7q\2\2y\u0169\7<\2\2z"+
		"{\7e\2\2{|\7k\2\2|}\7f\2\2}~\7c\2\2~\177\7f\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7a\2\2\u0081\u0082\7o\2\2\u0082\u0083\7g\2\2\u0083\u0084\7f\2\2"+
		"\u0084\u0085\7k\2\2\u0085\u0086\7e\2\2\u0086\u0087\7q\2\2\u0087\u0169"+
		"\7<\2\2\u0088\u0089\7g\2\2\u0089\u008a\7u\2\2\u008a\u008b\7v\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7f\2\2\u008d\u008e\7q\2\2\u008e\u008f\7a\2\2"+
		"\u008f\u0090\7o\2\2\u0090\u0091\7g\2\2\u0091\u0092\7f\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7e\2\2\u0094\u0095\7q\2\2\u0095\u0169\7<\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009b\7h\2\2\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7a\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7f\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7q\2\2"+
		"\u00a5\u0169\7<\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9"+
		"\7o\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7a\2\2\u00ab\u00ac\7r\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\u00b1\7p\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u0169"+
		"\7<\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7a\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7e\2\2"+
		"\u00bb\u00bc\7k\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7g\2\2\u00c0\u0169\7<\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7w\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2"+
		"\u00c6\u00c7\7q\2\2\u00c7\u00c8\7a\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca"+
		"\7c\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0\u0169\7<\2\2"+
		"\u00d1\u00d2\7e\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5"+
		"\7c\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7a\2\2\u00d8"+
		"\u00d9\7r\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7k\2\2"+
		"\u00dc\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u0169\7<\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7u\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7q\2\2"+
		"\u00e7\u00e8\7a\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb"+
		"\7e\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7g\2\2\u00f0\u0169\7<\2\2\u00f1\u00f2\7p\2\2"+
		"\u00f2\u00f3\7q\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6"+
		"\7a\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7o\2\2\u00f9"+
		"\u00fa\7g\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7q\2\2"+
		"\u00fd\u0169\7<\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7q\2\2\u0100\u0101"+
		"\7u\2\2\u0101\u0102\7c\2\2\u0102\u0103\7i\2\2\u0103\u0104\7g\2\2\u0104"+
		"\u0105\7o\2\2\u0105\u0169\7<\2\2\u0106\u0107\7p\2\2\u0107\u0108\7w\2\2"+
		"\u0108\u0109\7o\2\2\u0109\u010a\7g\2\2\u010a\u010b\7t\2\2\u010b\u010c"+
		"\7q\2\2\u010c\u010d\7a\2\2\u010d\u010e\7e\2\2\u010e\u010f\7q\2\2\u010f"+
		"\u0110\7o\2\2\u0110\u0111\7r\2\2\u0111\u0112\7t\2\2\u0112\u0113\7k\2\2"+
		"\u0113\u0114\7o\2\2\u0114\u0115\7k\2\2\u0115\u0116\7f\2\2\u0116\u0117"+
		"\7q\2\2\u0117\u0118\7u\2\2\u0118\u0169\7<\2\2\u0119\u011a\7p\2\2\u011a"+
		"\u011b\7w\2\2\u011b\u011c\7o\2\2\u011c\u011d\7g\2\2\u011d\u011e\7t\2\2"+
		"\u011e\u011f\7q\2\2\u011f\u0120\7a\2\2\u0120\u0121\7e\2\2\u0121\u0122"+
		"\7c\2\2\u0122\u0123\7k\2\2\u0123\u0124\7z\2\2\u0124\u0125\7c\2\2\u0125"+
		"\u0126\7u\2\2\u0126\u0169\7<\2\2\u0127\u0128\7r\2\2\u0128\u0129\7t\2\2"+
		"\u0129\u012a\7g\2\2\u012a\u012b\7u\2\2\u012b\u012c\7e\2\2\u012c\u012d"+
		"\7t\2\2\u012d\u012e\7k\2\2\u012e\u012f\7e\2\2\u012f\u0130\7c\2\2\u0130"+
		"\u0131\7q\2\2\u0131\u0132\7a\2\2\u0132\u0133\7s\2\2\u0133\u0134\7v\2\2"+
		"\u0134\u0135\7f\2\2\u0135\u0136\7g\2\2\u0136\u0169\7<\2\2\u0137\u0138"+
		"\7r\2\2\u0138\u0139\7t\2\2\u0139\u013a\7g\2\2\u013a\u013b\7u\2\2\u013b"+
		"\u013c\7e\2\2\u013c\u013d\7t\2\2\u013d\u013e\7k\2\2\u013e\u013f\7e\2\2"+
		"\u013f\u0140\7c\2\2\u0140\u0141\7q\2\2\u0141\u0142\7a\2\2\u0142\u0143"+
		"\7j\2\2\u0143\u0144\7q\2\2\u0144\u0145\7t\2\2\u0145\u0146\7c\2\2\u0146"+
		"\u0147\7u\2\2\u0147\u0169\7<\2\2\u0148\u0149\7r\2\2\u0149\u014a\7t\2\2"+
		"\u014a\u014b\7g\2\2\u014b\u014c\7u\2\2\u014c\u014d\7e\2\2\u014d\u014e"+
		"\7t\2\2\u014e\u014f\7k\2\2\u014f\u0150\7e\2\2\u0150\u0151\7c\2\2\u0151"+
		"\u0152\7q\2\2\u0152\u0153\7a\2\2\u0153\u0154\7f\2\2\u0154\u0155\7k\2\2"+
		"\u0155\u0156\7c\2\2\u0156\u0157\7u\2\2\u0157\u0169\7<\2\2\u0158\u0159"+
		"\7f\2\2\u0159\u015a\7c\2\2\u015a\u015b\7v\2\2\u015b\u015c\7c\2\2\u015c"+
		"\u0169\7<\2\2\u015d\u015e\7c\2\2\u015e\u015f\7u\2\2\u015f\u0160\7u\2\2"+
		"\u0160\u0161\7k\2\2\u0161\u0162\7p\2\2\u0162\u0163\7c\2\2\u0163\u0164"+
		"\7v\2\2\u0164\u0165\7w\2\2\u0165\u0166\7t\2\2\u0166\u0167\7c\2\2\u0167"+
		"\u0169\7<\2\2\u0168H\3\2\2\2\u0168T\3\2\2\2\u0168_\3\2\2\2\u0168l\3\2"+
		"\2\2\u0168z\3\2\2\2\u0168\u0088\3\2\2\2\u0168\u0096\3\2\2\2\u0168\u00a6"+
		"\3\2\2\2\u0168\u00b4\3\2\2\2\u0168\u00c1\3\2\2\2\u0168\u00d1\3\2\2\2\u0168"+
		"\u00e1\3\2\2\2\u0168\u00f1\3\2\2\2\u0168\u00fe\3\2\2\2\u0168\u0106\3\2"+
		"\2\2\u0168\u0119\3\2\2\2\u0168\u0127\3\2\2\2\u0168\u0137\3\2\2\2\u0168"+
		"\u0148\3\2\2\2\u0168\u0158\3\2\2\2\u0168\u015d\3\2\2\2\u0169\n\3\2\2\2"+
		"\u016a\u016e\7$\2\2\u016b\u016d\n\2\2\2\u016c\u016b\3\2\2\2\u016d\u0170"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0172\7$\2\2\u0172\f\3\2\2\2\u0173\u0177\7}\2\2\u0174"+
		"\u0176\n\3\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017b\7\177\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b\7\2\2\u017d\16\3\2"+
		"\2\2\u017e\u017f\t\4\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\b\2\2\u0181"+
		"\20\3\2\2\2\7\2F\u0168\u016e\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}