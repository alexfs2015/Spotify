package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ojd reason: default package */
public final class ojd implements wig<ojc> {
    private final wzi<hxx> a;
    private final wzi<RxResolver> b;

    private ojd(wzi<hxx> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ojd a(wzi<hxx> wzi, wzi<RxResolver> wzi2) {
        return new ojd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ojc((hxx) this.a.get(), (RxResolver) this.b.get());
    }
}
