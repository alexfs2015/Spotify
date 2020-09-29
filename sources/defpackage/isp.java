package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: isp reason: default package */
public final class isp implements wig<iso> {
    private final wzi<CollectionStateProvider> a;
    private final wzi<iss> b;

    private isp(wzi<CollectionStateProvider> wzi, wzi<iss> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static isp a(wzi<CollectionStateProvider> wzi, wzi<iss> wzi2) {
        return new isp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new iso(this.a, this.b);
    }
}
