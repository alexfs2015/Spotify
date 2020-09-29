package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aza reason: default package */
public final class aza implements ast {
    private static final Pattern a = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern b = Pattern.compile("MPEGTS:(\\d+)");
    private final String c;
    private final bdt d;
    private final bdj e = new bdj();
    private asv f;
    private byte[] g = new byte[1024];
    private int h;

    public aza(String str, bdt bdt) {
        this.c = str;
        this.d = bdt;
    }

    public final boolean a(asu asu) {
        asu.b(this.g, 0, 6, false);
        this.e.a(this.g, 6);
        if (baw.b(this.e)) {
            return true;
        }
        asu.b(this.g, 6, 3, false);
        this.e.a(this.g, 9);
        return baw.b(this.e);
    }

    public final void a(asv asv) {
        this.f = asv;
        asv.a(new b(-9223372036854775807L));
    }

    public final void a(long j, long j2) {
        throw new IllegalStateException();
    }

    public final int a(asu asu, ata ata) {
        int i;
        int d2 = (int) asu.d();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            if (d2 != -1) {
                i = d2;
            } else {
                i = bArr.length;
            }
            this.g = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int a2 = asu.a(bArr2, i3, bArr2.length - i3);
        if (a2 != -1) {
            this.h += a2;
            if (d2 == -1 || this.h != d2) {
                return 0;
            }
        }
        bdj bdj = new bdj(this.g);
        baw.a(bdj);
        long j = 0;
        long j2 = 0;
        while (true) {
            String r = bdj.r();
            if (TextUtils.isEmpty(r)) {
                Matcher c2 = baw.c(bdj);
                if (c2 == null) {
                    a(0);
                } else {
                    long a3 = baw.a(c2.group(1));
                    long b2 = this.d.b(bdt.e((j + a3) - j2));
                    atd a4 = a(b2 - a3);
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
                        j2 = baw.a(matcher.group(1));
                        j = bdt.d(Long.parseLong(matcher2.group(1)));
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

    private atd a(long j) {
        atd a2 = this.f.a(0, 3);
        a2.a(aqe.a((String) null, "text/vtt", (String) null, -1, 0, this.c, (asc) null, j));
        this.f.a();
        return a2;
    }
}
