package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.music.spotlets.radio.collection.RemoteCosmosCollectionApiImpl;

/* renamed from: ufu reason: default package */
public final class ufu implements vua<ufw> {
    private final wlc<FireAndForgetResolver> a;
    private final wlc<ObjectMapper> b;

    private ufu(wlc<FireAndForgetResolver> wlc, wlc<ObjectMapper> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ufu a(wlc<FireAndForgetResolver> wlc, wlc<ObjectMapper> wlc2) {
        return new ufu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ufw) vuf.a(new RemoteCosmosCollectionApiImpl((FireAndForgetResolver) this.a.get(), (ObjectMapper) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
