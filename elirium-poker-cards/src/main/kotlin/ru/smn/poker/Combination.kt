package ru.smn.poker

enum class Combination(power: Int) {
    FLUSH_ROYAL(10),
    STRAIGHT_FLUSH(9),
    QUADS(8),
    FULL_HOUSE(7),
    FLUSH(6),
    STRAIGHT(5),
    THREE_CARDS(4),
    TWO_PAIR(3),
    ONE_PAIR(2),
    HIGH_CARD(1);
}