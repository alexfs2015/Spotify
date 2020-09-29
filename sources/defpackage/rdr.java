package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: rdr reason: default package */
public abstract class rdr implements rda {
    private Observable<rdc> a;

    private Observable<rdc> d() {
        if (this.a == null) {
            this.a = c().a(1).a();
        }
        return this.a;
    }

    public final Observable<Boolean> a() {
        return d().c((Function<? super T, ? extends R>) $$Lambda$rdr$JVn5xm4mEEuM_Lxog_GMIKXNU4A.INSTANCE).a(1).a();
    }

    public final Observable<rdc> a(Observable<rdb> observable) {
        return d();
    }

    public final Observable<rdc> b() {
        return d();
    }

    /* access modifiers changed from: protected */
    public abstract Observable<rdc> c();
}
