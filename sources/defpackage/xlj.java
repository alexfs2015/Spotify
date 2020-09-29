package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xlj reason: default package */
public final class xlj extends xil {

    /* renamed from: xlj$a */
    final class a extends defpackage.xil.a implements xip {
        private xoj a = new xoj();

        a() {
        }

        public final xip a(xir xir) {
            xir.call();
            return xon.b();
        }

        public final xip a(xir xir, long j, TimeUnit timeUnit) {
            return a(new xlo(xir, this, xlj.this.a() + timeUnit.toMillis(j)));
        }

        public final boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        public final void unsubscribe() {
            this.a.unsubscribe();
        }
    }

    static {
        new xlj();
    }

    private xlj() {
    }

    public final defpackage.xil.a c() {
        return new a();
    }
}
