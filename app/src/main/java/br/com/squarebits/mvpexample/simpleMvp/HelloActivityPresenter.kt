package br.com.squarebits.mvpexample.simpleMvp

class HelloActivityPresenter : HelloActivityContract.Presenter {

    lateinit var mView: HelloActivityContract.ViewPresenter

    constructor(view: HelloActivityContract.ViewPresenter) {
        this.mView = view
    }

    override fun showModel(model: HelloModel) {
        mView.showToast(model.toString())
    }
}