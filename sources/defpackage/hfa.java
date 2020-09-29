package defpackage;

import android.app.Activity;

/* renamed from: hfa reason: default package */
public final class hfa implements wig<hez> {
    private final wzi<Activity> a;
    private final wzi<sso> b;
    private final wzi<fqn> c;
    private final wzi<Integer> d;
    private final wzi<jpc> e;

    private hfa(wzi<Activity> wzi, wzi<sso> wzi2, wzi<fqn> wzi3, wzi<Integer> wzi4, wzi<jpc> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static hfa a(wzi<Activity> wzi, wzi<sso> wzi2, wzi<fqn> wzi3, wzi<Integer> wzi4, wzi<jpc> wzi5) {
        hfa hfa = new hfa(wzi, wzi2, wzi3, wzi4, wzi5);
        return hfa;
    }

    public final /* synthetic */ Object get() {
        hez hez = new hez(this.a, this.b, this.c, this.d, this.e);
        return hez;
    }
}
