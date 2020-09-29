package defpackage;

import android.content.res.Resources;

/* renamed from: njo reason: default package */
public final class njo implements wig<njn> {
    private final wzi<Resources> a;

    private njo(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static njo a(wzi<Resources> wzi) {
        return new njo(wzi);
    }

    public final /* synthetic */ Object get() {
        return new njn((Resources) this.a.get());
    }
}
