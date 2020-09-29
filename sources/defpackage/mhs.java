package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: mhs reason: default package */
public final class mhs implements wig<mhr> {
    private final wzi<RxResolver> a;

    private mhs(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static mhs a(wzi<RxResolver> wzi) {
        return new mhs(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mhr((RxResolver) this.a.get());
    }
}
