package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iqr reason: default package */
public final class iqr implements wig<iqq> {
    private final wzi<RxResolver> a;

    private iqr(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static iqr a(wzi<RxResolver> wzi) {
        return new iqr(wzi);
    }

    public final /* synthetic */ Object get() {
        return new iqq(this.a);
    }
}
