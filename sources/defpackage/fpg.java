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

/* renamed from: fpg reason: default package */
public final class fpg {
    public final fpl a;
    public Disposable b;
    private final List<fpf> c = new ArrayList(5);
    private dg d;

    public fpg(fpl fpl) {
        this.a = fpl;
    }

    public final fpg a(fpf fpf) {
        this.c.add(fpf);
        return this;
    }

    public final void a(Uri uri) {
        Logger.b("warmUp %s", uri);
        fpl fpl = this.a;
        fph fph = fpl.a;
        Observable c2 = fph.a.c(fph.a());
        Action b2 = fph.b();
        ObjectHelper.a(b2, "onFinally is null");
        this.b = RxJavaPlugins.a((Observable<T>) new ObservableDoFinally<T>(c2, b2)).f().a(fpl.a()).c(fpl.b()).a((Consumer<? super T>) new $$Lambda$fpg$a_dc2zzwiRpSD0tFWQMYUS4go3E<Object>(this, uri), (Consumer<? super Throwable>) $$Lambda$fpg$cVdEgnQGTJtZFwT1F2jOzblCeZQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, dg dgVar) {
        dgVar.a(uri, null, null);
        this.d = dgVar;
    }

    public final void a(Activity activity, Uri uri) {
        Logger.b("openUrl %s", uri);
        a aVar = new a(this.d);
        for (fpf a2 : this.c) {
            a2.a(aVar);
        }
        aVar.a().a(activity, uri);
    }
}
