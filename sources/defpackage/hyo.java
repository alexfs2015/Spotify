package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import com.spotify.mobile.android.spotlets.ads.model.AdSettingsModel;
import com.spotify.mobile.android.spotlets.ads.model.Targetings;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hyo reason: default package */
public interface hyo {

    /* renamed from: hyo$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ RolloutFlag a(Boolean bool, RolloutFlag rolloutFlag) {
            return (!bool.booleanValue() || !(rolloutFlag == RolloutFlag.ENABLED)) ? RolloutFlag.CONTROL : RolloutFlag.ENABLED;
        }

        public static /* synthetic */ AdBreakState a(Boolean bool) {
            return bool.booleanValue() ? AdBreakState.IN_PROGRESS : AdBreakState.IDLE;
        }

        public static hzr a(rwl rwl, RxResolver rxResolver) {
            return new hzy(a(rwl), rxResolver);
        }

        public static hzu a(rwl rwl, RxResolver rxResolver, gmn gmn) {
            return new iab(rxResolver, gmn.a(AdSettingsModel.class), a(rwl));
        }

        public static hzx a(rwl rwl, gmn gmn) {
            return new iaf(gmn.a(Targetings.class), a(rwl));
        }

        public static iag a(rwl rwl) {
            return new iag(gch.a(new $$Lambda$hyo$TuTHSOxHT6rgq17gDwK9QaIMJU(rwl)));
        }

        public static Observable<AdBreakState> a(RxResolver rxResolver) {
            return rxResolver.resolve(new Request(Request.SUB, "sp://ads/v1/break/state")).c((Function<? super T, ? extends R>) $$Lambda$Ny6Hw8ahMkG22ihtGWBKYFA2veQ.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$hyo$Y4iqJ8hs0F97UJIVNO139jSXPI.INSTANCE);
        }

        public static Observable<RolloutFlag> a(hgy hgy) {
            return Observable.a((ObservableSource<? extends T1>) hgy.a(hyn.a).j(), (ObservableSource<? extends T2>) hgy.a(hyn.e).j(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hyo$c6xFdqajlY4oQGSOEDcgGB0pnPA.INSTANCE);
        }

        public static boolean a(Response response) {
            try {
                return new JSONObject(new String(response.getBody(), fbi.c)).getBoolean("active");
            } catch (JSONException e) {
                throw new AssertionError(e);
            }
        }

        public static SlotApi b(rwl rwl, RxResolver rxResolver) {
            return new iac(rxResolver, a(rwl));
        }

        public static hzw c(rwl rwl, RxResolver rxResolver) {
            return new iae(rxResolver, a(rwl));
        }

        public static hzt d(rwl rwl, RxResolver rxResolver) {
            return new iaa(rxResolver, a(rwl));
        }
    }
}
