package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: vwx reason: default package */
public final class vwx implements wig<vwu> {
    private final wzi<Context> a;
    private final wzi<Random> b;
    private final wzi<jtz> c;

    private vwx(wzi<Context> wzi, wzi<Random> wzi2, wzi<jtz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static vwx a(wzi<Context> wzi, wzi<Random> wzi2, wzi<jtz> wzi3) {
        return new vwx(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new vwu((Context) this.a.get(), (Random) this.b.get(), (jtz) this.c.get());
    }
}
