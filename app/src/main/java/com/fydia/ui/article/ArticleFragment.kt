package com.fydia.ui.article

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.fydia.databinding.FragmentArticleBinding

class ArticleFragment : Fragment() {

    private var _binding: FragmentArticleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArticleBinding.inflate(inflater, container, false)
        setWebView()
        return binding.root
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setWebView() {
        val webSettings = binding.webView.settings
        webSettings.javaScriptEnabled = true
        binding.webView.apply {
            loadUrl("https://www.alodokter.com/")
            webViewClient = WebViewClient()
        }
    }

}