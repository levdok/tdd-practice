package com.stringconcat.tdd

class Bank {
    val rates: MutableMap<Pair<Money.Currency, Money.Currency>, Int> = mutableMapOf()

    fun addRate(from: Money.Currency, to: Money.Currency, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun getRate(from: Money.Currency, to: Money.Currency): Int {
        return rates.getOrElse(Pair(from, to), {1})
    }

    fun getRate(pair: Pair<Money.Currency, Money.Currency>): Int {
        return rates.getOrElse(pair, {1})
    }
}
