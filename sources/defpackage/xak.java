package defpackage;

import java.nio.charset.Charset;

/* renamed from: xak reason: default package */
public abstract class xak {
    public static xak a(xaf xaf, String str) {
        Charset charset = xaq.d;
        if (xaf != null) {
            charset = xaf.a((Charset) null);
            if (charset == null) {
                charset = xaq.d;
                StringBuilder sb = new StringBuilder();
                sb.append(xaf);
                sb.append("; charset=utf-8");
                xaf = xaf.b(sb.toString());
            }
        }
        return a(xaf, str.getBytes(charset));
    }

    public static xak a(xaf xaf, byte[] bArr) {
        return a(xaf, bArr, 0, bArr.length);
    }

    private static xak a(final xaf xaf, final byte[] bArr, int i, final int i2) {
        if (bArr != null) {
            xaq.a((long) bArr.length, 0, (long) i2);
            return new xak(0) {
                public final xaf a() {
                    return xaf.this;
                }

                public final void a(xcr xcr) {
                    xcr.c(bArr, 0, i2);
                }

                public final long b() {
                    return (long) i2;
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public abstract xaf a();

    public abstract void a(xcr xcr);

    public long b() {
        return -1;
    }
}
