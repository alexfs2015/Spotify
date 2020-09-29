package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: isq reason: default package */
public final class isq implements wig<isn> {
    private final wzi<CollectionStateProvider> a;
    private final wzi<iss> b;
    private final wzi<sso> c;

    private isq(wzi<CollectionStateProvider> wzi, wzi<iss> wzi2, wzi<sso> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static isq a(wzi<CollectionStateProvider> wzi, wzi<iss> wzi2, wzi<sso> wzi3) {
        return new isq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new isn((CollectionStateProvider) this.a.get(), (iss) this.b.get(), (sso) this.c.get());
    }
}
