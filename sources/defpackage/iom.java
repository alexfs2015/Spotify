package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import io.reactivex.Flowable;

/* renamed from: iom reason: default package */
public final class iom {
    private final inm a;
    private final Flowable<PlayerState> b;
    private final xil c;
    private final ioq d;
    private hk<StreamingCardData> e = $$Lambda$iom$f0hJGwwTJzLlCggr6QRGukqPnxs.INSTANCE;
    private xip f = xon.b();
    private long g = -1;

    public iom(xil xil, Flowable<PlayerState> flowable, inm inm, ioq ioq) {
        this.c = xil;
        this.b = flowable;
        this.a = inm;
        this.d = ioq;
    }

    /* access modifiers changed from: private */
    public void a(Optional<StreamingCardData> optional) {
        if (optional.b() && ((long) ((StreamingCardData) optional.c()).hashCode()) != this.g) {
            this.g = (long) ((StreamingCardData) optional.c()).hashCode();
            this.e.accept(optional.c());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(StreamingCardData streamingCardData) {
    }

    private void c() {
        if (this.f.isUnsubscribed()) {
            this.f = d().a(this.c).a((xis<? super T>) new $$Lambda$iom$8pLwebn79N67w97Qqg8H424Ky2s<Object>(this), (xis<Throwable>) $$Lambda$iom$UA4FqADJ831JSGNVMkv4tSI0q0.INSTANCE);
        }
    }

    private xii<Optional<StreamingCardData>> d() {
        xii e2 = e();
        xii a2 = this.a.a();
        ioq ioq = this.d;
        ioq.getClass();
        return xii.a(e2, a2, (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$dGfjLLIpvPRFayxFmhDZllDJoM<Object,Object,Object>(ioq));
    }

    private xii<Optional<PlayerState>> e() {
        return wit.a((xfk<T>) this.b).e((xiy<? super T, ? extends R>) $$Lambda$APy6K95xGC3CT8cUmdY6pbyAHc4.INSTANCE).c(Optional.e());
    }

    public final void a() {
        c();
        this.a.b();
    }

    public final void a(hk<StreamingCardData> hkVar) {
        this.e = hkVar;
        c();
    }

    public final void b() {
        hhf.a(this.f);
        this.g = -1;
    }
}
