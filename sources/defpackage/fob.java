package defpackage;

import com.comscore.streaming.ContentType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;

/* renamed from: fob reason: default package */
public final class fob {
    private static final fob[] c = a();
    public final int a;
    public final int b;
    private final int[] d;
    private final b[] e;

    /* renamed from: fob$a */
    public static final class a {
        final int a;
        final int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: fob$b */
    public static final class b {
        final int a;
        final a[] b;

        b(int i, a... aVarArr) {
            this.a = i;
            this.b = aVarArr;
        }

        public final int a() {
            int i = 0;
            for (a aVar : this.b) {
                i += aVar.a;
            }
            return i;
        }

        public final int b() {
            return this.a * a();
        }
    }

    private fob(int i, int[] iArr, b... bVarArr) {
        this.a = i;
        this.d = iArr;
        this.e = bVarArr;
        int i2 = bVarArr[0].a;
        int i3 = 0;
        for (a aVar : bVarArr[0].b) {
            i3 += aVar.a * (aVar.b + i2);
        }
        this.b = i3;
    }

    public static fob a(int i) {
        if (i > 0 && i <= 40) {
            return c[i - 1];
        }
        throw new IllegalArgumentException();
    }

    private static fob[] a() {
        return new fob[]{new fob(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9))), new fob(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16))), new fob(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13))), new fob(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9))), new fob(5, new int[]{6, 30}, new b(26, new a(1, 108)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12))), new fob(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15))), new fob(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14))), new fob(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15))), new fob(9, new int[]{6, 26, 46}, new b(30, new a(2, defpackage.o.a.aD)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13))), new fob(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16))), new fob(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13))), new fob(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15))), new fob(13, new int[]{6, 34, 62}, new b(26, new a(4, 107)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12))), new fob(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, defpackage.o.a.aC), new a(1, defpackage.o.a.aD)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13))), new fob(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13))), new fob(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16))), new fob(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, 107), new a(5, 108)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15))), new fob(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, 120), new a(1, 121)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15))), new fob(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, ContentType.LIVE), new a(4, defpackage.o.a.aB)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14))), new fob(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, 107), new a(5, 108)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16))), new fob(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, defpackage.o.a.aD), new a(4, defpackage.o.a.aE)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17))), new fob(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, ContentType.SHORT_FORM_ON_DEMAND), new a(7, ContentType.LONG_FORM_ON_DEMAND)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13))), new fob(23, new int[]{6, 30, 54, 78, 102}, new b(30, new a(4, 121), new a(5, 122)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16))), new fob(24, new int[]{6, 28, 54, 80, 106}, new b(30, new a(6, defpackage.o.a.aE), new a(4, defpackage.o.a.aF)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17))), new fob(25, new int[]{6, 32, 58, 84, 110}, new b(26, new a(8, 106), new a(4, 107)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16))), new fob(26, new int[]{6, 30, 58, 86, defpackage.o.a.aB}, new b(28, new a(10, defpackage.o.a.aB), new a(2, defpackage.o.a.aC)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17))), new fob(27, new int[]{6, 34, 62, 90, defpackage.o.a.aF}, new b(30, new a(8, 122), new a(4, 123)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16))), new fob(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new a(3, defpackage.o.a.aE), new a(10, defpackage.o.a.aF)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16))), new fob(29, new int[]{6, 30, 54, 78, 102, 126}, new b(30, new a(7, defpackage.o.a.aD), new a(7, defpackage.o.a.aE)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16))), new fob(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new a(5, defpackage.o.a.aC), new a(10, defpackage.o.a.aD)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16))), new fob(31, new int[]{6, 30, 56, 82, 108, 134}, new b(30, new a(13, defpackage.o.a.aC), new a(3, defpackage.o.a.aD)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16))), new fob(32, new int[]{6, 34, 60, 86, ContentType.LONG_FORM_ON_DEMAND, 138}, new b(30, new a(17, defpackage.o.a.aC)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16))), new fob(33, new int[]{6, 30, 58, 86, defpackage.o.a.aB, 142}, new b(30, new a(17, defpackage.o.a.aC), new a(1, defpackage.o.a.aD)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16))), new fob(34, new int[]{6, 34, 62, 90, defpackage.o.a.aF, 146}, new b(30, new a(13, defpackage.o.a.aC), new a(6, defpackage.o.a.aD)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17))), new fob(35, new int[]{6, 30, 54, 78, 102, 126, PlaybackSpeed.PLAYBACK_SPEED_150}, new b(30, new a(12, 121), new a(7, 122)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16))), new fob(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b(30, new a(6, 121), new a(14, 122)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16))), new fob(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b(30, new a(17, 122), new a(4, 123)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16))), new fob(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b(30, new a(4, 122), new a(18, 123)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16))), new fob(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b(30, new a(20, defpackage.o.a.aE), new a(4, defpackage.o.a.aF)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16))), new fob(40, new int[]{6, 30, 58, 86, defpackage.o.a.aB, 142, 170}, new b(30, new a(19, defpackage.o.a.aF), new a(6, defpackage.o.a.aG)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)))};
    }

    public final b a(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.e[errorCorrectionLevel.ordinal()];
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
