package com.moat.analytics.mobile;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class u extends WebViewClient {
    private final WebViewClient a;
    private final t b;

    private u(WebViewClient webViewClient, t tVar) {
        this.a = webViewClient;
        this.b = tVar;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.a.doUpdateVisitedHistory(webView, str, z);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.a.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        this.a.onLoadResource(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.a.onPageFinished(webView, str);
        this.b.a(webView);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        this.a.onScaleChanged(webView, f, f2);
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.a.onTooManyRedirects(webView, message, message2);
    }

    public void onUnhandledInputEvent(WebView webView, InputEvent inputEvent) {
        this.a.onUnhandledInputEvent(webView, inputEvent);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.a.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.a.shouldInterceptRequest(webView, webResourceRequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.a.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.b.shouldOverrideUrlLoading(webView, str) || this.a.shouldOverrideUrlLoading(webView, str);
    }
}
