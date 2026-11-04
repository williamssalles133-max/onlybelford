package com.onlybelford

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "ONLY.BELFORD - Supabase conectado"
            textSize = 20f
            setPadding(32, 32, 32, 32)
        }
        setContentView(textView)

        // Exemplo simples: o cliente já está pronto em SupabaseClient.client
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // Teste de conexão (substitua por uma query real depois)
                println("Supabase client pronto: ${SupabaseClient.client}")
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
