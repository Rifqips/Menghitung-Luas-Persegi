package io.github.rifqips99.luas_persegi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import io.github.rifqips99.luas_persegi.presenter.LuasPresenter
import io.github.rifqips99.luas_persegi.presenter.LuasView

class MainActivity : AppCompatActivity(), LuasView {


    private lateinit var presenter: LuasPresenter
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var tvHasilLuasPersegiPanjang: TextView
    private lateinit var tvHasilKelilingPersegiPanjang: TextView
    private lateinit var btnHitungLuasPersegiPanjang: Button
    private lateinit var btnHitungKelilingPersegiPanjang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = LuasPresenter(this)

        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        tvHasilLuasPersegiPanjang = findViewById(R.id.tv_hasil_luas_persegi_panjang)
        tvHasilKelilingPersegiPanjang = findViewById(R.id.tv_hasil_keliling_persegi_panjang)
        btnHitungLuasPersegiPanjang = findViewById(R.id.btn_hitung_luas_persegi_panjang)
        btnHitungKelilingPersegiPanjang = findViewById(R.id.btn_hitung_keliling_persegi_panjang)

        btnHitungLuasPersegiPanjang.setOnClickListener{
            val  panjang = etPanjang.text.toString().trim().toFloat()
            val  lebar = etLebar.text.toString().trim().toFloat()

             presenter.hitungLuasPersegiPanjang(panjang, lebar)
        }
        btnHitungKelilingPersegiPanjang.setOnClickListener{
            val panjang = etPanjang.text.toString().trim().toFloat()
            val lebar = etLebar.text.toString().trim().toFloat()

             presenter.hitungKelilingPersegiPanjang(panjang,lebar)
        }

    fun hasilLuasPersegiPanjang(luas: Float) {

    }

    fun hasilKeliingPersegiPanjang(luas: Float){

    }
}

    override fun hasilLuasPersegiPanjang(luas: Float) {
        tvHasilLuasPersegiPanjang.text = luas.toString()
    }

    override fun hasilKelilingPersegiPanjang(luas: Float) {
        tvHasilKelilingPersegiPanjang.text = luas.toString()
    }

}
