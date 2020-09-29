package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* renamed from: beb reason: default package */
public final class beb {
    public final List<byte[]> a;
    public final int b;

    public static beb a(bdj bdj) {
        List list;
        try {
            bdj.d(21);
            int c = bdj.c() & 3;
            int c2 = bdj.c();
            int i = bdj.b;
            int i2 = 0;
            int i3 = 0;
            while (i2 < c2) {
                bdj.d(1);
                int d = bdj.d();
                int i4 = i3;
                for (int i5 = 0; i5 < d; i5++) {
                    int d2 = bdj.d();
                    i4 += d2 + 4;
                    bdj.d(d2);
                }
                i2++;
                i3 = i4;
            }
            bdj.c(i);
            byte[] bArr = new byte[i3];
            int i6 = 0;
            int i7 = 0;
            while (i6 < c2) {
                bdj.d(1);
                int d3 = bdj.d();
                int i8 = i7;
                for (int i9 = 0; i9 < d3; i9++) {
                    int d4 = bdj.d();
                    byte[] bArr2 = bdh.a;
                    byte[] bArr3 = bdh.a;
                    System.arraycopy(bArr2, 0, bArr, i8, 4);
                    byte[] bArr4 = bdh.a;
                    int i10 = i8 + 4;
                    System.arraycopy(bdj.a, bdj.b, bArr, i10, d4);
                    i8 = i10 + d4;
                    bdj.d(d4);
                }
                i6++;
                i7 = i8;
            }
            if (i3 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new beb(list, c + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }

    private beb(List<byte[]> list, int i) {
        this.a = list;
        this.b = i;
    }
}
