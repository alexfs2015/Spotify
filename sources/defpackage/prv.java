package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.R;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import com.spotify.music.features.quicksilver.qa.views.CardMessageAcceptRejectFlowActivity;
import com.spotify.music.features.quicksilver.utils.QuicksilverFrameLayoutTouchIntercepted;
import com.spotify.music.slate.container.view.SlateView.DisplayMode;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.SwipeDirection;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: prv reason: default package */
public class prv extends prw implements com.spotify.music.slate.container.view.card.CardInteractionHandler.a, kyf, prt, defpackage.rdh.b {
    public rnf T;
    public jrp U;
    public hec V;
    public poj W;
    public prz X;
    public Scheduler Y;
    public Scheduler Z;
    public rda a;
    public Flowable<PlayerState> aa;
    public psg ab;
    PublishSubject<String> ac = PublishSubject.a();
    Disposable ad = Disposables.b();
    /* access modifiers changed from: private */
    public QuicksilverFrameLayoutTouchIntercepted ah;
    private WebView ai;
    private com.spotify.music.slate.container.view.card.CardInteractionHandler.a aj;
    private b ak;
    private final a al = new a();
    private String am;
    /* access modifiers changed from: private */
    public Long an;
    /* access modifiers changed from: private */
    public boolean ao;
    private boolean ap;
    private Handler aq;
    private Handler ar;
    private ObjectMapper as;
    private Disposable at = Disposables.b();
    private Disposable au = Disposables.b();
    public prq b;

    /* renamed from: prv$a */
    public class a extends psd {
        public a() {
        }
    }

    /* renamed from: prv$b */
    class b {
        private b() {
        }

        /* synthetic */ b(prv prv, byte b) {
            this();
        }

        @JavascriptInterface
        public final void call(String str) {
            prv.this.ac.onNext(str);
        }

        @JavascriptInterface
        public final void documentReady(String str) {
            prv.this.ae();
            prq prq = prv.this.b;
            long c = prv.this.U.c() - prv.this.an.longValue();
            if (!prv.this.ao) {
                prp prp = prq.a;
                prp.d.a(prp.a.getImpressionUrl());
                prp.e.a(prp.a.getUuid(), "cards");
                prp prp2 = prq.a;
                prp2.e.a(prp2.a.getId(), c, "cards", prp2.b.getTriggerString(), prp2.b.getType());
            }
            prv.this.ao = true;
            prv prv = prv.this;
            prv.ad = Observable.b((Callable<? extends T>) new defpackage.psk.a<Object>(((Context) fay.a(prv.n())).getResources().getDisplayMetrics().density, prv.d(prv.this), str)).b(prv.this.Y).a(prv.this.Z).a((Consumer<? super T>) new $$Lambda$prv$b$ATSLiN7gPh0vTpXsSAYPZqzKwoU<Object>(this), (Consumer<? super Throwable>) $$Lambda$prv$b$BlNaRj5nci_KVp76oHg7EYlfk0.INSTANCE);
            prv.e(prv.this);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(psk[] pskArr) {
            prv.this.ah.a = pskArr;
        }

        @JavascriptInterface
        public final void webviewEvent(String str) {
            try {
                psn psn = (psn) prv.d(prv.this).readValue(str, psn.class);
                prq prq = prv.this.b;
                String str2 = psn.a;
                String str3 = psn.b;
                Map<String, String> map = psn.c;
                prp prp = prq.a;
                prp.e.a("cards", prp.a.getId(), prp.a.getUuid(), str2, str3, map);
            } catch (IOException e) {
                Logger.b("Unable to parse WebviewEvent: %s", e.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(DisplayMode displayMode) {
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
    }

    public static prv a(prk prk, QuicksilverCardMessage quicksilverCardMessage) {
        fay.a(prk);
        fay.a(quicksilverCardMessage);
        prv prv = new prv();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_MESSAGE", quicksilverCardMessage);
        bundle.putParcelable("EXTRA_TRIGGER", prk);
        prv.g(bundle);
        return prv;
    }

    public View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            this.ah = (QuicksilverFrameLayoutTouchIntercepted) layoutInflater.inflate(R.layout.quicksilver_fragment_view, viewGroup, false);
            this.ai = (WebView) this.ah.findViewById(R.id.html_content);
            return this.ah;
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().contains("webview")) {
                Logger.b("Exception inflating Webview: %s", e.getMessage());
            }
            prq prq = this.b;
            prq.b = true;
            c();
            prp prp = prq.a;
            prp.e.a("card-inflation-error", prp.b.getTriggerString(), prp.b.getType(), "cards", prp.a.getId());
            return new View(n());
        }
    }

    public final void b(Bundle bundle) {
        long j;
        super.b(bundle);
        this.aq = new Handler(Looper.getMainLooper());
        this.ar = new Handler();
        this.a.a(PageIdentifiers.INAPPMESSAGE_MODAL.mPageIdentifier);
        if (bundle != null) {
            j = bundle.getLong("loading_start_time", this.U.c());
        } else {
            j = this.U.c();
        }
        this.an = Long.valueOf(j);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("has_logged_impression", false)) {
            z = true;
        }
        this.ao = z;
        this.at = this.ac.a((ObservableSource<? extends U>) this.V.a().j(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$H1WqSZEueEU9yDOJnt49XWSx2no.INSTANCE).a((Consumer<? super T>) new $$Lambda$prv$tbKyt0mZA3889S8hGBWSAreBY<Object>(this), (Consumer<? super Throwable>) $$Lambda$prv$9NJf1uYC1umb0hoLVV4ZqUvfgA.INSTANCE);
        this.au = this.aa.a((Consumer<? super T>) new $$Lambda$prv$Fn1RKDknufcY8ypdVjho4NFdbPE<Object>(this), (Consumer<? super Throwable>) $$Lambda$prv$KIQ0erxOyPpLN8ooV5PxQvU9Lg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        prq prq = this.b;
        String str = (String) hoVar.a;
        fpt fpt = (fpt) fay.a(hoVar.b);
        Map clickActions = prq.a.a.getClickActions();
        boolean z = (clickActions == null || str == null || str.isEmpty() || clickActions.get(str) == null) ? false : true;
        if (z) {
            prp prp = prq.a;
            prr prr = prp.c;
            Map clickActions2 = prp.a.getClickActions();
            if (clickActions2 != null && !str.isEmpty()) {
                QuicksilverClickAction quicksilverClickAction = (QuicksilverClickAction) clickActions2.get(str);
                if (quicksilverClickAction != null) {
                    prr.a(quicksilverClickAction, fpt);
                }
            }
            Map clickActions3 = prp.a.getClickActions();
            if (clickActions3 != null) {
                prp.d.a((QuicksilverClickAction) clickActions3.get(str));
                prp.e.b(prp.a.getUuid(), ((QuicksilverClickAction) clickActions3.get(str)).getButtonType());
            }
        }
        if (!z || ((QuicksilverClickAction) clickActions.get(str)).getShouldDismiss().booleanValue()) {
            c();
        }
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ai.setBackgroundColor(0);
        this.af.setClickable(false);
        this.af.setFocusable(false);
        this.af.setVisibility(4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ai() {
        this.af.setClickable(true);
        this.af.setFocusable(true);
        this.af.setVisibility(0);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putLong("loading_start_time", this.an.longValue());
        bundle.putBoolean("has_logged_impression", this.ao);
    }

    public final void h() {
        super.h();
        WebView webView = this.ai;
        if (webView != null) {
            webView.setWebViewClient(null);
        }
    }

    public final void a(Context context) {
        super.a(context);
        if (p() instanceof com.spotify.music.slate.container.view.card.CardInteractionHandler.a) {
            this.aj = (com.spotify.music.slate.container.view.card.CardInteractionHandler.a) p();
        }
        if (p() instanceof kye) {
            ((kye) p()).a(this);
        }
    }

    public final void aK_() {
        super.aK_();
        this.aj = null;
        if (p() != null && p().isFinishing()) {
            ag();
        }
        if (p() instanceof kye) {
            ((kye) p()).a(null);
        }
        if (!this.at.b()) {
            this.at.bf_();
        }
        if (!this.ad.b()) {
            this.ad.bf_();
        }
        if (!this.au.b()) {
            this.au.bf_();
        }
    }

    public final void g() {
        super.g();
        prq prq = this.b;
        if (!prq.b) {
            a(prq.a.a.getHtmlContent());
            QuicksilverCardMessage quicksilverCardMessage = prq.a.a;
            if (quicksilverCardMessage.isFullscreen()) {
                i_(8);
                b(8);
            } else {
                if (quicksilverCardMessage.getHeading() == null || TextUtils.isEmpty(quicksilverCardMessage.getHeading())) {
                    b(8);
                    i_(0);
                } else {
                    b(quicksilverCardMessage.getHeading());
                    b(0);
                    i_(8);
                }
                if (quicksilverCardMessage.getCloseTitle() != null && !TextUtils.isEmpty(quicksilverCardMessage.getCloseTitle())) {
                    c(quicksilverCardMessage.getCloseTitle());
                    c(0);
                }
            }
            c(8);
        }
        this.ae.a = this;
        this.ae.a((com.spotify.music.slate.container.view.SlateView.a) $$Lambda$prv$t4cpPwhrrydq6j1ODBMBSZAojWY.INSTANCE);
        ip.s(this.af);
        ip.a((View) this.af, (il) new $$Lambda$prv$yet6Zo9e08TK9yfcpHkH9_jk3AA(this));
    }

    public final void a(String str) {
        this.am = str;
        this.ai.getSettings().setTextZoom(100);
        this.ai.setHorizontalScrollBarEnabled(false);
        this.ai.setVerticalScrollBarEnabled(false);
        this.ai.setWebViewClient(new WebViewClient());
        this.ai.getSettings().setJavaScriptEnabled(true);
        this.ai.setAccessibilityDelegate(new AccessibilityDelegate());
        WebView webView = this.ai;
        b bVar = new b(this, 0);
        this.ak = bVar;
        webView.addJavascriptInterface(bVar, "Android");
        this.ai.loadData(psm.a(str), "text/html; charset=utf-8", "base64");
        prz prz = this.X;
        ae();
        this.ar.postDelayed(new $$Lambda$prv$U66m7vHsb4RocXgFnU9ajaQzjfo(this), TimeUnit.SECONDS.toMillis(20));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ah() {
        prq prq = this.b;
        c();
        prp prp = prq.a;
        prp.e.a("card-inflation-timeout", prp.b.getTriggerString(), prp.b.getType(), "cards", prp.a.getId());
    }

    /* access modifiers changed from: private */
    public void ae() {
        this.ar.removeCallbacksAndMessages(null);
    }

    public final void aE_() {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.aj;
        if (aVar != null) {
            aVar.aE_();
        }
    }

    public final void b() {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.aj;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void a(SwipeDirection swipeDirection) {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.aj;
        if (aVar != null) {
            aVar.a(swipeDirection);
            Logger.b("onSwipe Called", new Object[0]);
            return;
        }
        c();
    }

    public final void a(double d, float f, SwipeDirection swipeDirection) {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.aj;
        if (aVar != null) {
            aVar.a(d, f, swipeDirection);
        }
    }

    public final rdh af() {
        return rdh.a((defpackage.rdh.a) this.a);
    }

    public final void c() {
        ae();
        this.aq.removeCallbacksAndMessages(null);
        ag();
        if (!(p() instanceof CardMessageAcceptRejectFlowActivity) || !((CardMessageAcceptRejectFlowActivity) p()).k()) {
            if (this.t != null) {
                this.t.a().a((Fragment) this).c();
            }
            return;
        }
        p().finish();
    }

    private void ag() {
        if (!this.ap) {
            this.ap = true;
            poj.a("cards");
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        c();
    }

    public boolean onBackPressed() {
        c();
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ iw a(View view, iw iwVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        hv hvVar = null;
        if (VERSION.SDK_INT >= 28) {
            DisplayCutout displayCutout = ((WindowInsets) iwVar.a).getDisplayCutout();
            if (displayCutout != null) {
                hvVar = new hv(displayCutout);
            }
        }
        if (hvVar != null) {
            i3 = VERSION.SDK_INT >= 28 ? ((DisplayCutout) hvVar.a).getSafeInsetLeft() : 0;
            i2 = VERSION.SDK_INT >= 28 ? ((DisplayCutout) hvVar.a).getSafeInsetTop() : 0;
            i = VERSION.SDK_INT >= 28 ? ((DisplayCutout) hvVar.a).getSafeInsetRight() : 0;
            i4 = VERSION.SDK_INT >= 28 ? ((DisplayCutout) hvVar.a).getSafeInsetBottom() : 0;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        if (p() == null || p().getWindow() == null || p().getWindow().getDecorView().getSystemUiVisibility() == 0 || p().getWindow().getDecorView().getSystemUiVisibility() == 3846) {
            i6 = 0;
        } else {
            i6 = gaa.a(o().getResources());
            ka p = p();
            if (p != null) {
                Resources resources = p.getResources();
                Configuration configuration = resources.getConfiguration();
                boolean z = configuration.orientation == 1;
                String str = "android";
                String str2 = "dimen";
                String str3 = "navigation_bar_height";
                if (configuration.smallestScreenWidthDp >= 600) {
                    if (!z) {
                        str3 = "navigation_bar_height_landscape";
                    }
                    i7 = resources.getIdentifier(str3, str2, str);
                } else {
                    if (!z) {
                        str3 = "navigation_bar_width";
                    }
                    i7 = resources.getIdentifier(str3, str2, str);
                }
                if (i7 > 0) {
                    i5 = resources.getDimensionPixelSize(i7);
                    view.setPadding(Math.max(i3, iwVar.a()), ((Integer) Collections.max(Arrays.asList(new Integer[]{Integer.valueOf(i2), Integer.valueOf(iwVar.b()), Integer.valueOf(i6)}))).intValue(), Math.max(i, iwVar.c()), ((Integer) Collections.max(Arrays.asList(new Integer[]{Integer.valueOf(i4), Integer.valueOf(iwVar.d()), Integer.valueOf(i5)}))).intValue());
                    view.requestLayout();
                    return iwVar;
                }
            }
        }
        i5 = 0;
        view.setPadding(Math.max(i3, iwVar.a()), ((Integer) Collections.max(Arrays.asList(new Integer[]{Integer.valueOf(i2), Integer.valueOf(iwVar.b()), Integer.valueOf(i6)}))).intValue(), Math.max(i, iwVar.c()), ((Integer) Collections.max(Arrays.asList(new Integer[]{Integer.valueOf(i4), Integer.valueOf(iwVar.d()), Integer.valueOf(i5)}))).intValue());
        view.requestLayout();
        return iwVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        if (prx.a(playerState)) {
            c();
            prk prk = (prk) this.i.getParcelable("EXTRA_TRIGGER");
            String str = "ad-playback-started-while-card-showing";
            String str2 = "cards";
            this.ab.a(str, prk.getTriggerString(), prk.getType(), str2, ((QuicksilverCardMessage) this.i.getParcelable("EXTRA_MESSAGE")).getId());
        }
    }

    static /* synthetic */ ObjectMapper d(prv prv) {
        if (prv.as == null) {
            prv.as = prv.T.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        }
        return prv.as;
    }

    static /* synthetic */ void e(prv prv) {
        if (prv.af != null && prv.af.getVisibility() != 0) {
            prv.aq.post(new $$Lambda$prv$h0ldOUifRl8IlL3vrAcK2Sp8cyo(prv));
        }
    }
}
