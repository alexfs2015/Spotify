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

/* renamed from: thi reason: default package */
public interface thi {

    /* renamed from: thi$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
            return adSlotEvent.getFormat() == Format.VIDEO;
        }

        public static Flowable<Ad> a(idq idq, Scheduler scheduler, Scheduler scheduler2) {
            return idq.a.a(BackpressureStrategy.LATEST).a((Predicate<? super T>) $$Lambda$thi$xxBaJaEUXSfJpsogXlhHBaumWhg.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$y09uTlzqWf9z13tnhMZHRgtj_A.INSTANCE).a(Functions.a()).b(scheduler).a(scheduler2);
        }
    }
}
