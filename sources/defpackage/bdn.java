package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: bdn reason: default package */
public final class bdn extends BufferedOutputStream {
    private boolean a;

    public bdn(OutputStream outputStream) {
        super(outputStream);
    }

    public bdn(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void close() {
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            bdw.a(th);
        }
    }

    public final void a(OutputStream outputStream) {
        bcu.b(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }
}
