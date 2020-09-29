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

/* renamed from: imj reason: default package */
public final class imj extends ims {
    private TrackData c;
    private usi d;
    private PlayerState e;
    private Disposable f = Disposables.b();
    private tvn g;
    private final Scheduler h;

    public imj(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.h = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        this.d = (usi) hoVar.a;
        this.e = (PlayerState) hoVar.b;
        TrackData trackDataFor = TrackData.trackDataFor(this.d, this.e, this.g);
        if (!trackDataFor.equals(this.c)) {
            this.c = trackDataFor;
            a((Object) trackDataFor);
        }
    }

    public final void a() {
        Scheduler scheduler = this.h;
        Observable b = wit.b(this.b.e().a());
        Observable b2 = wit.b(this.b.d().a());
        this.g = this.b.j();
        this.f = Observable.a((ObservableSource<? extends T1>) b, (ObservableSource<? extends T2>) b2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$f0JU9ecCiSgSZ0H5UDCE19NFY0.INSTANCE).a(scheduler).a((Consumer<? super T>) new $$Lambda$imj$HEMpwwRdgoFw15B8OonC5HDSpkY<Object>(this), (Consumer<? super Throwable>) $$Lambda$imj$DX672I0aAOLzlH4HkUZi9Z7YPdU.INSTANCE);
    }

    public final void a(iln iln, int i) {
        PlayerState playerState = this.e;
        if (playerState == null) {
            a((Object) AppProtocol.c);
        } else {
            a((Object) TrackData.trackDataFor(this.d, playerState, this.g));
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!this.f.b()) {
            this.f.bd_();
        }
    }
}
