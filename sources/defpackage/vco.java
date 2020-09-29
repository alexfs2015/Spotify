package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: vco reason: default package */
public final class vco {
    private final wlc<FirebaseInstanceId> a;
    private final wlc<ExecutorService> b;

    public vco(wlc<FirebaseInstanceId> wlc, wlc<ExecutorService> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public final Single<String> a() {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$vco$wjUt9h2mQx7KsEzL1_AcDjr5Hs0<T>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SingleEmitter singleEmitter) {
        ExecutorService executorService = (ExecutorService) this.b.get();
        executorService.getClass();
        singleEmitter.a((Cancellable) new $$Lambda$UdQHzuG9fixedUW5qCiRJo_2EIk(executorService));
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.a.get();
        firebaseInstanceId.a(fgg.a(firebaseInstanceId.c), "*").a((Executor) executorService, (exf<TResult>) new $$Lambda$vco$EaG6BnazM7a62Z4Pun6YnbbLYZ8<TResult>(singleEmitter));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(SingleEmitter singleEmitter, exi exi) {
        if (!exi.b()) {
            Exception e = exi.e();
            Logger.d(e, "Error getting token from firebase", new Object[0]);
            singleEmitter.a((Throwable) e);
            return;
        }
        ffs ffs = (ffs) exi.d();
        if (ffs != null) {
            String a2 = ffs.a();
            Logger.b("succesfully obtained firebase token", new Object[0]);
            singleEmitter.a(a2);
        }
    }
}
