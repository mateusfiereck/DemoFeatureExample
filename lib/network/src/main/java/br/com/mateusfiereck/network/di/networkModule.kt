package br.com.mateusfiereck.network.di

import br.com.mateusfiereck.network.provide.ProvideRetrofit
import org.koin.dsl.module

val networkModule = module {
    single { ProvideRetrofit.build() }
}
