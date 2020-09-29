package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ipi reason: default package */
public final class ipi implements ipj {
    private final wzi<RxResolver> a;
    private final wzi<xil> b;
    private final wzi<xil> c;

    public ipi(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<xil> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ jwa a() {
        return new iph((RxResolver) a(this.a.get(), 1), (xil) a(this.b.get(), 2), (xil) a(this.c.get(), 3));
    }
}
