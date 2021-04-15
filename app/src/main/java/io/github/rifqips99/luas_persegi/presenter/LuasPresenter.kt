package io.github.rifqips99.luas_persegi.presenter

class LuasPresenter (
    private val luasView: LuasView
)  {

    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float) {
        val hasil = panjang * lebar

        luasView.hasilLuasPersegiPanjang(hasil)
    }
    fun hitungKelilingPersegiPanjang(panjang: Float, lebar: Float){
        val hasil = 2 * (panjang + lebar)

        luasView.hasilKelilingPersegiPanjang(hasil)
    }



   }