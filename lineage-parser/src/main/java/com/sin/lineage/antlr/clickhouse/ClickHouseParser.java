// Generated from com/sin/lineage/antlr/clickhouse/ClickHouseParser.g4 by ANTLR 4.9.3
package com.sin.lineage.antlr.clickhouse;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClickHouseParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            ADD = 1, AFTER = 2, ALIAS = 3, ALL = 4, ALTER = 5, AND = 6, ANTI = 7, ANY = 8, ARRAY = 9,
            AS = 10, ASCENDING = 11, ASOF = 12, AST = 13, ASYNC = 14, ATTACH = 15, BETWEEN = 16,
            BOTH = 17, BY = 18, CASE = 19, CAST = 20, CHECK = 21, CLEAR = 22, CLUSTER = 23, CODEC = 24,
            COLLATE = 25, COLUMN = 26, COMMENT = 27, CONSTRAINT = 28, CREATE = 29, CROSS = 30,
            CUBE = 31, CURRENT = 32, DATABASE = 33, DATABASES = 34, DATE = 35, DAY = 36, DEDUPLICATE = 37,
            DEFAULT = 38, DELAY = 39, DELETE = 40, DESC = 41, DESCENDING = 42, DESCRIBE = 43,
            DETACH = 44, DICTIONARIES = 45, DICTIONARY = 46, DISK = 47, DISTINCT = 48, DISTRIBUTED = 49,
            DROP = 50, ELSE = 51, END = 52, ENGINE = 53, EVENTS = 54, EXISTS = 55, EXPLAIN = 56,
            EXPRESSION = 57, EXTRACT = 58, FETCHES = 59, FINAL = 60, FIRST = 61, FLUSH = 62, FOLLOWING = 63,
            FOR = 64, FORMAT = 65, FREEZE = 66, FROM = 67, FULL = 68, FUNCTION = 69, GLOBAL = 70,
            GRANULARITY = 71, GROUP = 72, HAVING = 73, HIERARCHICAL = 74, HOUR = 75, ID = 76,
            IF = 77, ILIKE = 78, IN = 79, INDEX = 80, INF = 81, INJECTIVE = 82, INNER = 83, INSERT = 84,
            INTERVAL = 85, INTO = 86, IS = 87, IS_OBJECT_ID = 88, JOIN = 89, KEY = 90, KILL = 91,
            LAST = 92, LAYOUT = 93, LEADING = 94, LEFT = 95, LIFETIME = 96, LIKE = 97, LIMIT = 98,
            LIVE = 99, LOCAL = 100, LOGS = 101, MATERIALIZE = 102, MATERIALIZED = 103, MAX = 104,
            MERGES = 105, MIN = 106, MINUTE = 107, MODIFY = 108, MONTH = 109, MOVE = 110, MUTATION = 111,
            NAN_SQL = 112, NO = 113, NOT = 114, NULL_SQL = 115, NULLS = 116, OFFSET = 117, ON = 118,
            OPTIMIZE = 119, OR = 120, ORDER = 121, OUTER = 122, OUTFILE = 123, OVER = 124, PARTITION = 125,
            POPULATE = 126, PRECEDING = 127, PREWHERE = 128, PRIMARY = 129, PROJECTION = 130,
            QUARTER = 131, RANGE = 132, RELOAD = 133, REMOVE = 134, RENAME = 135, REPLACE = 136,
            REPLICA = 137, REPLICATED = 138, RIGHT = 139, ROLLUP = 140, ROW = 141, ROWS = 142,
            SAMPLE = 143, SECOND = 144, SELECT = 145, SEMI = 146, SENDS = 147, SET = 148, SETTINGS = 149,
            SHOW = 150, SOURCE = 151, START = 152, STOP = 153, SUBSTRING = 154, SYNC = 155, SYNTAX = 156,
            SYSTEM = 157, TABLE = 158, TABLES = 159, TEMPORARY = 160, TEST = 161, THEN = 162,
            TIES = 163, TIMEOUT = 164, TIMESTAMP = 165, TO = 166, TOP = 167, TOTALS = 168, TRAILING = 169,
            TRIM = 170, TRUNCATE = 171, TTL = 172, TYPE = 173, UNBOUNDED = 174, UNION = 175, UPDATE = 176,
            USE = 177, USING = 178, UUID = 179, VALUES = 180, VIEW = 181, VOLUME = 182, WATCH = 183,
            WEEK = 184, WHEN = 185, WHERE = 186, WINDOW = 187, WITH = 188, YEAR = 189, JSON_FALSE = 190,
            JSON_TRUE = 191, IDENTIFIER = 192, FLOATING_LITERAL = 193, OCTAL_LITERAL = 194,
            DECIMAL_LITERAL = 195, HEXADECIMAL_LITERAL = 196, STRING_LITERAL = 197, ARROW = 198,
            ASTERISK = 199, BACKQUOTE = 200, BACKSLASH = 201, COLON = 202, COMMA = 203, CONCAT = 204,
            DASH = 205, DOT = 206, EQ_DOUBLE = 207, EQ_SINGLE = 208, GE = 209, GT = 210, LBRACE = 211,
            LBRACKET = 212, LE = 213, LPAREN = 214, LT = 215, NOT_EQ = 216, PERCENT = 217, PLUS = 218,
            QUERY = 219, QUOTE_DOUBLE = 220, QUOTE_SINGLE = 221, RBRACE = 222, RBRACKET = 223,
            RPAREN = 224, SEMICOLON = 225, SLASH = 226, UNDERSCORE = 227, MULTI_LINE_COMMENT = 228,
            SINGLE_LINE_COMMENT = 229, WHITESPACE = 230;
    public static final int
            RULE_queryStmt = 0, RULE_query = 1, RULE_ctes = 2, RULE_namedQuery = 3,
            RULE_columnAliases = 4, RULE_alterStmt = 5, RULE_alterTableClause = 6,
            RULE_assignmentExprList = 7, RULE_assignmentExpr = 8, RULE_tableColumnPropertyType = 9,
            RULE_partitionClause = 10, RULE_attachStmt = 11, RULE_checkStmt = 12,
            RULE_createStmt = 13, RULE_dictionarySchemaClause = 14, RULE_dictionaryAttrDfnt = 15,
            RULE_dictionaryEngineClause = 16, RULE_dictionaryPrimaryKeyClause = 17,
            RULE_dictionaryArgExpr = 18, RULE_sourceClause = 19, RULE_lifetimeClause = 20,
            RULE_layoutClause = 21, RULE_rangeClause = 22, RULE_dictionarySettingsClause = 23,
            RULE_clusterClause = 24, RULE_uuidClause = 25, RULE_destinationClause = 26,
            RULE_subqueryClause = 27, RULE_tableSchemaClause = 28, RULE_engineClause = 29,
            RULE_partitionByClause = 30, RULE_primaryKeyClause = 31, RULE_sampleByClause = 32,
            RULE_ttlClause = 33, RULE_engineExpr = 34, RULE_tableElementExpr = 35,
            RULE_tableColumnDfnt = 36, RULE_tableColumnPropertyExpr = 37, RULE_tableIndexDfnt = 38,
            RULE_tableProjectionDfnt = 39, RULE_codecExpr = 40, RULE_codecArgExpr = 41,
            RULE_ttlExpr = 42, RULE_describeStmt = 43, RULE_dropStmt = 44, RULE_existsStmt = 45,
            RULE_explainStmt = 46, RULE_insertStmt = 47, RULE_columnsClause = 48,
            RULE_dataClause = 49, RULE_assignmentValues = 50, RULE_assignmentValue = 51,
            RULE_killStmt = 52, RULE_optimizeStmt = 53, RULE_renameStmt = 54, RULE_projectionSelectStmt = 55,
            RULE_selectUnionStmt = 56, RULE_selectStmtWithParens = 57, RULE_selectStmt = 58,
            RULE_withClause = 59, RULE_topClause = 60, RULE_fromClause = 61, RULE_arrayJoinClause = 62,
            RULE_windowClause = 63, RULE_prewhereClause = 64, RULE_whereClause = 65,
            RULE_groupByClause = 66, RULE_havingClause = 67, RULE_orderByClause = 68,
            RULE_projectionOrderByClause = 69, RULE_limitByClause = 70, RULE_limitClause = 71,
            RULE_settingsClause = 72, RULE_joinExpr = 73, RULE_joinOp = 74, RULE_joinOpCross = 75,
            RULE_joinConstraintClause = 76, RULE_sampleClause = 77, RULE_limitExpr = 78,
            RULE_orderExprList = 79, RULE_orderExpr = 80, RULE_ratioExpr = 81, RULE_settingExprList = 82,
            RULE_settingExpr = 83, RULE_windowExpr = 84, RULE_winPartitionByClause = 85,
            RULE_winOrderByClause = 86, RULE_winFrameClause = 87, RULE_winFrameExtend = 88,
            RULE_winFrameBound = 89, RULE_setStmt = 90, RULE_showStmt = 91, RULE_systemStmt = 92,
            RULE_truncateStmt = 93, RULE_useStmt = 94, RULE_watchStmt = 95, RULE_columnTypeExpr = 96,
            RULE_columnExprList = 97, RULE_columnsExpr = 98, RULE_columnExpr = 99,
            RULE_columnArgList = 100, RULE_columnArgExpr = 101, RULE_columnLambdaExpr = 102,
            RULE_columnIdentifier = 103, RULE_nestedIdentifier = 104, RULE_tableExpr = 105,
            RULE_tableFunctionExpr = 106, RULE_tableIdentifier = 107, RULE_tableArgList = 108,
            RULE_tableArgExpr = 109, RULE_databaseIdentifier = 110, RULE_floatingLiteral = 111,
            RULE_numberLiteral = 112, RULE_literal = 113, RULE_interval = 114, RULE_keyword = 115,
            RULE_keywordForAlias = 116, RULE_alias = 117, RULE_identifier = 118, RULE_identifierOrNull = 119,
            RULE_enumValue = 120;

    private static String[] makeRuleNames() {
        return new String[]{
                "queryStmt", "query", "ctes", "namedQuery", "columnAliases", "alterStmt",
                "alterTableClause", "assignmentExprList", "assignmentExpr", "tableColumnPropertyType",
                "partitionClause", "attachStmt", "checkStmt", "createStmt", "dictionarySchemaClause",
                "dictionaryAttrDfnt", "dictionaryEngineClause", "dictionaryPrimaryKeyClause",
                "dictionaryArgExpr", "sourceClause", "lifetimeClause", "layoutClause",
                "rangeClause", "dictionarySettingsClause", "clusterClause", "uuidClause",
                "destinationClause", "subqueryClause", "tableSchemaClause", "engineClause",
                "partitionByClause", "primaryKeyClause", "sampleByClause", "ttlClause",
                "engineExpr", "tableElementExpr", "tableColumnDfnt", "tableColumnPropertyExpr",
                "tableIndexDfnt", "tableProjectionDfnt", "codecExpr", "codecArgExpr",
                "ttlExpr", "describeStmt", "dropStmt", "existsStmt", "explainStmt", "insertStmt",
                "columnsClause", "dataClause", "assignmentValues", "assignmentValue",
                "killStmt", "optimizeStmt", "renameStmt", "projectionSelectStmt", "selectUnionStmt",
                "selectStmtWithParens", "selectStmt", "withClause", "topClause", "fromClause",
                "arrayJoinClause", "windowClause", "prewhereClause", "whereClause", "groupByClause",
                "havingClause", "orderByClause", "projectionOrderByClause", "limitByClause",
                "limitClause", "settingsClause", "joinExpr", "joinOp", "joinOpCross",
                "joinConstraintClause", "sampleClause", "limitExpr", "orderExprList",
                "orderExpr", "ratioExpr", "settingExprList", "settingExpr", "windowExpr",
                "winPartitionByClause", "winOrderByClause", "winFrameClause", "winFrameExtend",
                "winFrameBound", "setStmt", "showStmt", "systemStmt", "truncateStmt",
                "useStmt", "watchStmt", "columnTypeExpr", "columnExprList", "columnsExpr",
                "columnExpr", "columnArgList", "columnArgExpr", "columnLambdaExpr", "columnIdentifier",
                "nestedIdentifier", "tableExpr", "tableFunctionExpr", "tableIdentifier",
                "tableArgList", "tableArgExpr", "databaseIdentifier", "floatingLiteral",
                "numberLiteral", "literal", "interval", "keyword", "keywordForAlias",
                "alias", "identifier", "identifierOrNull", "enumValue"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, "'false'",
                "'true'", null, null, null, null, null, null, "'->'", "'*'", "'`'", "'\\'",
                "':'", "','", "'||'", "'-'", "'.'", "'=='", "'='", "'>='", "'>'", "'{'",
                "'['", "'<='", "'('", "'<'", null, "'%'", "'+'", "'?'", "'\"'", "'''",
                "'}'", "']'", "')'", "';'", "'/'", "'_'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AND", "ANTI", "ANY",
                "ARRAY", "AS", "ASCENDING", "ASOF", "AST", "ASYNC", "ATTACH", "BETWEEN",
                "BOTH", "BY", "CASE", "CAST", "CHECK", "CLEAR", "CLUSTER", "CODEC", "COLLATE",
                "COLUMN", "COMMENT", "CONSTRAINT", "CREATE", "CROSS", "CUBE", "CURRENT",
                "DATABASE", "DATABASES", "DATE", "DAY", "DEDUPLICATE", "DEFAULT", "DELAY",
                "DELETE", "DESC", "DESCENDING", "DESCRIBE", "DETACH", "DICTIONARIES",
                "DICTIONARY", "DISK", "DISTINCT", "DISTRIBUTED", "DROP", "ELSE", "END",
                "ENGINE", "EVENTS", "EXISTS", "EXPLAIN", "EXPRESSION", "EXTRACT", "FETCHES",
                "FINAL", "FIRST", "FLUSH", "FOLLOWING", "FOR", "FORMAT", "FREEZE", "FROM",
                "FULL", "FUNCTION", "GLOBAL", "GRANULARITY", "GROUP", "HAVING", "HIERARCHICAL",
                "HOUR", "ID", "IF", "ILIKE", "IN", "INDEX", "INF", "INJECTIVE", "INNER",
                "INSERT", "INTERVAL", "INTO", "IS", "IS_OBJECT_ID", "JOIN", "KEY", "KILL",
                "LAST", "LAYOUT", "LEADING", "LEFT", "LIFETIME", "LIKE", "LIMIT", "LIVE",
                "LOCAL", "LOGS", "MATERIALIZE", "MATERIALIZED", "MAX", "MERGES", "MIN",
                "MINUTE", "MODIFY", "MONTH", "MOVE", "MUTATION", "NAN_SQL", "NO", "NOT",
                "NULL_SQL", "NULLS", "OFFSET", "ON", "OPTIMIZE", "OR", "ORDER", "OUTER",
                "OUTFILE", "OVER", "PARTITION", "POPULATE", "PRECEDING", "PREWHERE",
                "PRIMARY", "PROJECTION", "QUARTER", "RANGE", "RELOAD", "REMOVE", "RENAME",
                "REPLACE", "REPLICA", "REPLICATED", "RIGHT", "ROLLUP", "ROW", "ROWS",
                "SAMPLE", "SECOND", "SELECT", "SEMI", "SENDS", "SET", "SETTINGS", "SHOW",
                "SOURCE", "START", "STOP", "SUBSTRING", "SYNC", "SYNTAX", "SYSTEM", "TABLE",
                "TABLES", "TEMPORARY", "TEST", "THEN", "TIES", "TIMEOUT", "TIMESTAMP",
                "TO", "TOP", "TOTALS", "TRAILING", "TRIM", "TRUNCATE", "TTL", "TYPE",
                "UNBOUNDED", "UNION", "UPDATE", "USE", "USING", "UUID", "VALUES", "VIEW",
                "VOLUME", "WATCH", "WEEK", "WHEN", "WHERE", "WINDOW", "WITH", "YEAR",
                "JSON_FALSE", "JSON_TRUE", "IDENTIFIER", "FLOATING_LITERAL", "OCTAL_LITERAL",
                "DECIMAL_LITERAL", "HEXADECIMAL_LITERAL", "STRING_LITERAL", "ARROW",
                "ASTERISK", "BACKQUOTE", "BACKSLASH", "COLON", "COMMA", "CONCAT", "DASH",
                "DOT", "EQ_DOUBLE", "EQ_SINGLE", "GE", "GT", "LBRACE", "LBRACKET", "LE",
                "LPAREN", "LT", "NOT_EQ", "PERCENT", "PLUS", "QUERY", "QUOTE_DOUBLE",
                "QUOTE_SINGLE", "RBRACE", "RBRACKET", "RPAREN", "SEMICOLON", "SLASH",
                "UNDERSCORE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WHITESPACE"
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

    @Override
    public String getGrammarFileName() {
        return "ClickHouseParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public ClickHouseParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class QueryStmtContext extends ParserRuleContext {
        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode INTO() {
            return getToken(ClickHouseParser.INTO, 0);
        }

        public TerminalNode OUTFILE() {
            return getToken(ClickHouseParser.OUTFILE, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode FORMAT() {
            return getToken(ClickHouseParser.FORMAT, 0);
        }

        public IdentifierOrNullContext identifierOrNull() {
            return getRuleContext(IdentifierOrNullContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(ClickHouseParser.SEMICOLON, 0);
        }

        public InsertStmtContext insertStmt() {
            return getRuleContext(InsertStmtContext.class, 0);
        }

        public QueryStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterQueryStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitQueryStmt(this);
        }
    }

    public final QueryStmtContext queryStmt() throws RecognitionException {
        QueryStmtContext _localctx = new QueryStmtContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_queryStmt);
        int _la;
        try {
            setState(256);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ALTER:
                case ATTACH:
                case CHECK:
                case CREATE:
                case DESC:
                case DESCRIBE:
                case DETACH:
                case DROP:
                case EXISTS:
                case EXPLAIN:
                case KILL:
                case OPTIMIZE:
                case RENAME:
                case REPLACE:
                case SELECT:
                case SET:
                case SHOW:
                case SYSTEM:
                case TRUNCATE:
                case USE:
                case WATCH:
                case WITH:
                case LPAREN:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(242);
                    query();
                    setState(246);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == INTO) {
                        {
                            setState(243);
                            match(INTO);
                            setState(244);
                            match(OUTFILE);
                            setState(245);
                            match(STRING_LITERAL);
                        }
                    }

                    setState(250);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == FORMAT) {
                        {
                            setState(248);
                            match(FORMAT);
                            setState(249);
                            identifierOrNull();
                        }
                    }

                    setState(253);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == SEMICOLON) {
                        {
                            setState(252);
                            match(SEMICOLON);
                        }
                    }

                }
                break;
                case INSERT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(255);
                    insertStmt();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QueryContext extends ParserRuleContext {
        public AlterStmtContext alterStmt() {
            return getRuleContext(AlterStmtContext.class, 0);
        }

        public AttachStmtContext attachStmt() {
            return getRuleContext(AttachStmtContext.class, 0);
        }

        public CheckStmtContext checkStmt() {
            return getRuleContext(CheckStmtContext.class, 0);
        }

        public CreateStmtContext createStmt() {
            return getRuleContext(CreateStmtContext.class, 0);
        }

        public DescribeStmtContext describeStmt() {
            return getRuleContext(DescribeStmtContext.class, 0);
        }

        public DropStmtContext dropStmt() {
            return getRuleContext(DropStmtContext.class, 0);
        }

        public ExistsStmtContext existsStmt() {
            return getRuleContext(ExistsStmtContext.class, 0);
        }

        public ExplainStmtContext explainStmt() {
            return getRuleContext(ExplainStmtContext.class, 0);
        }

        public KillStmtContext killStmt() {
            return getRuleContext(KillStmtContext.class, 0);
        }

        public OptimizeStmtContext optimizeStmt() {
            return getRuleContext(OptimizeStmtContext.class, 0);
        }

        public RenameStmtContext renameStmt() {
            return getRuleContext(RenameStmtContext.class, 0);
        }

        public SelectUnionStmtContext selectUnionStmt() {
            return getRuleContext(SelectUnionStmtContext.class, 0);
        }

        public SetStmtContext setStmt() {
            return getRuleContext(SetStmtContext.class, 0);
        }

        public ShowStmtContext showStmt() {
            return getRuleContext(ShowStmtContext.class, 0);
        }

        public SystemStmtContext systemStmt() {
            return getRuleContext(SystemStmtContext.class, 0);
        }

        public TruncateStmtContext truncateStmt() {
            return getRuleContext(TruncateStmtContext.class, 0);
        }

        public UseStmtContext useStmt() {
            return getRuleContext(UseStmtContext.class, 0);
        }

        public WatchStmtContext watchStmt() {
            return getRuleContext(WatchStmtContext.class, 0);
        }

        public SelectStmtContext selectStmt() {
            return getRuleContext(SelectStmtContext.class, 0);
        }

        public CtesContext ctes() {
            return getRuleContext(CtesContext.class, 0);
        }

        public QueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_query;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitQuery(this);
        }
    }

    public final QueryContext query() throws RecognitionException {
        QueryContext _localctx = new QueryContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_query);
        try {
            setState(280);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(258);
                    alterStmt();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(259);
                    attachStmt();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(260);
                    checkStmt();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(261);
                    createStmt();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(262);
                    describeStmt();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(263);
                    dropStmt();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(264);
                    existsStmt();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(265);
                    explainStmt();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(266);
                    killStmt();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(267);
                    optimizeStmt();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(268);
                    renameStmt();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(269);
                    selectUnionStmt();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(270);
                    setStmt();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(271);
                    showStmt();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(272);
                    systemStmt();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(273);
                    truncateStmt();
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(274);
                    useStmt();
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(275);
                    watchStmt();
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(277);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                        case 1: {
                            setState(276);
                            ctes();
                        }
                        break;
                    }
                    setState(279);
                    selectStmt();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CtesContext extends ParserRuleContext {
        public TerminalNode WITH() {
            return getToken(ClickHouseParser.WITH, 0);
        }

        public List<NamedQueryContext> namedQuery() {
            return getRuleContexts(NamedQueryContext.class);
        }

        public NamedQueryContext namedQuery(int i) {
            return getRuleContext(NamedQueryContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public CtesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ctes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterCtes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitCtes(this);
        }
    }

    public final CtesContext ctes() throws RecognitionException {
        CtesContext _localctx = new CtesContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_ctes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                match(WITH);
                setState(283);
                namedQuery();
                setState(288);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(284);
                            match(COMMA);
                            setState(285);
                            namedQuery();
                        }
                    }
                    setState(290);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NamedQueryContext extends ParserRuleContext {
        public IdentifierContext name;

        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColumnAliasesContext columnAliases() {
            return getRuleContext(ColumnAliasesContext.class, 0);
        }

        public NamedQueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedQuery;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterNamedQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitNamedQuery(this);
        }
    }

    public final NamedQueryContext namedQuery() throws RecognitionException {
        NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_namedQuery);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
                ((NamedQueryContext) _localctx).name = identifier();
                setState(293);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(292);
                        columnAliases();
                    }
                }

                setState(295);
                match(AS);
                setState(296);
                match(LPAREN);
                setState(297);
                query();
                setState(298);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnAliasesContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnAliases;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnAliases(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnAliases(this);
        }
    }

    public final ColumnAliasesContext columnAliases() throws RecognitionException {
        ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_columnAliases);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(300);
                match(LPAREN);
                setState(301);
                identifier();
                setState(306);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(302);
                            match(COMMA);
                            setState(303);
                            identifier();
                        }
                    }
                    setState(308);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(309);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AlterStmtContext extends ParserRuleContext {
        public AlterStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alterStmt;
        }

        public AlterStmtContext() {
        }

        public void copyFrom(AlterStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AlterTableStmtContext extends AlterStmtContext {
        public TerminalNode ALTER() {
            return getToken(ClickHouseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public List<AlterTableClauseContext> alterTableClause() {
            return getRuleContexts(AlterTableClauseContext.class);
        }

        public AlterTableClauseContext alterTableClause(int i) {
            return getRuleContext(AlterTableClauseContext.class, i);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public AlterTableStmtContext(AlterStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableStmt(this);
        }
    }

    public final AlterStmtContext alterStmt() throws RecognitionException {
        AlterStmtContext _localctx = new AlterStmtContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_alterStmt);
        int _la;
        try {
            _localctx = new AlterTableStmtContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(311);
                match(ALTER);
                setState(312);
                match(TABLE);
                setState(313);
                tableIdentifier();
                setState(315);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ON) {
                    {
                        setState(314);
                        clusterClause();
                    }
                }

                setState(317);
                alterTableClause();
                setState(322);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(318);
                            match(COMMA);
                            setState(319);
                            alterTableClause();
                        }
                    }
                    setState(324);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AlterTableClauseContext extends ParserRuleContext {
        public AlterTableClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alterTableClause;
        }

        public AlterTableClauseContext() {
        }

        public void copyFrom(AlterTableClauseContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AlterTableClauseReplaceContext extends AlterTableClauseContext {
        public TerminalNode REPLACE() {
            return getToken(ClickHouseParser.REPLACE, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public AlterTableClauseReplaceContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseReplace(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseReplace(this);
        }
    }

    public static class AlterTableClauseModifyOrderByContext extends AlterTableClauseContext {
        public TerminalNode MODIFY() {
            return getToken(ClickHouseParser.MODIFY, 0);
        }

        public TerminalNode ORDER() {
            return getToken(ClickHouseParser.ORDER, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public AlterTableClauseModifyOrderByContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseModifyOrderBy(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseModifyOrderBy(this);
        }
    }

    public static class AlterTableClauseUpdateContext extends AlterTableClauseContext {
        public TerminalNode UPDATE() {
            return getToken(ClickHouseParser.UPDATE, 0);
        }

        public AssignmentExprListContext assignmentExprList() {
            return getRuleContext(AssignmentExprListContext.class, 0);
        }

        public WhereClauseContext whereClause() {
            return getRuleContext(WhereClauseContext.class, 0);
        }

        public AlterTableClauseUpdateContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseUpdate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseUpdate(this);
        }
    }

    public static class AlterTableClauseClearProjectionContext extends AlterTableClauseContext {
        public TerminalNode CLEAR() {
            return getToken(ClickHouseParser.CLEAR, 0);
        }

        public TerminalNode PROJECTION() {
            return getToken(ClickHouseParser.PROJECTION, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode IN() {
            return getToken(ClickHouseParser.IN, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public AlterTableClauseClearProjectionContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseClearProjection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseClearProjection(this);
        }
    }

    public static class AlterTableClauseModifyRemoveContext extends AlterTableClauseContext {
        public TerminalNode MODIFY() {
            return getToken(ClickHouseParser.MODIFY, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode REMOVE() {
            return getToken(ClickHouseParser.REMOVE, 0);
        }

        public TableColumnPropertyTypeContext tableColumnPropertyType() {
            return getRuleContext(TableColumnPropertyTypeContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseModifyRemoveContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseModifyRemove(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseModifyRemove(this);
        }
    }

    public static class AlterTableClauseDeleteContext extends AlterTableClauseContext {
        public TerminalNode DELETE() {
            return getToken(ClickHouseParser.DELETE, 0);
        }

        public TerminalNode WHERE() {
            return getToken(ClickHouseParser.WHERE, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public AlterTableClauseDeleteContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseDelete(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseDelete(this);
        }
    }

    public static class AlterTableClauseCommentContext extends AlterTableClauseContext {
        public TerminalNode COMMENT() {
            return getToken(ClickHouseParser.COMMENT, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseCommentContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseComment(this);
        }
    }

    public static class AlterTableClauseDropColumnContext extends AlterTableClauseContext {
        public TerminalNode DROP() {
            return getToken(ClickHouseParser.DROP, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseDropColumnContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseDropColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseDropColumn(this);
        }
    }

    public static class AlterTableClauseDetachContext extends AlterTableClauseContext {
        public TerminalNode DETACH() {
            return getToken(ClickHouseParser.DETACH, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public AlterTableClauseDetachContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseDetach(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseDetach(this);
        }
    }

    public static class AlterTableClauseAddIndexContext extends AlterTableClauseContext {
        public TerminalNode ADD() {
            return getToken(ClickHouseParser.ADD, 0);
        }

        public TerminalNode INDEX() {
            return getToken(ClickHouseParser.INDEX, 0);
        }

        public TableIndexDfntContext tableIndexDfnt() {
            return getRuleContext(TableIndexDfntContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode AFTER() {
            return getToken(ClickHouseParser.AFTER, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public AlterTableClauseAddIndexContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseAddIndex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseAddIndex(this);
        }
    }

    public static class AlterTableClauseDropPartitionContext extends AlterTableClauseContext {
        public TerminalNode DROP() {
            return getToken(ClickHouseParser.DROP, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public AlterTableClauseDropPartitionContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseDropPartition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseDropPartition(this);
        }
    }

    public static class AlterTableClauseMaterializeIndexContext extends AlterTableClauseContext {
        public TerminalNode MATERIALIZE() {
            return getToken(ClickHouseParser.MATERIALIZE, 0);
        }

        public TerminalNode INDEX() {
            return getToken(ClickHouseParser.INDEX, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode IN() {
            return getToken(ClickHouseParser.IN, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public AlterTableClauseMaterializeIndexContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseMaterializeIndex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseMaterializeIndex(this);
        }
    }

    public static class AlterTableClauseMaterializeProjectionContext extends AlterTableClauseContext {
        public TerminalNode MATERIALIZE() {
            return getToken(ClickHouseParser.MATERIALIZE, 0);
        }

        public TerminalNode PROJECTION() {
            return getToken(ClickHouseParser.PROJECTION, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode IN() {
            return getToken(ClickHouseParser.IN, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public AlterTableClauseMaterializeProjectionContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseMaterializeProjection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseMaterializeProjection(this);
        }
    }

    public static class AlterTableClauseMovePartitionContext extends AlterTableClauseContext {
        public TerminalNode MOVE() {
            return getToken(ClickHouseParser.MOVE, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public TerminalNode TO() {
            return getToken(ClickHouseParser.TO, 0);
        }

        public TerminalNode DISK() {
            return getToken(ClickHouseParser.DISK, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode VOLUME() {
            return getToken(ClickHouseParser.VOLUME, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public AlterTableClauseMovePartitionContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseMovePartition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseMovePartition(this);
        }
    }

    public static class AlterTableClauseRenameContext extends AlterTableClauseContext {
        public TerminalNode RENAME() {
            return getToken(ClickHouseParser.RENAME, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public List<NestedIdentifierContext> nestedIdentifier() {
            return getRuleContexts(NestedIdentifierContext.class);
        }

        public NestedIdentifierContext nestedIdentifier(int i) {
            return getRuleContext(NestedIdentifierContext.class, i);
        }

        public TerminalNode TO() {
            return getToken(ClickHouseParser.TO, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseRenameContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseRename(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseRename(this);
        }
    }

    public static class AlterTableClauseFreezePartitionContext extends AlterTableClauseContext {
        public TerminalNode FREEZE() {
            return getToken(ClickHouseParser.FREEZE, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public AlterTableClauseFreezePartitionContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseFreezePartition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseFreezePartition(this);
        }
    }

    public static class AlterTableClauseClearColumnContext extends AlterTableClauseContext {
        public TerminalNode CLEAR() {
            return getToken(ClickHouseParser.CLEAR, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode IN() {
            return getToken(ClickHouseParser.IN, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public AlterTableClauseClearColumnContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseClearColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseClearColumn(this);
        }
    }

    public static class AlterTableClauseModifyContext extends AlterTableClauseContext {
        public TerminalNode MODIFY() {
            return getToken(ClickHouseParser.MODIFY, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public TableColumnDfntContext tableColumnDfnt() {
            return getRuleContext(TableColumnDfntContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseModifyContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseModify(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseModify(this);
        }
    }

    public static class AlterTableClauseClearIndexContext extends AlterTableClauseContext {
        public TerminalNode CLEAR() {
            return getToken(ClickHouseParser.CLEAR, 0);
        }

        public TerminalNode INDEX() {
            return getToken(ClickHouseParser.INDEX, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode IN() {
            return getToken(ClickHouseParser.IN, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public AlterTableClauseClearIndexContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseClearIndex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseClearIndex(this);
        }
    }

    public static class AlterTableClauseRemoveTTLContext extends AlterTableClauseContext {
        public TerminalNode REMOVE() {
            return getToken(ClickHouseParser.REMOVE, 0);
        }

        public TerminalNode TTL() {
            return getToken(ClickHouseParser.TTL, 0);
        }

        public AlterTableClauseRemoveTTLContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseRemoveTTL(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseRemoveTTL(this);
        }
    }

    public static class AlterTableClauseModifyCodecContext extends AlterTableClauseContext {
        public TerminalNode MODIFY() {
            return getToken(ClickHouseParser.MODIFY, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public CodecExprContext codecExpr() {
            return getRuleContext(CodecExprContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseModifyCodecContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseModifyCodec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseModifyCodec(this);
        }
    }

    public static class AlterTableClauseAttachContext extends AlterTableClauseContext {
        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public AlterTableClauseAttachContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseAttach(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseAttach(this);
        }
    }

    public static class AlterTableClauseDropProjectionContext extends AlterTableClauseContext {
        public TerminalNode DROP() {
            return getToken(ClickHouseParser.DROP, 0);
        }

        public TerminalNode PROJECTION() {
            return getToken(ClickHouseParser.PROJECTION, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseDropProjectionContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseDropProjection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseDropProjection(this);
        }
    }

    public static class AlterTableClauseDropIndexContext extends AlterTableClauseContext {
        public TerminalNode DROP() {
            return getToken(ClickHouseParser.DROP, 0);
        }

        public TerminalNode INDEX() {
            return getToken(ClickHouseParser.INDEX, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseDropIndexContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseDropIndex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseDropIndex(this);
        }
    }

    public static class AlterTableClauseModifyCommentContext extends AlterTableClauseContext {
        public TerminalNode MODIFY() {
            return getToken(ClickHouseParser.MODIFY, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(ClickHouseParser.COMMENT, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public AlterTableClauseModifyCommentContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseModifyComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseModifyComment(this);
        }
    }

    public static class AlterTableClauseModifyTTLContext extends AlterTableClauseContext {
        public TerminalNode MODIFY() {
            return getToken(ClickHouseParser.MODIFY, 0);
        }

        public TtlClauseContext ttlClause() {
            return getRuleContext(TtlClauseContext.class, 0);
        }

        public AlterTableClauseModifyTTLContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseModifyTTL(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseModifyTTL(this);
        }
    }

    public static class AlterTableClauseAddProjectionContext extends AlterTableClauseContext {
        public TerminalNode ADD() {
            return getToken(ClickHouseParser.ADD, 0);
        }

        public TerminalNode PROJECTION() {
            return getToken(ClickHouseParser.PROJECTION, 0);
        }

        public TableProjectionDfntContext tableProjectionDfnt() {
            return getRuleContext(TableProjectionDfntContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode AFTER() {
            return getToken(ClickHouseParser.AFTER, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public AlterTableClauseAddProjectionContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseAddProjection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseAddProjection(this);
        }
    }

    public static class AlterTableClauseAddColumnContext extends AlterTableClauseContext {
        public TerminalNode ADD() {
            return getToken(ClickHouseParser.ADD, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public TableColumnDfntContext tableColumnDfnt() {
            return getRuleContext(TableColumnDfntContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode AFTER() {
            return getToken(ClickHouseParser.AFTER, 0);
        }

        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public AlterTableClauseAddColumnContext(AlterTableClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAlterTableClauseAddColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAlterTableClauseAddColumn(this);
        }
    }

    public final AlterTableClauseContext alterTableClause() throws RecognitionException {
        AlterTableClauseContext _localctx = new AlterTableClauseContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_alterTableClause);
        int _la;
        try {
            setState(539);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                    _localctx = new AlterTableClauseAddColumnContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(325);
                    match(ADD);
                    setState(326);
                    match(COLUMN);
                    setState(330);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                        case 1: {
                            setState(327);
                            match(IF);
                            setState(328);
                            match(NOT);
                            setState(329);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(332);
                    tableColumnDfnt();
                    setState(335);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == AFTER) {
                        {
                            setState(333);
                            match(AFTER);
                            setState(334);
                            nestedIdentifier();
                        }
                    }

                }
                break;
                case 2:
                    _localctx = new AlterTableClauseAddIndexContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(337);
                    match(ADD);
                    setState(338);
                    match(INDEX);
                    setState(342);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                        case 1: {
                            setState(339);
                            match(IF);
                            setState(340);
                            match(NOT);
                            setState(341);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(344);
                    tableIndexDfnt();
                    setState(347);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == AFTER) {
                        {
                            setState(345);
                            match(AFTER);
                            setState(346);
                            nestedIdentifier();
                        }
                    }

                }
                break;
                case 3:
                    _localctx = new AlterTableClauseAddProjectionContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(349);
                    match(ADD);
                    setState(350);
                    match(PROJECTION);
                    setState(354);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                        case 1: {
                            setState(351);
                            match(IF);
                            setState(352);
                            match(NOT);
                            setState(353);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(356);
                    tableProjectionDfnt();
                    setState(359);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == AFTER) {
                        {
                            setState(357);
                            match(AFTER);
                            setState(358);
                            nestedIdentifier();
                        }
                    }

                }
                break;
                case 4:
                    _localctx = new AlterTableClauseAttachContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(361);
                    match(ATTACH);
                    setState(362);
                    partitionClause();
                    setState(365);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == FROM) {
                        {
                            setState(363);
                            match(FROM);
                            setState(364);
                            tableIdentifier();
                        }
                    }

                }
                break;
                case 5:
                    _localctx = new AlterTableClauseClearColumnContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(367);
                    match(CLEAR);
                    setState(368);
                    match(COLUMN);
                    setState(371);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                        case 1: {
                            setState(369);
                            match(IF);
                            setState(370);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(373);
                    nestedIdentifier();
                    setState(376);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IN) {
                        {
                            setState(374);
                            match(IN);
                            setState(375);
                            partitionClause();
                        }
                    }

                }
                break;
                case 6:
                    _localctx = new AlterTableClauseClearIndexContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(378);
                    match(CLEAR);
                    setState(379);
                    match(INDEX);
                    setState(382);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                        case 1: {
                            setState(380);
                            match(IF);
                            setState(381);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(384);
                    nestedIdentifier();
                    setState(387);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IN) {
                        {
                            setState(385);
                            match(IN);
                            setState(386);
                            partitionClause();
                        }
                    }

                }
                break;
                case 7:
                    _localctx = new AlterTableClauseClearProjectionContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(389);
                    match(CLEAR);
                    setState(390);
                    match(PROJECTION);
                    setState(393);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                        case 1: {
                            setState(391);
                            match(IF);
                            setState(392);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(395);
                    nestedIdentifier();
                    setState(398);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IN) {
                        {
                            setState(396);
                            match(IN);
                            setState(397);
                            partitionClause();
                        }
                    }

                }
                break;
                case 8:
                    _localctx = new AlterTableClauseCommentContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(400);
                    match(COMMENT);
                    setState(401);
                    match(COLUMN);
                    setState(404);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                        case 1: {
                            setState(402);
                            match(IF);
                            setState(403);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(406);
                    nestedIdentifier();
                    setState(407);
                    match(STRING_LITERAL);
                }
                break;
                case 9:
                    _localctx = new AlterTableClauseDeleteContext(_localctx);
                    enterOuterAlt(_localctx, 9);
                {
                    setState(409);
                    match(DELETE);
                    setState(410);
                    match(WHERE);
                    setState(411);
                    columnExpr(0);
                }
                break;
                case 10:
                    _localctx = new AlterTableClauseDetachContext(_localctx);
                    enterOuterAlt(_localctx, 10);
                {
                    setState(412);
                    match(DETACH);
                    setState(413);
                    partitionClause();
                }
                break;
                case 11:
                    _localctx = new AlterTableClauseDropColumnContext(_localctx);
                    enterOuterAlt(_localctx, 11);
                {
                    setState(414);
                    match(DROP);
                    setState(415);
                    match(COLUMN);
                    setState(418);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                        case 1: {
                            setState(416);
                            match(IF);
                            setState(417);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(420);
                    nestedIdentifier();
                }
                break;
                case 12:
                    _localctx = new AlterTableClauseDropIndexContext(_localctx);
                    enterOuterAlt(_localctx, 12);
                {
                    setState(421);
                    match(DROP);
                    setState(422);
                    match(INDEX);
                    setState(425);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                        case 1: {
                            setState(423);
                            match(IF);
                            setState(424);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(427);
                    nestedIdentifier();
                }
                break;
                case 13:
                    _localctx = new AlterTableClauseDropProjectionContext(_localctx);
                    enterOuterAlt(_localctx, 13);
                {
                    setState(428);
                    match(DROP);
                    setState(429);
                    match(PROJECTION);
                    setState(432);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                        case 1: {
                            setState(430);
                            match(IF);
                            setState(431);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(434);
                    nestedIdentifier();
                }
                break;
                case 14:
                    _localctx = new AlterTableClauseDropPartitionContext(_localctx);
                    enterOuterAlt(_localctx, 14);
                {
                    setState(435);
                    match(DROP);
                    setState(436);
                    partitionClause();
                }
                break;
                case 15:
                    _localctx = new AlterTableClauseFreezePartitionContext(_localctx);
                    enterOuterAlt(_localctx, 15);
                {
                    setState(437);
                    match(FREEZE);
                    setState(439);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == PARTITION) {
                        {
                            setState(438);
                            partitionClause();
                        }
                    }

                }
                break;
                case 16:
                    _localctx = new AlterTableClauseMaterializeIndexContext(_localctx);
                    enterOuterAlt(_localctx, 16);
                {
                    setState(441);
                    match(MATERIALIZE);
                    setState(442);
                    match(INDEX);
                    setState(445);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
                        case 1: {
                            setState(443);
                            match(IF);
                            setState(444);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(447);
                    nestedIdentifier();
                    setState(450);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IN) {
                        {
                            setState(448);
                            match(IN);
                            setState(449);
                            partitionClause();
                        }
                    }

                }
                break;
                case 17:
                    _localctx = new AlterTableClauseMaterializeProjectionContext(_localctx);
                    enterOuterAlt(_localctx, 17);
                {
                    setState(452);
                    match(MATERIALIZE);
                    setState(453);
                    match(PROJECTION);
                    setState(456);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                        case 1: {
                            setState(454);
                            match(IF);
                            setState(455);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(458);
                    nestedIdentifier();
                    setState(461);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IN) {
                        {
                            setState(459);
                            match(IN);
                            setState(460);
                            partitionClause();
                        }
                    }

                }
                break;
                case 18:
                    _localctx = new AlterTableClauseModifyCodecContext(_localctx);
                    enterOuterAlt(_localctx, 18);
                {
                    setState(463);
                    match(MODIFY);
                    setState(464);
                    match(COLUMN);
                    setState(467);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                        case 1: {
                            setState(465);
                            match(IF);
                            setState(466);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(469);
                    nestedIdentifier();
                    setState(470);
                    codecExpr();
                }
                break;
                case 19:
                    _localctx = new AlterTableClauseModifyCommentContext(_localctx);
                    enterOuterAlt(_localctx, 19);
                {
                    setState(472);
                    match(MODIFY);
                    setState(473);
                    match(COLUMN);
                    setState(476);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
                        case 1: {
                            setState(474);
                            match(IF);
                            setState(475);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(478);
                    nestedIdentifier();
                    setState(479);
                    match(COMMENT);
                    setState(480);
                    match(STRING_LITERAL);
                }
                break;
                case 20:
                    _localctx = new AlterTableClauseModifyRemoveContext(_localctx);
                    enterOuterAlt(_localctx, 20);
                {
                    setState(482);
                    match(MODIFY);
                    setState(483);
                    match(COLUMN);
                    setState(486);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                        case 1: {
                            setState(484);
                            match(IF);
                            setState(485);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(488);
                    nestedIdentifier();
                    setState(489);
                    match(REMOVE);
                    setState(490);
                    tableColumnPropertyType();
                }
                break;
                case 21:
                    _localctx = new AlterTableClauseModifyContext(_localctx);
                    enterOuterAlt(_localctx, 21);
                {
                    setState(492);
                    match(MODIFY);
                    setState(493);
                    match(COLUMN);
                    setState(496);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                        case 1: {
                            setState(494);
                            match(IF);
                            setState(495);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(498);
                    tableColumnDfnt();
                }
                break;
                case 22:
                    _localctx = new AlterTableClauseModifyOrderByContext(_localctx);
                    enterOuterAlt(_localctx, 22);
                {
                    setState(499);
                    match(MODIFY);
                    setState(500);
                    match(ORDER);
                    setState(501);
                    match(BY);
                    setState(502);
                    columnExpr(0);
                }
                break;
                case 23:
                    _localctx = new AlterTableClauseModifyTTLContext(_localctx);
                    enterOuterAlt(_localctx, 23);
                {
                    setState(503);
                    match(MODIFY);
                    setState(504);
                    ttlClause();
                }
                break;
                case 24:
                    _localctx = new AlterTableClauseMovePartitionContext(_localctx);
                    enterOuterAlt(_localctx, 24);
                {
                    setState(505);
                    match(MOVE);
                    setState(506);
                    partitionClause();
                    setState(516);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                        case 1: {
                            setState(507);
                            match(TO);
                            setState(508);
                            match(DISK);
                            setState(509);
                            match(STRING_LITERAL);
                        }
                        break;
                        case 2: {
                            setState(510);
                            match(TO);
                            setState(511);
                            match(VOLUME);
                            setState(512);
                            match(STRING_LITERAL);
                        }
                        break;
                        case 3: {
                            setState(513);
                            match(TO);
                            setState(514);
                            match(TABLE);
                            setState(515);
                            tableIdentifier();
                        }
                        break;
                    }
                }
                break;
                case 25:
                    _localctx = new AlterTableClauseRemoveTTLContext(_localctx);
                    enterOuterAlt(_localctx, 25);
                {
                    setState(518);
                    match(REMOVE);
                    setState(519);
                    match(TTL);
                }
                break;
                case 26:
                    _localctx = new AlterTableClauseRenameContext(_localctx);
                    enterOuterAlt(_localctx, 26);
                {
                    setState(520);
                    match(RENAME);
                    setState(521);
                    match(COLUMN);
                    setState(524);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
                        case 1: {
                            setState(522);
                            match(IF);
                            setState(523);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(526);
                    nestedIdentifier();
                    setState(527);
                    match(TO);
                    setState(528);
                    nestedIdentifier();
                }
                break;
                case 27:
                    _localctx = new AlterTableClauseReplaceContext(_localctx);
                    enterOuterAlt(_localctx, 27);
                {
                    setState(530);
                    match(REPLACE);
                    setState(531);
                    partitionClause();
                    setState(532);
                    match(FROM);
                    setState(533);
                    tableIdentifier();
                }
                break;
                case 28:
                    _localctx = new AlterTableClauseUpdateContext(_localctx);
                    enterOuterAlt(_localctx, 28);
                {
                    setState(535);
                    match(UPDATE);
                    setState(536);
                    assignmentExprList();
                    setState(537);
                    whereClause();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentExprListContext extends ParserRuleContext {
        public List<AssignmentExprContext> assignmentExpr() {
            return getRuleContexts(AssignmentExprContext.class);
        }

        public AssignmentExprContext assignmentExpr(int i) {
            return getRuleContext(AssignmentExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public AssignmentExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignmentExprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAssignmentExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAssignmentExprList(this);
        }
    }

    public final AssignmentExprListContext assignmentExprList() throws RecognitionException {
        AssignmentExprListContext _localctx = new AssignmentExprListContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_assignmentExprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(541);
                assignmentExpr();
                setState(546);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(542);
                            match(COMMA);
                            setState(543);
                            assignmentExpr();
                        }
                    }
                    setState(548);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentExprContext extends ParserRuleContext {
        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TerminalNode EQ_SINGLE() {
            return getToken(ClickHouseParser.EQ_SINGLE, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignmentExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAssignmentExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAssignmentExpr(this);
        }
    }

    public final AssignmentExprContext assignmentExpr() throws RecognitionException {
        AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_assignmentExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(549);
                nestedIdentifier();
                setState(550);
                match(EQ_SINGLE);
                setState(551);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableColumnPropertyTypeContext extends ParserRuleContext {
        public TerminalNode ALIAS() {
            return getToken(ClickHouseParser.ALIAS, 0);
        }

        public TerminalNode CODEC() {
            return getToken(ClickHouseParser.CODEC, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(ClickHouseParser.COMMENT, 0);
        }

        public TerminalNode DEFAULT() {
            return getToken(ClickHouseParser.DEFAULT, 0);
        }

        public TerminalNode MATERIALIZED() {
            return getToken(ClickHouseParser.MATERIALIZED, 0);
        }

        public TerminalNode TTL() {
            return getToken(ClickHouseParser.TTL, 0);
        }

        public TableColumnPropertyTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableColumnPropertyType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableColumnPropertyType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableColumnPropertyType(this);
        }
    }

    public final TableColumnPropertyTypeContext tableColumnPropertyType() throws RecognitionException {
        TableColumnPropertyTypeContext _localctx = new TableColumnPropertyTypeContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_tableColumnPropertyType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(553);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << CODEC) | (1L << COMMENT) | (1L << DEFAULT))) != 0) || _la == MATERIALIZED || _la == TTL)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PartitionClauseContext extends ParserRuleContext {
        public TerminalNode PARTITION() {
            return getToken(ClickHouseParser.PARTITION, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(ClickHouseParser.ID, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_partitionClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterPartitionClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitPartitionClause(this);
        }
    }

    public final PartitionClauseContext partitionClause() throws RecognitionException {
        PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_partitionClause);
        try {
            setState(560);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(555);
                    match(PARTITION);
                    setState(556);
                    columnExpr(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(557);
                    match(PARTITION);
                    setState(558);
                    match(ID);
                    setState(559);
                    match(STRING_LITERAL);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AttachStmtContext extends ParserRuleContext {
        public AttachStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_attachStmt;
        }

        public AttachStmtContext() {
        }

        public void copyFrom(AttachStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AttachDictionaryStmtContext extends AttachStmtContext {
        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode DICTIONARY() {
            return getToken(ClickHouseParser.DICTIONARY, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public AttachDictionaryStmtContext(AttachStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAttachDictionaryStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAttachDictionaryStmt(this);
        }
    }

    public final AttachStmtContext attachStmt() throws RecognitionException {
        AttachStmtContext _localctx = new AttachStmtContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_attachStmt);
        int _la;
        try {
            _localctx = new AttachDictionaryStmtContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(562);
                match(ATTACH);
                setState(563);
                match(DICTIONARY);
                setState(564);
                tableIdentifier();
                setState(566);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ON) {
                    {
                        setState(565);
                        clusterClause();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CheckStmtContext extends ParserRuleContext {
        public TerminalNode CHECK() {
            return getToken(ClickHouseParser.CHECK, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public CheckStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_checkStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCheckStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitCheckStmt(this);
        }
    }

    public final CheckStmtContext checkStmt() throws RecognitionException {
        CheckStmtContext _localctx = new CheckStmtContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_checkStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(568);
                match(CHECK);
                setState(569);
                match(TABLE);
                setState(570);
                tableIdentifier();
                setState(572);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == PARTITION) {
                    {
                        setState(571);
                        partitionClause();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CreateStmtContext extends ParserRuleContext {
        public CreateStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_createStmt;
        }

        public CreateStmtContext() {
        }

        public void copyFrom(CreateStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class CreateViewStmtContext extends CreateStmtContext {
        public TerminalNode VIEW() {
            return getToken(ClickHouseParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public SubqueryClauseContext subqueryClause() {
            return getRuleContext(SubqueryClauseContext.class, 0);
        }

        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode OR() {
            return getToken(ClickHouseParser.OR, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(ClickHouseParser.REPLACE, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public UuidClauseContext uuidClause() {
            return getRuleContext(UuidClauseContext.class, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public TableSchemaClauseContext tableSchemaClause() {
            return getRuleContext(TableSchemaClauseContext.class, 0);
        }

        public CreateViewStmtContext(CreateStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCreateViewStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitCreateViewStmt(this);
        }
    }

    public static class CreateDictionaryStmtContext extends CreateStmtContext {
        public TerminalNode DICTIONARY() {
            return getToken(ClickHouseParser.DICTIONARY, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public DictionarySchemaClauseContext dictionarySchemaClause() {
            return getRuleContext(DictionarySchemaClauseContext.class, 0);
        }

        public DictionaryEngineClauseContext dictionaryEngineClause() {
            return getRuleContext(DictionaryEngineClauseContext.class, 0);
        }

        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(ClickHouseParser.REPLACE, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public UuidClauseContext uuidClause() {
            return getRuleContext(UuidClauseContext.class, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public TerminalNode OR() {
            return getToken(ClickHouseParser.OR, 0);
        }

        public CreateDictionaryStmtContext(CreateStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCreateDictionaryStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitCreateDictionaryStmt(this);
        }
    }

    public static class CreateDatabaseStmtContext extends CreateStmtContext {
        public TerminalNode DATABASE() {
            return getToken(ClickHouseParser.DATABASE, 0);
        }

        public DatabaseIdentifierContext databaseIdentifier() {
            return getRuleContext(DatabaseIdentifierContext.class, 0);
        }

        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public EngineExprContext engineExpr() {
            return getRuleContext(EngineExprContext.class, 0);
        }

        public CreateDatabaseStmtContext(CreateStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCreateDatabaseStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitCreateDatabaseStmt(this);
        }
    }

    public static class CreateLiveViewStmtContext extends CreateStmtContext {
        public TerminalNode LIVE() {
            return getToken(ClickHouseParser.LIVE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(ClickHouseParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public SubqueryClauseContext subqueryClause() {
            return getRuleContext(SubqueryClauseContext.class, 0);
        }

        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public UuidClauseContext uuidClause() {
            return getRuleContext(UuidClauseContext.class, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public TerminalNode WITH() {
            return getToken(ClickHouseParser.WITH, 0);
        }

        public TerminalNode TIMEOUT() {
            return getToken(ClickHouseParser.TIMEOUT, 0);
        }

        public DestinationClauseContext destinationClause() {
            return getRuleContext(DestinationClauseContext.class, 0);
        }

        public TableSchemaClauseContext tableSchemaClause() {
            return getRuleContext(TableSchemaClauseContext.class, 0);
        }

        public TerminalNode DECIMAL_LITERAL() {
            return getToken(ClickHouseParser.DECIMAL_LITERAL, 0);
        }

        public CreateLiveViewStmtContext(CreateStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCreateLiveViewStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitCreateLiveViewStmt(this);
        }
    }

    public static class CreateMaterializedViewStmtContext extends CreateStmtContext {
        public TerminalNode MATERIALIZED() {
            return getToken(ClickHouseParser.MATERIALIZED, 0);
        }

        public TerminalNode VIEW() {
            return getToken(ClickHouseParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public SubqueryClauseContext subqueryClause() {
            return getRuleContext(SubqueryClauseContext.class, 0);
        }

        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public DestinationClauseContext destinationClause() {
            return getRuleContext(DestinationClauseContext.class, 0);
        }

        public EngineClauseContext engineClause() {
            return getRuleContext(EngineClauseContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public UuidClauseContext uuidClause() {
            return getRuleContext(UuidClauseContext.class, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public TableSchemaClauseContext tableSchemaClause() {
            return getRuleContext(TableSchemaClauseContext.class, 0);
        }

        public TerminalNode POPULATE() {
            return getToken(ClickHouseParser.POPULATE, 0);
        }

        public CreateMaterializedViewStmtContext(CreateStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCreateMaterializedViewStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitCreateMaterializedViewStmt(this);
        }
    }

    public static class CreateTableStmtContext extends CreateStmtContext {
        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(ClickHouseParser.REPLACE, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(ClickHouseParser.TEMPORARY, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public UuidClauseContext uuidClause() {
            return getRuleContext(UuidClauseContext.class, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public TableSchemaClauseContext tableSchemaClause() {
            return getRuleContext(TableSchemaClauseContext.class, 0);
        }

        public EngineClauseContext engineClause() {
            return getRuleContext(EngineClauseContext.class, 0);
        }

        public SubqueryClauseContext subqueryClause() {
            return getRuleContext(SubqueryClauseContext.class, 0);
        }

        public TerminalNode OR() {
            return getToken(ClickHouseParser.OR, 0);
        }

        public CreateTableStmtContext(CreateStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCreateTableStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitCreateTableStmt(this);
        }
    }

    public final CreateStmtContext createStmt() throws RecognitionException {
        CreateStmtContext _localctx = new CreateStmtContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_createStmt);
        int _la;
        try {
            setState(727);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 79, _ctx)) {
                case 1:
                    _localctx = new CreateDatabaseStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(574);
                    _la = _input.LA(1);
                    if (!(_la == ATTACH || _la == CREATE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(575);
                    match(DATABASE);
                    setState(579);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
                        case 1: {
                            setState(576);
                            match(IF);
                            setState(577);
                            match(NOT);
                            setState(578);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(581);
                    databaseIdentifier();
                    setState(583);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ON) {
                        {
                            setState(582);
                            clusterClause();
                        }
                    }

                    setState(586);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ENGINE) {
                        {
                            setState(585);
                            engineExpr();
                        }
                    }

                }
                break;
                case 2:
                    _localctx = new CreateDictionaryStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(595);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case ATTACH: {
                            setState(588);
                            match(ATTACH);
                        }
                        break;
                        case CREATE: {
                            setState(589);
                            match(CREATE);
                            setState(592);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == OR) {
                                {
                                    setState(590);
                                    match(OR);
                                    setState(591);
                                    match(REPLACE);
                                }
                            }

                        }
                        break;
                        case REPLACE: {
                            setState(594);
                            match(REPLACE);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(597);
                    match(DICTIONARY);
                    setState(601);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
                        case 1: {
                            setState(598);
                            match(IF);
                            setState(599);
                            match(NOT);
                            setState(600);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(603);
                    tableIdentifier();
                    setState(605);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == UUID) {
                        {
                            setState(604);
                            uuidClause();
                        }
                    }

                    setState(608);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ON) {
                        {
                            setState(607);
                            clusterClause();
                        }
                    }

                    setState(610);
                    dictionarySchemaClause();
                    setState(611);
                    dictionaryEngineClause();
                }
                break;
                case 3:
                    _localctx = new CreateLiveViewStmtContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(613);
                    _la = _input.LA(1);
                    if (!(_la == ATTACH || _la == CREATE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(614);
                    match(LIVE);
                    setState(615);
                    match(VIEW);
                    setState(619);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 52, _ctx)) {
                        case 1: {
                            setState(616);
                            match(IF);
                            setState(617);
                            match(NOT);
                            setState(618);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(621);
                    tableIdentifier();
                    setState(623);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == UUID) {
                        {
                            setState(622);
                            uuidClause();
                        }
                    }

                    setState(626);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ON) {
                        {
                            setState(625);
                            clusterClause();
                        }
                    }

                    setState(633);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == WITH) {
                        {
                            setState(628);
                            match(WITH);
                            setState(629);
                            match(TIMEOUT);
                            setState(631);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == DECIMAL_LITERAL) {
                                {
                                    setState(630);
                                    match(DECIMAL_LITERAL);
                                }
                            }

                        }
                    }

                    setState(636);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TO) {
                        {
                            setState(635);
                            destinationClause();
                        }
                    }

                    setState(639);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 58, _ctx)) {
                        case 1: {
                            setState(638);
                            tableSchemaClause();
                        }
                        break;
                    }
                    setState(641);
                    subqueryClause();
                }
                break;
                case 4:
                    _localctx = new CreateMaterializedViewStmtContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(643);
                    _la = _input.LA(1);
                    if (!(_la == ATTACH || _la == CREATE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(644);
                    match(MATERIALIZED);
                    setState(645);
                    match(VIEW);
                    setState(649);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
                        case 1: {
                            setState(646);
                            match(IF);
                            setState(647);
                            match(NOT);
                            setState(648);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(651);
                    tableIdentifier();
                    setState(653);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == UUID) {
                        {
                            setState(652);
                            uuidClause();
                        }
                    }

                    setState(656);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ON) {
                        {
                            setState(655);
                            clusterClause();
                        }
                    }

                    setState(659);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == AS || _la == LPAREN) {
                        {
                            setState(658);
                            tableSchemaClause();
                        }
                    }

                    setState(666);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case TO: {
                            setState(661);
                            destinationClause();
                        }
                        break;
                        case ENGINE: {
                            setState(662);
                            engineClause();
                            setState(664);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == POPULATE) {
                                {
                                    setState(663);
                                    match(POPULATE);
                                }
                            }

                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(668);
                    subqueryClause();
                }
                break;
                case 5:
                    _localctx = new CreateTableStmtContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(677);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case ATTACH: {
                            setState(670);
                            match(ATTACH);
                        }
                        break;
                        case CREATE: {
                            setState(671);
                            match(CREATE);
                            setState(674);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == OR) {
                                {
                                    setState(672);
                                    match(OR);
                                    setState(673);
                                    match(REPLACE);
                                }
                            }

                        }
                        break;
                        case REPLACE: {
                            setState(676);
                            match(REPLACE);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(680);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TEMPORARY) {
                        {
                            setState(679);
                            match(TEMPORARY);
                        }
                    }

                    setState(682);
                    match(TABLE);
                    setState(686);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
                        case 1: {
                            setState(683);
                            match(IF);
                            setState(684);
                            match(NOT);
                            setState(685);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(688);
                    tableIdentifier();
                    setState(690);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == UUID) {
                        {
                            setState(689);
                            uuidClause();
                        }
                    }

                    setState(693);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ON) {
                        {
                            setState(692);
                            clusterClause();
                        }
                    }

                    setState(696);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 71, _ctx)) {
                        case 1: {
                            setState(695);
                            tableSchemaClause();
                        }
                        break;
                    }
                    setState(699);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ENGINE) {
                        {
                            setState(698);
                            engineClause();
                        }
                    }

                    setState(702);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == AS) {
                        {
                            setState(701);
                            subqueryClause();
                        }
                    }

                }
                break;
                case 6:
                    _localctx = new CreateViewStmtContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(704);
                    _la = _input.LA(1);
                    if (!(_la == ATTACH || _la == CREATE)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(707);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == OR) {
                        {
                            setState(705);
                            match(OR);
                            setState(706);
                            match(REPLACE);
                        }
                    }

                    setState(709);
                    match(VIEW);
                    setState(713);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 75, _ctx)) {
                        case 1: {
                            setState(710);
                            match(IF);
                            setState(711);
                            match(NOT);
                            setState(712);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(715);
                    tableIdentifier();
                    setState(717);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == UUID) {
                        {
                            setState(716);
                            uuidClause();
                        }
                    }

                    setState(720);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ON) {
                        {
                            setState(719);
                            clusterClause();
                        }
                    }

                    setState(723);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
                        case 1: {
                            setState(722);
                            tableSchemaClause();
                        }
                        break;
                    }
                    setState(725);
                    subqueryClause();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DictionarySchemaClauseContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<DictionaryAttrDfntContext> dictionaryAttrDfnt() {
            return getRuleContexts(DictionaryAttrDfntContext.class);
        }

        public DictionaryAttrDfntContext dictionaryAttrDfnt(int i) {
            return getRuleContext(DictionaryAttrDfntContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public DictionarySchemaClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dictionarySchemaClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDictionarySchemaClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDictionarySchemaClause(this);
        }
    }

    public final DictionarySchemaClauseContext dictionarySchemaClause() throws RecognitionException {
        DictionarySchemaClauseContext _localctx = new DictionarySchemaClauseContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_dictionarySchemaClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(729);
                match(LPAREN);
                setState(730);
                dictionaryAttrDfnt();
                setState(735);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(731);
                            match(COMMA);
                            setState(732);
                            dictionaryAttrDfnt();
                        }
                    }
                    setState(737);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(738);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DictionaryAttrDfntContext extends ParserRuleContext {
        public java.util.Set<String> attrs;

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColumnTypeExprContext columnTypeExpr() {
            return getRuleContext(ColumnTypeExprContext.class, 0);
        }

        public List<TerminalNode> DEFAULT() {
            return getTokens(ClickHouseParser.DEFAULT);
        }

        public TerminalNode DEFAULT(int i) {
            return getToken(ClickHouseParser.DEFAULT, i);
        }

        public List<LiteralContext> literal() {
            return getRuleContexts(LiteralContext.class);
        }

        public LiteralContext literal(int i) {
            return getRuleContext(LiteralContext.class, i);
        }

        public List<TerminalNode> EXPRESSION() {
            return getTokens(ClickHouseParser.EXPRESSION);
        }

        public TerminalNode EXPRESSION(int i) {
            return getToken(ClickHouseParser.EXPRESSION, i);
        }

        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public List<TerminalNode> HIERARCHICAL() {
            return getTokens(ClickHouseParser.HIERARCHICAL);
        }

        public TerminalNode HIERARCHICAL(int i) {
            return getToken(ClickHouseParser.HIERARCHICAL, i);
        }

        public List<TerminalNode> INJECTIVE() {
            return getTokens(ClickHouseParser.INJECTIVE);
        }

        public TerminalNode INJECTIVE(int i) {
            return getToken(ClickHouseParser.INJECTIVE, i);
        }

        public List<TerminalNode> IS_OBJECT_ID() {
            return getTokens(ClickHouseParser.IS_OBJECT_ID);
        }

        public TerminalNode IS_OBJECT_ID(int i) {
            return getToken(ClickHouseParser.IS_OBJECT_ID, i);
        }

        public DictionaryAttrDfntContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dictionaryAttrDfnt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDictionaryAttrDfnt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDictionaryAttrDfnt(this);
        }
    }

    public final DictionaryAttrDfntContext dictionaryAttrDfnt() throws RecognitionException {
        DictionaryAttrDfntContext _localctx = new DictionaryAttrDfntContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_dictionaryAttrDfnt);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(740);
                identifier();
                setState(741);
                columnTypeExpr();
                setState(763);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 82, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            setState(761);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 81, _ctx)) {
                                case 1: {
                                    setState(742);
                                    if (!(!_localctx.attrs.contains("default")))
                                        throw new FailedPredicateException(this, "!$attrs.contains(\"default\")");
                                    setState(743);
                                    match(DEFAULT);
                                    setState(744);
                                    literal();
                                    _localctx.attrs.add("default");
                                }
                                break;
                                case 2: {
                                    setState(747);
                                    if (!(!_localctx.attrs.contains("expression")))
                                        throw new FailedPredicateException(this, "!$attrs.contains(\"expression\")");
                                    setState(748);
                                    match(EXPRESSION);
                                    setState(749);
                                    columnExpr(0);
                                    _localctx.attrs.add("expression");
                                }
                                break;
                                case 3: {
                                    setState(752);
                                    if (!(!_localctx.attrs.contains("hierarchical")))
                                        throw new FailedPredicateException(this, "!$attrs.contains(\"hierarchical\")");
                                    setState(753);
                                    match(HIERARCHICAL);
                                    _localctx.attrs.add("hierarchical");
                                }
                                break;
                                case 4: {
                                    setState(755);
                                    if (!(!_localctx.attrs.contains("injective")))
                                        throw new FailedPredicateException(this, "!$attrs.contains(\"injective\")");
                                    setState(756);
                                    match(INJECTIVE);
                                    _localctx.attrs.add("injective");
                                }
                                break;
                                case 5: {
                                    setState(758);
                                    if (!(!_localctx.attrs.contains("is_object_id")))
                                        throw new FailedPredicateException(this, "!$attrs.contains(\"is_object_id\")");
                                    setState(759);
                                    match(IS_OBJECT_ID);
                                    _localctx.attrs.add("is_object_id");
                                }
                                break;
                            }
                        }
                    }
                    setState(765);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 82, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DictionaryEngineClauseContext extends ParserRuleContext {
        public java.util.Set<String> clauses;

        public DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() {
            return getRuleContext(DictionaryPrimaryKeyClauseContext.class, 0);
        }

        public List<SourceClauseContext> sourceClause() {
            return getRuleContexts(SourceClauseContext.class);
        }

        public SourceClauseContext sourceClause(int i) {
            return getRuleContext(SourceClauseContext.class, i);
        }

        public List<LifetimeClauseContext> lifetimeClause() {
            return getRuleContexts(LifetimeClauseContext.class);
        }

        public LifetimeClauseContext lifetimeClause(int i) {
            return getRuleContext(LifetimeClauseContext.class, i);
        }

        public List<LayoutClauseContext> layoutClause() {
            return getRuleContexts(LayoutClauseContext.class);
        }

        public LayoutClauseContext layoutClause(int i) {
            return getRuleContext(LayoutClauseContext.class, i);
        }

        public List<RangeClauseContext> rangeClause() {
            return getRuleContexts(RangeClauseContext.class);
        }

        public RangeClauseContext rangeClause(int i) {
            return getRuleContext(RangeClauseContext.class, i);
        }

        public List<DictionarySettingsClauseContext> dictionarySettingsClause() {
            return getRuleContexts(DictionarySettingsClauseContext.class);
        }

        public DictionarySettingsClauseContext dictionarySettingsClause(int i) {
            return getRuleContext(DictionarySettingsClauseContext.class, i);
        }

        public DictionaryEngineClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dictionaryEngineClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDictionaryEngineClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDictionaryEngineClause(this);
        }
    }

    public final DictionaryEngineClauseContext dictionaryEngineClause() throws RecognitionException {
        DictionaryEngineClauseContext _localctx = new DictionaryEngineClauseContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_dictionaryEngineClause);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(767);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 83, _ctx)) {
                    case 1: {
                        setState(766);
                        dictionaryPrimaryKeyClause();
                    }
                    break;
                }
                setState(791);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            setState(789);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
                                case 1: {
                                    setState(769);
                                    if (!(!_localctx.clauses.contains("source")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"source\")");
                                    setState(770);
                                    sourceClause();
                                    _localctx.clauses.add("source");
                                }
                                break;
                                case 2: {
                                    setState(773);
                                    if (!(!_localctx.clauses.contains("lifetime")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"lifetime\")");
                                    setState(774);
                                    lifetimeClause();
                                    _localctx.clauses.add("lifetime");
                                }
                                break;
                                case 3: {
                                    setState(777);
                                    if (!(!_localctx.clauses.contains("layout")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"layout\")");
                                    setState(778);
                                    layoutClause();
                                    _localctx.clauses.add("layout");
                                }
                                break;
                                case 4: {
                                    setState(781);
                                    if (!(!_localctx.clauses.contains("range")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"range\")");
                                    setState(782);
                                    rangeClause();
                                    _localctx.clauses.add("range");
                                }
                                break;
                                case 5: {
                                    setState(785);
                                    if (!(!_localctx.clauses.contains("settings")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"settings\")");
                                    setState(786);
                                    dictionarySettingsClause();
                                    _localctx.clauses.add("settings");
                                }
                                break;
                            }
                        }
                    }
                    setState(793);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DictionaryPrimaryKeyClauseContext extends ParserRuleContext {
        public TerminalNode PRIMARY() {
            return getToken(ClickHouseParser.PRIMARY, 0);
        }

        public TerminalNode KEY() {
            return getToken(ClickHouseParser.KEY, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public DictionaryPrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dictionaryPrimaryKeyClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDictionaryPrimaryKeyClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDictionaryPrimaryKeyClause(this);
        }
    }

    public final DictionaryPrimaryKeyClauseContext dictionaryPrimaryKeyClause() throws RecognitionException {
        DictionaryPrimaryKeyClauseContext _localctx = new DictionaryPrimaryKeyClauseContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_dictionaryPrimaryKeyClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(794);
                match(PRIMARY);
                setState(795);
                match(KEY);
                setState(796);
                columnExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DictionaryArgExprContext extends ParserRuleContext {
        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public DictionaryArgExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dictionaryArgExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDictionaryArgExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDictionaryArgExpr(this);
        }
    }

    public final DictionaryArgExprContext dictionaryArgExpr() throws RecognitionException {
        DictionaryArgExprContext _localctx = new DictionaryArgExprContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_dictionaryArgExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(798);
                identifier();
                setState(805);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case AFTER:
                    case ALIAS:
                    case ALL:
                    case ALTER:
                    case AND:
                    case ANTI:
                    case ANY:
                    case ARRAY:
                    case AS:
                    case ASCENDING:
                    case ASOF:
                    case AST:
                    case ASYNC:
                    case ATTACH:
                    case BETWEEN:
                    case BOTH:
                    case BY:
                    case CASE:
                    case CAST:
                    case CHECK:
                    case CLEAR:
                    case CLUSTER:
                    case CODEC:
                    case COLLATE:
                    case COLUMN:
                    case COMMENT:
                    case CONSTRAINT:
                    case CREATE:
                    case CROSS:
                    case CUBE:
                    case CURRENT:
                    case DATABASE:
                    case DATABASES:
                    case DATE:
                    case DAY:
                    case DEDUPLICATE:
                    case DEFAULT:
                    case DELAY:
                    case DELETE:
                    case DESC:
                    case DESCENDING:
                    case DESCRIBE:
                    case DETACH:
                    case DICTIONARIES:
                    case DICTIONARY:
                    case DISK:
                    case DISTINCT:
                    case DISTRIBUTED:
                    case DROP:
                    case ELSE:
                    case END:
                    case ENGINE:
                    case EVENTS:
                    case EXISTS:
                    case EXPLAIN:
                    case EXPRESSION:
                    case EXTRACT:
                    case FETCHES:
                    case FINAL:
                    case FIRST:
                    case FLUSH:
                    case FOLLOWING:
                    case FOR:
                    case FORMAT:
                    case FREEZE:
                    case FROM:
                    case FULL:
                    case FUNCTION:
                    case GLOBAL:
                    case GRANULARITY:
                    case GROUP:
                    case HAVING:
                    case HIERARCHICAL:
                    case HOUR:
                    case ID:
                    case IF:
                    case ILIKE:
                    case IN:
                    case INDEX:
                    case INJECTIVE:
                    case INNER:
                    case INSERT:
                    case INTERVAL:
                    case INTO:
                    case IS:
                    case IS_OBJECT_ID:
                    case JOIN:
                    case KEY:
                    case KILL:
                    case LAST:
                    case LAYOUT:
                    case LEADING:
                    case LEFT:
                    case LIFETIME:
                    case LIKE:
                    case LIMIT:
                    case LIVE:
                    case LOCAL:
                    case LOGS:
                    case MATERIALIZE:
                    case MATERIALIZED:
                    case MAX:
                    case MERGES:
                    case MIN:
                    case MINUTE:
                    case MODIFY:
                    case MONTH:
                    case MOVE:
                    case MUTATION:
                    case NO:
                    case NOT:
                    case NULLS:
                    case OFFSET:
                    case ON:
                    case OPTIMIZE:
                    case OR:
                    case ORDER:
                    case OUTER:
                    case OUTFILE:
                    case OVER:
                    case PARTITION:
                    case POPULATE:
                    case PRECEDING:
                    case PREWHERE:
                    case PRIMARY:
                    case QUARTER:
                    case RANGE:
                    case RELOAD:
                    case REMOVE:
                    case RENAME:
                    case REPLACE:
                    case REPLICA:
                    case REPLICATED:
                    case RIGHT:
                    case ROLLUP:
                    case ROW:
                    case ROWS:
                    case SAMPLE:
                    case SECOND:
                    case SELECT:
                    case SEMI:
                    case SENDS:
                    case SET:
                    case SETTINGS:
                    case SHOW:
                    case SOURCE:
                    case START:
                    case STOP:
                    case SUBSTRING:
                    case SYNC:
                    case SYNTAX:
                    case SYSTEM:
                    case TABLE:
                    case TABLES:
                    case TEMPORARY:
                    case TEST:
                    case THEN:
                    case TIES:
                    case TIMEOUT:
                    case TIMESTAMP:
                    case TO:
                    case TOP:
                    case TOTALS:
                    case TRAILING:
                    case TRIM:
                    case TRUNCATE:
                    case TTL:
                    case TYPE:
                    case UNBOUNDED:
                    case UNION:
                    case UPDATE:
                    case USE:
                    case USING:
                    case UUID:
                    case VALUES:
                    case VIEW:
                    case VOLUME:
                    case WATCH:
                    case WEEK:
                    case WHEN:
                    case WHERE:
                    case WINDOW:
                    case WITH:
                    case YEAR:
                    case JSON_FALSE:
                    case JSON_TRUE:
                    case IDENTIFIER: {
                        setState(799);
                        identifier();
                        setState(802);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LPAREN) {
                            {
                                setState(800);
                                match(LPAREN);
                                setState(801);
                                match(RPAREN);
                            }
                        }

                    }
                    break;
                    case INF:
                    case NAN_SQL:
                    case NULL_SQL:
                    case FLOATING_LITERAL:
                    case OCTAL_LITERAL:
                    case DECIMAL_LITERAL:
                    case HEXADECIMAL_LITERAL:
                    case STRING_LITERAL:
                    case DASH:
                    case DOT:
                    case PLUS: {
                        setState(804);
                        literal();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SourceClauseContext extends ParserRuleContext {
        public TerminalNode SOURCE() {
            return getToken(ClickHouseParser.SOURCE, 0);
        }

        public List<TerminalNode> LPAREN() {
            return getTokens(ClickHouseParser.LPAREN);
        }

        public TerminalNode LPAREN(int i) {
            return getToken(ClickHouseParser.LPAREN, i);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public List<TerminalNode> RPAREN() {
            return getTokens(ClickHouseParser.RPAREN);
        }

        public TerminalNode RPAREN(int i) {
            return getToken(ClickHouseParser.RPAREN, i);
        }

        public List<DictionaryArgExprContext> dictionaryArgExpr() {
            return getRuleContexts(DictionaryArgExprContext.class);
        }

        public DictionaryArgExprContext dictionaryArgExpr(int i) {
            return getRuleContext(DictionaryArgExprContext.class, i);
        }

        public SourceClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sourceClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSourceClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSourceClause(this);
        }
    }

    public final SourceClauseContext sourceClause() throws RecognitionException {
        SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_sourceClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(807);
                match(SOURCE);
                setState(808);
                match(LPAREN);
                setState(809);
                identifier();
                setState(810);
                match(LPAREN);
                setState(814);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
                    {
                        {
                            setState(811);
                            dictionaryArgExpr();
                        }
                    }
                    setState(816);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(817);
                match(RPAREN);
                setState(818);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LifetimeClauseContext extends ParserRuleContext {
        public TerminalNode LIFETIME() {
            return getToken(ClickHouseParser.LIFETIME, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> DECIMAL_LITERAL() {
            return getTokens(ClickHouseParser.DECIMAL_LITERAL);
        }

        public TerminalNode DECIMAL_LITERAL(int i) {
            return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
        }

        public TerminalNode MIN() {
            return getToken(ClickHouseParser.MIN, 0);
        }

        public TerminalNode MAX() {
            return getToken(ClickHouseParser.MAX, 0);
        }

        public LifetimeClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lifetimeClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterLifetimeClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitLifetimeClause(this);
        }
    }

    public final LifetimeClauseContext lifetimeClause() throws RecognitionException {
        LifetimeClauseContext _localctx = new LifetimeClauseContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_lifetimeClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(820);
                match(LIFETIME);
                setState(821);
                match(LPAREN);
                setState(831);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case DECIMAL_LITERAL: {
                        setState(822);
                        match(DECIMAL_LITERAL);
                    }
                    break;
                    case MIN: {
                        setState(823);
                        match(MIN);
                        setState(824);
                        match(DECIMAL_LITERAL);
                        setState(825);
                        match(MAX);
                        setState(826);
                        match(DECIMAL_LITERAL);
                    }
                    break;
                    case MAX: {
                        setState(827);
                        match(MAX);
                        setState(828);
                        match(DECIMAL_LITERAL);
                        setState(829);
                        match(MIN);
                        setState(830);
                        match(DECIMAL_LITERAL);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(833);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LayoutClauseContext extends ParserRuleContext {
        public TerminalNode LAYOUT() {
            return getToken(ClickHouseParser.LAYOUT, 0);
        }

        public List<TerminalNode> LPAREN() {
            return getTokens(ClickHouseParser.LPAREN);
        }

        public TerminalNode LPAREN(int i) {
            return getToken(ClickHouseParser.LPAREN, i);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public List<TerminalNode> RPAREN() {
            return getTokens(ClickHouseParser.RPAREN);
        }

        public TerminalNode RPAREN(int i) {
            return getToken(ClickHouseParser.RPAREN, i);
        }

        public List<DictionaryArgExprContext> dictionaryArgExpr() {
            return getRuleContexts(DictionaryArgExprContext.class);
        }

        public DictionaryArgExprContext dictionaryArgExpr(int i) {
            return getRuleContext(DictionaryArgExprContext.class, i);
        }

        public LayoutClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_layoutClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterLayoutClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitLayoutClause(this);
        }
    }

    public final LayoutClauseContext layoutClause() throws RecognitionException {
        LayoutClauseContext _localctx = new LayoutClauseContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_layoutClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(835);
                match(LAYOUT);
                setState(836);
                match(LPAREN);
                setState(837);
                identifier();
                setState(838);
                match(LPAREN);
                setState(842);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
                    {
                        {
                            setState(839);
                            dictionaryArgExpr();
                        }
                    }
                    setState(844);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(845);
                match(RPAREN);
                setState(846);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RangeClauseContext extends ParserRuleContext {
        public TerminalNode RANGE() {
            return getToken(ClickHouseParser.RANGE, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public TerminalNode MIN() {
            return getToken(ClickHouseParser.MIN, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode MAX() {
            return getToken(ClickHouseParser.MAX, 0);
        }

        public RangeClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rangeClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterRangeClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitRangeClause(this);
        }
    }

    public final RangeClauseContext rangeClause() throws RecognitionException {
        RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_rangeClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(848);
                match(RANGE);
                setState(849);
                match(LPAREN);
                setState(860);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case MIN: {
                        setState(850);
                        match(MIN);
                        setState(851);
                        identifier();
                        setState(852);
                        match(MAX);
                        setState(853);
                        identifier();
                    }
                    break;
                    case MAX: {
                        setState(855);
                        match(MAX);
                        setState(856);
                        identifier();
                        setState(857);
                        match(MIN);
                        setState(858);
                        identifier();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(862);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DictionarySettingsClauseContext extends ParserRuleContext {
        public TerminalNode SETTINGS() {
            return getToken(ClickHouseParser.SETTINGS, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public SettingExprListContext settingExprList() {
            return getRuleContext(SettingExprListContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public DictionarySettingsClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dictionarySettingsClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDictionarySettingsClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDictionarySettingsClause(this);
        }
    }

    public final DictionarySettingsClauseContext dictionarySettingsClause() throws RecognitionException {
        DictionarySettingsClauseContext _localctx = new DictionarySettingsClauseContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_dictionarySettingsClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(864);
                match(SETTINGS);
                setState(865);
                match(LPAREN);
                setState(866);
                settingExprList();
                setState(867);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClusterClauseContext extends ParserRuleContext {
        public TerminalNode ON() {
            return getToken(ClickHouseParser.ON, 0);
        }

        public TerminalNode CLUSTER() {
            return getToken(ClickHouseParser.CLUSTER, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public ClusterClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_clusterClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterClusterClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitClusterClause(this);
        }
    }

    public final ClusterClauseContext clusterClause() throws RecognitionException {
        ClusterClauseContext _localctx = new ClusterClauseContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_clusterClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(869);
                match(ON);
                setState(870);
                match(CLUSTER);
                setState(873);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case AFTER:
                    case ALIAS:
                    case ALL:
                    case ALTER:
                    case AND:
                    case ANTI:
                    case ANY:
                    case ARRAY:
                    case AS:
                    case ASCENDING:
                    case ASOF:
                    case AST:
                    case ASYNC:
                    case ATTACH:
                    case BETWEEN:
                    case BOTH:
                    case BY:
                    case CASE:
                    case CAST:
                    case CHECK:
                    case CLEAR:
                    case CLUSTER:
                    case CODEC:
                    case COLLATE:
                    case COLUMN:
                    case COMMENT:
                    case CONSTRAINT:
                    case CREATE:
                    case CROSS:
                    case CUBE:
                    case CURRENT:
                    case DATABASE:
                    case DATABASES:
                    case DATE:
                    case DAY:
                    case DEDUPLICATE:
                    case DEFAULT:
                    case DELAY:
                    case DELETE:
                    case DESC:
                    case DESCENDING:
                    case DESCRIBE:
                    case DETACH:
                    case DICTIONARIES:
                    case DICTIONARY:
                    case DISK:
                    case DISTINCT:
                    case DISTRIBUTED:
                    case DROP:
                    case ELSE:
                    case END:
                    case ENGINE:
                    case EVENTS:
                    case EXISTS:
                    case EXPLAIN:
                    case EXPRESSION:
                    case EXTRACT:
                    case FETCHES:
                    case FINAL:
                    case FIRST:
                    case FLUSH:
                    case FOLLOWING:
                    case FOR:
                    case FORMAT:
                    case FREEZE:
                    case FROM:
                    case FULL:
                    case FUNCTION:
                    case GLOBAL:
                    case GRANULARITY:
                    case GROUP:
                    case HAVING:
                    case HIERARCHICAL:
                    case HOUR:
                    case ID:
                    case IF:
                    case ILIKE:
                    case IN:
                    case INDEX:
                    case INJECTIVE:
                    case INNER:
                    case INSERT:
                    case INTERVAL:
                    case INTO:
                    case IS:
                    case IS_OBJECT_ID:
                    case JOIN:
                    case KEY:
                    case KILL:
                    case LAST:
                    case LAYOUT:
                    case LEADING:
                    case LEFT:
                    case LIFETIME:
                    case LIKE:
                    case LIMIT:
                    case LIVE:
                    case LOCAL:
                    case LOGS:
                    case MATERIALIZE:
                    case MATERIALIZED:
                    case MAX:
                    case MERGES:
                    case MIN:
                    case MINUTE:
                    case MODIFY:
                    case MONTH:
                    case MOVE:
                    case MUTATION:
                    case NO:
                    case NOT:
                    case NULLS:
                    case OFFSET:
                    case ON:
                    case OPTIMIZE:
                    case OR:
                    case ORDER:
                    case OUTER:
                    case OUTFILE:
                    case OVER:
                    case PARTITION:
                    case POPULATE:
                    case PRECEDING:
                    case PREWHERE:
                    case PRIMARY:
                    case QUARTER:
                    case RANGE:
                    case RELOAD:
                    case REMOVE:
                    case RENAME:
                    case REPLACE:
                    case REPLICA:
                    case REPLICATED:
                    case RIGHT:
                    case ROLLUP:
                    case ROW:
                    case ROWS:
                    case SAMPLE:
                    case SECOND:
                    case SELECT:
                    case SEMI:
                    case SENDS:
                    case SET:
                    case SETTINGS:
                    case SHOW:
                    case SOURCE:
                    case START:
                    case STOP:
                    case SUBSTRING:
                    case SYNC:
                    case SYNTAX:
                    case SYSTEM:
                    case TABLE:
                    case TABLES:
                    case TEMPORARY:
                    case TEST:
                    case THEN:
                    case TIES:
                    case TIMEOUT:
                    case TIMESTAMP:
                    case TO:
                    case TOP:
                    case TOTALS:
                    case TRAILING:
                    case TRIM:
                    case TRUNCATE:
                    case TTL:
                    case TYPE:
                    case UNBOUNDED:
                    case UNION:
                    case UPDATE:
                    case USE:
                    case USING:
                    case UUID:
                    case VALUES:
                    case VIEW:
                    case VOLUME:
                    case WATCH:
                    case WEEK:
                    case WHEN:
                    case WHERE:
                    case WINDOW:
                    case WITH:
                    case YEAR:
                    case JSON_FALSE:
                    case JSON_TRUE:
                    case IDENTIFIER: {
                        setState(871);
                        identifier();
                    }
                    break;
                    case STRING_LITERAL: {
                        setState(872);
                        match(STRING_LITERAL);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class UuidClauseContext extends ParserRuleContext {
        public TerminalNode UUID() {
            return getToken(ClickHouseParser.UUID, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public UuidClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_uuidClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterUuidClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitUuidClause(this);
        }
    }

    public final UuidClauseContext uuidClause() throws RecognitionException {
        UuidClauseContext _localctx = new UuidClauseContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_uuidClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(875);
                match(UUID);
                setState(876);
                match(STRING_LITERAL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DestinationClauseContext extends ParserRuleContext {
        public TerminalNode TO() {
            return getToken(ClickHouseParser.TO, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public DestinationClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_destinationClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDestinationClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDestinationClause(this);
        }
    }

    public final DestinationClauseContext destinationClause() throws RecognitionException {
        DestinationClauseContext _localctx = new DestinationClauseContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_destinationClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(878);
                match(TO);
                setState(879);
                tableIdentifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SubqueryClauseContext extends ParserRuleContext {
        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public SelectUnionStmtContext selectUnionStmt() {
            return getRuleContext(SelectUnionStmtContext.class, 0);
        }

        public SubqueryClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_subqueryClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSubqueryClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSubqueryClause(this);
        }
    }

    public final SubqueryClauseContext subqueryClause() throws RecognitionException {
        SubqueryClauseContext _localctx = new SubqueryClauseContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_subqueryClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(881);
                match(AS);
                setState(882);
                selectUnionStmt();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableSchemaClauseContext extends ParserRuleContext {
        public TableSchemaClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableSchemaClause;
        }

        public TableSchemaClauseContext() {
        }

        public void copyFrom(TableSchemaClauseContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class SchemaAsTableClauseContext extends TableSchemaClauseContext {
        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public SchemaAsTableClauseContext(TableSchemaClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSchemaAsTableClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSchemaAsTableClause(this);
        }
    }

    public static class SchemaAsFunctionClauseContext extends TableSchemaClauseContext {
        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public TableFunctionExprContext tableFunctionExpr() {
            return getRuleContext(TableFunctionExprContext.class, 0);
        }

        public SchemaAsFunctionClauseContext(TableSchemaClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSchemaAsFunctionClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSchemaAsFunctionClause(this);
        }
    }

    public static class SchemaDescriptionClauseContext extends TableSchemaClauseContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<TableElementExprContext> tableElementExpr() {
            return getRuleContexts(TableElementExprContext.class);
        }

        public TableElementExprContext tableElementExpr(int i) {
            return getRuleContext(TableElementExprContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public SchemaDescriptionClauseContext(TableSchemaClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSchemaDescriptionClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSchemaDescriptionClause(this);
        }
    }

    public final TableSchemaClauseContext tableSchemaClause() throws RecognitionException {
        TableSchemaClauseContext _localctx = new TableSchemaClauseContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_tableSchemaClause);
        int _la;
        try {
            setState(899);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 94, _ctx)) {
                case 1:
                    _localctx = new SchemaDescriptionClauseContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(884);
                    match(LPAREN);
                    setState(885);
                    tableElementExpr();
                    setState(890);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(886);
                                match(COMMA);
                                setState(887);
                                tableElementExpr();
                            }
                        }
                        setState(892);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(893);
                    match(RPAREN);
                }
                break;
                case 2:
                    _localctx = new SchemaAsTableClauseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(895);
                    match(AS);
                    setState(896);
                    tableIdentifier();
                }
                break;
                case 3:
                    _localctx = new SchemaAsFunctionClauseContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(897);
                    match(AS);
                    setState(898);
                    tableFunctionExpr();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EngineClauseContext extends ParserRuleContext {
        public java.util.Set<String> clauses;

        public EngineExprContext engineExpr() {
            return getRuleContext(EngineExprContext.class, 0);
        }

        public List<OrderByClauseContext> orderByClause() {
            return getRuleContexts(OrderByClauseContext.class);
        }

        public OrderByClauseContext orderByClause(int i) {
            return getRuleContext(OrderByClauseContext.class, i);
        }

        public List<PartitionByClauseContext> partitionByClause() {
            return getRuleContexts(PartitionByClauseContext.class);
        }

        public PartitionByClauseContext partitionByClause(int i) {
            return getRuleContext(PartitionByClauseContext.class, i);
        }

        public List<PrimaryKeyClauseContext> primaryKeyClause() {
            return getRuleContexts(PrimaryKeyClauseContext.class);
        }

        public PrimaryKeyClauseContext primaryKeyClause(int i) {
            return getRuleContext(PrimaryKeyClauseContext.class, i);
        }

        public List<SampleByClauseContext> sampleByClause() {
            return getRuleContexts(SampleByClauseContext.class);
        }

        public SampleByClauseContext sampleByClause(int i) {
            return getRuleContext(SampleByClauseContext.class, i);
        }

        public List<TtlClauseContext> ttlClause() {
            return getRuleContexts(TtlClauseContext.class);
        }

        public TtlClauseContext ttlClause(int i) {
            return getRuleContext(TtlClauseContext.class, i);
        }

        public List<SettingsClauseContext> settingsClause() {
            return getRuleContexts(SettingsClauseContext.class);
        }

        public SettingsClauseContext settingsClause(int i) {
            return getRuleContext(SettingsClauseContext.class, i);
        }

        public EngineClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_engineClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterEngineClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitEngineClause(this);
        }
    }

    public final EngineClauseContext engineClause() throws RecognitionException {
        EngineClauseContext _localctx = new EngineClauseContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_engineClause);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(901);
                engineExpr();
                setState(928);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 96, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            setState(926);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 95, _ctx)) {
                                case 1: {
                                    setState(902);
                                    if (!(!_localctx.clauses.contains("orderByClause")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"orderByClause\")");
                                    setState(903);
                                    orderByClause();
                                    _localctx.clauses.add("orderByClause");
                                }
                                break;
                                case 2: {
                                    setState(906);
                                    if (!(!_localctx.clauses.contains("partitionByClause")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"partitionByClause\")");
                                    setState(907);
                                    partitionByClause();
                                    _localctx.clauses.add("partitionByClause");
                                }
                                break;
                                case 3: {
                                    setState(910);
                                    if (!(!_localctx.clauses.contains("primaryKeyClause")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"primaryKeyClause\")");
                                    setState(911);
                                    primaryKeyClause();
                                    _localctx.clauses.add("primaryKeyClause");
                                }
                                break;
                                case 4: {
                                    setState(914);
                                    if (!(!_localctx.clauses.contains("sampleByClause")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"sampleByClause\")");
                                    setState(915);
                                    sampleByClause();
                                    _localctx.clauses.add("sampleByClause");
                                }
                                break;
                                case 5: {
                                    setState(918);
                                    if (!(!_localctx.clauses.contains("ttlClause")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"ttlClause\")");
                                    setState(919);
                                    ttlClause();
                                    _localctx.clauses.add("ttlClause");
                                }
                                break;
                                case 6: {
                                    setState(922);
                                    if (!(!_localctx.clauses.contains("settingsClause")))
                                        throw new FailedPredicateException(this, "!$clauses.contains(\"settingsClause\")");
                                    setState(923);
                                    settingsClause();
                                    _localctx.clauses.add("settingsClause");
                                }
                                break;
                            }
                        }
                    }
                    setState(930);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 96, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PartitionByClauseContext extends ParserRuleContext {
        public TerminalNode PARTITION() {
            return getToken(ClickHouseParser.PARTITION, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_partitionByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterPartitionByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitPartitionByClause(this);
        }
    }

    public final PartitionByClauseContext partitionByClause() throws RecognitionException {
        PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_partitionByClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(931);
                match(PARTITION);
                setState(932);
                match(BY);
                setState(933);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrimaryKeyClauseContext extends ParserRuleContext {
        public TerminalNode PRIMARY() {
            return getToken(ClickHouseParser.PRIMARY, 0);
        }

        public TerminalNode KEY() {
            return getToken(ClickHouseParser.KEY, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public PrimaryKeyClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primaryKeyClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterPrimaryKeyClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitPrimaryKeyClause(this);
        }
    }

    public final PrimaryKeyClauseContext primaryKeyClause() throws RecognitionException {
        PrimaryKeyClauseContext _localctx = new PrimaryKeyClauseContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_primaryKeyClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(935);
                match(PRIMARY);
                setState(936);
                match(KEY);
                setState(937);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SampleByClauseContext extends ParserRuleContext {
        public TerminalNode SAMPLE() {
            return getToken(ClickHouseParser.SAMPLE, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public SampleByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sampleByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSampleByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSampleByClause(this);
        }
    }

    public final SampleByClauseContext sampleByClause() throws RecognitionException {
        SampleByClauseContext _localctx = new SampleByClauseContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_sampleByClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(939);
                match(SAMPLE);
                setState(940);
                match(BY);
                setState(941);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TtlClauseContext extends ParserRuleContext {
        public TerminalNode TTL() {
            return getToken(ClickHouseParser.TTL, 0);
        }

        public List<TtlExprContext> ttlExpr() {
            return getRuleContexts(TtlExprContext.class);
        }

        public TtlExprContext ttlExpr(int i) {
            return getRuleContext(TtlExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public TtlClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ttlClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTtlClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitTtlClause(this);
        }
    }

    public final TtlClauseContext ttlClause() throws RecognitionException {
        TtlClauseContext _localctx = new TtlClauseContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_ttlClause);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(943);
                match(TTL);
                setState(944);
                ttlExpr();
                setState(949);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 97, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(945);
                                match(COMMA);
                                setState(946);
                                ttlExpr();
                            }
                        }
                    }
                    setState(951);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 97, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EngineExprContext extends ParserRuleContext {
        public TerminalNode ENGINE() {
            return getToken(ClickHouseParser.ENGINE, 0);
        }

        public IdentifierOrNullContext identifierOrNull() {
            return getRuleContext(IdentifierOrNullContext.class, 0);
        }

        public TerminalNode EQ_SINGLE() {
            return getToken(ClickHouseParser.EQ_SINGLE, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public EngineExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_engineExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterEngineExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitEngineExpr(this);
        }
    }

    public final EngineExprContext engineExpr() throws RecognitionException {
        EngineExprContext _localctx = new EngineExprContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_engineExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(952);
                match(ENGINE);
                setState(954);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EQ_SINGLE) {
                    {
                        setState(953);
                        match(EQ_SINGLE);
                    }
                }

                setState(956);
                identifierOrNull();
                setState(962);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 100, _ctx)) {
                    case 1: {
                        setState(957);
                        match(LPAREN);
                        setState(959);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
                            {
                                setState(958);
                                columnExprList();
                            }
                        }

                        setState(961);
                        match(RPAREN);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableElementExprContext extends ParserRuleContext {
        public TableElementExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableElementExpr;
        }

        public TableElementExprContext() {
        }

        public void copyFrom(TableElementExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class TableElementExprProjectionContext extends TableElementExprContext {
        public TerminalNode PROJECTION() {
            return getToken(ClickHouseParser.PROJECTION, 0);
        }

        public TableProjectionDfntContext tableProjectionDfnt() {
            return getRuleContext(TableProjectionDfntContext.class, 0);
        }

        public TableElementExprProjectionContext(TableElementExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableElementExprProjection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableElementExprProjection(this);
        }
    }

    public static class TableElementExprConstraintContext extends TableElementExprContext {
        public TerminalNode CONSTRAINT() {
            return getToken(ClickHouseParser.CONSTRAINT, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode CHECK() {
            return getToken(ClickHouseParser.CHECK, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TableElementExprConstraintContext(TableElementExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableElementExprConstraint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableElementExprConstraint(this);
        }
    }

    public static class TableElementExprColumnContext extends TableElementExprContext {
        public TableColumnDfntContext tableColumnDfnt() {
            return getRuleContext(TableColumnDfntContext.class, 0);
        }

        public TableElementExprColumnContext(TableElementExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableElementExprColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableElementExprColumn(this);
        }
    }

    public static class TableElementExprIndexContext extends TableElementExprContext {
        public TerminalNode INDEX() {
            return getToken(ClickHouseParser.INDEX, 0);
        }

        public TableIndexDfntContext tableIndexDfnt() {
            return getRuleContext(TableIndexDfntContext.class, 0);
        }

        public TableElementExprIndexContext(TableElementExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableElementExprIndex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableElementExprIndex(this);
        }
    }

    public final TableElementExprContext tableElementExpr() throws RecognitionException {
        TableElementExprContext _localctx = new TableElementExprContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_tableElementExpr);
        try {
            setState(974);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 101, _ctx)) {
                case 1:
                    _localctx = new TableElementExprColumnContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(964);
                    tableColumnDfnt();
                }
                break;
                case 2:
                    _localctx = new TableElementExprConstraintContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(965);
                    match(CONSTRAINT);
                    setState(966);
                    identifier();
                    setState(967);
                    match(CHECK);
                    setState(968);
                    columnExpr(0);
                }
                break;
                case 3:
                    _localctx = new TableElementExprIndexContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(970);
                    match(INDEX);
                    setState(971);
                    tableIndexDfnt();
                }
                break;
                case 4:
                    _localctx = new TableElementExprProjectionContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(972);
                    match(PROJECTION);
                    setState(973);
                    tableProjectionDfnt();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableColumnDfntContext extends ParserRuleContext {
        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public ColumnTypeExprContext columnTypeExpr() {
            return getRuleContext(ColumnTypeExprContext.class, 0);
        }

        public TableColumnPropertyExprContext tableColumnPropertyExpr() {
            return getRuleContext(TableColumnPropertyExprContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(ClickHouseParser.COMMENT, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public CodecExprContext codecExpr() {
            return getRuleContext(CodecExprContext.class, 0);
        }

        public TerminalNode TTL() {
            return getToken(ClickHouseParser.TTL, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TableColumnDfntContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableColumnDfnt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableColumnDfnt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableColumnDfnt(this);
        }
    }

    public final TableColumnDfntContext tableColumnDfnt() throws RecognitionException {
        TableColumnDfntContext _localctx = new TableColumnDfntContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_tableColumnDfnt);
        int _la;
        try {
            setState(1008);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 110, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(976);
                    nestedIdentifier();
                    setState(977);
                    columnTypeExpr();
                    setState(979);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ALIAS || _la == DEFAULT || _la == MATERIALIZED) {
                        {
                            setState(978);
                            tableColumnPropertyExpr();
                        }
                    }

                    setState(983);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMENT) {
                        {
                            setState(981);
                            match(COMMENT);
                            setState(982);
                            match(STRING_LITERAL);
                        }
                    }

                    setState(986);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == CODEC) {
                        {
                            setState(985);
                            codecExpr();
                        }
                    }

                    setState(990);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TTL) {
                        {
                            setState(988);
                            match(TTL);
                            setState(989);
                            columnExpr(0);
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(992);
                    nestedIdentifier();
                    setState(994);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 106, _ctx)) {
                        case 1: {
                            setState(993);
                            columnTypeExpr();
                        }
                        break;
                    }
                    setState(996);
                    tableColumnPropertyExpr();
                    setState(999);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMENT) {
                        {
                            setState(997);
                            match(COMMENT);
                            setState(998);
                            match(STRING_LITERAL);
                        }
                    }

                    setState(1002);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == CODEC) {
                        {
                            setState(1001);
                            codecExpr();
                        }
                    }

                    setState(1006);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TTL) {
                        {
                            setState(1004);
                            match(TTL);
                            setState(1005);
                            columnExpr(0);
                        }
                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableColumnPropertyExprContext extends ParserRuleContext {
        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode DEFAULT() {
            return getToken(ClickHouseParser.DEFAULT, 0);
        }

        public TerminalNode MATERIALIZED() {
            return getToken(ClickHouseParser.MATERIALIZED, 0);
        }

        public TerminalNode ALIAS() {
            return getToken(ClickHouseParser.ALIAS, 0);
        }

        public TableColumnPropertyExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableColumnPropertyExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableColumnPropertyExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableColumnPropertyExpr(this);
        }
    }

    public final TableColumnPropertyExprContext tableColumnPropertyExpr() throws RecognitionException {
        TableColumnPropertyExprContext _localctx = new TableColumnPropertyExprContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_tableColumnPropertyExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1010);
                _la = _input.LA(1);
                if (!(_la == ALIAS || _la == DEFAULT || _la == MATERIALIZED)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(1011);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableIndexDfntContext extends ParserRuleContext {
        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode TYPE() {
            return getToken(ClickHouseParser.TYPE, 0);
        }

        public ColumnTypeExprContext columnTypeExpr() {
            return getRuleContext(ColumnTypeExprContext.class, 0);
        }

        public TerminalNode GRANULARITY() {
            return getToken(ClickHouseParser.GRANULARITY, 0);
        }

        public TerminalNode DECIMAL_LITERAL() {
            return getToken(ClickHouseParser.DECIMAL_LITERAL, 0);
        }

        public TableIndexDfntContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableIndexDfnt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableIndexDfnt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableIndexDfnt(this);
        }
    }

    public final TableIndexDfntContext tableIndexDfnt() throws RecognitionException {
        TableIndexDfntContext _localctx = new TableIndexDfntContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_tableIndexDfnt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1013);
                nestedIdentifier();
                setState(1014);
                columnExpr(0);
                setState(1015);
                match(TYPE);
                setState(1016);
                columnTypeExpr();
                setState(1017);
                match(GRANULARITY);
                setState(1018);
                match(DECIMAL_LITERAL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableProjectionDfntContext extends ParserRuleContext {
        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public ProjectionSelectStmtContext projectionSelectStmt() {
            return getRuleContext(ProjectionSelectStmtContext.class, 0);
        }

        public TableProjectionDfntContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableProjectionDfnt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableProjectionDfnt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableProjectionDfnt(this);
        }
    }

    public final TableProjectionDfntContext tableProjectionDfnt() throws RecognitionException {
        TableProjectionDfntContext _localctx = new TableProjectionDfntContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_tableProjectionDfnt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1020);
                nestedIdentifier();
                setState(1021);
                projectionSelectStmt();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CodecExprContext extends ParserRuleContext {
        public TerminalNode CODEC() {
            return getToken(ClickHouseParser.CODEC, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<CodecArgExprContext> codecArgExpr() {
            return getRuleContexts(CodecArgExprContext.class);
        }

        public CodecArgExprContext codecArgExpr(int i) {
            return getRuleContext(CodecArgExprContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public CodecExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_codecExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCodecExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitCodecExpr(this);
        }
    }

    public final CodecExprContext codecExpr() throws RecognitionException {
        CodecExprContext _localctx = new CodecExprContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_codecExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1023);
                match(CODEC);
                setState(1024);
                match(LPAREN);
                setState(1025);
                codecArgExpr();
                setState(1030);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1026);
                            match(COMMA);
                            setState(1027);
                            codecArgExpr();
                        }
                    }
                    setState(1032);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1033);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CodecArgExprContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public CodecArgExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_codecArgExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterCodecArgExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitCodecArgExpr(this);
        }
    }

    public final CodecArgExprContext codecArgExpr() throws RecognitionException {
        CodecArgExprContext _localctx = new CodecArgExprContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_codecArgExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1035);
                identifier();
                setState(1041);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(1036);
                        match(LPAREN);
                        setState(1038);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
                            {
                                setState(1037);
                                columnExprList();
                            }
                        }

                        setState(1040);
                        match(RPAREN);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TtlExprContext extends ParserRuleContext {
        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode DELETE() {
            return getToken(ClickHouseParser.DELETE, 0);
        }

        public TerminalNode TO() {
            return getToken(ClickHouseParser.TO, 0);
        }

        public TerminalNode DISK() {
            return getToken(ClickHouseParser.DISK, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode VOLUME() {
            return getToken(ClickHouseParser.VOLUME, 0);
        }

        public TtlExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ttlExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterTtlExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitTtlExpr(this);
        }
    }

    public final TtlExprContext ttlExpr() throws RecognitionException {
        TtlExprContext _localctx = new TtlExprContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_ttlExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1043);
                columnExpr(0);
                setState(1051);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 114, _ctx)) {
                    case 1: {
                        setState(1044);
                        match(DELETE);
                    }
                    break;
                    case 2: {
                        setState(1045);
                        match(TO);
                        setState(1046);
                        match(DISK);
                        setState(1047);
                        match(STRING_LITERAL);
                    }
                    break;
                    case 3: {
                        setState(1048);
                        match(TO);
                        setState(1049);
                        match(VOLUME);
                        setState(1050);
                        match(STRING_LITERAL);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DescribeStmtContext extends ParserRuleContext {
        public TableExprContext tableExpr() {
            return getRuleContext(TableExprContext.class, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(ClickHouseParser.DESCRIBE, 0);
        }

        public TerminalNode DESC() {
            return getToken(ClickHouseParser.DESC, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public DescribeStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_describeStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDescribeStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDescribeStmt(this);
        }
    }

    public final DescribeStmtContext describeStmt() throws RecognitionException {
        DescribeStmtContext _localctx = new DescribeStmtContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_describeStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1053);
                _la = _input.LA(1);
                if (!(_la == DESC || _la == DESCRIBE)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(1055);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 115, _ctx)) {
                    case 1: {
                        setState(1054);
                        match(TABLE);
                    }
                    break;
                }
                setState(1057);
                tableExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DropStmtContext extends ParserRuleContext {
        public DropStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dropStmt;
        }

        public DropStmtContext() {
        }

        public void copyFrom(DropStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class DropDatabaseStmtContext extends DropStmtContext {
        public TerminalNode DATABASE() {
            return getToken(ClickHouseParser.DATABASE, 0);
        }

        public DatabaseIdentifierContext databaseIdentifier() {
            return getRuleContext(DatabaseIdentifierContext.class, 0);
        }

        public TerminalNode DETACH() {
            return getToken(ClickHouseParser.DETACH, 0);
        }

        public TerminalNode DROP() {
            return getToken(ClickHouseParser.DROP, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public DropDatabaseStmtContext(DropStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDropDatabaseStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDropDatabaseStmt(this);
        }
    }

    public static class DropTableStmtContext extends DropStmtContext {
        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DETACH() {
            return getToken(ClickHouseParser.DETACH, 0);
        }

        public TerminalNode DROP() {
            return getToken(ClickHouseParser.DROP, 0);
        }

        public TerminalNode DICTIONARY() {
            return getToken(ClickHouseParser.DICTIONARY, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(ClickHouseParser.VIEW, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public TerminalNode NO() {
            return getToken(ClickHouseParser.NO, 0);
        }

        public TerminalNode DELAY() {
            return getToken(ClickHouseParser.DELAY, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(ClickHouseParser.TEMPORARY, 0);
        }

        public DropTableStmtContext(DropStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDropTableStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDropTableStmt(this);
        }
    }

    public final DropStmtContext dropStmt() throws RecognitionException {
        DropStmtContext _localctx = new DropStmtContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_dropStmt);
        int _la;
        try {
            setState(1090);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 123, _ctx)) {
                case 1:
                    _localctx = new DropDatabaseStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1059);
                    _la = _input.LA(1);
                    if (!(_la == DETACH || _la == DROP)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(1060);
                    match(DATABASE);
                    setState(1063);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 116, _ctx)) {
                        case 1: {
                            setState(1061);
                            match(IF);
                            setState(1062);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(1065);
                    databaseIdentifier();
                    setState(1067);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ON) {
                        {
                            setState(1066);
                            clusterClause();
                        }
                    }

                }
                break;
                case 2:
                    _localctx = new DropTableStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1069);
                    _la = _input.LA(1);
                    if (!(_la == DETACH || _la == DROP)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(1076);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case DICTIONARY: {
                            setState(1070);
                            match(DICTIONARY);
                        }
                        break;
                        case TABLE:
                        case TEMPORARY: {
                            setState(1072);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == TEMPORARY) {
                                {
                                    setState(1071);
                                    match(TEMPORARY);
                                }
                            }

                            setState(1074);
                            match(TABLE);
                        }
                        break;
                        case VIEW: {
                            setState(1075);
                            match(VIEW);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(1080);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 120, _ctx)) {
                        case 1: {
                            setState(1078);
                            match(IF);
                            setState(1079);
                            match(EXISTS);
                        }
                        break;
                    }
                    setState(1082);
                    tableIdentifier();
                    setState(1084);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ON) {
                        {
                            setState(1083);
                            clusterClause();
                        }
                    }

                    setState(1088);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == NO) {
                        {
                            setState(1086);
                            match(NO);
                            setState(1087);
                            match(DELAY);
                        }
                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExistsStmtContext extends ParserRuleContext {
        public ExistsStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_existsStmt;
        }

        public ExistsStmtContext() {
        }

        public void copyFrom(ExistsStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ExistsTableStmtContext extends ExistsStmtContext {
        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DICTIONARY() {
            return getToken(ClickHouseParser.DICTIONARY, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(ClickHouseParser.VIEW, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(ClickHouseParser.TEMPORARY, 0);
        }

        public ExistsTableStmtContext(ExistsStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterExistsTableStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitExistsTableStmt(this);
        }
    }

    public static class ExistsDatabaseStmtContext extends ExistsStmtContext {
        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(ClickHouseParser.DATABASE, 0);
        }

        public DatabaseIdentifierContext databaseIdentifier() {
            return getRuleContext(DatabaseIdentifierContext.class, 0);
        }

        public ExistsDatabaseStmtContext(ExistsStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterExistsDatabaseStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitExistsDatabaseStmt(this);
        }
    }

    public final ExistsStmtContext existsStmt() throws RecognitionException {
        ExistsStmtContext _localctx = new ExistsStmtContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_existsStmt);
        int _la;
        try {
            setState(1105);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 126, _ctx)) {
                case 1:
                    _localctx = new ExistsDatabaseStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1092);
                    match(EXISTS);
                    setState(1093);
                    match(DATABASE);
                    setState(1094);
                    databaseIdentifier();
                }
                break;
                case 2:
                    _localctx = new ExistsTableStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1095);
                    match(EXISTS);
                    setState(1102);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
                        case 1: {
                            setState(1096);
                            match(DICTIONARY);
                        }
                        break;
                        case 2: {
                            setState(1098);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == TEMPORARY) {
                                {
                                    setState(1097);
                                    match(TEMPORARY);
                                }
                            }

                            setState(1100);
                            match(TABLE);
                        }
                        break;
                        case 3: {
                            setState(1101);
                            match(VIEW);
                        }
                        break;
                    }
                    setState(1104);
                    tableIdentifier();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExplainStmtContext extends ParserRuleContext {
        public ExplainStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_explainStmt;
        }

        public ExplainStmtContext() {
        }

        public void copyFrom(ExplainStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ExplainSyntaxStmtContext extends ExplainStmtContext {
        public TerminalNode EXPLAIN() {
            return getToken(ClickHouseParser.EXPLAIN, 0);
        }

        public TerminalNode SYNTAX() {
            return getToken(ClickHouseParser.SYNTAX, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public ExplainSyntaxStmtContext(ExplainStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterExplainSyntaxStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitExplainSyntaxStmt(this);
        }
    }

    public static class ExplainASTStmtContext extends ExplainStmtContext {
        public TerminalNode EXPLAIN() {
            return getToken(ClickHouseParser.EXPLAIN, 0);
        }

        public TerminalNode AST() {
            return getToken(ClickHouseParser.AST, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public ExplainASTStmtContext(ExplainStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterExplainASTStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitExplainASTStmt(this);
        }
    }

    public final ExplainStmtContext explainStmt() throws RecognitionException {
        ExplainStmtContext _localctx = new ExplainStmtContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_explainStmt);
        try {
            setState(1113);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 127, _ctx)) {
                case 1:
                    _localctx = new ExplainASTStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1107);
                    match(EXPLAIN);
                    setState(1108);
                    match(AST);
                    setState(1109);
                    query();
                }
                break;
                case 2:
                    _localctx = new ExplainSyntaxStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1110);
                    match(EXPLAIN);
                    setState(1111);
                    match(SYNTAX);
                    setState(1112);
                    query();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InsertStmtContext extends ParserRuleContext {
        public TerminalNode INSERT() {
            return getToken(ClickHouseParser.INSERT, 0);
        }

        public TerminalNode INTO() {
            return getToken(ClickHouseParser.INTO, 0);
        }

        public DataClauseContext dataClause() {
            return getRuleContext(DataClauseContext.class, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(ClickHouseParser.FUNCTION, 0);
        }

        public TableFunctionExprContext tableFunctionExpr() {
            return getRuleContext(TableFunctionExprContext.class, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public ColumnsClauseContext columnsClause() {
            return getRuleContext(ColumnsClauseContext.class, 0);
        }

        public InsertStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_insertStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterInsertStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitInsertStmt(this);
        }
    }

    public final InsertStmtContext insertStmt() throws RecognitionException {
        InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_insertStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1115);
                match(INSERT);
                setState(1116);
                match(INTO);
                setState(1118);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 128, _ctx)) {
                    case 1: {
                        setState(1117);
                        match(TABLE);
                    }
                    break;
                }
                setState(1123);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 129, _ctx)) {
                    case 1: {
                        setState(1120);
                        tableIdentifier();
                    }
                    break;
                    case 2: {
                        setState(1121);
                        match(FUNCTION);
                        setState(1122);
                        tableFunctionExpr();
                    }
                    break;
                }
                setState(1126);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 130, _ctx)) {
                    case 1: {
                        setState(1125);
                        columnsClause();
                    }
                    break;
                }
                setState(1128);
                dataClause();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnsClauseContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<NestedIdentifierContext> nestedIdentifier() {
            return getRuleContexts(NestedIdentifierContext.class);
        }

        public NestedIdentifierContext nestedIdentifier(int i) {
            return getRuleContext(NestedIdentifierContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ColumnsClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnsClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnsClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnsClause(this);
        }
    }

    public final ColumnsClauseContext columnsClause() throws RecognitionException {
        ColumnsClauseContext _localctx = new ColumnsClauseContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_columnsClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1130);
                match(LPAREN);
                setState(1131);
                nestedIdentifier();
                setState(1136);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1132);
                            match(COMMA);
                            setState(1133);
                            nestedIdentifier();
                        }
                    }
                    setState(1138);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1139);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DataClauseContext extends ParserRuleContext {
        public DataClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dataClause;
        }

        public DataClauseContext() {
        }

        public void copyFrom(DataClauseContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class DataClauseValuesContext extends DataClauseContext {
        public TerminalNode VALUES() {
            return getToken(ClickHouseParser.VALUES, 0);
        }

        public List<AssignmentValuesContext> assignmentValues() {
            return getRuleContexts(AssignmentValuesContext.class);
        }

        public AssignmentValuesContext assignmentValues(int i) {
            return getRuleContext(AssignmentValuesContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public DataClauseValuesContext(DataClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDataClauseValues(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDataClauseValues(this);
        }
    }

    public static class DataClauseFormatContext extends DataClauseContext {
        public TerminalNode FORMAT() {
            return getToken(ClickHouseParser.FORMAT, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DataClauseFormatContext(DataClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDataClauseFormat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDataClauseFormat(this);
        }
    }

    public static class DataClauseSelectContext extends DataClauseContext {
        public SelectUnionStmtContext selectUnionStmt() {
            return getRuleContext(SelectUnionStmtContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(ClickHouseParser.EOF, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(ClickHouseParser.SEMICOLON, 0);
        }

        public DataClauseSelectContext(DataClauseContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDataClauseSelect(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDataClauseSelect(this);
        }
    }

    public final DataClauseContext dataClause() throws RecognitionException {
        DataClauseContext _localctx = new DataClauseContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_dataClause);
        int _la;
        try {
            setState(1158);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FORMAT:
                    _localctx = new DataClauseFormatContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1141);
                    match(FORMAT);
                    setState(1142);
                    identifier();
                }
                break;
                case VALUES:
                    _localctx = new DataClauseValuesContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1143);
                    match(VALUES);
                    setState(1144);
                    assignmentValues();
                    setState(1149);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(1145);
                                match(COMMA);
                                setState(1146);
                                assignmentValues();
                            }
                        }
                        setState(1151);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case SELECT:
                case WITH:
                case LPAREN:
                    _localctx = new DataClauseSelectContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1152);
                    selectUnionStmt();
                    setState(1154);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == SEMICOLON) {
                        {
                            setState(1153);
                            match(SEMICOLON);
                        }
                    }

                    setState(1156);
                    match(EOF);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentValuesContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<AssignmentValueContext> assignmentValue() {
            return getRuleContexts(AssignmentValueContext.class);
        }

        public AssignmentValueContext assignmentValue(int i) {
            return getRuleContext(AssignmentValueContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignmentValues;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAssignmentValues(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAssignmentValues(this);
        }
    }

    public final AssignmentValuesContext assignmentValues() throws RecognitionException {
        AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_assignmentValues);
        int _la;
        try {
            setState(1173);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 136, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1160);
                    match(LPAREN);
                    setState(1161);
                    assignmentValue();
                    setState(1166);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(1162);
                                match(COMMA);
                                setState(1163);
                                assignmentValue();
                            }
                        }
                        setState(1168);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1169);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1171);
                    match(LPAREN);
                    setState(1172);
                    match(RPAREN);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentValueContext extends ParserRuleContext {
        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignmentValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterAssignmentValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitAssignmentValue(this);
        }
    }

    public final AssignmentValueContext assignmentValue() throws RecognitionException {
        AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_assignmentValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1175);
                literal();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class KillStmtContext extends ParserRuleContext {
        public KillStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_killStmt;
        }

        public KillStmtContext() {
        }

        public void copyFrom(KillStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class KillMutationStmtContext extends KillStmtContext {
        public TerminalNode KILL() {
            return getToken(ClickHouseParser.KILL, 0);
        }

        public TerminalNode MUTATION() {
            return getToken(ClickHouseParser.MUTATION, 0);
        }

        public WhereClauseContext whereClause() {
            return getRuleContext(WhereClauseContext.class, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public TerminalNode SYNC() {
            return getToken(ClickHouseParser.SYNC, 0);
        }

        public TerminalNode ASYNC() {
            return getToken(ClickHouseParser.ASYNC, 0);
        }

        public TerminalNode TEST() {
            return getToken(ClickHouseParser.TEST, 0);
        }

        public KillMutationStmtContext(KillStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterKillMutationStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitKillMutationStmt(this);
        }
    }

    public final KillStmtContext killStmt() throws RecognitionException {
        KillStmtContext _localctx = new KillStmtContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_killStmt);
        int _la;
        try {
            _localctx = new KillMutationStmtContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(1177);
                match(KILL);
                setState(1178);
                match(MUTATION);
                setState(1180);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ON) {
                    {
                        setState(1179);
                        clusterClause();
                    }
                }

                setState(1182);
                whereClause();
                setState(1184);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASYNC || _la == SYNC || _la == TEST) {
                    {
                        setState(1183);
                        _la = _input.LA(1);
                        if (!(_la == ASYNC || _la == SYNC || _la == TEST)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OptimizeStmtContext extends ParserRuleContext {
        public TerminalNode OPTIMIZE() {
            return getToken(ClickHouseParser.OPTIMIZE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public PartitionClauseContext partitionClause() {
            return getRuleContext(PartitionClauseContext.class, 0);
        }

        public TerminalNode FINAL() {
            return getToken(ClickHouseParser.FINAL, 0);
        }

        public TerminalNode DEDUPLICATE() {
            return getToken(ClickHouseParser.DEDUPLICATE, 0);
        }

        public OptimizeStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_optimizeStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterOptimizeStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitOptimizeStmt(this);
        }
    }

    public final OptimizeStmtContext optimizeStmt() throws RecognitionException {
        OptimizeStmtContext _localctx = new OptimizeStmtContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_optimizeStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1186);
                match(OPTIMIZE);
                setState(1187);
                match(TABLE);
                setState(1188);
                tableIdentifier();
                setState(1190);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ON) {
                    {
                        setState(1189);
                        clusterClause();
                    }
                }

                setState(1193);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == PARTITION) {
                    {
                        setState(1192);
                        partitionClause();
                    }
                }

                setState(1196);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == FINAL) {
                    {
                        setState(1195);
                        match(FINAL);
                    }
                }

                setState(1199);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DEDUPLICATE) {
                    {
                        setState(1198);
                        match(DEDUPLICATE);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RenameStmtContext extends ParserRuleContext {
        public TerminalNode RENAME() {
            return getToken(ClickHouseParser.RENAME, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public List<TableIdentifierContext> tableIdentifier() {
            return getRuleContexts(TableIdentifierContext.class);
        }

        public TableIdentifierContext tableIdentifier(int i) {
            return getRuleContext(TableIdentifierContext.class, i);
        }

        public List<TerminalNode> TO() {
            return getTokens(ClickHouseParser.TO);
        }

        public TerminalNode TO(int i) {
            return getToken(ClickHouseParser.TO, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public RenameStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_renameStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterRenameStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitRenameStmt(this);
        }
    }

    public final RenameStmtContext renameStmt() throws RecognitionException {
        RenameStmtContext _localctx = new RenameStmtContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_renameStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1201);
                match(RENAME);
                setState(1202);
                match(TABLE);
                setState(1203);
                tableIdentifier();
                setState(1204);
                match(TO);
                setState(1205);
                tableIdentifier();
                setState(1213);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1206);
                            match(COMMA);
                            setState(1207);
                            tableIdentifier();
                            setState(1208);
                            match(TO);
                            setState(1209);
                            tableIdentifier();
                        }
                    }
                    setState(1215);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1217);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ON) {
                    {
                        setState(1216);
                        clusterClause();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProjectionSelectStmtContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode SELECT() {
            return getToken(ClickHouseParser.SELECT, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public WithClauseContext withClause() {
            return getRuleContext(WithClauseContext.class, 0);
        }

        public GroupByClauseContext groupByClause() {
            return getRuleContext(GroupByClauseContext.class, 0);
        }

        public ProjectionOrderByClauseContext projectionOrderByClause() {
            return getRuleContext(ProjectionOrderByClauseContext.class, 0);
        }

        public ProjectionSelectStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_projectionSelectStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterProjectionSelectStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitProjectionSelectStmt(this);
        }
    }

    public final ProjectionSelectStmtContext projectionSelectStmt() throws RecognitionException {
        ProjectionSelectStmtContext _localctx = new ProjectionSelectStmtContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_projectionSelectStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1219);
                match(LPAREN);
                setState(1221);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WITH) {
                    {
                        setState(1220);
                        withClause();
                    }
                }

                setState(1223);
                match(SELECT);
                setState(1224);
                columnExprList();
                setState(1226);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == GROUP) {
                    {
                        setState(1225);
                        groupByClause();
                    }
                }

                setState(1229);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ORDER) {
                    {
                        setState(1228);
                        projectionOrderByClause();
                    }
                }

                setState(1231);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectUnionStmtContext extends ParserRuleContext {
        public List<SelectStmtWithParensContext> selectStmtWithParens() {
            return getRuleContexts(SelectStmtWithParensContext.class);
        }

        public SelectStmtWithParensContext selectStmtWithParens(int i) {
            return getRuleContext(SelectStmtWithParensContext.class, i);
        }

        public List<TerminalNode> UNION() {
            return getTokens(ClickHouseParser.UNION);
        }

        public TerminalNode UNION(int i) {
            return getToken(ClickHouseParser.UNION, i);
        }

        public List<TerminalNode> ALL() {
            return getTokens(ClickHouseParser.ALL);
        }

        public TerminalNode ALL(int i) {
            return getToken(ClickHouseParser.ALL, i);
        }

        public SelectUnionStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectUnionStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSelectUnionStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSelectUnionStmt(this);
        }
    }

    public final SelectUnionStmtContext selectUnionStmt() throws RecognitionException {
        SelectUnionStmtContext _localctx = new SelectUnionStmtContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_selectUnionStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1233);
                selectStmtWithParens();
                setState(1239);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == UNION) {
                    {
                        {
                            setState(1234);
                            match(UNION);
                            setState(1235);
                            match(ALL);
                            setState(1236);
                            selectStmtWithParens();
                        }
                    }
                    setState(1241);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectStmtWithParensContext extends ParserRuleContext {
        public SelectStmtContext selectStmt() {
            return getRuleContext(SelectStmtContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public SelectUnionStmtContext selectUnionStmt() {
            return getRuleContext(SelectUnionStmtContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public SelectStmtWithParensContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectStmtWithParens;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSelectStmtWithParens(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSelectStmtWithParens(this);
        }
    }

    public final SelectStmtWithParensContext selectStmtWithParens() throws RecognitionException {
        SelectStmtWithParensContext _localctx = new SelectStmtWithParensContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_selectStmtWithParens);
        try {
            setState(1247);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SELECT:
                case WITH:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1242);
                    selectStmt();
                }
                break;
                case LPAREN:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1243);
                    match(LPAREN);
                    setState(1244);
                    selectUnionStmt();
                    setState(1245);
                    match(RPAREN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectStmtContext extends ParserRuleContext {
        public TerminalNode SELECT() {
            return getToken(ClickHouseParser.SELECT, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public WithClauseContext withClause() {
            return getRuleContext(WithClauseContext.class, 0);
        }

        public TerminalNode DISTINCT() {
            return getToken(ClickHouseParser.DISTINCT, 0);
        }

        public TopClauseContext topClause() {
            return getRuleContext(TopClauseContext.class, 0);
        }

        public FromClauseContext fromClause() {
            return getRuleContext(FromClauseContext.class, 0);
        }

        public ArrayJoinClauseContext arrayJoinClause() {
            return getRuleContext(ArrayJoinClauseContext.class, 0);
        }

        public WindowClauseContext windowClause() {
            return getRuleContext(WindowClauseContext.class, 0);
        }

        public PrewhereClauseContext prewhereClause() {
            return getRuleContext(PrewhereClauseContext.class, 0);
        }

        public WhereClauseContext whereClause() {
            return getRuleContext(WhereClauseContext.class, 0);
        }

        public GroupByClauseContext groupByClause() {
            return getRuleContext(GroupByClauseContext.class, 0);
        }

        public List<TerminalNode> WITH() {
            return getTokens(ClickHouseParser.WITH);
        }

        public TerminalNode WITH(int i) {
            return getToken(ClickHouseParser.WITH, i);
        }

        public TerminalNode TOTALS() {
            return getToken(ClickHouseParser.TOTALS, 0);
        }

        public HavingClauseContext havingClause() {
            return getRuleContext(HavingClauseContext.class, 0);
        }

        public OrderByClauseContext orderByClause() {
            return getRuleContext(OrderByClauseContext.class, 0);
        }

        public LimitByClauseContext limitByClause() {
            return getRuleContext(LimitByClauseContext.class, 0);
        }

        public LimitClauseContext limitClause() {
            return getRuleContext(LimitClauseContext.class, 0);
        }

        public SettingsClauseContext settingsClause() {
            return getRuleContext(SettingsClauseContext.class, 0);
        }

        public TerminalNode CUBE() {
            return getToken(ClickHouseParser.CUBE, 0);
        }

        public TerminalNode ROLLUP() {
            return getToken(ClickHouseParser.ROLLUP, 0);
        }

        public SelectStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSelectStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSelectStmt(this);
        }
    }

    public final SelectStmtContext selectStmt() throws RecognitionException {
        SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_selectStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1250);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WITH) {
                    {
                        setState(1249);
                        withClause();
                    }
                }

                setState(1252);
                match(SELECT);
                setState(1254);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 151, _ctx)) {
                    case 1: {
                        setState(1253);
                        match(DISTINCT);
                    }
                    break;
                }
                setState(1257);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 152, _ctx)) {
                    case 1: {
                        setState(1256);
                        topClause();
                    }
                    break;
                }
                setState(1259);
                columnExprList();
                setState(1261);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == FROM) {
                    {
                        setState(1260);
                        fromClause();
                    }
                }

                setState(1264);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ARRAY || _la == INNER || _la == LEFT) {
                    {
                        setState(1263);
                        arrayJoinClause();
                    }
                }

                setState(1267);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WINDOW) {
                    {
                        setState(1266);
                        windowClause();
                    }
                }

                setState(1270);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == PREWHERE) {
                    {
                        setState(1269);
                        prewhereClause();
                    }
                }

                setState(1273);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WHERE) {
                    {
                        setState(1272);
                        whereClause();
                    }
                }

                setState(1276);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == GROUP) {
                    {
                        setState(1275);
                        groupByClause();
                    }
                }

                setState(1280);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 159, _ctx)) {
                    case 1: {
                        setState(1278);
                        match(WITH);
                        setState(1279);
                        _la = _input.LA(1);
                        if (!(_la == CUBE || _la == ROLLUP)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                }
                setState(1284);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WITH) {
                    {
                        setState(1282);
                        match(WITH);
                        setState(1283);
                        match(TOTALS);
                    }
                }

                setState(1287);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == HAVING) {
                    {
                        setState(1286);
                        havingClause();
                    }
                }

                setState(1290);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ORDER) {
                    {
                        setState(1289);
                        orderByClause();
                    }
                }

                setState(1293);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 163, _ctx)) {
                    case 1: {
                        setState(1292);
                        limitByClause();
                    }
                    break;
                }
                setState(1296);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LIMIT) {
                    {
                        setState(1295);
                        limitClause();
                    }
                }

                setState(1299);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SETTINGS) {
                    {
                        setState(1298);
                        settingsClause();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WithClauseContext extends ParserRuleContext {
        public TerminalNode WITH() {
            return getToken(ClickHouseParser.WITH, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public WithClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_withClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWithClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitWithClause(this);
        }
    }

    public final WithClauseContext withClause() throws RecognitionException {
        WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_withClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1301);
                match(WITH);
                setState(1302);
                columnExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TopClauseContext extends ParserRuleContext {
        public TerminalNode TOP() {
            return getToken(ClickHouseParser.TOP, 0);
        }

        public TerminalNode DECIMAL_LITERAL() {
            return getToken(ClickHouseParser.DECIMAL_LITERAL, 0);
        }

        public TerminalNode WITH() {
            return getToken(ClickHouseParser.WITH, 0);
        }

        public TerminalNode TIES() {
            return getToken(ClickHouseParser.TIES, 0);
        }

        public TopClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_topClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTopClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitTopClause(this);
        }
    }

    public final TopClauseContext topClause() throws RecognitionException {
        TopClauseContext _localctx = new TopClauseContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_topClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1304);
                match(TOP);
                setState(1305);
                match(DECIMAL_LITERAL);
                setState(1308);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 166, _ctx)) {
                    case 1: {
                        setState(1306);
                        match(WITH);
                        setState(1307);
                        match(TIES);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FromClauseContext extends ParserRuleContext {
        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public JoinExprContext joinExpr() {
            return getRuleContext(JoinExprContext.class, 0);
        }

        public FromClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fromClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterFromClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitFromClause(this);
        }
    }

    public final FromClauseContext fromClause() throws RecognitionException {
        FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_fromClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1310);
                match(FROM);
                setState(1311);
                joinExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayJoinClauseContext extends ParserRuleContext {
        public TerminalNode ARRAY() {
            return getToken(ClickHouseParser.ARRAY, 0);
        }

        public TerminalNode JOIN() {
            return getToken(ClickHouseParser.JOIN, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public TerminalNode LEFT() {
            return getToken(ClickHouseParser.LEFT, 0);
        }

        public TerminalNode INNER() {
            return getToken(ClickHouseParser.INNER, 0);
        }

        public ArrayJoinClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayJoinClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterArrayJoinClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitArrayJoinClause(this);
        }
    }

    public final ArrayJoinClauseContext arrayJoinClause() throws RecognitionException {
        ArrayJoinClauseContext _localctx = new ArrayJoinClauseContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_arrayJoinClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1314);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INNER || _la == LEFT) {
                    {
                        setState(1313);
                        _la = _input.LA(1);
                        if (!(_la == INNER || _la == LEFT)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(1316);
                match(ARRAY);
                setState(1317);
                match(JOIN);
                setState(1318);
                columnExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WindowClauseContext extends ParserRuleContext {
        public TerminalNode WINDOW() {
            return getToken(ClickHouseParser.WINDOW, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public WindowExprContext windowExpr() {
            return getRuleContext(WindowExprContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public WindowClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWindowClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitWindowClause(this);
        }
    }

    public final WindowClauseContext windowClause() throws RecognitionException {
        WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_windowClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1320);
                match(WINDOW);
                setState(1321);
                identifier();
                setState(1322);
                match(AS);
                setState(1323);
                match(LPAREN);
                setState(1324);
                windowExpr();
                setState(1325);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrewhereClauseContext extends ParserRuleContext {
        public TerminalNode PREWHERE() {
            return getToken(ClickHouseParser.PREWHERE, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public PrewhereClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prewhereClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterPrewhereClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitPrewhereClause(this);
        }
    }

    public final PrewhereClauseContext prewhereClause() throws RecognitionException {
        PrewhereClauseContext _localctx = new PrewhereClauseContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_prewhereClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1327);
                match(PREWHERE);
                setState(1328);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WhereClauseContext extends ParserRuleContext {
        public TerminalNode WHERE() {
            return getToken(ClickHouseParser.WHERE, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public WhereClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whereClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWhereClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitWhereClause(this);
        }
    }

    public final WhereClauseContext whereClause() throws RecognitionException {
        WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_whereClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1330);
                match(WHERE);
                setState(1331);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GroupByClauseContext extends ParserRuleContext {
        public TerminalNode GROUP() {
            return getToken(ClickHouseParser.GROUP, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public TerminalNode CUBE() {
            return getToken(ClickHouseParser.CUBE, 0);
        }

        public TerminalNode ROLLUP() {
            return getToken(ClickHouseParser.ROLLUP, 0);
        }

        public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_groupByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterGroupByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitGroupByClause(this);
        }
    }

    public final GroupByClauseContext groupByClause() throws RecognitionException {
        GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_groupByClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1333);
                match(GROUP);
                setState(1334);
                match(BY);
                setState(1341);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 168, _ctx)) {
                    case 1: {
                        setState(1335);
                        _la = _input.LA(1);
                        if (!(_la == CUBE || _la == ROLLUP)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1336);
                        match(LPAREN);
                        setState(1337);
                        columnExprList();
                        setState(1338);
                        match(RPAREN);
                    }
                    break;
                    case 2: {
                        setState(1340);
                        columnExprList();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class HavingClauseContext extends ParserRuleContext {
        public TerminalNode HAVING() {
            return getToken(ClickHouseParser.HAVING, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public HavingClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_havingClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterHavingClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitHavingClause(this);
        }
    }

    public final HavingClauseContext havingClause() throws RecognitionException {
        HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_havingClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1343);
                match(HAVING);
                setState(1344);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OrderByClauseContext extends ParserRuleContext {
        public TerminalNode ORDER() {
            return getToken(ClickHouseParser.ORDER, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public OrderExprListContext orderExprList() {
            return getRuleContext(OrderExprListContext.class, 0);
        }

        public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterOrderByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitOrderByClause(this);
        }
    }

    public final OrderByClauseContext orderByClause() throws RecognitionException {
        OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_orderByClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1346);
                match(ORDER);
                setState(1347);
                match(BY);
                setState(1348);
                orderExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProjectionOrderByClauseContext extends ParserRuleContext {
        public TerminalNode ORDER() {
            return getToken(ClickHouseParser.ORDER, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public ProjectionOrderByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_projectionOrderByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterProjectionOrderByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitProjectionOrderByClause(this);
        }
    }

    public final ProjectionOrderByClauseContext projectionOrderByClause() throws RecognitionException {
        ProjectionOrderByClauseContext _localctx = new ProjectionOrderByClauseContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_projectionOrderByClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1350);
                match(ORDER);
                setState(1351);
                match(BY);
                setState(1352);
                columnExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LimitByClauseContext extends ParserRuleContext {
        public TerminalNode LIMIT() {
            return getToken(ClickHouseParser.LIMIT, 0);
        }

        public LimitExprContext limitExpr() {
            return getRuleContext(LimitExprContext.class, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public LimitByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_limitByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterLimitByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitLimitByClause(this);
        }
    }

    public final LimitByClauseContext limitByClause() throws RecognitionException {
        LimitByClauseContext _localctx = new LimitByClauseContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_limitByClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1354);
                match(LIMIT);
                setState(1355);
                limitExpr();
                setState(1356);
                match(BY);
                setState(1357);
                columnExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LimitClauseContext extends ParserRuleContext {
        public TerminalNode LIMIT() {
            return getToken(ClickHouseParser.LIMIT, 0);
        }

        public LimitExprContext limitExpr() {
            return getRuleContext(LimitExprContext.class, 0);
        }

        public TerminalNode WITH() {
            return getToken(ClickHouseParser.WITH, 0);
        }

        public TerminalNode TIES() {
            return getToken(ClickHouseParser.TIES, 0);
        }

        public LimitClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_limitClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterLimitClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitLimitClause(this);
        }
    }

    public final LimitClauseContext limitClause() throws RecognitionException {
        LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_limitClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1359);
                match(LIMIT);
                setState(1360);
                limitExpr();
                setState(1363);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WITH) {
                    {
                        setState(1361);
                        match(WITH);
                        setState(1362);
                        match(TIES);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SettingsClauseContext extends ParserRuleContext {
        public TerminalNode SETTINGS() {
            return getToken(ClickHouseParser.SETTINGS, 0);
        }

        public SettingExprListContext settingExprList() {
            return getRuleContext(SettingExprListContext.class, 0);
        }

        public SettingsClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_settingsClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSettingsClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSettingsClause(this);
        }
    }

    public final SettingsClauseContext settingsClause() throws RecognitionException {
        SettingsClauseContext _localctx = new SettingsClauseContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_settingsClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1365);
                match(SETTINGS);
                setState(1366);
                settingExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class JoinExprContext extends ParserRuleContext {
        public JoinExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinExpr;
        }

        public JoinExprContext() {
        }

        public void copyFrom(JoinExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class JoinExprOpContext extends JoinExprContext {
        public List<JoinExprContext> joinExpr() {
            return getRuleContexts(JoinExprContext.class);
        }

        public JoinExprContext joinExpr(int i) {
            return getRuleContext(JoinExprContext.class, i);
        }

        public TerminalNode JOIN() {
            return getToken(ClickHouseParser.JOIN, 0);
        }

        public JoinConstraintClauseContext joinConstraintClause() {
            return getRuleContext(JoinConstraintClauseContext.class, 0);
        }

        public JoinOpContext joinOp() {
            return getRuleContext(JoinOpContext.class, 0);
        }

        public TerminalNode GLOBAL() {
            return getToken(ClickHouseParser.GLOBAL, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(ClickHouseParser.LOCAL, 0);
        }

        public JoinExprOpContext(JoinExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinExprOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinExprOp(this);
        }
    }

    public static class JoinExprTableContext extends JoinExprContext {
        public TableExprContext tableExpr() {
            return getRuleContext(TableExprContext.class, 0);
        }

        public TerminalNode FINAL() {
            return getToken(ClickHouseParser.FINAL, 0);
        }

        public SampleClauseContext sampleClause() {
            return getRuleContext(SampleClauseContext.class, 0);
        }

        public JoinExprTableContext(JoinExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinExprTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinExprTable(this);
        }
    }

    public static class JoinExprParensContext extends JoinExprContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public JoinExprContext joinExpr() {
            return getRuleContext(JoinExprContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public JoinExprParensContext(JoinExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinExprParens(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinExprParens(this);
        }
    }

    public static class JoinExprCrossOpContext extends JoinExprContext {
        public List<JoinExprContext> joinExpr() {
            return getRuleContexts(JoinExprContext.class);
        }

        public JoinExprContext joinExpr(int i) {
            return getRuleContext(JoinExprContext.class, i);
        }

        public JoinOpCrossContext joinOpCross() {
            return getRuleContext(JoinOpCrossContext.class, 0);
        }

        public JoinExprCrossOpContext(JoinExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinExprCrossOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinExprCrossOp(this);
        }
    }

    public final JoinExprContext joinExpr() throws RecognitionException {
        return joinExpr(0);
    }

    private JoinExprContext joinExpr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        JoinExprContext _localctx = new JoinExprContext(_ctx, _parentState);
        JoinExprContext _prevctx = _localctx;
        int _startState = 146;
        enterRecursionRule(_localctx, 146, RULE_joinExpr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1380);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 172, _ctx)) {
                    case 1: {
                        _localctx = new JoinExprTableContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(1369);
                        tableExpr(0);
                        setState(1371);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 170, _ctx)) {
                            case 1: {
                                setState(1370);
                                match(FINAL);
                            }
                            break;
                        }
                        setState(1374);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 171, _ctx)) {
                            case 1: {
                                setState(1373);
                                sampleClause();
                            }
                            break;
                        }
                    }
                    break;
                    case 2: {
                        _localctx = new JoinExprParensContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1376);
                        match(LPAREN);
                        setState(1377);
                        joinExpr(0);
                        setState(1378);
                        match(RPAREN);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1399);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 176, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1397);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 175, _ctx)) {
                                case 1: {
                                    _localctx = new JoinExprCrossOpContext(new JoinExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
                                    setState(1382);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1383);
                                    joinOpCross();
                                    setState(1384);
                                    joinExpr(4);
                                }
                                break;
                                case 2: {
                                    _localctx = new JoinExprOpContext(new JoinExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_joinExpr);
                                    setState(1386);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(1388);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == GLOBAL || _la == LOCAL) {
                                        {
                                            setState(1387);
                                            _la = _input.LA(1);
                                            if (!(_la == GLOBAL || _la == LOCAL)) {
                                                _errHandler.recoverInline(this);
                                            } else {
                                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                                _errHandler.reportMatch(this);
                                                consume();
                                            }
                                        }
                                    }

                                    setState(1391);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (LEFT - 68)))) != 0) || _la == RIGHT || _la == SEMI) {
                                        {
                                            setState(1390);
                                            joinOp();
                                        }
                                    }

                                    setState(1393);
                                    match(JOIN);
                                    setState(1394);
                                    joinExpr(0);
                                    setState(1395);
                                    joinConstraintClause();
                                }
                                break;
                            }
                        }
                    }
                    setState(1401);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 176, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class JoinOpContext extends ParserRuleContext {
        public JoinOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinOp;
        }

        public JoinOpContext() {
        }

        public void copyFrom(JoinOpContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class JoinOpFullContext extends JoinOpContext {
        public TerminalNode FULL() {
            return getToken(ClickHouseParser.FULL, 0);
        }

        public TerminalNode OUTER() {
            return getToken(ClickHouseParser.OUTER, 0);
        }

        public TerminalNode ALL() {
            return getToken(ClickHouseParser.ALL, 0);
        }

        public TerminalNode ANY() {
            return getToken(ClickHouseParser.ANY, 0);
        }

        public JoinOpFullContext(JoinOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinOpFull(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinOpFull(this);
        }
    }

    public static class JoinOpInnerContext extends JoinOpContext {
        public TerminalNode INNER() {
            return getToken(ClickHouseParser.INNER, 0);
        }

        public TerminalNode ALL() {
            return getToken(ClickHouseParser.ALL, 0);
        }

        public TerminalNode ANY() {
            return getToken(ClickHouseParser.ANY, 0);
        }

        public TerminalNode ASOF() {
            return getToken(ClickHouseParser.ASOF, 0);
        }

        public JoinOpInnerContext(JoinOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinOpInner(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinOpInner(this);
        }
    }

    public static class JoinOpLeftRightContext extends JoinOpContext {
        public TerminalNode LEFT() {
            return getToken(ClickHouseParser.LEFT, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(ClickHouseParser.RIGHT, 0);
        }

        public TerminalNode OUTER() {
            return getToken(ClickHouseParser.OUTER, 0);
        }

        public TerminalNode SEMI() {
            return getToken(ClickHouseParser.SEMI, 0);
        }

        public TerminalNode ALL() {
            return getToken(ClickHouseParser.ALL, 0);
        }

        public TerminalNode ANTI() {
            return getToken(ClickHouseParser.ANTI, 0);
        }

        public TerminalNode ANY() {
            return getToken(ClickHouseParser.ANY, 0);
        }

        public TerminalNode ASOF() {
            return getToken(ClickHouseParser.ASOF, 0);
        }

        public JoinOpLeftRightContext(JoinOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinOpLeftRight(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinOpLeftRight(this);
        }
    }

    public final JoinOpContext joinOp() throws RecognitionException {
        JoinOpContext _localctx = new JoinOpContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_joinOp);
        int _la;
        try {
            setState(1445);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 190, _ctx)) {
                case 1:
                    _localctx = new JoinOpInnerContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1411);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 179, _ctx)) {
                        case 1: {
                            setState(1403);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
                                {
                                    setState(1402);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                            }

                            setState(1405);
                            match(INNER);
                        }
                        break;
                        case 2: {
                            setState(1406);
                            match(INNER);
                            setState(1408);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0)) {
                                {
                                    setState(1407);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                            }

                        }
                        break;
                        case 3: {
                            setState(1410);
                            _la = _input.LA(1);
                            if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << ASOF))) != 0))) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                        break;
                    }
                }
                break;
                case 2:
                    _localctx = new JoinOpLeftRightContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1427);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 184, _ctx)) {
                        case 1: {
                            setState(1414);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la == SEMI) {
                                {
                                    setState(1413);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la == SEMI)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                            }

                            setState(1416);
                            _la = _input.LA(1);
                            if (!(_la == LEFT || _la == RIGHT)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(1418);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == OUTER) {
                                {
                                    setState(1417);
                                    match(OUTER);
                                }
                            }

                        }
                        break;
                        case 2: {
                            setState(1420);
                            _la = _input.LA(1);
                            if (!(_la == LEFT || _la == RIGHT)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(1422);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == OUTER) {
                                {
                                    setState(1421);
                                    match(OUTER);
                                }
                            }

                            setState(1425);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la == SEMI) {
                                {
                                    setState(1424);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANTI) | (1L << ANY) | (1L << ASOF))) != 0) || _la == SEMI)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                            }

                        }
                        break;
                    }
                }
                break;
                case 3:
                    _localctx = new JoinOpFullContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1443);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 189, _ctx)) {
                        case 1: {
                            setState(1430);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == ALL || _la == ANY) {
                                {
                                    setState(1429);
                                    _la = _input.LA(1);
                                    if (!(_la == ALL || _la == ANY)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                            }

                            setState(1432);
                            match(FULL);
                            setState(1434);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == OUTER) {
                                {
                                    setState(1433);
                                    match(OUTER);
                                }
                            }

                        }
                        break;
                        case 2: {
                            setState(1436);
                            match(FULL);
                            setState(1438);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == OUTER) {
                                {
                                    setState(1437);
                                    match(OUTER);
                                }
                            }

                            setState(1441);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == ALL || _la == ANY) {
                                {
                                    setState(1440);
                                    _la = _input.LA(1);
                                    if (!(_la == ALL || _la == ANY)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                            }

                        }
                        break;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class JoinOpCrossContext extends ParserRuleContext {
        public TerminalNode CROSS() {
            return getToken(ClickHouseParser.CROSS, 0);
        }

        public TerminalNode JOIN() {
            return getToken(ClickHouseParser.JOIN, 0);
        }

        public TerminalNode GLOBAL() {
            return getToken(ClickHouseParser.GLOBAL, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(ClickHouseParser.LOCAL, 0);
        }

        public TerminalNode COMMA() {
            return getToken(ClickHouseParser.COMMA, 0);
        }

        public JoinOpCrossContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinOpCross;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinOpCross(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinOpCross(this);
        }
    }

    public final JoinOpCrossContext joinOpCross() throws RecognitionException {
        JoinOpCrossContext _localctx = new JoinOpCrossContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_joinOpCross);
        int _la;
        try {
            setState(1453);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CROSS:
                case GLOBAL:
                case LOCAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1448);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == GLOBAL || _la == LOCAL) {
                        {
                            setState(1447);
                            _la = _input.LA(1);
                            if (!(_la == GLOBAL || _la == LOCAL)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                    }

                    setState(1450);
                    match(CROSS);
                    setState(1451);
                    match(JOIN);
                }
                break;
                case COMMA:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1452);
                    match(COMMA);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class JoinConstraintClauseContext extends ParserRuleContext {
        public TerminalNode ON() {
            return getToken(ClickHouseParser.ON, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public TerminalNode USING() {
            return getToken(ClickHouseParser.USING, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public JoinConstraintClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinConstraintClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterJoinConstraintClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitJoinConstraintClause(this);
        }
    }

    public final JoinConstraintClauseContext joinConstraintClause() throws RecognitionException {
        JoinConstraintClauseContext _localctx = new JoinConstraintClauseContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_joinConstraintClause);
        try {
            setState(1464);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 193, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1455);
                    match(ON);
                    setState(1456);
                    columnExprList();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1457);
                    match(USING);
                    setState(1458);
                    match(LPAREN);
                    setState(1459);
                    columnExprList();
                    setState(1460);
                    match(RPAREN);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1462);
                    match(USING);
                    setState(1463);
                    columnExprList();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SampleClauseContext extends ParserRuleContext {
        public TerminalNode SAMPLE() {
            return getToken(ClickHouseParser.SAMPLE, 0);
        }

        public List<RatioExprContext> ratioExpr() {
            return getRuleContexts(RatioExprContext.class);
        }

        public RatioExprContext ratioExpr(int i) {
            return getRuleContext(RatioExprContext.class, i);
        }

        public TerminalNode OFFSET() {
            return getToken(ClickHouseParser.OFFSET, 0);
        }

        public SampleClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sampleClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSampleClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSampleClause(this);
        }
    }

    public final SampleClauseContext sampleClause() throws RecognitionException {
        SampleClauseContext _localctx = new SampleClauseContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_sampleClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1466);
                match(SAMPLE);
                setState(1467);
                ratioExpr();
                setState(1470);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 194, _ctx)) {
                    case 1: {
                        setState(1468);
                        match(OFFSET);
                        setState(1469);
                        ratioExpr();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LimitExprContext extends ParserRuleContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(ClickHouseParser.COMMA, 0);
        }

        public TerminalNode OFFSET() {
            return getToken(ClickHouseParser.OFFSET, 0);
        }

        public LimitExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_limitExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterLimitExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitLimitExpr(this);
        }
    }

    public final LimitExprContext limitExpr() throws RecognitionException {
        LimitExprContext _localctx = new LimitExprContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_limitExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1472);
                columnExpr(0);
                setState(1475);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OFFSET || _la == COMMA) {
                    {
                        setState(1473);
                        _la = _input.LA(1);
                        if (!(_la == OFFSET || _la == COMMA)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1474);
                        columnExpr(0);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OrderExprListContext extends ParserRuleContext {
        public List<OrderExprContext> orderExpr() {
            return getRuleContexts(OrderExprContext.class);
        }

        public OrderExprContext orderExpr(int i) {
            return getRuleContext(OrderExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public OrderExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderExprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterOrderExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitOrderExprList(this);
        }
    }

    public final OrderExprListContext orderExprList() throws RecognitionException {
        OrderExprListContext _localctx = new OrderExprListContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_orderExprList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1477);
                orderExpr();
                setState(1482);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 196, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1478);
                                match(COMMA);
                                setState(1479);
                                orderExpr();
                            }
                        }
                    }
                    setState(1484);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 196, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OrderExprContext extends ParserRuleContext {
        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode NULLS() {
            return getToken(ClickHouseParser.NULLS, 0);
        }

        public TerminalNode COLLATE() {
            return getToken(ClickHouseParser.COLLATE, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode ASCENDING() {
            return getToken(ClickHouseParser.ASCENDING, 0);
        }

        public TerminalNode DESCENDING() {
            return getToken(ClickHouseParser.DESCENDING, 0);
        }

        public TerminalNode DESC() {
            return getToken(ClickHouseParser.DESC, 0);
        }

        public TerminalNode FIRST() {
            return getToken(ClickHouseParser.FIRST, 0);
        }

        public TerminalNode LAST() {
            return getToken(ClickHouseParser.LAST, 0);
        }

        public OrderExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterOrderExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitOrderExpr(this);
        }
    }

    public final OrderExprContext orderExpr() throws RecognitionException {
        OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_orderExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1485);
                columnExpr(0);
                setState(1487);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 197, _ctx)) {
                    case 1: {
                        setState(1486);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                }
                setState(1491);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 198, _ctx)) {
                    case 1: {
                        setState(1489);
                        match(NULLS);
                        setState(1490);
                        _la = _input.LA(1);
                        if (!(_la == FIRST || _la == LAST)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                }
                setState(1495);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 199, _ctx)) {
                    case 1: {
                        setState(1493);
                        match(COLLATE);
                        setState(1494);
                        match(STRING_LITERAL);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RatioExprContext extends ParserRuleContext {
        public List<NumberLiteralContext> numberLiteral() {
            return getRuleContexts(NumberLiteralContext.class);
        }

        public NumberLiteralContext numberLiteral(int i) {
            return getRuleContext(NumberLiteralContext.class, i);
        }

        public TerminalNode SLASH() {
            return getToken(ClickHouseParser.SLASH, 0);
        }

        public RatioExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ratioExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterRatioExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitRatioExpr(this);
        }
    }

    public final RatioExprContext ratioExpr() throws RecognitionException {
        RatioExprContext _localctx = new RatioExprContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_ratioExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1497);
                numberLiteral();
                setState(1500);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 200, _ctx)) {
                    case 1: {
                        setState(1498);
                        match(SLASH);
                        setState(1499);
                        numberLiteral();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SettingExprListContext extends ParserRuleContext {
        public List<SettingExprContext> settingExpr() {
            return getRuleContexts(SettingExprContext.class);
        }

        public SettingExprContext settingExpr(int i) {
            return getRuleContext(SettingExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public SettingExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_settingExprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSettingExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSettingExprList(this);
        }
    }

    public final SettingExprListContext settingExprList() throws RecognitionException {
        SettingExprListContext _localctx = new SettingExprListContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_settingExprList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1502);
                settingExpr();
                setState(1507);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 201, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1503);
                                match(COMMA);
                                setState(1504);
                                settingExpr();
                            }
                        }
                    }
                    setState(1509);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 201, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SettingExprContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode EQ_SINGLE() {
            return getToken(ClickHouseParser.EQ_SINGLE, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public SettingExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_settingExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSettingExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSettingExpr(this);
        }
    }

    public final SettingExprContext settingExpr() throws RecognitionException {
        SettingExprContext _localctx = new SettingExprContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_settingExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1510);
                identifier();
                setState(1511);
                match(EQ_SINGLE);
                setState(1512);
                literal();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WindowExprContext extends ParserRuleContext {
        public WinPartitionByClauseContext winPartitionByClause() {
            return getRuleContext(WinPartitionByClauseContext.class, 0);
        }

        public WinOrderByClauseContext winOrderByClause() {
            return getRuleContext(WinOrderByClauseContext.class, 0);
        }

        public WinFrameClauseContext winFrameClause() {
            return getRuleContext(WinFrameClauseContext.class, 0);
        }

        public WindowExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWindowExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitWindowExpr(this);
        }
    }

    public final WindowExprContext windowExpr() throws RecognitionException {
        WindowExprContext _localctx = new WindowExprContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_windowExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1515);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == PARTITION) {
                    {
                        setState(1514);
                        winPartitionByClause();
                    }
                }

                setState(1518);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ORDER) {
                    {
                        setState(1517);
                        winOrderByClause();
                    }
                }

                setState(1521);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == RANGE || _la == ROWS) {
                    {
                        setState(1520);
                        winFrameClause();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WinPartitionByClauseContext extends ParserRuleContext {
        public TerminalNode PARTITION() {
            return getToken(ClickHouseParser.PARTITION, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public WinPartitionByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_winPartitionByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWinPartitionByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitWinPartitionByClause(this);
        }
    }

    public final WinPartitionByClauseContext winPartitionByClause() throws RecognitionException {
        WinPartitionByClauseContext _localctx = new WinPartitionByClauseContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_winPartitionByClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1523);
                match(PARTITION);
                setState(1524);
                match(BY);
                setState(1525);
                columnExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WinOrderByClauseContext extends ParserRuleContext {
        public TerminalNode ORDER() {
            return getToken(ClickHouseParser.ORDER, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public OrderExprListContext orderExprList() {
            return getRuleContext(OrderExprListContext.class, 0);
        }

        public WinOrderByClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_winOrderByClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWinOrderByClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitWinOrderByClause(this);
        }
    }

    public final WinOrderByClauseContext winOrderByClause() throws RecognitionException {
        WinOrderByClauseContext _localctx = new WinOrderByClauseContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_winOrderByClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1527);
                match(ORDER);
                setState(1528);
                match(BY);
                setState(1529);
                orderExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WinFrameClauseContext extends ParserRuleContext {
        public WinFrameExtendContext winFrameExtend() {
            return getRuleContext(WinFrameExtendContext.class, 0);
        }

        public TerminalNode ROWS() {
            return getToken(ClickHouseParser.ROWS, 0);
        }

        public TerminalNode RANGE() {
            return getToken(ClickHouseParser.RANGE, 0);
        }

        public WinFrameClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_winFrameClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWinFrameClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitWinFrameClause(this);
        }
    }

    public final WinFrameClauseContext winFrameClause() throws RecognitionException {
        WinFrameClauseContext _localctx = new WinFrameClauseContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_winFrameClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1531);
                _la = _input.LA(1);
                if (!(_la == RANGE || _la == ROWS)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(1532);
                winFrameExtend();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WinFrameExtendContext extends ParserRuleContext {
        public WinFrameExtendContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_winFrameExtend;
        }

        public WinFrameExtendContext() {
        }

        public void copyFrom(WinFrameExtendContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class FrameStartContext extends WinFrameExtendContext {
        public WinFrameBoundContext winFrameBound() {
            return getRuleContext(WinFrameBoundContext.class, 0);
        }

        public FrameStartContext(WinFrameExtendContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterFrameStart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitFrameStart(this);
        }
    }

    public static class FrameBetweenContext extends WinFrameExtendContext {
        public TerminalNode BETWEEN() {
            return getToken(ClickHouseParser.BETWEEN, 0);
        }

        public List<WinFrameBoundContext> winFrameBound() {
            return getRuleContexts(WinFrameBoundContext.class);
        }

        public WinFrameBoundContext winFrameBound(int i) {
            return getRuleContext(WinFrameBoundContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(ClickHouseParser.AND, 0);
        }

        public FrameBetweenContext(WinFrameExtendContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterFrameBetween(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitFrameBetween(this);
        }
    }

    public final WinFrameExtendContext winFrameExtend() throws RecognitionException {
        WinFrameExtendContext _localctx = new WinFrameExtendContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_winFrameExtend);
        try {
            setState(1540);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CURRENT:
                case INF:
                case NAN_SQL:
                case UNBOUNDED:
                case FLOATING_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case HEXADECIMAL_LITERAL:
                case DASH:
                case DOT:
                case PLUS:
                    _localctx = new FrameStartContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1534);
                    winFrameBound();
                }
                break;
                case BETWEEN:
                    _localctx = new FrameBetweenContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1535);
                    match(BETWEEN);
                    setState(1536);
                    winFrameBound();
                    setState(1537);
                    match(AND);
                    setState(1538);
                    winFrameBound();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WinFrameBoundContext extends ParserRuleContext {
        public TerminalNode CURRENT() {
            return getToken(ClickHouseParser.CURRENT, 0);
        }

        public TerminalNode ROW() {
            return getToken(ClickHouseParser.ROW, 0);
        }

        public TerminalNode UNBOUNDED() {
            return getToken(ClickHouseParser.UNBOUNDED, 0);
        }

        public TerminalNode PRECEDING() {
            return getToken(ClickHouseParser.PRECEDING, 0);
        }

        public TerminalNode FOLLOWING() {
            return getToken(ClickHouseParser.FOLLOWING, 0);
        }

        public NumberLiteralContext numberLiteral() {
            return getRuleContext(NumberLiteralContext.class, 0);
        }

        public WinFrameBoundContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_winFrameBound;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWinFrameBound(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitWinFrameBound(this);
        }
    }

    public final WinFrameBoundContext winFrameBound() throws RecognitionException {
        WinFrameBoundContext _localctx = new WinFrameBoundContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_winFrameBound);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1554);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 206, _ctx)) {
                    case 1: {
                        setState(1542);
                        match(CURRENT);
                        setState(1543);
                        match(ROW);
                    }
                    break;
                    case 2: {
                        setState(1544);
                        match(UNBOUNDED);
                        setState(1545);
                        match(PRECEDING);
                    }
                    break;
                    case 3: {
                        setState(1546);
                        match(UNBOUNDED);
                        setState(1547);
                        match(FOLLOWING);
                    }
                    break;
                    case 4: {
                        setState(1548);
                        numberLiteral();
                        setState(1549);
                        match(PRECEDING);
                    }
                    break;
                    case 5: {
                        setState(1551);
                        numberLiteral();
                        setState(1552);
                        match(FOLLOWING);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SetStmtContext extends ParserRuleContext {
        public TerminalNode SET() {
            return getToken(ClickHouseParser.SET, 0);
        }

        public SettingExprListContext settingExprList() {
            return getRuleContext(SettingExprListContext.class, 0);
        }

        public SetStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_setStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterSetStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitSetStmt(this);
        }
    }

    public final SetStmtContext setStmt() throws RecognitionException {
        SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_setStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1556);
                match(SET);
                setState(1557);
                settingExprList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ShowStmtContext extends ParserRuleContext {
        public ShowStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_showStmt;
        }

        public ShowStmtContext() {
        }

        public void copyFrom(ShowStmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ShowCreateDatabaseStmtContext extends ShowStmtContext {
        public TerminalNode SHOW() {
            return getToken(ClickHouseParser.SHOW, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(ClickHouseParser.DATABASE, 0);
        }

        public DatabaseIdentifierContext databaseIdentifier() {
            return getRuleContext(DatabaseIdentifierContext.class, 0);
        }

        public ShowCreateDatabaseStmtContext(ShowStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterShowCreateDatabaseStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitShowCreateDatabaseStmt(this);
        }
    }

    public static class ShowDatabasesStmtContext extends ShowStmtContext {
        public TerminalNode SHOW() {
            return getToken(ClickHouseParser.SHOW, 0);
        }

        public TerminalNode DATABASES() {
            return getToken(ClickHouseParser.DATABASES, 0);
        }

        public ShowDatabasesStmtContext(ShowStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterShowDatabasesStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitShowDatabasesStmt(this);
        }
    }

    public static class ShowCreateTableStmtContext extends ShowStmtContext {
        public TerminalNode SHOW() {
            return getToken(ClickHouseParser.SHOW, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(ClickHouseParser.TEMPORARY, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public ShowCreateTableStmtContext(ShowStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterShowCreateTableStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitShowCreateTableStmt(this);
        }
    }

    public static class ShowTablesStmtContext extends ShowStmtContext {
        public TerminalNode SHOW() {
            return getToken(ClickHouseParser.SHOW, 0);
        }

        public TerminalNode TABLES() {
            return getToken(ClickHouseParser.TABLES, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(ClickHouseParser.TEMPORARY, 0);
        }

        public DatabaseIdentifierContext databaseIdentifier() {
            return getRuleContext(DatabaseIdentifierContext.class, 0);
        }

        public TerminalNode LIKE() {
            return getToken(ClickHouseParser.LIKE, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public WhereClauseContext whereClause() {
            return getRuleContext(WhereClauseContext.class, 0);
        }

        public LimitClauseContext limitClause() {
            return getRuleContext(LimitClauseContext.class, 0);
        }

        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public TerminalNode IN() {
            return getToken(ClickHouseParser.IN, 0);
        }

        public ShowTablesStmtContext(ShowStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterShowTablesStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitShowTablesStmt(this);
        }
    }

    public static class ShowDictionariesStmtContext extends ShowStmtContext {
        public TerminalNode SHOW() {
            return getToken(ClickHouseParser.SHOW, 0);
        }

        public TerminalNode DICTIONARIES() {
            return getToken(ClickHouseParser.DICTIONARIES, 0);
        }

        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public DatabaseIdentifierContext databaseIdentifier() {
            return getRuleContext(DatabaseIdentifierContext.class, 0);
        }

        public ShowDictionariesStmtContext(ShowStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterShowDictionariesStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitShowDictionariesStmt(this);
        }
    }

    public static class ShowCreateDictionaryStmtContext extends ShowStmtContext {
        public TerminalNode SHOW() {
            return getToken(ClickHouseParser.SHOW, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode DICTIONARY() {
            return getToken(ClickHouseParser.DICTIONARY, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public ShowCreateDictionaryStmtContext(ShowStmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterShowCreateDictionaryStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitShowCreateDictionaryStmt(this);
        }
    }

    public final ShowStmtContext showStmt() throws RecognitionException {
        ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_showStmt);
        int _la;
        try {
            setState(1601);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 214, _ctx)) {
                case 1:
                    _localctx = new ShowCreateDatabaseStmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1559);
                    match(SHOW);
                    setState(1560);
                    match(CREATE);
                    setState(1561);
                    match(DATABASE);
                    setState(1562);
                    databaseIdentifier();
                }
                break;
                case 2:
                    _localctx = new ShowCreateDictionaryStmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1563);
                    match(SHOW);
                    setState(1564);
                    match(CREATE);
                    setState(1565);
                    match(DICTIONARY);
                    setState(1566);
                    tableIdentifier();
                }
                break;
                case 3:
                    _localctx = new ShowCreateTableStmtContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1567);
                    match(SHOW);
                    setState(1568);
                    match(CREATE);
                    setState(1570);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 207, _ctx)) {
                        case 1: {
                            setState(1569);
                            match(TEMPORARY);
                        }
                        break;
                    }
                    setState(1573);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 208, _ctx)) {
                        case 1: {
                            setState(1572);
                            match(TABLE);
                        }
                        break;
                    }
                    setState(1575);
                    tableIdentifier();
                }
                break;
                case 4:
                    _localctx = new ShowDatabasesStmtContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1576);
                    match(SHOW);
                    setState(1577);
                    match(DATABASES);
                }
                break;
                case 5:
                    _localctx = new ShowDictionariesStmtContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1578);
                    match(SHOW);
                    setState(1579);
                    match(DICTIONARIES);
                    setState(1582);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == FROM) {
                        {
                            setState(1580);
                            match(FROM);
                            setState(1581);
                            databaseIdentifier();
                        }
                    }

                }
                break;
                case 6:
                    _localctx = new ShowTablesStmtContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1584);
                    match(SHOW);
                    setState(1586);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TEMPORARY) {
                        {
                            setState(1585);
                            match(TEMPORARY);
                        }
                    }

                    setState(1588);
                    match(TABLES);
                    setState(1591);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == FROM || _la == IN) {
                        {
                            setState(1589);
                            _la = _input.LA(1);
                            if (!(_la == FROM || _la == IN)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(1590);
                            databaseIdentifier();
                        }
                    }

                    setState(1596);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case LIKE: {
                            setState(1593);
                            match(LIKE);
                            setState(1594);
                            match(STRING_LITERAL);
                        }
                        break;
                        case WHERE: {
                            setState(1595);
                            whereClause();
                        }
                        break;
                        case EOF:
                        case FORMAT:
                        case INTO:
                        case LIMIT:
                        case RPAREN:
                        case SEMICOLON:
                            break;
                        default:
                            break;
                    }
                    setState(1599);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == LIMIT) {
                        {
                            setState(1598);
                            limitClause();
                        }
                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SystemStmtContext extends ParserRuleContext {
        public TerminalNode SYSTEM() {
            return getToken(ClickHouseParser.SYSTEM, 0);
        }

        public TerminalNode FLUSH() {
            return getToken(ClickHouseParser.FLUSH, 0);
        }

        public TerminalNode DISTRIBUTED() {
            return getToken(ClickHouseParser.DISTRIBUTED, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode LOGS() {
            return getToken(ClickHouseParser.LOGS, 0);
        }

        public TerminalNode RELOAD() {
            return getToken(ClickHouseParser.RELOAD, 0);
        }

        public TerminalNode DICTIONARIES() {
            return getToken(ClickHouseParser.DICTIONARIES, 0);
        }

        public TerminalNode DICTIONARY() {
            return getToken(ClickHouseParser.DICTIONARY, 0);
        }

        public TerminalNode START() {
            return getToken(ClickHouseParser.START, 0);
        }

        public TerminalNode STOP() {
            return getToken(ClickHouseParser.STOP, 0);
        }

        public TerminalNode SENDS() {
            return getToken(ClickHouseParser.SENDS, 0);
        }

        public TerminalNode FETCHES() {
            return getToken(ClickHouseParser.FETCHES, 0);
        }

        public TerminalNode MERGES() {
            return getToken(ClickHouseParser.MERGES, 0);
        }

        public TerminalNode TTL() {
            return getToken(ClickHouseParser.TTL, 0);
        }

        public TerminalNode REPLICATED() {
            return getToken(ClickHouseParser.REPLICATED, 0);
        }

        public TerminalNode SYNC() {
            return getToken(ClickHouseParser.SYNC, 0);
        }

        public TerminalNode REPLICA() {
            return getToken(ClickHouseParser.REPLICA, 0);
        }

        public SystemStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_systemStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterSystemStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitSystemStmt(this);
        }
    }

    public final SystemStmtContext systemStmt() throws RecognitionException {
        SystemStmtContext _localctx = new SystemStmtContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_systemStmt);
        int _la;
        try {
            setState(1637);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 217, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1603);
                    match(SYSTEM);
                    setState(1604);
                    match(FLUSH);
                    setState(1605);
                    match(DISTRIBUTED);
                    setState(1606);
                    tableIdentifier();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1607);
                    match(SYSTEM);
                    setState(1608);
                    match(FLUSH);
                    setState(1609);
                    match(LOGS);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1610);
                    match(SYSTEM);
                    setState(1611);
                    match(RELOAD);
                    setState(1612);
                    match(DICTIONARIES);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1613);
                    match(SYSTEM);
                    setState(1614);
                    match(RELOAD);
                    setState(1615);
                    match(DICTIONARY);
                    setState(1616);
                    tableIdentifier();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1617);
                    match(SYSTEM);
                    setState(1618);
                    _la = _input.LA(1);
                    if (!(_la == START || _la == STOP)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(1626);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case DISTRIBUTED: {
                            setState(1619);
                            match(DISTRIBUTED);
                            setState(1620);
                            match(SENDS);
                        }
                        break;
                        case FETCHES: {
                            setState(1621);
                            match(FETCHES);
                        }
                        break;
                        case MERGES:
                        case TTL: {
                            setState(1623);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == TTL) {
                                {
                                    setState(1622);
                                    match(TTL);
                                }
                            }

                            setState(1625);
                            match(MERGES);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(1628);
                    tableIdentifier();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1629);
                    match(SYSTEM);
                    setState(1630);
                    _la = _input.LA(1);
                    if (!(_la == START || _la == STOP)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(1631);
                    match(REPLICATED);
                    setState(1632);
                    match(SENDS);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1633);
                    match(SYSTEM);
                    setState(1634);
                    match(SYNC);
                    setState(1635);
                    match(REPLICA);
                    setState(1636);
                    tableIdentifier();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TruncateStmtContext extends ParserRuleContext {
        public TerminalNode TRUNCATE() {
            return getToken(ClickHouseParser.TRUNCATE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(ClickHouseParser.TEMPORARY, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public ClusterClauseContext clusterClause() {
            return getRuleContext(ClusterClauseContext.class, 0);
        }

        public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_truncateStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTruncateStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTruncateStmt(this);
        }
    }

    public final TruncateStmtContext truncateStmt() throws RecognitionException {
        TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_truncateStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1639);
                match(TRUNCATE);
                setState(1641);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 218, _ctx)) {
                    case 1: {
                        setState(1640);
                        match(TEMPORARY);
                    }
                    break;
                }
                setState(1644);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 219, _ctx)) {
                    case 1: {
                        setState(1643);
                        match(TABLE);
                    }
                    break;
                }
                setState(1648);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 220, _ctx)) {
                    case 1: {
                        setState(1646);
                        match(IF);
                        setState(1647);
                        match(EXISTS);
                    }
                    break;
                }
                setState(1650);
                tableIdentifier();
                setState(1652);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ON) {
                    {
                        setState(1651);
                        clusterClause();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class UseStmtContext extends ParserRuleContext {
        public TerminalNode USE() {
            return getToken(ClickHouseParser.USE, 0);
        }

        public DatabaseIdentifierContext databaseIdentifier() {
            return getRuleContext(DatabaseIdentifierContext.class, 0);
        }

        public UseStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_useStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterUseStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitUseStmt(this);
        }
    }

    public final UseStmtContext useStmt() throws RecognitionException {
        UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_useStmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1654);
                match(USE);
                setState(1655);
                databaseIdentifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WatchStmtContext extends ParserRuleContext {
        public TerminalNode WATCH() {
            return getToken(ClickHouseParser.WATCH, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode EVENTS() {
            return getToken(ClickHouseParser.EVENTS, 0);
        }

        public TerminalNode LIMIT() {
            return getToken(ClickHouseParser.LIMIT, 0);
        }

        public TerminalNode DECIMAL_LITERAL() {
            return getToken(ClickHouseParser.DECIMAL_LITERAL, 0);
        }

        public WatchStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_watchStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterWatchStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitWatchStmt(this);
        }
    }

    public final WatchStmtContext watchStmt() throws RecognitionException {
        WatchStmtContext _localctx = new WatchStmtContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_watchStmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1657);
                match(WATCH);
                setState(1658);
                tableIdentifier();
                setState(1660);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EVENTS) {
                    {
                        setState(1659);
                        match(EVENTS);
                    }
                }

                setState(1664);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LIMIT) {
                    {
                        setState(1662);
                        match(LIMIT);
                        setState(1663);
                        match(DECIMAL_LITERAL);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnTypeExprContext extends ParserRuleContext {
        public ColumnTypeExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnTypeExpr;
        }

        public ColumnTypeExprContext() {
        }

        public void copyFrom(ColumnTypeExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ColumnTypeExprNestedContext extends ColumnTypeExprContext {
        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<ColumnTypeExprContext> columnTypeExpr() {
            return getRuleContexts(ColumnTypeExprContext.class);
        }

        public ColumnTypeExprContext columnTypeExpr(int i) {
            return getRuleContext(ColumnTypeExprContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ColumnTypeExprNestedContext(ColumnTypeExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnTypeExprNested(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnTypeExprNested(this);
        }
    }

    public static class ColumnTypeExprParamContext extends ColumnTypeExprContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public ColumnTypeExprParamContext(ColumnTypeExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnTypeExprParam(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnTypeExprParam(this);
        }
    }

    public static class ColumnTypeExprSimpleContext extends ColumnTypeExprContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColumnTypeExprSimpleContext(ColumnTypeExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnTypeExprSimple(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnTypeExprSimple(this);
        }
    }

    public static class ColumnTypeExprComplexContext extends ColumnTypeExprContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<ColumnTypeExprContext> columnTypeExpr() {
            return getRuleContexts(ColumnTypeExprContext.class);
        }

        public ColumnTypeExprContext columnTypeExpr(int i) {
            return getRuleContext(ColumnTypeExprContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ColumnTypeExprComplexContext(ColumnTypeExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnTypeExprComplex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnTypeExprComplex(this);
        }
    }

    public static class ColumnTypeExprEnumContext extends ColumnTypeExprContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<EnumValueContext> enumValue() {
            return getRuleContexts(EnumValueContext.class);
        }

        public EnumValueContext enumValue(int i) {
            return getRuleContext(EnumValueContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ColumnTypeExprEnumContext(ColumnTypeExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnTypeExprEnum(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnTypeExprEnum(this);
        }
    }

    public final ColumnTypeExprContext columnTypeExpr() throws RecognitionException {
        ColumnTypeExprContext _localctx = new ColumnTypeExprContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_columnTypeExpr);
        int _la;
        try {
            setState(1713);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 228, _ctx)) {
                case 1:
                    _localctx = new ColumnTypeExprSimpleContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1666);
                    identifier();
                }
                break;
                case 2:
                    _localctx = new ColumnTypeExprNestedContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1667);
                    identifier();
                    setState(1668);
                    match(LPAREN);
                    setState(1669);
                    identifier();
                    setState(1670);
                    columnTypeExpr();
                    setState(1677);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(1671);
                                match(COMMA);
                                setState(1672);
                                identifier();
                                setState(1673);
                                columnTypeExpr();
                            }
                        }
                        setState(1679);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1680);
                    match(RPAREN);
                }
                break;
                case 3:
                    _localctx = new ColumnTypeExprEnumContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1682);
                    identifier();
                    setState(1683);
                    match(LPAREN);
                    setState(1684);
                    enumValue();
                    setState(1689);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(1685);
                                match(COMMA);
                                setState(1686);
                                enumValue();
                            }
                        }
                        setState(1691);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1692);
                    match(RPAREN);
                }
                break;
                case 4:
                    _localctx = new ColumnTypeExprComplexContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1694);
                    identifier();
                    setState(1695);
                    match(LPAREN);
                    setState(1696);
                    columnTypeExpr();
                    setState(1701);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(1697);
                                match(COMMA);
                                setState(1698);
                                columnTypeExpr();
                            }
                        }
                        setState(1703);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1704);
                    match(RPAREN);
                }
                break;
                case 5:
                    _localctx = new ColumnTypeExprParamContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1706);
                    identifier();
                    setState(1707);
                    match(LPAREN);
                    setState(1709);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
                        {
                            setState(1708);
                            columnExprList();
                        }
                    }

                    setState(1711);
                    match(RPAREN);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnExprListContext extends ParserRuleContext {
        public List<ColumnsExprContext> columnsExpr() {
            return getRuleContexts(ColumnsExprContext.class);
        }

        public ColumnsExprContext columnsExpr(int i) {
            return getRuleContext(ColumnsExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ColumnExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnExprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprList(this);
        }
    }

    public final ColumnExprListContext columnExprList() throws RecognitionException {
        ColumnExprListContext _localctx = new ColumnExprListContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_columnExprList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1715);
                columnsExpr();
                setState(1720);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 229, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1716);
                                match(COMMA);
                                setState(1717);
                                columnsExpr();
                            }
                        }
                    }
                    setState(1722);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 229, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnsExprContext extends ParserRuleContext {
        public ColumnsExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnsExpr;
        }

        public ColumnsExprContext() {
        }

        public void copyFrom(ColumnsExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ColumnsExprColumnContext extends ColumnsExprContext {
        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public ColumnsExprColumnContext(ColumnsExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnsExprColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnsExprColumn(this);
        }
    }

    public static class ColumnsExprAsteriskContext extends ColumnsExprContext {
        public TerminalNode ASTERISK() {
            return getToken(ClickHouseParser.ASTERISK, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(ClickHouseParser.DOT, 0);
        }

        public ColumnsExprAsteriskContext(ColumnsExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnsExprAsterisk(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnsExprAsterisk(this);
        }
    }

    public static class ColumnsExprSubqueryContext extends ColumnsExprContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public SelectUnionStmtContext selectUnionStmt() {
            return getRuleContext(SelectUnionStmtContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnsExprSubqueryContext(ColumnsExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnsExprSubquery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnsExprSubquery(this);
        }
    }

    public final ColumnsExprContext columnsExpr() throws RecognitionException {
        ColumnsExprContext _localctx = new ColumnsExprContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_columnsExpr);
        int _la;
        try {
            setState(1734);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 231, _ctx)) {
                case 1:
                    _localctx = new ColumnsExprAsteriskContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1726);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
                        {
                            setState(1723);
                            tableIdentifier();
                            setState(1724);
                            match(DOT);
                        }
                    }

                    setState(1728);
                    match(ASTERISK);
                }
                break;
                case 2:
                    _localctx = new ColumnsExprSubqueryContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1729);
                    match(LPAREN);
                    setState(1730);
                    selectUnionStmt();
                    setState(1731);
                    match(RPAREN);
                }
                break;
                case 3:
                    _localctx = new ColumnsExprColumnContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1733);
                    columnExpr(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnExprContext extends ParserRuleContext {
        public ColumnExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnExpr;
        }

        public ColumnExprContext() {
        }

        public void copyFrom(ColumnExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ColumnExprTernaryOpContext extends ColumnExprContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode QUERY() {
            return getToken(ClickHouseParser.QUERY, 0);
        }

        public TerminalNode COLON() {
            return getToken(ClickHouseParser.COLON, 0);
        }

        public ColumnExprTernaryOpContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprTernaryOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprTernaryOp(this);
        }
    }

    public static class ColumnExprAliasContext extends ColumnExprContext {
        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public AliasContext alias() {
            return getRuleContext(AliasContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColumnExprAliasContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprAlias(this);
        }
    }

    public static class ColumnExprExtractContext extends ColumnExprContext {
        public TerminalNode EXTRACT() {
            return getToken(ClickHouseParser.EXTRACT, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public IntervalContext interval() {
            return getRuleContext(IntervalContext.class, 0);
        }

        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprExtractContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprExtract(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprExtract(this);
        }
    }

    public static class ColumnExprNegateContext extends ColumnExprContext {
        public TerminalNode DASH() {
            return getToken(ClickHouseParser.DASH, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public ColumnExprNegateContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprNegate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprNegate(this);
        }
    }

    public static class ColumnExprSubqueryContext extends ColumnExprContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public SelectUnionStmtContext selectUnionStmt() {
            return getRuleContext(SelectUnionStmtContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprSubqueryContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprSubquery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprSubquery(this);
        }
    }

    public static class ColumnExprLiteralContext extends ColumnExprContext {
        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public ColumnExprLiteralContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprLiteral(this);
        }
    }

    public static class ColumnExprArrayContext extends ColumnExprContext {
        public TerminalNode LBRACKET() {
            return getToken(ClickHouseParser.LBRACKET, 0);
        }

        public TerminalNode RBRACKET() {
            return getToken(ClickHouseParser.RBRACKET, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public ColumnExprArrayContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprArray(this);
        }
    }

    public static class ColumnExprSubstringContext extends ColumnExprContext {
        public TerminalNode SUBSTRING() {
            return getToken(ClickHouseParser.SUBSTRING, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public TerminalNode FOR() {
            return getToken(ClickHouseParser.FOR, 0);
        }

        public ColumnExprSubstringContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprSubstring(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprSubstring(this);
        }
    }

    public static class ColumnExprCastContext extends ColumnExprContext {
        public TerminalNode CAST() {
            return getToken(ClickHouseParser.CAST, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public ColumnTypeExprContext columnTypeExpr() {
            return getRuleContext(ColumnTypeExprContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprCastContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprCast(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprCast(this);
        }
    }

    public static class ColumnExprOrContext extends ColumnExprContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode OR() {
            return getToken(ClickHouseParser.OR, 0);
        }

        public ColumnExprOrContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprOr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprOr(this);
        }
    }

    public static class ColumnExprPrecedence1Context extends ColumnExprContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode ASTERISK() {
            return getToken(ClickHouseParser.ASTERISK, 0);
        }

        public TerminalNode SLASH() {
            return getToken(ClickHouseParser.SLASH, 0);
        }

        public TerminalNode PERCENT() {
            return getToken(ClickHouseParser.PERCENT, 0);
        }

        public ColumnExprPrecedence1Context(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprPrecedence1(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprPrecedence1(this);
        }
    }

    public static class ColumnExprPrecedence2Context extends ColumnExprContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode PLUS() {
            return getToken(ClickHouseParser.PLUS, 0);
        }

        public TerminalNode DASH() {
            return getToken(ClickHouseParser.DASH, 0);
        }

        public TerminalNode CONCAT() {
            return getToken(ClickHouseParser.CONCAT, 0);
        }

        public ColumnExprPrecedence2Context(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprPrecedence2(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprPrecedence2(this);
        }
    }

    public static class ColumnExprPrecedence3Context extends ColumnExprContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode EQ_DOUBLE() {
            return getToken(ClickHouseParser.EQ_DOUBLE, 0);
        }

        public TerminalNode EQ_SINGLE() {
            return getToken(ClickHouseParser.EQ_SINGLE, 0);
        }

        public TerminalNode NOT_EQ() {
            return getToken(ClickHouseParser.NOT_EQ, 0);
        }

        public TerminalNode LE() {
            return getToken(ClickHouseParser.LE, 0);
        }

        public TerminalNode GE() {
            return getToken(ClickHouseParser.GE, 0);
        }

        public TerminalNode LT() {
            return getToken(ClickHouseParser.LT, 0);
        }

        public TerminalNode GT() {
            return getToken(ClickHouseParser.GT, 0);
        }

        public TerminalNode IN() {
            return getToken(ClickHouseParser.IN, 0);
        }

        public TerminalNode LIKE() {
            return getToken(ClickHouseParser.LIKE, 0);
        }

        public TerminalNode ILIKE() {
            return getToken(ClickHouseParser.ILIKE, 0);
        }

        public TerminalNode GLOBAL() {
            return getToken(ClickHouseParser.GLOBAL, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public ColumnExprPrecedence3Context(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprPrecedence3(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprPrecedence3(this);
        }
    }

    public static class ColumnExprIntervalContext extends ColumnExprContext {
        public TerminalNode INTERVAL() {
            return getToken(ClickHouseParser.INTERVAL, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public IntervalContext interval() {
            return getRuleContext(IntervalContext.class, 0);
        }

        public ColumnExprIntervalContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprInterval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprInterval(this);
        }
    }

    public static class ColumnExprIsNullContext extends ColumnExprContext {
        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode IS() {
            return getToken(ClickHouseParser.IS, 0);
        }

        public TerminalNode NULL_SQL() {
            return getToken(ClickHouseParser.NULL_SQL, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public ColumnExprIsNullContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprIsNull(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprIsNull(this);
        }
    }

    public static class ColumnExprWinFunctionTargetContext extends ColumnExprContext {
        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode OVER() {
            return getToken(ClickHouseParser.OVER, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public ColumnExprWinFunctionTargetContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprWinFunctionTarget(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprWinFunctionTarget(this);
        }
    }

    public static class ColumnExprTrimContext extends ColumnExprContext {
        public TerminalNode TRIM() {
            return getToken(ClickHouseParser.TRIM, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public TerminalNode BOTH() {
            return getToken(ClickHouseParser.BOTH, 0);
        }

        public TerminalNode LEADING() {
            return getToken(ClickHouseParser.LEADING, 0);
        }

        public TerminalNode TRAILING() {
            return getToken(ClickHouseParser.TRAILING, 0);
        }

        public ColumnExprTrimContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprTrim(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprTrim(this);
        }
    }

    public static class ColumnExprTupleContext extends ColumnExprContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprTupleContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprTuple(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprTuple(this);
        }
    }

    public static class ColumnExprArrayAccessContext extends ColumnExprContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode LBRACKET() {
            return getToken(ClickHouseParser.LBRACKET, 0);
        }

        public TerminalNode RBRACKET() {
            return getToken(ClickHouseParser.RBRACKET, 0);
        }

        public ColumnExprArrayAccessContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprArrayAccess(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprArrayAccess(this);
        }
    }

    public static class ColumnExprBetweenContext extends ColumnExprContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode BETWEEN() {
            return getToken(ClickHouseParser.BETWEEN, 0);
        }

        public TerminalNode AND() {
            return getToken(ClickHouseParser.AND, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public ColumnExprBetweenContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprBetween(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprBetween(this);
        }
    }

    public static class ColumnExprParensContext extends ColumnExprContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public ColumnExprParensContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprParens(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprParens(this);
        }
    }

    public static class ColumnExprTimestampContext extends ColumnExprContext {
        public TerminalNode TIMESTAMP() {
            return getToken(ClickHouseParser.TIMESTAMP, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public ColumnExprTimestampContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprTimestamp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprTimestamp(this);
        }
    }

    public static class ColumnExprAndContext extends ColumnExprContext {
        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(ClickHouseParser.AND, 0);
        }

        public ColumnExprAndContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprAnd(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprAnd(this);
        }
    }

    public static class ColumnExprTupleAccessContext extends ColumnExprContext {
        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(ClickHouseParser.DOT, 0);
        }

        public TerminalNode DECIMAL_LITERAL() {
            return getToken(ClickHouseParser.DECIMAL_LITERAL, 0);
        }

        public ColumnExprTupleAccessContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprTupleAccess(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprTupleAccess(this);
        }
    }

    public static class ColumnExprCaseContext extends ColumnExprContext {
        public TerminalNode CASE() {
            return getToken(ClickHouseParser.CASE, 0);
        }

        public TerminalNode END() {
            return getToken(ClickHouseParser.END, 0);
        }

        public List<ColumnExprContext> columnExpr() {
            return getRuleContexts(ColumnExprContext.class);
        }

        public ColumnExprContext columnExpr(int i) {
            return getRuleContext(ColumnExprContext.class, i);
        }

        public List<TerminalNode> WHEN() {
            return getTokens(ClickHouseParser.WHEN);
        }

        public TerminalNode WHEN(int i) {
            return getToken(ClickHouseParser.WHEN, i);
        }

        public List<TerminalNode> THEN() {
            return getTokens(ClickHouseParser.THEN);
        }

        public TerminalNode THEN(int i) {
            return getToken(ClickHouseParser.THEN, i);
        }

        public TerminalNode ELSE() {
            return getToken(ClickHouseParser.ELSE, 0);
        }

        public ColumnExprCaseContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprCase(this);
        }
    }

    public static class ColumnExprDateContext extends ColumnExprContext {
        public TerminalNode DATE() {
            return getToken(ClickHouseParser.DATE, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public ColumnExprDateContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprDate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprDate(this);
        }
    }

    public static class ColumnExprNotContext extends ColumnExprContext {
        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public ColumnExprNotContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprNot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprNot(this);
        }
    }

    public static class ColumnExprWinFunctionContext extends ColumnExprContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode OVER() {
            return getToken(ClickHouseParser.OVER, 0);
        }

        public List<TerminalNode> LPAREN() {
            return getTokens(ClickHouseParser.LPAREN);
        }

        public TerminalNode LPAREN(int i) {
            return getToken(ClickHouseParser.LPAREN, i);
        }

        public WindowExprContext windowExpr() {
            return getRuleContext(WindowExprContext.class, 0);
        }

        public List<TerminalNode> RPAREN() {
            return getTokens(ClickHouseParser.RPAREN);
        }

        public TerminalNode RPAREN(int i) {
            return getToken(ClickHouseParser.RPAREN, i);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public ColumnExprWinFunctionContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprWinFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprWinFunction(this);
        }
    }

    public static class ColumnExprIdentifierContext extends ColumnExprContext {
        public ColumnIdentifierContext columnIdentifier() {
            return getRuleContext(ColumnIdentifierContext.class, 0);
        }

        public ColumnExprIdentifierContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprIdentifier(this);
        }
    }

    public static class ColumnExprFunctionContext extends ColumnExprContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public List<TerminalNode> LPAREN() {
            return getTokens(ClickHouseParser.LPAREN);
        }

        public TerminalNode LPAREN(int i) {
            return getToken(ClickHouseParser.LPAREN, i);
        }

        public List<TerminalNode> RPAREN() {
            return getTokens(ClickHouseParser.RPAREN);
        }

        public TerminalNode RPAREN(int i) {
            return getToken(ClickHouseParser.RPAREN, i);
        }

        public TerminalNode DISTINCT() {
            return getToken(ClickHouseParser.DISTINCT, 0);
        }

        public ColumnArgListContext columnArgList() {
            return getRuleContext(ColumnArgListContext.class, 0);
        }

        public ColumnExprListContext columnExprList() {
            return getRuleContext(ColumnExprListContext.class, 0);
        }

        public ColumnExprFunctionContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprFunction(this);
        }
    }

    public static class ColumnExprAsteriskContext extends ColumnExprContext {
        public TerminalNode ASTERISK() {
            return getToken(ClickHouseParser.ASTERISK, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(ClickHouseParser.DOT, 0);
        }

        public ColumnExprAsteriskContext(ColumnExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnExprAsterisk(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnExprAsterisk(this);
        }
    }

    public final ColumnExprContext columnExpr() throws RecognitionException {
        return columnExpr(0);
    }

    private ColumnExprContext columnExpr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ColumnExprContext _localctx = new ColumnExprContext(_ctx, _parentState);
        ColumnExprContext _prevctx = _localctx;
        int _startState = 198;
        enterRecursionRule(_localctx, 198, RULE_columnExpr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1865);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 244, _ctx)) {
                    case 1: {
                        _localctx = new ColumnExprCaseContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(1737);
                        match(CASE);
                        setState(1739);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 232, _ctx)) {
                            case 1: {
                                setState(1738);
                                columnExpr(0);
                            }
                            break;
                        }
                        setState(1746);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(1741);
                                    match(WHEN);
                                    setState(1742);
                                    columnExpr(0);
                                    setState(1743);
                                    match(THEN);
                                    setState(1744);
                                    columnExpr(0);
                                }
                            }
                            setState(1748);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == WHEN);
                        setState(1752);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == ELSE) {
                            {
                                setState(1750);
                                match(ELSE);
                                setState(1751);
                                columnExpr(0);
                            }
                        }

                        setState(1754);
                        match(END);
                    }
                    break;
                    case 2: {
                        _localctx = new ColumnExprCastContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1756);
                        match(CAST);
                        setState(1757);
                        match(LPAREN);
                        setState(1758);
                        columnExpr(0);
                        setState(1759);
                        match(AS);
                        setState(1760);
                        columnTypeExpr();
                        setState(1761);
                        match(RPAREN);
                    }
                    break;
                    case 3: {
                        _localctx = new ColumnExprDateContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1763);
                        match(DATE);
                        setState(1764);
                        match(STRING_LITERAL);
                    }
                    break;
                    case 4: {
                        _localctx = new ColumnExprExtractContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1765);
                        match(EXTRACT);
                        setState(1766);
                        match(LPAREN);
                        setState(1767);
                        interval();
                        setState(1768);
                        match(FROM);
                        setState(1769);
                        columnExpr(0);
                        setState(1770);
                        match(RPAREN);
                    }
                    break;
                    case 5: {
                        _localctx = new ColumnExprIntervalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1772);
                        match(INTERVAL);
                        setState(1773);
                        columnExpr(0);
                        setState(1774);
                        interval();
                    }
                    break;
                    case 6: {
                        _localctx = new ColumnExprSubstringContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1776);
                        match(SUBSTRING);
                        setState(1777);
                        match(LPAREN);
                        setState(1778);
                        columnExpr(0);
                        setState(1779);
                        match(FROM);
                        setState(1780);
                        columnExpr(0);
                        setState(1783);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == FOR) {
                            {
                                setState(1781);
                                match(FOR);
                                setState(1782);
                                columnExpr(0);
                            }
                        }

                        setState(1785);
                        match(RPAREN);
                    }
                    break;
                    case 7: {
                        _localctx = new ColumnExprTimestampContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1787);
                        match(TIMESTAMP);
                        setState(1788);
                        match(STRING_LITERAL);
                    }
                    break;
                    case 8: {
                        _localctx = new ColumnExprTrimContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1789);
                        match(TRIM);
                        setState(1790);
                        match(LPAREN);
                        setState(1791);
                        _la = _input.LA(1);
                        if (!(_la == BOTH || _la == LEADING || _la == TRAILING)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1792);
                        match(STRING_LITERAL);
                        setState(1793);
                        match(FROM);
                        setState(1794);
                        columnExpr(0);
                        setState(1795);
                        match(RPAREN);
                    }
                    break;
                    case 9: {
                        _localctx = new ColumnExprWinFunctionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1797);
                        identifier();
                        {
                            setState(1798);
                            match(LPAREN);
                            setState(1800);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
                                {
                                    setState(1799);
                                    columnExprList();
                                }
                            }

                            setState(1802);
                            match(RPAREN);
                        }
                        setState(1804);
                        match(OVER);
                        setState(1805);
                        match(LPAREN);
                        setState(1806);
                        windowExpr();
                        setState(1807);
                        match(RPAREN);
                    }
                    break;
                    case 10: {
                        _localctx = new ColumnExprWinFunctionTargetContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1809);
                        identifier();
                        {
                            setState(1810);
                            match(LPAREN);
                            setState(1812);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
                                {
                                    setState(1811);
                                    columnExprList();
                                }
                            }

                            setState(1814);
                            match(RPAREN);
                        }
                        setState(1816);
                        match(OVER);
                        setState(1817);
                        identifier();
                    }
                    break;
                    case 11: {
                        _localctx = new ColumnExprFunctionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1819);
                        identifier();
                        setState(1825);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 239, _ctx)) {
                            case 1: {
                                setState(1820);
                                match(LPAREN);
                                setState(1822);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
                                    {
                                        setState(1821);
                                        columnExprList();
                                    }
                                }

                                setState(1824);
                                match(RPAREN);
                            }
                            break;
                        }
                        setState(1827);
                        match(LPAREN);
                        setState(1829);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 240, _ctx)) {
                            case 1: {
                                setState(1828);
                                match(DISTINCT);
                            }
                            break;
                        }
                        setState(1832);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
                            {
                                setState(1831);
                                columnArgList();
                            }
                        }

                        setState(1834);
                        match(RPAREN);
                    }
                    break;
                    case 12: {
                        _localctx = new ColumnExprLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1836);
                        literal();
                    }
                    break;
                    case 13: {
                        _localctx = new ColumnExprNegateContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1837);
                        match(DASH);
                        setState(1838);
                        columnExpr(17);
                    }
                    break;
                    case 14: {
                        _localctx = new ColumnExprNotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1839);
                        match(NOT);
                        setState(1840);
                        columnExpr(12);
                    }
                    break;
                    case 15: {
                        _localctx = new ColumnExprAsteriskContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1844);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AFTER - 2)) | (1L << (ALIAS - 2)) | (1L << (ALL - 2)) | (1L << (ALTER - 2)) | (1L << (AND - 2)) | (1L << (ANTI - 2)) | (1L << (ANY - 2)) | (1L << (ARRAY - 2)) | (1L << (AS - 2)) | (1L << (ASCENDING - 2)) | (1L << (ASOF - 2)) | (1L << (AST - 2)) | (1L << (ASYNC - 2)) | (1L << (ATTACH - 2)) | (1L << (BETWEEN - 2)) | (1L << (BOTH - 2)) | (1L << (BY - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CHECK - 2)) | (1L << (CLEAR - 2)) | (1L << (CLUSTER - 2)) | (1L << (CODEC - 2)) | (1L << (COLLATE - 2)) | (1L << (COLUMN - 2)) | (1L << (COMMENT - 2)) | (1L << (CONSTRAINT - 2)) | (1L << (CREATE - 2)) | (1L << (CROSS - 2)) | (1L << (CUBE - 2)) | (1L << (CURRENT - 2)) | (1L << (DATABASE - 2)) | (1L << (DATABASES - 2)) | (1L << (DATE - 2)) | (1L << (DAY - 2)) | (1L << (DEDUPLICATE - 2)) | (1L << (DEFAULT - 2)) | (1L << (DELAY - 2)) | (1L << (DELETE - 2)) | (1L << (DESC - 2)) | (1L << (DESCENDING - 2)) | (1L << (DESCRIBE - 2)) | (1L << (DETACH - 2)) | (1L << (DICTIONARIES - 2)) | (1L << (DICTIONARY - 2)) | (1L << (DISK - 2)) | (1L << (DISTINCT - 2)) | (1L << (DISTRIBUTED - 2)) | (1L << (DROP - 2)) | (1L << (ELSE - 2)) | (1L << (END - 2)) | (1L << (ENGINE - 2)) | (1L << (EVENTS - 2)) | (1L << (EXISTS - 2)) | (1L << (EXPLAIN - 2)) | (1L << (EXPRESSION - 2)) | (1L << (EXTRACT - 2)) | (1L << (FETCHES - 2)) | (1L << (FINAL - 2)) | (1L << (FIRST - 2)) | (1L << (FLUSH - 2)) | (1L << (FOLLOWING - 2)) | (1L << (FOR - 2)) | (1L << (FORMAT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FREEZE - 66)) | (1L << (FROM - 66)) | (1L << (FULL - 66)) | (1L << (FUNCTION - 66)) | (1L << (GLOBAL - 66)) | (1L << (GRANULARITY - 66)) | (1L << (GROUP - 66)) | (1L << (HAVING - 66)) | (1L << (HIERARCHICAL - 66)) | (1L << (HOUR - 66)) | (1L << (ID - 66)) | (1L << (IF - 66)) | (1L << (ILIKE - 66)) | (1L << (IN - 66)) | (1L << (INDEX - 66)) | (1L << (INJECTIVE - 66)) | (1L << (INNER - 66)) | (1L << (INSERT - 66)) | (1L << (INTERVAL - 66)) | (1L << (INTO - 66)) | (1L << (IS - 66)) | (1L << (IS_OBJECT_ID - 66)) | (1L << (JOIN - 66)) | (1L << (KEY - 66)) | (1L << (KILL - 66)) | (1L << (LAST - 66)) | (1L << (LAYOUT - 66)) | (1L << (LEADING - 66)) | (1L << (LEFT - 66)) | (1L << (LIFETIME - 66)) | (1L << (LIKE - 66)) | (1L << (LIMIT - 66)) | (1L << (LIVE - 66)) | (1L << (LOCAL - 66)) | (1L << (LOGS - 66)) | (1L << (MATERIALIZE - 66)) | (1L << (MATERIALIZED - 66)) | (1L << (MAX - 66)) | (1L << (MERGES - 66)) | (1L << (MIN - 66)) | (1L << (MINUTE - 66)) | (1L << (MODIFY - 66)) | (1L << (MONTH - 66)) | (1L << (MOVE - 66)) | (1L << (MUTATION - 66)) | (1L << (NO - 66)) | (1L << (NOT - 66)) | (1L << (NULLS - 66)) | (1L << (OFFSET - 66)) | (1L << (ON - 66)) | (1L << (OPTIMIZE - 66)) | (1L << (OR - 66)) | (1L << (ORDER - 66)) | (1L << (OUTER - 66)) | (1L << (OUTFILE - 66)) | (1L << (OVER - 66)) | (1L << (PARTITION - 66)) | (1L << (POPULATE - 66)) | (1L << (PRECEDING - 66)) | (1L << (PREWHERE - 66)) | (1L << (PRIMARY - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (QUARTER - 131)) | (1L << (RANGE - 131)) | (1L << (RELOAD - 131)) | (1L << (REMOVE - 131)) | (1L << (RENAME - 131)) | (1L << (REPLACE - 131)) | (1L << (REPLICA - 131)) | (1L << (REPLICATED - 131)) | (1L << (RIGHT - 131)) | (1L << (ROLLUP - 131)) | (1L << (ROW - 131)) | (1L << (ROWS - 131)) | (1L << (SAMPLE - 131)) | (1L << (SECOND - 131)) | (1L << (SELECT - 131)) | (1L << (SEMI - 131)) | (1L << (SENDS - 131)) | (1L << (SET - 131)) | (1L << (SETTINGS - 131)) | (1L << (SHOW - 131)) | (1L << (SOURCE - 131)) | (1L << (START - 131)) | (1L << (STOP - 131)) | (1L << (SUBSTRING - 131)) | (1L << (SYNC - 131)) | (1L << (SYNTAX - 131)) | (1L << (SYSTEM - 131)) | (1L << (TABLE - 131)) | (1L << (TABLES - 131)) | (1L << (TEMPORARY - 131)) | (1L << (TEST - 131)) | (1L << (THEN - 131)) | (1L << (TIES - 131)) | (1L << (TIMEOUT - 131)) | (1L << (TIMESTAMP - 131)) | (1L << (TO - 131)) | (1L << (TOP - 131)) | (1L << (TOTALS - 131)) | (1L << (TRAILING - 131)) | (1L << (TRIM - 131)) | (1L << (TRUNCATE - 131)) | (1L << (TTL - 131)) | (1L << (TYPE - 131)) | (1L << (UNBOUNDED - 131)) | (1L << (UNION - 131)) | (1L << (UPDATE - 131)) | (1L << (USE - 131)) | (1L << (USING - 131)) | (1L << (UUID - 131)) | (1L << (VALUES - 131)) | (1L << (VIEW - 131)) | (1L << (VOLUME - 131)) | (1L << (WATCH - 131)) | (1L << (WEEK - 131)) | (1L << (WHEN - 131)) | (1L << (WHERE - 131)) | (1L << (WINDOW - 131)) | (1L << (WITH - 131)) | (1L << (YEAR - 131)) | (1L << (JSON_FALSE - 131)) | (1L << (JSON_TRUE - 131)) | (1L << (IDENTIFIER - 131)))) != 0)) {
                            {
                                setState(1841);
                                tableIdentifier();
                                setState(1842);
                                match(DOT);
                            }
                        }

                        setState(1846);
                        match(ASTERISK);
                    }
                    break;
                    case 16: {
                        _localctx = new ColumnExprSubqueryContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1847);
                        match(LPAREN);
                        setState(1848);
                        selectUnionStmt();
                        setState(1849);
                        match(RPAREN);
                    }
                    break;
                    case 17: {
                        _localctx = new ColumnExprParensContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1851);
                        match(LPAREN);
                        setState(1852);
                        columnExpr(0);
                        setState(1853);
                        match(RPAREN);
                    }
                    break;
                    case 18: {
                        _localctx = new ColumnExprTupleContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1855);
                        match(LPAREN);
                        setState(1856);
                        columnExprList();
                        setState(1857);
                        match(RPAREN);
                    }
                    break;
                    case 19: {
                        _localctx = new ColumnExprArrayContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1859);
                        match(LBRACKET);
                        setState(1861);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (ASTERISK - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (LBRACKET - 192)) | (1L << (LPAREN - 192)) | (1L << (PLUS - 192)))) != 0)) {
                            {
                                setState(1860);
                                columnExprList();
                            }
                        }

                        setState(1863);
                        match(RBRACKET);
                    }
                    break;
                    case 20: {
                        _localctx = new ColumnExprIdentifierContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1864);
                        columnIdentifier();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1938);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 253, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1936);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 252, _ctx)) {
                                case 1: {
                                    _localctx = new ColumnExprPrecedence1Context(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1867);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(1868);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (ASTERISK - 199)) | (1L << (PERCENT - 199)) | (1L << (SLASH - 199)))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1869);
                                    columnExpr(17);
                                }
                                break;
                                case 2: {
                                    _localctx = new ColumnExprPrecedence2Context(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1870);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(1871);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (CONCAT - 204)) | (1L << (DASH - 204)) | (1L << (PLUS - 204)))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1872);
                                    columnExpr(16);
                                }
                                break;
                                case 3: {
                                    _localctx = new ColumnExprPrecedence3Context(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1873);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(1892);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 248, _ctx)) {
                                        case 1: {
                                            setState(1874);
                                            match(EQ_DOUBLE);
                                        }
                                        break;
                                        case 2: {
                                            setState(1875);
                                            match(EQ_SINGLE);
                                        }
                                        break;
                                        case 3: {
                                            setState(1876);
                                            match(NOT_EQ);
                                        }
                                        break;
                                        case 4: {
                                            setState(1877);
                                            match(LE);
                                        }
                                        break;
                                        case 5: {
                                            setState(1878);
                                            match(GE);
                                        }
                                        break;
                                        case 6: {
                                            setState(1879);
                                            match(LT);
                                        }
                                        break;
                                        case 7: {
                                            setState(1880);
                                            match(GT);
                                        }
                                        break;
                                        case 8: {
                                            setState(1882);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            if (_la == GLOBAL) {
                                                {
                                                    setState(1881);
                                                    match(GLOBAL);
                                                }
                                            }

                                            setState(1885);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            if (_la == NOT) {
                                                {
                                                    setState(1884);
                                                    match(NOT);
                                                }
                                            }

                                            setState(1887);
                                            match(IN);
                                        }
                                        break;
                                        case 9: {
                                            setState(1889);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            if (_la == NOT) {
                                                {
                                                    setState(1888);
                                                    match(NOT);
                                                }
                                            }

                                            setState(1891);
                                            _la = _input.LA(1);
                                            if (!(_la == ILIKE || _la == LIKE)) {
                                                _errHandler.recoverInline(this);
                                            } else {
                                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                                _errHandler.reportMatch(this);
                                                consume();
                                            }
                                        }
                                        break;
                                    }
                                    setState(1894);
                                    columnExpr(15);
                                }
                                break;
                                case 4: {
                                    _localctx = new ColumnExprAndContext(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1895);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(1896);
                                    match(AND);
                                    setState(1897);
                                    columnExpr(12);
                                }
                                break;
                                case 5: {
                                    _localctx = new ColumnExprOrContext(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1898);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(1899);
                                    match(OR);
                                    setState(1900);
                                    columnExpr(11);
                                }
                                break;
                                case 6: {
                                    _localctx = new ColumnExprBetweenContext(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1901);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(1903);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == NOT) {
                                        {
                                            setState(1902);
                                            match(NOT);
                                        }
                                    }

                                    setState(1905);
                                    match(BETWEEN);
                                    setState(1906);
                                    columnExpr(0);
                                    setState(1907);
                                    match(AND);
                                    setState(1908);
                                    columnExpr(10);
                                }
                                break;
                                case 7: {
                                    _localctx = new ColumnExprTernaryOpContext(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1910);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(1911);
                                    match(QUERY);
                                    setState(1912);
                                    columnExpr(0);
                                    setState(1913);
                                    match(COLON);
                                    setState(1914);
                                    columnExpr(8);
                                }
                                break;
                                case 8: {
                                    _localctx = new ColumnExprArrayAccessContext(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1916);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(1917);
                                    match(LBRACKET);
                                    setState(1918);
                                    columnExpr(0);
                                    setState(1919);
                                    match(RBRACKET);
                                }
                                break;
                                case 9: {
                                    _localctx = new ColumnExprTupleAccessContext(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1921);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(1922);
                                    match(DOT);
                                    setState(1923);
                                    match(DECIMAL_LITERAL);
                                }
                                break;
                                case 10: {
                                    _localctx = new ColumnExprIsNullContext(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1924);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(1925);
                                    match(IS);
                                    setState(1927);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == NOT) {
                                        {
                                            setState(1926);
                                            match(NOT);
                                        }
                                    }

                                    setState(1929);
                                    match(NULL_SQL);
                                }
                                break;
                                case 11: {
                                    _localctx = new ColumnExprAliasContext(new ColumnExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_columnExpr);
                                    setState(1930);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(1934);
                                    _errHandler.sync(this);
                                    switch (_input.LA(1)) {
                                        case AFTER:
                                        case ALIAS:
                                        case ALTER:
                                        case ASCENDING:
                                        case AST:
                                        case ASYNC:
                                        case ATTACH:
                                        case BOTH:
                                        case BY:
                                        case CASE:
                                        case CAST:
                                        case CHECK:
                                        case CLEAR:
                                        case CLUSTER:
                                        case CODEC:
                                        case COLLATE:
                                        case COLUMN:
                                        case COMMENT:
                                        case CONSTRAINT:
                                        case CREATE:
                                        case CUBE:
                                        case CURRENT:
                                        case DATABASE:
                                        case DATABASES:
                                        case DATE:
                                        case DEDUPLICATE:
                                        case DEFAULT:
                                        case DELAY:
                                        case DELETE:
                                        case DESC:
                                        case DESCENDING:
                                        case DESCRIBE:
                                        case DETACH:
                                        case DICTIONARIES:
                                        case DICTIONARY:
                                        case DISK:
                                        case DISTRIBUTED:
                                        case DROP:
                                        case ELSE:
                                        case END:
                                        case ENGINE:
                                        case EVENTS:
                                        case EXISTS:
                                        case EXPLAIN:
                                        case EXPRESSION:
                                        case EXTRACT:
                                        case FETCHES:
                                        case FIRST:
                                        case FLUSH:
                                        case FOLLOWING:
                                        case FOR:
                                        case FREEZE:
                                        case FUNCTION:
                                        case GRANULARITY:
                                        case HIERARCHICAL:
                                        case ID:
                                        case IF:
                                        case INDEX:
                                        case INJECTIVE:
                                        case INSERT:
                                        case INTERVAL:
                                        case IS_OBJECT_ID:
                                        case KEY:
                                        case KILL:
                                        case LAST:
                                        case LAYOUT:
                                        case LEADING:
                                        case LIFETIME:
                                        case LIVE:
                                        case LOCAL:
                                        case LOGS:
                                        case MATERIALIZE:
                                        case MATERIALIZED:
                                        case MAX:
                                        case MERGES:
                                        case MIN:
                                        case MODIFY:
                                        case MOVE:
                                        case MUTATION:
                                        case NO:
                                        case NULLS:
                                        case OPTIMIZE:
                                        case OUTER:
                                        case OUTFILE:
                                        case OVER:
                                        case PARTITION:
                                        case POPULATE:
                                        case PRECEDING:
                                        case PRIMARY:
                                        case RANGE:
                                        case RELOAD:
                                        case REMOVE:
                                        case RENAME:
                                        case REPLACE:
                                        case REPLICA:
                                        case REPLICATED:
                                        case ROLLUP:
                                        case ROW:
                                        case ROWS:
                                        case SELECT:
                                        case SENDS:
                                        case SET:
                                        case SHOW:
                                        case SOURCE:
                                        case START:
                                        case STOP:
                                        case SUBSTRING:
                                        case SYNC:
                                        case SYNTAX:
                                        case SYSTEM:
                                        case TABLE:
                                        case TABLES:
                                        case TEMPORARY:
                                        case TEST:
                                        case THEN:
                                        case TIES:
                                        case TIMEOUT:
                                        case TIMESTAMP:
                                        case TO:
                                        case TOTALS:
                                        case TRAILING:
                                        case TRIM:
                                        case TRUNCATE:
                                        case TTL:
                                        case TYPE:
                                        case UNBOUNDED:
                                        case UPDATE:
                                        case USE:
                                        case UUID:
                                        case VALUES:
                                        case VIEW:
                                        case VOLUME:
                                        case WATCH:
                                        case WHEN:
                                        case IDENTIFIER: {
                                            setState(1931);
                                            alias();
                                        }
                                        break;
                                        case AS: {
                                            setState(1932);
                                            match(AS);
                                            setState(1933);
                                            identifier();
                                        }
                                        break;
                                        default:
                                            throw new NoViableAltException(this);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    setState(1940);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 253, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ColumnArgListContext extends ParserRuleContext {
        public List<ColumnArgExprContext> columnArgExpr() {
            return getRuleContexts(ColumnArgExprContext.class);
        }

        public ColumnArgExprContext columnArgExpr(int i) {
            return getRuleContext(ColumnArgExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ColumnArgListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnArgList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnArgList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnArgList(this);
        }
    }

    public final ColumnArgListContext columnArgList() throws RecognitionException {
        ColumnArgListContext _localctx = new ColumnArgListContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_columnArgList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1941);
                columnArgExpr();
                setState(1946);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(1942);
                            match(COMMA);
                            setState(1943);
                            columnArgExpr();
                        }
                    }
                    setState(1948);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnArgExprContext extends ParserRuleContext {
        public ColumnLambdaExprContext columnLambdaExpr() {
            return getRuleContext(ColumnLambdaExprContext.class, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public ColumnArgExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnArgExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnArgExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnArgExpr(this);
        }
    }

    public final ColumnArgExprContext columnArgExpr() throws RecognitionException {
        ColumnArgExprContext _localctx = new ColumnArgExprContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_columnArgExpr);
        try {
            setState(1951);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 255, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1949);
                    columnLambdaExpr();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1950);
                    columnExpr(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnLambdaExprContext extends ParserRuleContext {
        public TerminalNode ARROW() {
            return getToken(ClickHouseParser.ARROW, 0);
        }

        public ColumnExprContext columnExpr() {
            return getRuleContext(ColumnExprContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public ColumnLambdaExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnLambdaExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnLambdaExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnLambdaExpr(this);
        }
    }

    public final ColumnLambdaExprContext columnLambdaExpr() throws RecognitionException {
        ColumnLambdaExprContext _localctx = new ColumnLambdaExprContext(_ctx, getState());
        enterRule(_localctx, 204, RULE_columnLambdaExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1972);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case LPAREN: {
                        setState(1953);
                        match(LPAREN);
                        setState(1954);
                        identifier();
                        setState(1959);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(1955);
                                    match(COMMA);
                                    setState(1956);
                                    identifier();
                                }
                            }
                            setState(1961);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1962);
                        match(RPAREN);
                    }
                    break;
                    case AFTER:
                    case ALIAS:
                    case ALL:
                    case ALTER:
                    case AND:
                    case ANTI:
                    case ANY:
                    case ARRAY:
                    case AS:
                    case ASCENDING:
                    case ASOF:
                    case AST:
                    case ASYNC:
                    case ATTACH:
                    case BETWEEN:
                    case BOTH:
                    case BY:
                    case CASE:
                    case CAST:
                    case CHECK:
                    case CLEAR:
                    case CLUSTER:
                    case CODEC:
                    case COLLATE:
                    case COLUMN:
                    case COMMENT:
                    case CONSTRAINT:
                    case CREATE:
                    case CROSS:
                    case CUBE:
                    case CURRENT:
                    case DATABASE:
                    case DATABASES:
                    case DATE:
                    case DAY:
                    case DEDUPLICATE:
                    case DEFAULT:
                    case DELAY:
                    case DELETE:
                    case DESC:
                    case DESCENDING:
                    case DESCRIBE:
                    case DETACH:
                    case DICTIONARIES:
                    case DICTIONARY:
                    case DISK:
                    case DISTINCT:
                    case DISTRIBUTED:
                    case DROP:
                    case ELSE:
                    case END:
                    case ENGINE:
                    case EVENTS:
                    case EXISTS:
                    case EXPLAIN:
                    case EXPRESSION:
                    case EXTRACT:
                    case FETCHES:
                    case FINAL:
                    case FIRST:
                    case FLUSH:
                    case FOLLOWING:
                    case FOR:
                    case FORMAT:
                    case FREEZE:
                    case FROM:
                    case FULL:
                    case FUNCTION:
                    case GLOBAL:
                    case GRANULARITY:
                    case GROUP:
                    case HAVING:
                    case HIERARCHICAL:
                    case HOUR:
                    case ID:
                    case IF:
                    case ILIKE:
                    case IN:
                    case INDEX:
                    case INJECTIVE:
                    case INNER:
                    case INSERT:
                    case INTERVAL:
                    case INTO:
                    case IS:
                    case IS_OBJECT_ID:
                    case JOIN:
                    case KEY:
                    case KILL:
                    case LAST:
                    case LAYOUT:
                    case LEADING:
                    case LEFT:
                    case LIFETIME:
                    case LIKE:
                    case LIMIT:
                    case LIVE:
                    case LOCAL:
                    case LOGS:
                    case MATERIALIZE:
                    case MATERIALIZED:
                    case MAX:
                    case MERGES:
                    case MIN:
                    case MINUTE:
                    case MODIFY:
                    case MONTH:
                    case MOVE:
                    case MUTATION:
                    case NO:
                    case NOT:
                    case NULLS:
                    case OFFSET:
                    case ON:
                    case OPTIMIZE:
                    case OR:
                    case ORDER:
                    case OUTER:
                    case OUTFILE:
                    case OVER:
                    case PARTITION:
                    case POPULATE:
                    case PRECEDING:
                    case PREWHERE:
                    case PRIMARY:
                    case QUARTER:
                    case RANGE:
                    case RELOAD:
                    case REMOVE:
                    case RENAME:
                    case REPLACE:
                    case REPLICA:
                    case REPLICATED:
                    case RIGHT:
                    case ROLLUP:
                    case ROW:
                    case ROWS:
                    case SAMPLE:
                    case SECOND:
                    case SELECT:
                    case SEMI:
                    case SENDS:
                    case SET:
                    case SETTINGS:
                    case SHOW:
                    case SOURCE:
                    case START:
                    case STOP:
                    case SUBSTRING:
                    case SYNC:
                    case SYNTAX:
                    case SYSTEM:
                    case TABLE:
                    case TABLES:
                    case TEMPORARY:
                    case TEST:
                    case THEN:
                    case TIES:
                    case TIMEOUT:
                    case TIMESTAMP:
                    case TO:
                    case TOP:
                    case TOTALS:
                    case TRAILING:
                    case TRIM:
                    case TRUNCATE:
                    case TTL:
                    case TYPE:
                    case UNBOUNDED:
                    case UNION:
                    case UPDATE:
                    case USE:
                    case USING:
                    case UUID:
                    case VALUES:
                    case VIEW:
                    case VOLUME:
                    case WATCH:
                    case WEEK:
                    case WHEN:
                    case WHERE:
                    case WINDOW:
                    case WITH:
                    case YEAR:
                    case JSON_FALSE:
                    case JSON_TRUE:
                    case IDENTIFIER: {
                        setState(1964);
                        identifier();
                        setState(1969);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(1965);
                                    match(COMMA);
                                    setState(1966);
                                    identifier();
                                }
                            }
                            setState(1971);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(1974);
                match(ARROW);
                setState(1975);
                columnExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnIdentifierContext extends ParserRuleContext {
        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(ClickHouseParser.DOT, 0);
        }

        public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_columnIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterColumnIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitColumnIdentifier(this);
        }
    }

    public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
        ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
        enterRule(_localctx, 206, RULE_columnIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1980);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 259, _ctx)) {
                    case 1: {
                        setState(1977);
                        tableIdentifier();
                        setState(1978);
                        match(DOT);
                    }
                    break;
                }
                setState(1982);
                nestedIdentifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NestedIdentifierContext extends ParserRuleContext {
        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode DOT() {
            return getToken(ClickHouseParser.DOT, 0);
        }

        public NestedIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nestedIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterNestedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitNestedIdentifier(this);
        }
    }

    public final NestedIdentifierContext nestedIdentifier() throws RecognitionException {
        NestedIdentifierContext _localctx = new NestedIdentifierContext(_ctx, getState());
        enterRule(_localctx, 208, RULE_nestedIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1984);
                identifier();
                setState(1987);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 260, _ctx)) {
                    case 1: {
                        setState(1985);
                        match(DOT);
                        setState(1986);
                        identifier();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableExprContext extends ParserRuleContext {
        public TableExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableExpr;
        }

        public TableExprContext() {
        }

        public void copyFrom(TableExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class TableExprIdentifierContext extends TableExprContext {
        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TableExprIdentifierContext(TableExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableExprIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableExprIdentifier(this);
        }
    }

    public static class TableExprSubqueryContext extends TableExprContext {
        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public SelectUnionStmtContext selectUnionStmt() {
            return getRuleContext(SelectUnionStmtContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public TableExprSubqueryContext(TableExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableExprSubquery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableExprSubquery(this);
        }
    }

    public static class TableExprAliasContext extends TableExprContext {
        public TableExprContext tableExpr() {
            return getRuleContext(TableExprContext.class, 0);
        }

        public AliasContext alias() {
            return getRuleContext(AliasContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TableExprAliasContext(TableExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableExprAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableExprAlias(this);
        }
    }

    public static class TableExprFunctionContext extends TableExprContext {
        public TableFunctionExprContext tableFunctionExpr() {
            return getRuleContext(TableFunctionExprContext.class, 0);
        }

        public TableExprFunctionContext(TableExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableExprFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableExprFunction(this);
        }
    }

    public final TableExprContext tableExpr() throws RecognitionException {
        return tableExpr(0);
    }

    private TableExprContext tableExpr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        TableExprContext _localctx = new TableExprContext(_ctx, _parentState);
        TableExprContext _prevctx = _localctx;
        int _startState = 210;
        enterRecursionRule(_localctx, 210, RULE_tableExpr, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1996);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 261, _ctx)) {
                    case 1: {
                        _localctx = new TableExprIdentifierContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(1990);
                        tableIdentifier();
                    }
                    break;
                    case 2: {
                        _localctx = new TableExprFunctionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1991);
                        tableFunctionExpr();
                    }
                    break;
                    case 3: {
                        _localctx = new TableExprSubqueryContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1992);
                        match(LPAREN);
                        setState(1993);
                        selectUnionStmt();
                        setState(1994);
                        match(RPAREN);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(2006);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 263, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new TableExprAliasContext(new TableExprContext(_parentctx, _parentState));
                                pushNewRecursionContext(_localctx, _startState, RULE_tableExpr);
                                setState(1998);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(2002);
                                _errHandler.sync(this);
                                switch (_input.LA(1)) {
                                    case AFTER:
                                    case ALIAS:
                                    case ALTER:
                                    case ASCENDING:
                                    case AST:
                                    case ASYNC:
                                    case ATTACH:
                                    case BOTH:
                                    case BY:
                                    case CASE:
                                    case CAST:
                                    case CHECK:
                                    case CLEAR:
                                    case CLUSTER:
                                    case CODEC:
                                    case COLLATE:
                                    case COLUMN:
                                    case COMMENT:
                                    case CONSTRAINT:
                                    case CREATE:
                                    case CUBE:
                                    case CURRENT:
                                    case DATABASE:
                                    case DATABASES:
                                    case DATE:
                                    case DEDUPLICATE:
                                    case DEFAULT:
                                    case DELAY:
                                    case DELETE:
                                    case DESC:
                                    case DESCENDING:
                                    case DESCRIBE:
                                    case DETACH:
                                    case DICTIONARIES:
                                    case DICTIONARY:
                                    case DISK:
                                    case DISTRIBUTED:
                                    case DROP:
                                    case ELSE:
                                    case END:
                                    case ENGINE:
                                    case EVENTS:
                                    case EXISTS:
                                    case EXPLAIN:
                                    case EXPRESSION:
                                    case EXTRACT:
                                    case FETCHES:
                                    case FIRST:
                                    case FLUSH:
                                    case FOLLOWING:
                                    case FOR:
                                    case FREEZE:
                                    case FUNCTION:
                                    case GRANULARITY:
                                    case HIERARCHICAL:
                                    case ID:
                                    case IF:
                                    case INDEX:
                                    case INJECTIVE:
                                    case INSERT:
                                    case INTERVAL:
                                    case IS_OBJECT_ID:
                                    case KEY:
                                    case KILL:
                                    case LAST:
                                    case LAYOUT:
                                    case LEADING:
                                    case LIFETIME:
                                    case LIVE:
                                    case LOCAL:
                                    case LOGS:
                                    case MATERIALIZE:
                                    case MATERIALIZED:
                                    case MAX:
                                    case MERGES:
                                    case MIN:
                                    case MODIFY:
                                    case MOVE:
                                    case MUTATION:
                                    case NO:
                                    case NULLS:
                                    case OPTIMIZE:
                                    case OUTER:
                                    case OUTFILE:
                                    case OVER:
                                    case PARTITION:
                                    case POPULATE:
                                    case PRECEDING:
                                    case PRIMARY:
                                    case RANGE:
                                    case RELOAD:
                                    case REMOVE:
                                    case RENAME:
                                    case REPLACE:
                                    case REPLICA:
                                    case REPLICATED:
                                    case ROLLUP:
                                    case ROW:
                                    case ROWS:
                                    case SELECT:
                                    case SENDS:
                                    case SET:
                                    case SHOW:
                                    case SOURCE:
                                    case START:
                                    case STOP:
                                    case SUBSTRING:
                                    case SYNC:
                                    case SYNTAX:
                                    case SYSTEM:
                                    case TABLE:
                                    case TABLES:
                                    case TEMPORARY:
                                    case TEST:
                                    case THEN:
                                    case TIES:
                                    case TIMEOUT:
                                    case TIMESTAMP:
                                    case TO:
                                    case TOTALS:
                                    case TRAILING:
                                    case TRIM:
                                    case TRUNCATE:
                                    case TTL:
                                    case TYPE:
                                    case UNBOUNDED:
                                    case UPDATE:
                                    case USE:
                                    case UUID:
                                    case VALUES:
                                    case VIEW:
                                    case VOLUME:
                                    case WATCH:
                                    case WHEN:
                                    case IDENTIFIER: {
                                        setState(1999);
                                        alias();
                                    }
                                    break;
                                    case AS: {
                                        setState(2000);
                                        match(AS);
                                        setState(2001);
                                        identifier();
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                    }
                    setState(2008);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 263, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class TableFunctionExprContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ClickHouseParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ClickHouseParser.RPAREN, 0);
        }

        public TableArgListContext tableArgList() {
            return getRuleContext(TableArgListContext.class, 0);
        }

        public TableFunctionExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableFunctionExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableFunctionExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableFunctionExpr(this);
        }
    }

    public final TableFunctionExprContext tableFunctionExpr() throws RecognitionException {
        TableFunctionExprContext _localctx = new TableFunctionExprContext(_ctx, getState());
        enterRule(_localctx, 212, RULE_tableFunctionExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2009);
                identifier();
                setState(2010);
                match(LPAREN);
                setState(2012);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DAY) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (HOUR - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INF - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MINUTE - 64)) | (1L << (MODIFY - 64)) | (1L << (MONTH - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NAN_SQL - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL_SQL - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (QUARTER - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SECOND - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WEEK - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (YEAR - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (FLOATING_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (DECIMAL_LITERAL - 192)) | (1L << (HEXADECIMAL_LITERAL - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (DASH - 192)) | (1L << (DOT - 192)) | (1L << (PLUS - 192)))) != 0)) {
                    {
                        setState(2011);
                        tableArgList();
                    }
                }

                setState(2014);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableIdentifierContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DatabaseIdentifierContext databaseIdentifier() {
            return getRuleContext(DatabaseIdentifierContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(ClickHouseParser.DOT, 0);
        }

        public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableIdentifier(this);
        }
    }

    public final TableIdentifierContext tableIdentifier() throws RecognitionException {
        TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
        enterRule(_localctx, 214, RULE_tableIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2019);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 265, _ctx)) {
                    case 1: {
                        setState(2016);
                        databaseIdentifier();
                        setState(2017);
                        match(DOT);
                    }
                    break;
                }
                setState(2021);
                identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableArgListContext extends ParserRuleContext {
        public List<TableArgExprContext> tableArgExpr() {
            return getRuleContexts(TableArgExprContext.class);
        }

        public TableArgExprContext tableArgExpr(int i) {
            return getRuleContext(TableArgExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ClickHouseParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ClickHouseParser.COMMA, i);
        }

        public TableArgListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableArgList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableArgList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableArgList(this);
        }
    }

    public final TableArgListContext tableArgList() throws RecognitionException {
        TableArgListContext _localctx = new TableArgListContext(_ctx, getState());
        enterRule(_localctx, 216, RULE_tableArgList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2023);
                tableArgExpr();
                setState(2028);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(2024);
                            match(COMMA);
                            setState(2025);
                            tableArgExpr();
                        }
                    }
                    setState(2030);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableArgExprContext extends ParserRuleContext {
        public NestedIdentifierContext nestedIdentifier() {
            return getRuleContext(NestedIdentifierContext.class, 0);
        }

        public TableFunctionExprContext tableFunctionExpr() {
            return getRuleContext(TableFunctionExprContext.class, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TableArgExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableArgExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterTableArgExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitTableArgExpr(this);
        }
    }

    public final TableArgExprContext tableArgExpr() throws RecognitionException {
        TableArgExprContext _localctx = new TableArgExprContext(_ctx, getState());
        enterRule(_localctx, 218, RULE_tableArgExpr);
        try {
            setState(2034);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 267, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2031);
                    nestedIdentifier();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2032);
                    tableFunctionExpr();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2033);
                    literal();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DatabaseIdentifierContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DatabaseIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_databaseIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterDatabaseIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitDatabaseIdentifier(this);
        }
    }

    public final DatabaseIdentifierContext databaseIdentifier() throws RecognitionException {
        DatabaseIdentifierContext _localctx = new DatabaseIdentifierContext(_ctx, getState());
        enterRule(_localctx, 220, RULE_databaseIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2036);
                identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FloatingLiteralContext extends ParserRuleContext {
        public TerminalNode FLOATING_LITERAL() {
            return getToken(ClickHouseParser.FLOATING_LITERAL, 0);
        }

        public TerminalNode DOT() {
            return getToken(ClickHouseParser.DOT, 0);
        }

        public List<TerminalNode> DECIMAL_LITERAL() {
            return getTokens(ClickHouseParser.DECIMAL_LITERAL);
        }

        public TerminalNode DECIMAL_LITERAL(int i) {
            return getToken(ClickHouseParser.DECIMAL_LITERAL, i);
        }

        public TerminalNode OCTAL_LITERAL() {
            return getToken(ClickHouseParser.OCTAL_LITERAL, 0);
        }

        public FloatingLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_floatingLiteral;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterFloatingLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitFloatingLiteral(this);
        }
    }

    public final FloatingLiteralContext floatingLiteral() throws RecognitionException {
        FloatingLiteralContext _localctx = new FloatingLiteralContext(_ctx, getState());
        enterRule(_localctx, 222, RULE_floatingLiteral);
        int _la;
        try {
            setState(2046);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FLOATING_LITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2038);
                    match(FLOATING_LITERAL);
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2039);
                    match(DOT);
                    setState(2040);
                    _la = _input.LA(1);
                    if (!(_la == OCTAL_LITERAL || _la == DECIMAL_LITERAL)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case DECIMAL_LITERAL:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2041);
                    match(DECIMAL_LITERAL);
                    setState(2042);
                    match(DOT);
                    setState(2044);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 268, _ctx)) {
                        case 1: {
                            setState(2043);
                            _la = _input.LA(1);
                            if (!(_la == OCTAL_LITERAL || _la == DECIMAL_LITERAL)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                        break;
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NumberLiteralContext extends ParserRuleContext {
        public FloatingLiteralContext floatingLiteral() {
            return getRuleContext(FloatingLiteralContext.class, 0);
        }

        public TerminalNode OCTAL_LITERAL() {
            return getToken(ClickHouseParser.OCTAL_LITERAL, 0);
        }

        public TerminalNode DECIMAL_LITERAL() {
            return getToken(ClickHouseParser.DECIMAL_LITERAL, 0);
        }

        public TerminalNode HEXADECIMAL_LITERAL() {
            return getToken(ClickHouseParser.HEXADECIMAL_LITERAL, 0);
        }

        public TerminalNode INF() {
            return getToken(ClickHouseParser.INF, 0);
        }

        public TerminalNode NAN_SQL() {
            return getToken(ClickHouseParser.NAN_SQL, 0);
        }

        public TerminalNode PLUS() {
            return getToken(ClickHouseParser.PLUS, 0);
        }

        public TerminalNode DASH() {
            return getToken(ClickHouseParser.DASH, 0);
        }

        public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_numberLiteral;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterNumberLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitNumberLiteral(this);
        }
    }

    public final NumberLiteralContext numberLiteral() throws RecognitionException {
        NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
        enterRule(_localctx, 224, RULE_numberLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2049);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DASH || _la == PLUS) {
                    {
                        setState(2048);
                        _la = _input.LA(1);
                        if (!(_la == DASH || _la == PLUS)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(2057);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 271, _ctx)) {
                    case 1: {
                        setState(2051);
                        floatingLiteral();
                    }
                    break;
                    case 2: {
                        setState(2052);
                        match(OCTAL_LITERAL);
                    }
                    break;
                    case 3: {
                        setState(2053);
                        match(DECIMAL_LITERAL);
                    }
                    break;
                    case 4: {
                        setState(2054);
                        match(HEXADECIMAL_LITERAL);
                    }
                    break;
                    case 5: {
                        setState(2055);
                        match(INF);
                    }
                    break;
                    case 6: {
                        setState(2056);
                        match(NAN_SQL);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LiteralContext extends ParserRuleContext {
        public NumberLiteralContext numberLiteral() {
            return getRuleContext(NumberLiteralContext.class, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode NULL_SQL() {
            return getToken(ClickHouseParser.NULL_SQL, 0);
        }

        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitLiteral(this);
        }
    }

    public final LiteralContext literal() throws RecognitionException {
        LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 226, RULE_literal);
        try {
            setState(2062);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case INF:
                case NAN_SQL:
                case FLOATING_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case HEXADECIMAL_LITERAL:
                case DASH:
                case DOT:
                case PLUS:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2059);
                    numberLiteral();
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2060);
                    match(STRING_LITERAL);
                }
                break;
                case NULL_SQL:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2061);
                    match(NULL_SQL);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IntervalContext extends ParserRuleContext {
        public TerminalNode SECOND() {
            return getToken(ClickHouseParser.SECOND, 0);
        }

        public TerminalNode MINUTE() {
            return getToken(ClickHouseParser.MINUTE, 0);
        }

        public TerminalNode HOUR() {
            return getToken(ClickHouseParser.HOUR, 0);
        }

        public TerminalNode DAY() {
            return getToken(ClickHouseParser.DAY, 0);
        }

        public TerminalNode WEEK() {
            return getToken(ClickHouseParser.WEEK, 0);
        }

        public TerminalNode MONTH() {
            return getToken(ClickHouseParser.MONTH, 0);
        }

        public TerminalNode QUARTER() {
            return getToken(ClickHouseParser.QUARTER, 0);
        }

        public TerminalNode YEAR() {
            return getToken(ClickHouseParser.YEAR, 0);
        }

        public IntervalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interval;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterInterval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitInterval(this);
        }
    }

    public final IntervalContext interval() throws RecognitionException {
        IntervalContext _localctx = new IntervalContext(_ctx, getState());
        enterRule(_localctx, 228, RULE_interval);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2064);
                _la = _input.LA(1);
                if (!(_la == DAY || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (HOUR - 75)) | (1L << (MINUTE - 75)) | (1L << (MONTH - 75)) | (1L << (QUARTER - 75)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SECOND - 144)) | (1L << (WEEK - 144)) | (1L << (YEAR - 144)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class KeywordContext extends ParserRuleContext {
        public TerminalNode AFTER() {
            return getToken(ClickHouseParser.AFTER, 0);
        }

        public TerminalNode ALIAS() {
            return getToken(ClickHouseParser.ALIAS, 0);
        }

        public TerminalNode ALL() {
            return getToken(ClickHouseParser.ALL, 0);
        }

        public TerminalNode ALTER() {
            return getToken(ClickHouseParser.ALTER, 0);
        }

        public TerminalNode AND() {
            return getToken(ClickHouseParser.AND, 0);
        }

        public TerminalNode ANTI() {
            return getToken(ClickHouseParser.ANTI, 0);
        }

        public TerminalNode ANY() {
            return getToken(ClickHouseParser.ANY, 0);
        }

        public TerminalNode ARRAY() {
            return getToken(ClickHouseParser.ARRAY, 0);
        }

        public TerminalNode AS() {
            return getToken(ClickHouseParser.AS, 0);
        }

        public TerminalNode ASCENDING() {
            return getToken(ClickHouseParser.ASCENDING, 0);
        }

        public TerminalNode ASOF() {
            return getToken(ClickHouseParser.ASOF, 0);
        }

        public TerminalNode AST() {
            return getToken(ClickHouseParser.AST, 0);
        }

        public TerminalNode ASYNC() {
            return getToken(ClickHouseParser.ASYNC, 0);
        }

        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode BETWEEN() {
            return getToken(ClickHouseParser.BETWEEN, 0);
        }

        public TerminalNode BOTH() {
            return getToken(ClickHouseParser.BOTH, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public TerminalNode CASE() {
            return getToken(ClickHouseParser.CASE, 0);
        }

        public TerminalNode CAST() {
            return getToken(ClickHouseParser.CAST, 0);
        }

        public TerminalNode CHECK() {
            return getToken(ClickHouseParser.CHECK, 0);
        }

        public TerminalNode CLEAR() {
            return getToken(ClickHouseParser.CLEAR, 0);
        }

        public TerminalNode CLUSTER() {
            return getToken(ClickHouseParser.CLUSTER, 0);
        }

        public TerminalNode CODEC() {
            return getToken(ClickHouseParser.CODEC, 0);
        }

        public TerminalNode COLLATE() {
            return getToken(ClickHouseParser.COLLATE, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(ClickHouseParser.COMMENT, 0);
        }

        public TerminalNode CONSTRAINT() {
            return getToken(ClickHouseParser.CONSTRAINT, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode CROSS() {
            return getToken(ClickHouseParser.CROSS, 0);
        }

        public TerminalNode CUBE() {
            return getToken(ClickHouseParser.CUBE, 0);
        }

        public TerminalNode CURRENT() {
            return getToken(ClickHouseParser.CURRENT, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(ClickHouseParser.DATABASE, 0);
        }

        public TerminalNode DATABASES() {
            return getToken(ClickHouseParser.DATABASES, 0);
        }

        public TerminalNode DATE() {
            return getToken(ClickHouseParser.DATE, 0);
        }

        public TerminalNode DEDUPLICATE() {
            return getToken(ClickHouseParser.DEDUPLICATE, 0);
        }

        public TerminalNode DEFAULT() {
            return getToken(ClickHouseParser.DEFAULT, 0);
        }

        public TerminalNode DELAY() {
            return getToken(ClickHouseParser.DELAY, 0);
        }

        public TerminalNode DELETE() {
            return getToken(ClickHouseParser.DELETE, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(ClickHouseParser.DESCRIBE, 0);
        }

        public TerminalNode DESC() {
            return getToken(ClickHouseParser.DESC, 0);
        }

        public TerminalNode DESCENDING() {
            return getToken(ClickHouseParser.DESCENDING, 0);
        }

        public TerminalNode DETACH() {
            return getToken(ClickHouseParser.DETACH, 0);
        }

        public TerminalNode DICTIONARIES() {
            return getToken(ClickHouseParser.DICTIONARIES, 0);
        }

        public TerminalNode DICTIONARY() {
            return getToken(ClickHouseParser.DICTIONARY, 0);
        }

        public TerminalNode DISK() {
            return getToken(ClickHouseParser.DISK, 0);
        }

        public TerminalNode DISTINCT() {
            return getToken(ClickHouseParser.DISTINCT, 0);
        }

        public TerminalNode DISTRIBUTED() {
            return getToken(ClickHouseParser.DISTRIBUTED, 0);
        }

        public TerminalNode DROP() {
            return getToken(ClickHouseParser.DROP, 0);
        }

        public TerminalNode ELSE() {
            return getToken(ClickHouseParser.ELSE, 0);
        }

        public TerminalNode END() {
            return getToken(ClickHouseParser.END, 0);
        }

        public TerminalNode ENGINE() {
            return getToken(ClickHouseParser.ENGINE, 0);
        }

        public TerminalNode EVENTS() {
            return getToken(ClickHouseParser.EVENTS, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode EXPLAIN() {
            return getToken(ClickHouseParser.EXPLAIN, 0);
        }

        public TerminalNode EXPRESSION() {
            return getToken(ClickHouseParser.EXPRESSION, 0);
        }

        public TerminalNode EXTRACT() {
            return getToken(ClickHouseParser.EXTRACT, 0);
        }

        public TerminalNode FETCHES() {
            return getToken(ClickHouseParser.FETCHES, 0);
        }

        public TerminalNode FINAL() {
            return getToken(ClickHouseParser.FINAL, 0);
        }

        public TerminalNode FIRST() {
            return getToken(ClickHouseParser.FIRST, 0);
        }

        public TerminalNode FLUSH() {
            return getToken(ClickHouseParser.FLUSH, 0);
        }

        public TerminalNode FOR() {
            return getToken(ClickHouseParser.FOR, 0);
        }

        public TerminalNode FOLLOWING() {
            return getToken(ClickHouseParser.FOLLOWING, 0);
        }

        public TerminalNode FORMAT() {
            return getToken(ClickHouseParser.FORMAT, 0);
        }

        public TerminalNode FREEZE() {
            return getToken(ClickHouseParser.FREEZE, 0);
        }

        public TerminalNode FROM() {
            return getToken(ClickHouseParser.FROM, 0);
        }

        public TerminalNode FULL() {
            return getToken(ClickHouseParser.FULL, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(ClickHouseParser.FUNCTION, 0);
        }

        public TerminalNode GLOBAL() {
            return getToken(ClickHouseParser.GLOBAL, 0);
        }

        public TerminalNode GRANULARITY() {
            return getToken(ClickHouseParser.GRANULARITY, 0);
        }

        public TerminalNode GROUP() {
            return getToken(ClickHouseParser.GROUP, 0);
        }

        public TerminalNode HAVING() {
            return getToken(ClickHouseParser.HAVING, 0);
        }

        public TerminalNode HIERARCHICAL() {
            return getToken(ClickHouseParser.HIERARCHICAL, 0);
        }

        public TerminalNode ID() {
            return getToken(ClickHouseParser.ID, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode ILIKE() {
            return getToken(ClickHouseParser.ILIKE, 0);
        }

        public TerminalNode IN() {
            return getToken(ClickHouseParser.IN, 0);
        }

        public TerminalNode INDEX() {
            return getToken(ClickHouseParser.INDEX, 0);
        }

        public TerminalNode INJECTIVE() {
            return getToken(ClickHouseParser.INJECTIVE, 0);
        }

        public TerminalNode INNER() {
            return getToken(ClickHouseParser.INNER, 0);
        }

        public TerminalNode INSERT() {
            return getToken(ClickHouseParser.INSERT, 0);
        }

        public TerminalNode INTERVAL() {
            return getToken(ClickHouseParser.INTERVAL, 0);
        }

        public TerminalNode INTO() {
            return getToken(ClickHouseParser.INTO, 0);
        }

        public TerminalNode IS() {
            return getToken(ClickHouseParser.IS, 0);
        }

        public TerminalNode IS_OBJECT_ID() {
            return getToken(ClickHouseParser.IS_OBJECT_ID, 0);
        }

        public TerminalNode JOIN() {
            return getToken(ClickHouseParser.JOIN, 0);
        }

        public TerminalNode JSON_FALSE() {
            return getToken(ClickHouseParser.JSON_FALSE, 0);
        }

        public TerminalNode JSON_TRUE() {
            return getToken(ClickHouseParser.JSON_TRUE, 0);
        }

        public TerminalNode KEY() {
            return getToken(ClickHouseParser.KEY, 0);
        }

        public TerminalNode KILL() {
            return getToken(ClickHouseParser.KILL, 0);
        }

        public TerminalNode LAST() {
            return getToken(ClickHouseParser.LAST, 0);
        }

        public TerminalNode LAYOUT() {
            return getToken(ClickHouseParser.LAYOUT, 0);
        }

        public TerminalNode LEADING() {
            return getToken(ClickHouseParser.LEADING, 0);
        }

        public TerminalNode LEFT() {
            return getToken(ClickHouseParser.LEFT, 0);
        }

        public TerminalNode LIFETIME() {
            return getToken(ClickHouseParser.LIFETIME, 0);
        }

        public TerminalNode LIKE() {
            return getToken(ClickHouseParser.LIKE, 0);
        }

        public TerminalNode LIMIT() {
            return getToken(ClickHouseParser.LIMIT, 0);
        }

        public TerminalNode LIVE() {
            return getToken(ClickHouseParser.LIVE, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(ClickHouseParser.LOCAL, 0);
        }

        public TerminalNode LOGS() {
            return getToken(ClickHouseParser.LOGS, 0);
        }

        public TerminalNode MATERIALIZE() {
            return getToken(ClickHouseParser.MATERIALIZE, 0);
        }

        public TerminalNode MATERIALIZED() {
            return getToken(ClickHouseParser.MATERIALIZED, 0);
        }

        public TerminalNode MAX() {
            return getToken(ClickHouseParser.MAX, 0);
        }

        public TerminalNode MERGES() {
            return getToken(ClickHouseParser.MERGES, 0);
        }

        public TerminalNode MIN() {
            return getToken(ClickHouseParser.MIN, 0);
        }

        public TerminalNode MODIFY() {
            return getToken(ClickHouseParser.MODIFY, 0);
        }

        public TerminalNode MOVE() {
            return getToken(ClickHouseParser.MOVE, 0);
        }

        public TerminalNode MUTATION() {
            return getToken(ClickHouseParser.MUTATION, 0);
        }

        public TerminalNode NO() {
            return getToken(ClickHouseParser.NO, 0);
        }

        public TerminalNode NOT() {
            return getToken(ClickHouseParser.NOT, 0);
        }

        public TerminalNode NULLS() {
            return getToken(ClickHouseParser.NULLS, 0);
        }

        public TerminalNode OFFSET() {
            return getToken(ClickHouseParser.OFFSET, 0);
        }

        public TerminalNode ON() {
            return getToken(ClickHouseParser.ON, 0);
        }

        public TerminalNode OPTIMIZE() {
            return getToken(ClickHouseParser.OPTIMIZE, 0);
        }

        public TerminalNode OR() {
            return getToken(ClickHouseParser.OR, 0);
        }

        public TerminalNode ORDER() {
            return getToken(ClickHouseParser.ORDER, 0);
        }

        public TerminalNode OUTER() {
            return getToken(ClickHouseParser.OUTER, 0);
        }

        public TerminalNode OUTFILE() {
            return getToken(ClickHouseParser.OUTFILE, 0);
        }

        public TerminalNode OVER() {
            return getToken(ClickHouseParser.OVER, 0);
        }

        public TerminalNode PARTITION() {
            return getToken(ClickHouseParser.PARTITION, 0);
        }

        public TerminalNode POPULATE() {
            return getToken(ClickHouseParser.POPULATE, 0);
        }

        public TerminalNode PRECEDING() {
            return getToken(ClickHouseParser.PRECEDING, 0);
        }

        public TerminalNode PREWHERE() {
            return getToken(ClickHouseParser.PREWHERE, 0);
        }

        public TerminalNode PRIMARY() {
            return getToken(ClickHouseParser.PRIMARY, 0);
        }

        public TerminalNode RANGE() {
            return getToken(ClickHouseParser.RANGE, 0);
        }

        public TerminalNode RELOAD() {
            return getToken(ClickHouseParser.RELOAD, 0);
        }

        public TerminalNode REMOVE() {
            return getToken(ClickHouseParser.REMOVE, 0);
        }

        public TerminalNode RENAME() {
            return getToken(ClickHouseParser.RENAME, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(ClickHouseParser.REPLACE, 0);
        }

        public TerminalNode REPLICA() {
            return getToken(ClickHouseParser.REPLICA, 0);
        }

        public TerminalNode REPLICATED() {
            return getToken(ClickHouseParser.REPLICATED, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(ClickHouseParser.RIGHT, 0);
        }

        public TerminalNode ROLLUP() {
            return getToken(ClickHouseParser.ROLLUP, 0);
        }

        public TerminalNode ROW() {
            return getToken(ClickHouseParser.ROW, 0);
        }

        public TerminalNode ROWS() {
            return getToken(ClickHouseParser.ROWS, 0);
        }

        public TerminalNode SAMPLE() {
            return getToken(ClickHouseParser.SAMPLE, 0);
        }

        public TerminalNode SELECT() {
            return getToken(ClickHouseParser.SELECT, 0);
        }

        public TerminalNode SEMI() {
            return getToken(ClickHouseParser.SEMI, 0);
        }

        public TerminalNode SENDS() {
            return getToken(ClickHouseParser.SENDS, 0);
        }

        public TerminalNode SET() {
            return getToken(ClickHouseParser.SET, 0);
        }

        public TerminalNode SETTINGS() {
            return getToken(ClickHouseParser.SETTINGS, 0);
        }

        public TerminalNode SHOW() {
            return getToken(ClickHouseParser.SHOW, 0);
        }

        public TerminalNode SOURCE() {
            return getToken(ClickHouseParser.SOURCE, 0);
        }

        public TerminalNode START() {
            return getToken(ClickHouseParser.START, 0);
        }

        public TerminalNode STOP() {
            return getToken(ClickHouseParser.STOP, 0);
        }

        public TerminalNode SUBSTRING() {
            return getToken(ClickHouseParser.SUBSTRING, 0);
        }

        public TerminalNode SYNC() {
            return getToken(ClickHouseParser.SYNC, 0);
        }

        public TerminalNode SYNTAX() {
            return getToken(ClickHouseParser.SYNTAX, 0);
        }

        public TerminalNode SYSTEM() {
            return getToken(ClickHouseParser.SYSTEM, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TerminalNode TABLES() {
            return getToken(ClickHouseParser.TABLES, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(ClickHouseParser.TEMPORARY, 0);
        }

        public TerminalNode TEST() {
            return getToken(ClickHouseParser.TEST, 0);
        }

        public TerminalNode THEN() {
            return getToken(ClickHouseParser.THEN, 0);
        }

        public TerminalNode TIES() {
            return getToken(ClickHouseParser.TIES, 0);
        }

        public TerminalNode TIMEOUT() {
            return getToken(ClickHouseParser.TIMEOUT, 0);
        }

        public TerminalNode TIMESTAMP() {
            return getToken(ClickHouseParser.TIMESTAMP, 0);
        }

        public TerminalNode TOTALS() {
            return getToken(ClickHouseParser.TOTALS, 0);
        }

        public TerminalNode TRAILING() {
            return getToken(ClickHouseParser.TRAILING, 0);
        }

        public TerminalNode TRIM() {
            return getToken(ClickHouseParser.TRIM, 0);
        }

        public TerminalNode TRUNCATE() {
            return getToken(ClickHouseParser.TRUNCATE, 0);
        }

        public TerminalNode TO() {
            return getToken(ClickHouseParser.TO, 0);
        }

        public TerminalNode TOP() {
            return getToken(ClickHouseParser.TOP, 0);
        }

        public TerminalNode TTL() {
            return getToken(ClickHouseParser.TTL, 0);
        }

        public TerminalNode TYPE() {
            return getToken(ClickHouseParser.TYPE, 0);
        }

        public TerminalNode UNBOUNDED() {
            return getToken(ClickHouseParser.UNBOUNDED, 0);
        }

        public TerminalNode UNION() {
            return getToken(ClickHouseParser.UNION, 0);
        }

        public TerminalNode UPDATE() {
            return getToken(ClickHouseParser.UPDATE, 0);
        }

        public TerminalNode USE() {
            return getToken(ClickHouseParser.USE, 0);
        }

        public TerminalNode USING() {
            return getToken(ClickHouseParser.USING, 0);
        }

        public TerminalNode UUID() {
            return getToken(ClickHouseParser.UUID, 0);
        }

        public TerminalNode VALUES() {
            return getToken(ClickHouseParser.VALUES, 0);
        }

        public TerminalNode VIEW() {
            return getToken(ClickHouseParser.VIEW, 0);
        }

        public TerminalNode VOLUME() {
            return getToken(ClickHouseParser.VOLUME, 0);
        }

        public TerminalNode WATCH() {
            return getToken(ClickHouseParser.WATCH, 0);
        }

        public TerminalNode WHEN() {
            return getToken(ClickHouseParser.WHEN, 0);
        }

        public TerminalNode WHERE() {
            return getToken(ClickHouseParser.WHERE, 0);
        }

        public TerminalNode WINDOW() {
            return getToken(ClickHouseParser.WINDOW, 0);
        }

        public TerminalNode WITH() {
            return getToken(ClickHouseParser.WITH, 0);
        }

        public KeywordContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_keyword;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterKeyword(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitKeyword(this);
        }
    }

    public final KeywordContext keyword() throws RecognitionException {
        KeywordContext _localctx = new KeywordContext(_ctx, getState());
        enterRule(_localctx, 230, RULE_keyword);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2066);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASCENDING) | (1L << ASOF) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BETWEEN) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FINAL) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FORMAT - 64)) | (1L << (FREEZE - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (FUNCTION - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANULARITY - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (ILIKE - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INNER - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (JOIN - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PREWHERE - 128)) | (1L << (PRIMARY - 128)) | (1L << (RANGE - 128)) | (1L << (RELOAD - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REPLACE - 128)) | (1L << (REPLICA - 128)) | (1L << (REPLICATED - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLUP - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SAMPLE - 128)) | (1L << (SELECT - 128)) | (1L << (SEMI - 128)) | (1L << (SENDS - 128)) | (1L << (SET - 128)) | (1L << (SETTINGS - 128)) | (1L << (SHOW - 128)) | (1L << (SOURCE - 128)) | (1L << (START - 128)) | (1L << (STOP - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYNC - 128)) | (1L << (SYNTAX - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLE - 128)) | (1L << (TABLES - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEST - 128)) | (1L << (THEN - 128)) | (1L << (TIES - 128)) | (1L << (TIMEOUT - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TOP - 128)) | (1L << (TOTALS - 128)) | (1L << (TRAILING - 128)) | (1L << (TRIM - 128)) | (1L << (TRUNCATE - 128)) | (1L << (TTL - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNION - 128)) | (1L << (UPDATE - 128)) | (1L << (USE - 128)) | (1L << (USING - 128)) | (1L << (UUID - 128)) | (1L << (VALUES - 128)) | (1L << (VIEW - 128)) | (1L << (VOLUME - 128)) | (1L << (WATCH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (JSON_FALSE - 128)) | (1L << (JSON_TRUE - 128)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class KeywordForAliasContext extends ParserRuleContext {
        public TerminalNode AFTER() {
            return getToken(ClickHouseParser.AFTER, 0);
        }

        public TerminalNode ALIAS() {
            return getToken(ClickHouseParser.ALIAS, 0);
        }

        public TerminalNode ALTER() {
            return getToken(ClickHouseParser.ALTER, 0);
        }

        public TerminalNode ASCENDING() {
            return getToken(ClickHouseParser.ASCENDING, 0);
        }

        public TerminalNode AST() {
            return getToken(ClickHouseParser.AST, 0);
        }

        public TerminalNode ASYNC() {
            return getToken(ClickHouseParser.ASYNC, 0);
        }

        public TerminalNode ATTACH() {
            return getToken(ClickHouseParser.ATTACH, 0);
        }

        public TerminalNode BOTH() {
            return getToken(ClickHouseParser.BOTH, 0);
        }

        public TerminalNode BY() {
            return getToken(ClickHouseParser.BY, 0);
        }

        public TerminalNode CASE() {
            return getToken(ClickHouseParser.CASE, 0);
        }

        public TerminalNode CAST() {
            return getToken(ClickHouseParser.CAST, 0);
        }

        public TerminalNode CHECK() {
            return getToken(ClickHouseParser.CHECK, 0);
        }

        public TerminalNode CLEAR() {
            return getToken(ClickHouseParser.CLEAR, 0);
        }

        public TerminalNode CLUSTER() {
            return getToken(ClickHouseParser.CLUSTER, 0);
        }

        public TerminalNode CODEC() {
            return getToken(ClickHouseParser.CODEC, 0);
        }

        public TerminalNode COLLATE() {
            return getToken(ClickHouseParser.COLLATE, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(ClickHouseParser.COLUMN, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(ClickHouseParser.COMMENT, 0);
        }

        public TerminalNode CONSTRAINT() {
            return getToken(ClickHouseParser.CONSTRAINT, 0);
        }

        public TerminalNode CREATE() {
            return getToken(ClickHouseParser.CREATE, 0);
        }

        public TerminalNode CUBE() {
            return getToken(ClickHouseParser.CUBE, 0);
        }

        public TerminalNode CURRENT() {
            return getToken(ClickHouseParser.CURRENT, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(ClickHouseParser.DATABASE, 0);
        }

        public TerminalNode DATABASES() {
            return getToken(ClickHouseParser.DATABASES, 0);
        }

        public TerminalNode DATE() {
            return getToken(ClickHouseParser.DATE, 0);
        }

        public TerminalNode DEDUPLICATE() {
            return getToken(ClickHouseParser.DEDUPLICATE, 0);
        }

        public TerminalNode DEFAULT() {
            return getToken(ClickHouseParser.DEFAULT, 0);
        }

        public TerminalNode DELAY() {
            return getToken(ClickHouseParser.DELAY, 0);
        }

        public TerminalNode DELETE() {
            return getToken(ClickHouseParser.DELETE, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(ClickHouseParser.DESCRIBE, 0);
        }

        public TerminalNode DESC() {
            return getToken(ClickHouseParser.DESC, 0);
        }

        public TerminalNode DESCENDING() {
            return getToken(ClickHouseParser.DESCENDING, 0);
        }

        public TerminalNode DETACH() {
            return getToken(ClickHouseParser.DETACH, 0);
        }

        public TerminalNode DICTIONARIES() {
            return getToken(ClickHouseParser.DICTIONARIES, 0);
        }

        public TerminalNode DICTIONARY() {
            return getToken(ClickHouseParser.DICTIONARY, 0);
        }

        public TerminalNode DISK() {
            return getToken(ClickHouseParser.DISK, 0);
        }

        public TerminalNode DISTRIBUTED() {
            return getToken(ClickHouseParser.DISTRIBUTED, 0);
        }

        public TerminalNode DROP() {
            return getToken(ClickHouseParser.DROP, 0);
        }

        public TerminalNode ELSE() {
            return getToken(ClickHouseParser.ELSE, 0);
        }

        public TerminalNode END() {
            return getToken(ClickHouseParser.END, 0);
        }

        public TerminalNode ENGINE() {
            return getToken(ClickHouseParser.ENGINE, 0);
        }

        public TerminalNode EVENTS() {
            return getToken(ClickHouseParser.EVENTS, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(ClickHouseParser.EXISTS, 0);
        }

        public TerminalNode EXPLAIN() {
            return getToken(ClickHouseParser.EXPLAIN, 0);
        }

        public TerminalNode EXPRESSION() {
            return getToken(ClickHouseParser.EXPRESSION, 0);
        }

        public TerminalNode EXTRACT() {
            return getToken(ClickHouseParser.EXTRACT, 0);
        }

        public TerminalNode FETCHES() {
            return getToken(ClickHouseParser.FETCHES, 0);
        }

        public TerminalNode FIRST() {
            return getToken(ClickHouseParser.FIRST, 0);
        }

        public TerminalNode FLUSH() {
            return getToken(ClickHouseParser.FLUSH, 0);
        }

        public TerminalNode FOR() {
            return getToken(ClickHouseParser.FOR, 0);
        }

        public TerminalNode FOLLOWING() {
            return getToken(ClickHouseParser.FOLLOWING, 0);
        }

        public TerminalNode FREEZE() {
            return getToken(ClickHouseParser.FREEZE, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(ClickHouseParser.FUNCTION, 0);
        }

        public TerminalNode GRANULARITY() {
            return getToken(ClickHouseParser.GRANULARITY, 0);
        }

        public TerminalNode HIERARCHICAL() {
            return getToken(ClickHouseParser.HIERARCHICAL, 0);
        }

        public TerminalNode ID() {
            return getToken(ClickHouseParser.ID, 0);
        }

        public TerminalNode IF() {
            return getToken(ClickHouseParser.IF, 0);
        }

        public TerminalNode INDEX() {
            return getToken(ClickHouseParser.INDEX, 0);
        }

        public TerminalNode INJECTIVE() {
            return getToken(ClickHouseParser.INJECTIVE, 0);
        }

        public TerminalNode INSERT() {
            return getToken(ClickHouseParser.INSERT, 0);
        }

        public TerminalNode INTERVAL() {
            return getToken(ClickHouseParser.INTERVAL, 0);
        }

        public TerminalNode IS_OBJECT_ID() {
            return getToken(ClickHouseParser.IS_OBJECT_ID, 0);
        }

        public TerminalNode KEY() {
            return getToken(ClickHouseParser.KEY, 0);
        }

        public TerminalNode KILL() {
            return getToken(ClickHouseParser.KILL, 0);
        }

        public TerminalNode LAST() {
            return getToken(ClickHouseParser.LAST, 0);
        }

        public TerminalNode LAYOUT() {
            return getToken(ClickHouseParser.LAYOUT, 0);
        }

        public TerminalNode LEADING() {
            return getToken(ClickHouseParser.LEADING, 0);
        }

        public TerminalNode LIFETIME() {
            return getToken(ClickHouseParser.LIFETIME, 0);
        }

        public TerminalNode LIVE() {
            return getToken(ClickHouseParser.LIVE, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(ClickHouseParser.LOCAL, 0);
        }

        public TerminalNode LOGS() {
            return getToken(ClickHouseParser.LOGS, 0);
        }

        public TerminalNode MATERIALIZE() {
            return getToken(ClickHouseParser.MATERIALIZE, 0);
        }

        public TerminalNode MATERIALIZED() {
            return getToken(ClickHouseParser.MATERIALIZED, 0);
        }

        public TerminalNode MAX() {
            return getToken(ClickHouseParser.MAX, 0);
        }

        public TerminalNode MERGES() {
            return getToken(ClickHouseParser.MERGES, 0);
        }

        public TerminalNode MIN() {
            return getToken(ClickHouseParser.MIN, 0);
        }

        public TerminalNode MODIFY() {
            return getToken(ClickHouseParser.MODIFY, 0);
        }

        public TerminalNode MOVE() {
            return getToken(ClickHouseParser.MOVE, 0);
        }

        public TerminalNode MUTATION() {
            return getToken(ClickHouseParser.MUTATION, 0);
        }

        public TerminalNode NO() {
            return getToken(ClickHouseParser.NO, 0);
        }

        public TerminalNode NULLS() {
            return getToken(ClickHouseParser.NULLS, 0);
        }

        public TerminalNode OPTIMIZE() {
            return getToken(ClickHouseParser.OPTIMIZE, 0);
        }

        public TerminalNode OUTER() {
            return getToken(ClickHouseParser.OUTER, 0);
        }

        public TerminalNode OUTFILE() {
            return getToken(ClickHouseParser.OUTFILE, 0);
        }

        public TerminalNode OVER() {
            return getToken(ClickHouseParser.OVER, 0);
        }

        public TerminalNode PARTITION() {
            return getToken(ClickHouseParser.PARTITION, 0);
        }

        public TerminalNode POPULATE() {
            return getToken(ClickHouseParser.POPULATE, 0);
        }

        public TerminalNode PRECEDING() {
            return getToken(ClickHouseParser.PRECEDING, 0);
        }

        public TerminalNode PRIMARY() {
            return getToken(ClickHouseParser.PRIMARY, 0);
        }

        public TerminalNode RANGE() {
            return getToken(ClickHouseParser.RANGE, 0);
        }

        public TerminalNode RELOAD() {
            return getToken(ClickHouseParser.RELOAD, 0);
        }

        public TerminalNode REMOVE() {
            return getToken(ClickHouseParser.REMOVE, 0);
        }

        public TerminalNode RENAME() {
            return getToken(ClickHouseParser.RENAME, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(ClickHouseParser.REPLACE, 0);
        }

        public TerminalNode REPLICA() {
            return getToken(ClickHouseParser.REPLICA, 0);
        }

        public TerminalNode REPLICATED() {
            return getToken(ClickHouseParser.REPLICATED, 0);
        }

        public TerminalNode ROLLUP() {
            return getToken(ClickHouseParser.ROLLUP, 0);
        }

        public TerminalNode ROW() {
            return getToken(ClickHouseParser.ROW, 0);
        }

        public TerminalNode ROWS() {
            return getToken(ClickHouseParser.ROWS, 0);
        }

        public TerminalNode SELECT() {
            return getToken(ClickHouseParser.SELECT, 0);
        }

        public TerminalNode SENDS() {
            return getToken(ClickHouseParser.SENDS, 0);
        }

        public TerminalNode SET() {
            return getToken(ClickHouseParser.SET, 0);
        }

        public TerminalNode SHOW() {
            return getToken(ClickHouseParser.SHOW, 0);
        }

        public TerminalNode SOURCE() {
            return getToken(ClickHouseParser.SOURCE, 0);
        }

        public TerminalNode START() {
            return getToken(ClickHouseParser.START, 0);
        }

        public TerminalNode STOP() {
            return getToken(ClickHouseParser.STOP, 0);
        }

        public TerminalNode SUBSTRING() {
            return getToken(ClickHouseParser.SUBSTRING, 0);
        }

        public TerminalNode SYNC() {
            return getToken(ClickHouseParser.SYNC, 0);
        }

        public TerminalNode SYNTAX() {
            return getToken(ClickHouseParser.SYNTAX, 0);
        }

        public TerminalNode SYSTEM() {
            return getToken(ClickHouseParser.SYSTEM, 0);
        }

        public TerminalNode TABLE() {
            return getToken(ClickHouseParser.TABLE, 0);
        }

        public TerminalNode TABLES() {
            return getToken(ClickHouseParser.TABLES, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(ClickHouseParser.TEMPORARY, 0);
        }

        public TerminalNode TEST() {
            return getToken(ClickHouseParser.TEST, 0);
        }

        public TerminalNode THEN() {
            return getToken(ClickHouseParser.THEN, 0);
        }

        public TerminalNode TIES() {
            return getToken(ClickHouseParser.TIES, 0);
        }

        public TerminalNode TIMEOUT() {
            return getToken(ClickHouseParser.TIMEOUT, 0);
        }

        public TerminalNode TIMESTAMP() {
            return getToken(ClickHouseParser.TIMESTAMP, 0);
        }

        public TerminalNode TOTALS() {
            return getToken(ClickHouseParser.TOTALS, 0);
        }

        public TerminalNode TRAILING() {
            return getToken(ClickHouseParser.TRAILING, 0);
        }

        public TerminalNode TRIM() {
            return getToken(ClickHouseParser.TRIM, 0);
        }

        public TerminalNode TRUNCATE() {
            return getToken(ClickHouseParser.TRUNCATE, 0);
        }

        public TerminalNode TO() {
            return getToken(ClickHouseParser.TO, 0);
        }

        public TerminalNode TTL() {
            return getToken(ClickHouseParser.TTL, 0);
        }

        public TerminalNode TYPE() {
            return getToken(ClickHouseParser.TYPE, 0);
        }

        public TerminalNode UNBOUNDED() {
            return getToken(ClickHouseParser.UNBOUNDED, 0);
        }

        public TerminalNode UPDATE() {
            return getToken(ClickHouseParser.UPDATE, 0);
        }

        public TerminalNode USE() {
            return getToken(ClickHouseParser.USE, 0);
        }

        public TerminalNode UUID() {
            return getToken(ClickHouseParser.UUID, 0);
        }

        public TerminalNode VALUES() {
            return getToken(ClickHouseParser.VALUES, 0);
        }

        public TerminalNode VIEW() {
            return getToken(ClickHouseParser.VIEW, 0);
        }

        public TerminalNode VOLUME() {
            return getToken(ClickHouseParser.VOLUME, 0);
        }

        public TerminalNode WATCH() {
            return getToken(ClickHouseParser.WATCH, 0);
        }

        public TerminalNode WHEN() {
            return getToken(ClickHouseParser.WHEN, 0);
        }

        public KeywordForAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_keywordForAlias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterKeywordForAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitKeywordForAlias(this);
        }
    }

    public final KeywordForAliasContext keywordForAlias() throws RecognitionException {
        KeywordForAliasContext _localctx = new KeywordForAliasContext(_ctx, getState());
        enterRule(_localctx, 232, RULE_keywordForAlias);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2068);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AFTER) | (1L << ALIAS) | (1L << ALTER) | (1L << ASCENDING) | (1L << AST) | (1L << ASYNC) | (1L << ATTACH) | (1L << BOTH) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CODEC) | (1L << COLLATE) | (1L << COLUMN) | (1L << COMMENT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << DATABASE) | (1L << DATABASES) | (1L << DATE) | (1L << DEDUPLICATE) | (1L << DEFAULT) | (1L << DELAY) | (1L << DELETE) | (1L << DESC) | (1L << DESCENDING) | (1L << DESCRIBE) | (1L << DETACH) | (1L << DICTIONARIES) | (1L << DICTIONARY) | (1L << DISK) | (1L << DISTRIBUTED) | (1L << DROP) | (1L << ELSE) | (1L << END) | (1L << ENGINE) | (1L << EVENTS) | (1L << EXISTS) | (1L << EXPLAIN) | (1L << EXPRESSION) | (1L << EXTRACT) | (1L << FETCHES) | (1L << FIRST) | (1L << FLUSH) | (1L << FOLLOWING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FREEZE - 64)) | (1L << (FUNCTION - 64)) | (1L << (GRANULARITY - 64)) | (1L << (HIERARCHICAL - 64)) | (1L << (ID - 64)) | (1L << (IF - 64)) | (1L << (INDEX - 64)) | (1L << (INJECTIVE - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (IS_OBJECT_ID - 64)) | (1L << (KEY - 64)) | (1L << (KILL - 64)) | (1L << (LAST - 64)) | (1L << (LAYOUT - 64)) | (1L << (LEADING - 64)) | (1L << (LIFETIME - 64)) | (1L << (LIVE - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGS - 64)) | (1L << (MATERIALIZE - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MAX - 64)) | (1L << (MERGES - 64)) | (1L << (MIN - 64)) | (1L << (MODIFY - 64)) | (1L << (MOVE - 64)) | (1L << (MUTATION - 64)) | (1L << (NO - 64)) | (1L << (NULLS - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (OUTER - 64)) | (1L << (OUTFILE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (POPULATE - 64)) | (1L << (PRECEDING - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (PRIMARY - 129)) | (1L << (RANGE - 129)) | (1L << (RELOAD - 129)) | (1L << (REMOVE - 129)) | (1L << (RENAME - 129)) | (1L << (REPLACE - 129)) | (1L << (REPLICA - 129)) | (1L << (REPLICATED - 129)) | (1L << (ROLLUP - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SELECT - 129)) | (1L << (SENDS - 129)) | (1L << (SET - 129)) | (1L << (SHOW - 129)) | (1L << (SOURCE - 129)) | (1L << (START - 129)) | (1L << (STOP - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYNC - 129)) | (1L << (SYNTAX - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLE - 129)) | (1L << (TABLES - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEST - 129)) | (1L << (THEN - 129)) | (1L << (TIES - 129)) | (1L << (TIMEOUT - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TOTALS - 129)) | (1L << (TRAILING - 129)) | (1L << (TRIM - 129)) | (1L << (TRUNCATE - 129)) | (1L << (TTL - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UPDATE - 129)) | (1L << (USE - 129)) | (1L << (UUID - 129)) | (1L << (VALUES - 129)) | (1L << (VIEW - 129)) | (1L << (VOLUME - 129)) | (1L << (WATCH - 129)) | (1L << (WHEN - 129)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AliasContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ClickHouseParser.IDENTIFIER, 0);
        }

        public KeywordForAliasContext keywordForAlias() {
            return getRuleContext(KeywordForAliasContext.class, 0);
        }

        public AliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).enterAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitAlias(this);
        }
    }

    public final AliasContext alias() throws RecognitionException {
        AliasContext _localctx = new AliasContext(_ctx, getState());
        enterRule(_localctx, 234, RULE_alias);
        try {
            setState(2072);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2070);
                    match(IDENTIFIER);
                }
                break;
                case AFTER:
                case ALIAS:
                case ALTER:
                case ASCENDING:
                case AST:
                case ASYNC:
                case ATTACH:
                case BOTH:
                case BY:
                case CASE:
                case CAST:
                case CHECK:
                case CLEAR:
                case CLUSTER:
                case CODEC:
                case COLLATE:
                case COLUMN:
                case COMMENT:
                case CONSTRAINT:
                case CREATE:
                case CUBE:
                case CURRENT:
                case DATABASE:
                case DATABASES:
                case DATE:
                case DEDUPLICATE:
                case DEFAULT:
                case DELAY:
                case DELETE:
                case DESC:
                case DESCENDING:
                case DESCRIBE:
                case DETACH:
                case DICTIONARIES:
                case DICTIONARY:
                case DISK:
                case DISTRIBUTED:
                case DROP:
                case ELSE:
                case END:
                case ENGINE:
                case EVENTS:
                case EXISTS:
                case EXPLAIN:
                case EXPRESSION:
                case EXTRACT:
                case FETCHES:
                case FIRST:
                case FLUSH:
                case FOLLOWING:
                case FOR:
                case FREEZE:
                case FUNCTION:
                case GRANULARITY:
                case HIERARCHICAL:
                case ID:
                case IF:
                case INDEX:
                case INJECTIVE:
                case INSERT:
                case INTERVAL:
                case IS_OBJECT_ID:
                case KEY:
                case KILL:
                case LAST:
                case LAYOUT:
                case LEADING:
                case LIFETIME:
                case LIVE:
                case LOCAL:
                case LOGS:
                case MATERIALIZE:
                case MATERIALIZED:
                case MAX:
                case MERGES:
                case MIN:
                case MODIFY:
                case MOVE:
                case MUTATION:
                case NO:
                case NULLS:
                case OPTIMIZE:
                case OUTER:
                case OUTFILE:
                case OVER:
                case PARTITION:
                case POPULATE:
                case PRECEDING:
                case PRIMARY:
                case RANGE:
                case RELOAD:
                case REMOVE:
                case RENAME:
                case REPLACE:
                case REPLICA:
                case REPLICATED:
                case ROLLUP:
                case ROW:
                case ROWS:
                case SELECT:
                case SENDS:
                case SET:
                case SHOW:
                case SOURCE:
                case START:
                case STOP:
                case SUBSTRING:
                case SYNC:
                case SYNTAX:
                case SYSTEM:
                case TABLE:
                case TABLES:
                case TEMPORARY:
                case TEST:
                case THEN:
                case TIES:
                case TIMEOUT:
                case TIMESTAMP:
                case TO:
                case TOTALS:
                case TRAILING:
                case TRIM:
                case TRUNCATE:
                case TTL:
                case TYPE:
                case UNBOUNDED:
                case UPDATE:
                case USE:
                case UUID:
                case VALUES:
                case VIEW:
                case VOLUME:
                case WATCH:
                case WHEN:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2071);
                    keywordForAlias();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdentifierContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(ClickHouseParser.IDENTIFIER, 0);
        }

        public IntervalContext interval() {
            return getRuleContext(IntervalContext.class, 0);
        }

        public KeywordContext keyword() {
            return getRuleContext(KeywordContext.class, 0);
        }

        public IdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitIdentifier(this);
        }
    }

    public final IdentifierContext identifier() throws RecognitionException {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 236, RULE_identifier);
        try {
            setState(2077);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2074);
                    match(IDENTIFIER);
                }
                break;
                case DAY:
                case HOUR:
                case MINUTE:
                case MONTH:
                case QUARTER:
                case SECOND:
                case WEEK:
                case YEAR:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2075);
                    interval();
                }
                break;
                case AFTER:
                case ALIAS:
                case ALL:
                case ALTER:
                case AND:
                case ANTI:
                case ANY:
                case ARRAY:
                case AS:
                case ASCENDING:
                case ASOF:
                case AST:
                case ASYNC:
                case ATTACH:
                case BETWEEN:
                case BOTH:
                case BY:
                case CASE:
                case CAST:
                case CHECK:
                case CLEAR:
                case CLUSTER:
                case CODEC:
                case COLLATE:
                case COLUMN:
                case COMMENT:
                case CONSTRAINT:
                case CREATE:
                case CROSS:
                case CUBE:
                case CURRENT:
                case DATABASE:
                case DATABASES:
                case DATE:
                case DEDUPLICATE:
                case DEFAULT:
                case DELAY:
                case DELETE:
                case DESC:
                case DESCENDING:
                case DESCRIBE:
                case DETACH:
                case DICTIONARIES:
                case DICTIONARY:
                case DISK:
                case DISTINCT:
                case DISTRIBUTED:
                case DROP:
                case ELSE:
                case END:
                case ENGINE:
                case EVENTS:
                case EXISTS:
                case EXPLAIN:
                case EXPRESSION:
                case EXTRACT:
                case FETCHES:
                case FINAL:
                case FIRST:
                case FLUSH:
                case FOLLOWING:
                case FOR:
                case FORMAT:
                case FREEZE:
                case FROM:
                case FULL:
                case FUNCTION:
                case GLOBAL:
                case GRANULARITY:
                case GROUP:
                case HAVING:
                case HIERARCHICAL:
                case ID:
                case IF:
                case ILIKE:
                case IN:
                case INDEX:
                case INJECTIVE:
                case INNER:
                case INSERT:
                case INTERVAL:
                case INTO:
                case IS:
                case IS_OBJECT_ID:
                case JOIN:
                case KEY:
                case KILL:
                case LAST:
                case LAYOUT:
                case LEADING:
                case LEFT:
                case LIFETIME:
                case LIKE:
                case LIMIT:
                case LIVE:
                case LOCAL:
                case LOGS:
                case MATERIALIZE:
                case MATERIALIZED:
                case MAX:
                case MERGES:
                case MIN:
                case MODIFY:
                case MOVE:
                case MUTATION:
                case NO:
                case NOT:
                case NULLS:
                case OFFSET:
                case ON:
                case OPTIMIZE:
                case OR:
                case ORDER:
                case OUTER:
                case OUTFILE:
                case OVER:
                case PARTITION:
                case POPULATE:
                case PRECEDING:
                case PREWHERE:
                case PRIMARY:
                case RANGE:
                case RELOAD:
                case REMOVE:
                case RENAME:
                case REPLACE:
                case REPLICA:
                case REPLICATED:
                case RIGHT:
                case ROLLUP:
                case ROW:
                case ROWS:
                case SAMPLE:
                case SELECT:
                case SEMI:
                case SENDS:
                case SET:
                case SETTINGS:
                case SHOW:
                case SOURCE:
                case START:
                case STOP:
                case SUBSTRING:
                case SYNC:
                case SYNTAX:
                case SYSTEM:
                case TABLE:
                case TABLES:
                case TEMPORARY:
                case TEST:
                case THEN:
                case TIES:
                case TIMEOUT:
                case TIMESTAMP:
                case TO:
                case TOP:
                case TOTALS:
                case TRAILING:
                case TRIM:
                case TRUNCATE:
                case TTL:
                case TYPE:
                case UNBOUNDED:
                case UNION:
                case UPDATE:
                case USE:
                case USING:
                case UUID:
                case VALUES:
                case VIEW:
                case VOLUME:
                case WATCH:
                case WHEN:
                case WHERE:
                case WINDOW:
                case WITH:
                case JSON_FALSE:
                case JSON_TRUE:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(2076);
                    keyword();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdentifierOrNullContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode NULL_SQL() {
            return getToken(ClickHouseParser.NULL_SQL, 0);
        }

        public IdentifierOrNullContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierOrNull;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterIdentifierOrNull(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).exitIdentifierOrNull(this);
        }
    }

    public final IdentifierOrNullContext identifierOrNull() throws RecognitionException {
        IdentifierOrNullContext _localctx = new IdentifierOrNullContext(_ctx, getState());
        enterRule(_localctx, 238, RULE_identifierOrNull);
        try {
            setState(2081);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AFTER:
                case ALIAS:
                case ALL:
                case ALTER:
                case AND:
                case ANTI:
                case ANY:
                case ARRAY:
                case AS:
                case ASCENDING:
                case ASOF:
                case AST:
                case ASYNC:
                case ATTACH:
                case BETWEEN:
                case BOTH:
                case BY:
                case CASE:
                case CAST:
                case CHECK:
                case CLEAR:
                case CLUSTER:
                case CODEC:
                case COLLATE:
                case COLUMN:
                case COMMENT:
                case CONSTRAINT:
                case CREATE:
                case CROSS:
                case CUBE:
                case CURRENT:
                case DATABASE:
                case DATABASES:
                case DATE:
                case DAY:
                case DEDUPLICATE:
                case DEFAULT:
                case DELAY:
                case DELETE:
                case DESC:
                case DESCENDING:
                case DESCRIBE:
                case DETACH:
                case DICTIONARIES:
                case DICTIONARY:
                case DISK:
                case DISTINCT:
                case DISTRIBUTED:
                case DROP:
                case ELSE:
                case END:
                case ENGINE:
                case EVENTS:
                case EXISTS:
                case EXPLAIN:
                case EXPRESSION:
                case EXTRACT:
                case FETCHES:
                case FINAL:
                case FIRST:
                case FLUSH:
                case FOLLOWING:
                case FOR:
                case FORMAT:
                case FREEZE:
                case FROM:
                case FULL:
                case FUNCTION:
                case GLOBAL:
                case GRANULARITY:
                case GROUP:
                case HAVING:
                case HIERARCHICAL:
                case HOUR:
                case ID:
                case IF:
                case ILIKE:
                case IN:
                case INDEX:
                case INJECTIVE:
                case INNER:
                case INSERT:
                case INTERVAL:
                case INTO:
                case IS:
                case IS_OBJECT_ID:
                case JOIN:
                case KEY:
                case KILL:
                case LAST:
                case LAYOUT:
                case LEADING:
                case LEFT:
                case LIFETIME:
                case LIKE:
                case LIMIT:
                case LIVE:
                case LOCAL:
                case LOGS:
                case MATERIALIZE:
                case MATERIALIZED:
                case MAX:
                case MERGES:
                case MIN:
                case MINUTE:
                case MODIFY:
                case MONTH:
                case MOVE:
                case MUTATION:
                case NO:
                case NOT:
                case NULLS:
                case OFFSET:
                case ON:
                case OPTIMIZE:
                case OR:
                case ORDER:
                case OUTER:
                case OUTFILE:
                case OVER:
                case PARTITION:
                case POPULATE:
                case PRECEDING:
                case PREWHERE:
                case PRIMARY:
                case QUARTER:
                case RANGE:
                case RELOAD:
                case REMOVE:
                case RENAME:
                case REPLACE:
                case REPLICA:
                case REPLICATED:
                case RIGHT:
                case ROLLUP:
                case ROW:
                case ROWS:
                case SAMPLE:
                case SECOND:
                case SELECT:
                case SEMI:
                case SENDS:
                case SET:
                case SETTINGS:
                case SHOW:
                case SOURCE:
                case START:
                case STOP:
                case SUBSTRING:
                case SYNC:
                case SYNTAX:
                case SYSTEM:
                case TABLE:
                case TABLES:
                case TEMPORARY:
                case TEST:
                case THEN:
                case TIES:
                case TIMEOUT:
                case TIMESTAMP:
                case TO:
                case TOP:
                case TOTALS:
                case TRAILING:
                case TRIM:
                case TRUNCATE:
                case TTL:
                case TYPE:
                case UNBOUNDED:
                case UNION:
                case UPDATE:
                case USE:
                case USING:
                case UUID:
                case VALUES:
                case VIEW:
                case VOLUME:
                case WATCH:
                case WEEK:
                case WHEN:
                case WHERE:
                case WINDOW:
                case WITH:
                case YEAR:
                case JSON_FALSE:
                case JSON_TRUE:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(2079);
                    identifier();
                }
                break;
                case NULL_SQL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(2080);
                    match(NULL_SQL);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnumValueContext extends ParserRuleContext {
        public TerminalNode STRING_LITERAL() {
            return getToken(ClickHouseParser.STRING_LITERAL, 0);
        }

        public TerminalNode EQ_SINGLE() {
            return getToken(ClickHouseParser.EQ_SINGLE, 0);
        }

        public NumberLiteralContext numberLiteral() {
            return getRuleContext(NumberLiteralContext.class, 0);
        }

        public EnumValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enumValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener)
                ((ClickHouseParserListener) listener).enterEnumValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ClickHouseParserListener) ((ClickHouseParserListener) listener).exitEnumValue(this);
        }
    }

    public final EnumValueContext enumValue() throws RecognitionException {
        EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
        enterRule(_localctx, 240, RULE_enumValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2083);
                match(STRING_LITERAL);
                setState(2084);
                match(EQ_SINGLE);
                setState(2085);
                numberLiteral();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 15:
                return dictionaryAttrDfnt_sempred((DictionaryAttrDfntContext) _localctx, predIndex);
            case 16:
                return dictionaryEngineClause_sempred((DictionaryEngineClauseContext) _localctx, predIndex);
            case 29:
                return engineClause_sempred((EngineClauseContext) _localctx, predIndex);
            case 73:
                return joinExpr_sempred((JoinExprContext) _localctx, predIndex);
            case 99:
                return columnExpr_sempred((ColumnExprContext) _localctx, predIndex);
            case 105:
                return tableExpr_sempred((TableExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean dictionaryAttrDfnt_sempred(DictionaryAttrDfntContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return !_localctx.attrs.contains("default");
            case 1:
                return !_localctx.attrs.contains("expression");
            case 2:
                return !_localctx.attrs.contains("hierarchical");
            case 3:
                return !_localctx.attrs.contains("injective");
            case 4:
                return !_localctx.attrs.contains("is_object_id");
        }
        return true;
    }

    private boolean dictionaryEngineClause_sempred(DictionaryEngineClauseContext _localctx, int predIndex) {
        switch (predIndex) {
            case 5:
                return !_localctx.clauses.contains("source");
            case 6:
                return !_localctx.clauses.contains("lifetime");
            case 7:
                return !_localctx.clauses.contains("layout");
            case 8:
                return !_localctx.clauses.contains("range");
            case 9:
                return !_localctx.clauses.contains("settings");
        }
        return true;
    }

    private boolean engineClause_sempred(EngineClauseContext _localctx, int predIndex) {
        switch (predIndex) {
            case 10:
                return !_localctx.clauses.contains("orderByClause");
            case 11:
                return !_localctx.clauses.contains("partitionByClause");
            case 12:
                return !_localctx.clauses.contains("primaryKeyClause");
            case 13:
                return !_localctx.clauses.contains("sampleByClause");
            case 14:
                return !_localctx.clauses.contains("ttlClause");
            case 15:
                return !_localctx.clauses.contains("settingsClause");
        }
        return true;
    }

    private boolean joinExpr_sempred(JoinExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 16:
                return precpred(_ctx, 3);
            case 17:
                return precpred(_ctx, 4);
        }
        return true;
    }

    private boolean columnExpr_sempred(ColumnExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 18:
                return precpred(_ctx, 16);
            case 19:
                return precpred(_ctx, 15);
            case 20:
                return precpred(_ctx, 14);
            case 21:
                return precpred(_ctx, 11);
            case 22:
                return precpred(_ctx, 10);
            case 23:
                return precpred(_ctx, 9);
            case 24:
                return precpred(_ctx, 8);
            case 25:
                return precpred(_ctx, 19);
            case 26:
                return precpred(_ctx, 18);
            case 27:
                return precpred(_ctx, 13);
            case 28:
                return precpred(_ctx, 7);
        }
        return true;
    }

    private boolean tableExpr_sempred(TableExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 29:
                return precpred(_ctx, 1);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e8\u082a\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" +
                    "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t" +
                    "k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4" +
                    "w\tw\4x\tx\4y\ty\4z\tz\3\2\3\2\3\2\3\2\5\2\u00f9\n\2\3\2\3\2\5\2\u00fd" +
                    "\n\2\3\2\5\2\u0100\n\2\3\2\5\2\u0103\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0118\n\3\3\3\5\3\u011b" +
                    "\n\3\3\4\3\4\3\4\3\4\7\4\u0121\n\4\f\4\16\4\u0124\13\4\3\5\3\5\5\5\u0128" +
                    "\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0133\n\6\f\6\16\6\u0136" +
                    "\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u013e\n\7\3\7\3\7\3\7\7\7\u0143\n\7" +
                    "\f\7\16\7\u0146\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u014d\n\b\3\b\3\b\3\b\5\b" +
                    "\u0152\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0159\n\b\3\b\3\b\3\b\5\b\u015e\n\b" +
                    "\3\b\3\b\3\b\3\b\3\b\5\b\u0165\n\b\3\b\3\b\3\b\5\b\u016a\n\b\3\b\3\b\3" +
                    "\b\3\b\5\b\u0170\n\b\3\b\3\b\3\b\3\b\5\b\u0176\n\b\3\b\3\b\3\b\5\b\u017b" +
                    "\n\b\3\b\3\b\3\b\3\b\5\b\u0181\n\b\3\b\3\b\3\b\5\b\u0186\n\b\3\b\3\b\3" +
                    "\b\3\b\5\b\u018c\n\b\3\b\3\b\3\b\5\b\u0191\n\b\3\b\3\b\3\b\3\b\5\b\u0197" +
                    "\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01a5\n\b\3\b" +
                    "\3\b\3\b\3\b\3\b\5\b\u01ac\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b3\n\b\3\b\3" +
                    "\b\3\b\3\b\3\b\5\b\u01ba\n\b\3\b\3\b\3\b\3\b\5\b\u01c0\n\b\3\b\3\b\3\b" +
                    "\5\b\u01c5\n\b\3\b\3\b\3\b\3\b\5\b\u01cb\n\b\3\b\3\b\3\b\5\b\u01d0\n\b" +
                    "\3\b\3\b\3\b\3\b\5\b\u01d6\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01df\n" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e9\n\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\3\b\3\b\5\b\u01f3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0207\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u020f" +
                    "\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u021e\n\b" +
                    "\3\t\3\t\3\t\7\t\u0223\n\t\f\t\16\t\u0226\13\t\3\n\3\n\3\n\3\n\3\13\3" +
                    "\13\3\f\3\f\3\f\3\f\3\f\5\f\u0233\n\f\3\r\3\r\3\r\3\r\5\r\u0239\n\r\3" +
                    "\16\3\16\3\16\3\16\5\16\u023f\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0246" +
                    "\n\17\3\17\3\17\5\17\u024a\n\17\3\17\5\17\u024d\n\17\3\17\3\17\3\17\3" +
                    "\17\5\17\u0253\n\17\3\17\5\17\u0256\n\17\3\17\3\17\3\17\3\17\5\17\u025c" +
                    "\n\17\3\17\3\17\5\17\u0260\n\17\3\17\5\17\u0263\n\17\3\17\3\17\3\17\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\5\17\u026e\n\17\3\17\3\17\5\17\u0272\n\17" +
                    "\3\17\5\17\u0275\n\17\3\17\3\17\3\17\5\17\u027a\n\17\5\17\u027c\n\17\3" +
                    "\17\5\17\u027f\n\17\3\17\5\17\u0282\n\17\3\17\3\17\3\17\3\17\3\17\3\17" +
                    "\3\17\3\17\5\17\u028c\n\17\3\17\3\17\5\17\u0290\n\17\3\17\5\17\u0293\n" +
                    "\17\3\17\5\17\u0296\n\17\3\17\3\17\3\17\5\17\u029b\n\17\5\17\u029d\n\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u02a5\n\17\3\17\5\17\u02a8\n\17\3" +
                    "\17\5\17\u02ab\n\17\3\17\3\17\3\17\3\17\5\17\u02b1\n\17\3\17\3\17\5\17" +
                    "\u02b5\n\17\3\17\5\17\u02b8\n\17\3\17\5\17\u02bb\n\17\3\17\5\17\u02be" +
                    "\n\17\3\17\5\17\u02c1\n\17\3\17\3\17\3\17\5\17\u02c6\n\17\3\17\3\17\3" +
                    "\17\3\17\5\17\u02cc\n\17\3\17\3\17\5\17\u02d0\n\17\3\17\5\17\u02d3\n\17" +
                    "\3\17\5\17\u02d6\n\17\3\17\3\17\5\17\u02da\n\17\3\20\3\20\3\20\3\20\7" +
                    "\20\u02e0\n\20\f\20\16\20\u02e3\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3" +
                    "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
                    "\21\3\21\3\21\7\21\u02fc\n\21\f\21\16\21\u02ff\13\21\3\22\5\22\u0302\n" +
                    "\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3" +
                    "\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0318\n\22\f\22\16\22\u031b\13" +
                    "\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0325\n\24\3\24\5\24" +
                    "\u0328\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u032f\n\25\f\25\16\25\u0332" +
                    "\13\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26" +
                    "\3\26\5\26\u0342\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u034b\n" +
                    "\27\f\27\16\27\u034e\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u035f\n\30\3\30\3\30\3\31\3\31\3\31" +
                    "\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u036c\n\32\3\33\3\33\3\33\3\34\3\34" +
                    "\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u037b\n\36\f\36\16\36\u037e" +
                    "\13\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0386\n\36\3\37\3\37\3\37\3" +
                    "\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3" +
                    "\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u03a1\n\37\f\37\16\37\u03a4" +
                    "\13\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u03b6\n" +
                    "#\f#\16#\u03b9\13#\3$\3$\5$\u03bd\n$\3$\3$\3$\5$\u03c2\n$\3$\5$\u03c5" +
                    "\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03d1\n%\3&\3&\3&\5&\u03d6\n&\3&" +
                    "\3&\5&\u03da\n&\3&\5&\u03dd\n&\3&\3&\5&\u03e1\n&\3&\3&\5&\u03e5\n&\3&" +
                    "\3&\3&\5&\u03ea\n&\3&\5&\u03ed\n&\3&\3&\5&\u03f1\n&\5&\u03f3\n&\3\'\3" +
                    "\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\7*\u0407\n*\f*\16" +
                    "*\u040a\13*\3*\3*\3+\3+\3+\5+\u0411\n+\3+\5+\u0414\n+\3,\3,\3,\3,\3,\3" +
                    ",\3,\3,\5,\u041e\n,\3-\3-\5-\u0422\n-\3-\3-\3.\3.\3.\3.\5.\u042a\n.\3" +
                    ".\3.\5.\u042e\n.\3.\3.\3.\5.\u0433\n.\3.\3.\5.\u0437\n.\3.\3.\5.\u043b" +
                    "\n.\3.\3.\5.\u043f\n.\3.\3.\5.\u0443\n.\5.\u0445\n.\3/\3/\3/\3/\3/\3/" +
                    "\5/\u044d\n/\3/\3/\5/\u0451\n/\3/\5/\u0454\n/\3\60\3\60\3\60\3\60\3\60" +
                    "\3\60\5\60\u045c\n\60\3\61\3\61\3\61\5\61\u0461\n\61\3\61\3\61\3\61\5" +
                    "\61\u0466\n\61\3\61\5\61\u0469\n\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62" +
                    "\u0471\n\62\f\62\16\62\u0474\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63" +
                    "\3\63\7\63\u047e\n\63\f\63\16\63\u0481\13\63\3\63\3\63\5\63\u0485\n\63" +
                    "\3\63\3\63\5\63\u0489\n\63\3\64\3\64\3\64\3\64\7\64\u048f\n\64\f\64\16" +
                    "\64\u0492\13\64\3\64\3\64\3\64\3\64\5\64\u0498\n\64\3\65\3\65\3\66\3\66" +
                    "\3\66\5\66\u049f\n\66\3\66\3\66\5\66\u04a3\n\66\3\67\3\67\3\67\3\67\5" +
                    "\67\u04a9\n\67\3\67\5\67\u04ac\n\67\3\67\5\67\u04af\n\67\3\67\5\67\u04b2" +
                    "\n\67\38\38\38\38\38\38\38\38\38\38\78\u04be\n8\f8\168\u04c1\138\38\5" +
                    "8\u04c4\n8\39\39\59\u04c8\n9\39\39\39\59\u04cd\n9\39\59\u04d0\n9\39\3" +
                    "9\3:\3:\3:\3:\7:\u04d8\n:\f:\16:\u04db\13:\3;\3;\3;\3;\3;\5;\u04e2\n;" +
                    "\3<\5<\u04e5\n<\3<\3<\5<\u04e9\n<\3<\5<\u04ec\n<\3<\3<\5<\u04f0\n<\3<" +
                    "\5<\u04f3\n<\3<\5<\u04f6\n<\3<\5<\u04f9\n<\3<\5<\u04fc\n<\3<\5<\u04ff" +
                    "\n<\3<\3<\5<\u0503\n<\3<\3<\5<\u0507\n<\3<\5<\u050a\n<\3<\5<\u050d\n<" +
                    "\3<\5<\u0510\n<\3<\5<\u0513\n<\3<\5<\u0516\n<\3=\3=\3=\3>\3>\3>\3>\5>" +
                    "\u051f\n>\3?\3?\3?\3@\5@\u0525\n@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B" +
                    "\3B\3B\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0540\nD\3E\3E\3E\3F\3F\3F" +
                    "\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\5I\u0556\nI\3J\3J\3J\3K\3K" +
                    "\3K\5K\u055e\nK\3K\5K\u0561\nK\3K\3K\3K\3K\5K\u0567\nK\3K\3K\3K\3K\3K" +
                    "\3K\5K\u056f\nK\3K\5K\u0572\nK\3K\3K\3K\3K\7K\u0578\nK\fK\16K\u057b\13" +
                    "K\3L\5L\u057e\nL\3L\3L\3L\5L\u0583\nL\3L\5L\u0586\nL\3L\5L\u0589\nL\3" +
                    "L\3L\5L\u058d\nL\3L\3L\5L\u0591\nL\3L\5L\u0594\nL\5L\u0596\nL\3L\5L\u0599" +
                    "\nL\3L\3L\5L\u059d\nL\3L\3L\5L\u05a1\nL\3L\5L\u05a4\nL\5L\u05a6\nL\5L" +
                    "\u05a8\nL\3M\5M\u05ab\nM\3M\3M\3M\5M\u05b0\nM\3N\3N\3N\3N\3N\3N\3N\3N" +
                    "\3N\5N\u05bb\nN\3O\3O\3O\3O\5O\u05c1\nO\3P\3P\3P\5P\u05c6\nP\3Q\3Q\3Q" +
                    "\7Q\u05cb\nQ\fQ\16Q\u05ce\13Q\3R\3R\5R\u05d2\nR\3R\3R\5R\u05d6\nR\3R\3" +
                    "R\5R\u05da\nR\3S\3S\3S\5S\u05df\nS\3T\3T\3T\7T\u05e4\nT\fT\16T\u05e7\13" +
                    "T\3U\3U\3U\3U\3V\5V\u05ee\nV\3V\5V\u05f1\nV\3V\5V\u05f4\nV\3W\3W\3W\3" +
                    "W\3X\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0607\nZ\3[\3[\3[\3[\3[\3" +
                    "[\3[\3[\3[\3[\3[\3[\5[\u0615\n[\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3" +
                    "]\3]\3]\5]\u0625\n]\3]\5]\u0628\n]\3]\3]\3]\3]\3]\3]\3]\5]\u0631\n]\3" +
                    "]\3]\5]\u0635\n]\3]\3]\3]\5]\u063a\n]\3]\3]\3]\5]\u063f\n]\3]\5]\u0642" +
                    "\n]\5]\u0644\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^" +
                    "\3^\3^\5^\u065a\n^\3^\5^\u065d\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0668" +
                    "\n^\3_\3_\5_\u066c\n_\3_\5_\u066f\n_\3_\3_\5_\u0673\n_\3_\3_\5_\u0677" +
                    "\n_\3`\3`\3`\3a\3a\3a\5a\u067f\na\3a\3a\5a\u0683\na\3b\3b\3b\3b\3b\3b" +
                    "\3b\3b\3b\7b\u068e\nb\fb\16b\u0691\13b\3b\3b\3b\3b\3b\3b\3b\7b\u069a\n" +
                    "b\fb\16b\u069d\13b\3b\3b\3b\3b\3b\3b\3b\7b\u06a6\nb\fb\16b\u06a9\13b\3" +
                    "b\3b\3b\3b\3b\5b\u06b0\nb\3b\3b\5b\u06b4\nb\3c\3c\3c\7c\u06b9\nc\fc\16" +
                    "c\u06bc\13c\3d\3d\3d\5d\u06c1\nd\3d\3d\3d\3d\3d\3d\5d\u06c9\nd\3e\3e\3" +
                    "e\5e\u06ce\ne\3e\3e\3e\3e\3e\6e\u06d5\ne\re\16e\u06d6\3e\3e\5e\u06db\n" +
                    "e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3" +
                    "e\3e\3e\3e\3e\3e\3e\5e\u06fa\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3" +
                    "e\3e\3e\5e\u070b\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0717\ne\3e\3e\3" +
                    "e\3e\3e\3e\3e\3e\5e\u0721\ne\3e\5e\u0724\ne\3e\3e\5e\u0728\ne\3e\5e\u072b" +
                    "\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0737\ne\3e\3e\3e\3e\3e\3e\3e\3e" +
                    "\3e\3e\3e\3e\3e\3e\3e\5e\u0748\ne\3e\3e\5e\u074c\ne\3e\3e\3e\3e\3e\3e" +
                    "\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u075d\ne\3e\5e\u0760\ne\3e\3e\5e\u0764" +
                    "\ne\3e\5e\u0767\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0772\ne\3e\3e\3e\3e" +
                    "\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u078a\ne\3e" +
                    "\3e\3e\3e\3e\5e\u0791\ne\7e\u0793\ne\fe\16e\u0796\13e\3f\3f\3f\7f\u079b" +
                    "\nf\ff\16f\u079e\13f\3g\3g\5g\u07a2\ng\3h\3h\3h\3h\7h\u07a8\nh\fh\16h" +
                    "\u07ab\13h\3h\3h\3h\3h\3h\7h\u07b2\nh\fh\16h\u07b5\13h\5h\u07b7\nh\3h" +
                    "\3h\3h\3i\3i\3i\5i\u07bf\ni\3i\3i\3j\3j\3j\5j\u07c6\nj\3k\3k\3k\3k\3k" +
                    "\3k\3k\5k\u07cf\nk\3k\3k\3k\3k\5k\u07d5\nk\7k\u07d7\nk\fk\16k\u07da\13" +
                    "k\3l\3l\3l\5l\u07df\nl\3l\3l\3m\3m\3m\5m\u07e6\nm\3m\3m\3n\3n\3n\7n\u07ed" +
                    "\nn\fn\16n\u07f0\13n\3o\3o\3o\5o\u07f5\no\3p\3p\3q\3q\3q\3q\3q\3q\5q\u07ff" +
                    "\nq\5q\u0801\nq\3r\5r\u0804\nr\3r\3r\3r\3r\3r\3r\5r\u080c\nr\3s\3s\3s" +
                    "\5s\u0811\ns\3t\3t\3u\3u\3v\3v\3w\3w\5w\u081b\nw\3x\3x\3x\5x\u0820\nx" +
                    "\3y\3y\5y\u0824\ny\3z\3z\3z\3z\3z\2\5\u0094\u00c8\u00d4{\2\4\6\b\n\f\16" +
                    "\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd" +
                    "fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092" +
                    "\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa" +
                    "\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2" +
                    "\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da" +
                    "\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2" +
                    "\2\36\b\2\5\5\32\32\35\35((ii\u00ae\u00ae\4\2\21\21\37\37\5\2\5\5((ii" +
                    "\4\2++--\4\2..\64\64\5\2\20\20\u009d\u009d\u00a3\u00a3\4\2!!\u008e\u008e" +
                    "\4\2UUaa\4\2HHff\5\2\6\6\n\n\16\16\6\2\6\6\t\n\16\16\u0094\u0094\4\2a" +
                    "a\u008d\u008d\4\2\6\6\n\n\4\2ww\u00cd\u00cd\4\2\r\r+,\4\2??^^\4\2\u0086" +
                    "\u0086\u0090\u0090\4\2EEQQ\3\2\u009a\u009b\5\2\23\23``\u00ab\u00ab\5\2" +
                    "\u00c9\u00c9\u00db\u00db\u00e4\u00e4\4\2\u00ce\u00cf\u00dc\u00dc\4\2P" +
                    "Pcc\3\2\u00c4\u00c5\4\2\u00cf\u00cf\u00dc\u00dc\n\2&&MMmmoo\u0085\u0085" +
                    "\u0092\u0092\u00ba\u00ba\u00bf\u00bf\16\2\4%\'LNRTlnnpqstv\u0083\u0086" +
                    "\u0091\u0093\u00b9\u00bb\u00be\u00c0\u00c1\'\2\4\5\7\7\r\r\17\21\23\37" +
                    "!%\'\61\63=?BDDGGIILLNORRTTVWZZ\\`bbelnnpqssvvyy|\u0081\u0083\u0083\u0086" +
                    "\u008c\u008e\u0090\u0093\u0093\u0095\u0096\u0098\u00a8\u00aa\u00b0\u00b2" +
                    "\u00b3\u00b5\u00b9\u00bb\u00bb\2\u094a\2\u0102\3\2\2\2\4\u011a\3\2\2\2" +
                    "\6\u011c\3\2\2\2\b\u0125\3\2\2\2\n\u012e\3\2\2\2\f\u0139\3\2\2\2\16\u021d" +
                    "\3\2\2\2\20\u021f\3\2\2\2\22\u0227\3\2\2\2\24\u022b\3\2\2\2\26\u0232\3" +
                    "\2\2\2\30\u0234\3\2\2\2\32\u023a\3\2\2\2\34\u02d9\3\2\2\2\36\u02db\3\2" +
                    "\2\2 \u02e6\3\2\2\2\"\u0301\3\2\2\2$\u031c\3\2\2\2&\u0320\3\2\2\2(\u0329" +
                    "\3\2\2\2*\u0336\3\2\2\2,\u0345\3\2\2\2.\u0352\3\2\2\2\60\u0362\3\2\2\2" +
                    "\62\u0367\3\2\2\2\64\u036d\3\2\2\2\66\u0370\3\2\2\28\u0373\3\2\2\2:\u0385" +
                    "\3\2\2\2<\u0387\3\2\2\2>\u03a5\3\2\2\2@\u03a9\3\2\2\2B\u03ad\3\2\2\2D" +
                    "\u03b1\3\2\2\2F\u03ba\3\2\2\2H\u03d0\3\2\2\2J\u03f2\3\2\2\2L\u03f4\3\2" +
                    "\2\2N\u03f7\3\2\2\2P\u03fe\3\2\2\2R\u0401\3\2\2\2T\u040d\3\2\2\2V\u0415" +
                    "\3\2\2\2X\u041f\3\2\2\2Z\u0444\3\2\2\2\\\u0453\3\2\2\2^\u045b\3\2\2\2" +
                    "`\u045d\3\2\2\2b\u046c\3\2\2\2d\u0488\3\2\2\2f\u0497\3\2\2\2h\u0499\3" +
                    "\2\2\2j\u049b\3\2\2\2l\u04a4\3\2\2\2n\u04b3\3\2\2\2p\u04c5\3\2\2\2r\u04d3" +
                    "\3\2\2\2t\u04e1\3\2\2\2v\u04e4\3\2\2\2x\u0517\3\2\2\2z\u051a\3\2\2\2|" +
                    "\u0520\3\2\2\2~\u0524\3\2\2\2\u0080\u052a\3\2\2\2\u0082\u0531\3\2\2\2" +
                    "\u0084\u0534\3\2\2\2\u0086\u0537\3\2\2\2\u0088\u0541\3\2\2\2\u008a\u0544" +
                    "\3\2\2\2\u008c\u0548\3\2\2\2\u008e\u054c\3\2\2\2\u0090\u0551\3\2\2\2\u0092" +
                    "\u0557\3\2\2\2\u0094\u0566\3\2\2\2\u0096\u05a7\3\2\2\2\u0098\u05af\3\2" +
                    "\2\2\u009a\u05ba\3\2\2\2\u009c\u05bc\3\2\2\2\u009e\u05c2\3\2\2\2\u00a0" +
                    "\u05c7\3\2\2\2\u00a2\u05cf\3\2\2\2\u00a4\u05db\3\2\2\2\u00a6\u05e0\3\2" +
                    "\2\2\u00a8\u05e8\3\2\2\2\u00aa\u05ed\3\2\2\2\u00ac\u05f5\3\2\2\2\u00ae" +
                    "\u05f9\3\2\2\2\u00b0\u05fd\3\2\2\2\u00b2\u0606\3\2\2\2\u00b4\u0614\3\2" +
                    "\2\2\u00b6\u0616\3\2\2\2\u00b8\u0643\3\2\2\2\u00ba\u0667\3\2\2\2\u00bc" +
                    "\u0669\3\2\2\2\u00be\u0678\3\2\2\2\u00c0\u067b\3\2\2\2\u00c2\u06b3\3\2" +
                    "\2\2\u00c4\u06b5\3\2\2\2\u00c6\u06c8\3\2\2\2\u00c8\u074b\3\2\2\2\u00ca" +
                    "\u0797\3\2\2\2\u00cc\u07a1\3\2\2\2\u00ce\u07b6\3\2\2\2\u00d0\u07be\3\2" +
                    "\2\2\u00d2\u07c2\3\2\2\2\u00d4\u07ce\3\2\2\2\u00d6\u07db\3\2\2\2\u00d8" +
                    "\u07e5\3\2\2\2\u00da\u07e9\3\2\2\2\u00dc\u07f4\3\2\2\2\u00de\u07f6\3\2" +
                    "\2\2\u00e0\u0800\3\2\2\2\u00e2\u0803\3\2\2\2\u00e4\u0810\3\2\2\2\u00e6" +
                    "\u0812\3\2\2\2\u00e8\u0814\3\2\2\2\u00ea\u0816\3\2\2\2\u00ec\u081a\3\2" +
                    "\2\2\u00ee\u081f\3\2\2\2\u00f0\u0823\3\2\2\2\u00f2\u0825\3\2\2\2\u00f4" +
                    "\u00f8\5\4\3\2\u00f5\u00f6\7X\2\2\u00f6\u00f7\7}\2\2\u00f7\u00f9\7\u00c7" +
                    "\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa" +
                    "\u00fb\7C\2\2\u00fb\u00fd\5\u00f0y\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3" +
                    "\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\7\u00e3\2\2\u00ff\u00fe\3\2\2\2" +
                    "\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0103\5`\61\2\u0102\u00f4" +
                    "\3\2\2\2\u0102\u0101\3\2\2\2\u0103\3\3\2\2\2\u0104\u011b\5\f\7\2\u0105" +
                    "\u011b\5\30\r\2\u0106\u011b\5\32\16\2\u0107\u011b\5\34\17\2\u0108\u011b" +
                    "\5X-\2\u0109\u011b\5Z.\2\u010a\u011b\5\\/\2\u010b\u011b\5^\60\2\u010c" +
                    "\u011b\5j\66\2\u010d\u011b\5l\67\2\u010e\u011b\5n8\2\u010f\u011b\5r:\2" +
                    "\u0110\u011b\5\u00b6\\\2\u0111\u011b\5\u00b8]\2\u0112\u011b\5\u00ba^\2" +
                    "\u0113\u011b\5\u00bc_\2\u0114\u011b\5\u00be`\2\u0115\u011b\5\u00c0a\2" +
                    "\u0116\u0118\5\6\4\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119" +
                    "\3\2\2\2\u0119\u011b\5v<\2\u011a\u0104\3\2\2\2\u011a\u0105\3\2\2\2\u011a" +
                    "\u0106\3\2\2\2\u011a\u0107\3\2\2\2\u011a\u0108\3\2\2\2\u011a\u0109\3\2" +
                    "\2\2\u011a\u010a\3\2\2\2\u011a\u010b\3\2\2\2\u011a\u010c\3\2\2\2\u011a" +
                    "\u010d\3\2\2\2\u011a\u010e\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u0110\3\2" +
                    "\2\2\u011a\u0111\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0113\3\2\2\2\u011a" +
                    "\u0114\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0117\3\2\2\2\u011b\5\3\2\2\2" +
                    "\u011c\u011d\7\u00be\2\2\u011d\u0122\5\b\5\2\u011e\u011f\7\u00cd\2\2\u011f" +
                    "\u0121\5\b\5\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2" +
                    "\2\2\u0122\u0123\3\2\2\2\u0123\7\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127" +
                    "\5\u00eex\2\u0126\u0128\5\n\6\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2" +
                    "\2\u0128\u0129\3\2\2\2\u0129\u012a\7\f\2\2\u012a\u012b\7\u00d8\2\2\u012b" +
                    "\u012c\5\4\3\2\u012c\u012d\7\u00e2\2\2\u012d\t\3\2\2\2\u012e\u012f\7\u00d8" +
                    "\2\2\u012f\u0134\5\u00eex\2\u0130\u0131\7\u00cd\2\2\u0131\u0133\5\u00ee" +
                    "x\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134" +
                    "\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\u00e2" +
                    "\2\2\u0138\13\3\2\2\2\u0139\u013a\7\7\2\2\u013a\u013b\7\u00a0\2\2\u013b" +
                    "\u013d\5\u00d8m\2\u013c\u013e\5\62\32\2\u013d\u013c\3\2\2\2\u013d\u013e" +
                    "\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0144\5\16\b\2\u0140\u0141\7\u00cd" +
                    "\2\2\u0141\u0143\5\16\b\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144" +
                    "\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\r\3\2\2\2\u0146\u0144\3\2\2\2" +
                    "\u0147\u0148\7\3\2\2\u0148\u014c\7\34\2\2\u0149\u014a\7O\2\2\u014a\u014b" +
                    "\7t\2\2\u014b\u014d\79\2\2\u014c\u0149\3\2\2\2\u014c\u014d\3\2\2\2\u014d" +
                    "\u014e\3\2\2\2\u014e\u0151\5J&\2\u014f\u0150\7\4\2\2\u0150\u0152\5\u00d2" +
                    "j\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u021e\3\2\2\2\u0153" +
                    "\u0154\7\3\2\2\u0154\u0158\7R\2\2\u0155\u0156\7O\2\2\u0156\u0157\7t\2" +
                    "\2\u0157\u0159\79\2\2\u0158\u0155\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a" +
                    "\3\2\2\2\u015a\u015d\5N(\2\u015b\u015c\7\4\2\2\u015c\u015e\5\u00d2j\2" +
                    "\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u021e\3\2\2\2\u015f\u0160" +
                    "\7\3\2\2\u0160\u0164\7\u0084\2\2\u0161\u0162\7O\2\2\u0162\u0163\7t\2\2" +
                    "\u0163\u0165\79\2\2\u0164\u0161\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166" +
                    "\3\2\2\2\u0166\u0169\5P)\2\u0167\u0168\7\4\2\2\u0168\u016a\5\u00d2j\2" +
                    "\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u021e\3\2\2\2\u016b\u016c" +
                    "\7\21\2\2\u016c\u016f\5\26\f\2\u016d\u016e\7E\2\2\u016e\u0170\5\u00d8" +
                    "m\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u021e\3\2\2\2\u0171" +
                    "\u0172\7\30\2\2\u0172\u0175\7\34\2\2\u0173\u0174\7O\2\2\u0174\u0176\7" +
                    "9\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177" +
                    "\u017a\5\u00d2j\2\u0178\u0179\7Q\2\2\u0179\u017b\5\26\f\2\u017a\u0178" +
                    "\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u021e\3\2\2\2\u017c\u017d\7\30\2\2" +
                    "\u017d\u0180\7R\2\2\u017e\u017f\7O\2\2\u017f\u0181\79\2\2\u0180\u017e" +
                    "\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\5\u00d2j" +
                    "\2\u0183\u0184\7Q\2\2\u0184\u0186\5\26\f\2\u0185\u0183\3\2\2\2\u0185\u0186" +
                    "\3\2\2\2\u0186\u021e\3\2\2\2\u0187\u0188\7\30\2\2\u0188\u018b\7\u0084" +
                    "\2\2\u0189\u018a\7O\2\2\u018a\u018c\79\2\2\u018b\u0189\3\2\2\2\u018b\u018c" +
                    "\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0190\5\u00d2j\2\u018e\u018f\7Q\2\2" +
                    "\u018f\u0191\5\26\f\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u021e" +
                    "\3\2\2\2\u0192\u0193\7\35\2\2\u0193\u0196\7\34\2\2\u0194\u0195\7O\2\2" +
                    "\u0195\u0197\79\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198" +
                    "\3\2\2\2\u0198\u0199\5\u00d2j\2\u0199\u019a\7\u00c7\2\2\u019a\u021e\3" +
                    "\2\2\2\u019b\u019c\7*\2\2\u019c\u019d\7\u00bc\2\2\u019d\u021e\5\u00c8" +
                    "e\2\u019e\u019f\7.\2\2\u019f\u021e\5\26\f\2\u01a0\u01a1\7\64\2\2\u01a1" +
                    "\u01a4\7\34\2\2\u01a2\u01a3\7O\2\2\u01a3\u01a5\79\2\2\u01a4\u01a2\3\2" +
                    "\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u021e\5\u00d2j\2\u01a7" +
                    "\u01a8\7\64\2\2\u01a8\u01ab\7R\2\2\u01a9\u01aa\7O\2\2\u01aa\u01ac\79\2" +
                    "\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u021e" +
                    "\5\u00d2j\2\u01ae\u01af\7\64\2\2\u01af\u01b2\7\u0084\2\2\u01b0\u01b1\7" +
                    "O\2\2\u01b1\u01b3\79\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3" +
                    "\u01b4\3\2\2\2\u01b4\u021e\5\u00d2j\2\u01b5\u01b6\7\64\2\2\u01b6\u021e" +
                    "\5\26\f\2\u01b7\u01b9\7D\2\2\u01b8\u01ba\5\26\f\2\u01b9\u01b8\3\2\2\2" +
                    "\u01b9\u01ba\3\2\2\2\u01ba\u021e\3\2\2\2\u01bb\u01bc\7h\2\2\u01bc\u01bf" +
                    "\7R\2\2\u01bd\u01be\7O\2\2\u01be\u01c0\79\2\2\u01bf\u01bd\3\2\2\2\u01bf" +
                    "\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\5\u00d2j\2\u01c2\u01c3" +
                    "\7Q\2\2\u01c3\u01c5\5\26\f\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5" +
                    "\u021e\3\2\2\2\u01c6\u01c7\7h\2\2\u01c7\u01ca\7\u0084\2\2\u01c8\u01c9" +
                    "\7O\2\2\u01c9\u01cb\79\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb" +
                    "\u01cc\3\2\2\2\u01cc\u01cf\5\u00d2j\2\u01cd\u01ce\7Q\2\2\u01ce\u01d0\5" +
                    "\26\f\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u021e\3\2\2\2\u01d1" +
                    "\u01d2\7n\2\2\u01d2\u01d5\7\34\2\2\u01d3\u01d4\7O\2\2\u01d4\u01d6\79\2" +
                    "\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8" +
                    "\5\u00d2j\2\u01d8\u01d9\5R*\2\u01d9\u021e\3\2\2\2\u01da\u01db\7n\2\2\u01db" +
                    "\u01de\7\34\2\2\u01dc\u01dd\7O\2\2\u01dd\u01df\79\2\2\u01de\u01dc\3\2" +
                    "\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5\u00d2j\2\u01e1" +
                    "\u01e2\7\35\2\2\u01e2\u01e3\7\u00c7\2\2\u01e3\u021e\3\2\2\2\u01e4\u01e5" +
                    "\7n\2\2\u01e5\u01e8\7\34\2\2\u01e6\u01e7\7O\2\2\u01e7\u01e9\79\2\2\u01e8" +
                    "\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\5\u00d2" +
                    "j\2\u01eb\u01ec\7\u0088\2\2\u01ec\u01ed\5\24\13\2\u01ed\u021e\3\2\2\2" +
                    "\u01ee\u01ef\7n\2\2\u01ef\u01f2\7\34\2\2\u01f0\u01f1\7O\2\2\u01f1\u01f3" +
                    "\79\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4" +
                    "\u021e\5J&\2\u01f5\u01f6\7n\2\2\u01f6\u01f7\7{\2\2\u01f7\u01f8\7\24\2" +
                    "\2\u01f8\u021e\5\u00c8e\2\u01f9\u01fa\7n\2\2\u01fa\u021e\5D#\2\u01fb\u01fc" +
                    "\7p\2\2\u01fc\u0206\5\26\f\2\u01fd\u01fe\7\u00a8\2\2\u01fe\u01ff\7\61" +
                    "\2\2\u01ff\u0207\7\u00c7\2\2\u0200\u0201\7\u00a8\2\2\u0201\u0202\7\u00b8" +
                    "\2\2\u0202\u0207\7\u00c7\2\2\u0203\u0204\7\u00a8\2\2\u0204\u0205\7\u00a0" +
                    "\2\2\u0205\u0207\5\u00d8m\2\u0206\u01fd\3\2\2\2\u0206\u0200\3\2\2\2\u0206" +
                    "\u0203\3\2\2\2\u0207\u021e\3\2\2\2\u0208\u0209\7\u0088\2\2\u0209\u021e" +
                    "\7\u00ae\2\2\u020a\u020b\7\u0089\2\2\u020b\u020e\7\34\2\2\u020c\u020d" +
                    "\7O\2\2\u020d\u020f\79\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f" +
                    "\u0210\3\2\2\2\u0210\u0211\5\u00d2j\2\u0211\u0212\7\u00a8\2\2\u0212\u0213" +
                    "\5\u00d2j\2\u0213\u021e\3\2\2\2\u0214\u0215\7\u008a\2\2\u0215\u0216\5" +
                    "\26\f\2\u0216\u0217\7E\2\2\u0217\u0218\5\u00d8m\2\u0218\u021e\3\2\2\2" +
                    "\u0219\u021a\7\u00b2\2\2\u021a\u021b\5\20\t\2\u021b\u021c\5\u0084C\2\u021c" +
                    "\u021e\3\2\2\2\u021d\u0147\3\2\2\2\u021d\u0153\3\2\2\2\u021d\u015f\3\2" +
                    "\2\2\u021d\u016b\3\2\2\2\u021d\u0171\3\2\2\2\u021d\u017c\3\2\2\2\u021d" +
                    "\u0187\3\2\2\2\u021d\u0192\3\2\2\2\u021d\u019b\3\2\2\2\u021d\u019e\3\2" +
                    "\2\2\u021d\u01a0\3\2\2\2\u021d\u01a7\3\2\2\2\u021d\u01ae\3\2\2\2\u021d" +
                    "\u01b5\3\2\2\2\u021d\u01b7\3\2\2\2\u021d\u01bb\3\2\2\2\u021d\u01c6\3\2" +
                    "\2\2\u021d\u01d1\3\2\2\2\u021d\u01da\3\2\2\2\u021d\u01e4\3\2\2\2\u021d" +
                    "\u01ee\3\2\2\2\u021d\u01f5\3\2\2\2\u021d\u01f9\3\2\2\2\u021d\u01fb\3\2" +
                    "\2\2\u021d\u0208\3\2\2\2\u021d\u020a\3\2\2\2\u021d\u0214\3\2\2\2\u021d" +
                    "\u0219\3\2\2\2\u021e\17\3\2\2\2\u021f\u0224\5\22\n\2\u0220\u0221\7\u00cd" +
                    "\2\2\u0221\u0223\5\22\n\2\u0222\u0220\3\2\2\2\u0223\u0226\3\2\2\2\u0224" +
                    "\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\21\3\2\2\2\u0226\u0224\3\2\2" +
                    "\2\u0227\u0228\5\u00d2j\2\u0228\u0229\7\u00d2\2\2\u0229\u022a\5\u00c8" +
                    "e\2\u022a\23\3\2\2\2\u022b\u022c\t\2\2\2\u022c\25\3\2\2\2\u022d\u022e" +
                    "\7\177\2\2\u022e\u0233\5\u00c8e\2\u022f\u0230\7\177\2\2\u0230\u0231\7" +
                    "N\2\2\u0231\u0233\7\u00c7\2\2\u0232\u022d\3\2\2\2\u0232\u022f\3\2\2\2" +
                    "\u0233\27\3\2\2\2\u0234\u0235\7\21\2\2\u0235\u0236\7\60\2\2\u0236\u0238" +
                    "\5\u00d8m\2\u0237\u0239\5\62\32\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2" +
                    "\2\2\u0239\31\3\2\2\2\u023a\u023b\7\27\2\2\u023b\u023c\7\u00a0\2\2\u023c" +
                    "\u023e\5\u00d8m\2\u023d\u023f\5\26\f\2\u023e\u023d\3\2\2\2\u023e\u023f" +
                    "\3\2\2\2\u023f\33\3\2\2\2\u0240\u0241\t\3\2\2\u0241\u0245\7#\2\2\u0242" +
                    "\u0243\7O\2\2\u0243\u0244\7t\2\2\u0244\u0246\79\2\2\u0245\u0242\3\2\2" +
                    "\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\5\u00dep\2\u0248" +
                    "\u024a\5\62\32\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3" +
                    "\2\2\2\u024b\u024d\5F$\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d" +
                    "\u02da\3\2\2\2\u024e\u0256\7\21\2\2\u024f\u0252\7\37\2\2\u0250\u0251\7" +
                    "z\2\2\u0251\u0253\7\u008a\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2" +
                    "\u0253\u0256\3\2\2\2\u0254\u0256\7\u008a\2\2\u0255\u024e\3\2\2\2\u0255" +
                    "\u024f\3\2\2\2\u0255\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u025b\7\60" +
                    "\2\2\u0258\u0259\7O\2\2\u0259\u025a\7t\2\2\u025a\u025c\79\2\2\u025b\u0258" +
                    "\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\5\u00d8m" +
                    "\2\u025e\u0260\5\64\33\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260" +
                    "\u0262\3\2\2\2\u0261\u0263\5\62\32\2\u0262\u0261\3\2\2\2\u0262\u0263\3" +
                    "\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5\36\20\2\u0265\u0266\5\"\22\2" +
                    "\u0266\u02da\3\2\2\2\u0267\u0268\t\3\2\2\u0268\u0269\7e\2\2\u0269\u026d" +
                    "\7\u00b7\2\2\u026a\u026b\7O\2\2\u026b\u026c\7t\2\2\u026c\u026e\79\2\2" +
                    "\u026d\u026a\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271" +
                    "\5\u00d8m\2\u0270\u0272\5\64\33\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2" +
                    "\2\2\u0272\u0274\3\2\2\2\u0273\u0275\5\62\32\2\u0274\u0273\3\2\2\2\u0274" +
                    "\u0275\3\2\2\2\u0275\u027b\3\2\2\2\u0276\u0277\7\u00be\2\2\u0277\u0279" +
                    "\7\u00a6\2\2\u0278\u027a\7\u00c5\2\2\u0279\u0278\3\2\2\2\u0279\u027a\3" +
                    "\2\2\2\u027a\u027c\3\2\2\2\u027b\u0276\3\2\2\2\u027b\u027c\3\2\2\2\u027c" +
                    "\u027e\3\2\2\2\u027d\u027f\5\66\34\2\u027e\u027d\3\2\2\2\u027e\u027f\3" +
                    "\2\2\2\u027f\u0281\3\2\2\2\u0280\u0282\5:\36\2\u0281\u0280\3\2\2\2\u0281" +
                    "\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\58\35\2\u0284\u02da\3\2" +
                    "\2\2\u0285\u0286\t\3\2\2\u0286\u0287\7i\2\2\u0287\u028b\7\u00b7\2\2\u0288" +
                    "\u0289\7O\2\2\u0289\u028a\7t\2\2\u028a\u028c\79\2\2\u028b\u0288\3\2\2" +
                    "\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\5\u00d8m\2\u028e" +
                    "\u0290\5\64\33\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3" +
                    "\2\2\2\u0291\u0293\5\62\32\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293" +
                    "\u0295\3\2\2\2\u0294\u0296\5:\36\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2" +
                    "\2\2\u0296\u029c\3\2\2\2\u0297\u029d\5\66\34\2\u0298\u029a\5<\37\2\u0299" +
                    "\u029b\7\u0080\2\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d" +
                    "\3\2\2\2\u029c\u0297\3\2\2\2\u029c\u0298\3\2\2\2\u029d\u029e\3\2\2\2\u029e" +
                    "\u029f\58\35\2\u029f\u02da\3\2\2\2\u02a0\u02a8\7\21\2\2\u02a1\u02a4\7" +
                    "\37\2\2\u02a2\u02a3\7z\2\2\u02a3\u02a5\7\u008a\2\2\u02a4\u02a2\3\2\2\2" +
                    "\u02a4\u02a5\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a8\7\u008a\2\2\u02a7" +
                    "\u02a0\3\2\2\2\u02a7\u02a1\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02aa\3\2" +
                    "\2\2\u02a9\u02ab\7\u00a2\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab" +
                    "\u02ac\3\2\2\2\u02ac\u02b0\7\u00a0\2\2\u02ad\u02ae\7O\2\2\u02ae\u02af" +
                    "\7t\2\2\u02af\u02b1\79\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1" +
                    "\u02b2\3\2\2\2\u02b2\u02b4\5\u00d8m\2\u02b3\u02b5\5\64\33\2\u02b4\u02b3" +
                    "\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b8\5\62\32\2" +
                    "\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02bb" +
                    "\5:\36\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc" +
                    "\u02be\5<\37\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\3\2" +
                    "\2\2\u02bf\u02c1\58\35\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1" +
                    "\u02da\3\2\2\2\u02c2\u02c5\t\3\2\2\u02c3\u02c4\7z\2\2\u02c4\u02c6\7\u008a" +
                    "\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7" +
                    "\u02cb\7\u00b7\2\2\u02c8\u02c9\7O\2\2\u02c9\u02ca\7t\2\2\u02ca\u02cc\7" +
                    "9\2\2\u02cb\u02c8\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd" +
                    "\u02cf\5\u00d8m\2\u02ce\u02d0\5\64\33\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0" +
                    "\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02d3\5\62\32\2\u02d2\u02d1\3\2\2\2" +
                    "\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d6\5:\36\2\u02d5\u02d4" +
                    "\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\58\35\2\u02d8" +
                    "\u02da\3\2\2\2\u02d9\u0240\3\2\2\2\u02d9\u0255\3\2\2\2\u02d9\u0267\3\2" +
                    "\2\2\u02d9\u0285\3\2\2\2\u02d9\u02a7\3\2\2\2\u02d9\u02c2\3\2\2\2\u02da" +
                    "\35\3\2\2\2\u02db\u02dc\7\u00d8\2\2\u02dc\u02e1\5 \21\2\u02dd\u02de\7" +
                    "\u00cd\2\2\u02de\u02e0\5 \21\2\u02df\u02dd\3\2\2\2\u02e0\u02e3\3\2\2\2" +
                    "\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e1" +
                    "\3\2\2\2\u02e4\u02e5\7\u00e2\2\2\u02e5\37\3\2\2\2\u02e6\u02e7\5\u00ee" +
                    "x\2\u02e7\u02fd\5\u00c2b\2\u02e8\u02e9\6\21\2\3\u02e9\u02ea\7(\2\2\u02ea" +
                    "\u02eb\5\u00e4s\2\u02eb\u02ec\b\21\1\2\u02ec\u02fc\3\2\2\2\u02ed\u02ee" +
                    "\6\21\3\3\u02ee\u02ef\7;\2\2\u02ef\u02f0\5\u00c8e\2\u02f0\u02f1\b\21\1" +
                    "\2\u02f1\u02fc\3\2\2\2\u02f2\u02f3\6\21\4\3\u02f3\u02f4\7L\2\2\u02f4\u02fc" +
                    "\b\21\1\2\u02f5\u02f6\6\21\5\3\u02f6\u02f7\7T\2\2\u02f7\u02fc\b\21\1\2" +
                    "\u02f8\u02f9\6\21\6\3\u02f9\u02fa\7Z\2\2\u02fa\u02fc\b\21\1\2\u02fb\u02e8" +
                    "\3\2\2\2\u02fb\u02ed\3\2\2\2\u02fb\u02f2\3\2\2\2\u02fb\u02f5\3\2\2\2\u02fb" +
                    "\u02f8\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2" +
                    "\2\2\u02fe!\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0302\5$\23\2\u0301\u0300" +
                    "\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0319\3\2\2\2\u0303\u0304\6\22\7\3" +
                    "\u0304\u0305\5(\25\2\u0305\u0306\b\22\1\2\u0306\u0318\3\2\2\2\u0307\u0308" +
                    "\6\22\b\3\u0308\u0309\5*\26\2\u0309\u030a\b\22\1\2\u030a\u0318\3\2\2\2" +
                    "\u030b\u030c\6\22\t\3\u030c\u030d\5,\27\2\u030d\u030e\b\22\1\2\u030e\u0318" +
                    "\3\2\2\2\u030f\u0310\6\22\n\3\u0310\u0311\5.\30\2\u0311\u0312\b\22\1\2" +
                    "\u0312\u0318\3\2\2\2\u0313\u0314\6\22\13\3\u0314\u0315\5\60\31\2\u0315" +
                    "\u0316\b\22\1\2\u0316\u0318\3\2\2\2\u0317\u0303\3\2\2\2\u0317\u0307\3" +
                    "\2\2\2\u0317\u030b\3\2\2\2\u0317\u030f\3\2\2\2\u0317\u0313\3\2\2\2\u0318" +
                    "\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a#\3\2\2\2" +
                    "\u031b\u0319\3\2\2\2\u031c\u031d\7\u0083\2\2\u031d\u031e\7\\\2\2\u031e" +
                    "\u031f\5\u00c4c\2\u031f%\3\2\2\2\u0320\u0327\5\u00eex\2\u0321\u0324\5" +
                    "\u00eex\2\u0322\u0323\7\u00d8\2\2\u0323\u0325\7\u00e2\2\2\u0324\u0322" +
                    "\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0328\5\u00e4s" +
                    "\2\u0327\u0321\3\2\2\2\u0327\u0326\3\2\2\2\u0328\'\3\2\2\2\u0329\u032a" +
                    "\7\u0099\2\2\u032a\u032b\7\u00d8\2\2\u032b\u032c\5\u00eex\2\u032c\u0330" +
                    "\7\u00d8\2\2\u032d\u032f\5&\24\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2" +
                    "\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330" +
                    "\3\2\2\2\u0333\u0334\7\u00e2\2\2\u0334\u0335\7\u00e2\2\2\u0335)\3\2\2" +
                    "\2\u0336\u0337\7b\2\2\u0337\u0341\7\u00d8\2\2\u0338\u0342\7\u00c5\2\2" +
                    "\u0339\u033a\7l\2\2\u033a\u033b\7\u00c5\2\2\u033b\u033c\7j\2\2\u033c\u0342" +
                    "\7\u00c5\2\2\u033d\u033e\7j\2\2\u033e\u033f\7\u00c5\2\2\u033f\u0340\7" +
                    "l\2\2\u0340\u0342\7\u00c5\2\2\u0341\u0338\3\2\2\2\u0341\u0339\3\2\2\2" +
                    "\u0341\u033d\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\7\u00e2\2\2\u0344" +
                    "+\3\2\2\2\u0345\u0346\7_\2\2\u0346\u0347\7\u00d8\2\2\u0347\u0348\5\u00ee" +
                    "x\2\u0348\u034c\7\u00d8\2\2\u0349\u034b\5&\24\2\u034a\u0349\3\2\2\2\u034b" +
                    "\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2" +
                    "\2\2\u034e\u034c\3\2\2\2\u034f\u0350\7\u00e2\2\2\u0350\u0351\7\u00e2\2" +
                    "\2\u0351-\3\2\2\2\u0352\u0353\7\u0086\2\2\u0353\u035e\7\u00d8\2\2\u0354" +
                    "\u0355\7l\2\2\u0355\u0356\5\u00eex\2\u0356\u0357\7j\2\2\u0357\u0358\5" +
                    "\u00eex\2\u0358\u035f\3\2\2\2\u0359\u035a\7j\2\2\u035a\u035b\5\u00eex" +
                    "\2\u035b\u035c\7l\2\2\u035c\u035d\5\u00eex\2\u035d\u035f\3\2\2\2\u035e" +
                    "\u0354\3\2\2\2\u035e\u0359\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\7\u00e2" +
                    "\2\2\u0361/\3\2\2\2\u0362\u0363\7\u0097\2\2\u0363\u0364\7\u00d8\2\2\u0364" +
                    "\u0365\5\u00a6T\2\u0365\u0366\7\u00e2\2\2\u0366\61\3\2\2\2\u0367\u0368" +
                    "\7x\2\2\u0368\u036b\7\31\2\2\u0369\u036c\5\u00eex\2\u036a\u036c\7\u00c7" +
                    "\2\2\u036b\u0369\3\2\2\2\u036b\u036a\3\2\2\2\u036c\63\3\2\2\2\u036d\u036e" +
                    "\7\u00b5\2\2\u036e\u036f\7\u00c7\2\2\u036f\65\3\2\2\2\u0370\u0371\7\u00a8" +
                    "\2\2\u0371\u0372\5\u00d8m\2\u0372\67\3\2\2\2\u0373\u0374\7\f\2\2\u0374" +
                    "\u0375\5r:\2\u03759\3\2\2\2\u0376\u0377\7\u00d8\2\2\u0377\u037c\5H%\2" +
                    "\u0378\u0379\7\u00cd\2\2\u0379\u037b\5H%\2\u037a\u0378\3\2\2\2\u037b\u037e" +
                    "\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e" +
                    "\u037c\3\2\2\2\u037f\u0380\7\u00e2\2\2\u0380\u0386\3\2\2\2\u0381\u0382" +
                    "\7\f\2\2\u0382\u0386\5\u00d8m\2\u0383\u0384\7\f\2\2\u0384\u0386\5\u00d6" +
                    "l\2\u0385\u0376\3\2\2\2\u0385\u0381\3\2\2\2\u0385\u0383\3\2\2\2\u0386" +
                    ";\3\2\2\2\u0387\u03a2\5F$\2\u0388\u0389\6\37\f\3\u0389\u038a\5\u008aF" +
                    "\2\u038a\u038b\b\37\1\2\u038b\u03a1\3\2\2\2\u038c\u038d\6\37\r\3\u038d" +
                    "\u038e\5> \2\u038e\u038f\b\37\1\2\u038f\u03a1\3\2\2\2\u0390\u0391\6\37" +
                    "\16\3\u0391\u0392\5@!\2\u0392\u0393\b\37\1\2\u0393\u03a1\3\2\2\2\u0394" +
                    "\u0395\6\37\17\3\u0395\u0396\5B\"\2\u0396\u0397\b\37\1\2\u0397\u03a1\3" +
                    "\2\2\2\u0398\u0399\6\37\20\3\u0399\u039a\5D#\2\u039a\u039b\b\37\1\2\u039b" +
                    "\u03a1\3\2\2\2\u039c\u039d\6\37\21\3\u039d\u039e\5\u0092J\2\u039e\u039f" +
                    "\b\37\1\2\u039f\u03a1\3\2\2\2\u03a0\u0388\3\2\2\2\u03a0\u038c\3\2\2\2" +
                    "\u03a0\u0390\3\2\2\2\u03a0\u0394\3\2\2\2\u03a0\u0398\3\2\2\2\u03a0\u039c" +
                    "\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3" +
                    "=\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\7\177\2\2\u03a6\u03a7\7\24\2" +
                    "\2\u03a7\u03a8\5\u00c8e\2\u03a8?\3\2\2\2\u03a9\u03aa\7\u0083\2\2\u03aa" +
                    "\u03ab\7\\\2\2\u03ab\u03ac\5\u00c8e\2\u03acA\3\2\2\2\u03ad\u03ae\7\u0091" +
                    "\2\2\u03ae\u03af\7\24\2\2\u03af\u03b0\5\u00c8e\2\u03b0C\3\2\2\2\u03b1" +
                    "\u03b2\7\u00ae\2\2\u03b2\u03b7\5V,\2\u03b3\u03b4\7\u00cd\2\2\u03b4\u03b6" +
                    "\5V,\2\u03b5\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7" +
                    "\u03b8\3\2\2\2\u03b8E\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bc\7\67\2\2" +
                    "\u03bb\u03bd\7\u00d2\2\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd" +
                    "\u03be\3\2\2\2\u03be\u03c4\5\u00f0y\2\u03bf\u03c1\7\u00d8\2\2\u03c0\u03c2" +
                    "\5\u00c4c\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2" +
                    "\2\u03c3\u03c5\7\u00e2\2\2\u03c4\u03bf\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5" +
                    "G\3\2\2\2\u03c6\u03d1\5J&\2\u03c7\u03c8\7\36\2\2\u03c8\u03c9\5\u00eex" +
                    "\2\u03c9\u03ca\7\27\2\2\u03ca\u03cb\5\u00c8e\2\u03cb\u03d1\3\2\2\2\u03cc" +
                    "\u03cd\7R\2\2\u03cd\u03d1\5N(\2\u03ce\u03cf\7\u0084\2\2\u03cf\u03d1\5" +
                    "P)\2\u03d0\u03c6\3\2\2\2\u03d0\u03c7\3\2\2\2\u03d0\u03cc\3\2\2\2\u03d0" +
                    "\u03ce\3\2\2\2\u03d1I\3\2\2\2\u03d2\u03d3\5\u00d2j\2\u03d3\u03d5\5\u00c2" +
                    "b\2\u03d4\u03d6\5L\'\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d9" +
                    "\3\2\2\2\u03d7\u03d8\7\35\2\2\u03d8\u03da\7\u00c7\2\2\u03d9\u03d7\3\2" +
                    "\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\3\2\2\2\u03db\u03dd\5R*\2\u03dc\u03db" +
                    "\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03df\7\u00ae\2" +
                    "\2\u03df\u03e1\5\u00c8e\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1" +
                    "\u03f3\3\2\2\2\u03e2\u03e4\5\u00d2j\2\u03e3\u03e5\5\u00c2b\2\u03e4\u03e3" +
                    "\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9\5L\'\2\u03e7" +
                    "\u03e8\7\35\2\2\u03e8\u03ea\7\u00c7\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea" +
                    "\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03ed\5R*\2\u03ec\u03eb\3\2\2\2\u03ec" +
                    "\u03ed\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ef\7\u00ae\2\2\u03ef\u03f1" +
                    "\5\u00c8e\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\3\2\2" +
                    "\2\u03f2\u03d2\3\2\2\2\u03f2\u03e2\3\2\2\2\u03f3K\3\2\2\2\u03f4\u03f5" +
                    "\t\4\2\2\u03f5\u03f6\5\u00c8e\2\u03f6M\3\2\2\2\u03f7\u03f8\5\u00d2j\2" +
                    "\u03f8\u03f9\5\u00c8e\2\u03f9\u03fa\7\u00af\2\2\u03fa\u03fb\5\u00c2b\2" +
                    "\u03fb\u03fc\7I\2\2\u03fc\u03fd\7\u00c5\2\2\u03fdO\3\2\2\2\u03fe\u03ff" +
                    "\5\u00d2j\2\u03ff\u0400\5p9\2\u0400Q\3\2\2\2\u0401\u0402\7\32\2\2\u0402" +
                    "\u0403\7\u00d8\2\2\u0403\u0408\5T+\2\u0404\u0405\7\u00cd\2\2\u0405\u0407" +
                    "\5T+\2\u0406\u0404\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2\2\2\u0408" +
                    "\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u0408\3\2\2\2\u040b\u040c\7\u00e2" +
                    "\2\2\u040cS\3\2\2\2\u040d\u0413\5\u00eex\2\u040e\u0410\7\u00d8\2\2\u040f" +
                    "\u0411\5\u00c4c\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412" +
                    "\3\2\2\2\u0412\u0414\7\u00e2\2\2\u0413\u040e\3\2\2\2\u0413\u0414\3\2\2" +
                    "\2\u0414U\3\2\2\2\u0415\u041d\5\u00c8e\2\u0416\u041e\7*\2\2\u0417\u0418" +
                    "\7\u00a8\2\2\u0418\u0419\7\61\2\2\u0419\u041e\7\u00c7\2\2\u041a\u041b" +
                    "\7\u00a8\2\2\u041b\u041c\7\u00b8\2\2\u041c\u041e\7\u00c7\2\2\u041d\u0416" +
                    "\3\2\2\2\u041d\u0417\3\2\2\2\u041d\u041a\3\2\2\2\u041d\u041e\3\2\2\2\u041e" +
                    "W\3\2\2\2\u041f\u0421\t\5\2\2\u0420\u0422\7\u00a0\2\2\u0421\u0420\3\2" +
                    "\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\5\u00d4k\2\u0424" +
                    "Y\3\2\2\2\u0425\u0426\t\6\2\2\u0426\u0429\7#\2\2\u0427\u0428\7O\2\2\u0428" +
                    "\u042a\79\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2" +
                    "\2\2\u042b\u042d\5\u00dep\2\u042c\u042e\5\62\32\2\u042d\u042c\3\2\2\2" +
                    "\u042d\u042e\3\2\2\2\u042e\u0445\3\2\2\2\u042f\u0436\t\6\2\2\u0430\u0437" +
                    "\7\60\2\2\u0431\u0433\7\u00a2\2\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2" +
                    "\2\2\u0433\u0434\3\2\2\2\u0434\u0437\7\u00a0\2\2\u0435\u0437\7\u00b7\2" +
                    "\2\u0436\u0430\3\2\2\2\u0436\u0432\3\2\2\2\u0436\u0435\3\2\2\2\u0437\u043a" +
                    "\3\2\2\2\u0438\u0439\7O\2\2\u0439\u043b\79\2\2\u043a\u0438\3\2\2\2\u043a" +
                    "\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043e\5\u00d8m\2\u043d\u043f" +
                    "\5\62\32\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0442\3\2\2\2" +
                    "\u0440\u0441\7s\2\2\u0441\u0443\7)\2\2\u0442\u0440\3\2\2\2\u0442\u0443" +
                    "\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u0425\3\2\2\2\u0444\u042f\3\2\2\2\u0445" +
                    "[\3\2\2\2\u0446\u0447\79\2\2\u0447\u0448\7#\2\2\u0448\u0454\5\u00dep\2" +
                    "\u0449\u0450\79\2\2\u044a\u0451\7\60\2\2\u044b\u044d\7\u00a2\2\2\u044c" +
                    "\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0451\7\u00a0" +
                    "\2\2\u044f\u0451\7\u00b7\2\2\u0450\u044a\3\2\2\2\u0450\u044c\3\2\2\2\u0450" +
                    "\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0454\5\u00d8" +
                    "m\2\u0453\u0446\3\2\2\2\u0453\u0449\3\2\2\2\u0454]\3\2\2\2\u0455\u0456" +
                    "\7:\2\2\u0456\u0457\7\17\2\2\u0457\u045c\5\4\3\2\u0458\u0459\7:\2\2\u0459" +
                    "\u045a\7\u009e\2\2\u045a\u045c\5\4\3\2\u045b\u0455\3\2\2\2\u045b\u0458" +
                    "\3\2\2\2\u045c_\3\2\2\2\u045d\u045e\7V\2\2\u045e\u0460\7X\2\2\u045f\u0461" +
                    "\7\u00a0\2\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0465\3\2\2" +
                    "\2\u0462\u0466\5\u00d8m\2\u0463\u0464\7G\2\2\u0464\u0466\5\u00d6l\2\u0465" +
                    "\u0462\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0468\3\2\2\2\u0467\u0469\5b" +
                    "\62\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2\2\2\u046a" +
                    "\u046b\5d\63\2\u046ba\3\2\2\2\u046c\u046d\7\u00d8\2\2\u046d\u0472\5\u00d2" +
                    "j\2\u046e\u046f\7\u00cd\2\2\u046f\u0471\5\u00d2j\2\u0470\u046e\3\2\2\2" +
                    "\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475" +
                    "\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u0476\7\u00e2\2\2\u0476c\3\2\2\2\u0477" +
                    "\u0478\7C\2\2\u0478\u0489\5\u00eex\2\u0479\u047a\7\u00b6\2\2\u047a\u047f" +
                    "\5f\64\2\u047b\u047c\7\u00cd\2\2\u047c\u047e\5f\64\2\u047d\u047b\3\2\2" +
                    "\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0489" +
                    "\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0484\5r:\2\u0483\u0485\7\u00e3\2\2" +
                    "\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487" +
                    "\7\2\2\3\u0487\u0489\3\2\2\2\u0488\u0477\3\2\2\2\u0488\u0479\3\2\2\2\u0488" +
                    "\u0482\3\2\2\2\u0489e\3\2\2\2\u048a\u048b\7\u00d8\2\2\u048b\u0490\5h\65" +
                    "\2\u048c\u048d\7\u00cd\2\2\u048d\u048f\5h\65\2\u048e\u048c\3\2\2\2\u048f" +
                    "\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493\3\2" +
                    "\2\2\u0492\u0490\3\2\2\2\u0493\u0494\7\u00e2\2\2\u0494\u0498\3\2\2\2\u0495" +
                    "\u0496\7\u00d8\2\2\u0496\u0498\7\u00e2\2\2\u0497\u048a\3\2\2\2\u0497\u0495" +
                    "\3\2\2\2\u0498g\3\2\2\2\u0499\u049a\5\u00e4s\2\u049ai\3\2\2\2\u049b\u049c" +
                    "\7]\2\2\u049c\u049e\7q\2\2\u049d\u049f\5\62\32\2\u049e\u049d\3\2\2\2\u049e" +
                    "\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\5\u0084C\2\u04a1\u04a3" +
                    "\t\7\2\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3k\3\2\2\2\u04a4" +
                    "\u04a5\7y\2\2\u04a5\u04a6\7\u00a0\2\2\u04a6\u04a8\5\u00d8m\2\u04a7\u04a9" +
                    "\5\62\32\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\3\2\2\2" +
                    "\u04aa\u04ac\5\26\f\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae" +
                    "\3\2\2\2\u04ad\u04af\7>\2\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af" +
                    "\u04b1\3\2\2\2\u04b0\u04b2\7\'\2\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2" +
                    "\2\2\u04b2m\3\2\2\2\u04b3\u04b4\7\u0089\2\2\u04b4\u04b5\7\u00a0\2\2\u04b5" +
                    "\u04b6\5\u00d8m\2\u04b6\u04b7\7\u00a8\2\2\u04b7\u04bf\5\u00d8m\2\u04b8" +
                    "\u04b9\7\u00cd\2\2\u04b9\u04ba\5\u00d8m\2\u04ba\u04bb\7\u00a8\2\2\u04bb" +
                    "\u04bc\5\u00d8m\2\u04bc\u04be\3\2\2\2\u04bd\u04b8\3\2\2\2\u04be\u04c1" +
                    "\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1" +
                    "\u04bf\3\2\2\2\u04c2\u04c4\5\62\32\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3" +
                    "\2\2\2\u04c4o\3\2\2\2\u04c5\u04c7\7\u00d8\2\2\u04c6\u04c8\5x=\2\u04c7" +
                    "\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\7\u0093" +
                    "\2\2\u04ca\u04cc\5\u00c4c\2\u04cb\u04cd\5\u0086D\2\u04cc\u04cb\3\2\2\2" +
                    "\u04cc\u04cd\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04d0\5\u008cG\2\u04cf" +
                    "\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\7\u00e2" +
                    "\2\2\u04d2q\3\2\2\2\u04d3\u04d9\5t;\2\u04d4\u04d5\7\u00b1\2\2\u04d5\u04d6" +
                    "\7\6\2\2\u04d6\u04d8\5t;\2\u04d7\u04d4\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9" +
                    "\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04das\3\2\2\2\u04db\u04d9\3\2\2\2" +
                    "\u04dc\u04e2\5v<\2\u04dd\u04de\7\u00d8\2\2\u04de\u04df\5r:\2\u04df\u04e0" +
                    "\7\u00e2\2\2\u04e0\u04e2\3\2\2\2\u04e1\u04dc\3\2\2\2\u04e1\u04dd\3\2\2" +
                    "\2\u04e2u\3\2\2\2\u04e3\u04e5\5x=\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3" +
                    "\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\7\u0093\2\2\u04e7\u04e9\7\62\2" +
                    "\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04ec" +
                    "\5z>\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed" +
                    "\u04ef\5\u00c4c\2\u04ee\u04f0\5|?\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3" +
                    "\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04f3\5~@\2\u04f2\u04f1\3\2\2\2\u04f2" +
                    "\u04f3\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04f6\5\u0080A\2\u04f5\u04f4" +
                    "\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04f9\5\u0082B" +
                    "\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04fc" +
                    "\5\u0084C\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2" +
                    "\2\u04fd\u04ff\5\u0086D\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff" +
                    "\u0502\3\2\2\2\u0500\u0501\7\u00be\2\2\u0501\u0503\t\b\2\2\u0502\u0500" +
                    "\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0505\7\u00be\2" +
                    "\2\u0505\u0507\7\u00aa\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507" +
                    "\u0509\3\2\2\2\u0508\u050a\5\u0088E\2\u0509\u0508\3\2\2\2\u0509\u050a" +
                    "\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u050d\5\u008aF\2\u050c\u050b\3\2\2" +
                    "\2\u050c\u050d\3\2\2\2\u050d\u050f\3\2\2\2\u050e\u0510\5\u008eH\2\u050f" +
                    "\u050e\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u0513\5\u0090" +
                    "I\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514" +
                    "\u0516\5\u0092J\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516w\3\2\2" +
                    "\2\u0517\u0518\7\u00be\2\2\u0518\u0519\5\u00c4c\2\u0519y\3\2\2\2\u051a" +
                    "\u051b\7\u00a9\2\2\u051b\u051e\7\u00c5\2\2\u051c\u051d\7\u00be\2\2\u051d" +
                    "\u051f\7\u00a5\2\2\u051e\u051c\3\2\2\2\u051e\u051f\3\2\2\2\u051f{\3\2" +
                    "\2\2\u0520\u0521\7E\2\2\u0521\u0522\5\u0094K\2\u0522}\3\2\2\2\u0523\u0525" +
                    "\t\t\2\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2\2\2\u0526" +
                    "\u0527\7\13\2\2\u0527\u0528\7[\2\2\u0528\u0529\5\u00c4c\2\u0529\177\3" +
                    "\2\2\2\u052a\u052b\7\u00bd\2\2\u052b\u052c\5\u00eex\2\u052c\u052d\7\f" +
                    "\2\2\u052d\u052e\7\u00d8\2\2\u052e\u052f\5\u00aaV\2\u052f\u0530\7\u00e2" +
                    "\2\2\u0530\u0081\3\2\2\2\u0531\u0532\7\u0082\2\2\u0532\u0533\5\u00c8e" +
                    "\2\u0533\u0083\3\2\2\2\u0534\u0535\7\u00bc\2\2\u0535\u0536\5\u00c8e\2" +
                    "\u0536\u0085\3\2\2\2\u0537\u0538\7J\2\2\u0538\u053f\7\24\2\2\u0539\u053a" +
                    "\t\b\2\2\u053a\u053b\7\u00d8\2\2\u053b\u053c\5\u00c4c\2\u053c\u053d\7" +
                    "\u00e2\2\2\u053d\u0540\3\2\2\2\u053e\u0540\5\u00c4c\2\u053f\u0539\3\2" +
                    "\2\2\u053f\u053e\3\2\2\2\u0540\u0087\3\2\2\2\u0541\u0542\7K\2\2\u0542" +
                    "\u0543\5\u00c8e\2\u0543\u0089\3\2\2\2\u0544\u0545\7{\2\2\u0545\u0546\7" +
                    "\24\2\2\u0546\u0547\5\u00a0Q\2\u0547\u008b\3\2\2\2\u0548\u0549\7{\2\2" +
                    "\u0549\u054a\7\24\2\2\u054a\u054b\5\u00c4c\2\u054b\u008d\3\2\2\2\u054c" +
                    "\u054d\7d\2\2\u054d\u054e\5\u009eP\2\u054e\u054f\7\24\2\2\u054f\u0550" +
                    "\5\u00c4c\2\u0550\u008f\3\2\2\2\u0551\u0552\7d\2\2\u0552\u0555\5\u009e" +
                    "P\2\u0553\u0554\7\u00be\2\2\u0554\u0556\7\u00a5\2\2\u0555\u0553\3\2\2" +
                    "\2\u0555\u0556\3\2\2\2\u0556\u0091\3\2\2\2\u0557\u0558\7\u0097\2\2\u0558" +
                    "\u0559\5\u00a6T\2\u0559\u0093\3\2\2\2\u055a\u055b\bK\1\2\u055b\u055d\5" +
                    "\u00d4k\2\u055c\u055e\7>\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e" +
                    "\u0560\3\2\2\2\u055f\u0561\5\u009cO\2\u0560\u055f\3\2\2\2\u0560\u0561" +
                    "\3\2\2\2\u0561\u0567\3\2\2\2\u0562\u0563\7\u00d8\2\2\u0563\u0564\5\u0094" +
                    "K\2\u0564\u0565\7\u00e2\2\2\u0565\u0567\3\2\2\2\u0566\u055a\3\2\2\2\u0566" +
                    "\u0562\3\2\2\2\u0567\u0579\3\2\2\2\u0568\u0569\f\5\2\2\u0569\u056a\5\u0098" +
                    "M\2\u056a\u056b\5\u0094K\6\u056b\u0578\3\2\2\2\u056c\u056e\f\6\2\2\u056d" +
                    "\u056f\t\n\2\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0571\3\2" +
                    "\2\2\u0570\u0572\5\u0096L\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572" +
                    "\u0573\3\2\2\2\u0573\u0574\7[\2\2\u0574\u0575\5\u0094K\2\u0575\u0576\5" +
                    "\u009aN\2\u0576\u0578\3\2\2\2\u0577\u0568\3\2\2\2\u0577\u056c\3\2\2\2" +
                    "\u0578\u057b\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u0095" +
                    "\3\2\2\2\u057b\u0579\3\2\2\2\u057c\u057e\t\13\2\2\u057d\u057c\3\2\2\2" +
                    "\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0586\7U\2\2\u0580\u0582" +
                    "\7U\2\2\u0581\u0583\t\13\2\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583" +
                    "\u0586\3\2\2\2\u0584\u0586\t\13\2\2\u0585\u057d\3\2\2\2\u0585\u0580\3" +
                    "\2\2\2\u0585\u0584\3\2\2\2\u0586\u05a8\3\2\2\2\u0587\u0589\t\f\2\2\u0588" +
                    "\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058c\t\r" +
                    "\2\2\u058b\u058d\7|\2\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d" +
                    "\u0596\3\2\2\2\u058e\u0590\t\r\2\2\u058f\u0591\7|\2\2\u0590\u058f\3\2" +
                    "\2\2\u0590\u0591\3\2\2\2\u0591\u0593\3\2\2\2\u0592\u0594\t\f\2\2\u0593" +
                    "\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\3\2\2\2\u0595\u0588\3\2" +
                    "\2\2\u0595\u058e\3\2\2\2\u0596\u05a8\3\2\2\2\u0597\u0599\t\16\2\2\u0598" +
                    "\u0597\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059c\7F" +
                    "\2\2\u059b\u059d\7|\2\2\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d" +
                    "\u05a6\3\2\2\2\u059e\u05a0\7F\2\2\u059f\u05a1\7|\2\2\u05a0\u059f\3\2\2" +
                    "\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2\u05a4\t\16\2\2\u05a3" +
                    "\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a6\3\2\2\2\u05a5\u0598\3\2" +
                    "\2\2\u05a5\u059e\3\2\2\2\u05a6\u05a8\3\2\2\2\u05a7\u0585\3\2\2\2\u05a7" +
                    "\u0595\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u0097\3\2\2\2\u05a9\u05ab\t\n" +
                    "\2\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac" +
                    "\u05ad\7 \2\2\u05ad\u05b0\7[\2\2\u05ae\u05b0\7\u00cd\2\2\u05af\u05aa\3" +
                    "\2\2\2\u05af\u05ae\3\2\2\2\u05b0\u0099\3\2\2\2\u05b1\u05b2\7x\2\2\u05b2" +
                    "\u05bb\5\u00c4c\2\u05b3\u05b4\7\u00b4\2\2\u05b4\u05b5\7\u00d8\2\2\u05b5" +
                    "\u05b6\5\u00c4c\2\u05b6\u05b7\7\u00e2\2\2\u05b7\u05bb\3\2\2\2\u05b8\u05b9" +
                    "\7\u00b4\2\2\u05b9\u05bb\5\u00c4c\2\u05ba\u05b1\3\2\2\2\u05ba\u05b3\3" +
                    "\2\2\2\u05ba\u05b8\3\2\2\2\u05bb\u009b\3\2\2\2\u05bc\u05bd\7\u0091\2\2" +
                    "\u05bd\u05c0\5\u00a4S\2\u05be\u05bf\7w\2\2\u05bf\u05c1\5\u00a4S\2\u05c0" +
                    "\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u009d\3\2\2\2\u05c2\u05c5\5\u00c8" +
                    "e\2\u05c3\u05c4\t\17\2\2\u05c4\u05c6\5\u00c8e\2\u05c5\u05c3\3\2\2\2\u05c5" +
                    "\u05c6\3\2\2\2\u05c6\u009f\3\2\2\2\u05c7\u05cc\5\u00a2R\2\u05c8\u05c9" +
                    "\7\u00cd\2\2\u05c9\u05cb\5\u00a2R\2\u05ca\u05c8\3\2\2\2\u05cb\u05ce\3" +
                    "\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u00a1\3\2\2\2\u05ce" +
                    "\u05cc\3\2\2\2\u05cf\u05d1\5\u00c8e\2\u05d0\u05d2\t\20\2\2\u05d1\u05d0" +
                    "\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d5\3\2\2\2\u05d3\u05d4\7v\2\2\u05d4" +
                    "\u05d6\t\21\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d9\3" +
                    "\2\2\2\u05d7\u05d8\7\33\2\2\u05d8\u05da\7\u00c7\2\2\u05d9\u05d7\3\2\2" +
                    "\2\u05d9\u05da\3\2\2\2\u05da\u00a3\3\2\2\2\u05db\u05de\5\u00e2r\2\u05dc" +
                    "\u05dd\7\u00e4\2\2\u05dd\u05df\5\u00e2r\2\u05de\u05dc\3\2\2\2\u05de\u05df" +
                    "\3\2\2\2\u05df\u00a5\3\2\2\2\u05e0\u05e5\5\u00a8U\2\u05e1\u05e2\7\u00cd" +
                    "\2\2\u05e2\u05e4\5\u00a8U\2\u05e3\u05e1\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5" +
                    "\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u00a7\3\2\2\2\u05e7\u05e5\3\2" +
                    "\2\2\u05e8\u05e9\5\u00eex\2\u05e9\u05ea\7\u00d2\2\2\u05ea\u05eb\5\u00e4" +
                    "s\2\u05eb\u00a9\3\2\2\2\u05ec\u05ee\5\u00acW\2\u05ed\u05ec\3\2\2\2\u05ed" +
                    "\u05ee\3\2\2\2\u05ee\u05f0\3\2\2\2\u05ef\u05f1\5\u00aeX\2\u05f0\u05ef" +
                    "\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05f4\5\u00b0Y" +
                    "\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u00ab\3\2\2\2\u05f5\u05f6" +
                    "\7\177\2\2\u05f6\u05f7\7\24\2\2\u05f7\u05f8\5\u00c4c\2\u05f8\u00ad\3\2" +
                    "\2\2\u05f9\u05fa\7{\2\2\u05fa\u05fb\7\24\2\2\u05fb\u05fc\5\u00a0Q\2\u05fc" +
                    "\u00af\3\2\2\2\u05fd\u05fe\t\22\2\2\u05fe\u05ff\5\u00b2Z\2\u05ff\u00b1" +
                    "\3\2\2\2\u0600\u0607\5\u00b4[\2\u0601\u0602\7\22\2\2\u0602\u0603\5\u00b4" +
                    "[\2\u0603\u0604\7\b\2\2\u0604\u0605\5\u00b4[\2\u0605\u0607\3\2\2\2\u0606" +
                    "\u0600\3\2\2\2\u0606\u0601\3\2\2\2\u0607\u00b3\3\2\2\2\u0608\u0609\7\"" +
                    "\2\2\u0609\u0615\7\u008f\2\2\u060a\u060b\7\u00b0\2\2\u060b\u0615\7\u0081" +
                    "\2\2\u060c\u060d\7\u00b0\2\2\u060d\u0615\7A\2\2\u060e\u060f\5\u00e2r\2" +
                    "\u060f\u0610\7\u0081\2\2\u0610\u0615\3\2\2\2\u0611\u0612\5\u00e2r\2\u0612" +
                    "\u0613\7A\2\2\u0613\u0615\3\2\2\2\u0614\u0608\3\2\2\2\u0614\u060a\3\2" +
                    "\2\2\u0614\u060c\3\2\2\2\u0614\u060e\3\2\2\2\u0614\u0611\3\2\2\2\u0615" +
                    "\u00b5\3\2\2\2\u0616\u0617\7\u0096\2\2\u0617\u0618\5\u00a6T\2\u0618\u00b7" +
                    "\3\2\2\2\u0619\u061a\7\u0098\2\2\u061a\u061b\7\37\2\2\u061b\u061c\7#\2" +
                    "\2\u061c\u0644\5\u00dep\2\u061d\u061e\7\u0098\2\2\u061e\u061f\7\37\2\2" +
                    "\u061f\u0620\7\60\2\2\u0620\u0644\5\u00d8m\2\u0621\u0622\7\u0098\2\2\u0622" +
                    "\u0624\7\37\2\2\u0623\u0625\7\u00a2\2\2\u0624\u0623\3\2\2\2\u0624\u0625" +
                    "\3\2\2\2\u0625\u0627\3\2\2\2\u0626\u0628\7\u00a0\2\2\u0627\u0626\3\2\2" +
                    "\2\u0627\u0628\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u0644\5\u00d8m\2\u062a" +
                    "\u062b\7\u0098\2\2\u062b\u0644\7$\2\2\u062c\u062d\7\u0098\2\2\u062d\u0630" +
                    "\7/\2\2\u062e\u062f\7E\2\2\u062f\u0631\5\u00dep\2\u0630\u062e\3\2\2\2" +
                    "\u0630\u0631\3\2\2\2\u0631\u0644\3\2\2\2\u0632\u0634\7\u0098\2\2\u0633" +
                    "\u0635\7\u00a2\2\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636" +
                    "\3\2\2\2\u0636\u0639\7\u00a1\2\2\u0637\u0638\t\23\2\2\u0638\u063a\5\u00de" +
                    "p\2\u0639\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063e\3\2\2\2\u063b" +
                    "\u063c\7c\2\2\u063c\u063f\7\u00c7\2\2\u063d\u063f\5\u0084C\2\u063e\u063b" +
                    "\3\2\2\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0641\3\2\2\2\u0640" +
                    "\u0642\5\u0090I\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644" +
                    "\3\2\2\2\u0643\u0619\3\2\2\2\u0643\u061d\3\2\2\2\u0643\u0621\3\2\2\2\u0643" +
                    "\u062a\3\2\2\2\u0643\u062c\3\2\2\2\u0643\u0632\3\2\2\2\u0644\u00b9\3\2" +
                    "\2\2\u0645\u0646\7\u009f\2\2\u0646\u0647\7@\2\2\u0647\u0648\7\63\2\2\u0648" +
                    "\u0668\5\u00d8m\2\u0649\u064a\7\u009f\2\2\u064a\u064b\7@\2\2\u064b\u0668" +
                    "\7g\2\2\u064c\u064d\7\u009f\2\2\u064d\u064e\7\u0087\2\2\u064e\u0668\7" +
                    "/\2\2\u064f\u0650\7\u009f\2\2\u0650\u0651\7\u0087\2\2\u0651\u0652\7\60" +
                    "\2\2\u0652\u0668\5\u00d8m\2\u0653\u0654\7\u009f\2\2\u0654\u065c\t\24\2" +
                    "\2\u0655\u0656\7\63\2\2\u0656\u065d\7\u0095\2\2\u0657\u065d\7=\2\2\u0658" +
                    "\u065a\7\u00ae\2\2\u0659\u0658\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065b" +
                    "\3\2\2\2\u065b\u065d\7k\2\2\u065c\u0655\3\2\2\2\u065c\u0657\3\2\2\2\u065c" +
                    "\u0659\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0668\5\u00d8m\2\u065f\u0660" +
                    "\7\u009f\2\2\u0660\u0661\t\24\2\2\u0661\u0662\7\u008c\2\2\u0662\u0668" +
                    "\7\u0095\2\2\u0663\u0664\7\u009f\2\2\u0664\u0665\7\u009d\2\2\u0665\u0666" +
                    "\7\u008b\2\2\u0666\u0668\5\u00d8m\2\u0667\u0645\3\2\2\2\u0667\u0649\3" +
                    "\2\2\2\u0667\u064c\3\2\2\2\u0667\u064f\3\2\2\2\u0667\u0653\3\2\2\2\u0667" +
                    "\u065f\3\2\2\2\u0667\u0663\3\2\2\2\u0668\u00bb\3\2\2\2\u0669\u066b\7\u00ad" +
                    "\2\2\u066a\u066c\7\u00a2\2\2\u066b\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c" +
                    "\u066e\3\2\2\2\u066d\u066f\7\u00a0\2\2\u066e\u066d\3\2\2\2\u066e\u066f" +
                    "\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u0671\7O\2\2\u0671\u0673\79\2\2\u0672" +
                    "\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676\5\u00d8" +
                    "m\2\u0675\u0677\5\62\32\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677" +
                    "\u00bd\3\2\2\2\u0678\u0679\7\u00b3\2\2\u0679\u067a\5\u00dep\2\u067a\u00bf" +
                    "\3\2\2\2\u067b\u067c\7\u00b9\2\2\u067c\u067e\5\u00d8m\2\u067d\u067f\7" +
                    "8\2\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0682\3\2\2\2\u0680" +
                    "\u0681\7d\2\2\u0681\u0683\7\u00c5\2\2\u0682\u0680\3\2\2\2\u0682\u0683" +
                    "\3\2\2\2\u0683\u00c1\3\2\2\2\u0684\u06b4\5\u00eex\2\u0685\u0686\5\u00ee" +
                    "x\2\u0686\u0687\7\u00d8\2\2\u0687\u0688\5\u00eex\2\u0688\u068f\5\u00c2" +
                    "b\2\u0689\u068a\7\u00cd\2\2\u068a\u068b\5\u00eex\2\u068b\u068c\5\u00c2" +
                    "b\2\u068c\u068e\3\2\2\2\u068d\u0689\3\2\2\2\u068e\u0691\3\2\2\2\u068f" +
                    "\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0692\3\2\2\2\u0691\u068f\3\2" +
                    "\2\2\u0692\u0693\7\u00e2\2\2\u0693\u06b4\3\2\2\2\u0694\u0695\5\u00eex" +
                    "\2\u0695\u0696\7\u00d8\2\2\u0696\u069b\5\u00f2z\2\u0697\u0698\7\u00cd" +
                    "\2\2\u0698\u069a\5\u00f2z\2\u0699\u0697\3\2\2\2\u069a\u069d\3\2\2\2\u069b" +
                    "\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\3\2\2\2\u069d\u069b\3\2" +
                    "\2\2\u069e\u069f\7\u00e2\2\2\u069f\u06b4\3\2\2\2\u06a0\u06a1\5\u00eex" +
                    "\2\u06a1\u06a2\7\u00d8\2\2\u06a2\u06a7\5\u00c2b\2\u06a3\u06a4\7\u00cd" +
                    "\2\2\u06a4\u06a6\5\u00c2b\2\u06a5\u06a3\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7" +
                    "\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2\2\2\u06a9\u06a7\3\2" +
                    "\2\2\u06aa\u06ab\7\u00e2\2\2\u06ab\u06b4\3\2\2\2\u06ac\u06ad\5\u00eex" +
                    "\2\u06ad\u06af\7\u00d8\2\2\u06ae\u06b0\5\u00c4c\2\u06af\u06ae\3\2\2\2" +
                    "\u06af\u06b0\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\7\u00e2\2\2\u06b2" +
                    "\u06b4\3\2\2\2\u06b3\u0684\3\2\2\2\u06b3\u0685\3\2\2\2\u06b3\u0694\3\2" +
                    "\2\2\u06b3\u06a0\3\2\2\2\u06b3\u06ac\3\2\2\2\u06b4\u00c3\3\2\2\2\u06b5" +
                    "\u06ba\5\u00c6d\2\u06b6\u06b7\7\u00cd\2\2\u06b7\u06b9\5\u00c6d\2\u06b8" +
                    "\u06b6\3\2\2\2\u06b9\u06bc\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2" +
                    "\2\2\u06bb\u00c5\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bd\u06be\5\u00d8m\2\u06be" +
                    "\u06bf\7\u00d0\2\2\u06bf\u06c1\3\2\2\2\u06c0\u06bd\3\2\2\2\u06c0\u06c1" +
                    "\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c9\7\u00c9\2\2\u06c3\u06c4\7\u00d8" +
                    "\2\2\u06c4\u06c5\5r:\2\u06c5\u06c6\7\u00e2\2\2\u06c6\u06c9\3\2\2\2\u06c7" +
                    "\u06c9\5\u00c8e\2\u06c8\u06c0\3\2\2\2\u06c8\u06c3\3\2\2\2\u06c8\u06c7" +
                    "\3\2\2\2\u06c9\u00c7\3\2\2\2\u06ca\u06cb\be\1\2\u06cb\u06cd\7\25\2\2\u06cc" +
                    "\u06ce\5\u00c8e\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d4" +
                    "\3\2\2\2\u06cf\u06d0\7\u00bb\2\2\u06d0\u06d1\5\u00c8e\2\u06d1\u06d2\7" +
                    "\u00a4\2\2\u06d2\u06d3\5\u00c8e\2\u06d3\u06d5\3\2\2\2\u06d4\u06cf\3\2" +
                    "\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7" +
                    "\u06da\3\2\2\2\u06d8\u06d9\7\65\2\2\u06d9\u06db\5\u00c8e\2\u06da\u06d8" +
                    "\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd\7\66\2\2" +
                    "\u06dd\u074c\3\2\2\2\u06de\u06df\7\26\2\2\u06df\u06e0\7\u00d8\2\2\u06e0" +
                    "\u06e1\5\u00c8e\2\u06e1\u06e2\7\f\2\2\u06e2\u06e3\5\u00c2b\2\u06e3\u06e4" +
                    "\7\u00e2\2\2\u06e4\u074c\3\2\2\2\u06e5\u06e6\7%\2\2\u06e6\u074c\7\u00c7" +
                    "\2\2\u06e7\u06e8\7<\2\2\u06e8\u06e9\7\u00d8\2\2\u06e9\u06ea\5\u00e6t\2" +
                    "\u06ea\u06eb\7E\2\2\u06eb\u06ec\5\u00c8e\2\u06ec\u06ed\7\u00e2\2\2\u06ed" +
                    "\u074c\3\2\2\2\u06ee\u06ef\7W\2\2\u06ef\u06f0\5\u00c8e\2\u06f0\u06f1\5" +
                    "\u00e6t\2\u06f1\u074c\3\2\2\2\u06f2\u06f3\7\u009c\2\2\u06f3\u06f4\7\u00d8" +
                    "\2\2\u06f4\u06f5\5\u00c8e\2\u06f5\u06f6\7E\2\2\u06f6\u06f9\5\u00c8e\2" +
                    "\u06f7\u06f8\7B\2\2\u06f8\u06fa\5\u00c8e\2\u06f9\u06f7\3\2\2\2\u06f9\u06fa" +
                    "\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\7\u00e2\2\2\u06fc\u074c\3\2\2" +
                    "\2\u06fd\u06fe\7\u00a7\2\2\u06fe\u074c\7\u00c7\2\2\u06ff\u0700\7\u00ac" +
                    "\2\2\u0700\u0701\7\u00d8\2\2\u0701\u0702\t\25\2\2\u0702\u0703\7\u00c7" +
                    "\2\2\u0703\u0704\7E\2\2\u0704\u0705\5\u00c8e\2\u0705\u0706\7\u00e2\2\2" +
                    "\u0706\u074c\3\2\2\2\u0707\u0708\5\u00eex\2\u0708\u070a\7\u00d8\2\2\u0709" +
                    "\u070b\5\u00c4c\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c" +
                    "\3\2\2\2\u070c\u070d\7\u00e2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\7~\2" +
                    "\2\u070f\u0710\7\u00d8\2\2\u0710\u0711\5\u00aaV\2\u0711\u0712\7\u00e2" +
                    "\2\2\u0712\u074c\3\2\2\2\u0713\u0714\5\u00eex\2\u0714\u0716\7\u00d8\2" +
                    "\2\u0715\u0717\5\u00c4c\2\u0716\u0715\3\2\2\2\u0716\u0717\3\2\2\2\u0717" +
                    "\u0718\3\2\2\2\u0718\u0719\7\u00e2\2\2\u0719\u071a\3\2\2\2\u071a\u071b" +
                    "\7~\2\2\u071b\u071c\5\u00eex\2\u071c\u074c\3\2\2\2\u071d\u0723\5\u00ee" +
                    "x\2\u071e\u0720\7\u00d8\2\2\u071f\u0721\5\u00c4c\2\u0720\u071f\3\2\2\2" +
                    "\u0720\u0721\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0724\7\u00e2\2\2\u0723" +
                    "\u071e\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0727\7\u00d8" +
                    "\2\2\u0726\u0728\7\62\2\2\u0727\u0726\3\2\2\2\u0727\u0728\3\2\2\2\u0728" +
                    "\u072a\3\2\2\2\u0729\u072b\5\u00caf\2\u072a\u0729\3\2\2\2\u072a\u072b" +
                    "\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\7\u00e2\2\2\u072d\u074c\3\2\2" +
                    "\2\u072e\u074c\5\u00e4s\2\u072f\u0730\7\u00cf\2\2\u0730\u074c\5\u00c8" +
                    "e\23\u0731\u0732\7t\2\2\u0732\u074c\5\u00c8e\16\u0733\u0734\5\u00d8m\2" +
                    "\u0734\u0735\7\u00d0\2\2\u0735\u0737\3\2\2\2\u0736\u0733\3\2\2\2\u0736" +
                    "\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u074c\7\u00c9\2\2\u0739\u073a" +
                    "\7\u00d8\2\2\u073a\u073b\5r:\2\u073b\u073c\7\u00e2\2\2\u073c\u074c\3\2" +
                    "\2\2\u073d\u073e\7\u00d8\2\2\u073e\u073f\5\u00c8e\2\u073f\u0740\7\u00e2" +
                    "\2\2\u0740\u074c\3\2\2\2\u0741\u0742\7\u00d8\2\2\u0742\u0743\5\u00c4c" +
                    "\2\u0743\u0744\7\u00e2\2\2\u0744\u074c\3\2\2\2\u0745\u0747\7\u00d6\2\2" +
                    "\u0746\u0748\5\u00c4c\2\u0747\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748" +
                    "\u0749\3\2\2\2\u0749\u074c\7\u00e1\2\2\u074a\u074c\5\u00d0i\2\u074b\u06ca" +
                    "\3\2\2\2\u074b\u06de\3\2\2\2\u074b\u06e5\3\2\2\2\u074b\u06e7\3\2\2\2\u074b" +
                    "\u06ee\3\2\2\2\u074b\u06f2\3\2\2\2\u074b\u06fd\3\2\2\2\u074b\u06ff\3\2" +
                    "\2\2\u074b\u0707\3\2\2\2\u074b\u0713\3\2\2\2\u074b\u071d\3\2\2\2\u074b" +
                    "\u072e\3\2\2\2\u074b\u072f\3\2\2\2\u074b\u0731\3\2\2\2\u074b\u0736\3\2" +
                    "\2\2\u074b\u0739\3\2\2\2\u074b\u073d\3\2\2\2\u074b\u0741\3\2\2\2\u074b" +
                    "\u0745\3\2\2\2\u074b\u074a\3\2\2\2\u074c\u0794\3\2\2\2\u074d\u074e\f\22" +
                    "\2\2\u074e\u074f\t\26\2\2\u074f\u0793\5\u00c8e\23\u0750\u0751\f\21\2\2" +
                    "\u0751\u0752\t\27\2\2\u0752\u0793\5\u00c8e\22\u0753\u0766\f\20\2\2\u0754" +
                    "\u0767\7\u00d1\2\2\u0755\u0767\7\u00d2\2\2\u0756\u0767\7\u00da\2\2\u0757" +
                    "\u0767\7\u00d7\2\2\u0758\u0767\7\u00d3\2\2\u0759\u0767\7\u00d9\2\2\u075a" +
                    "\u0767\7\u00d4\2\2\u075b\u075d\7H\2\2\u075c\u075b\3\2\2\2\u075c\u075d" +
                    "\3\2\2\2\u075d\u075f\3\2\2\2\u075e\u0760\7t\2\2\u075f\u075e\3\2\2\2\u075f" +
                    "\u0760\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0767\7Q\2\2\u0762\u0764\7t\2" +
                    "\2\u0763\u0762\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767" +
                    "\t\30\2\2\u0766\u0754\3\2\2\2\u0766\u0755\3\2\2\2\u0766\u0756\3\2\2\2" +
                    "\u0766\u0757\3\2\2\2\u0766\u0758\3\2\2\2\u0766\u0759\3\2\2\2\u0766\u075a" +
                    "\3\2\2\2\u0766\u075c\3\2\2\2\u0766\u0763\3\2\2\2\u0767\u0768\3\2\2\2\u0768" +
                    "\u0793\5\u00c8e\21\u0769\u076a\f\r\2\2\u076a\u076b\7\b\2\2\u076b\u0793" +
                    "\5\u00c8e\16\u076c\u076d\f\f\2\2\u076d\u076e\7z\2\2\u076e\u0793\5\u00c8" +
                    "e\r\u076f\u0771\f\13\2\2\u0770\u0772\7t\2\2\u0771\u0770\3\2\2\2\u0771" +
                    "\u0772\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\7\22\2\2\u0774\u0775\5" +
                    "\u00c8e\2\u0775\u0776\7\b\2\2\u0776\u0777\5\u00c8e\f\u0777\u0793\3\2\2" +
                    "\2\u0778\u0779\f\n\2\2\u0779\u077a\7\u00dd\2\2\u077a\u077b\5\u00c8e\2" +
                    "\u077b\u077c\7\u00cc\2\2\u077c\u077d\5\u00c8e\n\u077d\u0793\3\2\2\2\u077e" +
                    "\u077f\f\25\2\2\u077f\u0780\7\u00d6\2\2\u0780\u0781\5\u00c8e\2\u0781\u0782" +
                    "\7\u00e1\2\2\u0782\u0793\3\2\2\2\u0783\u0784\f\24\2\2\u0784\u0785\7\u00d0" +
                    "\2\2\u0785\u0793\7\u00c5\2\2\u0786\u0787\f\17\2\2\u0787\u0789\7Y\2\2\u0788" +
                    "\u078a\7t\2\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2" +
                    "\2\2\u078b\u0793\7u\2\2\u078c\u0790\f\t\2\2\u078d\u0791\5\u00ecw\2\u078e" +
                    "\u078f\7\f\2\2\u078f\u0791\5\u00eex\2\u0790\u078d\3\2\2\2\u0790\u078e" +
                    "\3\2\2\2\u0791\u0793\3\2\2\2\u0792\u074d\3\2\2\2\u0792\u0750\3\2\2\2\u0792" +
                    "\u0753\3\2\2\2\u0792\u0769\3\2\2\2\u0792\u076c\3\2\2\2\u0792\u076f\3\2" +
                    "\2\2\u0792\u0778\3\2\2\2\u0792\u077e\3\2\2\2\u0792\u0783\3\2\2\2\u0792" +
                    "\u0786\3\2\2\2\u0792\u078c\3\2\2\2\u0793\u0796\3\2\2\2\u0794\u0792\3\2" +
                    "\2\2\u0794\u0795\3\2\2\2\u0795\u00c9\3\2\2\2\u0796\u0794\3\2\2\2\u0797" +
                    "\u079c\5\u00ccg\2\u0798\u0799\7\u00cd\2\2\u0799\u079b\5\u00ccg\2\u079a" +
                    "\u0798\3\2\2\2\u079b\u079e\3\2\2\2\u079c\u079a\3\2\2\2\u079c\u079d\3\2" +
                    "\2\2\u079d\u00cb\3\2\2\2\u079e\u079c\3\2\2\2\u079f\u07a2\5\u00ceh\2\u07a0" +
                    "\u07a2\5\u00c8e\2\u07a1\u079f\3\2\2\2\u07a1\u07a0\3\2\2\2\u07a2\u00cd" +
                    "\3\2\2\2\u07a3\u07a4\7\u00d8\2\2\u07a4\u07a9\5\u00eex\2\u07a5\u07a6\7" +
                    "\u00cd\2\2\u07a6\u07a8\5\u00eex\2\u07a7\u07a5\3\2\2\2\u07a8\u07ab\3\2" +
                    "\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ac\3\2\2\2\u07ab" +
                    "\u07a9\3\2\2\2\u07ac\u07ad\7\u00e2\2\2\u07ad\u07b7\3\2\2\2\u07ae\u07b3" +
                    "\5\u00eex\2\u07af\u07b0\7\u00cd\2\2\u07b0\u07b2\5\u00eex\2\u07b1\u07af" +
                    "\3\2\2\2\u07b2\u07b5\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4" +
                    "\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b6\u07a3\3\2\2\2\u07b6\u07ae\3\2" +
                    "\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b9\7\u00c8\2\2\u07b9\u07ba\5\u00c8e" +
                    "\2\u07ba\u00cf\3\2\2\2\u07bb\u07bc\5\u00d8m\2\u07bc\u07bd\7\u00d0\2\2" +
                    "\u07bd\u07bf\3\2\2\2\u07be\u07bb\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c0" +
                    "\3\2\2\2\u07c0\u07c1\5\u00d2j\2\u07c1\u00d1\3\2\2\2\u07c2\u07c5\5\u00ee" +
                    "x\2\u07c3\u07c4\7\u00d0\2\2\u07c4\u07c6\5\u00eex\2\u07c5\u07c3\3\2\2\2" +
                    "\u07c5\u07c6\3\2\2\2\u07c6\u00d3\3\2\2\2\u07c7\u07c8\bk\1\2\u07c8\u07cf" +
                    "\5\u00d8m\2\u07c9\u07cf\5\u00d6l\2\u07ca\u07cb\7\u00d8\2\2\u07cb\u07cc" +
                    "\5r:\2\u07cc\u07cd\7\u00e2\2\2\u07cd\u07cf\3\2\2\2\u07ce\u07c7\3\2\2\2" +
                    "\u07ce\u07c9\3\2\2\2\u07ce\u07ca\3\2\2\2\u07cf\u07d8\3\2\2\2\u07d0\u07d4" +
                    "\f\3\2\2\u07d1\u07d5\5\u00ecw\2\u07d2\u07d3\7\f\2\2\u07d3\u07d5\5\u00ee" +
                    "x\2\u07d4\u07d1\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d5\u07d7\3\2\2\2\u07d6" +
                    "\u07d0\3\2\2\2\u07d7\u07da\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d8\u07d9\3\2" +
                    "\2\2\u07d9\u00d5\3\2\2\2\u07da\u07d8\3\2\2\2\u07db\u07dc\5\u00eex\2\u07dc" +
                    "\u07de\7\u00d8\2\2\u07dd\u07df\5\u00dan\2\u07de\u07dd\3\2\2\2\u07de\u07df" +
                    "\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\7\u00e2\2\2\u07e1\u00d7\3\2\2" +
                    "\2\u07e2\u07e3\5\u00dep\2\u07e3\u07e4\7\u00d0\2\2\u07e4\u07e6\3\2\2\2" +
                    "\u07e5\u07e2\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8" +
                    "\5\u00eex\2\u07e8\u00d9\3\2\2\2\u07e9\u07ee\5\u00dco\2\u07ea\u07eb\7\u00cd" +
                    "\2\2\u07eb\u07ed\5\u00dco\2\u07ec\u07ea\3\2\2\2\u07ed\u07f0\3\2\2\2\u07ee" +
                    "\u07ec\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u00db\3\2\2\2\u07f0\u07ee\3\2" +
                    "\2\2\u07f1\u07f5\5\u00d2j\2\u07f2\u07f5\5\u00d6l\2\u07f3\u07f5\5\u00e4" +
                    "s\2\u07f4\u07f1\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f3\3\2\2\2\u07f5" +
                    "\u00dd\3\2\2\2\u07f6\u07f7\5\u00eex\2\u07f7\u00df\3\2\2\2\u07f8\u0801" +
                    "\7\u00c3\2\2\u07f9\u07fa\7\u00d0\2\2\u07fa\u0801\t\31\2\2\u07fb\u07fc" +
                    "\7\u00c5\2\2\u07fc\u07fe\7\u00d0\2\2\u07fd\u07ff\t\31\2\2\u07fe\u07fd" +
                    "\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0801\3\2\2\2\u0800\u07f8\3\2\2\2\u0800" +
                    "\u07f9\3\2\2\2\u0800\u07fb\3\2\2\2\u0801\u00e1\3\2\2\2\u0802\u0804\t\32" +
                    "\2\2\u0803\u0802\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u080b\3\2\2\2\u0805" +
                    "\u080c\5\u00e0q\2\u0806\u080c\7\u00c4\2\2\u0807\u080c\7\u00c5\2\2\u0808" +
                    "\u080c\7\u00c6\2\2\u0809\u080c\7S\2\2\u080a\u080c\7r\2\2\u080b\u0805\3" +
                    "\2\2\2\u080b\u0806\3\2\2\2\u080b\u0807\3\2\2\2\u080b\u0808\3\2\2\2\u080b" +
                    "\u0809\3\2\2\2\u080b\u080a\3\2\2\2\u080c\u00e3\3\2\2\2\u080d\u0811\5\u00e2" +
                    "r\2\u080e\u0811\7\u00c7\2\2\u080f\u0811\7u\2\2\u0810\u080d\3\2\2\2\u0810" +
                    "\u080e\3\2\2\2\u0810\u080f\3\2\2\2\u0811\u00e5\3\2\2\2\u0812\u0813\t\33" +
                    "\2\2\u0813\u00e7\3\2\2\2\u0814\u0815\t\34\2\2\u0815\u00e9\3\2\2\2\u0816" +
                    "\u0817\t\35\2\2\u0817\u00eb\3\2\2\2\u0818\u081b\7\u00c2\2\2\u0819\u081b" +
                    "\5\u00eav\2\u081a\u0818\3\2\2\2\u081a\u0819\3\2\2\2\u081b\u00ed\3\2\2" +
                    "\2\u081c\u0820\7\u00c2\2\2\u081d\u0820\5\u00e6t\2\u081e\u0820\5\u00e8" +
                    "u\2\u081f\u081c\3\2\2\2\u081f\u081d\3\2\2\2\u081f\u081e\3\2\2\2\u0820" +
                    "\u00ef\3\2\2\2\u0821\u0824\5\u00eex\2\u0822\u0824\7u\2\2\u0823\u0821\3" +
                    "\2\2\2\u0823\u0822\3\2\2\2\u0824\u00f1\3\2\2\2\u0825\u0826\7\u00c7\2\2" +
                    "\u0826\u0827\7\u00d2\2\2\u0827\u0828\5\u00e2r\2\u0828\u00f3\3\2\2\2\u0116" +
                    "\u00f8\u00fc\u00ff\u0102\u0117\u011a\u0122\u0127\u0134\u013d\u0144\u014c" +
                    "\u0151\u0158\u015d\u0164\u0169\u016f\u0175\u017a\u0180\u0185\u018b\u0190" +
                    "\u0196\u01a4\u01ab\u01b2\u01b9\u01bf\u01c4\u01ca\u01cf\u01d5\u01de\u01e8" +
                    "\u01f2\u0206\u020e\u021d\u0224\u0232\u0238\u023e\u0245\u0249\u024c\u0252" +
                    "\u0255\u025b\u025f\u0262\u026d\u0271\u0274\u0279\u027b\u027e\u0281\u028b" +
                    "\u028f\u0292\u0295\u029a\u029c\u02a4\u02a7\u02aa\u02b0\u02b4\u02b7\u02ba" +
                    "\u02bd\u02c0\u02c5\u02cb\u02cf\u02d2\u02d5\u02d9\u02e1\u02fb\u02fd\u0301" +
                    "\u0317\u0319\u0324\u0327\u0330\u0341\u034c\u035e\u036b\u037c\u0385\u03a0" +
                    "\u03a2\u03b7\u03bc\u03c1\u03c4\u03d0\u03d5\u03d9\u03dc\u03e0\u03e4\u03e9" +
                    "\u03ec\u03f0\u03f2\u0408\u0410\u0413\u041d\u0421\u0429\u042d\u0432\u0436" +
                    "\u043a\u043e\u0442\u0444\u044c\u0450\u0453\u045b\u0460\u0465\u0468\u0472" +
                    "\u047f\u0484\u0488\u0490\u0497\u049e\u04a2\u04a8\u04ab\u04ae\u04b1\u04bf" +
                    "\u04c3\u04c7\u04cc\u04cf\u04d9\u04e1\u04e4\u04e8\u04eb\u04ef\u04f2\u04f5" +
                    "\u04f8\u04fb\u04fe\u0502\u0506\u0509\u050c\u050f\u0512\u0515\u051e\u0524" +
                    "\u053f\u0555\u055d\u0560\u0566\u056e\u0571\u0577\u0579\u057d\u0582\u0585" +
                    "\u0588\u058c\u0590\u0593\u0595\u0598\u059c\u05a0\u05a3\u05a5\u05a7\u05aa" +
                    "\u05af\u05ba\u05c0\u05c5\u05cc\u05d1\u05d5\u05d9\u05de\u05e5\u05ed\u05f0" +
                    "\u05f3\u0606\u0614\u0624\u0627\u0630\u0634\u0639\u063e\u0641\u0643\u0659" +
                    "\u065c\u0667\u066b\u066e\u0672\u0676\u067e\u0682\u068f\u069b\u06a7\u06af" +
                    "\u06b3\u06ba\u06c0\u06c8\u06cd\u06d6\u06da\u06f9\u070a\u0716\u0720\u0723" +
                    "\u0727\u072a\u0736\u0747\u074b\u075c\u075f\u0763\u0766\u0771\u0789\u0790" +
                    "\u0792\u0794\u079c\u07a1\u07a9\u07b3\u07b6\u07be\u07c5\u07ce\u07d4\u07d8" +
                    "\u07de\u07e5\u07ee\u07f4\u07fe\u0800\u0803\u080b\u0810\u081a\u081f\u0823";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}