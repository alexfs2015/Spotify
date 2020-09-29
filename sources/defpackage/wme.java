package defpackage;

import java.nio.charset.Charset;

/* renamed from: wme reason: default package */
public abstract class wme {
    public abstract wlz a();

    public abstract void a(wol wol);

    public long b() {
        return -1;
    }

    public static wme a(wlz wlz, String str) {
        Charset charset = wmk.d;
        if (wlz != null) {
            charset = wlz.a((Charset) null);
            if (charset == null) {
                charset = wmk.d;
                StringBuilder sb = new StringBuilder();
                sb.append(wlz);
                sb.append("; charset=utf-8");
                wlz = wlz.b(sb.toString());
            }
        }
        return a(wlz, str.getBytes(charset));
    }

    public static wme a(wlz wlz, byte[] bArr) {
        return a(wlz, bArr, 0, bArr.length);
    }

    private static wme a(final wlz wlz, final byte[] bArr, int i, final int i2) {
        if (bArr != null) {
            wmk.a((long) bArr.length, 0, (long) i2);
            return new wme(0) {
                public final wlz a() {
                    return wlz.this;
                }

                public final long b() {
                    return (long) i2;
                }

                public final void a(wol wol) {
                    wol.c(bArr, 0, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}
