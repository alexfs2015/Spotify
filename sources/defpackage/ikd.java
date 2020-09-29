package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: ikd reason: default package */
public final class ikd extends ikf {
    private Disposable c;
    private Optional<Boolean> d = Optional.e();
    private final Scheduler e;

    public ikd(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c = vun.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$ikd$bOXFzjZtK1sTcNs5Eq1NCWdVMM<Object>(this), (Consumer<? super Throwable>) $$Lambda$ikd$19SGW62jw8YU5abjDEGhHAwkfM.INSTANCE);
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
    public final void b() {
        Disposable disposable = this.c;
        if (disposable != null && !disposable.b()) {
            this.c.bf_();
            this.c = null;
        }
    }

    public final void a(ija ija, int i) {
        a((Object) new Shuffle(this.b.d().b()));
    }
}
