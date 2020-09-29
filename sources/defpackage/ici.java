package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: ici reason: default package */
public final class ici {
    Disposable a;
    private final igj b;
    private final hzu c;
    private final hgy d;

    public ici(igj igj, hzu hzu, hgy hgy) {
        this.b = igj;
        this.c = hzu;
        this.d = hgy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(RolloutFlag rolloutFlag) {
        return this.b.a(AdSlot.MARQUEE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Response response) {
        return this.c.a(AdSlot.MARQUEE.slot_id, "slot_enabled", "true");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(RolloutFlag rolloutFlag) {
        return rolloutFlag == RolloutFlag.ENABLED;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(Response response) {
        return response.getStatus() == 202;
    }

    public final void a() {
        this.a = this.d.a(hyn.l).j().a((Predicate<? super T>) $$Lambda$ici$tANcvvVf6QLOzIr0W2c29d47pio.INSTANCE).h(new $$Lambda$ici$otTShDazwxnCoVmCkrt3pMI9o(this)).a((Predicate<? super T>) $$Lambda$ici$u1rGSMqll8PJFAw26aQkCILqGL4.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ici$x3TCRXFhZyOkv_3y1TWIu12BHbQ<Object,Object>(this), false).a((Consumer<? super T>) $$Lambda$ici$4alQaUGe79uqPiaU8WwcamtgEM.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ici$sz8cy6JpWuZf2AmulaHZurMMj6k.INSTANCE);
    }
}
