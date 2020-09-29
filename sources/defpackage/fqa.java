package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fqa reason: default package */
public final class fqa {
    public final fqf a;
    public Disposable b;
    private final List<fpz> c = new ArrayList(5);
    private dg d;

    public fqa(fqf fqf) {
        this.a = fqf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, dg dgVar) {
        dgVar.a(uri, null, null);
        this.d = dgVar;
    }

    public final fqa a(fpz fpz) {
        this.c.add(fpz);
        return this;
    }

    public final void a(Activity activity, Uri uri) {
        Logger.b("openUrl %s", uri);
        a aVar = new a(this.d);
        for (fpz a2 : this.c) {
            a2.a(aVar);
        }
        aVar.a().a(activity, uri);
    }

    public final void a(Uri uri) {
        Logger.b("warmUp %s", uri);
        fqf fqf = this.a;
        fqb fqb = fqf.a;
        Observable c2 = fqb.a.c(fqb.a());
        Action b2 = fqb.b();
        ObjectHelper.a(b2, "onFinally is null");
        this.b = RxJavaPlugins.a((Observable<T>) new ObservableDoFinally<T>(c2, b2)).f().a(fqf.a()).c(fqf.b()).a((Consumer<? super T>) new $$Lambda$fqa$41ona4GTtc0dGn2Y1uY1b4gqQs0<Object>(this, uri), (Consumer<? super Throwable>) $$Lambda$fqa$7eztUS8zFQK_XJ3eqAkK2fhj0Qc.INSTANCE);
    }
}
