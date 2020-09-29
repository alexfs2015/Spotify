package com.comscore.android.vce;

import android.view.InputEvent;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class aj extends ai {
    aj(al alVar, WebViewClient webViewClient) {
        super(alVar, webViewClient);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (this.a != null) {
            if (t.a("onReceivedClientCertRequest", this.a, WebView.class, ClientCertRequest.class)) {
                this.a.onReceivedClientCertRequest(webView, clientCertRequest);
                return;
            }
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onUnhandledInputEvent(WebView webView, InputEvent inputEvent) {
        if (this.a != null) {
            if (t.a("onUnhandledInputEvent", this.a, WebView.class, InputEvent.class)) {
                this.a.onUnhandledInputEvent(webView, inputEvent);
                return;
            }
        }
        super.onUnhandledInputEvent(webView, inputEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.a != null) {
            if (t.a("shouldInterceptRequest", this.a, WebView.class, WebResourceRequest.class)) {
                return this.a.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
