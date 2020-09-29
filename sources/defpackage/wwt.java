package defpackage;

/* renamed from: wwt reason: default package */
public final class wwt {
    public int a;
    public int b;
    public boolean c;
    public wws<Void> d;
    Throwable e;
    public final wwk<wwi<?>> f = new wwk<wwi<?>>() {
        public final void operationComplete(wwi<?> wwi) {
            wwt.this.b++;
            if (!wwi.g() && wwt.this.e == null) {
                wwt.this.e = wwi.f();
            }
            if (wwt.this.b == wwt.this.a && wwt.this.c) {
                wwt.this.a();
            }
        }
    };

    public boolean a() {
        Throwable th = this.e;
        return th == null ? this.d.b(null) : this.d.b(th);
    }
}
