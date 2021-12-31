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
    : Digits               // 整数
    | Digits '.' Digits    // 浮点数
    ;

Digits
    : [0-9] ([0-9]*)?
    ;
