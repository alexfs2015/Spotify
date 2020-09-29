package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.net.HttpCookie;

/* renamed from: ojr reason: default package */
public class ojr extends ssu {
    public CookieManager T;
    private String U;
    private final CompositeDisposable V = new CompositeDisposable();
    public ojv a;
    public Scheduler b;

    /* access modifiers changed from: private */
    public void a(HttpCookie httpCookie) {
        this.T.setCookie(httpCookie.getDomain(), httpCookie.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(HttpCookie httpCookie) {
        String str = this.U;
        if (this.W != null) {
            d(str);
        }
    }

    public static ojr c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("pairing-url", str);
        ojr ojr = new ojr();
        ojr.g(bundle);
        return ojr;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final boolean ac_() {
        return false;
    }

    public final void ah() {
        this.V.a(this.a.a.a().a(0).a(this.b).b((Consumer<? super T>) new $$Lambda$ojr$TeyuZ9goWH0bb0twI_94Op9px3g<Object>(this)).a((Consumer<? super T>) new $$Lambda$ojr$AevlDPWK8u2NZemLCgfaNLqe88k<Object>(this), (Consumer<? super Throwable>) $$Lambda$ojr$Cun7_IchxLpyvBVliCkYBqc8D54.INSTANCE));
    }

    public final void aw_() {
        this.V.bd_();
        super.aw_();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
        this.X = false;
        String string = ((Bundle) fbp.a(this.i)).getString("pairing-url");
        if (TextUtils.isEmpty(string)) {
            this.U = "about:blank";
        } else {
            this.U = string;
        }
    }

    public final void b_(String str) {
        if (str.contains("#close")) {
            ak();
        }
    }
}
