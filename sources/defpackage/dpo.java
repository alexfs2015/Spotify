package defpackage;

@cey
/* renamed from: dpo reason: default package */
public class dpo extends beo {
    private final Object a = new Object();
    private beo b;

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

    public final void a(beo beo) {
        synchronized (this.a) {
            this.b = beo;
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
