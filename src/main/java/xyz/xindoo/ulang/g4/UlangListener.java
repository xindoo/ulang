// Generated from Ulang.g4 by ANTLR 4.8

package xyz.xindoo.ulang.g4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UlangParser}.
 */
public interface UlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(UlangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(UlangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(UlangParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(UlangParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(UlangParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(UlangParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(UlangParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(UlangParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(UlangParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(UlangParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(UlangParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(UlangParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(UlangParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(UlangParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(UlangParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(UlangParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(UlangParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(UlangParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(UlangParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(UlangParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(UlangParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(UlangParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(UlangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(UlangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(UlangParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(UlangParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(UlangParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(UlangParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(UlangParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(UlangParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(UlangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(UlangParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(UlangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(UlangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UlangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UlangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(UlangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(UlangParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(UlangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(UlangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(UlangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(UlangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(UlangParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(UlangParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(UlangParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(UlangParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UlangParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(UlangParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UlangParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(UlangParser.TypeTypeContext ctx);
}