package ru.smn.poker

/**
 * Итоговая комбинация игрока, после поиска
 *  @see CombinationFinder
 * */
data class FinalCombination(
    val combination: Combination,
    val cards: List<Card>,
)