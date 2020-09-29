package com.comscore.android.vce;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.webkit.WebView;
import java.util.concurrent.ScheduledFuture;

class an {
    private static String a = "WebViewPollingManager";
    private final p b;
    private final s c;
    private final k d;
    private ScheduledFuture e;
    private final ah<ViewTreeObserver> f;
    /* access modifiers changed from: private */
    public OnPreDrawListener g;
    private long h = System.currentTimeMillis();
    private long i = this.h;
    private float j = 0.0f;
    private final ah<WebView> k;
    /* access modifiers changed from: private */
    public am l;

    an(p pVar, s sVar, k kVar, WebView webView) {
        this.b = pVar;
        this.d = kVar;
        this.c = sVar;
        this.k = new ah<>(webView);
        this.f = new ah<>(webView.getViewTreeObserver());
    }

    /* access modifiers changed from: private */
    public void a(float f2) {
        this.l.a(f2);
    }

    private void b(final float f2) {
        this.c.a((Runnable) new Runnable() {
            public void run() {
                try {
                    an.this.a(f2);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void f() {
        this.l.j();
    }

    /* access modifiers changed from: private */
    public void g() {
        this.l.k();
    }

    /* access modifiers changed from: private */
    public void h() {
        this.c.a((Runnable) new Runnable() {
            public void run() {
                try {
                    an.this.f();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void i() {
        this.c.a((Runnable) new Runnable() {
            public void run() {
                try {
                    an.this.g();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.h >= ((long) c.q.intValue())) {
            this.h = currentTimeMillis;
            final WebView webView = (WebView) this.k.get();
            if (webView == null || !this.d.isWebViewAlive(webView, this.c)) {
                c();
            } else {
                this.c.b(new Runnable() {
                    public void run() {
                        int progress = webView.getProgress();
                        if (!an.this.l.a() || progress >= 100) {
                            if (!an.this.l.a() && progress == 100) {
                                an.this.h();
                            }
                            return;
                        }
                        an.this.i();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(am amVar) {
        this.l = amVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        WebView webView = (WebView) this.k.get();
        if (webView != null && this.d.isWebViewAlive(webView, this.c)) {
            if (!z && this.e == null) {
                this.e = this.c.a(new Runnable() {
                    public void run() {
                        try {
                            an.this.a();
                        } catch (Exception unused) {
                        }
                    }
                }, 0, c.p.intValue());
            }
            if (this.g == null) {
                this.g = new OnPreDrawListener() {
                    public boolean onPreDraw() {
                        an.this.b();
                        return true;
                    }
                };
            }
            ah<ViewTreeObserver> ahVar = this.f;
            if (ahVar != null) {
                final ViewTreeObserver viewTreeObserver = (ViewTreeObserver) ahVar.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    this.c.b(new Runnable() {
                        public void run() {
                            try {
                                viewTreeObserver.addOnPreDrawListener(an.this.g);
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        WebView webView = (WebView) this.k.get();
        if (webView == null || !this.d.isWebViewAlive(webView, this.c)) {
            c();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.i >= ((long) c.q.intValue())) {
            this.i = currentTimeMillis;
            float scale = webView.getScale();
            if (this.j != scale) {
                b(scale);
                this.j = scale;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ah<ViewTreeObserver> ahVar = this.f;
        if (ahVar != null) {
            final ViewTreeObserver viewTreeObserver = (ViewTreeObserver) ahVar.get();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                this.c.b(new Runnable() {
                    public void run() {
                        try {
                            viewTreeObserver.removeOnPreDrawListener(an.this.g);
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        c();
        ah<WebView> ahVar = this.k;
        if (ahVar != null) {
            ahVar.clear();
        }
        ah<ViewTreeObserver> ahVar2 = this.f;
        if (ahVar2 != null) {
            ahVar2.clear();
        }
    }
}
