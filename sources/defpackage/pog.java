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

/* renamed from: pog reason: default package */
public final class pog extends jqn implements kjd<poc, poa> {
    WebView b;
    /* access modifiers changed from: private */
    public FrameLayout c;
    private ViewGroup d;
    private boolean e;
    /* access modifiers changed from: private */
    public kkn<poa> f;
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

    /* renamed from: pog$a */
    class a {
        private a() {
        }

        /* synthetic */ a(pog pog, byte b) {
            this();
        }

        @JavascriptInterface
        public final void call(String str) {
            pog.this.h.post(new $$Lambda$pog$a$DEGyVxIQOllQ4U5hT_y2ehXCNPc(this, str));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            pog.this.f.accept(new defpackage.poa.a(str));
        }

        @JavascriptInterface
        public final void bannerHeight(int i) {
            LayoutParams layoutParams = pog.this.c.getLayoutParams();
            layoutParams.height = (int) (((float) i) * pog.this.g);
            pog.this.h.post(new $$Lambda$pog$a$nFKplpcoWIX7k5F918BGBIqWhkU(this, layoutParams));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(LayoutParams layoutParams) {
            pog.this.c.setLayoutParams(layoutParams);
        }

        @JavascriptInterface
        public final void animateToNewHeight(int i, int i2) {
            pog.this.h.post(new $$Lambda$pog$a$x92wxG_Laml3ozLbex6fzY3dUzk(this, (int) (((float) i) * pog.this.g), i2));
            pog.this.f.accept(new b());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i, int i2) {
            if (System.getFloat(pog.this.b.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                pog.this.c.getLayoutParams().height = i;
                pog.this.c.requestLayout();
                return;
            }
            pog.this.b.getLayoutParams().height = i;
            pog.this.b.requestLayout();
            ValueAnimator duration = ValueAnimator.ofInt(new int[]{pog.this.c.getHeight(), i}).setDuration((long) i2);
            duration.addUpdateListener(new $$Lambda$pog$a$YkVpL5VMvX4MJYeLqeW4jMNT8s(this));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(duration);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ValueAnimator valueAnimator) {
            pog.this.c.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            pog.this.c.requestLayout();
            pog.this.b.requestLayout();
        }

        @JavascriptInterface
        public final void documentReady() {
            pog.this.h.post(new $$Lambda$pog$a$vfPGdq6G3B1AUY2L1E4WQFxARms(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (!pog.this.n) {
                pog.this.f.accept(new e());
                pog.this.a(true);
                pog.this.n = true;
            }
        }

        @JavascriptInterface
        public final void webviewEvent(String str) {
            try {
                psn psn = (psn) pog.g(pog.this).readValue(str, psn.class);
                pog.this.f.accept(new h(psn.a, psn.b, psn.c));
            } catch (IOException e) {
                Logger.b("Unable to parse WebviewEvent: %s", e.getMessage());
            }
        }
    }

    public pog(SnackBar snackBar) {
        super(snackBar, 999, "InAppMessagingSnackItem");
        this.g = snackBar.getContext().getResources().getDisplayMetrics().density;
    }

    public final void a(ViewGroup viewGroup) {
        this.d = viewGroup;
    }

    public final void a(String str) {
        int i2;
        this.j = str;
        if (!this.e) {
            try {
                this.c = (FrameLayout) LayoutInflater.from(this.d.getContext()).inflate(R.layout.banner_view, this.d, false);
                this.b = (WebView) this.c.findViewById(R.id.html_content);
                if (!gaa.b(this.d.getContext())) {
                    i2 = 0;
                } else {
                    i2 = gaa.a(this.d.getContext().getResources());
                }
                if (i2 != 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
                    layoutParams.topMargin += i2;
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
            this.b.loadData(psm.a(str), "text/html; charset=utf-8", "base64");
            this.i.postDelayed(new $$Lambda$pog$_NBfLxHMtFQKBlWzgef9OdOINjE(this), 20000);
            return;
        }
        kkn<poa> kkn = this.f;
        if (kkn != null) {
            kkn.accept(new c());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (!this.n) {
            this.f.accept(new c());
        }
    }

    public final kje<poc> connect(final kkn<poa> kkn) {
        this.f = kkn;
        return new kje<poc>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                poc poc = (poc) obj;
                if (pog.this.m) {
                    kkn.accept(new c());
                    return;
                }
                pod b2 = poc.b();
                if (b2 == null) {
                    pog.this.n = false;
                    pog.this.a(false);
                    pog.this.i.removeCallbacksAndMessages(null);
                } else if (!poc.a()) {
                    pog.this.a(b2.a().getHtmlContent());
                }
            }
        };
    }

    static /* synthetic */ ObjectMapper g(pog pog) {
        if (pog.l == null) {
            rnf rnf = null;
            pog.l = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        }
        return pog.l;
    }
}
