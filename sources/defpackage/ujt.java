package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ujt reason: default package */
public interface ujt {

    /* renamed from: ujt$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gky<Offer> a(gkz gkz, rnf rnf) {
            ObjectMapper a = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(Include.NON_NULL).a();
            a.reader().withRootName("offer");
            return gkz.a(Offer.class, a);
        }

        public static jlp a(gky<Offer> gky, jlm jlm, jrs jrs) {
            return new jlo(gky, jlm, jrs);
        }
    }
}
