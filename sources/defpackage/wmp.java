package defpackage;

import java.io.IOException;

/* renamed from: wmp reason: default package */
class wmp extends woo {
    private boolean a;

    /* access modifiers changed from: protected */
    public void b() {
    }

    wmp(woz woz) {
        super(woz);
    }

    public final void a_(wok wok, long j) {
        if (this.a) {
            wok.i(j);
            return;
        }
        try {
            super.a_(wok, j);
        } catch (IOException unused) {
            this.a = true;
            b();
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
}
