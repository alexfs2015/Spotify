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

/* renamed from: ppr reason: default package */
public final class ppr implements kjd<ppo, ppm>, defpackage.pps.a {
    public final float a;
    public View b;
    public CardView c;
    public defpackage.ppe.a d;
    pps e;
    boolean f;
    private WebView g;
    private QuicksilverFrameLayoutTouchIntercepted h;
    /* access modifiers changed from: private */
    public kkn<ppm> i;
    private final Handler j;
    /* access modifiers changed from: private */
    public final ObjectMapper k;
    private String l;
    private a m = new a();

    /* renamed from: ppr$a */
    public class a {
        public a() {
        }

        @JavascriptInterface
        public final void call(String str) {
            ppr.this.i.accept(new b(str));
        }

        @JavascriptInterface
        public final void documentReady(String str) {
            ppr.this.i.accept(new g(Arrays.asList(new defpackage.psk.a(ppr.this.a, ppr.this.k, str).call())));
            ppr.this.i.accept(new f());
        }

        @JavascriptInterface
        public final void noteHeight(int i) {
            ppr.this.i.accept(new e(i));
        }

        @JavascriptInterface
        public final void webviewEvent(String str) {
            try {
                psn psn = (psn) ppr.this.k.readValue(str, psn.class);
                ppr.this.i.accept(new h(psn.a, psn.b, psn.c));
            } catch (IOException e) {
                Logger.b("Unable to parse WebviewEvent: %s", e.getMessage());
            }
        }
    }

    public ppr(LayoutInflater layoutInflater, ViewGroup viewGroup, float f2, ObjectMapper objectMapper) {
        try {
            AnonymousClass1 r2 = new b() {
                public final void a() {
                    super.a();
                    if (ppr.this.i != null) {
                        ppr.this.i.accept(new c());
                    }
                }
            };
            this.b = layoutInflater.inflate(R.layout.note_fragment_layout, viewGroup, false);
            this.g = (WebView) this.b.findViewById(R.id.web_content);
            this.h = (QuicksilverFrameLayoutTouchIntercepted) this.b.findViewById(R.id.content_frame);
            this.c = (CardView) this.b.findViewById(R.id.slate_content_container);
            this.c.setOnTouchListener(new ppi(this.b, this.c, r2));
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
        this.e = new pps(this);
    }

    public final void a(List<psk> list) {
        for (psk psk : list) {
            if (psk.b - 500.0f > 0.0f) {
                psk.b -= 500.0f;
            }
        }
        this.h.a = (psk[]) list.toArray(new psk[0]);
    }

    public final kje<ppo> connect(final kkn<ppm> kkn) {
        this.i = kkn;
        return new kje<ppo>() {
            public final /* synthetic */ void accept(Object obj) {
                ppo ppo = (ppo) obj;
                if (ppr.this.f) {
                    kkn.accept(new d());
                    return;
                }
                pps pps = ppr.this.e;
                if (!ppo.equals(pps.d)) {
                    NoteMessage a2 = ppo.a();
                    if (pps.a || a2 == null || a2.getHtmlContent() == null) {
                        List b2 = ppo.b();
                        if (b2 != null) {
                            pps.c.a(b2);
                        }
                        if (pps.b || ppo.c() <= 0) {
                            if (pps.b && ppo.c() > 0) {
                                pps.c.a(ppo.c());
                            }
                            if (pps.a && ppo.a() == null) {
                                pps.c.a();
                            }
                            pps.d = ppo;
                        } else {
                            pps.c.b(ppo.c());
                            pps.b = true;
                        }
                    } else {
                        pps.c.a(a2.getHtmlContent());
                        pps.a = true;
                    }
                }
            }

            public final void dispose() {
                ppr.this.i = null;
            }
        };
    }

    public final void a(String str) {
        this.g.loadData(psm.a(str), "text/html; charset=utf-8", "base64");
        this.l = str;
    }

    public final void a(int i2) {
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        layoutParams.height = (int) (((float) i2) * this.a);
        this.c.post(new $$Lambda$ppr$HNYGlFUjDPNUApXSzWz_i0K5niY(this, layoutParams));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(LayoutParams layoutParams) {
        this.c.setLayoutParams(layoutParams);
        this.c.requestLayout();
    }

    public final void b(int i2) {
        this.c.setY(this.b.getY() + ((float) this.b.getHeight()));
        this.j.post(new $$Lambda$ppr$veCca7jFnazkwc0q9SLDfV5_1KM(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        int i3 = (int) (((float) i2) * this.a);
        layoutParams.height = i3;
        this.c.setLayoutParams(layoutParams);
        this.c.setVisibility(0);
        if (System.getFloat(this.c.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            this.c.post(new $$Lambda$ppr$6dFOi3b67uTCW_ephmkDuyUfKJQ(this, this.c.getY() - ((float) (i3 + 40))));
            return;
        }
        this.c.animate().yBy((float) ((i3 + 40) * -1)).setInterpolator(new LinearInterpolator()).setDuration(100).start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(float f2) {
        this.c.setY(f2);
    }

    public final void a() {
        this.g.loadUrl("about:blank");
        if (System.getFloat(this.c.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            this.c.post(new $$Lambda$ppr$7R0NzLsmxLHxn2I8pzpjZbAMdU(this, this.c.getY() + 500.0f));
            return;
        }
        this.c.animate().yBy(500.0f).setInterpolator(new LinearInterpolator()).setDuration(100).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ppr.this.d.dismiss();
            }
        }).start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f2) {
        this.c.setY(f2);
        this.d.dismiss();
    }
}
