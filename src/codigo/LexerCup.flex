package codigo;
import java_cup.runtime.Symbol;

%%/********************************************************************************************************************/

%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
LETRA = [a-zA-Z_]+
DIGITO = [0-9]+
espaco = [ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%%/********************************************************************************************************************/

/* bibIO  */
( "bibIO" ) {return new Symbol(sym.bibIO, yychar, yyline, yytext());}

/* Ponto e virgula  */
( ";" ) {return new Symbol(sym.pontoVirgula, yychar, yyline, yytext());}

/* comentario  */
\{([^\\\"]|\\.)*\} {return new Symbol(sym.comentario, yychar, yyline, yytext());}

/* utilize  */
( "utilize" ) {return new Symbol(sym.utilize, yychar, yyline, yytext());}

/* ini  */
( "inicio" ) {return new Symbol(sym.ini, yychar, yyline, yytext());}

/* fim  */
( "fim" ) {return new Symbol(sym.fim, yychar, yyline, yytext());}

/* .  */
( "." ) {return new Symbol(sym.pontoFinal, yychar, yyline, yytext());}

/* programa  */
( "programa" ) {return new Symbol(sym.programa, yychar, yyline, yytext());}

/* inteiro */
("(-"{DIGITO}+")")|{DIGITO}+ {return new Symbol(sym.inteiro, yychar, yyline, yytext());}

/* real */
{DIGITO}+"."{DIGITO}+ | "(-"{DIGITO}+"."{DIGITO}+")" {return new Symbol(sym.real, yychar, yyline, yytext());}

/* Constante */
("const") {return new Symbol(sym.constante, yychar, yyline, yytext());}

/* Real */
( "Real" ) {return new Symbol(sym.Real, yychar, yyline, yytext());}

/* Palavra */
( "Palavra" ) {return new Symbol(sym.Palavra, yychar, yyline, yytext());}

/* Caractere */
( "Caractere" ) {return new Symbol(sym.Caractere, yychar, yyline, yytext());}

/* caractere */
\'([^\\\"]|\\.)\' {return new Symbol(sym.caractere, yychar, yyline, yytext());}

/* Inteiro */
( "Inteiro" ) {return new Symbol(sym.Inteiro, yychar, yyline, yytext());}

/* Variavel */
( "var" ) {return new Symbol(sym.variavel, yychar, yyline, yytext());}

/* Virgula */
(", " | ",") {return new Symbol(sym.virgula, yychar, yyline, yytext());}

/* Dois pontos */
( ":" ) {return new Symbol(sym.dois_pontos, yychar, yyline, yytext());}

/* Funcao */
( "funcao" ) {return new Symbol(sym.funcao, yychar, yyline, yytext());}

/* Procedimento */
( "procedimento" ) {return new Symbol(sym.procedimento, yychar, yyline, yytext());}

/* Para */
( "para" ) {return new Symbol(sym.para, yychar, yyline, yytext());}

/* De */
( "de" ) {return new Symbol(sym.de, yychar, yyline, yytext());}

/* Ate */
( "ate" ) {return new Symbol(sym.ate, yychar, yyline, yytext());}

/* Faca */
( "faca" ) {return new Symbol(sym.faca, yychar, yyline, yytext());}

/* Enquanto */
( "enquanto" ) {return new Symbol(sym.enquanto, yychar, yyline, yytext());}

/* Se */
( "se" ) {return new Symbol(sym.se, yychar, yyline, yytext());}

/* Senao*/
( "senao" ) {return new Symbol(sym.senao, yychar, yyline, yytext());}

/* Entao */
( "entao" ) {return new Symbol(sym.entao, yychar, yyline, yytext());}

/* Escreva */
( "escreva" ) {return new Symbol(sym.escreva, yychar, yyline, yytext());}

/* Escrevaln */
( "escrevaln" ) {return new Symbol(sym.escrevaln, yychar, yyline, yytext());}

/*Operadores Logicos */
( "e" | "ou" ) {return new Symbol(sym.operador_logico, yychar, yyline, yytext());}

/*Negacao */
( "nao") {return new Symbol(sym.negacao, yychar, yyline, yytext());}

/* Leia */
( "leia" ) {return new Symbol(sym.leia, yychar, yyline, yytext());}

/* Leialn */
( "leialn" ) {return new Symbol(sym.leialn, yychar, yyline, yytext());}

/* Atribuicao */
( "=" ) {return new Symbol(sym.atribuicao, yychar, yyline, yytext());}

/* Soma */
( "+" ) {return new Symbol(sym.soma, yychar, yyline, yytext());}

/* subtracao */
( "-" ) {return new Symbol(sym.subtracao, yychar, yyline, yytext());}

/* Multiplicacao */
( "*" ) {return new Symbol(sym.multiplicacao, yychar, yyline, yytext());}

/* Divisao */
( "/" ) {return new Symbol(sym.divisao, yychar, yyline, yytext());}

/* Potencia */
( "^" ) {return new Symbol(sym.potencia, yychar, yyline, yytext());}

//Resto da divisao
( "%" ) {return new Symbol(sym.resto, yychar, yyline, yytext());}

//Abre parenteses
( "(" ) {return new Symbol(sym.abre_parenteses, yychar, yyline, yytext());}

//Fecha parenteses
( ")" ) {return new Symbol(sym.fecha_parenteses, yychar, yyline, yytext());}

//TIPO boleano
( "Booleano" ) {return new Symbol(sym.Booleano, yychar, yyline, yytext());}

//Valor boleano
( "verdadeiro" | "falso" ) {return new Symbol(sym.booleano, yychar, yyline, yytext());}

//Identificador
{LETRA}({LETRA}|{DIGITO})* {return new Symbol(sym.id, yychar, yyline, yytext());}

//Palavra
\"([^\\\"]|\\.)*\" {return new Symbol(sym.palavra, yychar, yyline, yytext());}

//Operadores relacionais
( ">" | "<" | "==" | "<>" | ">=" | "<=" ) {return new Symbol(sym.operadores_relacionais, yychar, yyline, yytext());}

//Espaco em branco
{espaco} {/*Ignore*/}

//Erro
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
