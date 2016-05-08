// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g 2016-05-08 13:35:08

  package Languages.javaScript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JavaScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "COMPILATION_UNIT", "PACKAGE_DECL", "CONCRETE_UNIT_DECL", "INTERFACE_UNIT_DECL", "FUNCTION_DECL", "TYPE_DECL", "ATTRIBUTE_DECL", "VAR_DECL", "BLOCK_SCOPE", "MAIN_BLOCK_SCOPE", "IMPORT_DECL", "INSTANTIATES", "FORMAL_PARAM_LIST", "PARAMETER_DECL", "FUNCTION_CALL", "ARGUMENT_LIST", "ARGUMENT", "TYPE", "NAME", "BRANCH", "BRANCH_STATEMENT", "CONDITION", "JUMP_STATEMENT", "LOOP_STATEMENT", "LOGICAL_OPERATOR", "KEYWORD", "OPERATOR", "SEPARATOR", "DIRECTIVE", "EMPTY", "VAR_DECL_PARENT", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "Identifier", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int SHR=87;
    public static final int PACKAGE=52;
    public static final int FUNCTION=17;
    public static final int VT=165;
    public static final int RegularExpressionChar=201;
    public static final int SHL=86;
    public static final int MOD=83;
    public static final int CONST=37;
    public static final int DO=13;
    public static final int DQUOTE=162;
    public static final int CONDITION=151;
    public static final int SEPARATOR=157;
    public static final int NOT=92;
    public static final int EOF=-1;
    public static final int CEXPR=117;
    public static final int DIVASS=110;
    public static final int TYPE=147;
    public static final int BYINDEX=115;
    public static final int INC=84;
    public static final int RPAREN=66;
    public static final int FINAL=43;
    public static final int FORSTEP=120;
    public static final int IMPORT=47;
    public static final int EOL=176;
    public static final int LOGICAL_OPERATOR=154;
    public static final int COMPILATION_UNIT=130;
    public static final int OctalDigit=187;
    public static final int RETURN=22;
    public static final int THIS=24;
    public static final int ARGS=111;
    public static final int WhiteSpace=170;
    public static final int EXPORT=41;
    public static final int EQ=76;
    public static final int GOTO=45;
    public static final int TYPE_DECL=135;
    public static final int XORASS=108;
    public static final int SHU=88;
    public static final int RBRACK=68;
    public static final int KEYWORD=155;
    public static final int RBRACE=64;
    public static final int STATIC=57;
    public static final int INV=93;
    public static final int ELSE=14;
    public static final int NATIVE=51;
    public static final int INT=48;
    public static final int FF=166;
    public static final int OctalEscapeSequence=195;
    public static final int EMPTY=159;
    public static final int ATTRIBUTE_DECL=136;
    public static final int RegularExpressionFirstChar=200;
    public static final int TYPEOF=27;
    public static final int GT=73;
    public static final int FUNCTION_DECL=134;
    public static final int CALL=116;
    public static final int CharacterEscapeSequence=193;
    public static final int FUNCTION_CALL=144;
    public static final int LAND=94;
    public static final int PINC=128;
    public static final int PROTECTED=54;
    public static final int LBRACK=67;
    public static final int LBRACE=63;
    public static final int MAIN_BLOCK_SCOPE=139;
    public static final int SUB=81;
    public static final int RegularExpressionLiteral=186;
    public static final int FLOAT=44;
    public static final int DecimalIntegerLiteral=189;
    public static final int HexDigit=181;
    public static final int LPAREN=65;
    public static final int PARAMETER_DECL=143;
    public static final int IMPLEMENTS=46;
    public static final int ARGUMENT=146;
    public static final int SHRASS=104;
    public static final int PS=174;
    public static final int MultiLineComment=177;
    public static final int ADD=80;
    public static final int ZeroToThree=194;
    public static final int ITEM=121;
    public static final int JUMP_STATEMENT=152;
    public static final int UnicodeEscapeSequence=197;
    public static final int SHUASS=105;
    public static final int SHORT=56;
    public static final int INSTANCEOF=20;
    public static final int INSTANTIATES=141;
    public static final int SQUOTE=163;
    public static final int PACKAGE_DECL=131;
    public static final int SAME=78;
    public static final int COLON=97;
    public static final int StringLiteral=180;
    public static final int PAREXPR=126;
    public static final int ENUM=40;
    public static final int HexIntegerLiteral=192;
    public static final int NBSP=168;
    public static final int SP=167;
    public static final int BLOCK=113;
    public static final int LineTerminator=175;
    public static final int BRANCH=149;
    public static final int INTERFACE=49;
    public static final int DIV=109;
    public static final int LONG=50;
    public static final int CR=172;
    public static final int PUBLIC=55;
    public static final int LOR=95;
    public static final int LT=72;
    public static final int WHILE=30;
    public static final int BackslashSequence=199;
    public static final int LS=173;
    public static final int CASE=8;
    public static final int NEW=21;
    public static final int CHAR=35;
    public static final int CONCRETE_UNIT_DECL=132;
    public static final int VAR_DECL=137;
    public static final int LOOP_STATEMENT=153;
    public static final int DecimalDigit=183;
    public static final int BYFIELD=114;
    public static final int BREAK=7;
    public static final int Identifier=179;
    public static final int NAME=148;
    public static final int POS=129;
    public static final int ExponentPart=188;
    public static final int DOUBLE=39;
    public static final int VAR=28;
    public static final int VOID=29;
    public static final int SUPER=58;
    public static final int LABELLED=122;
    public static final int ADDASS=99;
    public static final int ARRAY=112;
    public static final int PRIVATE=53;
    public static final int BLOCK_SCOPE=138;
    public static final int SWITCH=23;
    public static final int NULL=4;
    public static final int THROWS=60;
    public static final int INTERFACE_UNIT_DECL=133;
    public static final int DELETE=12;
    public static final int BRANCH_STATEMENT=150;
    public static final int MUL=82;
    public static final int IdentifierStartASCII=182;
    public static final int TRY=26;
    public static final int SHLASS=103;
    public static final int USP=169;
    public static final int ANDASS=106;
    public static final int IdentifierNameASCIIStart=185;
    public static final int QUE=96;
    public static final int OR=90;
    public static final int DEBUGGER=38;
    public static final int PDEC=127;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=198;
    public static final int THROW=25;
    public static final int MULASS=101;
    public static final int OctalIntegerLiteral=191;
    public static final int DEC=85;
    public static final int CLASS=36;
    public static final int HexEscapeSequence=196;
    public static final int ORASS=107;
    public static final int NAMEDVALUE=123;
    public static final int SingleLineComment=178;
    public static final int GTE=75;
    public static final int FOR=16;
    public static final int ABSTRACT=32;
    public static final int AND=89;
    public static final int DIRECTIVE=158;
    public static final int LTE=74;
    public static final int IF=18;
    public static final int SUBASS=100;
    public static final int SYNCHRONIZED=59;
    public static final int BOOLEAN=33;
    public static final int EXPR=118;
    public static final int IN=19;
    public static final int CONTINUE=10;
    public static final int OBJECT=125;
    public static final int COMMA=71;
    public static final int TRANSIENT=61;
    public static final int FORITER=119;
    public static final int ARGUMENT_LIST=145;
    public static final int MODASS=102;
    public static final int DOT=69;
    public static final int FORMAL_PARAM_LIST=142;
    public static final int IdentifierPart=184;
    public static final int WITH=31;
    public static final int BYTE=34;
    public static final int XOR=91;
    public static final int VOLATILE=62;
    public static final int OPERATOR=156;
    public static final int IMPORT_DECL=140;
    public static final int NSAME=79;
    public static final int DEFAULT=11;
    public static final int VAR_DECL_PARENT=160;
    public static final int TAB=164;
    public static final int DecimalLiteral=190;
    public static final int TRUE=5;
    public static final int NEQ=77;
    public static final int FINALLY=15;
    public static final int NEG=124;
    public static final int ASSIGN=98;
    public static final int SEMIC=70;
    public static final int EXTENDS=42;
    public static final int BSLASH=161;
    public static final int LF=171;

    // delegates
    // delegators


        public JavaScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JavaScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return JavaScriptParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g"; }


    private final boolean isLeftHandSideAssign(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result;
    	if (isLeftHandSideExpression(lhs))
    	{
    		switch (input.LA(1))
    		{
    			case ASSIGN:
    			case MULASS:
    			case DIVASS:
    			case MODASS:
    			case ADDASS:
    			case SUBASS:
    			case SHLASS:
    			case SHRASS:
    			case SHUASS:
    			case ANDASS:
    			case XORASS:
    			case ORASS:
    				result = true;
    				break;
    			default:
    				result = false;
    				break;
    		}
    	}
    	else
    	{
    		result = false;
    	}
    	
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final static boolean isLeftHandSideExpression(RuleReturnScope lhs)
    {
    	if (lhs.getTree() == null) // e.g. during backtracking
    	{
    		return true;
    	}
    	else
    	{
    		switch (((Tree)lhs.getTree()).getType())
    		{
    		// primaryExpression
    			case THIS:
    			case Identifier:
    			case NULL:
    			case TRUE:
    			case FALSE:
    			case DecimalLiteral:
    			case OctalIntegerLiteral:
    			case HexIntegerLiteral:
    			case StringLiteral:
    			case RegularExpressionLiteral:
    			case ARRAY:
    			case OBJECT:
    			case PAREXPR:
    		// functionExpression
    			case FUNCTION:
    		// newExpression
    			case NEW:
    		// leftHandSideExpression
    			case CALL:
    			case BYFIELD:
    			case BYINDEX:
    				return true;
    			
    			default:
    				return false;
    		}
    	}
    }
    	
    private final boolean isLeftHandSideIn(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result = isLeftHandSideExpression(lhs) && (input.LA(1) == IN);
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final void promoteEOL(ParserRuleReturnScope rule)
    {
    	// Get current token and its type (the possibly offending token).
    	Token lt = input.LT(1);
    	int la = lt.getType();
    	
    	// We only need to promote an EOL when the current token is offending (not a SEMIC, EOF, RBRACE, EOL or MultiLineComment).
    	// EOL and MultiLineComment are not offending as they're already promoted in a previous call to this method.
    	// Promoting an EOL means switching it from off channel to on channel.
    	// A MultiLineComment gets promoted when it contains an EOL.
    	if (!(la == SEMIC || la == EOF || la == RBRACE || la == EOL || la == MultiLineComment))
    	{
    		// Start on the possition before the current token and scan backwards off channel tokens until the previous on channel token.
    		for (int ix = lt.getTokenIndex() - 1; ix > 0; ix--)
    		{
    			lt = input.get(ix);
    			if (lt.getChannel() == Token.DEFAULT_CHANNEL)
    			{
    				// On channel token found: stop scanning.
    				break;
    			}
    			else if (lt.getType() == EOL || (lt.getType() == MultiLineComment && lt.getText().matches("/.*\r\n|\r|\n")))
    			{
    				// We found our EOL: promote the token to on channel, position the input on it and reset the rule start.
    				lt.setChannel(Token.DEFAULT_CHANNEL);
    				input.seek(lt.getTokenIndex());
    				if (rule != null)
    				{
    					rule.start = lt;
    				}
    				break;
    			}
    		}
    	}
    }	


    public static class token_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:518:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral );
    public final JavaScriptParser.token_return token() throws RecognitionException {
        JavaScriptParser.token_return retval = new JavaScriptParser.token_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier2=null;
        Token StringLiteral5=null;
        JavaScriptParser.reservedWord_return reservedWord1 = null;

        JavaScriptParser.punctuator_return punctuator3 = null;

        JavaScriptParser.numericLiteral_return numericLiteral4 = null;


        CommonTree Identifier2_tree=null;
        CommonTree StringLiteral5_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:519:2: ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral )
            int alt1=5;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt1=1;
                }
                break;
            case Identifier:
                {
                alt1=2;
                }
                break;
            case LBRACE:
            case RBRACE:
            case LPAREN:
            case RPAREN:
            case LBRACK:
            case RBRACK:
            case DOT:
            case SEMIC:
            case COMMA:
            case LT:
            case GT:
            case LTE:
            case GTE:
            case EQ:
            case NEQ:
            case SAME:
            case NSAME:
            case ADD:
            case SUB:
            case MUL:
            case MOD:
            case INC:
            case DEC:
            case SHL:
            case SHR:
            case SHU:
            case AND:
            case OR:
            case XOR:
            case NOT:
            case INV:
            case LAND:
            case LOR:
            case QUE:
            case COLON:
            case ASSIGN:
            case ADDASS:
            case SUBASS:
            case MULASS:
            case MODASS:
            case SHLASS:
            case SHRASS:
            case SHUASS:
            case ANDASS:
            case ORASS:
            case XORASS:
            case DIV:
            case DIVASS:
                {
                alt1=3;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt1=4;
                }
                break;
            case StringLiteral:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:519:4: reservedWord
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token2097);
                    reservedWord1=reservedWord();

                    state._fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:520:4: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_token2102); 
                    Identifier2_tree = (CommonTree)adaptor.create(Identifier2);
                    adaptor.addChild(root_0, Identifier2_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:521:4: punctuator
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token2107);
                    punctuator3=punctuator();

                    state._fsp--;

                    adaptor.addChild(root_0, punctuator3.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:522:4: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token2112);
                    numericLiteral4=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral4.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:523:4: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    StringLiteral5=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_token2117); 
                    StringLiteral5_tree = (CommonTree)adaptor.create(StringLiteral5);
                    adaptor.addChild(root_0, StringLiteral5_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token"

    public static class reservedWord_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reservedWord"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:528:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
    public final JavaScriptParser.reservedWord_return reservedWord() throws RecognitionException {
        JavaScriptParser.reservedWord_return retval = new JavaScriptParser.reservedWord_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NULL8=null;
        JavaScriptParser.keyword_return keyword6 = null;

        JavaScriptParser.futureReservedWord_return futureReservedWord7 = null;

        JavaScriptParser.booleanLiteral_return booleanLiteral9 = null;


        CommonTree NULL8_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:529:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
                {
                alt2=1;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt2=2;
                }
                break;
            case NULL:
                {
                alt2=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:529:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord2130);
                    keyword6=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:530:4: futureReservedWord
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord2135);
                    futureReservedWord7=futureReservedWord();

                    state._fsp--;

                    adaptor.addChild(root_0, futureReservedWord7.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:531:4: NULL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NULL8=(Token)match(input,NULL,FOLLOW_NULL_in_reservedWord2140); 
                    NULL8_tree = (CommonTree)adaptor.create(NULL8);
                    adaptor.addChild(root_0, NULL8_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:532:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord2145);
                    booleanLiteral9=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reservedWord"

    public static class keyword_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:539:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH );
    public final JavaScriptParser.keyword_return keyword() throws RecognitionException {
        JavaScriptParser.keyword_return retval = new JavaScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:540:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set10=(Token)input.LT(1);
            if ( (input.LA(1)>=BREAK && input.LA(1)<=WITH) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set10));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword"

    public static class futureReservedWord_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "futureReservedWord"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:571:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final JavaScriptParser.futureReservedWord_return futureReservedWord() throws RecognitionException {
        JavaScriptParser.futureReservedWord_return retval = new JavaScriptParser.futureReservedWord_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:572:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=ABSTRACT && input.LA(1)<=VOLATILE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set11));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "futureReservedWord"

    public static class punctuator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "punctuator"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:649:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS );
    public final JavaScriptParser.punctuator_return punctuator() throws RecognitionException {
        JavaScriptParser.punctuator_return retval = new JavaScriptParser.punctuator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:650:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set12));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "punctuator"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:704:1: literal : ( NULL -> NULL | booleanLiteral -> booleanLiteral | numericLiteral -> numericLiteral | StringLiteral -> StringLiteral | RegularExpressionLiteral -> RegularExpressionLiteral );
    public final JavaScriptParser.literal_return literal() throws RecognitionException {
        JavaScriptParser.literal_return retval = new JavaScriptParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NULL13=null;
        Token StringLiteral16=null;
        Token RegularExpressionLiteral17=null;
        JavaScriptParser.booleanLiteral_return booleanLiteral14 = null;

        JavaScriptParser.numericLiteral_return numericLiteral15 = null;


        CommonTree NULL13_tree=null;
        CommonTree StringLiteral16_tree=null;
        CommonTree RegularExpressionLiteral17_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_RegularExpressionLiteral=new RewriteRuleTokenStream(adaptor,"token RegularExpressionLiteral");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_booleanLiteral=new RewriteRuleSubtreeStream(adaptor,"rule booleanLiteral");
        RewriteRuleSubtreeStream stream_numericLiteral=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteral");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:705:2: ( NULL -> NULL | booleanLiteral -> booleanLiteral | numericLiteral -> numericLiteral | StringLiteral -> StringLiteral | RegularExpressionLiteral -> RegularExpressionLiteral )
            int alt3=5;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt3=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt3=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt3=3;
                }
                break;
            case StringLiteral:
                {
                alt3=4;
                }
                break;
            case RegularExpressionLiteral:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:705:4: NULL
                    {
                    NULL13=(Token)match(input,NULL,FOLLOW_NULL_in_literal2826);  
                    stream_NULL.add(NULL13);



                    // AST REWRITE
                    // elements: NULL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 705:9: -> NULL
                    {
                        adaptor.addChild(root_0, stream_NULL.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:706:4: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal2835);
                    booleanLiteral14=booleanLiteral();

                    state._fsp--;

                    stream_booleanLiteral.add(booleanLiteral14.getTree());


                    // AST REWRITE
                    // elements: booleanLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 706:19: -> booleanLiteral
                    {
                        adaptor.addChild(root_0, stream_booleanLiteral.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:707:4: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal2844);
                    numericLiteral15=numericLiteral();

                    state._fsp--;

                    stream_numericLiteral.add(numericLiteral15.getTree());


                    // AST REWRITE
                    // elements: numericLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 707:19: -> numericLiteral
                    {
                        adaptor.addChild(root_0, stream_numericLiteral.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:708:4: StringLiteral
                    {
                    StringLiteral16=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2853);  
                    stream_StringLiteral.add(StringLiteral16);



                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 708:18: -> StringLiteral
                    {
                        adaptor.addChild(root_0, stream_StringLiteral.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:709:4: RegularExpressionLiteral
                    {
                    RegularExpressionLiteral17=(Token)match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2862);  
                    stream_RegularExpressionLiteral.add(RegularExpressionLiteral17);



                    // AST REWRITE
                    // elements: RegularExpressionLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 709:29: -> RegularExpressionLiteral
                    {
                        adaptor.addChild(root_0, stream_RegularExpressionLiteral.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:712:1: booleanLiteral : ( TRUE | FALSE );
    public final JavaScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        JavaScriptParser.booleanLiteral_return retval = new JavaScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set18=null;

        CommonTree set18_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:713:2: ( TRUE | FALSE )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set18));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class numericLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteral"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:759:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final JavaScriptParser.numericLiteral_return numericLiteral() throws RecognitionException {
        JavaScriptParser.numericLiteral_return retval = new JavaScriptParser.numericLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set19=null;

        CommonTree set19_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:760:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set19=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set19));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:847:1: primaryExpression : ( THIS | Identifier | literal | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN -> ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) );
    public final JavaScriptParser.primaryExpression_return primaryExpression() throws RecognitionException {
        JavaScriptParser.primaryExpression_return retval = new JavaScriptParser.primaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lpar=null;
        Token THIS20=null;
        Token Identifier21=null;
        Token RPAREN26=null;
        JavaScriptParser.literal_return literal22 = null;

        JavaScriptParser.arrayLiteral_return arrayLiteral23 = null;

        JavaScriptParser.objectLiteral_return objectLiteral24 = null;

        JavaScriptParser.expression_return expression25 = null;


        CommonTree lpar_tree=null;
        CommonTree THIS20_tree=null;
        CommonTree Identifier21_tree=null;
        CommonTree RPAREN26_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:848:2: ( THIS | Identifier | literal | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN -> ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt4=1;
                }
                break;
            case Identifier:
                {
                alt4=2;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt4=3;
                }
                break;
            case LBRACK:
                {
                alt4=4;
                }
                break;
            case LBRACE:
                {
                alt4=5;
                }
                break;
            case LPAREN:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:848:4: THIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    THIS20=(Token)match(input,THIS,FOLLOW_THIS_in_primaryExpression3479); 
                    THIS20_tree = (CommonTree)adaptor.create(THIS20);
                    adaptor.addChild(root_0, THIS20_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:849:4: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpression3484); 
                    Identifier21_tree = (CommonTree)adaptor.create(Identifier21);
                    adaptor.addChild(root_0, Identifier21_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:850:4: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3489);
                    literal22=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal22.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:851:4: arrayLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3494);
                    arrayLiteral23=arrayLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayLiteral23.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:852:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3499);
                    objectLiteral24=objectLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, objectLiteral24.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:853:4: lpar= LPAREN expression RPAREN
                    {
                    lpar=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3506);  
                    stream_LPAREN.add(lpar);

                    pushFollow(FOLLOW_expression_in_primaryExpression3508);
                    expression25=expression();

                    state._fsp--;

                    stream_expression.add(expression25.getTree());
                    RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3510);  
                    stream_RPAREN.add(RPAREN26);



                    // AST REWRITE
                    // elements: RPAREN, LPAREN, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 853:34: -> ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:853:37: ^( SEPARATOR LPAREN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_LPAREN.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_expression.nextTree());
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:853:68: ^( SEPARATOR RPAREN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_RPAREN.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLiteral"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:855:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
    public final JavaScriptParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        JavaScriptParser.arrayLiteral_return retval = new JavaScriptParser.arrayLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lb=null;
        Token COMMA28=null;
        Token RBRACK30=null;
        JavaScriptParser.arrayItem_return arrayItem27 = null;

        JavaScriptParser.arrayItem_return arrayItem29 = null;


        CommonTree lb_tree=null;
        CommonTree COMMA28_tree=null;
        CommonTree RBRACK30_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:856:2: (lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:856:4: lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK
            {
            lb=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3538);  
            stream_LBRACK.add(lb);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:856:14: ( arrayItem ( COMMA arrayItem )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NULL && LA6_0<=FALSE)||LA6_0==DELETE||LA6_0==FUNCTION||LA6_0==NEW||LA6_0==THIS||LA6_0==TYPEOF||LA6_0==VOID||LA6_0==LBRACE||LA6_0==LPAREN||LA6_0==LBRACK||LA6_0==COMMA||(LA6_0>=ADD && LA6_0<=SUB)||(LA6_0>=INC && LA6_0<=DEC)||(LA6_0>=NOT && LA6_0<=INV)||(LA6_0>=Identifier && LA6_0<=StringLiteral)||LA6_0==RegularExpressionLiteral||(LA6_0>=DecimalLiteral && LA6_0<=HexIntegerLiteral)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RBRACK) ) {
                int LA6_2 = input.LA(2);

                if ( (( input.LA(1) == COMMA )) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:856:16: arrayItem ( COMMA arrayItem )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3542);
                    arrayItem27=arrayItem();

                    state._fsp--;

                    stream_arrayItem.add(arrayItem27.getTree());
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:856:26: ( COMMA arrayItem )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:856:28: COMMA arrayItem
                    	    {
                    	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3546);  
                    	    stream_COMMA.add(COMMA28);

                    	    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3548);
                    	    arrayItem29=arrayItem();

                    	    state._fsp--;

                    	    stream_arrayItem.add(arrayItem29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACK30=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3556);  
            stream_RBRACK.add(RBRACK30);



            // AST REWRITE
            // elements: arrayItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 857:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:857:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, lb, "ARRAY"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:857:28: ( arrayItem )*
                while ( stream_arrayItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayItem.nextTree());

                }
                stream_arrayItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayLiteral"

    public static class arrayItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayItem"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:860:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final JavaScriptParser.arrayItem_return arrayItem() throws RecognitionException {
        JavaScriptParser.arrayItem_return retval = new JavaScriptParser.arrayItem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:861:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:861:4: (expr= assignmentExpression | {...}?)
            {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:861:4: (expr= assignmentExpression | {...}?)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==DELETE||LA7_0==FUNCTION||LA7_0==NEW||LA7_0==THIS||LA7_0==TYPEOF||LA7_0==VOID||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)||(LA7_0>=Identifier && LA7_0<=StringLiteral)||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RBRACK||LA7_0==COMMA) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:861:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3584);
                    expr=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:861:34: {...}?
                    {
                    if ( !(( input.LA(1) == COMMA )) ) {
                        throw new FailedPredicateException(input, "arrayItem", " input.LA(1) == COMMA ");
                    }

                    }
                    break;

            }



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 862:2: -> ^( ITEM ( $expr)? )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:862:5: ^( ITEM ( $expr)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM, "ITEM"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:862:13: ( $expr)?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayItem"

    public static class objectLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:865:1: objectLiteral : lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* ) ;
    public final JavaScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        JavaScriptParser.objectLiteral_return retval = new JavaScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lb=null;
        Token COMMA32=null;
        Token RBRACE34=null;
        JavaScriptParser.nameValuePair_return nameValuePair31 = null;

        JavaScriptParser.nameValuePair_return nameValuePair33 = null;


        CommonTree lb_tree=null;
        CommonTree COMMA32_tree=null;
        CommonTree RBRACE34_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_nameValuePair=new RewriteRuleSubtreeStream(adaptor,"rule nameValuePair");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:866:2: (lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:866:4: lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3616);  
            stream_LBRACE.add(lb);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:866:14: ( nameValuePair ( COMMA nameValuePair )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Identifier && LA9_0<=StringLiteral)||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:866:16: nameValuePair ( COMMA nameValuePair )*
                    {
                    pushFollow(FOLLOW_nameValuePair_in_objectLiteral3620);
                    nameValuePair31=nameValuePair();

                    state._fsp--;

                    stream_nameValuePair.add(nameValuePair31.getTree());
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:866:30: ( COMMA nameValuePair )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:866:32: COMMA nameValuePair
                    	    {
                    	    COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3624);  
                    	    stream_COMMA.add(COMMA32);

                    	    pushFollow(FOLLOW_nameValuePair_in_objectLiteral3626);
                    	    nameValuePair33=nameValuePair();

                    	    state._fsp--;

                    	    stream_nameValuePair.add(nameValuePair33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACE34=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3634);  
            stream_RBRACE.add(RBRACE34);



            // AST REWRITE
            // elements: nameValuePair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 867:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:867:5: ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJECT, lb, "OBJECT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:867:30: ( nameValuePair )*
                while ( stream_nameValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_nameValuePair.nextTree());

                }
                stream_nameValuePair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectLiteral"

    public static class nameValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameValuePair"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:870:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final JavaScriptParser.nameValuePair_return nameValuePair() throws RecognitionException {
        JavaScriptParser.nameValuePair_return retval = new JavaScriptParser.nameValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON36=null;
        JavaScriptParser.propertyName_return propertyName35 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression37 = null;


        CommonTree COLON36_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:871:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:871:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3659);
            propertyName35=propertyName();

            state._fsp--;

            stream_propertyName.add(propertyName35.getTree());
            COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_nameValuePair3661);  
            stream_COLON.add(COLON36);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3663);
            assignmentExpression37=assignmentExpression();

            state._fsp--;

            stream_assignmentExpression.add(assignmentExpression37.getTree());


            // AST REWRITE
            // elements: propertyName, assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 872:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:872:5: ^( NAMEDVALUE propertyName assignmentExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMEDVALUE, "NAMEDVALUE"), root_1);

                adaptor.addChild(root_1, stream_propertyName.nextTree());
                adaptor.addChild(root_1, stream_assignmentExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nameValuePair"

    public static class propertyName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyName"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:875:1: propertyName : ( Identifier | StringLiteral | numericLiteral );
    public final JavaScriptParser.propertyName_return propertyName() throws RecognitionException {
        JavaScriptParser.propertyName_return retval = new JavaScriptParser.propertyName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier38=null;
        Token StringLiteral39=null;
        JavaScriptParser.numericLiteral_return numericLiteral40 = null;


        CommonTree Identifier38_tree=null;
        CommonTree StringLiteral39_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:876:2: ( Identifier | StringLiteral | numericLiteral )
            int alt10=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt10=1;
                }
                break;
            case StringLiteral:
                {
                alt10=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:876:4: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_propertyName3687); 
                    Identifier38_tree = (CommonTree)adaptor.create(Identifier38);
                    adaptor.addChild(root_0, Identifier38_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:877:4: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    StringLiteral39=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3692); 
                    StringLiteral39_tree = (CommonTree)adaptor.create(StringLiteral39);
                    adaptor.addChild(root_0, StringLiteral39_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:878:4: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3697);
                    numericLiteral40=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral40.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyName"

    public static class memberExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:890:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final JavaScriptParser.memberExpression_return memberExpression() throws RecognitionException {
        JavaScriptParser.memberExpression_return retval = new JavaScriptParser.memberExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.primaryExpression_return primaryExpression41 = null;

        JavaScriptParser.functionExpression_return functionExpression42 = null;

        JavaScriptParser.newExpression_return newExpression43 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:891:2: ( primaryExpression | functionExpression | newExpression )
            int alt11=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case THIS:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt11=1;
                }
                break;
            case FUNCTION:
                {
                alt11=2;
                }
                break;
            case NEW:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:891:4: primaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3715);
                    primaryExpression41=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, primaryExpression41.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:892:4: functionExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3720);
                    functionExpression42=functionExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, functionExpression42.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:893:4: newExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3725);
                    newExpression43=newExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, newExpression43.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "memberExpression"

    public static class newExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:896:1: newExpression : NEW memberExpression -> ^( INSTANTIATES ^( KEYWORD NEW ) memberExpression ) ;
    public final JavaScriptParser.newExpression_return newExpression() throws RecognitionException {
        JavaScriptParser.newExpression_return retval = new JavaScriptParser.newExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEW44=null;
        JavaScriptParser.memberExpression_return memberExpression45 = null;


        CommonTree NEW44_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:897:2: ( NEW memberExpression -> ^( INSTANTIATES ^( KEYWORD NEW ) memberExpression ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:897:4: NEW memberExpression
            {
            NEW44=(Token)match(input,NEW,FOLLOW_NEW_in_newExpression3736);  
            stream_NEW.add(NEW44);

            pushFollow(FOLLOW_memberExpression_in_newExpression3738);
            memberExpression45=memberExpression();

            state._fsp--;

            stream_memberExpression.add(memberExpression45.getTree());


            // AST REWRITE
            // elements: NEW, memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 898:2: -> ^( INSTANTIATES ^( KEYWORD NEW ) memberExpression )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:898:5: ^( INSTANTIATES ^( KEYWORD NEW ) memberExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTANTIATES, "INSTANTIATES"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:898:20: ^( KEYWORD NEW )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_NEW.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_memberExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:902:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGUMENT_LIST ^( SEPARATOR LPAREN ) ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )? ^( SEPARATOR RPAREN ) ) ;
    public final JavaScriptParser.arguments_return arguments() throws RecognitionException {
        JavaScriptParser.arguments_return retval = new JavaScriptParser.arguments_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN46=null;
        Token COMMA48=null;
        Token RPAREN50=null;
        JavaScriptParser.assignmentExpression_return assignmentExpression47 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression49 = null;


        CommonTree LPAREN46_tree=null;
        CommonTree COMMA48_tree=null;
        CommonTree RPAREN50_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:903:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGUMENT_LIST ^( SEPARATOR LPAREN ) ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )? ^( SEPARATOR RPAREN ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:903:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments3766);  
            stream_LPAREN.add(LPAREN46);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:903:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=NULL && LA13_0<=FALSE)||LA13_0==DELETE||LA13_0==FUNCTION||LA13_0==NEW||LA13_0==THIS||LA13_0==TYPEOF||LA13_0==VOID||LA13_0==LBRACE||LA13_0==LPAREN||LA13_0==LBRACK||(LA13_0>=ADD && LA13_0<=SUB)||(LA13_0>=INC && LA13_0<=DEC)||(LA13_0>=NOT && LA13_0<=INV)||(LA13_0>=Identifier && LA13_0<=StringLiteral)||LA13_0==RegularExpressionLiteral||(LA13_0>=DecimalLiteral && LA13_0<=HexIntegerLiteral)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:903:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3770);
                    assignmentExpression47=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(assignmentExpression47.getTree());
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:903:34: ( COMMA assignmentExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:903:36: COMMA assignmentExpression
                    	    {
                    	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_arguments3774);  
                    	    stream_COMMA.add(COMMA48);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3776);
                    	    assignmentExpression49=assignmentExpression();

                    	    state._fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments3784);  
            stream_RPAREN.add(RPAREN50);



            // AST REWRITE
            // elements: RPAREN, LPAREN, COMMA, assignmentExpression, assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 904:2: -> ^( ARGUMENT_LIST ^( SEPARATOR LPAREN ) ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )? ^( SEPARATOR RPAREN ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:904:5: ^( ARGUMENT_LIST ^( SEPARATOR LPAREN ) ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )? ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:904:21: ^( SEPARATOR LPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:904:41: ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )?
                if ( stream_COMMA.hasNext()||stream_assignmentExpression.hasNext()||stream_assignmentExpression.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:904:43: ^( ARGUMENT assignmentExpression )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT, "ARGUMENT"), root_2);

                    adaptor.addChild(root_2, stream_assignmentExpression.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:904:76: ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )*
                    while ( stream_COMMA.hasNext()||stream_assignmentExpression.hasNext() ) {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:904:78: ^( SEPARATOR COMMA )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                        adaptor.addChild(root_2, stream_COMMA.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:904:97: ^( ARGUMENT assignmentExpression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT, "ARGUMENT"), root_2);

                        adaptor.addChild(root_2, stream_assignmentExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                    }
                    stream_COMMA.reset();
                    stream_assignmentExpression.reset();

                }
                stream_COMMA.reset();
                stream_assignmentExpression.reset();
                stream_assignmentExpression.reset();
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:904:136: ^( SEPARATOR RPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftHandSideExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:907:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( FUNCTION_CALL ^( NAME $leftHandSideExpression) arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )* ;
    public final JavaScriptParser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        JavaScriptParser.leftHandSideExpression_return retval = new JavaScriptParser.leftHandSideExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LBRACK53=null;
        Token RBRACK55=null;
        Token DOT56=null;
        Token Identifier57=null;
        JavaScriptParser.memberExpression_return memberExpression51 = null;

        JavaScriptParser.arguments_return arguments52 = null;

        JavaScriptParser.expression_return expression54 = null;


        CommonTree LBRACK53_tree=null;
        CommonTree RBRACK55_tree=null;
        CommonTree DOT56_tree=null;
        CommonTree Identifier57_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:908:2: ( ( memberExpression -> memberExpression ) ( arguments -> ^( FUNCTION_CALL ^( NAME $leftHandSideExpression) arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:909:2: ( memberExpression -> memberExpression ) ( arguments -> ^( FUNCTION_CALL ^( NAME $leftHandSideExpression) arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )*
            {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:909:2: ( memberExpression -> memberExpression )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:910:3: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3848);
            memberExpression51=memberExpression();

            state._fsp--;

            stream_memberExpression.add(memberExpression51.getTree());


            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 910:22: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:912:2: ( arguments -> ^( FUNCTION_CALL ^( NAME $leftHandSideExpression) arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt14=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt14=2;
                    }
                    break;
                case DOT:
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:913:3: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3864);
            	    arguments52=arguments();

            	    state._fsp--;

            	    stream_arguments.add(arguments52.getTree());


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 913:15: -> ^( FUNCTION_CALL ^( NAME $leftHandSideExpression) arguments )
            	    {
            	        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:913:18: ^( FUNCTION_CALL ^( NAME $leftHandSideExpression) arguments )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

            	        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:913:35: ^( NAME $leftHandSideExpression)
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

            	        adaptor.addChild(root_2, stream_retval.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        adaptor.addChild(root_1, stream_arguments.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:914:5: LBRACK expression RBRACK
            	    {
            	    LBRACK53=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3889);  
            	    stream_LBRACK.add(LBRACK53);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3891);
            	    expression54=expression();

            	    state._fsp--;

            	    stream_expression.add(expression54.getTree());
            	    RBRACK55=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3893);  
            	    stream_RBRACK.add(RBRACK55);



            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 914:30: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:914:33: ^( BYINDEX $leftHandSideExpression expression )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BYINDEX, "BYINDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:915:5: DOT Identifier
            	    {
            	    DOT56=(Token)match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3912);  
            	    stream_DOT.add(DOT56);

            	    Identifier57=(Token)match(input,Identifier,FOLLOW_Identifier_in_leftHandSideExpression3914);  
            	    stream_Identifier.add(Identifier57);



            	    // AST REWRITE
            	    // elements: Identifier, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 915:21: -> ^( BYFIELD $leftHandSideExpression Identifier )
            	    {
            	        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:915:24: ^( BYFIELD $leftHandSideExpression Identifier )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_Identifier.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "leftHandSideExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:929:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final JavaScriptParser.postfixExpression_return postfixExpression() throws RecognitionException {
        JavaScriptParser.postfixExpression_return retval = new JavaScriptParser.postfixExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.leftHandSideExpression_return leftHandSideExpression58 = null;

        JavaScriptParser.postfixOperator_return postfixOperator59 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:930:2: ( leftHandSideExpression ( postfixOperator )? )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:930:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3949);
            leftHandSideExpression58=leftHandSideExpression();

            state._fsp--;

            adaptor.addChild(root_0, leftHandSideExpression58.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:930:95: ( postfixOperator )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=INC && LA15_0<=DEC)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:930:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression3955);
                    postfixOperator59=postfixOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, postfixOperator59.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpression"

    public static class postfixOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixOperator"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:933:1: postfixOperator : (op= INC -> ^( OPERATOR INC ) | op= DEC -> ^( OPERATOR DEC ) );
    public final JavaScriptParser.postfixOperator_return postfixOperator() throws RecognitionException {
        JavaScriptParser.postfixOperator_return retval = new JavaScriptParser.postfixOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;

        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:934:2: (op= INC -> ^( OPERATOR INC ) | op= DEC -> ^( OPERATOR DEC ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INC) ) {
                alt16=1;
            }
            else if ( (LA16_0==DEC) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:934:4: op= INC
                    {
                    op=(Token)match(input,INC,FOLLOW_INC_in_postfixOperator3972);  
                    stream_INC.add(op);

                     op.setType(PINC); 


                    // AST REWRITE
                    // elements: INC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 934:34: -> ^( OPERATOR INC )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:934:37: ^( OPERATOR INC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_INC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:935:4: op= DEC
                    {
                    op=(Token)match(input,DEC,FOLLOW_DEC_in_postfixOperator3989);  
                    stream_DEC.add(op);

                     op.setType(PDEC); 


                    // AST REWRITE
                    // elements: DEC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 935:34: -> ^( OPERATOR DEC )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:935:37: ^( OPERATOR DEC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DEC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixOperator"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:942:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final JavaScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavaScriptParser.unaryExpression_return retval = new JavaScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.postfixExpression_return postfixExpression60 = null;

        JavaScriptParser.unaryOperator_return unaryOperator61 = null;

        JavaScriptParser.unaryExpression_return unaryExpression62 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:943:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=NULL && LA17_0<=FALSE)||LA17_0==FUNCTION||LA17_0==NEW||LA17_0==THIS||LA17_0==LBRACE||LA17_0==LPAREN||LA17_0==LBRACK||(LA17_0>=Identifier && LA17_0<=StringLiteral)||LA17_0==RegularExpressionLiteral||(LA17_0>=DecimalLiteral && LA17_0<=HexIntegerLiteral)) ) {
                alt17=1;
            }
            else if ( (LA17_0==DELETE||LA17_0==TYPEOF||LA17_0==VOID||(LA17_0>=ADD && LA17_0<=SUB)||(LA17_0>=INC && LA17_0<=DEC)||(LA17_0>=NOT && LA17_0<=INV)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:943:4: postfixExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4014);
                    postfixExpression60=postfixExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, postfixExpression60.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:944:4: unaryOperator unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4019);
                    unaryOperator61=unaryOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, unaryOperator61.getTree());
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4021);
                    unaryExpression62=unaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, unaryExpression62.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryOperator"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:947:1: unaryOperator : ( DELETE -> ^( OPERATOR DELETE ) | VOID -> ^( OPERATOR VOID ) | TYPEOF -> ^( OPERATOR TYPEOF ) | INC -> ^( OPERATOR INC ) | DEC -> ^( OPERATOR DEC ) | op= ADD -> ^( OPERATOR ADD ) | op= SUB -> ^( OPERATOR SUB ) | INV -> ^( OPERATOR INV ) | NOT -> ^( OPERATOR NOT ) );
    public final JavaScriptParser.unaryOperator_return unaryOperator() throws RecognitionException {
        JavaScriptParser.unaryOperator_return retval = new JavaScriptParser.unaryOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        Token DELETE63=null;
        Token VOID64=null;
        Token TYPEOF65=null;
        Token INC66=null;
        Token DEC67=null;
        Token INV68=null;
        Token NOT69=null;

        CommonTree op_tree=null;
        CommonTree DELETE63_tree=null;
        CommonTree VOID64_tree=null;
        CommonTree TYPEOF65_tree=null;
        CommonTree INC66_tree=null;
        CommonTree DEC67_tree=null;
        CommonTree INV68_tree=null;
        CommonTree NOT69_tree=null;
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_TYPEOF=new RewriteRuleTokenStream(adaptor,"token TYPEOF");
        RewriteRuleTokenStream stream_INV=new RewriteRuleTokenStream(adaptor,"token INV");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:948:2: ( DELETE -> ^( OPERATOR DELETE ) | VOID -> ^( OPERATOR VOID ) | TYPEOF -> ^( OPERATOR TYPEOF ) | INC -> ^( OPERATOR INC ) | DEC -> ^( OPERATOR DEC ) | op= ADD -> ^( OPERATOR ADD ) | op= SUB -> ^( OPERATOR SUB ) | INV -> ^( OPERATOR INV ) | NOT -> ^( OPERATOR NOT ) )
            int alt18=9;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt18=1;
                }
                break;
            case VOID:
                {
                alt18=2;
                }
                break;
            case TYPEOF:
                {
                alt18=3;
                }
                break;
            case INC:
                {
                alt18=4;
                }
                break;
            case DEC:
                {
                alt18=5;
                }
                break;
            case ADD:
                {
                alt18=6;
                }
                break;
            case SUB:
                {
                alt18=7;
                }
                break;
            case INV:
                {
                alt18=8;
                }
                break;
            case NOT:
                {
                alt18=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:948:4: DELETE
                    {
                    DELETE63=(Token)match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4033);  
                    stream_DELETE.add(DELETE63);



                    // AST REWRITE
                    // elements: DELETE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 948:11: -> ^( OPERATOR DELETE )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:948:14: ^( OPERATOR DELETE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DELETE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:949:4: VOID
                    {
                    VOID64=(Token)match(input,VOID,FOLLOW_VOID_in_unaryOperator4046);  
                    stream_VOID.add(VOID64);



                    // AST REWRITE
                    // elements: VOID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 949:9: -> ^( OPERATOR VOID )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:949:12: ^( OPERATOR VOID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_VOID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:950:4: TYPEOF
                    {
                    TYPEOF65=(Token)match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4059);  
                    stream_TYPEOF.add(TYPEOF65);



                    // AST REWRITE
                    // elements: TYPEOF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 950:11: -> ^( OPERATOR TYPEOF )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:950:14: ^( OPERATOR TYPEOF )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_TYPEOF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:951:4: INC
                    {
                    INC66=(Token)match(input,INC,FOLLOW_INC_in_unaryOperator4072);  
                    stream_INC.add(INC66);



                    // AST REWRITE
                    // elements: INC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 951:8: -> ^( OPERATOR INC )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:951:11: ^( OPERATOR INC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_INC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:952:4: DEC
                    {
                    DEC67=(Token)match(input,DEC,FOLLOW_DEC_in_unaryOperator4085);  
                    stream_DEC.add(DEC67);



                    // AST REWRITE
                    // elements: DEC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 952:8: -> ^( OPERATOR DEC )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:952:11: ^( OPERATOR DEC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DEC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:953:4: op= ADD
                    {
                    op=(Token)match(input,ADD,FOLLOW_ADD_in_unaryOperator4100);  
                    stream_ADD.add(op);

                     op.setType(POS); 


                    // AST REWRITE
                    // elements: ADD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 953:33: -> ^( OPERATOR ADD )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:953:36: ^( OPERATOR ADD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_ADD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:954:4: op= SUB
                    {
                    op=(Token)match(input,SUB,FOLLOW_SUB_in_unaryOperator4117);  
                    stream_SUB.add(op);

                     op.setType(NEG); 


                    // AST REWRITE
                    // elements: SUB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 954:33: -> ^( OPERATOR SUB )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:954:36: ^( OPERATOR SUB )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_SUB.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:955:4: INV
                    {
                    INV68=(Token)match(input,INV,FOLLOW_INV_in_unaryOperator4132);  
                    stream_INV.add(INV68);



                    // AST REWRITE
                    // elements: INV
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 955:8: -> ^( OPERATOR INV )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:955:11: ^( OPERATOR INV )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_INV.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:956:4: NOT
                    {
                    NOT69=(Token)match(input,NOT,FOLLOW_NOT_in_unaryOperator4145);  
                    stream_NOT.add(NOT69);



                    // AST REWRITE
                    // elements: NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 956:8: -> ^( OPERATOR NOT )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:956:11: ^( OPERATOR NOT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_NOT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryOperator"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:963:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final JavaScriptParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JavaScriptParser.multiplicativeExpression_return retval = new JavaScriptParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set71=null;
        JavaScriptParser.unaryExpression_return unaryExpression70 = null;

        JavaScriptParser.unaryExpression_return unaryExpression72 = null;


        CommonTree set71_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:964:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:964:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4168);
            unaryExpression70=unaryExpression();

            state._fsp--;

            adaptor.addChild(root_0, unaryExpression70.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:964:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=MUL && LA19_0<=MOD)||LA19_0==DIV) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:964:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set71=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set71));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4186);
            	    unaryExpression72=unaryExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExpression72.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:971:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final JavaScriptParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JavaScriptParser.additiveExpression_return retval = new JavaScriptParser.additiveExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set74=null;
        JavaScriptParser.multiplicativeExpression_return multiplicativeExpression73 = null;

        JavaScriptParser.multiplicativeExpression_return multiplicativeExpression75 = null;


        CommonTree set74_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:972:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:972:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4204);
            multiplicativeExpression73=multiplicativeExpression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicativeExpression73.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:972:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=ADD && LA20_0<=SUB)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:972:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set74=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set74));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4218);
            	    multiplicativeExpression75=multiplicativeExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression75.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:979:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final JavaScriptParser.shiftExpression_return shiftExpression() throws RecognitionException {
        JavaScriptParser.shiftExpression_return retval = new JavaScriptParser.shiftExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set77=null;
        JavaScriptParser.additiveExpression_return additiveExpression76 = null;

        JavaScriptParser.additiveExpression_return additiveExpression78 = null;


        CommonTree set77_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:980:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:980:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4237);
            additiveExpression76=additiveExpression();

            state._fsp--;

            adaptor.addChild(root_0, additiveExpression76.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:980:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=SHL && LA21_0<=SHU)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:980:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set77=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set77));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4255);
            	    additiveExpression78=additiveExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additiveExpression78.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:987:1: relationalExpression : shiftExpression ( relationalOperators shiftExpression )* -> shiftExpression ( ^( OPERATOR relationalOperators ) shiftExpression )* ;
    public final JavaScriptParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JavaScriptParser.relationalExpression_return retval = new JavaScriptParser.relationalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.shiftExpression_return shiftExpression79 = null;

        JavaScriptParser.relationalOperators_return relationalOperators80 = null;

        JavaScriptParser.shiftExpression_return shiftExpression81 = null;


        RewriteRuleSubtreeStream stream_relationalOperators=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperators");
        RewriteRuleSubtreeStream stream_shiftExpression=new RewriteRuleSubtreeStream(adaptor,"rule shiftExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:988:2: ( shiftExpression ( relationalOperators shiftExpression )* -> shiftExpression ( ^( OPERATOR relationalOperators ) shiftExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:988:4: shiftExpression ( relationalOperators shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4274);
            shiftExpression79=shiftExpression();

            state._fsp--;

            stream_shiftExpression.add(shiftExpression79.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:988:20: ( relationalOperators shiftExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=IN && LA22_0<=INSTANCEOF)||(LA22_0>=LT && LA22_0<=GTE)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:988:22: relationalOperators shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOperators_in_relationalExpression4278);
            	    relationalOperators80=relationalOperators();

            	    state._fsp--;

            	    stream_relationalOperators.add(relationalOperators80.getTree());
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4280);
            	    shiftExpression81=shiftExpression();

            	    state._fsp--;

            	    stream_shiftExpression.add(shiftExpression81.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);



            // AST REWRITE
            // elements: shiftExpression, shiftExpression, relationalOperators
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 989:2: -> shiftExpression ( ^( OPERATOR relationalOperators ) shiftExpression )*
            {
                adaptor.addChild(root_0, stream_shiftExpression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:989:21: ( ^( OPERATOR relationalOperators ) shiftExpression )*
                while ( stream_shiftExpression.hasNext()||stream_relationalOperators.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:989:23: ^( OPERATOR relationalOperators )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_relationalOperators.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_shiftExpression.nextTree());

                }
                stream_shiftExpression.reset();
                stream_relationalOperators.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:992:1: relationalExpressionNoIn : shiftExpression ( relationalOperatorsNoIn shiftExpression )* -> shiftExpression ( ^( OPERATOR relationalOperatorsNoIn ) shiftExpression )* ;
    public final JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        JavaScriptParser.relationalExpressionNoIn_return retval = new JavaScriptParser.relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.shiftExpression_return shiftExpression82 = null;

        JavaScriptParser.relationalOperatorsNoIn_return relationalOperatorsNoIn83 = null;

        JavaScriptParser.shiftExpression_return shiftExpression84 = null;


        RewriteRuleSubtreeStream stream_relationalOperatorsNoIn=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperatorsNoIn");
        RewriteRuleSubtreeStream stream_shiftExpression=new RewriteRuleSubtreeStream(adaptor,"rule shiftExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:993:2: ( shiftExpression ( relationalOperatorsNoIn shiftExpression )* -> shiftExpression ( ^( OPERATOR relationalOperatorsNoIn ) shiftExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:993:4: shiftExpression ( relationalOperatorsNoIn shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4312);
            shiftExpression82=shiftExpression();

            state._fsp--;

            stream_shiftExpression.add(shiftExpression82.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:993:20: ( relationalOperatorsNoIn shiftExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==INSTANCEOF||(LA23_0>=LT && LA23_0<=GTE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:993:22: relationalOperatorsNoIn shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOperatorsNoIn_in_relationalExpressionNoIn4316);
            	    relationalOperatorsNoIn83=relationalOperatorsNoIn();

            	    state._fsp--;

            	    stream_relationalOperatorsNoIn.add(relationalOperatorsNoIn83.getTree());
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4318);
            	    shiftExpression84=shiftExpression();

            	    state._fsp--;

            	    stream_shiftExpression.add(shiftExpression84.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);



            // AST REWRITE
            // elements: shiftExpression, shiftExpression, relationalOperatorsNoIn
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 994:2: -> shiftExpression ( ^( OPERATOR relationalOperatorsNoIn ) shiftExpression )*
            {
                adaptor.addChild(root_0, stream_shiftExpression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:994:21: ( ^( OPERATOR relationalOperatorsNoIn ) shiftExpression )*
                while ( stream_shiftExpression.hasNext()||stream_relationalOperatorsNoIn.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:994:23: ^( OPERATOR relationalOperatorsNoIn )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_relationalOperatorsNoIn.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_shiftExpression.nextTree());

                }
                stream_shiftExpression.reset();
                stream_relationalOperatorsNoIn.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpressionNoIn"

    public static class relationalOperators_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOperators"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:997:1: relationalOperators : ( LT | GT | LTE | GTE | INSTANCEOF | IN );
    public final JavaScriptParser.relationalOperators_return relationalOperators() throws RecognitionException {
        JavaScriptParser.relationalOperators_return retval = new JavaScriptParser.relationalOperators_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set85=null;

        CommonTree set85_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:998:2: ( LT | GT | LTE | GTE | INSTANCEOF | IN )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set85=(Token)input.LT(1);
            if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set85));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalOperators"

    public static class relationalOperatorsNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOperatorsNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1000:1: relationalOperatorsNoIn : ( LT | GT | LTE | GTE | INSTANCEOF );
    public final JavaScriptParser.relationalOperatorsNoIn_return relationalOperatorsNoIn() throws RecognitionException {
        JavaScriptParser.relationalOperatorsNoIn_return retval = new JavaScriptParser.relationalOperatorsNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set86=null;

        CommonTree set86_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1001:2: ( LT | GT | LTE | GTE | INSTANCEOF )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set86=(Token)input.LT(1);
            if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set86));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalOperatorsNoIn"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1007:1: equalityExpression : relationalExpression ( equalityOperator relationalExpression )* -> relationalExpression ( ^( OPERATOR equalityOperator ) relationalExpression )* ;
    public final JavaScriptParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JavaScriptParser.equalityExpression_return retval = new JavaScriptParser.equalityExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.relationalExpression_return relationalExpression87 = null;

        JavaScriptParser.equalityOperator_return equalityOperator88 = null;

        JavaScriptParser.relationalExpression_return relationalExpression89 = null;


        RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");
        RewriteRuleSubtreeStream stream_equalityOperator=new RewriteRuleSubtreeStream(adaptor,"rule equalityOperator");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1008:2: ( relationalExpression ( equalityOperator relationalExpression )* -> relationalExpression ( ^( OPERATOR equalityOperator ) relationalExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1008:4: relationalExpression ( equalityOperator relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4410);
            relationalExpression87=relationalExpression();

            state._fsp--;

            stream_relationalExpression.add(relationalExpression87.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1008:25: ( equalityOperator relationalExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=EQ && LA24_0<=NSAME)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1008:27: equalityOperator relationalExpression
            	    {
            	    pushFollow(FOLLOW_equalityOperator_in_equalityExpression4414);
            	    equalityOperator88=equalityOperator();

            	    state._fsp--;

            	    stream_equalityOperator.add(equalityOperator88.getTree());
            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4416);
            	    relationalExpression89=relationalExpression();

            	    state._fsp--;

            	    stream_relationalExpression.add(relationalExpression89.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);



            // AST REWRITE
            // elements: relationalExpression, relationalExpression, equalityOperator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1009:2: -> relationalExpression ( ^( OPERATOR equalityOperator ) relationalExpression )*
            {
                adaptor.addChild(root_0, stream_relationalExpression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1009:26: ( ^( OPERATOR equalityOperator ) relationalExpression )*
                while ( stream_relationalExpression.hasNext()||stream_equalityOperator.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1009:28: ^( OPERATOR equalityOperator )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_equalityOperator.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_relationalExpression.nextTree());

                }
                stream_relationalExpression.reset();
                stream_equalityOperator.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1012:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        JavaScriptParser.equalityExpressionNoIn_return retval = new JavaScriptParser.equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set91=null;
        JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn90 = null;

        JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn92 = null;


        CommonTree set91_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1013:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1013:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4448);
            relationalExpressionNoIn90=relationalExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn90.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1013:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=EQ && LA25_0<=NSAME)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1013:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set91=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set91));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4470);
            	    relationalExpressionNoIn92=relationalExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn92.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpressionNoIn"

    public static class equalityOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityOperator"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1016:1: equalityOperator : ( EQ | NEQ | SAME | NSAME );
    public final JavaScriptParser.equalityOperator_return equalityOperator() throws RecognitionException {
        JavaScriptParser.equalityOperator_return retval = new JavaScriptParser.equalityOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set93=null;

        CommonTree set93_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1017:2: ( EQ | NEQ | SAME | NSAME )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set93=(Token)input.LT(1);
            if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set93));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityOperator"

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseANDExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1023:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        JavaScriptParser.bitwiseANDExpression_return retval = new JavaScriptParser.bitwiseANDExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND95=null;
        JavaScriptParser.equalityExpression_return equalityExpression94 = null;

        JavaScriptParser.equalityExpression_return equalityExpression96 = null;


        CommonTree AND95_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1024:2: ( equalityExpression ( AND equalityExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1024:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4513);
            equalityExpression94=equalityExpression();

            state._fsp--;

            adaptor.addChild(root_0, equalityExpression94.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1024:23: ( AND equalityExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1024:25: AND equalityExpression
            	    {
            	    AND95=(Token)match(input,AND,FOLLOW_AND_in_bitwiseANDExpression4517); 
            	    AND95_tree = (CommonTree)adaptor.create(AND95);
            	    adaptor.addChild(root_0, AND95_tree);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4519);
            	    equalityExpression96=equalityExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityExpression96.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpression"

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseANDExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1027:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseANDExpressionNoIn_return retval = new JavaScriptParser.bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND98=null;
        JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn97 = null;

        JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn99 = null;


        CommonTree AND98_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1028:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1028:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4533);
            equalityExpressionNoIn97=equalityExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn97.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1028:27: ( AND equalityExpressionNoIn )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==AND) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1028:29: AND equalityExpressionNoIn
            	    {
            	    AND98=(Token)match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn4537); 
            	    AND98_tree = (CommonTree)adaptor.create(AND98);
            	    adaptor.addChild(root_0, AND98_tree);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4539);
            	    equalityExpressionNoIn99=equalityExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn99.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpressionNoIn"

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXORExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1031:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        JavaScriptParser.bitwiseXORExpression_return retval = new JavaScriptParser.bitwiseXORExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token XOR101=null;
        JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression100 = null;

        JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression102 = null;


        CommonTree XOR101_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1032:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1032:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4555);
            bitwiseANDExpression100=bitwiseANDExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression100.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1032:25: ( XOR bitwiseANDExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==XOR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1032:27: XOR bitwiseANDExpression
            	    {
            	    XOR101=(Token)match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4559); 
            	    XOR101_tree = (CommonTree)adaptor.create(XOR101);
            	    adaptor.addChild(root_0, XOR101_tree);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4561);
            	    bitwiseANDExpression102=bitwiseANDExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression102.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpression"

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXORExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1035:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseXORExpressionNoIn_return retval = new JavaScriptParser.bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token XOR104=null;
        JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn103 = null;

        JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn105 = null;


        CommonTree XOR104_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1036:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1036:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4577);
            bitwiseANDExpressionNoIn103=bitwiseANDExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn103.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1036:29: ( XOR bitwiseANDExpressionNoIn )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==XOR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1036:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR104=(Token)match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4581); 
            	    XOR104_tree = (CommonTree)adaptor.create(XOR104);
            	    adaptor.addChild(root_0, XOR104_tree);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4583);
            	    bitwiseANDExpressionNoIn105=bitwiseANDExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn105.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpressionNoIn"

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseORExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1039:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final JavaScriptParser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        JavaScriptParser.bitwiseORExpression_return retval = new JavaScriptParser.bitwiseORExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR107=null;
        JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression106 = null;

        JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression108 = null;


        CommonTree OR107_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1040:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1040:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4598);
            bitwiseXORExpression106=bitwiseXORExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression106.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1040:25: ( OR bitwiseXORExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==OR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1040:27: OR bitwiseXORExpression
            	    {
            	    OR107=(Token)match(input,OR,FOLLOW_OR_in_bitwiseORExpression4602); 
            	    OR107_tree = (CommonTree)adaptor.create(OR107);
            	    adaptor.addChild(root_0, OR107_tree);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4604);
            	    bitwiseXORExpression108=bitwiseXORExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression108.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpression"

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseORExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1043:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseORExpressionNoIn_return retval = new JavaScriptParser.bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR110=null;
        JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn109 = null;

        JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn111 = null;


        CommonTree OR110_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1044:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1044:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4619);
            bitwiseXORExpressionNoIn109=bitwiseXORExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn109.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1044:29: ( OR bitwiseXORExpressionNoIn )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==OR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1044:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR110=(Token)match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4623); 
            	    OR110_tree = (CommonTree)adaptor.create(OR110);
            	    adaptor.addChild(root_0, OR110_tree);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4625);
            	    bitwiseXORExpressionNoIn111=bitwiseXORExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn111.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpressionNoIn"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1051:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* -> bitwiseORExpression ( ^( LOGICAL_OPERATOR LAND ) bitwiseORExpression )* ;
    public final JavaScriptParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        JavaScriptParser.logicalANDExpression_return retval = new JavaScriptParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LAND113=null;
        JavaScriptParser.bitwiseORExpression_return bitwiseORExpression112 = null;

        JavaScriptParser.bitwiseORExpression_return bitwiseORExpression114 = null;


        CommonTree LAND113_tree=null;
        RewriteRuleTokenStream stream_LAND=new RewriteRuleTokenStream(adaptor,"token LAND");
        RewriteRuleSubtreeStream stream_bitwiseORExpression=new RewriteRuleSubtreeStream(adaptor,"rule bitwiseORExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1052:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* -> bitwiseORExpression ( ^( LOGICAL_OPERATOR LAND ) bitwiseORExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1052:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4644);
            bitwiseORExpression112=bitwiseORExpression();

            state._fsp--;

            stream_bitwiseORExpression.add(bitwiseORExpression112.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1052:24: ( LAND bitwiseORExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==LAND) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1052:26: LAND bitwiseORExpression
            	    {
            	    LAND113=(Token)match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4648);  
            	    stream_LAND.add(LAND113);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4650);
            	    bitwiseORExpression114=bitwiseORExpression();

            	    state._fsp--;

            	    stream_bitwiseORExpression.add(bitwiseORExpression114.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: bitwiseORExpression, LAND, bitwiseORExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1053:2: -> bitwiseORExpression ( ^( LOGICAL_OPERATOR LAND ) bitwiseORExpression )*
            {
                adaptor.addChild(root_0, stream_bitwiseORExpression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1053:26: ( ^( LOGICAL_OPERATOR LAND ) bitwiseORExpression )*
                while ( stream_LAND.hasNext()||stream_bitwiseORExpression.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1053:28: ^( LOGICAL_OPERATOR LAND )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_LAND.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_bitwiseORExpression.nextTree());

                }
                stream_LAND.reset();
                stream_bitwiseORExpression.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpression"

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1056:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* -> bitwiseORExpressionNoIn ( ^( LOGICAL_OPERATOR LAND ) bitwiseORExpressionNoIn )* ;
    public final JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        JavaScriptParser.logicalANDExpressionNoIn_return retval = new JavaScriptParser.logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LAND116=null;
        JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn115 = null;

        JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn117 = null;


        CommonTree LAND116_tree=null;
        RewriteRuleTokenStream stream_LAND=new RewriteRuleTokenStream(adaptor,"token LAND");
        RewriteRuleSubtreeStream stream_bitwiseORExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule bitwiseORExpressionNoIn");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1057:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* -> bitwiseORExpressionNoIn ( ^( LOGICAL_OPERATOR LAND ) bitwiseORExpressionNoIn )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1057:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4683);
            bitwiseORExpressionNoIn115=bitwiseORExpressionNoIn();

            state._fsp--;

            stream_bitwiseORExpressionNoIn.add(bitwiseORExpressionNoIn115.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1057:28: ( LAND bitwiseORExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==LAND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1057:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND116=(Token)match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4687);  
            	    stream_LAND.add(LAND116);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4689);
            	    bitwiseORExpressionNoIn117=bitwiseORExpressionNoIn();

            	    state._fsp--;

            	    stream_bitwiseORExpressionNoIn.add(bitwiseORExpressionNoIn117.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: bitwiseORExpressionNoIn, LAND, bitwiseORExpressionNoIn
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1058:2: -> bitwiseORExpressionNoIn ( ^( LOGICAL_OPERATOR LAND ) bitwiseORExpressionNoIn )*
            {
                adaptor.addChild(root_0, stream_bitwiseORExpressionNoIn.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1058:29: ( ^( LOGICAL_OPERATOR LAND ) bitwiseORExpressionNoIn )*
                while ( stream_bitwiseORExpressionNoIn.hasNext()||stream_LAND.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1058:31: ^( LOGICAL_OPERATOR LAND )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_LAND.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_bitwiseORExpressionNoIn.nextTree());

                }
                stream_bitwiseORExpressionNoIn.reset();
                stream_LAND.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpressionNoIn"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1061:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* -> logicalANDExpression ( ^( LOGICAL_OPERATOR LOR ) logicalANDExpression )* ;
    public final JavaScriptParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        JavaScriptParser.logicalORExpression_return retval = new JavaScriptParser.logicalORExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOR119=null;
        JavaScriptParser.logicalANDExpression_return logicalANDExpression118 = null;

        JavaScriptParser.logicalANDExpression_return logicalANDExpression120 = null;


        CommonTree LOR119_tree=null;
        RewriteRuleTokenStream stream_LOR=new RewriteRuleTokenStream(adaptor,"token LOR");
        RewriteRuleSubtreeStream stream_logicalANDExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalANDExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1062:2: ( logicalANDExpression ( LOR logicalANDExpression )* -> logicalANDExpression ( ^( LOGICAL_OPERATOR LOR ) logicalANDExpression )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1062:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4722);
            logicalANDExpression118=logicalANDExpression();

            state._fsp--;

            stream_logicalANDExpression.add(logicalANDExpression118.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1062:25: ( LOR logicalANDExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LOR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1062:27: LOR logicalANDExpression
            	    {
            	    LOR119=(Token)match(input,LOR,FOLLOW_LOR_in_logicalORExpression4726);  
            	    stream_LOR.add(LOR119);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4728);
            	    logicalANDExpression120=logicalANDExpression();

            	    state._fsp--;

            	    stream_logicalANDExpression.add(logicalANDExpression120.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);



            // AST REWRITE
            // elements: logicalANDExpression, logicalANDExpression, LOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1063:2: -> logicalANDExpression ( ^( LOGICAL_OPERATOR LOR ) logicalANDExpression )*
            {
                adaptor.addChild(root_0, stream_logicalANDExpression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1063:26: ( ^( LOGICAL_OPERATOR LOR ) logicalANDExpression )*
                while ( stream_logicalANDExpression.hasNext()||stream_LOR.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1063:28: ^( LOGICAL_OPERATOR LOR )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_LOR.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_logicalANDExpression.nextTree());

                }
                stream_logicalANDExpression.reset();
                stream_LOR.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalORExpression"

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1066:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* -> logicalANDExpressionNoIn ( ^( LOGICAL_OPERATOR LOR ) logicalANDExpressionNoIn )* ;
    public final JavaScriptParser.logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.logicalORExpressionNoIn_return retval = new JavaScriptParser.logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOR122=null;
        JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn121 = null;

        JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn123 = null;


        CommonTree LOR122_tree=null;
        RewriteRuleTokenStream stream_LOR=new RewriteRuleTokenStream(adaptor,"token LOR");
        RewriteRuleSubtreeStream stream_logicalANDExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule logicalANDExpressionNoIn");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1067:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* -> logicalANDExpressionNoIn ( ^( LOGICAL_OPERATOR LOR ) logicalANDExpressionNoIn )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1067:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4761);
            logicalANDExpressionNoIn121=logicalANDExpressionNoIn();

            state._fsp--;

            stream_logicalANDExpressionNoIn.add(logicalANDExpressionNoIn121.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1067:29: ( LOR logicalANDExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LOR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1067:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR122=(Token)match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4765);  
            	    stream_LOR.add(LOR122);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4767);
            	    logicalANDExpressionNoIn123=logicalANDExpressionNoIn();

            	    state._fsp--;

            	    stream_logicalANDExpressionNoIn.add(logicalANDExpressionNoIn123.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);



            // AST REWRITE
            // elements: logicalANDExpressionNoIn, LOR, logicalANDExpressionNoIn
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1068:2: -> logicalANDExpressionNoIn ( ^( LOGICAL_OPERATOR LOR ) logicalANDExpressionNoIn )*
            {
                adaptor.addChild(root_0, stream_logicalANDExpressionNoIn.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1068:30: ( ^( LOGICAL_OPERATOR LOR ) logicalANDExpressionNoIn )*
                while ( stream_LOR.hasNext()||stream_logicalANDExpressionNoIn.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1068:32: ^( LOGICAL_OPERATOR LOR )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_LOR.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_logicalANDExpressionNoIn.nextTree());

                }
                stream_LOR.reset();
                stream_logicalANDExpressionNoIn.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalORExpressionNoIn"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1075:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final JavaScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        JavaScriptParser.conditionalExpression_return retval = new JavaScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUE125=null;
        Token COLON127=null;
        JavaScriptParser.logicalORExpression_return logicalORExpression124 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression126 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression128 = null;


        CommonTree QUE125_tree=null;
        CommonTree COLON127_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1076:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1076:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4804);
            logicalORExpression124=logicalORExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicalORExpression124.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1076:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==QUE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1076:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE125=(Token)match(input,QUE,FOLLOW_QUE_in_conditionalExpression4808); 
                    QUE125_tree = (CommonTree)adaptor.create(QUE125);
                    adaptor.addChild(root_0, QUE125_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4810);
                    assignmentExpression126=assignmentExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpression126.getTree());
                    COLON127=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression4812); 
                    COLON127_tree = (CommonTree)adaptor.create(COLON127);
                    adaptor.addChild(root_0, COLON127_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4814);
                    assignmentExpression128=assignmentExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpression128.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1079:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final JavaScriptParser.conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        JavaScriptParser.conditionalExpressionNoIn_return retval = new JavaScriptParser.conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUE130=null;
        Token COLON132=null;
        JavaScriptParser.logicalORExpressionNoIn_return logicalORExpressionNoIn129 = null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn131 = null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn133 = null;


        CommonTree QUE130_tree=null;
        CommonTree COLON132_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1080:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1080:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4828);
            logicalORExpressionNoIn129=logicalORExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn129.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1080:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==QUE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1080:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE130=(Token)match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4832); 
                    QUE130_tree = (CommonTree)adaptor.create(QUE130);
                    adaptor.addChild(root_0, QUE130_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4834);
                    assignmentExpressionNoIn131=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn131.getTree());
                    COLON132=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4836); 
                    COLON132_tree = (CommonTree)adaptor.create(COLON132);
                    adaptor.addChild(root_0, COLON132_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4838);
                    assignmentExpressionNoIn133=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn133.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalExpressionNoIn"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1109:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? -> conditionalExpression ( ^( OPERATOR assignmentOperator ) assignmentExpression )? ;
    public final JavaScriptParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        JavaScriptParser.assignmentExpression_return retval = new JavaScriptParser.assignmentExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.conditionalExpression_return lhs = null;

        JavaScriptParser.assignmentOperator_return assignmentOperator134 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression135 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");

        	Object[] isLhs = new Object[1];

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1114:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? -> conditionalExpression ( ^( OPERATOR assignmentOperator ) assignmentExpression )? )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1114:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4866);
            lhs=conditionalExpression();

            state._fsp--;

            stream_conditionalExpression.add(lhs.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1115:2: ({...}? assignmentOperator assignmentExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=ASSIGN && LA38_0<=XORASS)||LA38_0==DIVASS) ) {
                int LA38_1 = input.LA(2);

                if ( (( isLeftHandSideAssign(lhs, isLhs) )) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1115:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4873);
                    assignmentOperator134=assignmentOperator();

                    state._fsp--;

                    stream_assignmentOperator.add(assignmentOperator134.getTree());
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4875);
                    assignmentExpression135=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(assignmentExpression135.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: conditionalExpression, assignmentOperator, assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1116:2: -> conditionalExpression ( ^( OPERATOR assignmentOperator ) assignmentExpression )?
            {
                adaptor.addChild(root_0, stream_conditionalExpression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1117:2: ( ^( OPERATOR assignmentOperator ) assignmentExpression )?
                if ( stream_assignmentOperator.hasNext()||stream_assignmentExpression.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1117:4: ^( OPERATOR assignmentOperator )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_assignmentOperator.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_assignmentExpression.nextTree());

                }
                stream_assignmentOperator.reset();
                stream_assignmentExpression.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOperator"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1120:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final JavaScriptParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JavaScriptParser.assignmentOperator_return retval = new JavaScriptParser.assignmentOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set136=null;

        CommonTree set136_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1121:2: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set136=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set136));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1125:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        JavaScriptParser.assignmentExpressionNoIn_return retval = new JavaScriptParser.assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.conditionalExpressionNoIn_return lhs = null;

        JavaScriptParser.assignmentOperator_return assignmentOperator137 = null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn138 = null;




        	Object[] isLhs = new Object[1];

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1130:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1130:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4971);
            lhs=conditionalExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1131:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=ASSIGN && LA39_0<=XORASS)||LA39_0==DIVASS) ) {
                int LA39_1 = input.LA(2);

                if ( (( isLeftHandSideAssign(lhs, isLhs) )) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1131:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4978);
                    assignmentOperator137=assignmentOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentOperator137.getTree());
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4980);
                    assignmentExpressionNoIn138=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn138.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentExpressionNoIn"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1138:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final JavaScriptParser.expression_return expression() throws RecognitionException {
        JavaScriptParser.expression_return retval = new JavaScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA139=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        CommonTree COMMA139_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1139:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1139:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5002);
            exprs=assignmentExpression();

            state._fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTree());

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1139:32: ( COMMA exprs+= assignmentExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1139:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression5006);  
            	    stream_COMMA.add(COMMA139);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5010);
            	    exprs=assignmentExpression();

            	    state._fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTree());


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);



            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (CommonTree)adaptor.nil();
            // 1140:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1140:28: ^( CEXPR ( $exprs)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprs.nextTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1141:2: -> $exprs
            {
                adaptor.addChild(root_0, stream_exprs.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1144:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final JavaScriptParser.expressionNoIn_return expressionNoIn() throws RecognitionException {
        JavaScriptParser.expressionNoIn_return retval = new JavaScriptParser.expressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA140=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        CommonTree COMMA140_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1145:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1145:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5047);
            exprs=assignmentExpressionNoIn();

            state._fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTree());

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1145:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1145:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA140=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5051);  
            	    stream_COMMA.add(COMMA140);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5055);
            	    exprs=assignmentExpressionNoIn();

            	    state._fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTree());


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);



            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (CommonTree)adaptor.nil();
            // 1146:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1146:28: ^( CEXPR ( $exprs)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprs.nextTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1147:2: -> $exprs
            {
                adaptor.addChild(root_0, stream_exprs.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionNoIn"

    public static class semic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "semic"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1172:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final JavaScriptParser.semic_return semic() throws RecognitionException {
        JavaScriptParser.semic_return retval = new JavaScriptParser.semic_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMIC141=null;
        Token EOF142=null;
        Token RBRACE143=null;
        Token EOL144=null;
        Token MultiLineComment145=null;

        CommonTree SEMIC141_tree=null;
        CommonTree EOF142_tree=null;
        CommonTree RBRACE143_tree=null;
        CommonTree EOL144_tree=null;
        CommonTree MultiLineComment145_tree=null;


            // Promote EOL if appropriate   
            promoteEOL(retval);

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1178:5: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt42=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt42=1;
                }
                break;
            case EOF:
                {
                alt42=2;
                }
                break;
            case RBRACE:
                {
                alt42=3;
                }
                break;
            case EOL:
                {
                alt42=4;
                }
                break;
            case MultiLineComment:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1178:7: SEMIC
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMIC141=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_semic5109); 
                    SEMIC141_tree = (CommonTree)adaptor.create(SEMIC141);
                    adaptor.addChild(root_0, SEMIC141_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1179:7: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF142=(Token)match(input,EOF,FOLLOW_EOF_in_semic5117); 
                    EOF142_tree = (CommonTree)adaptor.create(EOF142);
                    adaptor.addChild(root_0, EOF142_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1180:7: RBRACE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                     int pos = input.index(); 
                    RBRACE143=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_semic5127); 
                    RBRACE143_tree = (CommonTree)adaptor.create(RBRACE143);
                    adaptor.addChild(root_0, RBRACE143_tree);

                     input.seek(pos); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1181:7: EOL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOL144=(Token)match(input,EOL,FOLLOW_EOL_in_semic5137); 
                    EOL144_tree = (CommonTree)adaptor.create(EOL144);
                    adaptor.addChild(root_0, EOL144_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1181:13: MultiLineComment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MultiLineComment145=(Token)match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5141); 
                    MultiLineComment145_tree = (CommonTree)adaptor.create(MultiLineComment145);
                    adaptor.addChild(root_0, MultiLineComment145_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "semic"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1189:1: statement options {k=1; } : ({...}? block | statementTail );
    public final JavaScriptParser.statement_return statement() throws RecognitionException {
        JavaScriptParser.statement_return retval = new JavaScriptParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.block_return block146 = null;

        JavaScriptParser.statementTail_return statementTail147 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1194:2: ({...}? block | statementTail )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1194:4: {...}? block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    if ( !(( input.LA(1) == LBRACE )) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5173);
                    block146=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block146.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1195:4: statementTail
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5178);
                    statementTail147=statementTail();

                    state._fsp--;

                    adaptor.addChild(root_0, statementTail147.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementTail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementTail"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1198:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );
    public final JavaScriptParser.statementTail_return statementTail() throws RecognitionException {
        JavaScriptParser.statementTail_return retval = new JavaScriptParser.statementTail_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.variableStatement_return variableStatement148 = null;

        JavaScriptParser.emptyStatement_return emptyStatement149 = null;

        JavaScriptParser.expressionStatement_return expressionStatement150 = null;

        JavaScriptParser.ifStatement_return ifStatement151 = null;

        JavaScriptParser.iterationStatement_return iterationStatement152 = null;

        JavaScriptParser.continueStatement_return continueStatement153 = null;

        JavaScriptParser.breakStatement_return breakStatement154 = null;

        JavaScriptParser.returnStatement_return returnStatement155 = null;

        JavaScriptParser.withStatement_return withStatement156 = null;

        JavaScriptParser.labelledStatement_return labelledStatement157 = null;

        JavaScriptParser.switchStatement_return switchStatement158 = null;

        JavaScriptParser.throwStatement_return throwStatement159 = null;

        JavaScriptParser.tryStatement_return tryStatement160 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1199:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement )
            int alt44=13;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1199:4: variableStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5190);
                    variableStatement148=variableStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, variableStatement148.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1200:4: emptyStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5195);
                    emptyStatement149=emptyStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, emptyStatement149.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1201:4: expressionStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5200);
                    expressionStatement150=expressionStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionStatement150.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1202:4: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5205);
                    ifStatement151=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement151.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1203:4: iterationStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5210);
                    iterationStatement152=iterationStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, iterationStatement152.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1204:4: continueStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5215);
                    continueStatement153=continueStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, continueStatement153.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1205:4: breakStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5220);
                    breakStatement154=breakStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, breakStatement154.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1206:4: returnStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5225);
                    returnStatement155=returnStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, returnStatement155.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1207:4: withStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5230);
                    withStatement156=withStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, withStatement156.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1208:4: labelledStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5235);
                    labelledStatement157=labelledStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, labelledStatement157.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1209:4: switchStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5240);
                    switchStatement158=switchStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, switchStatement158.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1210:4: throwStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5245);
                    throwStatement159=throwStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, throwStatement159.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1211:4: tryStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5250);
                    tryStatement160=tryStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, tryStatement160.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementTail"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1216:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK_SCOPE ^( SEPARATOR LBRACE ) ( statement )* ^( SEPARATOR RBRACE ) ) ;
    public final JavaScriptParser.block_return block() throws RecognitionException {
        JavaScriptParser.block_return retval = new JavaScriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lb=null;
        Token RBRACE162=null;
        JavaScriptParser.statement_return statement161 = null;


        CommonTree lb_tree=null;
        CommonTree RBRACE162_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1217:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK_SCOPE ^( SEPARATOR LBRACE ) ( statement )* ^( SEPARATOR RBRACE ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1217:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block5265);  
            stream_LBRACE.add(lb);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1217:14: ( statement )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=NULL && LA45_0<=BREAK)||LA45_0==CONTINUE||(LA45_0>=DELETE && LA45_0<=DO)||(LA45_0>=FOR && LA45_0<=IF)||(LA45_0>=NEW && LA45_0<=WITH)||LA45_0==LBRACE||LA45_0==LPAREN||LA45_0==LBRACK||LA45_0==SEMIC||(LA45_0>=ADD && LA45_0<=SUB)||(LA45_0>=INC && LA45_0<=DEC)||(LA45_0>=NOT && LA45_0<=INV)||(LA45_0>=Identifier && LA45_0<=StringLiteral)||LA45_0==RegularExpressionLiteral||(LA45_0>=DecimalLiteral && LA45_0<=HexIntegerLiteral)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1217:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5267);
            	    statement161=statement();

            	    state._fsp--;

            	    stream_statement.add(statement161.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            RBRACE162=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block5270);  
            stream_RBRACE.add(RBRACE162);



            // AST REWRITE
            // elements: RBRACE, statement, LBRACE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1218:2: -> ^( BLOCK_SCOPE ^( SEPARATOR LBRACE ) ( statement )* ^( SEPARATOR RBRACE ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1218:5: ^( BLOCK_SCOPE ^( SEPARATOR LBRACE ) ( statement )* ^( SEPARATOR RBRACE ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1218:19: ^( SEPARATOR LBRACE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LBRACE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1218:39: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1218:50: ^( SEPARATOR RBRACE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RBRACE.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class variableStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1225:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) variableDeclaration ( ^( SEPARATOR COMMA ) variableDeclaration )* ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.variableStatement_return variableStatement() throws RecognitionException {
        JavaScriptParser.variableStatement_return retval = new JavaScriptParser.variableStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR163=null;
        Token COMMA165=null;
        JavaScriptParser.variableDeclaration_return variableDeclaration164 = null;

        JavaScriptParser.variableDeclaration_return variableDeclaration166 = null;

        JavaScriptParser.semic_return semic167 = null;


        CommonTree VAR163_tree=null;
        CommonTree COMMA165_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1226:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) variableDeclaration ( ^( SEPARATOR COMMA ) variableDeclaration )* ^( SEPARATOR semic ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1226:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR163=(Token)match(input,VAR,FOLLOW_VAR_in_variableStatement5308);  
            stream_VAR.add(VAR163);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5310);
            variableDeclaration164=variableDeclaration();

            state._fsp--;

            stream_variableDeclaration.add(variableDeclaration164.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1226:28: ( COMMA variableDeclaration )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1226:30: COMMA variableDeclaration
            	    {
            	    COMMA165=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableStatement5314);  
            	    stream_COMMA.add(COMMA165);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5316);
            	    variableDeclaration166=variableDeclaration();

            	    state._fsp--;

            	    stream_variableDeclaration.add(variableDeclaration166.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5321);
            semic167=semic();

            state._fsp--;

            stream_semic.add(semic167.getTree());


            // AST REWRITE
            // elements: semic, variableDeclaration, variableDeclaration, VAR, COMMA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1227:2: -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) variableDeclaration ( ^( SEPARATOR COMMA ) variableDeclaration )* ^( SEPARATOR semic ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1227:5: ^( VAR_DECL_PARENT ^( KEYWORD VAR ) variableDeclaration ( ^( SEPARATOR COMMA ) variableDeclaration )* ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL_PARENT, "VAR_DECL_PARENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1227:23: ^( KEYWORD VAR )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_VAR.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_variableDeclaration.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1227:58: ( ^( SEPARATOR COMMA ) variableDeclaration )*
                while ( stream_variableDeclaration.hasNext()||stream_COMMA.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1227:59: ^( SEPARATOR COMMA )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                    adaptor.addChild(root_2, stream_COMMA.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }
                    adaptor.addChild(root_1, stream_variableDeclaration.nextTree());

                }
                stream_variableDeclaration.reset();
                stream_COMMA.reset();
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1227:101: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableStatement"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1230:1: variableDeclaration : Identifier ( ASSIGN assignmentExpression )? -> ^( VAR_DECL ^( NAME Identifier ) ^( TYPE EMPTY ) ) ( ^( OPERATOR ASSIGN ) assignmentExpression )? ;
    public final JavaScriptParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        JavaScriptParser.variableDeclaration_return retval = new JavaScriptParser.variableDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier168=null;
        Token ASSIGN169=null;
        JavaScriptParser.assignmentExpression_return assignmentExpression170 = null;


        CommonTree Identifier168_tree=null;
        CommonTree ASSIGN169_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1231:2: ( Identifier ( ASSIGN assignmentExpression )? -> ^( VAR_DECL ^( NAME Identifier ) ^( TYPE EMPTY ) ) ( ^( OPERATOR ASSIGN ) assignmentExpression )? )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1231:4: Identifier ( ASSIGN assignmentExpression )?
            {
            Identifier168=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration5365);  
            stream_Identifier.add(Identifier168);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1231:15: ( ASSIGN assignmentExpression )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ASSIGN) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1231:17: ASSIGN assignmentExpression
                    {
                    ASSIGN169=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5369);  
                    stream_ASSIGN.add(ASSIGN169);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5371);
                    assignmentExpression170=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(assignmentExpression170.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: assignmentExpression, Identifier, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1232:2: -> ^( VAR_DECL ^( NAME Identifier ) ^( TYPE EMPTY ) ) ( ^( OPERATOR ASSIGN ) assignmentExpression )?
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1232:5: ^( VAR_DECL ^( NAME Identifier ) ^( TYPE EMPTY ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1232:16: ^( NAME Identifier )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_Identifier.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1232:35: ^( TYPE EMPTY )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(EMPTY, "EMPTY"));

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1232:50: ( ^( OPERATOR ASSIGN ) assignmentExpression )?
                if ( stream_assignmentExpression.hasNext()||stream_ASSIGN.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1232:51: ^( OPERATOR ASSIGN )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_ASSIGN.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_assignmentExpression.nextTree());

                }
                stream_assignmentExpression.reset();
                stream_ASSIGN.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarationNoIn"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1235:1: variableDeclarationNoIn : Identifier ( ASSIGN assignmentExpressionNoIn )? -> ^( VAR_DECL ^( NAME Identifier ) ^( TYPE EMPTY ) ) ( ^( OPERATOR ASSIGN ) assignmentExpressionNoIn )? ;
    public final JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        JavaScriptParser.variableDeclarationNoIn_return retval = new JavaScriptParser.variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier171=null;
        Token ASSIGN172=null;
        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn173 = null;


        CommonTree Identifier171_tree=null;
        CommonTree ASSIGN172_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1236:2: ( Identifier ( ASSIGN assignmentExpressionNoIn )? -> ^( VAR_DECL ^( NAME Identifier ) ^( TYPE EMPTY ) ) ( ^( OPERATOR ASSIGN ) assignmentExpressionNoIn )? )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1236:4: Identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            Identifier171=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn5417);  
            stream_Identifier.add(Identifier171);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1236:15: ( ASSIGN assignmentExpressionNoIn )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ASSIGN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1236:17: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN172=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5421);  
                    stream_ASSIGN.add(ASSIGN172);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5423);
                    assignmentExpressionNoIn173=assignmentExpressionNoIn();

                    state._fsp--;

                    stream_assignmentExpressionNoIn.add(assignmentExpressionNoIn173.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: Identifier, ASSIGN, assignmentExpressionNoIn
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1237:2: -> ^( VAR_DECL ^( NAME Identifier ) ^( TYPE EMPTY ) ) ( ^( OPERATOR ASSIGN ) assignmentExpressionNoIn )?
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1237:5: ^( VAR_DECL ^( NAME Identifier ) ^( TYPE EMPTY ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1237:16: ^( NAME Identifier )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_Identifier.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1237:35: ^( TYPE EMPTY )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(EMPTY, "EMPTY"));

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1237:50: ( ^( OPERATOR ASSIGN ) assignmentExpressionNoIn )?
                if ( stream_ASSIGN.hasNext()||stream_assignmentExpressionNoIn.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1237:51: ^( OPERATOR ASSIGN )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                    adaptor.addChild(root_1, stream_ASSIGN.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_assignmentExpressionNoIn.nextTree());

                }
                stream_ASSIGN.reset();
                stream_assignmentExpressionNoIn.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarationNoIn"

    public static class emptyStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emptyStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1244:1: emptyStatement : SEMIC ;
    public final JavaScriptParser.emptyStatement_return emptyStatement() throws RecognitionException {
        JavaScriptParser.emptyStatement_return retval = new JavaScriptParser.emptyStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMIC174=null;

        CommonTree SEMIC174_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1245:2: ( SEMIC )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1245:4: SEMIC
            {
            root_0 = (CommonTree)adaptor.nil();

            SEMIC174=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5473); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "emptyStatement"

    public static class expressionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1258:1: expressionStatement : expression semic -> expression ^( SEPARATOR semic ) ;
    public final JavaScriptParser.expressionStatement_return expressionStatement() throws RecognitionException {
        JavaScriptParser.expressionStatement_return retval = new JavaScriptParser.expressionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.expression_return expression175 = null;

        JavaScriptParser.semic_return semic176 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1259:2: ( expression semic -> expression ^( SEPARATOR semic ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1259:4: expression semic
            {
            pushFollow(FOLLOW_expression_in_expressionStatement5492);
            expression175=expression();

            state._fsp--;

            stream_expression.add(expression175.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5494);
            semic176=semic();

            state._fsp--;

            stream_semic.add(semic176.getTree());


            // AST REWRITE
            // elements: semic, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1260:2: -> expression ^( SEPARATOR semic )
            {
                adaptor.addChild(root_0, stream_expression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1260:16: ^( SEPARATOR semic )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_semic.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1267:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement ) ( ^( BRANCH ^( KEYWORD ELSE ) statement ) )? ) ;
    public final JavaScriptParser.ifStatement_return ifStatement() throws RecognitionException {
        JavaScriptParser.ifStatement_return retval = new JavaScriptParser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF177=null;
        Token LPAREN178=null;
        Token RPAREN180=null;
        Token ELSE182=null;
        JavaScriptParser.expression_return expression179 = null;

        JavaScriptParser.statement_return statement181 = null;

        JavaScriptParser.statement_return statement183 = null;


        CommonTree IF177_tree=null;
        CommonTree LPAREN178_tree=null;
        CommonTree RPAREN180_tree=null;
        CommonTree ELSE182_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1269:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement ) ( ^( BRANCH ^( KEYWORD ELSE ) statement ) )? ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1269:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF177=(Token)match(input,IF,FOLLOW_IF_in_ifStatement5522);  
            stream_IF.add(IF177);

            LPAREN178=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5524);  
            stream_LPAREN.add(LPAREN178);

            pushFollow(FOLLOW_expression_in_ifStatement5526);
            expression179=expression();

            state._fsp--;

            stream_expression.add(expression179.getTree());
            RPAREN180=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5528);  
            stream_RPAREN.add(RPAREN180);

            pushFollow(FOLLOW_statement_in_ifStatement5530);
            statement181=statement();

            state._fsp--;

            stream_statement.add(statement181.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1269:42: ({...}? ELSE statement )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ELSE) ) {
                int LA49_1 = input.LA(2);

                if ( (( input.LA(1) == ELSE )) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1269:44: {...}? ELSE statement
                    {
                    if ( !(( input.LA(1) == ELSE )) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE182=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement5536);  
                    stream_ELSE.add(ELSE182);

                    pushFollow(FOLLOW_statement_in_ifStatement5538);
                    statement183=statement();

                    state._fsp--;

                    stream_statement.add(statement183.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: statement, expression, LPAREN, statement, ELSE, RPAREN, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1270:2: -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement ) ( ^( BRANCH ^( KEYWORD ELSE ) statement ) )? )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:5: ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement ) ( ^( BRANCH ^( KEYWORD ELSE ) statement ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:25: ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:35: ^( KEYWORD IF )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_3);

                adaptor.addChild(root_3, stream_IF.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:51: ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_3);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:64: ^( SEPARATOR LPAREN )
                {
                CommonTree root_4 = (CommonTree)adaptor.nil();
                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_4);

                adaptor.addChild(root_4, stream_LPAREN.nextNode());

                adaptor.addChild(root_3, root_4);
                }
                adaptor.addChild(root_3, stream_expression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:95: ^( SEPARATOR RPAREN )
                {
                CommonTree root_4 = (CommonTree)adaptor.nil();
                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_4);

                adaptor.addChild(root_4, stream_RPAREN.nextNode());

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:130: ( ^( BRANCH ^( KEYWORD ELSE ) statement ) )?
                if ( stream_statement.hasNext()||stream_ELSE.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:130: ^( BRANCH ^( KEYWORD ELSE ) statement )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1270:140: ^( KEYWORD ELSE )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_3);

                    adaptor.addChild(root_3, stream_ELSE.nextNode());

                    adaptor.addChild(root_2, root_3);
                    }
                    adaptor.addChild(root_2, stream_statement.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_statement.reset();
                stream_ELSE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class iterationStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterationStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1277:1: iterationStatement : ( doStatement | whileStatement | forStatement );
    public final JavaScriptParser.iterationStatement_return iterationStatement() throws RecognitionException {
        JavaScriptParser.iterationStatement_return retval = new JavaScriptParser.iterationStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.doStatement_return doStatement184 = null;

        JavaScriptParser.whileStatement_return whileStatement185 = null;

        JavaScriptParser.forStatement_return forStatement186 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1278:2: ( doStatement | whileStatement | forStatement )
            int alt50=3;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt50=1;
                }
                break;
            case WHILE:
                {
                alt50=2;
                }
                break;
            case FOR:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1278:4: doStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement5620);
                    doStatement184=doStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, doStatement184.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1279:4: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement5625);
                    whileStatement185=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement185.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1280:4: forStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement5630);
                    forStatement186=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement186.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iterationStatement"

    public static class doStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1283:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( LOOP_STATEMENT ^( KEYWORD DO ) statement ^( CONDITION ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.doStatement_return doStatement() throws RecognitionException {
        JavaScriptParser.doStatement_return retval = new JavaScriptParser.doStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DO187=null;
        Token WHILE189=null;
        Token LPAREN190=null;
        Token RPAREN192=null;
        JavaScriptParser.statement_return statement188 = null;

        JavaScriptParser.expression_return expression191 = null;

        JavaScriptParser.semic_return semic193 = null;


        CommonTree DO187_tree=null;
        CommonTree WHILE189_tree=null;
        CommonTree LPAREN190_tree=null;
        CommonTree RPAREN192_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1284:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( LOOP_STATEMENT ^( KEYWORD DO ) statement ^( CONDITION ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( SEPARATOR semic ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1284:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO187=(Token)match(input,DO,FOLLOW_DO_in_doStatement5642);  
            stream_DO.add(DO187);

            pushFollow(FOLLOW_statement_in_doStatement5644);
            statement188=statement();

            state._fsp--;

            stream_statement.add(statement188.getTree());
            WHILE189=(Token)match(input,WHILE,FOLLOW_WHILE_in_doStatement5646);  
            stream_WHILE.add(WHILE189);

            LPAREN190=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doStatement5648);  
            stream_LPAREN.add(LPAREN190);

            pushFollow(FOLLOW_expression_in_doStatement5650);
            expression191=expression();

            state._fsp--;

            stream_expression.add(expression191.getTree());
            RPAREN192=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doStatement5652);  
            stream_RPAREN.add(RPAREN192);

            pushFollow(FOLLOW_semic_in_doStatement5654);
            semic193=semic();

            state._fsp--;

            stream_semic.add(semic193.getTree());


            // AST REWRITE
            // elements: RPAREN, WHILE, statement, LPAREN, expression, semic, DO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1285:2: -> ^( LOOP_STATEMENT ^( KEYWORD DO ) statement ^( CONDITION ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( SEPARATOR semic ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1285:5: ^( LOOP_STATEMENT ^( KEYWORD DO ) statement ^( CONDITION ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1285:23: ^( KEYWORD DO )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_DO.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_statement.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1285:49: ^( CONDITION ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1285:62: ^( KEYWORD WHILE )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_3);

                adaptor.addChild(root_3, stream_WHILE.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1285:81: ^( SEPARATOR LPAREN )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                adaptor.addChild(root_3, stream_LPAREN.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_expression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1285:112: ^( SEPARATOR RPAREN )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                adaptor.addChild(root_3, stream_RPAREN.nextNode());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1285:134: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1288:1: whileStatement : WHILE LPAREN expression RPAREN statement -> ^( LOOP_STATEMENT ^( KEYWORD WHILE ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement ) ;
    public final JavaScriptParser.whileStatement_return whileStatement() throws RecognitionException {
        JavaScriptParser.whileStatement_return retval = new JavaScriptParser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE194=null;
        Token LPAREN195=null;
        Token RPAREN197=null;
        JavaScriptParser.expression_return expression196 = null;

        JavaScriptParser.statement_return statement198 = null;


        CommonTree WHILE194_tree=null;
        CommonTree LPAREN195_tree=null;
        CommonTree RPAREN197_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1289:2: ( WHILE LPAREN expression RPAREN statement -> ^( LOOP_STATEMENT ^( KEYWORD WHILE ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1289:4: WHILE LPAREN expression RPAREN statement
            {
            WHILE194=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement5718);  
            stream_WHILE.add(WHILE194);

            LPAREN195=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement5720);  
            stream_LPAREN.add(LPAREN195);

            pushFollow(FOLLOW_expression_in_whileStatement5722);
            expression196=expression();

            state._fsp--;

            stream_expression.add(expression196.getTree());
            RPAREN197=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement5724);  
            stream_RPAREN.add(RPAREN197);

            pushFollow(FOLLOW_statement_in_whileStatement5726);
            statement198=statement();

            state._fsp--;

            stream_statement.add(statement198.getTree());


            // AST REWRITE
            // elements: expression, RPAREN, WHILE, statement, LPAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1290:2: -> ^( LOOP_STATEMENT ^( KEYWORD WHILE ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1290:5: ^( LOOP_STATEMENT ^( KEYWORD WHILE ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) statement )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1290:23: ^( KEYWORD WHILE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_WHILE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1290:42: ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1290:55: ^( SEPARATOR LPAREN )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                adaptor.addChild(root_3, stream_LPAREN.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_expression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1290:86: ^( SEPARATOR RPAREN )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                adaptor.addChild(root_3, stream_RPAREN.nextNode());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class forStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1334:1: forStatement : FOR LPAREN forControl RPAREN statement -> ^( LOOP_STATEMENT ^( KEYWORD FOR ) ^( CONDITION ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) ) statement ) ;
    public final JavaScriptParser.forStatement_return forStatement() throws RecognitionException {
        JavaScriptParser.forStatement_return retval = new JavaScriptParser.forStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOR199=null;
        Token LPAREN200=null;
        Token RPAREN202=null;
        JavaScriptParser.forControl_return forControl201 = null;

        JavaScriptParser.statement_return statement203 = null;


        CommonTree FOR199_tree=null;
        CommonTree LPAREN200_tree=null;
        CommonTree RPAREN202_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forControl=new RewriteRuleSubtreeStream(adaptor,"rule forControl");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1335:2: ( FOR LPAREN forControl RPAREN statement -> ^( LOOP_STATEMENT ^( KEYWORD FOR ) ^( CONDITION ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) ) statement ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1335:4: FOR LPAREN forControl RPAREN statement
            {
            FOR199=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement5778);  
            stream_FOR.add(FOR199);

            LPAREN200=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStatement5780);  
            stream_LPAREN.add(LPAREN200);

            pushFollow(FOLLOW_forControl_in_forStatement5782);
            forControl201=forControl();

            state._fsp--;

            stream_forControl.add(forControl201.getTree());
            RPAREN202=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStatement5784);  
            stream_RPAREN.add(RPAREN202);

            pushFollow(FOLLOW_statement_in_forStatement5786);
            statement203=statement();

            state._fsp--;

            stream_statement.add(statement203.getTree());


            // AST REWRITE
            // elements: statement, LPAREN, forControl, RPAREN, FOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1337:2: -> ^( LOOP_STATEMENT ^( KEYWORD FOR ) ^( CONDITION ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) ) statement )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1337:5: ^( LOOP_STATEMENT ^( KEYWORD FOR ) ^( CONDITION ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) ) statement )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1337:23: ^( KEYWORD FOR )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_FOR.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1337:40: ^( CONDITION ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1337:53: ^( SEPARATOR LPAREN )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                adaptor.addChild(root_3, stream_LPAREN.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_forControl.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1337:84: ^( SEPARATOR RPAREN )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                adaptor.addChild(root_3, stream_RPAREN.nextNode());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class forControl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControl"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1340:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final JavaScriptParser.forControl_return forControl() throws RecognitionException {
        JavaScriptParser.forControl_return retval = new JavaScriptParser.forControl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.forControlVar_return forControlVar204 = null;

        JavaScriptParser.forControlExpression_return forControlExpression205 = null;

        JavaScriptParser.forControlSemic_return forControlSemic206 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1341:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt51=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt51=1;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case DELETE:
            case FUNCTION:
            case NEW:
            case THIS:
            case TYPEOF:
            case VOID:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt51=2;
                }
                break;
            case SEMIC:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1341:4: forControlVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl5836);
                    forControlVar204=forControlVar();

                    state._fsp--;

                    adaptor.addChild(root_0, forControlVar204.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1342:4: forControlExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl5841);
                    forControlExpression205=forControlExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, forControlExpression205.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1343:4: forControlSemic
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl5846);
                    forControlSemic206=forControlSemic();

                    state._fsp--;

                    adaptor.addChild(root_0, forControlSemic206.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControl"

    public static class forControlVar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlVar"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1346:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( KEYWORD VAR ) variableDeclarationNoIn ^( KEYWORD IN ) expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ( $ex1)? ^( SEPARATOR SEMIC ) ( $ex2)? ) ) ;
    public final JavaScriptParser.forControlVar_return forControlVar() throws RecognitionException {
        JavaScriptParser.forControlVar_return retval = new JavaScriptParser.forControlVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR207=null;
        Token IN209=null;
        Token COMMA211=null;
        Token SEMIC213=null;
        Token SEMIC214=null;
        JavaScriptParser.expression_return ex1 = null;

        JavaScriptParser.expression_return ex2 = null;

        JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn208 = null;

        JavaScriptParser.expression_return expression210 = null;

        JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn212 = null;


        CommonTree VAR207_tree=null;
        CommonTree IN209_tree=null;
        CommonTree COMMA211_tree=null;
        CommonTree SEMIC213_tree=null;
        CommonTree SEMIC214_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1347:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( KEYWORD VAR ) variableDeclarationNoIn ^( KEYWORD IN ) expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ( $ex1)? ^( SEPARATOR SEMIC ) ( $ex2)? ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1347:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( KEYWORD VAR ) variableDeclarationNoIn ^( KEYWORD IN ) expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ( $ex1)? ^( SEPARATOR SEMIC ) ( $ex2)? ) )
            {
            VAR207=(Token)match(input,VAR,FOLLOW_VAR_in_forControlVar5857);  
            stream_VAR.add(VAR207);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5859);
            variableDeclarationNoIn208=variableDeclarationNoIn();

            state._fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn208.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1348:2: ( ( IN expression -> ^( KEYWORD VAR ) variableDeclarationNoIn ^( KEYWORD IN ) expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ( $ex1)? ^( SEPARATOR SEMIC ) ( $ex2)? ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IN) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=SEMIC && LA55_0<=COMMA)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1349:3: ( IN expression -> ^( KEYWORD VAR ) variableDeclarationNoIn ^( KEYWORD IN ) expression )
                    {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1349:3: ( IN expression -> ^( KEYWORD VAR ) variableDeclarationNoIn ^( KEYWORD IN ) expression )
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1350:4: IN expression
                    {
                    IN209=(Token)match(input,IN,FOLLOW_IN_in_forControlVar5871);  
                    stream_IN.add(IN209);

                    pushFollow(FOLLOW_expression_in_forControlVar5873);
                    expression210=expression();

                    state._fsp--;

                    stream_expression.add(expression210.getTree());


                    // AST REWRITE
                    // elements: variableDeclarationNoIn, IN, VAR, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1352:4: -> ^( KEYWORD VAR ) variableDeclarationNoIn ^( KEYWORD IN ) expression
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1352:7: ^( KEYWORD VAR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                        adaptor.addChild(root_1, stream_VAR.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_variableDeclarationNoIn.nextTree());
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1352:46: ^( KEYWORD IN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                        adaptor.addChild(root_1, stream_IN.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1355:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ( $ex1)? ^( SEPARATOR SEMIC ) ( $ex2)? )
                    {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1355:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ( $ex1)? ^( SEPARATOR SEMIC ) ( $ex2)? )
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1356:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1356:4: ( COMMA variableDeclarationNoIn )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==COMMA) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1356:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA211=(Token)match(input,COMMA,FOLLOW_COMMA_in_forControlVar5917);  
                    	    stream_COMMA.add(COMMA211);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5919);
                    	    variableDeclarationNoIn212=variableDeclarationNoIn();

                    	    state._fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn212.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    SEMIC213=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5924);  
                    stream_SEMIC.add(SEMIC213);

                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1356:48: (ex1= expression )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=NULL && LA53_0<=FALSE)||LA53_0==DELETE||LA53_0==FUNCTION||LA53_0==NEW||LA53_0==THIS||LA53_0==TYPEOF||LA53_0==VOID||LA53_0==LBRACE||LA53_0==LPAREN||LA53_0==LBRACK||(LA53_0>=ADD && LA53_0<=SUB)||(LA53_0>=INC && LA53_0<=DEC)||(LA53_0>=NOT && LA53_0<=INV)||(LA53_0>=Identifier && LA53_0<=StringLiteral)||LA53_0==RegularExpressionLiteral||(LA53_0>=DecimalLiteral && LA53_0<=HexIntegerLiteral)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1356:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5928);
                            ex1=expression();

                            state._fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC214=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5931);  
                    stream_SEMIC.add(SEMIC214);

                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1356:70: (ex2= expression )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=NULL && LA54_0<=FALSE)||LA54_0==DELETE||LA54_0==FUNCTION||LA54_0==NEW||LA54_0==THIS||LA54_0==TYPEOF||LA54_0==VOID||LA54_0==LBRACE||LA54_0==LPAREN||LA54_0==LBRACK||(LA54_0>=ADD && LA54_0<=SUB)||(LA54_0>=INC && LA54_0<=DEC)||(LA54_0>=NOT && LA54_0<=INV)||(LA54_0>=Identifier && LA54_0<=StringLiteral)||LA54_0==RegularExpressionLiteral||(LA54_0>=DecimalLiteral && LA54_0<=HexIntegerLiteral)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1356:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5935);
                            ex2=expression();

                            state._fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: VAR, SEMIC, SEMIC, variableDeclarationNoIn, ex2, ex1
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1358:4: -> ^( VAR_DECL_PARENT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ( $ex1)? ^( SEPARATOR SEMIC ) ( $ex2)?
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1358:7: ^( VAR_DECL_PARENT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL_PARENT, "VAR_DECL_PARENT"), root_1);

                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1358:25: ^( KEYWORD VAR )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                        adaptor.addChild(root_2, stream_VAR.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_variableDeclarationNoIn.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variableDeclarationNoIn.hasNext() ) {
                            adaptor.addChild(root_1, stream_variableDeclarationNoIn.nextTree());

                        }
                        stream_variableDeclarationNoIn.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1358:66: ^( SEPARATOR SEMIC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_SEMIC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1358:85: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_0, stream_ex1.nextTree());

                        }
                        stream_ex1.reset();
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1358:91: ^( SEPARATOR SEMIC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_SEMIC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1358:110: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_0, stream_ex2.nextTree());

                        }
                        stream_ex2.reset();

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlVar"

    public static class forControlExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1363:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final JavaScriptParser.forControlExpression_return forControlExpression() throws RecognitionException {
        JavaScriptParser.forControlExpression_return retval = new JavaScriptParser.forControlExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IN215=null;
        Token SEMIC216=null;
        Token SEMIC217=null;
        JavaScriptParser.expressionNoIn_return ex1 = null;

        JavaScriptParser.expression_return ex2 = null;

        JavaScriptParser.expression_return ex3 = null;


        CommonTree IN215_tree=null;
        CommonTree SEMIC216_tree=null;
        CommonTree SEMIC217_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1368:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1368:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression6003);
            ex1=expressionNoIn();

            state._fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1369:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IN) ) {
                alt58=1;
            }
            else if ( (LA58_0==SEMIC) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1370:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !(( isLeftHandSideIn(ex1, isLhs) )) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1370:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1371:4: IN ex2= expression
                    {
                    IN215=(Token)match(input,IN,FOLLOW_IN_in_forControlExpression6018);  
                    stream_IN.add(IN215);

                    pushFollow(FOLLOW_expression_in_forControlExpression6022);
                    ex2=expression();

                    state._fsp--;

                    stream_expression.add(ex2.getTree());


                    // AST REWRITE
                    // elements: ex2, ex1
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1372:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1372:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORITER, "FORITER"), root_1);

                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1372:18: ^( EXPR $ex1)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1372:33: ^( EXPR $ex2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1375:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1375:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1376:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC216=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6068);  
                    stream_SEMIC.add(SEMIC216);

                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1376:13: (ex2= expression )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=NULL && LA56_0<=FALSE)||LA56_0==DELETE||LA56_0==FUNCTION||LA56_0==NEW||LA56_0==THIS||LA56_0==TYPEOF||LA56_0==VOID||LA56_0==LBRACE||LA56_0==LPAREN||LA56_0==LBRACK||(LA56_0>=ADD && LA56_0<=SUB)||(LA56_0>=INC && LA56_0<=DEC)||(LA56_0>=NOT && LA56_0<=INV)||(LA56_0>=Identifier && LA56_0<=StringLiteral)||LA56_0==RegularExpressionLiteral||(LA56_0>=DecimalLiteral && LA56_0<=HexIntegerLiteral)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1376:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6072);
                            ex2=expression();

                            state._fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC217=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6075);  
                    stream_SEMIC.add(SEMIC217);

                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1376:35: (ex3= expression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=NULL && LA57_0<=FALSE)||LA57_0==DELETE||LA57_0==FUNCTION||LA57_0==NEW||LA57_0==THIS||LA57_0==TYPEOF||LA57_0==VOID||LA57_0==LBRACE||LA57_0==LPAREN||LA57_0==LBRACK||(LA57_0>=ADD && LA57_0<=SUB)||(LA57_0>=INC && LA57_0<=DEC)||(LA57_0>=NOT && LA57_0<=INV)||(LA57_0>=Identifier && LA57_0<=StringLiteral)||LA57_0==RegularExpressionLiteral||(LA57_0>=DecimalLiteral && LA57_0<=HexIntegerLiteral)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1376:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6079);
                            ex3=expression();

                            state._fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ex1, ex2, ex3
                    // token labels: 
                    // rule labels: retval, ex3, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex3=new RewriteRuleSubtreeStream(adaptor,"rule ex3",ex3!=null?ex3.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1377:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1377:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1377:18: ^( EXPR $ex1)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1377:33: ^( EXPR ( $ex2)? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1377:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.nextTree());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1377:49: ^( EXPR ( $ex3)? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1377:57: ( $ex3)?
                        if ( stream_ex3.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex3.nextTree());

                        }
                        stream_ex3.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlExpression"

    public static class forControlSemic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlSemic"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1382:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final JavaScriptParser.forControlSemic_return forControlSemic() throws RecognitionException {
        JavaScriptParser.forControlSemic_return retval = new JavaScriptParser.forControlSemic_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMIC218=null;
        Token SEMIC219=null;
        JavaScriptParser.expression_return ex1 = null;

        JavaScriptParser.expression_return ex2 = null;


        CommonTree SEMIC218_tree=null;
        CommonTree SEMIC219_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1383:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1383:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC218=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6138);  
            stream_SEMIC.add(SEMIC218);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1383:13: (ex1= expression )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=NULL && LA59_0<=FALSE)||LA59_0==DELETE||LA59_0==FUNCTION||LA59_0==NEW||LA59_0==THIS||LA59_0==TYPEOF||LA59_0==VOID||LA59_0==LBRACE||LA59_0==LPAREN||LA59_0==LBRACK||(LA59_0>=ADD && LA59_0<=SUB)||(LA59_0>=INC && LA59_0<=DEC)||(LA59_0>=NOT && LA59_0<=INV)||(LA59_0>=Identifier && LA59_0<=StringLiteral)||LA59_0==RegularExpressionLiteral||(LA59_0>=DecimalLiteral && LA59_0<=HexIntegerLiteral)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1383:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6142);
                    ex1=expression();

                    state._fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC219=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6145);  
            stream_SEMIC.add(SEMIC219);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1383:35: (ex2= expression )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==DELETE||LA60_0==FUNCTION||LA60_0==NEW||LA60_0==THIS||LA60_0==TYPEOF||LA60_0==VOID||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)||(LA60_0>=Identifier && LA60_0<=StringLiteral)||LA60_0==RegularExpressionLiteral||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1383:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6149);
                    ex2=expression();

                    state._fsp--;

                    stream_expression.add(ex2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ex2, ex1
            // token labels: 
            // rule labels: retval, ex2, ex1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
            RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1384:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1384:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1384:16: ^( EXPR )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1384:26: ^( EXPR ( $ex1)? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1384:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.nextTree());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1384:42: ^( EXPR ( $ex2)? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1384:50: ( $ex2)?
                if ( stream_ex2.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex2.nextTree());

                }
                stream_ex2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlSemic"

    public static class continueStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1396:1: continueStatement : CONTINUE ( Identifier )? semic -> ^( JUMP_STATEMENT ^( KEYWORD CONTINUE ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.continueStatement_return continueStatement() throws RecognitionException {
        JavaScriptParser.continueStatement_return retval = new JavaScriptParser.continueStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONTINUE220=null;
        Token Identifier221=null;
        JavaScriptParser.semic_return semic222 = null;


        CommonTree CONTINUE220_tree=null;
        CommonTree Identifier221_tree=null;
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1397:2: ( CONTINUE ( Identifier )? semic -> ^( JUMP_STATEMENT ^( KEYWORD CONTINUE ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1397:4: CONTINUE ( Identifier )? semic
            {
            CONTINUE220=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6203);  
            stream_CONTINUE.add(CONTINUE220);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1397:66: ( Identifier )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Identifier) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1397:66: Identifier
                    {
                    Identifier221=(Token)match(input,Identifier,FOLLOW_Identifier_in_continueStatement6207);  
                    stream_Identifier.add(Identifier221);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6210);
            semic222=semic();

            state._fsp--;

            stream_semic.add(semic222.getTree());


            // AST REWRITE
            // elements: semic, Identifier, CONTINUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1398:2: -> ^( JUMP_STATEMENT ^( KEYWORD CONTINUE ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1398:5: ^( JUMP_STATEMENT ^( KEYWORD CONTINUE ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1398:22: ^( KEYWORD CONTINUE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_CONTINUE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1398:42: ( ^( NAME Identifier ) )?
                if ( stream_Identifier.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1398:42: ^( NAME Identifier )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_Identifier.reset();
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1398:62: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "continueStatement"

    public static class breakStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1410:1: breakStatement : BREAK ( Identifier )? semic -> ^( JUMP_STATEMENT ^( KEYWORD BREAK ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.breakStatement_return breakStatement() throws RecognitionException {
        JavaScriptParser.breakStatement_return retval = new JavaScriptParser.breakStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BREAK223=null;
        Token Identifier224=null;
        JavaScriptParser.semic_return semic225 = null;


        CommonTree BREAK223_tree=null;
        CommonTree Identifier224_tree=null;
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1411:2: ( BREAK ( Identifier )? semic -> ^( JUMP_STATEMENT ^( KEYWORD BREAK ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1411:4: BREAK ( Identifier )? semic
            {
            BREAK223=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStatement6254);  
            stream_BREAK.add(BREAK223);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1411:63: ( Identifier )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Identifier) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1411:63: Identifier
                    {
                    Identifier224=(Token)match(input,Identifier,FOLLOW_Identifier_in_breakStatement6258);  
                    stream_Identifier.add(Identifier224);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6261);
            semic225=semic();

            state._fsp--;

            stream_semic.add(semic225.getTree());


            // AST REWRITE
            // elements: semic, Identifier, BREAK
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1412:2: -> ^( JUMP_STATEMENT ^( KEYWORD BREAK ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1412:6: ^( JUMP_STATEMENT ^( KEYWORD BREAK ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1412:23: ^( KEYWORD BREAK )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_BREAK.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1412:40: ( ^( NAME Identifier ) )?
                if ( stream_Identifier.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1412:40: ^( NAME Identifier )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_Identifier.reset();
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1412:60: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "breakStatement"

    public static class returnStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1432:1: returnStatement : RETURN ( expression )? semic -> ^( JUMP_STATEMENT ^( KEYWORD RETURN ) ( expression )? ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.returnStatement_return returnStatement() throws RecognitionException {
        JavaScriptParser.returnStatement_return retval = new JavaScriptParser.returnStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RETURN226=null;
        JavaScriptParser.expression_return expression227 = null;

        JavaScriptParser.semic_return semic228 = null;


        CommonTree RETURN226_tree=null;
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1433:2: ( RETURN ( expression )? semic -> ^( JUMP_STATEMENT ^( KEYWORD RETURN ) ( expression )? ^( SEPARATOR semic ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1433:4: RETURN ( expression )? semic
            {
            RETURN226=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnStatement6306);  
            stream_RETURN.add(RETURN226);

             promoteEOL(null); 
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1433:33: ( expression )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||LA63_0==FUNCTION||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||(LA63_0>=Identifier && LA63_0<=StringLiteral)||LA63_0==RegularExpressionLiteral||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1433:33: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6310);
                    expression227=expression();

                    state._fsp--;

                    stream_expression.add(expression227.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6313);
            semic228=semic();

            state._fsp--;

            stream_semic.add(semic228.getTree());


            // AST REWRITE
            // elements: expression, RETURN, semic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1434:2: -> ^( JUMP_STATEMENT ^( KEYWORD RETURN ) ( expression )? ^( SEPARATOR semic ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1434:5: ^( JUMP_STATEMENT ^( KEYWORD RETURN ) ( expression )? ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1434:22: ^( KEYWORD RETURN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_RETURN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1434:40: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1434:52: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnStatement"

    public static class withStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1441:1: withStatement : WITH LPAREN expression RPAREN statement -> ^( KEYWORD WITH ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) statement ;
    public final JavaScriptParser.withStatement_return withStatement() throws RecognitionException {
        JavaScriptParser.withStatement_return retval = new JavaScriptParser.withStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WITH229=null;
        Token LPAREN230=null;
        Token RPAREN232=null;
        JavaScriptParser.expression_return expression231 = null;

        JavaScriptParser.statement_return statement233 = null;


        CommonTree WITH229_tree=null;
        CommonTree LPAREN230_tree=null;
        CommonTree RPAREN232_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1442:2: ( WITH LPAREN expression RPAREN statement -> ^( KEYWORD WITH ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) statement )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1442:4: WITH LPAREN expression RPAREN statement
            {
            WITH229=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement6351);  
            stream_WITH.add(WITH229);

            LPAREN230=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6353);  
            stream_LPAREN.add(LPAREN230);

            pushFollow(FOLLOW_expression_in_withStatement6355);
            expression231=expression();

            state._fsp--;

            stream_expression.add(expression231.getTree());
            RPAREN232=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6357);  
            stream_RPAREN.add(RPAREN232);

            pushFollow(FOLLOW_statement_in_withStatement6359);
            statement233=statement();

            state._fsp--;

            stream_statement.add(statement233.getTree());


            // AST REWRITE
            // elements: expression, statement, RPAREN, LPAREN, WITH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1443:2: -> ^( KEYWORD WITH ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) statement
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1443:5: ^( KEYWORD WITH )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                adaptor.addChild(root_1, stream_WITH.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1443:21: ^( SEPARATOR LPAREN )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_LPAREN.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_expression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1443:52: ^( SEPARATOR RPAREN )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_RPAREN.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "withStatement"

    public static class switchStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1450:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
    public final JavaScriptParser.switchStatement_return switchStatement() throws RecognitionException {
        JavaScriptParser.switchStatement_return retval = new JavaScriptParser.switchStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SWITCH234=null;
        Token LPAREN235=null;
        Token RPAREN237=null;
        Token LBRACE238=null;
        Token RBRACE241=null;
        JavaScriptParser.expression_return expression236 = null;

        JavaScriptParser.defaultClause_return defaultClause239 = null;

        JavaScriptParser.caseClause_return caseClause240 = null;


        CommonTree SWITCH234_tree=null;
        CommonTree LPAREN235_tree=null;
        CommonTree RPAREN237_tree=null;
        CommonTree LBRACE238_tree=null;
        CommonTree RBRACE241_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");

        	int defaultClauseCount = 0;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1455:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1455:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH234=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6405);  
            stream_SWITCH.add(SWITCH234);

            LPAREN235=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6407);  
            stream_LPAREN.add(LPAREN235);

            pushFollow(FOLLOW_expression_in_switchStatement6409);
            expression236=expression();

            state._fsp--;

            stream_expression.add(expression236.getTree());
            RPAREN237=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6411);  
            stream_RPAREN.add(RPAREN237);

            LBRACE238=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6413);  
            stream_LBRACE.add(LBRACE238);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1455:43: ({...}? => defaultClause | caseClause )*
            loop64:
            do {
                int alt64=3;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==DEFAULT) && (( defaultClauseCount == 0 ))) {
                    alt64=1;
                }
                else if ( (LA64_0==CASE) ) {
                    alt64=2;
                }


                switch (alt64) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1455:45: {...}? => defaultClause
            	    {
            	    if ( !(( defaultClauseCount == 0 )) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6420);
            	    defaultClause239=defaultClause();

            	    state._fsp--;

            	    stream_defaultClause.add(defaultClause239.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1455:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6426);
            	    caseClause240=caseClause();

            	    state._fsp--;

            	    stream_caseClause.add(caseClause240.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            RBRACE241=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6431);  
            stream_RBRACE.add(RBRACE241);



            // AST REWRITE
            // elements: SWITCH, caseClause, expression, defaultClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1456:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1456:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SWITCH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1456:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.nextTree());

                }
                stream_defaultClause.reset();
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1456:41: ( caseClause )*
                while ( stream_caseClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseClause.nextTree());

                }
                stream_caseClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "switchStatement"

    public static class caseClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseClause"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1459:1: caseClause : CASE expression COLON ( statement )* ;
    public final JavaScriptParser.caseClause_return caseClause() throws RecognitionException {
        JavaScriptParser.caseClause_return retval = new JavaScriptParser.caseClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CASE242=null;
        Token COLON244=null;
        JavaScriptParser.expression_return expression243 = null;

        JavaScriptParser.statement_return statement245 = null;


        CommonTree CASE242_tree=null;
        CommonTree COLON244_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1460:2: ( CASE expression COLON ( statement )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1460:4: CASE expression COLON ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            CASE242=(Token)match(input,CASE,FOLLOW_CASE_in_caseClause6459); 
            CASE242_tree = (CommonTree)adaptor.create(CASE242);
            root_0 = (CommonTree)adaptor.becomeRoot(CASE242_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6462);
            expression243=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression243.getTree());
            COLON244=(Token)match(input,COLON,FOLLOW_COLON_in_caseClause6464); 
            COLON244_tree = (CommonTree)adaptor.create(COLON244);
            adaptor.addChild(root_0, COLON244_tree);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1460:27: ( statement )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=NULL && LA65_0<=BREAK)||LA65_0==CONTINUE||(LA65_0>=DELETE && LA65_0<=DO)||(LA65_0>=FOR && LA65_0<=IF)||(LA65_0>=NEW && LA65_0<=WITH)||LA65_0==LBRACE||LA65_0==LPAREN||LA65_0==LBRACK||LA65_0==SEMIC||(LA65_0>=ADD && LA65_0<=SUB)||(LA65_0>=INC && LA65_0<=DEC)||(LA65_0>=NOT && LA65_0<=INV)||(LA65_0>=Identifier && LA65_0<=StringLiteral)||LA65_0==RegularExpressionLiteral||(LA65_0>=DecimalLiteral && LA65_0<=HexIntegerLiteral)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1460:27: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6466);
            	    statement245=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement245.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "caseClause"

    public static class defaultClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultClause"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1463:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final JavaScriptParser.defaultClause_return defaultClause() throws RecognitionException {
        JavaScriptParser.defaultClause_return retval = new JavaScriptParser.defaultClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFAULT246=null;
        Token COLON247=null;
        JavaScriptParser.statement_return statement248 = null;


        CommonTree DEFAULT246_tree=null;
        CommonTree COLON247_tree=null;

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1464:2: ( DEFAULT COLON ( statement )* )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1464:4: DEFAULT COLON ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFAULT246=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6479); 
            DEFAULT246_tree = (CommonTree)adaptor.create(DEFAULT246);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFAULT246_tree, root_0);

            COLON247=(Token)match(input,COLON,FOLLOW_COLON_in_defaultClause6482); 
            COLON247_tree = (CommonTree)adaptor.create(COLON247);
            adaptor.addChild(root_0, COLON247_tree);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1464:19: ( statement )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=NULL && LA66_0<=BREAK)||LA66_0==CONTINUE||(LA66_0>=DELETE && LA66_0<=DO)||(LA66_0>=FOR && LA66_0<=IF)||(LA66_0>=NEW && LA66_0<=WITH)||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||LA66_0==SEMIC||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||(LA66_0>=Identifier && LA66_0<=StringLiteral)||LA66_0==RegularExpressionLiteral||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1464:19: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6484);
            	    statement248=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement248.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defaultClause"

    public static class labelledStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "labelledStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1471:1: labelledStatement : Identifier COLON statement -> ^( NAME Identifier ) ^( SEPARATOR COLON ) statement ;
    public final JavaScriptParser.labelledStatement_return labelledStatement() throws RecognitionException {
        JavaScriptParser.labelledStatement_return retval = new JavaScriptParser.labelledStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier249=null;
        Token COLON250=null;
        JavaScriptParser.statement_return statement251 = null;


        CommonTree Identifier249_tree=null;
        CommonTree COLON250_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1472:2: ( Identifier COLON statement -> ^( NAME Identifier ) ^( SEPARATOR COLON ) statement )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1472:4: Identifier COLON statement
            {
            Identifier249=(Token)match(input,Identifier,FOLLOW_Identifier_in_labelledStatement6501);  
            stream_Identifier.add(Identifier249);

            COLON250=(Token)match(input,COLON,FOLLOW_COLON_in_labelledStatement6503);  
            stream_COLON.add(COLON250);

            pushFollow(FOLLOW_statement_in_labelledStatement6505);
            statement251=statement();

            state._fsp--;

            stream_statement.add(statement251.getTree());


            // AST REWRITE
            // elements: statement, COLON, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1473:2: -> ^( NAME Identifier ) ^( SEPARATOR COLON ) statement
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1473:6: ^( NAME Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1473:25: ^( SEPARATOR COLON )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_COLON.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "labelledStatement"

    public static class throwStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throwStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1495:1: throwStatement : THROW expression semic -> ^( JUMP_STATEMENT ^( KEYWORD THROW ) expression ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.throwStatement_return throwStatement() throws RecognitionException {
        JavaScriptParser.throwStatement_return retval = new JavaScriptParser.throwStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token THROW252=null;
        JavaScriptParser.expression_return expression253 = null;

        JavaScriptParser.semic_return semic254 = null;


        CommonTree THROW252_tree=null;
        RewriteRuleTokenStream stream_THROW=new RewriteRuleTokenStream(adaptor,"token THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1496:2: ( THROW expression semic -> ^( JUMP_STATEMENT ^( KEYWORD THROW ) expression ^( SEPARATOR semic ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1496:4: THROW expression semic
            {
            THROW252=(Token)match(input,THROW,FOLLOW_THROW_in_throwStatement6541);  
            stream_THROW.add(THROW252);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6545);
            expression253=expression();

            state._fsp--;

            stream_expression.add(expression253.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6547);
            semic254=semic();

            state._fsp--;

            stream_semic.add(semic254.getTree());


            // AST REWRITE
            // elements: expression, semic, THROW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1497:2: -> ^( JUMP_STATEMENT ^( KEYWORD THROW ) expression ^( SEPARATOR semic ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1497:5: ^( JUMP_STATEMENT ^( KEYWORD THROW ) expression ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1497:22: ^( KEYWORD THROW )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_THROW.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1497:50: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throwStatement"

    public static class tryStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryStatement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1504:1: tryStatement : TRY block catchOrFinally -> ^( BRANCH_STATEMENT ^( KEYWORD TRY ) block catchOrFinally ) ;
    public final JavaScriptParser.tryStatement_return tryStatement() throws RecognitionException {
        JavaScriptParser.tryStatement_return retval = new JavaScriptParser.tryStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRY255=null;
        JavaScriptParser.block_return block256 = null;

        JavaScriptParser.catchOrFinally_return catchOrFinally257 = null;


        CommonTree TRY255_tree=null;
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleSubtreeStream stream_catchOrFinally=new RewriteRuleSubtreeStream(adaptor,"rule catchOrFinally");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1505:2: ( TRY block catchOrFinally -> ^( BRANCH_STATEMENT ^( KEYWORD TRY ) block catchOrFinally ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1505:4: TRY block catchOrFinally
            {
            TRY255=(Token)match(input,TRY,FOLLOW_TRY_in_tryStatement6584);  
            stream_TRY.add(TRY255);

            pushFollow(FOLLOW_block_in_tryStatement6586);
            block256=block();

            state._fsp--;

            stream_block.add(block256.getTree());
            pushFollow(FOLLOW_catchOrFinally_in_tryStatement6588);
            catchOrFinally257=catchOrFinally();

            state._fsp--;

            stream_catchOrFinally.add(catchOrFinally257.getTree());


            // AST REWRITE
            // elements: TRY, block, catchOrFinally
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1506:2: -> ^( BRANCH_STATEMENT ^( KEYWORD TRY ) block catchOrFinally )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1506:5: ^( BRANCH_STATEMENT ^( KEYWORD TRY ) block catchOrFinally )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1506:24: ^( KEYWORD TRY )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_TRY.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());
                adaptor.addChild(root_1, stream_catchOrFinally.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tryStatement"

    public static class catchOrFinally_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchOrFinally"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1509:1: catchOrFinally : ( catchClause ( finallyClause )? | finallyClause );
    public final JavaScriptParser.catchOrFinally_return catchOrFinally() throws RecognitionException {
        JavaScriptParser.catchOrFinally_return retval = new JavaScriptParser.catchOrFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.catchClause_return catchClause258 = null;

        JavaScriptParser.finallyClause_return finallyClause259 = null;

        JavaScriptParser.finallyClause_return finallyClause260 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1510:2: ( catchClause ( finallyClause )? | finallyClause )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==CATCH) ) {
                alt68=1;
            }
            else if ( (LA68_0==FINALLY) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1510:4: catchClause ( finallyClause )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_catchClause_in_catchOrFinally6617);
                    catchClause258=catchClause();

                    state._fsp--;

                    adaptor.addChild(root_0, catchClause258.getTree());
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1510:16: ( finallyClause )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==FINALLY) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1510:16: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_catchOrFinally6619);
                            finallyClause259=finallyClause();

                            state._fsp--;

                            adaptor.addChild(root_0, finallyClause259.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1510:33: finallyClause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_finallyClause_in_catchOrFinally6624);
                    finallyClause260=finallyClause();

                    state._fsp--;

                    adaptor.addChild(root_0, finallyClause260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catchOrFinally"

    public static class catchClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchClause"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1512:1: catchClause : CATCH LPAREN Identifier RPAREN block -> ^( BRANCH ^( KEYWORD CATCH ) ^( SEPARATOR LPAREN ) Identifier ^( SEPARATOR RPAREN ) block ) ;
    public final JavaScriptParser.catchClause_return catchClause() throws RecognitionException {
        JavaScriptParser.catchClause_return retval = new JavaScriptParser.catchClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CATCH261=null;
        Token LPAREN262=null;
        Token Identifier263=null;
        Token RPAREN264=null;
        JavaScriptParser.block_return block265 = null;


        CommonTree CATCH261_tree=null;
        CommonTree LPAREN262_tree=null;
        CommonTree Identifier263_tree=null;
        CommonTree RPAREN264_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1513:2: ( CATCH LPAREN Identifier RPAREN block -> ^( BRANCH ^( KEYWORD CATCH ) ^( SEPARATOR LPAREN ) Identifier ^( SEPARATOR RPAREN ) block ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1513:4: CATCH LPAREN Identifier RPAREN block
            {
            CATCH261=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchClause6634);  
            stream_CATCH.add(CATCH261);

            LPAREN262=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClause6636);  
            stream_LPAREN.add(LPAREN262);

            Identifier263=(Token)match(input,Identifier,FOLLOW_Identifier_in_catchClause6638);  
            stream_Identifier.add(Identifier263);

            RPAREN264=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClause6640);  
            stream_RPAREN.add(RPAREN264);

            pushFollow(FOLLOW_block_in_catchClause6642);
            block265=block();

            state._fsp--;

            stream_block.add(block265.getTree());


            // AST REWRITE
            // elements: CATCH, RPAREN, Identifier, block, LPAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1514:2: -> ^( BRANCH ^( KEYWORD CATCH ) ^( SEPARATOR LPAREN ) Identifier ^( SEPARATOR RPAREN ) block )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1514:5: ^( BRANCH ^( KEYWORD CATCH ) ^( SEPARATOR LPAREN ) Identifier ^( SEPARATOR RPAREN ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1514:14: ^( KEYWORD CATCH )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_CATCH.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1514:31: ^( SEPARATOR LPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1514:62: ^( SEPARATOR RPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catchClause"

    public static class finallyClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finallyClause"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1517:1: finallyClause : FINALLY block -> ^( BRANCH ^( KEYWORD FINALLY ) block ) ;
    public final JavaScriptParser.finallyClause_return finallyClause() throws RecognitionException {
        JavaScriptParser.finallyClause_return retval = new JavaScriptParser.finallyClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FINALLY266=null;
        JavaScriptParser.block_return block267 = null;


        CommonTree FINALLY266_tree=null;
        RewriteRuleTokenStream stream_FINALLY=new RewriteRuleTokenStream(adaptor,"token FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1518:2: ( FINALLY block -> ^( BRANCH ^( KEYWORD FINALLY ) block ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1518:4: FINALLY block
            {
            FINALLY266=(Token)match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause6683);  
            stream_FINALLY.add(FINALLY266);

            pushFollow(FOLLOW_block_in_finallyClause6685);
            block267=block();

            state._fsp--;

            stream_block.add(block267.getTree());


            // AST REWRITE
            // elements: block, FINALLY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1519:2: -> ^( BRANCH ^( KEYWORD FINALLY ) block )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1519:5: ^( BRANCH ^( KEYWORD FINALLY ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1519:14: ^( KEYWORD FINALLY )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_FINALLY.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "finallyClause"

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1532:1: functionDeclaration : FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION_DECL ^( NAME $name) formalParameterList functionBody ) ;
    public final JavaScriptParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        JavaScriptParser.functionDeclaration_return retval = new JavaScriptParser.functionDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token FUNCTION268=null;
        JavaScriptParser.formalParameterList_return formalParameterList269 = null;

        JavaScriptParser.functionBody_return functionBody270 = null;


        CommonTree name_tree=null;
        CommonTree FUNCTION268_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1533:2: ( FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION_DECL ^( NAME $name) formalParameterList functionBody ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1533:4: FUNCTION name= Identifier formalParameterList functionBody
            {
            FUNCTION268=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration6721);  
            stream_FUNCTION.add(FUNCTION268);

            name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration6725);  
            stream_Identifier.add(name);

            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration6727);
            formalParameterList269=formalParameterList();

            state._fsp--;

            stream_formalParameterList.add(formalParameterList269.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration6729);
            functionBody270=functionBody();

            state._fsp--;

            stream_functionBody.add(functionBody270.getTree());


            // AST REWRITE
            // elements: formalParameterList, functionBody, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1534:2: -> ^( FUNCTION_DECL ^( NAME $name) formalParameterList functionBody )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1534:5: ^( FUNCTION_DECL ^( NAME $name) formalParameterList functionBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1534:22: ^( NAME $name)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_name.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class functionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionExpression"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1537:1: functionExpression : FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final JavaScriptParser.functionExpression_return functionExpression() throws RecognitionException {
        JavaScriptParser.functionExpression_return retval = new JavaScriptParser.functionExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token FUNCTION271=null;
        JavaScriptParser.formalParameterList_return formalParameterList272 = null;

        JavaScriptParser.functionBody_return functionBody273 = null;


        CommonTree name_tree=null;
        CommonTree FUNCTION271_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1538:2: ( FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1538:4: FUNCTION (name= Identifier )? formalParameterList functionBody
            {
            FUNCTION271=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression6760);  
            stream_FUNCTION.add(FUNCTION271);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1538:17: (name= Identifier )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Identifier) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1538:17: name= Identifier
                    {
                    name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionExpression6764);  
                    stream_Identifier.add(name);


                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression6767);
            formalParameterList272=formalParameterList();

            state._fsp--;

            stream_formalParameterList.add(formalParameterList272.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression6769);
            functionBody273=functionBody();

            state._fsp--;

            stream_functionBody.add(functionBody273.getTree());


            // AST REWRITE
            // elements: functionBody, name, formalParameterList, FUNCTION
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1539:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1539:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1539:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionExpression"

    public static class formalParameterList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterList"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1542:1: formalParameterList : LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN -> ^( FORMAL_PARAM_LIST ^( SEPARATOR LPAREN ) ( ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) )* )? ^( SEPARATOR RPAREN ) ) ;
    public final JavaScriptParser.formalParameterList_return formalParameterList() throws RecognitionException {
        JavaScriptParser.formalParameterList_return retval = new JavaScriptParser.formalParameterList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN274=null;
        Token Identifier275=null;
        Token COMMA276=null;
        Token Identifier277=null;
        Token RPAREN278=null;

        CommonTree LPAREN274_tree=null;
        CommonTree Identifier275_tree=null;
        CommonTree COMMA276_tree=null;
        CommonTree Identifier277_tree=null;
        CommonTree RPAREN278_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1543:2: ( LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN -> ^( FORMAL_PARAM_LIST ^( SEPARATOR LPAREN ) ( ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) )* )? ^( SEPARATOR RPAREN ) ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1543:4: LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN
            {
            LPAREN274=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList6797);  
            stream_LPAREN.add(LPAREN274);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1543:11: ( Identifier ( COMMA Identifier )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Identifier) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1543:13: Identifier ( COMMA Identifier )*
                    {
                    Identifier275=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList6801);  
                    stream_Identifier.add(Identifier275);

                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1543:24: ( COMMA Identifier )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==COMMA) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1543:26: COMMA Identifier
                    	    {
                    	    COMMA276=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalParameterList6805);  
                    	    stream_COMMA.add(COMMA276);

                    	    Identifier277=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList6807);  
                    	    stream_Identifier.add(Identifier277);


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN278=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList6815);  
            stream_RPAREN.add(RPAREN278);



            // AST REWRITE
            // elements: RPAREN, LPAREN, Identifier, Identifier, COMMA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1544:2: -> ^( FORMAL_PARAM_LIST ^( SEPARATOR LPAREN ) ( ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) )* )? ^( SEPARATOR RPAREN ) )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:5: ^( FORMAL_PARAM_LIST ^( SEPARATOR LPAREN ) ( ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) )* )? ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:25: ^( SEPARATOR LPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:45: ( ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) )* )?
                if ( stream_Identifier.hasNext()||stream_Identifier.hasNext()||stream_COMMA.hasNext() ) {
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:47: ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL"), root_2);

                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:64: ^( TYPE EMPTY )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_3);

                    adaptor.addChild(root_3, (CommonTree)adaptor.create(EMPTY, "EMPTY"));

                    adaptor.addChild(root_2, root_3);
                    }
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:78: ^( NAME Identifier )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_3);

                    adaptor.addChild(root_3, stream_Identifier.nextNode());

                    adaptor.addChild(root_2, root_3);
                    }

                    adaptor.addChild(root_1, root_2);
                    }
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:98: ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) ) )*
                    while ( stream_Identifier.hasNext()||stream_COMMA.hasNext() ) {
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:100: ^( SEPARATOR COMMA )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                        adaptor.addChild(root_2, stream_COMMA.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:119: ^( PARAMETER_DECL ^( TYPE EMPTY ) ^( NAME Identifier ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL"), root_2);

                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:136: ^( TYPE EMPTY )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_3);

                        adaptor.addChild(root_3, (CommonTree)adaptor.create(EMPTY, "EMPTY"));

                        adaptor.addChild(root_2, root_3);
                        }
                        // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:150: ^( NAME Identifier )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_3);

                        adaptor.addChild(root_3, stream_Identifier.nextNode());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                    }
                    stream_Identifier.reset();
                    stream_COMMA.reset();

                }
                stream_Identifier.reset();
                stream_Identifier.reset();
                stream_COMMA.reset();
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1544:176: ^( SEPARATOR RPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"

    public static class functionBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionBody"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1547:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final JavaScriptParser.functionBody_return functionBody() throws RecognitionException {
        JavaScriptParser.functionBody_return retval = new JavaScriptParser.functionBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lb=null;
        Token RBRACE280=null;
        JavaScriptParser.sourceElement_return sourceElement279 = null;


        CommonTree lb_tree=null;
        CommonTree RBRACE280_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1548:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1548:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionBody6895);  
            stream_LBRACE.add(lb);

            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1548:14: ( sourceElement )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=NULL && LA72_0<=BREAK)||LA72_0==CONTINUE||(LA72_0>=DELETE && LA72_0<=DO)||(LA72_0>=FOR && LA72_0<=IF)||(LA72_0>=NEW && LA72_0<=WITH)||LA72_0==LBRACE||LA72_0==LPAREN||LA72_0==LBRACK||LA72_0==SEMIC||(LA72_0>=ADD && LA72_0<=SUB)||(LA72_0>=INC && LA72_0<=DEC)||(LA72_0>=NOT && LA72_0<=INV)||(LA72_0>=Identifier && LA72_0<=StringLiteral)||LA72_0==RegularExpressionLiteral||(LA72_0>=DecimalLiteral && LA72_0<=HexIntegerLiteral)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1548:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody6897);
            	    sourceElement279=sourceElement();

            	    state._fsp--;

            	    stream_sourceElement.add(sourceElement279.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            RBRACE280=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_functionBody6900);  
            stream_RBRACE.add(RBRACE280);



            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1549:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1549:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lb, "BLOCK"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1549:28: ( sourceElement )*
                while ( stream_sourceElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_sourceElement.nextTree());

                }
                stream_sourceElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionBody"

    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1556:1: program : ( sourceElement )* -> ^( COMPILATION_UNIT ( sourceElement )* ) ;
    public final JavaScriptParser.program_return program() throws RecognitionException {
        JavaScriptParser.program_return retval = new JavaScriptParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.sourceElement_return sourceElement281 = null;


        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1557:2: ( ( sourceElement )* -> ^( COMPILATION_UNIT ( sourceElement )* ) )
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1557:4: ( sourceElement )*
            {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1557:4: ( sourceElement )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=NULL && LA73_0<=BREAK)||LA73_0==CONTINUE||(LA73_0>=DELETE && LA73_0<=DO)||(LA73_0>=FOR && LA73_0<=IF)||(LA73_0>=NEW && LA73_0<=WITH)||LA73_0==LBRACE||LA73_0==LPAREN||LA73_0==LBRACK||LA73_0==SEMIC||(LA73_0>=ADD && LA73_0<=SUB)||(LA73_0>=INC && LA73_0<=DEC)||(LA73_0>=NOT && LA73_0<=INV)||(LA73_0>=Identifier && LA73_0<=StringLiteral)||LA73_0==RegularExpressionLiteral||(LA73_0>=DecimalLiteral && LA73_0<=HexIntegerLiteral)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1557:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program6929);
            	    sourceElement281=sourceElement();

            	    state._fsp--;

            	    stream_sourceElement.add(sourceElement281.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);



            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1558:2: -> ^( COMPILATION_UNIT ( sourceElement )* )
            {
                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1558:5: ^( COMPILATION_UNIT ( sourceElement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);

                // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1558:24: ( sourceElement )*
                while ( stream_sourceElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_sourceElement.nextTree());

                }
                stream_sourceElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class sourceElement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sourceElement"
    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1566:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final JavaScriptParser.sourceElement_return sourceElement() throws RecognitionException {
        JavaScriptParser.sourceElement_return retval = new JavaScriptParser.sourceElement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.functionDeclaration_return functionDeclaration282 = null;

        JavaScriptParser.statement_return statement283 = null;



        try {
            // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1571:2: ({...}? functionDeclaration | statement )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1571:4: {...}? functionDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    if ( !(( input.LA(1) == FUNCTION )) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement6968);
                    functionDeclaration282=functionDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, functionDeclaration282.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\goca\\git\\SSQSA-COP\\eCSTGenerator\\src\\Languages\\javaScript\\JavaScript.g:1572:4: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement6973);
                    statement283=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement283.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sourceElement"

    // Delegated rules


    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String DFA43_eotS =
        "\44\uffff";
    static final String DFA43_eofS =
        "\44\uffff";
    static final String DFA43_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA43_maxS =
        "\1\u00c0\1\0\42\uffff";
    static final String DFA43_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA43_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA43_transitionS = {
            "\4\2\2\uffff\1\2\1\uffff\2\2\2\uffff\3\2\2\uffff\13\2\37\uffff"+
            "\1\1\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\11\uffff\2\2\2\uffff"+
            "\2\2\6\uffff\2\2\125\uffff\2\2\5\uffff\1\2\3\uffff\3\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1189:1: statement options {k=1; } : ({...}? block | statementTail );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( input.LA(1) == LBRACE )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\17\uffff";
    static final String DFA44_eofS =
        "\4\uffff\1\3\12\uffff";
    static final String DFA44_minS =
        "\1\4\3\uffff\1\23\12\uffff";
    static final String DFA44_maxS =
        "\1\u00c0\3\uffff\1\u00b1\12\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14"+
        "\1\15\1\12";
    static final String DFA44_specialS =
        "\17\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\3\1\10\2\uffff\1\7\1\uffff\1\3\1\6\2\uffff\1\6\1\3\1\5\2"+
            "\uffff\1\3\1\11\1\13\1\3\1\14\1\15\1\3\1\1\1\3\1\6\1\12\37\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\2\11\uffff\2\3\2\uffff"+
            "\2\3\6\uffff\2\3\125\uffff\1\4\1\3\5\uffff\1\3\3\uffff\3\3",
            "",
            "",
            "",
            "\2\3\53\uffff\2\3\1\uffff\1\3\1\uffff\27\3\2\uffff\3\3\1\16"+
            "\15\3\101\uffff\2\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "1198:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );";
        }
    }
    static final String DFA74_eotS =
        "\44\uffff";
    static final String DFA74_eofS =
        "\44\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA74_maxS =
        "\1\u00c0\1\0\42\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA74_transitionS = {
            "\4\2\2\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\1\1\2\2\uffff\13"+
            "\2\37\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\11\uffff"+
            "\2\2\2\uffff\2\2\6\uffff\2\2\125\uffff\2\2\5\uffff\1\2\3\uffff"+
            "\3\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "1566:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( input.LA(1) == FUNCTION )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_reservedWord_in_token2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_token2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpression3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3506 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3538 = new BitSet(new long[]{0x8000000029221070L,0x000000003033009AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3546 = new BitSet(new long[]{0x8000000029221070L,0x000000003033009AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0xC018000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xC018000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3659 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3661 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_propertyName3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3736 = new BitSet(new long[]{0x8000000001220070L,0x000000000000000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_memberExpression_in_newExpression3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3766 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000EL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_arguments3774 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3848 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3864 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3889 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3893 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_Identifier_in_leftHandSideExpression3914 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3949 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4019 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4168 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4172 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4186 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_additiveExpression4208 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4218 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4237 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_shiftExpression4241 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4255 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4274 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_relationalOperators_in_relationalExpression4278 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4280 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4312 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_relationalOperatorsNoIn_in_relationalExpressionNoIn4316 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4318 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_set_in_relationalOperators0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalOperatorsNoIn0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4410 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_equalityOperator_in_equalityExpression4414 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4416 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4448 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn4452 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4470 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_set_in_equalityOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4513 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression4517 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4519 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4533 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn4537 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4539 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4555 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4559 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4561 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4577 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4581 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4583 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4598 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4602 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4604 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4619 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4623 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4625 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4644 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression4648 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4650 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4683 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4687 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4689 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4722 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4726 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4728 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4761 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4765 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4767 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4804 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4808 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4810 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4812 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4828 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4832 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4834 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4836 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4866 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4873 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4971 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4978 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expression5006 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5010 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5051 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5055 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEMIC_in_semic5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5265 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_block5267 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_block5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5310 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0003000000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5316 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0003000000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration5365 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5369 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn5417 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5421 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5492 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0003000000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5524 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_ifStatement5526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5528 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_ifStatement5530 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5536 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_ifStatement5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement5642 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_doStatement5644 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement5646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement5648 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_doStatement5650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement5652 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0003000000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement5718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement5720 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_whileStatement5722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement5724 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_whileStatement5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement5778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement5780 = new BitSet(new long[]{0x8000000039221070L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_forControl_in_forStatement5782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement5784 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_forStatement5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar5857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5859 = new BitSet(new long[]{0x0000000000080000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_IN_in_forControlVar5871 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlVar5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5919 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5924 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlVar5928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5931 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlVar5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression6003 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IN_in_forControlExpression6018 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6068 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6075 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6138 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6145 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6203 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x000B000000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6207 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0003000000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6254 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x000B000000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6258 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0003000000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6306 = new BitSet(new long[]{0x8000000029221070L,0x00000000303300CBL,0xC41B000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_returnStatement6310 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0003000000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6353 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_withStatement6355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6357 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_withStatement6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6407 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_switchStatement6409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6411 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6413 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6420 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6426 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6459 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_caseClause6462 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6464 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_caseClause6466 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6479 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6482 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_defaultClause6484 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement6501 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6503 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6541 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_throwStatement6545 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0003000000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement6584 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_tryStatement6586 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchOrFinally_in_tryStatement6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_catchOrFinally6617 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_catchOrFinally6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_catchOrFinally6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause6634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause6636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause6638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause6640 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause6683 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_finallyClause6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration6721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration6725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration6727 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression6760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression6764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression6767 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList6797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L,0x0008000000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList6801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList6805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList6807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody6895 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody6897 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program6929 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0xC418000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement6973 = new BitSet(new long[]{0x0000000000000002L});

}