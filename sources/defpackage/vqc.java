package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/* renamed from: vqc reason: default package */
public final class vqc implements vua<ObjectMapper> {
    private final wlc<rnf> a;

    private vqc(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static vqc a(wlc<rnf> wlc) {
        return new vqc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) vuf.a(((rnf) this.a.get()).a().a(Feature.AUTO_CLOSE_SOURCE, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(Include.NON_EMPTY).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
