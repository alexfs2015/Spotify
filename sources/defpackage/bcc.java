package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import java.net.URLDecoder;

/* renamed from: bcc reason: default package */
public final class bcc extends bcb {
    private bcg a;
    private int b;
    private byte[] c;

    public bcc() {
        super(false);
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.c.length - this.b;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.c, this.b, bArr, i, min);
        this.b += min;
        a(min);
        return min;
    }

    public final long a(bcg bcg) {
        b(bcg);
        this.a = bcg;
        Uri uri = bcg.a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] a2 = ben.a(uri.getSchemeSpecificPart(), ",");
            if (a2.length == 2) {
                String str = a2[1];
                if (a2[0].contains(";base64")) {
                    try {
                        this.c = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        StringBuilder sb = new StringBuilder("Error while parsing Base64 encoded string: ");
                        sb.append(str);
                        throw new ParserException(sb.toString(), e);
                    }
                } else {
                    this.c = ben.c(URLDecoder.decode(str, "US-ASCII"));
                }
                c(bcg);
                return (long) this.c.length;
            }
            StringBuilder sb2 = new StringBuilder("Unexpected URI format: ");
            sb2.append(uri);
            throw new ParserException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("Unsupported scheme: ");
        sb3.append(scheme);
        throw new ParserException(sb3.toString());
    }

    public final Uri a() {
        bcg bcg = this.a;
        if (bcg != null) {
            return bcg.a;
        }
        return null;
    }

    public final void c() {
        if (this.c != null) {
            this.c = null;
            d();
        }
        this.a = null;
    }
}
