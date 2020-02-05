package kr.goldenmine.doublejava

import android.webkit.WebView

class DoubleJava(val webView: WebView) {

    init {
        webView.listener
    }

    fun get(url: String) {
        webView.loadUrl(url)
    }


}