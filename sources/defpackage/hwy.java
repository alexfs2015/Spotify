package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;

/* renamed from: hwy reason: default package */
public final class hwy implements wig<xii<OfflineProgressModel>> {
    private final wzi<gmn> a;
    private final wzi<rwl> b;

    private hwy(wzi<gmn> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hwy a(wzi<gmn> wzi, wzi<rwl> wzi2) {
        return new hwy(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(((gmn) this.a.get()).a(OfflineProgressModel.class, ((rwl) this.b.get()).a().a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a()).resolve(RequestBuilder.subscribe(OfflineProgressModel.OFFLINE_PROGRESS_URI).build()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
