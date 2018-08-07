package br.com.squarebits.mvpexample.DaggerMvp

class HelloActivityPresenterDagger : HelloActivityContractDagger.Presenter {

    lateinit var mView: HelloActivityContractDagger.ViewPresenter

    constructor(view: HelloActivityContractDagger.ViewPresenter) {
        this.mView = view
    }

    override fun showModel(model: HelloModelDagger) {
        mView.showToast(model.toString())
    }
}