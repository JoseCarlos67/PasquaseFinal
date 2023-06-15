package codigo;
import static codigo.Tokens.*;

%% /*******************************************************************************************************************/

%class Lexer
%type Tokens
LETRA = [a-zA-Z_]+
DIGITO = [0-9]+
espaco = [ ,\t,\r]+
%{
    public String lexeme;
%}

%%/********************************************************************************************************************/

//Espacos em branco
{espaco} {/*Ignore*/}

//Ponto e virgula
( ";" ) {lexeme=yytext(); return pontoVirgula;}

//Ponto final
( "." ) {lexeme=yytext(); return pontoFinal;}

//Comentarios
\{([^\\\"]|\\.)*\} {lexeme=yytext(); return comentario;}

//Constante
( "constante" ) {lexeme=yytext(); return constante;}

//Variável
( "var" ) {lexeme=yytext(); return variavel;}

//Virgula
( ", " | "," ) {lexeme=yytext(); return virgula;}

//Dois pontos
( ":" ) {lexeme=yytext(); return dois_pontos;}

//Real
( "Real" ) {lexeme=yytext(); return Real;}

//Inteiro
( "Inteiro" ) {lexeme=yytext(); return Inteiro;}

//Funcao
( "funcao" ) {lexeme=yytext(); return funcao;}

//Procedimento
( "procedimento" ) {lexeme=yytext(); return procedimento;}

//Atribuicao
( "=" ) {lexeme=yytext(); return atribuicao;}

//Real
[-]?|{DIGITO}+"."{DIGITO}+ {lexeme=yytext(); return real;}

//Inteiro
[-]?|{DIGITO}+ {lexeme=yytext(); return inteiro;}

//Parentesis de apertura
( "(" ) {lexeme=yytext(); return abre_parenteses;}

//Parentesis de cierre
( ")" ) {lexeme=yytext(); return fecha_parenteses;}

//Para
( "para" ) {lexeme=yytext(); return para;}

//De
( "de" ) {lexeme=yytext(); return de;}

//Operadores logicos
( "e" | "ou" ) {lexeme=yytext(); return operador_logico;}

//Operadores Relacionais
( "nao") {lexeme=yytext(); return negacao;}

//Ate
( "ate" ) {lexeme=yytext(); return ate;}

//Faca
( "faca" ) {lexeme=yytext(); return faca;}

//Identificador
{LETRA}({LETRA}|{DIGITO})* {lexeme=yytext(); return id;}

//Salto de linha
( "\n" ) {lexeme=yytext(); return linha;}

//palavra
\"([^\\\"]|\\.)*\" {lexeme=yytext(); return palavra;}

//Caractere
\'([^\\\"]|\\.)\' {lexeme=yytext(); return caractere;}

//Soma
( "+" ) {lexeme=yytext(); return soma;}

//subtracao
( "-" ) {lexeme=yytext(); return subtracao;}

//Multiplicacao
( "*" ) {lexeme=yytext(); return multiplicacao;}

//Divisao
( "/" ) {lexeme=yytext(); return divisao;}

//Potencia
( "^" ) {lexeme=yytext(); return potencia;}

//Resto
( "%" ) {lexeme=yytext(); return resto;}

//aspas_duplas
( "\"" ) {lexeme=yytext(); return aspas_duplas;}

//Operadores Relacionais
( ">" | "<" | "==" | "<>" | ">=" | "<=" ) {lexeme=yytext(); return operadores_relacionais;}

// Error de analisis
 . {lexeme=yytext(); return ERROR;}