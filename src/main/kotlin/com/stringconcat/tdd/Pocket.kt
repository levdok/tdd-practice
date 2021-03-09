package com.stringconcat.tdd

class Pocket(
    val a: Money,
    val b: Money
): Expression {
    fun reduce(
        to: Money.Currency,
        rateProvider: (Pair<Money.Currency, Money.Currency>) -> Int
    ): Money {
        val a1 = if (a.currency == to) a.amount else (a.amount) * rateProvider(Pair(a.currency, to))
        val b1 = if (b.currency == to) b.amount else (b.amount) * rateProvider(Pair(b.currency, to))
        return Money(a1 + b1, to)
    }
}

operator fun Money.plus(other: Money): Pocket {
    return Pocket(this, other)
}