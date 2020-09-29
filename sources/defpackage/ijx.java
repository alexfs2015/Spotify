package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: ijx reason: default package */
public final class ijx extends ikf {
    private PlaybackSpeed c;
    private Disposable d;
    private final Scheduler e;

    public ijx(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = vun.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$ijx$sbk9v25aRffJmoYlgwOt5umEM<Object>(this), (Consumer<? super Throwable>) $$Lambda$ijx$7eN5mpwxrbLruSBUN9L2RgJ48Hs.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlaybackSpeed playbackSpeed = new PlaybackSpeed(playerState);
        if (!playbackSpeed.equals(this.c)) {
            this.c = playbackSpeed;
            a((Object) playbackSpeed);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.d;
        if (disposable != null && !disposable.b()) {
            this.d.bf_();
            this.d = null;
        }
    }

    public final void a(ija ija, int i) {
        a((Object) new PlaybackSpeed(this.b.d().b()));
    }
}
