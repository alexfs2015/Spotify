package defpackage;

import com.google.android.gms.internal.measurement.zzyy;
import java.nio.ByteBuffer;

/* renamed from: epm reason: default package */
public final class epm {
    private static final epo a;

    public static boolean a(byte[] bArr) {
        return a.a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    public static int b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    public static int b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return a.a(bArr, i, i2);
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzyy(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.a(charSequence, bArr, i, i2);
    }

    static String b(byte[] bArr, int i, int i2) {
        return a.c(bArr, i, i2);
    }

    public static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        epo epo = a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            epo.a(charSequence, byteBuffer);
        } else {
            epo.b(charSequence, byteBuffer);
        }
    }

    static {
        epo epo;
        if (!(epk.a() && epk.b()) || elr.a()) {
            epo = new epp();
        } else {
            epo = new epq();
        }
        a = epo;
    }

    static /* synthetic */ int c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return b(b);
        }
        if (i3 == 1) {
            return b(b, bArr[i]);
        }
        if (i3 == 2) {
            return b((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
