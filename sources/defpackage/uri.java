package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.music.spotlets.radio.collection.RemoteCosmosCollectionApiImpl;

/* renamed from: uri reason: default package */
public final class uri implements wig<urk> {
    private final wzi<FireAndForgetResolver> a;
    private final wzi<ObjectMapper> b;

    private uri(wzi<FireAndForgetResolver> wzi, wzi<ObjectMapper> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uri a(wzi<FireAndForgetResolver> wzi, wzi<ObjectMapper> wzi2) {
        return new uri(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (urk) wil.a(new RemoteCosmosCollectionApiImpl((FireAndForgetResolver) this.a.get(), (ObjectMapper) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
