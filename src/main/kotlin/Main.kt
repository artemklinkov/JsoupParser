package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

const val URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {
    val doc: Document = Jsoup.connect(URL).get()

    val quotations: Elements = doc.select("article")
    quotations.forEach {
        println(it.text())
    }
}