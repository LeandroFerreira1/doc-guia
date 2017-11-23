package br.com.caramelup.docguia.data

import android.content.Context
import br.com.caramelup.docguia.R
import br.com.caramelup.docguia.domain.Doc

class Database {
    companion object{
        fun getDocs() = listOf(
                Doc("kotlin-docs.pdf",R.drawable.kotlin_bg, "Kotlin", 194),
                Doc("java-docs.pdf",R.drawable.java_bg, "Java", 670),
                Doc("python-docs.pdf",R.drawable.python_bg, "Python", 1538),
                Doc("haskell-docs.pdf",R.drawable.haskell_bg, "Haskell", 503),
                Doc("scala-docs.pdf",R.drawable.scala_bg, "Scala", 547),
                Doc("why-ruby-docs.pdf",R.drawable.ruby_bg, "O Comovente Guia de Ruby", 121),
                Doc("postgresql-docs.pdf",R.drawable.pgsql_bg, "PostgreSQL", 1310)
            )
        fun saveActualPageSP(context: Context, key: String, page: Int ){
            context
                    .getSharedPreferences("PREF", Context.MODE_PRIVATE)
                    .edit()
                    .putInt("$key-page", page)
                    .apply()
        }

        fun getActualPageSP( context: Context, key: String)
            = context
                .getSharedPreferences("PREF", Context.MODE_PRIVATE)
                .getInt("$key-page", 0)
    }
}
