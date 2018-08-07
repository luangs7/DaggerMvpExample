package br.com.squarebits.mvpexample.DaggerMvp.modules

import br.com.squarebits.mvpexample.DaggerMvp.HelloActivityDagger
import br.com.squarebits.mvpexample.DaggerMvp.HelloActivityPresenterDagger
import dagger.Module
import dagger.Provides

@Module
class HelloModule {

    lateinit var activityDagger: HelloActivityDagger

    constructor(activityDagger: HelloActivityDagger) {
        this.activityDagger = activityDagger
    }

    @Provides
    fun providesHelloPresenter(): HelloActivityPresenterDagger = HelloActivityPresenterDagger(activityDagger)
}