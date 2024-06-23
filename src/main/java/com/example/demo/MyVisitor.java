package com.example.demo;

public class MyVisitor extends ExprBaseVisitor<Integer>{

    @Override
    public Integer visitProg(ExprParser.ProgContext ctx) {
        Integer result = 0;
        for (ExprParser.StatContext statCtx : ctx.stat()) {
            result = visit(statCtx);
        }
        return result;
    }

    @Override
    public Integer visitExprStat(ExprParser.ExprStatContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitIfStat(ExprParser.IfStatContext ctx) {
        int conditionResult = visit(ctx.expr());
        if (conditionResult != 0) {
            return visit(ctx.stat(0));
        } else if (ctx.stat().size() > 1) {
            return visit(ctx.stat(1));
        }
        return 0;
    }

    @Override
    public Integer visitWhileStat(ExprParser.WhileStatContext ctx) {
        int conditionResult = visit(ctx.expr());
        Integer lastResult = 0;
        while (conditionResult != 0) {
            lastResult = visit(ctx.stat());
            conditionResult = visit(ctx.expr());
        }
        return lastResult;
    }

    @Override
    public Integer visitLogicalAndExpr(ExprParser.LogicalAndExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (left != 0 && right != 0) ? 1 : 0;
    }

    @Override
    public Integer visitLogicalOrExpr(ExprParser.LogicalOrExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (left != 0 || right != 0) ? 1 : 0;
    }

    @Override
    public Integer visitEqualExpr(ExprParser.EqualExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (left == right) ? 1 : 0;
    }

    @Override
    public Integer visitNotEqualExpr(ExprParser.NotEqualExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (left != right) ? 1 : 0;
    }

    @Override
    public Integer visitLessThanExpr(ExprParser.LessThanExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (left < right) ? 1 : 0;
    }

    @Override
    public Integer visitGreaterThanExpr(ExprParser.GreaterThanExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (left > right) ? 1 : 0;
    }

    @Override
    public Integer visitLessEqualExpr(ExprParser.LessEqualExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (left <= right) ? 1 : 0;
    }

    @Override
    public Integer visitGreaterEqualExpr(ExprParser.GreaterEqualExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (left >= right) ? 1 : 0;
    }

    @Override
    public Integer visitAddExpr(ExprParser.AddExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return left + right;
    }

    @Override
    public Integer visitSubtractExpr(ExprParser.SubtractExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return left - right;
    }

    @Override
    public Integer visitMultiplyExpr(ExprParser.MultiplyExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return left * right;
    }

    @Override
    public Integer visitDivideExpr(ExprParser.DivideExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return left / right;
    }

    @Override
    public Integer visitParensExpr(ExprParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitIntExpr(ExprParser.IntExprContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

}
