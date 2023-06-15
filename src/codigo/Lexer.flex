package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
NUMERO=[0-9]+
espaco=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

/* espacos en blanco */
{espaco} {/*Ignore*/}

/* Ponto e virgula  */
( ";" ) {lexeme=yytext(); return pontoVirgula;}

/* Ponto final  */
( "." ) {lexeme=yytext(); return pf;}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Constante */
( "constante" ) {lexeme=yytext(); return constante;}

/* Variável */
( "var" ) {lexeme=yytext(); return var;}

/* Virgula */
( ", " | "," ) {lexeme=yytext(); return virgula;}

/* Dois pontos */
( ":" ) {lexeme=yytext(); return dois_pontos;}

/* Real */
( "Real" ) {lexeme=yytext(); return Real;}

/* Inteiro */
( "Inteiro" ) {lexeme=yytext(); return Inteiro;}

/* Funcao */
( "funcao" ) {lexeme=yytext(); return funcao;}

/* Procedimento */
( "procedimento" ) {lexeme=yytext(); return procedimento;}

/* Atribuicao */
( "=" ) {lexeme=yytext(); return atribuicao;}

/*Real*/
[-]?|{NUMERO}+"."{NUMERO}+ {lexeme=yytext(); return real;}

/*Inteiro*/
[-]?|{NUMERO}+ {lexeme=yytext(); return inteiro;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return abre_parenteses;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return fecha_parenteses;}

/* Para */
( "para" ) {lexeme=yytext(); return para;}

/* De */
( "de" ) {lexeme=yytext(); return de;}

/* Ate */
( "ate" ) {lexeme=yytext(); return ate;}

/* Faca */
( "faca" ) {lexeme=yytext(); return faca;}

/* Identificador */
{L}({L}|{NUMERO})* {lexeme=yytext(); return id;}



/*************************************************************************/

/* Pular linha */
/*( "\n" ) {return Linha;}

/* aspas_duplas */
( "\"" ) {lexeme=yytext(); return aspas_duplas;}

/* Tipos de datos */
( byte | int | char | long | float | double ) {lexeme=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexeme=yytext(); return palavra;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexeme=yytext(); return Do;}

/* Palabra reservada While */
( while ) {lexeme=yytext(); return While;}

/* Palabra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Operador igual */
( "=" ) {lexeme=yytext(); return igual;}

/* Operador soma */
( "+" ) {lexeme=yytext(); return soma;}

/* Operador subtracao */
( "-" ) {lexeme=yytext(); return subtracao;}

/* Operador multiplicacao */
( "*" ) {lexeme=yytext(); return multiplicacao;}

/* Operador divisao */
( "/" ) {lexeme=yytext(); return divisao;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return operador_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return operadores_relacionais;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexeme=yytext(); return Main;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}*/




/* Error de analisis */
 . {return ERROR;}
