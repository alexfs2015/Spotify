package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: tpz reason: default package */
public final class tpz implements a, a<PlayerState> {
    public final CompositeDisposable a = new CompositeDisposable();
    public final vcq b;
    public final wzi<Player> c;
    public tqi d;
    public tqb e;
    public DrivingVoiceState f;
    public boolean g;
    public boolean h;
    private final tpx i;
    private final Scheduler j;
    private final tnr k;

    public tpz(Scheduler scheduler, tpx tpx, vcq vcq, wzi<Player> wzi, tnr tnr) {
        this.j = scheduler;
        this.i = tpx;
        this.b = vcq;
        this.c = wzi;
        this.k = tnr;
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        if (i2 == 360) {
            c();
        } else {
            this.e.a(i2);
        }
    }

    private void c() {
        this.d.b();
        this.a.c();
    }

    public final void a() {
        this.a.c();
        this.a.a(this.i.a().a(this.j).d((Consumer<? super T>) new $$Lambda$tpz$NPFJ_WZyEE89Cs0Ia7qCzL_98oM<Object>(this)));
    }

    public final void b() {
        this.k.e();
        c();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        if (this.h && !playerState.isPaused()) {
            if (this.f == DrivingVoiceState.SUCCESS || (this.f == DrivingVoiceState.ERROR && this.g)) {
                a();
                this.h = false;
            }
        }
    }
}
