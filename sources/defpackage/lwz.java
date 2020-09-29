package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.mobile.android.converter.ConvertProductValueException;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: lwz reason: default package */
interface lwz {

    /* renamed from: lwz$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<lym> a(hed hed) {
            return Observable.a((ObservableSource<? extends T1>) hed.b(MoatAdEvent.EVENT_TYPE), (ObservableSource<? extends T2>) hed.b("shows-collection"), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$lwz$hExJq7VU55pikPsOj60N9Go1bvU.INSTANCE).a(Functions.a());
        }

        public static /* synthetic */ lym a(String str, String str2) {
            Boolean bool;
            if (fax.a(str2)) {
                bool = Boolean.FALSE;
            } else if (str2.equalsIgnoreCase("true") || "1".equals(str2)) {
                bool = Boolean.TRUE;
            } else if (str2.equalsIgnoreCase("false") || Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(str2)) {
                bool = Boolean.FALSE;
            } else {
                throw new ConvertProductValueException(Boolean.class, str2);
            }
            return new lya(str, bool.booleanValue());
        }
    }
}
