package com.example.test2

import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

class Supa {
    // service_role eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imhicm9ieG9kbHdsbXN4em91aW1sIiwicm9sZSI6InNlcnZpY2Vfcm9sZSIsImlhdCI6MTczNDU4ODMyNCwiZXhwIjoyMDUwMTY0MzI0fQ.Hg1UJMo709x7oX8u4ziLmYJedrQDedwt57BMxOfwusY
}
//
object Client{
    val url = "https://hbrobxodlwlmsxzouiml.supabase.co"
    val anon = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imhicm9ieG9kbHdsbXN4em91aW1sIiwicm9s" +
            "ZSI6ImFub24iLCJpYXQiOjE3MzQ1ODgzMjQsImV4cCI6MjA1MDE2NDMyNH0.C1EWOSImsp6cx74lidRFZpmsJDy_gp5MVq1Zyj-fRig"
    val client = createSupabaseClient(supabaseUrl = url, supabaseKey = anon)  {
        install(Auth)
        install(Postgrest)
        //install other modules
    }

}

