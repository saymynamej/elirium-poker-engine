package ru.smn.poker

/*
* Перечисление всех возможных карт необходимых для покера
* */
enum class Card(
    power: Power,
    suit: Suit,
) {
    A_D(Power.A_POWER, Suit.DIAMOND),
    K_D(Power.K_POWER, Suit.DIAMOND),
    Q_D(Power.Q_POWER, Suit.DIAMOND),
    J_D(Power.J_POWER, Suit.DIAMOND),
    TEN_D(Power.TEN_POWER, Suit.DIAMOND),
    NINE_D(Power.NINE_POWER, Suit.DIAMOND),
    EIGHT_D(Power.EIGHT_POWER, Suit.DIAMOND),
    SEVEN_D(Power.SEVEN_POWER, Suit.DIAMOND),
    SIX_D(Power.SIX_POWER, Suit.DIAMOND),
    FIVE_D(Power.FIVE_POWER, Suit.DIAMOND),
    FOUR_D(Power.FOUR_POWER, Suit.DIAMOND),
    THREE_D(Power.THREE_POWER, Suit.DIAMOND),
    TWO_D(Power.TWO_POWER, Suit.DIAMOND),
    A_H(Power.A_POWER, Suit.HEART),
    K_H(Power.K_POWER, Suit.HEART),
    Q_H(Power.Q_POWER, Suit.HEART),
    J_H(Power.J_POWER, Suit.HEART),
    TEN_H(Power.TEN_POWER, Suit.HEART),
    NINE_H(Power.NINE_POWER, Suit.HEART),
    EIGHT_H(Power.EIGHT_POWER, Suit.HEART),
    SEVEN_H(Power.SEVEN_POWER, Suit.HEART),
    SIX_H(Power.SIX_POWER, Suit.HEART),
    FIVE_H(Power.FIVE_POWER, Suit.HEART),
    FOUR_H(Power.FOUR_POWER, Suit.HEART),
    THREE_H(Power.THREE_POWER, Suit.HEART),
    TWO_H(Power.TWO_POWER, Suit.HEART),
    A_S(Power.A_POWER, Suit.SPADE),
    K_S(Power.K_POWER, Suit.SPADE),
    Q_S(Power.Q_POWER, Suit.SPADE),
    J_S(Power.J_POWER, Suit.SPADE),
    TEN_S(Power.TEN_POWER, Suit.SPADE),
    NINE_S(Power.NINE_POWER, Suit.SPADE),
    EIGHT_S(Power.EIGHT_POWER, Suit.SPADE),
    SEVEN_S(Power.SEVEN_POWER, Suit.SPADE),
    SIX_S(Power.SIX_POWER, Suit.SPADE),
    FIVE_S(Power.FIVE_POWER, Suit.SPADE),
    FOUR_S(Power.FOUR_POWER, Suit.SPADE),
    THREE_S(Power.THREE_POWER, Suit.SPADE),
    TWO_S(Power.TWO_POWER, Suit.SPADE),
    A_C(Power.A_POWER, Suit.CLUB),
    K_C(Power.K_POWER, Suit.CLUB),
    Q_C(Power.Q_POWER, Suit.CLUB),
    J_C(Power.J_POWER, Suit.CLUB),
    TEN_C(Power.TEN_POWER, Suit.CLUB),
    NINE_C(Power.NINE_POWER, Suit.CLUB),
    EIGHT_C(Power.EIGHT_POWER, Suit.CLUB),
    SEVEN_C(Power.SEVEN_POWER, Suit.CLUB),
    SIX_C(Power.SIX_POWER, Suit.CLUB),
    FIVE_C(Power.FIVE_POWER, Suit.CLUB),
    FOUR_C(Power.FOUR_POWER, Suit.CLUB),
    THREE_C(Power.THREE_POWER, Suit.CLUB),
    TWO_C(Power.TWO_POWER, Suit.CLUB);

    /*
    * Масть карты
    * */
    enum class Suit {
        DIAMOND,
        HEART,
        CLUB,
        SPADE
    }

    /*
    * Сила карты
    * */
    enum class Power(power: Int) {
        A_POWER(14),
        K_POWER(13),
        Q_POWER(12),
        J_POWER(11),
        TEN_POWER(10),
        NINE_POWER(9),
        EIGHT_POWER(8),
        SEVEN_POWER(7),
        SIX_POWER(6),
        FIVE_POWER(5),
        FOUR_POWER(4),
        THREE_POWER(3),
        TWO_POWER(2);
    }
}