package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/* renamed from: ijw reason: default package */
public final class ijw extends ikf {
    private TrackData c;
    private ugu d;
    private PlayerState e;
    private Disposable f = Disposables.b();
    private tjv g;
    private final Scheduler h;

    public ijw(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.h = scheduler;
    }

    public final void a() {
        Scheduler scheduler = this.h;
        Observable b = vun.b(this.b.e().a());
        Observable b2 = vun.b(this.b.d().a());
        this.g = this.b.j();
        this.f = Observable.a((ObservableSource<? extends T1>) b, (ObservableSource<? extends T2>) b2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$MO5wf3o59mRT1J9mRS3VPy3kEOc.INSTANCE).a(scheduler).a((Consumer<? super T>) new $$Lambda$ijw$kbNmS0gPfAlUmzLygL309hbX_kk<Object>(this), (Consumer<? super Throwable>) $$Lambda$ijw$uRmGYqQV_aVbjhjrbRi4VV3W6nE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        this.d = (ugu) hoVar.a;
        this.e = (PlayerState) hoVar.b;
        TrackData trackDataFor = TrackData.trackDataFor(this.d, this.e, this.g);
        if (!trackDataFor.equals(this.c)) {
            this.c = trackDataFor;
            a((Object) trackDataFor);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!this.f.b()) {
            this.f.bf_();
        }
    }

    public final void a(ija ija, int i) {
        PlayerState playerState = this.e;
        if (playerState == null) {
            a((Object) AppProtocol.c);
        } else {
            a((Object) TrackData.trackDataFor(this.d, playerState, this.g));
        }
    }
}
