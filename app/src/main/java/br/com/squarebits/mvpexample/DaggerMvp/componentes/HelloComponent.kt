package br.com.squarebits.mvpexample.DaggerMvp.componentes

import android.support.v7.app.AppCompatActivity
import br.com.squarebits.mvpexample.DaggerMvp.HelloActivityDagger
import br.com.squarebits.mvpexample.DaggerMvp.modules.HelloModule
import dagger.Component

@Component(modules = [HelloModule::class])

interface HelloComponent {
    fun inject(activityDagger: HelloActivityDagger)
}
