package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: ika reason: default package */
public final class ika extends ikf {
    private Disposable c;
    private Repeat d;
    private final Scheduler e;

    public ika(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c = vun.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$ika$i5WHR89OA4y4vkFoadWlbv8ENWg<Object>(this), (Consumer<? super Throwable>) $$Lambda$ika$2OVuqLVfah4Bp5jsED475ah_eq8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        Repeat repeat = new Repeat(playerState);
        if (!repeat.equals(this.d)) {
            this.d = repeat;
            a((Object) repeat);
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
        a((Object) new Repeat(this.b.d().b()));
    }
}
