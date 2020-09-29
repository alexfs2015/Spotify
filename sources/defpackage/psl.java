package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* renamed from: psl reason: default package */
public final class psl implements ObservableTransformer<ho<wsj<wmg>, a>, wsj<wmg>> {
    private final psg a;

    /* renamed from: psl$a */
    public static class a {
        final String a;
        final String b;

        public static a a(String str, String str2) {
            return new a(str, str2);
        }

        private a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public psl(psg psg) {
        this.a = psg;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$psl$jI9lZMFZUd7TiXqUEx0bJKEPQg<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wsj a(ho hoVar) {
        wsj wsj = (wsj) hoVar.a;
        if (wsj != null && wsj.a() && ((wmg) wsj.b()).b() > 2) {
            long j = wsj.a.l - wsj.a.k;
            this.a.a.a(new ad(wsj.a.a.a.toString(), Float.toString(((float) j) / 1000.0f), ((a) fay.a(hoVar.b)).a, ((a) hoVar.b).b));
        }
        return wsj;
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$psl$6G3ha1agEkqJ2aaxnVWitvwmjI<Object>(this, observable));
    }
}
