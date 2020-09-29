package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: imc reason: default package */
public final class imc {
    public final wzi<Context> a;
    public final wzi<ilk> b;
    public final wzi<ils> c;
    public final wzi<Scheduler> d;
    public final wzi<Scheduler> e;
    public final wzi<Scheduler> f;
    public final wzi<kwf> g;
    public final wzi<imd> h;
    public final wzi<mip> i;

    public imc(wzi<Context> wzi, wzi<ilk> wzi2, wzi<ils> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5, wzi<Scheduler> wzi6, wzi<kwf> wzi7, wzi<imd> wzi8, wzi<mip> wzi9) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
        this.i = (wzi) a(wzi9, 9);
    }

    public static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
