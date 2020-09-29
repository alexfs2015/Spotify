package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.System;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import androidx.cardview.widget.CardView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.utils.QuicksilverFrameLayoutTouchIntercepted;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: pyn reason: default package */
public final class pyn implements kmm<pyk, pyi>, defpackage.pyo.a {
    public final float a;
    public View b;
    public CardView c;
    public defpackage.pya.a d;
    pyo e;
    boolean f;
    private WebView g;
    private QuicksilverFrameLayoutTouchIntercepted h;
    /* access modifiers changed from: private */
    public knw<pyi> i;
    private final Handler j;
    /* access modifiers changed from: private */
    public final ObjectMapper k;
    private String l;
    private a m = new a();

    /* renamed from: pyn$a */
    public class a {
        public a() {
        }

        @JavascriptInterface
        public final void call(String str) {
            pyn.this.i.accept(new b(str));
        }

        @JavascriptInterface
        public final void documentReady(String str) {
            pyn.this.i.accept(new g(Arrays.asList(new defpackage.qbg.a(pyn.this.a, pyn.this.k, str).call())));
            pyn.this.i.accept(new f());
        }

        @JavascriptInterface
        public final void noteHeight(int i) {
            pyn.this.i.accept(new e(i));
        }

        @JavascriptInterface
        public final void webviewEvent(String str) {
            try {
                qbj qbj = (qbj) pyn.this.k.readValue(str, qbj.class);
                pyn.this.i.accept(new h(qbj.a, qbj.b, qbj.c));
            } catch (IOException e) {
                Logger.b("Unable to parse WebviewEvent: %s", e.getMessage());
            }
        }
    }

    public pyn(LayoutInflater layoutInflater, ViewGroup viewGroup, float f2, ObjectMapper objectMapper) {
        try {
            AnonymousClass1 r2 = new b() {
                public final void a() {
                    super.a();
                    if (pyn.this.i != null) {
                        pyn.this.i.accept(new c());
                    }
                }
            };
            this.b = layoutInflater.inflate(R.layout.note_fragment_layout, viewGroup, false);
            this.g = (WebView) this.b.findViewById(R.id.web_content);
            this.h = (QuicksilverFrameLayoutTouchIntercepted) this.b.findViewById(R.id.content_frame);
            this.c = (CardView) this.b.findViewById(R.id.slate_content_container);
            this.c.setOnTouchListener(new pye(this.b, this.c, r2));
            this.c.getLayoutParams().height = 500;
            this.g.setHorizontalScrollBarEnabled(false);
            this.g.setVerticalScrollBarEnabled(false);
            this.g.setWebViewClient(new WebViewClient() {
            });
            this.g.getSettings().setJavaScriptEnabled(true);
            this.g.setAccessibilityDelegate(new AccessibilityDelegate());
            this.g.addJavascriptInterface(this.m, "Android");
        } catch (Exception e2) {
            if (e2.getMessage() != null && e2.getMessage().contains("webview")) {
                Logger.b("Exception inflating Webview: %s", e2.getMessage());
            }
            this.f = true;
        }
        this.k = objectMapper;
        this.j = new Handler(Looper.getMainLooper());
        this.a = f2;
        this.e = new pyo(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f2) {
        this.c.setY(f2);
        this.d.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(LayoutParams layoutParams) {
        this.c.setLayoutParams(layoutParams);
        this.c.requestLayout();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(float f2) {
        this.c.setY(f2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        int i3 = (int) (((float) i2) * this.a);
        layoutParams.height = i3;
        this.c.setLayoutParams(layoutParams);
        this.c.setVisibility(0);
        if (System.getFloat(this.c.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            this.c.post(new $$Lambda$pyn$o5lfJLOWxifitDDxUwRQeAwiQ(this, this.c.getY() - ((float) (i3 + 40))));
            return;
        }
        this.c.animate().yBy((float) ((i3 + 40) * -1)).setInterpolator(new LinearInterpolator()).setDuration(100).start();
    }

    public final void a() {
        this.g.loadUrl("about:blank");
        if (System.getFloat(this.c.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            this.c.post(new $$Lambda$pyn$oeMdOyS5rCr5kwWKpOzILakGG4(this, this.c.getY() + 500.0f));
            return;
        }
        this.c.animate().yBy(500.0f).setInterpolator(new LinearInterpolator()).setDuration(100).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                pyn.this.d.dismiss();
            }
        }).start();
    }

    public final void a(int i2) {
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        layoutParams.height = (int) (((float) i2) * this.a);
        this.c.post(new $$Lambda$pyn$b4i8mDZkEFyYfbEMPiWBPG3go8(this, layoutParams));
    }

    public final void a(String str) {
        this.g.loadData(qbi.a(str), "text/html; charset=utf-8", "base64");
        this.l = str;
    }

    public final void a(List<qbg> list) {
        for (qbg qbg : list) {
            if (qbg.b - 500.0f > 0.0f) {
                qbg.b -= 500.0f;
            }
        }
        this.h.a = (qbg[]) list.toArray(new qbg[0]);
    }

    public final void b(int i2) {
        this.c.setY(this.b.getY() + ((float) this.b.getHeight()));
        this.j.post(new $$Lambda$pyn$DINieUlUmSwvwXrSMLVwzaGFrXY(this, i2));
    }

    public final kmn<pyk> connect(final knw<pyi> knw) {
        this.i = knw;
        return new kmn<pyk>() {
            public final /* synthetic */ void accept(Object obj) {
                pyk pyk = (pyk) obj;
                if (pyn.this.f) {
                    knw.accept(new d());
                    return;
                }
                pyo pyo = pyn.this.e;
                if (!pyk.equals(pyo.d)) {
                    NoteMessage a2 = pyk.a();
                    if (pyo.a || a2 == null || a2.getHtmlContent() == null) {
                        List b2 = pyk.b();
                        if (b2 != null) {
                            pyo.c.a(b2);
                        }
                        if (pyo.b || pyk.c() <= 0) {
                            if (pyo.b && pyk.c() > 0) {
                                pyo.c.a(pyk.c());
                            }
                            if (pyo.a && pyk.a() == null) {
                                pyo.c.a();
                            }
                            pyo.d = pyk;
                        } else {
                            pyo.c.b(pyk.c());
                            pyo.b = true;
                        }
                    } else {
                        pyo.c.a(a2.getHtmlContent());
                        pyo.a = true;
                    }
                }
            }

            public final void dispose() {
                pyn.this.i = null;
            }
        };
    }
}
