package ru.smn.poker

/*
* Определяет итоговую комбинацию игрока
* */
interface CombinationFinder {
    /**
     * @param list - набор карт
     * @exception NotCorrectCountCardsException - неверное количество карт на входе
     * определяется реализацией под каждый вид покера, для примера в holdem при вскрытии на вход должны прийти 7 карт.
     * 5 с доски и 2 с руки
     * @return
     * */
    fun find(list: List<Card>): FinalCombination
}