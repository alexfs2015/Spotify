package defpackage;

import java.nio.charset.Charset;

/* renamed from: fdp reason: default package */
public abstract class fdp implements fds {
    protected fdp() {
    }

    public final fds a(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            a(charSequence.charAt(i));
        }
        return this;
    }

    public fds a(CharSequence charSequence, Charset charset) {
        return a(charSequence.toString().getBytes(charset));
    }

    public fds a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public fds b(byte[] bArr, int i, int i2) {
        fay.a(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            b(bArr[i + i3]);
        }
        return this;
    }

    public fds a(char c) {
        b((byte) c);
        b((byte) (c >>> 8));
        return this;
    }
}
