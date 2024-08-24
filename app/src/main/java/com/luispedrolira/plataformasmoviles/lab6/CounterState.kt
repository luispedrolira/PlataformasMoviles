package com.luispedrolira.plataformasmoviles.lab6

data class CounterState(
    val counter: Int = 0,
    val increments: Int = 0,
    val decrements: Int = 0,
    val maxValue: Int = 0,
    val minValue: Int = 0,
    val history: List<HistoryItem> = emptyList()
)
