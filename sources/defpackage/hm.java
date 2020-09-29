package defpackage;

import java.io.Writer;

/* renamed from: hm reason: default package */
public final class hm extends Writer {
    private final String a;
    private StringBuilder b = new StringBuilder(128);

    public hm(String str) {
        this.a = str;
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                a();
            } else {
                this.b.append(c);
            }
        }
    }

    private void a() {
        if (this.b.length() > 0) {
            StringBuilder sb = this.b;
            sb.delete(0, sb.length());
        }
    }
}
