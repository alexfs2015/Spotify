package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/* renamed from: qet reason: default package */
public final class qet {
    public static ObservableTransformer<qes, qeu> a(qff qff, RxResolver rxResolver, wug wug, wug wug2) {
        return klb.a().a(b.class, (ObservableTransformer<G, E>) new $$Lambda$qet$FyArzR2jJJoiLgch_MKMGIywLA<G,E>(rxResolver, wug, wug2)).a(a.class, (ObservableTransformer<G, E>) $$Lambda$qet$fI7mFnNWAri3qTEDRsS_Runc4m0.INSTANCE).a(c.class, (Consumer<G>) new $$Lambda$qet$FMLt5sQ7TxcWBz9eqdjmvauQg<G>(qff), AndroidSchedulers.a()).a(d.class, (Consumer<G>) new $$Lambda$qet$efzYqEqqABU3hF3wKBWdO5EO4Qc<G>(qff), AndroidSchedulers.a()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qeu a(rxl rxl) {
        if (rxl.b().b()) {
            return qeu.a(((uys) rxl.b().c()).w());
        }
        return qeu.a(rxl.a().k());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qeu a(b bVar, Throwable th) {
        return new a(bVar.a, th);
    }
}
