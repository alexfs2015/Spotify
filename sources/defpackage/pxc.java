package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.provider.Settings.System;
import android.view.LayoutInflater;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.R;
import java.io.IOException;

/* renamed from: pxc reason: default package */
public final class pxc extends jsy implements kmm<pwy, pww> {
    WebView b;
    /* access modifiers changed from: private */
    public FrameLayout c;
    private ViewGroup d;
    private boolean e;
    /* access modifiers changed from: private */
    public knw<pww> f;
    /* access modifiers changed from: private */
    public final float g;
    /* access modifiers changed from: private */
    public final Handler h = new Handler();
    /* access modifiers changed from: private */
    public final Handler i = new Handler();
    private String j;
    private a k;
    private ObjectMapper l;
    /* access modifiers changed from: private */
    public boolean m;
    /* access modifiers changed from: private */
    public boolean n;

    /* renamed from: pxc$a */
    class a {
        private a() {
        }

        /* synthetic */ a(pxc pxc, byte b) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (!pxc.this.n) {
                pxc.this.f.accept(new e());
                pxc.this.a(true);
                pxc.this.n = true;
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i, int i2) {
            if (System.getFloat(pxc.this.b.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                pxc.this.c.getLayoutParams().height = i;
                pxc.this.c.requestLayout();
                return;
            }
            pxc.this.b.getLayoutParams().height = i;
            pxc.this.b.requestLayout();
            ValueAnimator duration = ValueAnimator.ofInt(new int[]{pxc.this.c.getHeight(), i}).setDuration((long) i2);
            duration.addUpdateListener(new $$Lambda$pxc$a$wDt4oVoL1Qk1EIvvGRxH6sx0Aw(this));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(duration);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ValueAnimator valueAnimator) {
            pxc.this.c.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            pxc.this.c.requestLayout();
            pxc.this.b.requestLayout();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(LayoutParams layoutParams) {
            pxc.this.c.setLayoutParams(layoutParams);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            pxc.this.f.accept(new defpackage.pww.a(str));
        }

        @JavascriptInterface
        public final void animateToNewHeight(int i, int i2) {
            pxc.this.h.post(new $$Lambda$pxc$a$5_itkS4gt1emD1zjSsMoBH0dxZk(this, (int) (((float) i) * pxc.this.g), i2));
            pxc.this.f.accept(new b());
        }

        @JavascriptInterface
        public final void bannerHeight(int i) {
            LayoutParams layoutParams = pxc.this.c.getLayoutParams();
            layoutParams.height = (int) (((float) i) * pxc.this.g);
            pxc.this.h.post(new $$Lambda$pxc$a$fV4JH69nvRYS3lTbKNKJ9sN2QWg(this, layoutParams));
        }

        @JavascriptInterface
        public final void call(String str) {
            pxc.this.h.post(new $$Lambda$pxc$a$B8zOxOHpF9q7Oh4_SUzOrNW_PZk(this, str));
        }

        @JavascriptInterface
        public final void documentReady() {
            pxc.this.h.post(new $$Lambda$pxc$a$cZl1ddpSso__g47Qtd46ebECj04(this));
        }

        @JavascriptInterface
        public final void webviewEvent(String str) {
            try {
                qbj qbj = (qbj) pxc.g(pxc.this).readValue(str, qbj.class);
                pxc.this.f.accept(new h(qbj.a, qbj.b, qbj.c));
            } catch (IOException e) {
                Logger.b("Unable to parse WebviewEvent: %s", e.getMessage());
            }
        }
    }

    public pxc(SnackBar snackBar) {
        super(snackBar, 999, "InAppMessagingSnackItem");
        this.g = snackBar.getContext().getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (!this.n) {
            this.f.accept(new c());
        }
    }

    static /* synthetic */ ObjectMapper g(pxc pxc) {
        if (pxc.l == null) {
            rwl rwl = null;
            pxc.l = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        }
        return pxc.l;
    }

    public final void a(ViewGroup viewGroup) {
        this.d = viewGroup;
    }

    public final void a(String str) {
        this.j = str;
        if (!this.e) {
            try {
                this.c = (FrameLayout) LayoutInflater.from(this.d.getContext()).inflate(R.layout.banner_view, this.d, false);
                this.b = (WebView) this.c.findViewById(R.id.html_content);
                int a2 = !gau.b(this.d.getContext()) ? 0 : gau.a(this.d.getContext().getResources());
                if (a2 != 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
                    layoutParams.topMargin += a2;
                    this.c.setLayoutParams(layoutParams);
                }
                this.d.addView(this.c);
                AnonymousClass1 r2 = new WebViewClient() {
                };
                this.b.getSettings().setJavaScriptEnabled(true);
                this.b.setWebViewClient(r2);
                WebView webView = this.b;
                a aVar = new a(this, 0);
                this.k = aVar;
                webView.addJavascriptInterface(aVar, "Android");
                this.b.setHorizontalScrollBarEnabled(false);
                this.b.setVerticalScrollBarEnabled(false);
                this.b.setAccessibilityDelegate(new AccessibilityDelegate());
            } catch (Exception e2) {
                if (e2.getMessage() != null && e2.getMessage().contains("webview")) {
                    Logger.b("Exception inflating Webview: %s", e2.getMessage());
                }
                this.m = true;
            }
            this.e = true;
        }
        if (!this.m) {
            this.b.loadData(qbi.a(str), "text/html; charset=utf-8", "base64");
            this.i.postDelayed(new $$Lambda$pxc$2TgRUaI8PkTM8lvfJaRlOdWJLgE(this), 20000);
            return;
        }
        knw<pww> knw = this.f;
        if (knw != null) {
            knw.accept(new c());
        }
    }

    public final kmn<pwy> connect(final knw<pww> knw) {
        this.f = knw;
        return new kmn<pwy>() {
            public final /* synthetic */ void accept(Object obj) {
                pwy pwy = (pwy) obj;
                if (pxc.this.m) {
                    knw.accept(new c());
                    return;
                }
                pwz b2 = pwy.b();
                if (b2 == null) {
                    pxc.this.n = false;
                    pxc.this.a(false);
                    pxc.this.i.removeCallbacksAndMessages(null);
                } else if (!pwy.a()) {
                    pxc.this.a(b2.a().getHtmlContent());
                }
            }

            public final void dispose() {
            }
        };
    }
}
