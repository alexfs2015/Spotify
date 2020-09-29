package com.comscore.android.vce;

import android.webkit.WebViewClient;

class ak {
    private static final String b = "WebViewClientInfo";
    final p a;
    private WebViewClient c = null;
    private boolean d = true;
    private boolean e = true;
    private boolean f = true;
    private boolean g = true;
    private boolean h = true;

    ak(p pVar) {
        this.a = pVar;
    }

    /* access modifiers changed from: 0000 */
    public WebViewClient a() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public void a(WebViewClient webViewClient) {
        this.c = webViewClient;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.d = false;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.e = false;
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.f = false;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        this.g = false;
    }

    /* access modifiers changed from: 0000 */
    public boolean h() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        this.h = false;
    }

    /* access modifiers changed from: 0000 */
    public boolean j() {
        return this.d && (this.e || (this.f && this.h));
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        this.c = null;
    }
}
