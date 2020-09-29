package defpackage;

/* renamed from: jgp reason: default package */
public final class jgp implements a {
    private final jhw a;

    public final String c() {
        return "BluetoothA2dpStateListener";
    }

    public jgp(jhw jhw) {
        this.a = jhw;
    }

    public final void a() {
        this.a.e.d();
    }

    public final void b() {
        jgo jgo = this.a.e;
        jgo.a = false;
        jgo.b.b(jgo);
        jgo.c.a.a();
        if (jgo.d != null) {
            jgo.d.a(false);
        }
        if (jgo.e != null) {
            jgo.e.a();
        }
        if (jgo.f != null && !jgo.f.isUnsubscribed()) {
            jgo.f.unsubscribe();
        }
        if (jgo.g != null) {
            jgo.g.a();
        }
        jgo.h.a();
        jgo.c();
    }
}
