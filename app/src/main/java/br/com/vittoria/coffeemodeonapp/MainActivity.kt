package br.com.vittoria.coffeemodeonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ao clicar em VAI fazer o calculo e disponibilizar no txv
        btnVai.setOnClickListener {
            Toast.makeText(this@MainActivity,"Sucesso!", Toast.LENGTH_LONG).show()

            //Pegar texto do EditText para realizar o calculo
            val quantidadeAgua = edtAgua.text.toString()

            if (quantidadeAgua.isEmpty() || quantidadeAgua == "0"){
                edtAgua.error = "Quantidade inválida"
            } else {
                //Verificacoes
                val resultado = quantidadeAgua.toDouble() * 70 / 1000;
                txvResultado.text = resultado.toString() + " gramas de café"
            }
        }
    }
}