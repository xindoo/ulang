grammar Expr;

@header {
package xyz.xindoo.ulang.expr;
}

expression
    : primary
    | expression bop=('*'|'/') expression
    | expression bop=('+'|'-') expression
    ;

primary
    : '(' expression ')'
    | number
    ;
number
    : Digits
    | Digits '.' Digits
    ;

Digits
    : [0-9] ([0-9_]* [0-9])?
    ;