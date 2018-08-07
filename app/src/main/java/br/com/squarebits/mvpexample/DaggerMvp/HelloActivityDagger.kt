package br.com.squarebits.mvpexample.DaggerMvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import br.com.squarebits.mvpexample.DaggerMvp.componentes.HelloComponent
import br.com.squarebits.mvpexample.R
import kotlinx.android.synthetic.main.activity_hello.*
import javax.inject.Inject

class HelloActivityDagger : AppCompatActivity(), HelloActivityContractDagger.ViewPresenter {

    @Inject
    lateinit var presenter: HelloActivityPresenterDagger
    lateinit var component: HelloComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        DaggerHelloComponent.create().inject(this)



        presenter = HelloActivityPresenterDagger(this)


        click.setOnClickListener { presenter.showModel(HelloModelDagger()) }
    }

    override fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
