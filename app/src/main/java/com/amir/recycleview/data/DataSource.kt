package com.amir.recycleview.data

import com.amir.recycleview.R
import com.amir.recycleview.model.Affirmation

class DataSource
{
    fun loadAffirmations(): List<Affirmation>
    {
        return listOf<Affirmation>(
            Affirmation(R.string.test1),
            Affirmation(R.string.test2),
            Affirmation(R.string.test3),
            Affirmation(R.string.test4),
            Affirmation(R.string.test5),
            Affirmation(R.string.test6),
            Affirmation(R.string.test7),
            Affirmation(R.string.test8),
        )
    }
}