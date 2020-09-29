package defpackage;

import java.io.IOException;

/* renamed from: xav reason: default package */
class xav extends xcu {
    private boolean a;

    xav(xdf xdf) {
        super(xdf);
    }

    public final void a_(xcq xcq, long j) {
        if (this.a) {
            xcq.i(j);
            return;
        }
        try {
            super.a_(xcq, j);
        } catch (IOException unused) {
            this.a = true;
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public void close() {
        if (!this.a) {
            try {
                super.close();
            } catch (IOException unused) {
                this.a = true;
                b();
            }
        }
    }

    public void flush() {
        if (!this.a) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.a = true;
                b();
            }
        }
    }
}
