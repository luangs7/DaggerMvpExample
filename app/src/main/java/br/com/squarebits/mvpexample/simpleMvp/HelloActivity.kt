package br.com.squarebits.mvpexample.simpleMvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import br.com.squarebits.mvpexample.R
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : AppCompatActivity(), HelloActivityContract.ViewPresenter {

    lateinit var presenter: HelloActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)


        presenter = HelloActivityPresenter(this)


        click.setOnClickListener { presenter.showModel(HelloModel()) }
    }

    override fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
