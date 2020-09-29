package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* renamed from: qbh reason: default package */
public final class qbh implements ObservableTransformer<ho<xgo<xam>, a>, xgo<xam>> {
    private final qbc a;

    /* renamed from: qbh$a */
    public static class a {
        final String a;
        final String b;

        private a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public static a a(String str, String str2) {
            return new a(str, str2);
        }
    }

    public qbh(qbc qbc) {
        this.a = qbc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$qbh$YeOyeqTcCWCnvG4aVEPbzRJFg5Y<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xgo a(ho hoVar) {
        xgo xgo = (xgo) hoVar.a;
        if (xgo != null && xgo.a() && ((xam) xgo.b()).b() > 2) {
            long j = xgo.a.l - xgo.a.k;
            this.a.a.a(new ac(xgo.a.a.a.toString(), Float.toString(((float) j) / 1000.0f), ((a) fbp.a(hoVar.b)).a, ((a) hoVar.b).b));
        }
        return xgo;
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$qbh$Ztix7xOdBQzkojF1bxGBweR5UI<Object>(this, observable));
    }
}
