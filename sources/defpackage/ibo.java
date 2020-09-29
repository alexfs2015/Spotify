package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: ibo reason: default package */
public interface ibo {

    /* renamed from: ibo$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static a<MarqueeTriggerModel, ibm, ibk> a(Observable<ibm> observable, Observable<ibm> observable2, Observable<ibm> observable3, hzm hzm, hzy hzy, ids ids, kxz kxz, Context context, Scheduler scheduler, hec hec, hxf hxf, Scheduler scheduler2, Scheduler scheduler3, ibw ibw, ibv ibv) {
            return kjt.a((kjz<M, E, F>) $$Lambda$LxI7bS_UqBRA0rRIM_KCnxxpoQ.INSTANCE, kkz.a(ibl.a(hzy, ids, kxz, context, hec, scheduler, hxf, ibw, ibv))).b(new $$Lambda$ibo$7BDqx9LOJ2rzhHCLftXXIwZvxn8(scheduler2)).a((kkp<kkv>) new $$Lambda$ibo$bH_ljGuBCZGsXimQRSb2oPqLosI<kkv>(scheduler3)).a((kjo<M, F>) $$Lambda$onTTkzq95X_aeltTzuqwiQlVrFw.INSTANCE).a(kla.a(observable, observable2, observable3, hzm.a)).a(kkh.a("MarqueeTriggeringMobius"));
        }

        public static /* synthetic */ kkv b(Scheduler scheduler) {
            return new kld(scheduler);
        }

        public static /* synthetic */ kkv a(Scheduler scheduler) {
            return new kld(scheduler);
        }

        public static hzy a(RxResolver rxResolver, rnf rnf) {
            return new hzx(rxResolver, new hxu(gbj.a(new $$Lambda$ibo$ONW5sBDRe1DkgYz0BgU92sr8Cc(rnf))));
        }
    }
}
