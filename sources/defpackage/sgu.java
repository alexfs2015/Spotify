package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: sgu reason: default package */
public final class sgu implements wig<sgt> {
    private final wzi<RxResolver> a;

    private sgu(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static sgu a(wzi<RxResolver> wzi) {
        return new sgu(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sgt((RxResolver) this.a.get());
    }
}
