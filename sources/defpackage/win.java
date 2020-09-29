package defpackage;

/* renamed from: win reason: default package */
public final class win {
    public int a;
    public int b;
    public boolean c;
    public wim<Void> d;
    Throwable e;
    public final wie<wic<?>> f = new wie<wic<?>>() {
        public final void operationComplete(wic<?> wic) {
            win.this.b++;
            if (!wic.g() && win.this.e == null) {
                win.this.e = wic.f();
            }
            if (win.this.b == win.this.a && win.this.c) {
                win.this.a();
            }
        }
    };

    public boolean a() {
        Throwable th = this.e;
        return th == null ? this.d.b(null) : this.d.b(th);
    }
}
