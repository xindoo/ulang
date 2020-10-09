grammar Ulang;

import CommonLexer;

@header {
package xyz.xindoo.ulang.g4;
}

prog
    : blockStatement
    ;

blockStatement
    : variableDeclarators ';'
    | statement*
    ;


functionDef
    : FUNCTION IDENTIFIER formalParameters '{' blockStatement '}'
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)*
    ;

formalParameter
    : typeType variableDeclaratorId
    ;

fieldDeclaration
    : variableDeclarators ';'
    ;

variableDeclarators
    : typeType variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER
    ;

variableInitializer
    : expression
    ;

statement
    : IF parExpression '{' blockStatement '}' (ELSE '{' blockStatement '}')?
    | FOR forControl '{' blockStatement '}'
    | WHILE parExpression '{' blockStatement '}'
    | DO '{' blockStatement '}' WHILE parExpression ';'
    | RETURN expression? ';'
    | BREAK IDENTIFIER? ';'
    | CONTINUE IDENTIFIER? ';'
    | SEMI
    | functionDef
    | assignment ';'
    ;

assignment
    : IDENTIFIER aop=('='|'+='|'-=') expression
    ;

forControl
    : '(' forInit? ';' expression? ';' forUpdate=expressionList? ')'
    ;

forInit
    : variableDeclarators
    | expressionList
    ;

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

functionCall
    : IDENTIFIER '(' expressionList? ')'
    ;

expression
    : primary
    | functionCall
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression 
    | expression bop=('==' | '!=') expression
    | expression bop='&&' expression
    | expression bop='||' expression
    ;

arguments
    : '(' expressionList? ')'
    ;

primary
    : '(' expression ')'
    | literal
    | IDENTIFIER
    ;

literal
    : integerLiteral
    | floatLiteral
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    ;

typeType
    : 'var'
    ;




