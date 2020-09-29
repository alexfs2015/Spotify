package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: imk reason: default package */
public final class imk extends ims {
    private PlaybackSpeed c;
    private Disposable d;
    private final Scheduler e;

    public imk(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.e = scheduler;
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
    public final void a() {
        this.d = wit.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$imk$mSlkxYzaZQbc1NfCcFCZc3JfNk<Object>(this), (Consumer<? super Throwable>) $$Lambda$imk$m0Zb0h3EVrXyIhxOE3Kvku26qGM.INSTANCE);
    }

    public final void a(iln iln, int i) {
        a((Object) new PlaybackSpeed(this.b.d().b()));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.d;
        if (disposable != null && !disposable.b()) {
            this.d.bd_();
            this.d = null;
        }
    }
}
