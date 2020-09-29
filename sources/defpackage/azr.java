package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: azr reason: default package */
public final class azr implements atk {
    private static final Pattern a = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern b = Pattern.compile("MPEGTS:(\\d+)");
    private final String c;
    private final bek d;
    private final bea e = new bea();
    private atm f;
    private byte[] g = new byte[1024];
    private int h;

    public azr(String str, bek bek) {
        this.c = str;
        this.d = bek;
    }

    private atu a(long j) {
        atu a2 = this.f.a(0, 3);
        a2.a(aqv.a((String) null, "text/vtt", (String) null, -1, 0, this.c, (ast) null, j));
        this.f.a();
        return a2;
    }

    public final int a(atl atl, atr atr) {
        int d2 = (int) atl.d();
        int i = this.h;
        byte[] bArr = this.g;
        if (i == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((d2 != -1 ? d2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i2 = this.h;
        int a2 = atl.a(bArr2, i2, bArr2.length - i2);
        if (a2 != -1) {
            this.h += a2;
            if (d2 == -1 || this.h != d2) {
                return 0;
            }
        }
        bea bea = new bea(this.g);
        bbn.a(bea);
        long j = 0;
        long j2 = 0;
        while (true) {
            String r = bea.r();
            if (TextUtils.isEmpty(r)) {
                Matcher c2 = bbn.c(bea);
                if (c2 == null) {
                    a(0);
                } else {
                    long a3 = bbn.a(c2.group(1));
                    long b2 = this.d.b(bek.e((j + a3) - j2));
                    atu a4 = a(b2 - a3);
                    this.e.a(this.g, this.h);
                    a4.a(this.e, this.h);
                    a4.a(b2, 1, this.h, 0, null);
                }
                return -1;
            } else if (r.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = a.matcher(r);
                if (matcher.find()) {
                    Matcher matcher2 = b.matcher(r);
                    if (matcher2.find()) {
                        j2 = bbn.a(matcher.group(1));
                        j = bek.d(Long.parseLong(matcher2.group(1)));
                    } else {
                        StringBuilder sb = new StringBuilder("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                        sb.append(r);
                        throw new ParserException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    sb2.append(r);
                    throw new ParserException(sb2.toString());
                }
            }
        }
    }

    public final void a(long j, long j2) {
        throw new IllegalStateException();
    }

    public final void a(atm atm) {
        this.f = atm;
        atm.a(new b(-9223372036854775807L));
    }

    public final boolean a(atl atl) {
        atl.b(this.g, 0, 6, false);
        this.e.a(this.g, 6);
        if (bbn.b(this.e)) {
            return true;
        }
        atl.b(this.g, 6, 3, false);
        this.e.a(this.g, 9);
        return bbn.b(this.e);
    }
}
