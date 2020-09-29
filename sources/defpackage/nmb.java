package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: nmb reason: default package */
public final class nmb implements wig<nma> {
    private final wzi<RxResolver> a;

    private nmb(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static nmb a(wzi<RxResolver> wzi) {
        return new nmb(wzi);
    }

    public final /* synthetic */ Object get() {
        return new nma((RxResolver) this.a.get());
    }
}
