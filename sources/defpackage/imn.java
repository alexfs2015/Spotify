package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: imn reason: default package */
public final class imn extends ims {
    private Disposable c;
    private Repeat d;
    private final Scheduler e;

    public imn(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.e = scheduler;
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
    public final void a() {
        this.c = wit.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$imn$0QQJp4eWUptpinyTYzM1ANZ1GOc<Object>(this), (Consumer<? super Throwable>) $$Lambda$imn$vpARUeA2217HPzH5ZYbEguhgHvo.INSTANCE);
    }

    public final void a(iln iln, int i) {
        a((Object) new Repeat(this.b.d().b()));
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
