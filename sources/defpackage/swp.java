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

/* renamed from: swp reason: default package */
public final class swp {
    private final idq a;
    private final Scheduler b;
    private final Scheduler c;

    public swp(idq idq, Scheduler scheduler, Scheduler scheduler2) {
        this.a = idq;
        this.b = scheduler;
        this.c = scheduler2;
    }

    public final Flowable<Ad> a() {
        return this.a.a.a(BackpressureStrategy.LATEST).a((Predicate<? super T>) $$Lambda$swp$5GpOCMhmMasyBoFsrVJVELmaL4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$y09uTlzqWf9z13tnhMZHRgtj_A.INSTANCE).a(Functions.a()).b(this.b).a(this.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getFormat() == Format.AUDIO;
    }
}
