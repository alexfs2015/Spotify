package defpackage;

import com.google.android.gms.internal.measurement.zzwe;

/* renamed from: eqe reason: default package */
final class eqe {
    static /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || d(b3) || d(b4)) {
            throw zzwe.h();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    static /* synthetic */ void a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
            throw zzwe.h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    static /* synthetic */ void a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || d(b2)) {
            throw zzwe.h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    static /* synthetic */ void a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    static /* synthetic */ boolean a(byte b) {
        return b >= 0;
    }

    static /* synthetic */ boolean b(byte b) {
        return b < -32;
    }

    static /* synthetic */ boolean c(byte b) {
        return b < -16;
    }

    private static boolean d(byte b) {
        return b > -65;
    }
}
