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

/* renamed from: ujw reason: default package */
public interface ujw {
    public static final b<Object, JSONObject> a = b.b("upsell.offer.Offer");
    public static final long b = TimeUnit.HOURS.toMillis(6);
    public static final long c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: ujw$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ObjectMapper a(rnf rnf) {
            ObjectMapper a = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(Include.NON_NULL).a();
            a.reader().withRootName("offer");
            return a;
        }

        public static upm<Offer> a(upk upk, ObjectMapper objectMapper) {
            return new upm<>(Offer.class, upk, objectMapper);
        }

        public static upn<Offer> a(upm<Offer> upm) {
            return new upn<>(upm);
        }

        public static wum a(upn<Offer> upn) {
            return upn.a(ujw.a);
        }

        public static wud<Optional<Offer>> a(upn<Offer> upn, wud<String> wud) {
            return wud.d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$ujw$sXdTsr1HDQe5CqYvQOnI6C6_olg<Object,Object>(upn));
        }

        public static Request a(jrs jrs) {
            return new Request(Request.GET, Uri.parse("hm://sellout/v2/upsell/promoted_offer").buildUpon().appendQueryParameter("device_id", jrs.a()).build().toString());
        }

        public static gky<Offer> a(gkz gkz, ObjectMapper objectMapper) {
            return gkz.a(Offer.class, objectMapper);
        }

        public static wud<Offer> a(gky<Offer> gky, upn<Offer> upn, wud<String> wud, Request request) {
            return wud.b(gky.resolve(request), wud, (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$ujw$aQksTY_lLr3gjsfkQ4FOsNAmjnM<Object,Object,Object>(upn)).d().e();
        }

        public static wud<Offer> a(wud<Offer> wud) {
            return wud.a((c<? super T, ? extends R>) new hes<Object,Object>(10, 3, ujw.c));
        }

        public static wud<Offer> a(wud<Optional<Offer>> wud, wud<Offer> wud2) {
            return wud.a(wud.c((wut<? super T, Boolean>) $$Lambda$LvDlpltRqUWH4hvLSPEVc9ySwSc.INSTANCE).f($$Lambda$r_pnJC69kKm6V7HSDx3Lh91CO0.INSTANCE), wud2).c();
        }
    }
}
