package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* renamed from: bes reason: default package */
public final class bes {
    public final List<byte[]> a;
    public final int b;

    private bes(List<byte[]> list, int i) {
        this.a = list;
        this.b = i;
    }

    public static bes a(bea bea) {
        try {
            bea.d(21);
            int c = bea.c() & 3;
            int c2 = bea.c();
            int i = bea.b;
            int i2 = 0;
            int i3 = 0;
            while (i2 < c2) {
                bea.d(1);
                int d = bea.d();
                int i4 = i3;
                for (int i5 = 0; i5 < d; i5++) {
                    int d2 = bea.d();
                    i4 += d2 + 4;
                    bea.d(d2);
                }
                i2++;
                i3 = i4;
            }
            bea.c(i);
            byte[] bArr = new byte[i3];
            int i6 = 0;
            int i7 = 0;
            while (i6 < c2) {
                bea.d(1);
                int d3 = bea.d();
                int i8 = i7;
                for (int i9 = 0; i9 < d3; i9++) {
                    int d4 = bea.d();
                    byte[] bArr2 = bdy.a;
                    byte[] bArr3 = bdy.a;
                    System.arraycopy(bArr2, 0, bArr, i8, 4);
                    byte[] bArr4 = bdy.a;
                    int i10 = i8 + 4;
                    System.arraycopy(bea.a, bea.b, bArr, i10, d4);
                    i8 = i10 + d4;
                    bea.d(d4);
                }
                i6++;
                i7 = i8;
            }
            return new bes(i3 == 0 ? null : Collections.singletonList(bArr), c + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
