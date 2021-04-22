package br.com.mateusfiereck.home.di

import br.com.mateusfiereck.home.navigation.HomeNavigationImpl
import br.com.mateusfiereck.navigation.HomeNavigation
import org.koin.dsl.module

val homeModule = module {
    factory<HomeNavigation> { HomeNavigationImpl() }
}