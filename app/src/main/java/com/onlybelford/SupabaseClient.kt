package com.onlybelford

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.auth.Auth

object SupabaseClient {
    val client = createSupabaseClient(
        supabaseUrl = "https://gwklvdbxibeotbrhpxnh.supabase.co",
        supabaseKey = "sb_publishable_cCq_WWjNJga-8R27jgbuFQ_sWGHC5bI"
    ) {
        install(Postgrest)
        install(Auth)
    }
}
