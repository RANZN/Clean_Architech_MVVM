package com.ranzan.cleanarchitechmvvm.feature_data.domain.util

sealed class OrderType{
    object Ascending:OrderType()
    object Descending:OrderType()
}
