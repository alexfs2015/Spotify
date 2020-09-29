package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: imo reason: default package */
public final class imo extends ims {
    private Optional<Boolean> c = Optional.e();
    private Disposable d;
    private final Scheduler e;

    public imo(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.e = scheduler;
    }

    private void a(Optional<PlayerState> optional) {
        Saved saved = new Saved((PlayerState) optional.d());
        Boolean valueOf = Boolean.valueOf(saved.saved);
        if (!this.c.b() || !valueOf.equals(this.c.c())) {
            a((Object) saved);
            this.c = Optional.b(valueOf);
        }
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
    public final void a() {
        this.d = wit.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$imo$lwWn6fdZrrbxPH6HQv8kwsEhsyo<Object>(this), (Consumer<? super Throwable>) new $$Lambda$imo$PmYuY1cx0H2HxDpK_NTGXbsy15k<Object>(this));
    }

    public final void a(iln iln, int i) {
        a((Object) new Saved(this.b.d().b()));
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
