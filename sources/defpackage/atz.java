package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;

/* renamed from: atz reason: default package */
final class atz extends TagPayloadReader {
    private final bea a = new bea(bdy.a);
    private final bea c = new bea(4);
    private int d;
    private boolean e;
    private int f;

    public atz(atu atu) {
        super(atu);
    }

    public final void a(bea bea, long j) {
        int c2 = bea.c();
        byte[] bArr = bea.a;
        int i = bea.b;
        bea.b = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        byte[] bArr2 = bea.a;
        int i3 = bea.b;
        bea.b = i3 + 1;
        byte b = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = bea.a;
        int i4 = bea.b;
        bea.b = i4 + 1;
        long j2 = j + (((long) (b | (bArr3[i4] & 255))) * 1000);
        if (c2 != 0 || this.e) {
            if (c2 == 1 && this.e) {
                byte[] bArr4 = this.c.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i5 = 4 - this.d;
                int i6 = 0;
                while (bea.b() > 0) {
                    bea.a(this.c.a, i5, this.d);
                    this.c.c(0);
                    int n = this.c.n();
                    this.a.c(0);
                    this.b.a(this.a, 4);
                    int i7 = i6 + 4;
                    this.b.a(bea, n);
                    i6 = i7 + n;
                }
                this.b.a(j2, this.f == 1 ? 1 : 0, i6, 0, null);
            }
            return;
        }
        bea bea2 = new bea(new byte[bea.b()]);
        bea.a(bea2.a, 0, bea.b());
        bep a2 = bep.a(bea2);
        this.d = a2.b;
        this.b.a(aqv.a((String) null, "video/avc", (String) null, -1, -1, a2.c, a2.d, -1.0f, a2.a, -1, a2.e, (ast) null));
        this.e = true;
    }

    public final boolean a(bea bea) {
        int c2 = bea.c();
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
}
