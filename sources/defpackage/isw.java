package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.Response;

/* renamed from: isw reason: default package */
public final class isw implements wig<CollectionStateProvider> {
    private final wzi<gmm<Response>> a;
    private final wzi<rwl> b;

    private isw(wzi<gmm<Response>> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static isw a(wzi<gmm<Response>> wzi, wzi<rwl> wzi2) {
        return new isw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new CollectionStateProvider((gmm) this.a.get(), (rwl) this.b.get());
    }
}
