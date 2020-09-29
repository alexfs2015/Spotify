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

/* renamed from: rfy reason: default package */
public final class rfy extends c {
    public final rfw a;
    private final rfx b;
    private final rga c;
    private final rfz d;
    private final rfv e;
    private final Scheduler f;
    private final ImpressionLogger g;
    private final boolean h;
    private Disposable i = Disposables.b();

    public rfy(rfw rfw, rfx rfx, rga rga, rfz rfz, rfv rfv, Scheduler scheduler, ImpressionLogger impressionLogger, a aVar, rgz rgz, fpt fpt) {
        this.a = rfw;
        this.b = rfx;
        this.c = rga;
        this.d = rfz;
        this.e = rfv;
        this.g = impressionLogger;
        this.f = scheduler;
        this.h = rgz.a(fpt);
        aVar.a(this);
    }

    public final void c() {
        if (this.i.b() && this.h) {
            this.i = this.a.a().a((FlowableTransformer<? super T, ? extends R>) this.b).b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$rfy$AEr3oWptPQIOOAVf8tnB6fjNq3w<Object,Object>(this)).a((FlowableTransformer<? super T, ? extends R>) this.c).a(this.f).a((Consumer<? super T>) new $$Lambda$rfy$KgwLg16jogIPQ9DwCSXNlHvPoU<Object>(this), (Consumer<? super Throwable>) $$Lambda$rfy$Mmii5QQuRb8fosRVwPO1zyG7gc.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wrf a(RemainingSkips remainingSkips) {
        return this.d.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.e.a(playerState.contextUri());
        this.g.a(null, "free-tier-pre-curation-dialog", -1, ImpressionType.DIALOG, RenderType.DIALOG);
    }

    public final void a() {
        this.i.bf_();
    }
}
