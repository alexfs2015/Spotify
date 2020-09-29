package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: uwv reason: default package */
public final class uwv implements wig<uwu> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;
    private final wzi<uws> c;

    private uwv(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<uws> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static uwv a(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<uws> wzi3) {
        return new uwv(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new uwu((RxResolver) this.a.get(), (rwl) this.b.get(), (uws) this.c.get());
    }
}
