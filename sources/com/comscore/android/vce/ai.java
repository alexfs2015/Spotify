package com.comscore.android.vce;

import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class ai extends WebViewClient {
    WebViewClient a;
    private ah<al> b;

    ai(al alVar, WebViewClient webViewClient) {
        this.b = new ah<>(alVar);
        this.a = webViewClient;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("doUpdateVisitedHistory", webViewClient, WebView.class, String.class, Boolean.TYPE)) {
                this.a.doUpdateVisitedHistory(webView, str, z);
                return;
            }
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onFormResubmission", webViewClient, WebView.class, Message.class, Message.class)) {
                this.a.onFormResubmission(webView, message, message2);
                return;
            }
        }
        super.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onLoadResource", webViewClient, WebView.class, String.class)) {
                this.a.onLoadResource(webView, str);
                return;
            }
        }
        super.onLoadResource(webView, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageFinished(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            android.webkit.WebViewClient r0 = r4.a
            if (r0 == 0) goto L_0x001f
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            java.lang.Class<android.webkit.WebView> r3 = android.webkit.WebView.class
            r1[r2] = r3
            r2 = 1
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1[r2] = r3
            java.lang.String r2 = "onPageFinished"
            boolean r0 = com.comscore.android.vce.t.a(r2, r0, r1)
            if (r0 == 0) goto L_0x001f
            android.webkit.WebViewClient r0 = r4.a
            r0.onPageFinished(r5, r6)
            goto L_0x0022
        L_0x001f:
            super.onPageFinished(r5, r6)
        L_0x0022:
            com.comscore.android.vce.ah<com.comscore.android.vce.al> r5 = r4.b
            if (r5 == 0) goto L_0x002d
            java.lang.Object r5 = r5.get()
            com.comscore.android.vce.al r5 = (com.comscore.android.vce.al) r5
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            if (r5 == 0) goto L_0x0033
            r5.c()
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.vce.ai.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageStarted(android.webkit.WebView r5, java.lang.String r6, android.graphics.Bitmap r7) {
        /*
            r4 = this;
            android.webkit.WebViewClient r0 = r4.a
            if (r0 == 0) goto L_0x0024
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            java.lang.Class<android.webkit.WebView> r3 = android.webkit.WebView.class
            r1[r2] = r3
            r2 = 1
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1[r2] = r3
            r2 = 2
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r1[r2] = r3
            java.lang.String r2 = "onPageStarted"
            boolean r0 = com.comscore.android.vce.t.a(r2, r0, r1)
            if (r0 == 0) goto L_0x0024
            android.webkit.WebViewClient r0 = r4.a
            r0.onPageStarted(r5, r6, r7)
            goto L_0x0027
        L_0x0024:
            super.onPageStarted(r5, r6, r7)
        L_0x0027:
            com.comscore.android.vce.ah<com.comscore.android.vce.al> r5 = r4.b
            if (r5 == 0) goto L_0x0032
            java.lang.Object r5 = r5.get()
            com.comscore.android.vce.al r5 = (com.comscore.android.vce.al) r5
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x0038
            r5.d()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.vce.ai.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedError", webViewClient, WebView.class, Integer.TYPE, String.class, String.class)) {
                this.a.onReceivedError(webView, i, str, str2);
                return;
            }
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedHttpAuthRequest", webViewClient, WebView.class, HttpAuthHandler.class, String.class, String.class)) {
                this.a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                return;
            }
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedLoginRequest", webViewClient, WebView.class, String.class, String.class, String.class)) {
                this.a.onReceivedLoginRequest(webView, str, str2, str3);
                return;
            }
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedSslError", webViewClient, WebView.class, SslErrorHandler.class, SslError.class)) {
                this.a.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScaleChanged(android.webkit.WebView r5, float r6, float r7) {
        /*
            r4 = this;
            android.webkit.WebViewClient r0 = r4.a
            if (r0 == 0) goto L_0x0024
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            java.lang.Class<android.webkit.WebView> r3 = android.webkit.WebView.class
            r1[r2] = r3
            r2 = 1
            java.lang.Class r3 = java.lang.Float.TYPE
            r1[r2] = r3
            r2 = 2
            java.lang.Class r3 = java.lang.Float.TYPE
            r1[r2] = r3
            java.lang.String r2 = "onScaleChanged"
            boolean r0 = com.comscore.android.vce.t.a(r2, r0, r1)
            if (r0 == 0) goto L_0x0024
            android.webkit.WebViewClient r0 = r4.a
            r0.onScaleChanged(r5, r6, r7)
            goto L_0x0027
        L_0x0024:
            super.onScaleChanged(r5, r6, r7)
        L_0x0027:
            com.comscore.android.vce.ah<com.comscore.android.vce.al> r5 = r4.b
            if (r5 == 0) goto L_0x0032
            java.lang.Object r5 = r5.get()
            com.comscore.android.vce.al r5 = (com.comscore.android.vce.al) r5
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x0038
            r5.a(r7)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.vce.ai.onScaleChanged(android.webkit.WebView, float, float):void");
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onUnhandledKeyEvent", webViewClient, WebView.class, KeyEvent.class)) {
                this.a.onUnhandledKeyEvent(webView, keyEvent);
                return;
            }
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("shouldInterceptRequest", webViewClient, WebView.class, String.class)) {
                return this.a.shouldInterceptRequest(webView, str);
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("shouldOverrideKeyEvent", webViewClient, WebView.class, KeyEvent.class)) {
                return this.a.shouldOverrideKeyEvent(webView, keyEvent);
            }
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("shouldOverrideUrlLoading", webViewClient, WebView.class, String.class)) {
                return this.a.shouldOverrideUrlLoading(webView, str);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
