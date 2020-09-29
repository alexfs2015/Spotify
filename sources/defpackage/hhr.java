package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: hhr reason: default package */
public final class hhr extends hht {
    private final xil c;

    hhr(int i, long j, xil xil) {
        super(i, j);
        this.c = (xil) fbp.a(xil);
    }

    /* access modifiers changed from: 0000 */
    public final xii<Long> a() {
        return xii.a(this.a, TimeUnit.MILLISECONDS, this.c);
    }
}
