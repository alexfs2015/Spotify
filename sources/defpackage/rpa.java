package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.freetiercommon.models.RemainingSkips;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: rpa reason: default package */
public final class rpa extends c {
    public final roy a;
    private final roz b;
    private final rpc c;
    private final rpb d;
    private final rox e;
    private final Scheduler f;
    private final ImpressionLogger g;
    private final boolean h;
    private Disposable i = Disposables.b();

    public rpa(roy roy, roz roz, rpc rpc, rpb rpb, rox rox, Scheduler scheduler, ImpressionLogger impressionLogger, a aVar, rqb rqb, fqn fqn) {
        this.a = roy;
        this.b = roz;
        this.c = rpc;
        this.d = rpb;
        this.e = rox;
        this.g = impressionLogger;
        this.f = scheduler;
        this.h = rqb.a(fqn);
        aVar.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xfk a(RemainingSkips remainingSkips) {
        return this.d.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.e.a(playerState.contextUri());
        this.g.a(null, "free-tier-pre-curation-dialog", -1, ImpressionType.DIALOG, RenderType.DIALOG);
    }

    public final void a() {
        this.i.bd_();
    }

    public final void c() {
        if (this.i.b() && this.h) {
            this.i = this.a.a().a((FlowableTransformer<? super T, ? extends R>) this.b).b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$rpa$tG99gUnJyf73gn6_xiojclvItk<Object,Object>(this)).a((FlowableTransformer<? super T, ? extends R>) this.c).a(this.f).a((Consumer<? super T>) new $$Lambda$rpa$mmYGY3liB8fyVUdT66t5wlCrD_M<Object>(this), (Consumer<? super Throwable>) $$Lambda$rpa$7DapDv9BzpgFBPSgYZ6y7OO1hNg.INSTANCE);
        }
    }
}
