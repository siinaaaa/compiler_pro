// Generated from Expr.txt by ANTLR 4.13.1
package com.example.demo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(ExprParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(ExprParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(ExprParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpr(ExprParser.GreaterThanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(ExprParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualExpr(ExprParser.GreaterEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpr(ExprParser.NotEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(ExprParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualExpr(ExprParser.LessEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpr(ExprParser.DivideExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(ExprParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(ExprParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpr(ExprParser.SubtractExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(ExprParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpr(ExprParser.LessThanExprContext ctx);
}