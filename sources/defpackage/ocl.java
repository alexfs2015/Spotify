package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.net.HttpCookie;

/* renamed from: ocl reason: default package */
public class ocl extends sin {
    public CookieManager T;
    private String U;
    private final CompositeDisposable V = new CompositeDisposable();
    public ocp a;
    public Scheduler b;

    public final boolean ac_() {
        return false;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
        this.X = false;
        String string = ((Bundle) fay.a(this.i)).getString("pairing-url");
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

    public final void ah() {
        this.V.a(this.a.a.a().a(0).a(this.b).b((Consumer<? super T>) new $$Lambda$ocl$STsJI_IrX7YyjCN59l4f5nWrsp0<Object>(this)).a((Consumer<? super T>) new $$Lambda$ocl$O5NZO_lRZ90zCpvQbHCFYVslyw<Object>(this), (Consumer<? super Throwable>) $$Lambda$ocl$8nKznTe2elMOOU64vMwrJakhALg.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(HttpCookie httpCookie) {
        String str = this.U;
        if (this.W != null) {
            d(str);
        }
    }

    public final void ax_() {
        this.V.bf_();
        super.ax_();
    }

    /* access modifiers changed from: private */
    public void a(HttpCookie httpCookie) {
        this.T.setCookie(httpCookie.getDomain(), httpCookie.toString());
    }

    public static ocl c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("pairing-url", str);
        ocl ocl = new ocl();
        ocl.g(bundle);
        return ocl;
    }
}
