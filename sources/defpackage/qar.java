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

/* renamed from: qar reason: default package */
public class qar extends qas implements com.spotify.music.slate.container.view.card.CardInteractionHandler.a, lbp, qap, defpackage.rmf.b {
    public rwl T;
    public jtz U;
    public hgy V;
    public pxf W;
    public qav X;
    public Scheduler Y;
    public Scheduler Z;
    public rly a;
    public Flowable<PlayerState> aa;
    public qbc ab;
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
    public qam b;

    /* renamed from: qar$a */
    public class a extends qaz {
        public a() {
        }
    }

    /* renamed from: qar$b */
    class b {
        private b() {
        }

        /* synthetic */ b(qar qar, byte b) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(qbg[] qbgArr) {
            qar.this.ah.a = qbgArr;
        }

        @JavascriptInterface
        public final void call(String str) {
            qar.this.ac.onNext(str);
        }

        @JavascriptInterface
        public final void documentReady(String str) {
            qar.this.ae();
            qam qam = qar.this.b;
            long c = qar.this.U.c() - qar.this.an.longValue();
            if (!qar.this.ao) {
                qal qal = qam.a;
                qal.d.a(qal.a.getImpressionUrl());
                qal.e.a(qal.a.getUuid(), "cards");
                qal qal2 = qam.a;
                qal2.e.a(qal2.a.getId(), c, "cards", qal2.b.getTriggerString(), qal2.b.getType());
            }
            qar.this.ao = true;
            qar qar = qar.this;
            qar.ad = Observable.b((Callable<? extends T>) new defpackage.qbg.a<Object>(((Context) fbp.a(qar.n())).getResources().getDisplayMetrics().density, qar.d(qar.this), str)).b(qar.this.Y).a(qar.this.Z).a((Consumer<? super T>) new $$Lambda$qar$b$GmTI2t7v01fpL4i9WUS5VEJKXBU<Object>(this), (Consumer<? super Throwable>) $$Lambda$qar$b$OWYUZSxOGsP7xzgx3sofl_hNgI.INSTANCE);
            qar.e(qar.this);
        }

        @JavascriptInterface
        public final void webviewEvent(String str) {
            try {
                qbj qbj = (qbj) qar.d(qar.this).readValue(str, qbj.class);
                qam qam = qar.this.b;
                String str2 = qbj.a;
                String str3 = qbj.b;
                Map<String, String> map = qbj.c;
                qal qal = qam.a;
                qal.e.a("cards", qal.a.getId(), qal.a.getUuid(), str2, str3, map);
            } catch (IOException e) {
                Logger.b("Unable to parse WebviewEvent: %s", e.getMessage());
            }
        }
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
            i6 = gau.a(o().getResources());
            kf p = p();
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

    public static qar a(qag qag, QuicksilverCardMessage quicksilverCardMessage) {
        fbp.a(qag);
        fbp.a(quicksilverCardMessage);
        qar qar = new qar();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_MESSAGE", quicksilverCardMessage);
        bundle.putParcelable("EXTRA_TRIGGER", qag);
        qar.g(bundle);
        return qar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        if (qat.a(playerState)) {
            c();
            qag qag = (qag) this.i.getParcelable("EXTRA_TRIGGER");
            String str = "ad-playback-started-while-card-showing";
            String str2 = "cards";
            this.ab.a(str, qag.getTriggerString(), qag.getType(), str2, ((QuicksilverCardMessage) this.i.getParcelable("EXTRA_MESSAGE")).getId());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        qam qam = this.b;
        String str = (String) hoVar.a;
        fqn fqn = (fqn) fbp.a(hoVar.b);
        Map clickActions = qam.a.a.getClickActions();
        boolean z = (clickActions == null || str == null || str.isEmpty() || clickActions.get(str) == null) ? false : true;
        if (z) {
            qal qal = qam.a;
            qan qan = qal.c;
            Map clickActions2 = qal.a.getClickActions();
            if (clickActions2 != null && !str.isEmpty()) {
                QuicksilverClickAction quicksilverClickAction = (QuicksilverClickAction) clickActions2.get(str);
                if (quicksilverClickAction != null) {
                    qan.a(quicksilverClickAction, fqn);
                }
            }
            Map clickActions3 = qal.a.getClickActions();
            if (clickActions3 != null) {
                qal.d.a((QuicksilverClickAction) clickActions3.get(str));
                qal.e.b(qal.a.getUuid(), ((QuicksilverClickAction) clickActions3.get(str)).getButtonType());
            }
        }
        if (!z || ((QuicksilverClickAction) clickActions.get(str)).getShouldDismiss().booleanValue()) {
            c();
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
    public void ae() {
        this.ar.removeCallbacksAndMessages(null);
    }

    private void ag() {
        if (!this.ap) {
            this.ap = true;
            pxf.a("cards");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ah() {
        qam qam = this.b;
        c();
        qal qal = qam.a;
        qal.e.a("card-inflation-timeout", qal.b.getTriggerString(), qal.b.getType(), "cards", qal.a.getId());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ai() {
        this.af.setClickable(true);
        this.af.setFocusable(true);
        this.af.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
    }

    static /* synthetic */ ObjectMapper d(qar qar) {
        if (qar.as == null) {
            qar.as = qar.T.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        }
        return qar.as;
    }

    static /* synthetic */ void e(qar qar) {
        if (qar.af != null && qar.af.getVisibility() != 0) {
            qar.aq.post(new $$Lambda$qar$rFo8Jvf6SI50kbesVEvsVgsT8FE(qar));
        }
    }

    public final void a(double d, float f, SwipeDirection swipeDirection) {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.aj;
        if (aVar != null) {
            aVar.a(d, f, swipeDirection);
        }
    }

    public final void a(Context context) {
        super.a(context);
        if (p() instanceof com.spotify.music.slate.container.view.card.CardInteractionHandler.a) {
            this.aj = (com.spotify.music.slate.container.view.card.CardInteractionHandler.a) p();
        }
        if (p() instanceof lbo) {
            ((lbo) p()).a(this);
        }
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        WebView webView = this.ai;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        if (this.af != null) {
            this.af.setClickable(false);
            this.af.setFocusable(false);
            this.af.setVisibility(4);
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
        this.ai.loadData(qbi.a(str), "text/html; charset=utf-8", "base64");
        qav qav = this.X;
        ae();
        this.ar.postDelayed(new $$Lambda$qar$zc2FFY2MNEjDBgLNPvpxni2xob8(this), TimeUnit.SECONDS.toMillis(20));
    }

    public final void aC_() {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.aj;
        if (aVar != null) {
            aVar.aC_();
        }
    }

    public final void aI_() {
        super.aI_();
        this.aj = null;
        if (p() != null && p().isFinishing()) {
            ag();
        }
        if (p() instanceof lbo) {
            ((lbo) p()).a(null);
        }
        if (!this.at.b()) {
            this.at.bd_();
        }
        if (!this.ad.b()) {
            this.ad.bd_();
        }
        if (!this.au.b()) {
            this.au.bd_();
        }
    }

    public final void aP_() {
        super.aP_();
        qam qam = this.b;
        if (!qam.b) {
            a(qam.a.a.getHtmlContent());
            QuicksilverCardMessage quicksilverCardMessage = qam.a.a;
            if (quicksilverCardMessage.isFullscreen()) {
                h_(8);
                b(8);
            } else {
                if (quicksilverCardMessage.getHeading() == null || TextUtils.isEmpty(quicksilverCardMessage.getHeading())) {
                    b(8);
                    h_(0);
                } else {
                    b(quicksilverCardMessage.getHeading());
                    b(0);
                    h_(8);
                }
                if (quicksilverCardMessage.getCloseTitle() != null && !TextUtils.isEmpty(quicksilverCardMessage.getCloseTitle())) {
                    c(quicksilverCardMessage.getCloseTitle());
                    c(0);
                }
            }
            c(8);
        }
        this.ae.a = this;
        this.ae.a((com.spotify.music.slate.container.view.SlateView.a) $$Lambda$qar$p5i7QVkqbujwh6TNjC6gRP3bbJY.INSTANCE);
        ip.s(this.af);
        ip.a((View) this.af, (il) new $$Lambda$qar$cQfl3Ct0x_QGf6Ch6m7UPP9S77k(this));
    }

    public final rmf af() {
        return rmf.a((defpackage.rmf.a) this.a);
    }

    public final void b() {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.aj;
        if (aVar != null) {
            aVar.b();
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
        this.at = this.ac.a((ObservableSource<? extends U>) this.V.a().j(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$26QELiyUlfnovJrezzVLafNno.INSTANCE).a((Consumer<? super T>) new $$Lambda$qar$JVQcotBxUqJKun0ovZ1kuXO_UNg<Object>(this), (Consumer<? super Throwable>) $$Lambda$qar$F8aLmS3RrUyQcZYa50oPsPvkT8.INSTANCE);
        this.au = this.aa.a((Consumer<? super T>) new $$Lambda$qar$H7gtbcEpTtvPEyNQnFenehMhsEE<Object>(this), (Consumer<? super Throwable>) $$Lambda$qar$TdlHEW5QkcZRDM4RnePR6TQf26Q.INSTANCE);
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

    /* access modifiers changed from: protected */
    public final void e() {
        c();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putLong("loading_start_time", this.an.longValue());
        bundle.putBoolean("has_logged_impression", this.ao);
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
            qam qam = this.b;
            qam.b = true;
            c();
            qal qal = qam.a;
            qal.e.a("card-inflation-error", qal.b.getTriggerString(), qal.b.getType(), "cards", qal.a.getId());
            return new View(n());
        }
    }

    public final void h() {
        super.h();
        WebView webView = this.ai;
        if (webView != null) {
            webView.setWebViewClient(null);
        }
    }

    public boolean onBackPressed() {
        c();
        return true;
    }
}
