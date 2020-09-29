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

/* renamed from: hwc reason: default package */
public interface hwc {

    /* renamed from: hwc$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static hxi a(rnf rnf, RxResolver rxResolver, gkz gkz) {
            return new hxp(rxResolver, gkz.a(AdSettingsModel.class), a(rnf));
        }

        public static hxf a(rnf rnf, RxResolver rxResolver) {
            return new hxm(a(rnf), rxResolver);
        }

        public static SlotApi b(rnf rnf, RxResolver rxResolver) {
            return new hxq(rxResolver, a(rnf));
        }

        public static hxk c(rnf rnf, RxResolver rxResolver) {
            return new hxs(rxResolver, a(rnf));
        }

        public static hxh d(rnf rnf, RxResolver rxResolver) {
            return new hxo(rxResolver, a(rnf));
        }

        public static hxl a(rnf rnf, gkz gkz) {
            return new hxt(gkz.a(Targetings.class), a(rnf));
        }

        public static Observable<RolloutFlag> a(hec hec) {
            return Observable.a((ObservableSource<? extends T1>) hec.a(hwb.a).j(), (ObservableSource<? extends T2>) hec.a(hwb.e).j(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hwc$iKTKhh9FjXAAmmS0fL4HAhxdyPs.INSTANCE);
        }

        public static /* synthetic */ RolloutFlag a(Boolean bool, RolloutFlag rolloutFlag) {
            return (!bool.booleanValue() || !(rolloutFlag == RolloutFlag.ENABLED)) ? RolloutFlag.CONTROL : RolloutFlag.ENABLED;
        }

        public static Observable<AdBreakState> a(RxResolver rxResolver) {
            return rxResolver.resolve(new Request(Request.SUB, "sp://ads/v1/break/state")).c((Function<? super T, ? extends R>) $$Lambda$gVjVkO1E7Rn9LVFWXIi4j50xXO8.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$hwc$ZM1jy2Dr029W0C6tmAad2X_UJ2Q.INSTANCE);
        }

        public static /* synthetic */ AdBreakState a(Boolean bool) {
            return bool.booleanValue() ? AdBreakState.IN_PROGRESS : AdBreakState.IDLE;
        }

        public static boolean a(Response response) {
            try {
                return new JSONObject(new String(response.getBody(), far.c)).getBoolean("active");
            } catch (JSONException e) {
                throw new AssertionError(e);
            }
        }

        public static hxu a(rnf rnf) {
            return new hxu(gbj.a(new $$Lambda$hwc$w8EwQ6QCBa5Ja5syhAwR5oWWNHA(rnf)));
        }
    }
}
