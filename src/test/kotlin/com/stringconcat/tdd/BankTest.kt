package com.stringconcat.tdd

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * @author levdokimova on 09.03.2021
 */
internal class BankTest {

    @Test
    fun `add 1 to 2 rate for USD to CHR`() {
        val bank = Bank()
        bank.addRate(Money.Currency.USD, Money.Currency.CHF, 2)

        bank.getRate(Money.Currency.USD, Money.Currency.CHF) shouldBe 2
    }

    @Test
    fun `default rate for USD to USD`() {
        val bank = Bank()
        bank.addRate(Money.Currency.USD, Money.Currency.CHF, 2)

        bank.getRate(Money.Currency.USD, Money.Currency.USD) shouldBe 1
    }
}