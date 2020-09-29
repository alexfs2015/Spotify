package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: reg reason: default package */
public final class reg implements wig<iqv> {
    private final wzi<RxResolver> a;

    private reg(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static reg a(wzi<RxResolver> wzi) {
        return new reg(wzi);
    }

    public final /* synthetic */ Object get() {
        return (iqv) wil.a(new iqv((RxResolver) this.a.get(), "@"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
