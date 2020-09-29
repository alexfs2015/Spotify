package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.Charset;

/* renamed from: fma reason: default package */
final class fma {
    final String a;
    SymbolShapeHint b;
    flc c;
    flc d;
    final StringBuilder e;
    int f;
    int g;
    fmd h;
    int i;

    fma(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = (char) (bytes[i2] & 255);
            if (c2 != '?' || str.charAt(i2) == '?') {
                sb.append(c2);
                i2++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.a = sb.toString();
        this.b = SymbolShapeHint.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public final char a() {
        return this.a.charAt(this.f);
    }

    public final void a(String str) {
        this.e.append(str);
    }

    public final void a(char c2) {
        this.e.append(c2);
    }

    public final boolean b() {
        return this.f < e();
    }

    private int e() {
        return this.a.length() - this.i;
    }

    public final int c() {
        return e() - this.f;
    }

    public final void a(int i2) {
        fmd fmd = this.h;
        if (fmd == null || i2 > fmd.a) {
            this.h = fmd.a(i2, this.b, this.c, this.d, true);
        }
    }

    public final void d() {
        a(this.e.length());
    }
}
