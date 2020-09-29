package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: iea reason: default package */
public interface iea {

    /* renamed from: iea$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ick a(RxResolver rxResolver, rwl rwl) {
            return new icj(rxResolver, new iag(gch.a(new $$Lambda$iea$PICUqV12kvxT1Xf0axZpiFE_hIM(rwl))));
        }

        public static a<MarqueeTriggerModel, idy, idw> a(Observable<idy> observable, Observable<idy> observable2, Observable<idy> observable3, iby iby, ick ick, igf igf, lbi lbi, Context context, Scheduler scheduler, hgy hgy, hzr hzr, Scheduler scheduler2, iei iei, ieh ieh) {
            Scheduler scheduler3 = scheduler2;
            return knc.a((kni<M, E, F>) $$Lambda$ZZpmdnh7pMP6zlIHeYeM8_0q1I.INSTANCE, koi.a(idx.a(ick, igf, lbi, context, hgy, scheduler, hzr, iei, ieh))).b(new $$Lambda$iea$Xjht_XnC2ZT8rgOXvpOSWKxsRk(scheduler3)).a((kny<koe>) new $$Lambda$iea$1WQQujBDTPK6B_NWkbnaRwXqkwA<koe>(scheduler3)).a((kmx<M, F>) $$Lambda$DVKWZMntnikqDAOpGlj2_V9lfE8.INSTANCE).a(koj.a(observable, observable2, observable3, iby.a)).a(knq.a("MarqueeTriggeringMobius"));
        }

        public static /* synthetic */ koe a(Scheduler scheduler) {
            return new kom(scheduler);
        }

        public static /* synthetic */ koe b(Scheduler scheduler) {
            return new kom(scheduler);
        }
    }
}
