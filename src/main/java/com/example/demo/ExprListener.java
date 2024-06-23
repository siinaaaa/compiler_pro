// Generated from Expr.txt by ANTLR 4.13.1
package com.example.demo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(ExprParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(ExprParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(ExprParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(ExprParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(ExprParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(ExprParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpr(ExprParser.GreaterThanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpr(ExprParser.GreaterThanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(ExprParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(ExprParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualExpr(ExprParser.GreaterEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualExpr(ExprParser.GreaterEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ExprParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(ExprParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(ExprParser.NotEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(ExprParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(ExprParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualExpr(ExprParser.LessEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqualExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualExpr(ExprParser.LessEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpr(ExprParser.DivideExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpr(ExprParser.DivideExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(ExprParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(ExprParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(ExprParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(ExprParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpr(ExprParser.SubtractExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpr(ExprParser.SubtractExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(ExprParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(ExprParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpr(ExprParser.LessThanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpr(ExprParser.LessThanExprContext ctx);
}