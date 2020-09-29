package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: hzw reason: default package */
public final class hzw {
    Disposable a;
    private final idw b;
    private final hxi c;
    private final hec d;

    public hzw(idw idw, hxi hxi, hec hec) {
        this.b = idw;
        this.c = hxi;
        this.d = hec;
    }

    public final void a() {
        this.a = this.d.a(hwb.l).j().a((Predicate<? super T>) $$Lambda$hzw$iJwu3W7UgO2HF0E6U27XZJLPjwQ.INSTANCE).h(new $$Lambda$hzw$rdJ28x5hycDqXpeoKozr_4CWMc(this)).a((Predicate<? super T>) $$Lambda$hzw$_Dx2rp_ISX2mn6Bo1DrftFPmQn0.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hzw$Pi_PGGFbZwmeoxKVSQXxyAtavPU<Object,Object>(this), false).a((Consumer<? super T>) $$Lambda$hzw$NM5ErKCxkclD9Ct1EcpkdrELnsg.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hzw$juFyGUpWVcny4OenPncYbfXN8R0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(RolloutFlag rolloutFlag) {
        return rolloutFlag == RolloutFlag.ENABLED;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(Response response) {
        return response.getStatus() == 202;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Response response) {
        return this.c.a(AdSlot.MARQUEE.slot_id, "slot_enabled", "true");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(RolloutFlag rolloutFlag) {
        return this.b.a(AdSlot.MARQUEE);
    }
}
