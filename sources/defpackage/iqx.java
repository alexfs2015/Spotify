package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iqx reason: default package */
public final class iqx implements wig<iqw> {
    private final wzi<RxResolver> a;

    private iqx(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static iqx a(wzi<RxResolver> wzi) {
        return new iqx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new iqw(this.a);
    }
}
