package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: tgw reason: default package */
public final class tgw {
    private final igd a;
    private final Scheduler b;
    private final Scheduler c;

    public tgw(igd igd, Scheduler scheduler, Scheduler scheduler2) {
        this.a = igd;
        this.b = scheduler;
        this.c = scheduler2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getFormat() == Format.AUDIO;
    }

    public final Flowable<Ad> a() {
        return this.a.a.a(BackpressureStrategy.LATEST).a((Predicate<? super T>) $$Lambda$tgw$1vsbAUdJpFB3GfOi25M_3aUZpVs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$y09uTlzqWf9z13tnhMZHRgtj_A.INSTANCE).a(Functions.a()).b(this.b).a(this.c);
    }
}
