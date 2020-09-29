package defpackage;

import android.content.Context;
import io.reactivex.Flowable;

/* renamed from: scu reason: default package */
public final class scu {
    private final wzi<Context> a;
    private final wzi<Flowable<fqn>> b;
    private final wzi<xil> c;
    private final wzi<xil> d;
    private final wzi<hub> e;

    public scu(wzi<Context> wzi, wzi<Flowable<fqn>> wzi2, wzi<xil> wzi3, wzi<xil> wzi4, wzi<hub> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final sct a(String str, hpt hpt, String str2) {
        sct sct = new sct((String) a(str, 1), (hpt) a(hpt, 2), (String) a(str2, 3), (Context) a(this.a.get(), 4), (Flowable) a(this.b.get(), 5), (xil) a(this.c.get(), 6), (xil) a(this.d.get(), 7), (hub) a(this.e.get(), 8));
        return sct;
    }
}
