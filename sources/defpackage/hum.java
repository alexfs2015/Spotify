package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;

/* renamed from: hum reason: default package */
public final class hum implements vua<wud<OfflineProgressModel>> {
    private final wlc<gkz> a;
    private final wlc<rnf> b;

    private hum(wlc<gkz> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hum a(wlc<gkz> wlc, wlc<rnf> wlc2) {
        return new hum(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(((gkz) this.a.get()).a(OfflineProgressModel.class, ((rnf) this.b.get()).a().a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a()).resolve(RequestBuilder.subscribe(OfflineProgressModel.OFFLINE_PROGRESS_URI).build()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
