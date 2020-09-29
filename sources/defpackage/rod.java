package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.rcs.model.proto.Bootstrap.BootstrapRequest;
import com.spotify.rcs.model.proto.Bootstrap.BootstrapResponse;
import com.spotify.rcs.model.proto.Bootstrap.RemoteConfigRequestV1;
import com.spotify.rcs.model.proto.Platform;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: rod reason: default package */
public final class rod implements roc {
    private final rof a;
    private final Scheduler b;
    private final wsk c;
    private final vhl d;

    rod(rof rof, Scheduler scheduler, wsk wsk, vhl vhl) {
        this.a = rof;
        this.b = scheduler;
        this.c = wsk;
        this.d = vhl;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rog a(Throwable th) {
        return new roh();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rog rog) {
        vhl vhl = this.d;
        vhl.a().a(rog.a());
        this.d.a().a();
    }

    /* access modifiers changed from: private */
    public void a(wsj<BootstrapResponse> wsj, Throwable th) {
        if (th != null) {
            Logger.e(th, "There was an error when calling the bootstrap service.", new Object[0]);
            return;
        }
        if (wsj != null) {
            if (!wsj.a()) {
                Logger.e("There was an error returned from Bootstrap. code: %d body: %s", Integer.valueOf(wsj.a.c), wsj.b());
            }
            Logger.c("Bootstrap responded with code %d and body %s", Integer.valueOf(wsj.a.c), wsj.b());
        }
    }

    public final Single<rog> a(wmb wmb) {
        wsk a2 = this.c.a().a(wmb).a();
        return ((roj) a2.a(roj.class)).a((BootstrapRequest) BootstrapRequest.k().a((RemoteConfigRequestV1) RemoteConfigRequestV1.k().d(this.a.b()).c(this.a.c()).a(Platform.ANDROID).b(this.a.b()).a(this.a.a()).g()).g()).a((BiConsumer<? super T, ? super Throwable>) new $$Lambda$rod$ueOVS9dDuOoJMjrxy34Y6U4adQ8<Object,Object>(this)).f(new rob()).a(700, TimeUnit.MILLISECONDS, this.b, (SingleSource<? extends T>) Single.a((Callable<? extends T>) $$Lambda$cwFgpPFP81bc788Nzw7GYlChn7E.INSTANCE)).b((Consumer<? super T>) new $$Lambda$rod$6GSPRoR5WozfobCogKtm41Zd_yY<Object>(this)).g($$Lambda$rod$oVzH0EBZuAS3goxZIbmPEaUaBtE.INSTANCE);
    }
}
