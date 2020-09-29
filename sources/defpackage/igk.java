package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: igk reason: default package */
public final class igk implements wig<igj> {
    private final wzi<RxResolver> a;

    private igk(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static igk a(wzi<RxResolver> wzi) {
        return new igk(wzi);
    }

    public final /* synthetic */ Object get() {
        return new igj((RxResolver) this.a.get());
    }
}
