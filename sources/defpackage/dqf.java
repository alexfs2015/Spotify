package defpackage;

@cfp
/* renamed from: dqf reason: default package */
public class dqf extends bff {
    private final Object a = new Object();
    private bff b;

    public void a() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a();
            }
        }
    }

    public void a(int i) {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a(i);
            }
        }
    }

    public final void a(bff bff) {
        synchronized (this.a) {
            this.b = bff;
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.b();
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.c();
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.d();
            }
        }
    }
}
