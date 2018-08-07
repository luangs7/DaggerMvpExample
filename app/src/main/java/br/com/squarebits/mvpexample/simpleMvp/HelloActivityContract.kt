package br.com.squarebits.mvpexample.simpleMvp

interface HelloActivityContract {

    interface Presenter{
        fun showModel(model:HelloModel)
    }

    interface ViewPresenter{
        fun showToast(text:String)
    }





}