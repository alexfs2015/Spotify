package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ogd reason: default package */
public final class ogd implements wig<ogc> {
    private final wzi<RxResolver> a;

    private ogd(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static ogc a(RxResolver rxResolver) {
        return new ogc(rxResolver);
    }

    public static ogd a(wzi<RxResolver> wzi) {
        return new ogd(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ogc((RxResolver) this.a.get());
    }
}
