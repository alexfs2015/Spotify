package defpackage;

import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.base.Optional;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: uvh reason: default package */
public interface uvh {
    public static final b<Object, JSONObject> a = b.b("upsell.offer.Offer");
    public static final long b = TimeUnit.HOURS.toMillis(6);
    public static final long c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: uvh$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ObjectMapper a(rwl rwl) {
            ObjectMapper a = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(Include.NON_NULL).a();
            a.reader().withRootName("offer");
            return a;
        }

        public static Request a(juc juc) {
            return new Request(Request.GET, Uri.parse("hm://sellout/v2/upsell/promoted_offer").buildUpon().appendQueryParameter("device_id", juc.a()).build().toString());
        }

        public static gmm<Offer> a(gmn gmn, ObjectMapper objectMapper) {
            return gmn.a(Offer.class, objectMapper);
        }

        public static var<Offer> a(vap vap, ObjectMapper objectMapper) {
            return new var<>(Offer.class, vap, objectMapper);
        }

        public static vas<Offer> a(var<Offer> var) {
            return new vas<>(var);
        }

        public static xii<Offer> a(gmm<Offer> gmm, vas<Offer> vas, xii<String> xii, Request request) {
            return xii.b(gmm.resolve(request), xii, (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$uvh$mj3KSvIFGclja7pNyy8nKrnovc<Object,Object,Object>(vas)).d().e();
        }

        public static xii<Optional<Offer>> a(vas<Offer> vas, xii<String> xii) {
            return xii.d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$uvh$SH19gIdLJ1wNpVYYgIm6L4Tl3TA<Object,Object>(vas));
        }

        public static xii<Offer> a(xii<Offer> xii) {
            return xii.a((c<? super T, ? extends R>) new hho<Object,Object>(10, 3, uvh.c));
        }

        public static xii<Offer> a(xii<Optional<Offer>> xii, xii<Offer> xii2) {
            return xii.a(xii.c((xiy<? super T, Boolean>) $$Lambda$ABi9LaFRgDG3h8KBDuFD9ZWyZJ0.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$FVLiEDLBsZlZHrIfFCBAE1RA354.INSTANCE), xii2).c();
        }

        public static xir a(vas<Offer> vas) {
            return vas.a(uvh.a);
        }
    }
}
