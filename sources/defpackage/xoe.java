package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xoe reason: default package */
public final class xoe {
    private static final AtomicReference<xoe> d = new AtomicReference<>();
    private final xil a = xob.a();
    private final xil b = xob.b();
    private final xil c = xob.c();

    private xoe() {
        xoa.a().f();
    }

    public static xil a() {
        return xlp.a;
    }

    public static xil b() {
        xoe xoe;
        while (true) {
            xoe = (xoe) d.get();
            if (xoe != null) {
                break;
            }
            xoe = new xoe();
            if (d.compareAndSet(null, xoe)) {
                break;
            }
            xoe.c();
        }
        return xnx.a(xoe.a);
    }

    private synchronized void c() {
        if (this.a instanceof xln) {
            ((xln) this.a).b();
        }
        if (this.b instanceof xln) {
            ((xln) this.b).b();
        }
        if (this.c instanceof xln) {
            ((xln) this.c).b();
        }
    }
}
