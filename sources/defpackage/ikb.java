package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: ikb reason: default package */
public final class ikb extends ikf {
    private Optional<Boolean> c = Optional.e();
    private Disposable d;
    private final Scheduler e;

    public ikb(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = vun.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$ikb$ntW2kEaPXpqQxrJGcxJr6XqkOg<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ikb$j35CZiktEB4lsPHLC2e0vOJ5wWg<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        a(Optional.c(playerState));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(Optional.e());
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
        a((Object) new Saved(this.b.d().b()));
    }

    private void a(Optional<PlayerState> optional) {
        Saved saved = new Saved((PlayerState) optional.d());
        Boolean valueOf = Boolean.valueOf(saved.saved);
        if (!this.c.b() || !valueOf.equals(this.c.c())) {
            a((Object) saved);
            this.c = Optional.b(valueOf);
        }
    }
}
