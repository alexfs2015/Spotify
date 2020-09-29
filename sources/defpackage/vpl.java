package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: vpl reason: default package */
public final class vpl {
    private final wzi<FirebaseInstanceId> a;
    private final wzi<ExecutorService> b;

    public vpl(wzi<FirebaseInstanceId> wzi, wzi<ExecutorService> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SingleEmitter singleEmitter) {
        ExecutorService executorService = (ExecutorService) this.b.get();
        executorService.getClass();
        singleEmitter.a((Cancellable) new $$Lambda$UdQHzuG9fixedUW5qCiRJo_2EIk(executorService));
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.a.get();
        firebaseInstanceId.a(fha.a(firebaseInstanceId.c), "*").a((Executor) executorService, (exw<TResult>) new $$Lambda$vpl$lP5kFXE80yF33XEiE8yE3362nRU<TResult>(singleEmitter));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(SingleEmitter singleEmitter, exz exz) {
        if (!exz.b()) {
            Exception e = exz.e();
            Logger.d(e, "Error getting token from firebase", new Object[0]);
            singleEmitter.a((Throwable) e);
            return;
        }
        fgm fgm = (fgm) exz.d();
        if (fgm != null) {
            String a2 = fgm.a();
            Logger.b("succesfully obtained firebase token", new Object[0]);
            singleEmitter.a(a2);
        }
    }

    public final Single<String> a() {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$vpl$6kc50N7kb6YNB_hA3EGbjELGpDg<T>(this));
    }
}
