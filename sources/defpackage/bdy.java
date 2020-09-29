package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bdy reason: default package */
public final class bdy {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public static bdy a(bdj bdj) {
        float f;
        int i;
        int i2;
        try {
            bdj.d(4);
            int c2 = (bdj.c() & 3) + 1;
            if (c2 != 3) {
                ArrayList arrayList = new ArrayList();
                int c3 = bdj.c() & 31;
                for (int i3 = 0; i3 < c3; i3++) {
                    arrayList.add(b(bdj));
                }
                int c4 = bdj.c();
                for (int i4 = 0; i4 < c4; i4++) {
                    arrayList.add(b(bdj));
                }
                if (c3 > 0) {
                    b a2 = bdh.a((byte[]) arrayList.get(0), c2, ((byte[]) arrayList.get(0)).length);
                    int i5 = a2.e;
                    int i6 = a2.f;
                    f = a2.g;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                bdy bdy = new bdy(arrayList, c2, i2, i, f);
                return bdy;
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ParserException("Error parsing AVC config", e2);
        }
    }

    private bdy(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    private static byte[] b(bdj bdj) {
        int d2 = bdj.d();
        int i = bdj.b;
        bdj.d(d2);
        return bcx.a(bdj.a, i, d2);
    }
}
