package defpackage;

import java.nio.charset.Charset;

/* renamed from: feh reason: default package */
public abstract class feh implements fek {
    protected feh() {
    }

    public fek a(char c) {
        b((byte) c);
        b((byte) (c >>> 8));
        return this;
    }

    public final fek a(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            a(charSequence.charAt(i));
        }
        return this;
    }

    public fek a(CharSequence charSequence, Charset charset) {
        return a(charSequence.toString().getBytes(charset));
    }

    public fek a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public fek b(byte[] bArr, int i, int i2) {
        fbp.a(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            b(bArr[i + i3]);
        }
        return this;
    }
}
