package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;

/* renamed from: ati reason: default package */
final class ati extends TagPayloadReader {
    private final bdj a = new bdj(bdh.a);
    private final bdj c = new bdj(4);
    private int d;
    private boolean e;
    private int f;

    public ati(atd atd) {
        super(atd);
    }

    public final boolean a(bdj bdj) {
        int c2 = bdj.c();
        int i = (c2 >> 4) & 15;
        int i2 = c2 & 15;
        if (i2 == 7) {
            this.f = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder("Video format not supported: ");
        sb.append(i2);
        throw new UnsupportedFormatException(sb.toString());
    }

    public final void a(bdj bdj, long j) {
        int c2 = bdj.c();
        byte[] bArr = bdj.a;
        int i = bdj.b;
        bdj.b = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        byte[] bArr2 = bdj.a;
        int i3 = bdj.b;
        bdj.b = i3 + 1;
        byte b = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = bdj.a;
        int i4 = bdj.b;
        bdj.b = i4 + 1;
        long j2 = j + (((long) (b | (bArr3[i4] & 255))) * 1000);
        if (c2 != 0 || this.e) {
            if (c2 == 1 && this.e) {
                byte[] bArr4 = this.c.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i5 = 4 - this.d;
                int i6 = 0;
                while (bdj.b() > 0) {
                    bdj.a(this.c.a, i5, this.d);
                    this.c.c(0);
                    int n = this.c.n();
                    this.a.c(0);
                    this.b.a(this.a, 4);
                    int i7 = i6 + 4;
                    this.b.a(bdj, n);
                    i6 = i7 + n;
                }
                this.b.a(j2, this.f == 1 ? 1 : 0, i6, 0, null);
            }
            return;
        }
        bdj bdj2 = new bdj(new byte[bdj.b()]);
        bdj.a(bdj2.a, 0, bdj.b());
        bdy a2 = bdy.a(bdj2);
        this.d = a2.b;
        this.b.a(aqe.a((String) null, "video/avc", (String) null, -1, -1, a2.c, a2.d, -1.0f, a2.a, -1, a2.e, (asc) null));
        this.e = true;
    }
}
