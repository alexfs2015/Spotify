package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: imq reason: default package */
public final class imq extends ims {
    private Disposable c;
    private Optional<Boolean> d = Optional.e();
    private final Scheduler e;

    public imq(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        Shuffle shuffle = new Shuffle(playerState);
        Boolean valueOf = Boolean.valueOf(shuffle.shuffle);
        if (!this.d.b() || !valueOf.equals(this.d.c())) {
            this.d = Optional.b(valueOf);
            a((Object) shuffle);
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c = wit.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$imq$ahEyWUPM3aDLSr3bRjspxNqCGc<Object>(this), (Consumer<? super Throwable>) $$Lambda$imq$4X4E1ziUXVdNBR5CPvYvhAbR32w.INSTANCE);
    }

    public final void a(iln iln, int i) {
        a((Object) new Shuffle(this.b.d().b()));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.c;
        if (disposable != null && !disposable.b()) {
            this.c.bd_();
            this.c = null;
        }
    }
}
