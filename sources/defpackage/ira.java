package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ira reason: default package */
public final class ira implements wig<iqz> {
    private final wzi<RxResolver> a;
    private final wzi<String> b;

    private ira(wzi<RxResolver> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ira a(wzi<RxResolver> wzi, wzi<String> wzi2) {
        return new ira(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new iqz((RxResolver) this.a.get(), (String) this.b.get());
    }
}
