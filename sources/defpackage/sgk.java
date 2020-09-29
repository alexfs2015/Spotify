package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: sgk reason: default package */
public final class sgk implements sgl {
    private final wzi<RxResolver> a;
    private final wzi<xil> b;
    private final wzi<xil> c;

    public sgk(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<xil> wzi3) {
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

    /* renamed from: b */
    public final sgj a() {
        return new sgj((RxResolver) a(this.a.get(), 1), (xil) a(this.b.get(), 2), (xil) a(this.c.get(), 3));
    }
}
