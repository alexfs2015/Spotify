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

/* renamed from: rxj reason: default package */
public final class rxj implements rxi {
    private final rxl a;
    private final Scheduler b;
    private final xgp c;
    private final vuq d;

    rxj(rxl rxl, Scheduler scheduler, xgp xgp, vuq vuq) {
        this.a = rxl;
        this.b = scheduler;
        this.c = xgp;
        this.d = vuq;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rxm a(Throwable th) {
        return new rxn();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rxm rxm) {
        vuq vuq = this.d;
        vuq.a().a(rxm.a());
        this.d.a().a();
    }

    /* access modifiers changed from: private */
    public void a(xgo<BootstrapResponse> xgo, Throwable th) {
        if (th != null) {
            Logger.e(th, "There was an error when calling the bootstrap service.", new Object[0]);
            return;
        }
        if (xgo != null) {
            if (!xgo.a()) {
                Logger.e("There was an error returned from Bootstrap. code: %d body: %s", Integer.valueOf(xgo.a.c), xgo.b());
            }
            Logger.c("Bootstrap responded with code %d and body %s", Integer.valueOf(xgo.a.c), xgo.b());
        }
    }

    public final Single<rxm> a(xah xah) {
        xgp a2 = this.c.a().a(xah).a();
        return ((rxp) a2.a(rxp.class)).a((BootstrapRequest) BootstrapRequest.k().a((RemoteConfigRequestV1) RemoteConfigRequestV1.k().d(this.a.b()).c(this.a.c()).a(Platform.ANDROID).b(this.a.b()).a(this.a.a()).g()).g()).a((BiConsumer<? super T, ? super Throwable>) new $$Lambda$rxj$3yX_CFxVu96zjNwxQcr9xgCzJw<Object,Object>(this)).f(new rxh()).a(700, TimeUnit.MILLISECONDS, this.b, (SingleSource<? extends T>) Single.a((Callable<? extends T>) $$Lambda$OHxEBn7IdWhyMgGkp5gcC_TLqis.INSTANCE)).b((Consumer<? super T>) new $$Lambda$rxj$Ld8LOKRA2mzKyqXIpWcELjTArbo<Object>(this)).g($$Lambda$rxj$cZnfbDc0fBeCyZk8LK5bi4aAUAQ.INSTANCE);
    }
}
