package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ref reason: default package */
public final class ref implements wig<iqp> {
    private final wzi<RxResolver> a;

    private ref(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static ref a(wzi<RxResolver> wzi) {
        return new ref(wzi);
    }

    public final /* synthetic */ Object get() {
        return (iqp) wil.a(new iqp((RxResolver) this.a.get(), "@"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
