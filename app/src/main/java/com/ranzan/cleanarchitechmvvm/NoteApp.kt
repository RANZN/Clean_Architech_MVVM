package com.ranzan.cleanarchitechmvvm

import android.app.Application
import com.ranzan.cleanarchitechmvvm.di.appModule
import com.ranzan.cleanarchitechmvvm.di.userDatabase
import com.ranzan.cleanarchitechmvvm.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class NoteApp:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@NoteApp)
            modules(listOf(appModule, userDatabase, viewModelModule))
        }
    }
}