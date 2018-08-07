package br.com.squarebits.mvpexample.DaggerMvp

interface HelloActivityContractDagger {

    interface Presenter {
        fun showModel(model: HelloModelDagger)
    }

    interface ViewPresenter {
        fun showToast(text: String)
    }
}