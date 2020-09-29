package defpackage;

/* renamed from: jje reason: default package */
public final class jje implements a {
    private final jkm a;

    public jje(jkm jkm) {
        this.a = jkm;
    }

    public final void a() {
        this.a.e.d();
    }

    public final void b() {
        jjd jjd = this.a.e;
        jjd.a = false;
        jjd.b.b(jjd);
        jjd.c.a.a();
        if (jjd.d != null) {
            jjd.d.a(false);
        }
        if (jjd.e != null) {
            jjd.e.a();
        }
        if (jjd.f != null && !jjd.f.isUnsubscribed()) {
            jjd.f.unsubscribe();
        }
        if (jjd.g != null) {
            jjd.g.a();
        }
        jjd.h.a();
        jjd.c();
    }

    public final String c() {
        return "BluetoothA2dpStateListener";
    }
}
