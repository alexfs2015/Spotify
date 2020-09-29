package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import io.reactivex.Flowable;

/* renamed from: ilz reason: default package */
public final class ilz {
    private final ikz a;
    private final Flowable<PlayerState> b;
    private final wug c;
    private final imd d;
    private hk<StreamingCardData> e = $$Lambda$ilz$4k1tJHHAWukElL695tNBPxgAmSw.INSTANCE;
    private wuk f = xaj.b();
    private long g = -1;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(StreamingCardData streamingCardData) {
    }

    public ilz(wug wug, Flowable<PlayerState> flowable, ikz ikz, imd imd) {
        this.c = wug;
        this.b = flowable;
        this.a = ikz;
        this.d = imd;
    }

    public final void a(hk<StreamingCardData> hkVar) {
        this.e = hkVar;
        c();
    }

    public final void a() {
        c();
        this.a.b();
    }

    public final void b() {
        hej.a(this.f);
        this.g = -1;
    }

    private void c() {
        if (this.f.isUnsubscribed()) {
            this.f = d().a(this.c).a((wun<? super T>) new $$Lambda$ilz$B4sFRpCxGRLMmK00_VZr4lFnks<Object>(this), (wun<Throwable>) $$Lambda$ilz$IwlQJ9lt2IbaU3XVlivaqdteG98.INSTANCE);
        }
    }

    private wud<Optional<StreamingCardData>> d() {
        wud e2 = e();
        wud a2 = this.a.a();
        imd imd = this.d;
        imd.getClass();
        return wud.a(e2, a2, (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$dkNJBFLj5AbCyT90QZ9Rq25979c<Object,Object,Object>(imd));
    }

    /* access modifiers changed from: private */
    public void a(Optional<StreamingCardData> optional) {
        if (optional.b() && ((long) ((StreamingCardData) optional.c()).hashCode()) != this.g) {
            this.g = (long) ((StreamingCardData) optional.c()).hashCode();
            this.e.accept(optional.c());
        }
    }

    private wud<Optional<PlayerState>> e() {
        return vun.a((wrf<T>) this.b).f($$Lambda$thcyrPbmbnffalswPgOBPO9ZDA0.INSTANCE).c(Optional.e());
    }
}
