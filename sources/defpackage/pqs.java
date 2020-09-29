package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;

/* renamed from: pqs reason: default package */
public final class pqs {
    public static ObservableTransformer<pqo, pqp> a(pqt pqt, Scheduler scheduler, pqw pqw) {
        return kok.a().a(b.class, (ObservableTransformer<G, E>) new $$Lambda$pqs$ieZvDEcFLFFHX18tbDwSLGdNm8<G,E>(pqw, scheduler)).a(a.class, (Consumer<G>) new $$Lambda$pqs$bvHWM9tKlhAJwgxB0vXfOGauE<G>(pqt), scheduler).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pqp a(Response response) {
        return response.getStatus() == 200 ? new d() : new c();
    }
}
