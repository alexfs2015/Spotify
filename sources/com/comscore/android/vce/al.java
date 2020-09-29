package com.comscore.android.vce;

import android.webkit.WebViewClient;

class al {
    private static final String a = "WebViewClientPort";
    private final p b;
    private final k c;
    private final am d;
    private ah<WebViewClient> e;
    private ah<WebViewClient> f;
    private boolean g = true;

    al(p pVar, k kVar, am amVar, WebViewClient webViewClient) {
        this.b = pVar;
        this.c = kVar;
        this.d = amVar;
        this.f = new ah<>(this.c.f() ? new aj(this, webViewClient) : new ai(this, webViewClient));
        this.e = new ah<>(webViewClient);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.g = false;
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        if (this.g) {
            this.d.b(f2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a();
        this.e.clear();
        this.f.clear();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.g) {
            this.d.m();
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        if (this.g) {
            this.d.l();
        }
    }

    /* access modifiers changed from: 0000 */
    public WebViewClient e() {
        return (WebViewClient) this.f.get();
    }

    /* access modifiers changed from: 0000 */
    public WebViewClient f() {
        return (WebViewClient) this.e.get();
    }
}
