package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: htl reason: default package */
public final class htl implements wig<htk> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;

    private htl(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static htl a(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        return new htl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new htk((RxResolver) this.a.get(), (rwl) this.b.get());
    }
}
