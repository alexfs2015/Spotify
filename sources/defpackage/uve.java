package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uve reason: default package */
public interface uve {

    /* renamed from: uve$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static gmm<Offer> a(gmn gmn, rwl rwl) {
            ObjectMapper a = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(Include.NON_NULL).a();
            a.reader().withRootName("offer");
            return gmn.a(Offer.class, a);
        }

        public static job a(gmm<Offer> gmm, jny jny, juc juc) {
            return new joa(gmm, jny, juc);
        }
    }
}
