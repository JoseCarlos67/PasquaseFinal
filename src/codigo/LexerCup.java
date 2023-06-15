/* The following code was generated by JFlex 1.4.3 on 15/06/23 20:48 */

package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15/06/23 20:48 from the specification file
 * <tt>/home/carlos/Downloads/AnalizadorLexico/src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  9,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    11,  0, 50,  0,  0, 45,  0, 49, 28, 30, 42, 41, 36, 29, 27, 43, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 37, 12, 48, 40, 47,  0, 
     0,  1, 46, 35,  1,  1,  1,  1,  1,  6,  1,  1,  1,  1,  1,  7, 
    33,  1, 32,  1,  1,  1,  1,  1,  1,  1,  1,  0, 51,  0, 44,  1, 
     0, 26,  4, 19, 38, 17, 21, 25,  1,  5,  1,  1, 15, 22, 18, 20, 
    23, 39, 24, 31, 14, 13, 34,  1,  1,  1, 16,  8,  0, 10,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\3\2\1\1\1\5"+
    "\2\2\1\6\6\2\1\7\1\10\1\11\1\12\5\2"+
    "\1\13\1\14\1\2\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\2\2\23\2\1\1\0\3\2\2\0\1\4"+
    "\6\2\1\6\6\2\1\0\1\24\5\2\1\13\1\25"+
    "\1\23\1\2\3\0\1\26\1\0\1\27\3\2\1\0"+
    "\6\2\1\30\5\2\1\31\1\0\4\2\1\32\2\2"+
    "\1\33\3\2\1\4\1\2\1\34\6\2\1\35\2\2"+
    "\1\36\2\0\1\3\1\2\1\37\4\2\1\40\4\2"+
    "\1\41\2\2\1\42\1\2\1\43\2\2\2\0\1\44"+
    "\4\2\1\45\2\2\1\46\2\2\1\47\2\2\2\27"+
    "\4\2\1\50\1\51\1\2\1\52\2\2\1\53\3\2"+
    "\1\54\2\2\1\55\2\2\1\56\1\57\1\2\1\60"+
    "\2\2\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[188];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\64\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\64\0\u03a8\0\64\0\64\0\u03dc"+
    "\0\u0410\0\u0444\0\u0478\0\u04ac\0\u04e0\0\64\0\u0514\0\u0548"+
    "\0\64\0\64\0\64\0\64\0\64\0\u057c\0\u0548\0\u05b0"+
    "\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u01a0\0\u071c"+
    "\0\u01a0\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\150"+
    "\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4"+
    "\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\320\0\150\0\64"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u0618\0\64\0\u0bc8\0\u064c\0\u0bfc"+
    "\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c"+
    "\0\u0dd0\0\150\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4\0\150"+
    "\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\150\0\u100c\0\u1040"+
    "\0\64\0\u1074\0\u10a8\0\u10dc\0\u0c98\0\u1110\0\u1144\0\u1178"+
    "\0\u11ac\0\u11e0\0\u1214\0\u1248\0\u127c\0\150\0\u12b0\0\u12e4"+
    "\0\150\0\u1318\0\u134c\0\u1318\0\u1380\0\150\0\u13b4\0\u13e8"+
    "\0\u141c\0\u1450\0\150\0\u1484\0\u14b8\0\u14ec\0\u1520\0\150"+
    "\0\u1554\0\u1588\0\150\0\u15bc\0\150\0\u15f0\0\u1624\0\u1658"+
    "\0\u168c\0\150\0\u16c0\0\u16f4\0\u1728\0\u175c\0\150\0\u1790"+
    "\0\u17c4\0\150\0\u17f8\0\u182c\0\150\0\u1860\0\u1894\0\64"+
    "\0\u1318\0\u18c8\0\u18fc\0\u1930\0\u1964\0\150\0\150\0\u1998"+
    "\0\u19cc\0\u1a00\0\u1a34\0\150\0\u1a68\0\u1a9c\0\u1ad0\0\150"+
    "\0\u1b04\0\u1b38\0\150\0\u1b6c\0\u1ba0\0\150\0\150\0\u1bd4"+
    "\0\150\0\u1c08\0\u1c3c\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[188];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\3"+
    "\1\11\1\5\1\2\1\5\1\12\1\13\1\3\1\14"+
    "\1\3\1\15\1\16\1\17\1\20\1\21\1\3\1\22"+
    "\2\3\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\3\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\2\65\0\2\3\1\0\4\3\5\0"+
    "\16\3\4\0\5\3\2\0\2\3\6\0\1\3\7\0"+
    "\1\4\30\0\1\53\33\0\1\5\5\0\1\5\1\0"+
    "\1\5\30\0\1\5\20\0\2\3\1\0\1\3\1\54"+
    "\2\3\5\0\16\3\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\4\3\5\0\5\3\1\55"+
    "\10\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\5\3\1\56\10\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\5\0\11\57\1\60"+
    "\1\61\51\57\1\0\2\3\1\0\4\3\5\0\1\3"+
    "\1\62\14\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\4\3\1\63\11\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\5\3\1\64\10\3\4\0\1\65"+
    "\4\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\15\3\1\66\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\7\3"+
    "\1\67\6\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\1\70\15\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\1\3\1\71\2\3\5\0\1\72\14\3\1\73\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\13\3\1\74\1\3\1\75\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\1\3\1\76\14\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\42\0\1\77\27\0\2\3\1\0\4\3"+
    "\5\0\4\3\1\100\11\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\4\3"+
    "\1\101\11\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\15\3\1\102\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\4\3\1\103\10\3\1\104\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\15\3\1\105\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\10\0\1\5\5\0\1\5\1\0\1\106\30\0"+
    "\1\5\20\0\2\3\1\0\4\3\5\0\4\3\1\107"+
    "\11\3\4\0\5\3\2\0\2\3\6\0\1\3\55\0"+
    "\1\110\14\0\2\3\1\0\4\3\5\0\7\3\1\111"+
    "\6\3\4\0\5\3\2\0\2\3\6\0\1\3\55\0"+
    "\1\110\6\0\1\110\4\0\62\112\1\0\1\113\62\114"+
    "\1\115\1\116\2\0\1\117\62\0\2\3\1\0\1\120"+
    "\3\3\5\0\16\3\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\1\3\1\121\2\3\5\0"+
    "\16\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\1\3\1\122\14\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\20\0\1\123\51\0"+
    "\2\3\1\0\1\3\1\124\2\3\5\0\16\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\1\3\1\125\2\3\5\0\16\3\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\1\3\1\126\14\3\4\0\5\3\2\0\1\3\1\127"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\6\3"+
    "\1\130\7\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\7\3\1\70\6\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\5\3\1\131\10\3\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\11\3\1\132\4\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\5\3"+
    "\1\133\10\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\2\3\1\134\3\3"+
    "\1\135\7\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\7\3\1\136\6\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\13\3\1\137\2\3\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\4\3\1\140\11\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\7\0\1\141\62\0\2\3\1\0\4\3"+
    "\5\0\5\3\1\142\10\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\15\3"+
    "\1\143\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\2\3\1\144\13\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\13\3\1\145\2\3\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\13\3\1\146\2\3\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\4\3\5\0\13\3\1\147"+
    "\2\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\7\3\1\150\6\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\66\0\1\151\2\0"+
    "\11\112\1\0\52\112\11\114\1\0\52\114\1\0\2\3"+
    "\1\0\2\3\1\152\1\3\5\0\16\3\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\6\3\1\153\7\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\4\3"+
    "\1\154\11\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\5\0\11\123\1\0\1\155\51\123\1\0\2\3\1\0"+
    "\4\3\5\0\2\3\1\156\13\3\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\15\3\1\157\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\15\3\1\160\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\1\161\15\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\13\3"+
    "\1\162\2\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\16\3\4\0\1\163"+
    "\4\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\6\3\1\164\7\3\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\16\3\4\0\1\165\4\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\15\3\1\166\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\6\3\1\167\5\3\1\170\1\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\15\3\1\171\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\5\0\2\172\1\173\6\172\1\0\24\172"+
    "\1\174\25\172\1\0\2\3\1\0\4\3\5\0\15\3"+
    "\1\175\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\2\3\1\176\13\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\15\3\1\177\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\16\3"+
    "\4\0\5\3\2\0\1\200\1\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\15\3\1\201\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\2\3\1\202\13\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\3\3\1\203\5\0"+
    "\16\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\1\3\1\204\2\3\5\0\16\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\1\3\1\205\2\3\5\0\16\3\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\1\3\1\206"+
    "\2\3\5\0\16\3\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\4\3\5\0\2\3\1\207"+
    "\13\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\7\3\1\210\6\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\15\3\1\211\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\4\3"+
    "\1\212\11\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\1\3\1\213\14\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\15\3\1\214\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\7\3\1\215\6\3\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\4\3\5\0\4\3\1\216"+
    "\11\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\13\3\1\217\2\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\7\0\1\220\61\0"+
    "\2\172\1\221\6\172\1\0\24\172\1\174\25\172\1\0"+
    "\2\3\1\0\4\3\5\0\7\3\1\222\6\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\16\3\4\0\3\3\1\223\1\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\15\3\1\224\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\6\3\1\225\7\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\4\3\1\226\11\3\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\7\3\1\227\6\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\13\3"+
    "\1\230\2\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\3\3\1\231\12\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\5\3\1\232\10\3\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\5\3\1\233\10\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\16\3"+
    "\4\0\3\3\1\234\1\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\7\3\1\235\6\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\16\3\4\0\5\3\2\0\1\236"+
    "\1\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\15\3\1\237\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\7\0\1\220\33\0\1\240\25\0\2\172\1\221\6\172"+
    "\1\0\24\172\1\241\25\172\1\0\2\3\1\0\4\3"+
    "\5\0\13\3\1\242\2\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\16\3"+
    "\4\0\5\3\2\0\1\243\1\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\1\3\1\244\14\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\15\3\1\245\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\7\3"+
    "\1\246\6\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\4\3\1\247\11\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\1\3\1\250\14\3\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\15\3\1\251\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\1\3\1\252\2\3\5\0"+
    "\16\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\11\3\1\253\4\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\15\3\1\254\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\4\3"+
    "\1\255\11\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\4\3\1\256\11\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\5\3\1\257\10\3\4\0\5\3"+
    "\2\0\2\3\6\0\1\3\6\0\2\3\1\0\4\3"+
    "\5\0\7\3\1\260\6\3\4\0\5\3\2\0\2\3"+
    "\6\0\1\3\6\0\2\3\1\0\4\3\5\0\2\3"+
    "\1\261\13\3\4\0\5\3\2\0\2\3\6\0\1\3"+
    "\6\0\2\3\1\0\4\3\5\0\11\3\1\262\4\3"+
    "\4\0\5\3\2\0\2\3\6\0\1\3\6\0\2\3"+
    "\1\0\4\3\5\0\15\3\1\263\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\1\3\1\264"+
    "\2\3\5\0\16\3\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\4\3\5\0\13\3\1\265"+
    "\2\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\7\3\1\266\6\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\5\3\1\267\10\3\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\4\3\1\270\11\3\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\4\3\5\0\13\3\1\165"+
    "\2\3\4\0\5\3\2\0\2\3\6\0\1\3\6\0"+
    "\2\3\1\0\4\3\5\0\4\3\1\271\11\3\4\0"+
    "\5\3\2\0\2\3\6\0\1\3\6\0\2\3\1\0"+
    "\4\3\5\0\5\3\1\272\10\3\4\0\5\3\2\0"+
    "\2\3\6\0\1\3\6\0\2\3\1\0\4\3\5\0"+
    "\1\3\1\273\14\3\4\0\5\3\2\0\2\3\6\0"+
    "\1\3\6\0\2\3\1\0\4\3\5\0\7\3\1\274"+
    "\6\3\4\0\5\3\2\0\2\3\6\0\1\3\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7280];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\1\11\11\1\1\11\1\1\2\11"+
    "\6\1\1\11\2\1\5\11\5\1\1\0\3\1\2\0"+
    "\16\1\1\0\10\1\1\11\1\1\3\0\1\11\1\0"+
    "\4\1\1\0\15\1\1\0\7\1\1\11\20\1\2\0"+
    "\24\1\2\0\16\1\1\11\34\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[188];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { return new Symbol(sym.divisao, yychar, yyline, yytext());
          }
        case 50: break;
        case 41: 
          { return new Symbol(sym.utilize, yychar, yyline, yytext());
          }
        case 51: break;
        case 18: 
          { return new Symbol(sym.resto, yychar, yyline, yytext());
          }
        case 52: break;
        case 12: 
          { return new Symbol(sym.dois_pontos, yychar, yyline, yytext());
          }
        case 53: break;
        case 10: 
          { return new Symbol(sym.fecha_parenteses, yychar, yyline, yytext());
          }
        case 54: break;
        case 28: 
          { return new Symbol(sym.leia, yychar, yyline, yytext());
          }
        case 55: break;
        case 39: 
          { return new Symbol(sym.funcao, yychar, yyline, yytext());
          }
        case 56: break;
        case 23: 
          { return new Symbol(sym.real, yychar, yyline, yytext());
          }
        case 57: break;
        case 22: 
          { return new Symbol(sym.palavra, yychar, yyline, yytext());
          }
        case 58: break;
        case 2: 
          { return new Symbol(sym.id, yychar, yyline, yytext());
          }
        case 59: break;
        case 3: 
          { return new Symbol(sym.inteiro, yychar, yyline, yytext());
          }
        case 60: break;
        case 11: 
          { return new Symbol(sym.virgula, yychar, yyline, yytext());
          }
        case 61: break;
        case 19: 
          { return new Symbol(sym.operadores_relacionais, yychar, yyline, yytext());
          }
        case 62: break;
        case 34: 
          { return new Symbol(sym.constante, yychar, yyline, yytext());
          }
        case 63: break;
        case 43: 
          { return new Symbol(sym.Palavra, yychar, yyline, yytext());
          }
        case 64: break;
        case 38: 
          { return new Symbol(sym.leialn, yychar, yyline, yytext());
          }
        case 65: break;
        case 40: 
          { return new Symbol(sym.Inteiro, yychar, yyline, yytext());
          }
        case 66: break;
        case 44: 
          { return new Symbol(sym.enquanto, yychar, yyline, yytext());
          }
        case 67: break;
        case 32: 
          { return new Symbol(sym.bibIO, yychar, yyline, yytext());
          }
        case 68: break;
        case 46: 
          { return new Symbol(sym.Booleano, yychar, yyline, yytext());
          }
        case 69: break;
        case 13: 
          { return new Symbol(sym.atribuicao, yychar, yyline, yytext());
          }
        case 70: break;
        case 25: 
          { return new Symbol(sym.ate, yychar, yyline, yytext());
          }
        case 71: break;
        case 26: 
          { return new Symbol(sym.var, yychar, yyline, yytext());
          }
        case 72: break;
        case 15: 
          { return new Symbol(sym.multiplicacao, yychar, yyline, yytext());
          }
        case 73: break;
        case 21: 
          { return new Symbol(sym.de, yychar, yyline, yytext());
          }
        case 74: break;
        case 31: 
          { return new Symbol(sym.Real, yychar, yyline, yytext());
          }
        case 75: break;
        case 35: 
          { return new Symbol(sym.booleano, yychar, yyline, yytext());
          }
        case 76: break;
        case 37: 
          { return new Symbol(sym.ini, yychar, yyline, yytext());
          }
        case 77: break;
        case 8: 
          { return new Symbol(sym.abre_parenteses, yychar, yyline, yytext());
          }
        case 78: break;
        case 20: 
          { return new Symbol(sym.se, yychar, yyline, yytext());
          }
        case 79: break;
        case 24: 
          { return new Symbol(sym.fim, yychar, yyline, yytext());
          }
        case 80: break;
        case 5: 
          { return new Symbol(sym.pontoVirgula, yychar, yyline, yytext());
          }
        case 81: break;
        case 7: 
          { return new Symbol(sym.pf, yychar, yyline, yytext());
          }
        case 82: break;
        case 49: 
          { return new Symbol(sym.procedimento, yychar, yyline, yytext());
          }
        case 83: break;
        case 45: 
          { return new Symbol(sym.programa, yychar, yyline, yytext());
          }
        case 84: break;
        case 30: 
          { return new Symbol(sym.para, yychar, yyline, yytext());
          }
        case 85: break;
        case 6: 
          { return new Symbol(sym.operador_logico, yychar, yyline, yytext());
          }
        case 86: break;
        case 27: 
          { return new Symbol(sym.caractere, yychar, yyline, yytext());
          }
        case 87: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 88: break;
        case 48: 
          { return new Symbol(sym.Caractere, yychar, yyline, yytext());
          }
        case 89: break;
        case 17: 
          { return new Symbol(sym.potencia, yychar, yyline, yytext());
          }
        case 90: break;
        case 9: 
          { return new Symbol(sym.subtracao, yychar, yyline, yytext());
          }
        case 91: break;
        case 29: 
          { return new Symbol(sym.faca, yychar, yyline, yytext());
          }
        case 92: break;
        case 47: 
          { return new Symbol(sym.escrevaln, yychar, yyline, yytext());
          }
        case 93: break;
        case 36: 
          { return new Symbol(sym.senao, yychar, yyline, yytext());
          }
        case 94: break;
        case 14: 
          { return new Symbol(sym.soma, yychar, yyline, yytext());
          }
        case 95: break;
        case 4: 
          { /*Ignore*/
          }
        case 96: break;
        case 33: 
          { return new Symbol(sym.entao, yychar, yyline, yytext());
          }
        case 97: break;
        case 42: 
          { return new Symbol(sym.escreva, yychar, yyline, yytext());
          }
        case 98: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
