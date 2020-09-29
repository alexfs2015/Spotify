package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: bee reason: default package */
public final class bee extends BufferedOutputStream {
    private boolean a;

    public bee(OutputStream outputStream) {
        super(outputStream);
    }

    public bee(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void a(OutputStream outputStream) {
        bdl.b(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
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
            ben.a(th);
        }
    }
}
