// Generated from Ulang.g4 by ANTLR 4.8

package xyz.xindoo.ulang.g4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UlangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(UlangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(UlangParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(UlangParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(UlangParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(UlangParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(UlangParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(UlangParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(UlangParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(UlangParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(UlangParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(UlangParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(UlangParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(UlangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(UlangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(UlangParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(UlangParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(UlangParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(UlangParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(UlangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UlangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(UlangParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(UlangParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(UlangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(UlangParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(UlangParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UlangParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(UlangParser.TypeTypeContext ctx);
}