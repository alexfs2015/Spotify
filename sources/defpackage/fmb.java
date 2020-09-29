package defpackage;

import com.comscore.streaming.AdType;
import com.comscore.streaming.ContentType;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;

/* renamed from: fmb reason: default package */
public final class fmb {
    private static final int[] a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] b = {new int[]{228, 48, 15, ContentType.SHORT_FORM_ON_DEMAND, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, a.aD, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, AdType.LINEAR_ON_DEMAND_POST_ROLL, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, a.aG, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, AdType.LINEAR_ON_DEMAND_POST_ROLL, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, AdType.BRANDED_ON_DEMAND_POST_ROLL, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, a.aL, 12, 181, 184, 96, 50, 193}, new int[]{AdType.LINEAR_ON_DEMAND_PRE_ROLL, AdType.BRANDED_ON_DEMAND_PRE_ROLL, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, AdType.LINEAR_ON_DEMAND_POST_ROLL, 141, 136, 120, 151, AdType.BRANDED_ON_DEMAND_POST_ROLL, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, a.aG, a.aC, 44, 175, 184, 59, 25, 225, 98, 81, ContentType.LONG_FORM_ON_DEMAND}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, ContentType.SHORT_FORM_ON_DEMAND, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, PlaybackSpeed.PLAYBACK_SPEED_150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, a.aE, 22, 238, 133, 238, AdType.BRANDED_ON_DEMAND_PRE_ROLL, 205, 188, 237, 87, 191, 106, 16, 147, a.aF, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, AdType.LINEAR_ON_DEMAND_POST_ROLL, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, AdType.BRANDED_ON_DEMAND_LIVE, PlaybackSpeed.PLAYBACK_SPEED_150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, AdType.BRANDED_ON_DEMAND_CONTENT, a.aE, 203, 29, AdType.BRANDED_ON_DEMAND_MID_ROLL, 144, 238, 22, PlaybackSpeed.PLAYBACK_SPEED_150, 201, a.aE, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, AdType.BRANDED_ON_DEMAND_POST_ROLL, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, a.aF, 202, 188, 201, 189, 143, 108, 196, 37, 185, ContentType.LONG_FORM_ON_DEMAND, 134, 230, 245, 63, 197, 190, 250, 106, 185, AdType.LINEAR_LIVE, 175, 64, a.aB, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, AdType.BRANDED_ON_DEMAND_MID_ROLL, 7, 94, 166, 224, a.aL, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, AdType.LINEAR_ON_DEMAND_POST_ROLL, 136, 248, 180, AdType.BRANDED_ON_DEMAND_CONTENT, 197, 158, 177, 68, 122, 93, AdType.LINEAR_ON_DEMAND_POST_ROLL, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, AdType.BRANDED_ON_DEMAND_MID_ROLL, 96, 210, AdType.BRANDED_ON_DEMAND_PRE_ROLL, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, AdType.BRANDED_ON_DEMAND_MID_ROLL, AdType.LINEAR_ON_DEMAND_PRE_ROLL, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
    private static final int[] c = new int[256];
    private static final int[] d = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            d[i2] = i;
            c[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= HttpConnection.kErrorHttpConnectTimeout;
            }
        }
    }

    public static String a(String str, fmd fmd) {
        if (str.length() == fmd.a) {
            StringBuilder sb = new StringBuilder(fmd.a + fmd.b);
            sb.append(str);
            int a2 = fmd.a();
            if (a2 == 1) {
                sb.append(a((CharSequence) str, fmd.b));
            } else {
                sb.setLength(sb.capacity());
                int[] iArr = new int[a2];
                int[] iArr2 = new int[a2];
                int[] iArr3 = new int[a2];
                int i = 0;
                while (i < a2) {
                    int i2 = i + 1;
                    iArr[i] = fmd.a(i2);
                    iArr2[i] = fmd.e;
                    iArr3[i] = 0;
                    if (i > 0) {
                        iArr3[i] = iArr3[i - 1] + iArr[i];
                    }
                    i = i2;
                }
                for (int i3 = 0; i3 < a2; i3++) {
                    StringBuilder sb2 = new StringBuilder(iArr[i3]);
                    for (int i4 = i3; i4 < fmd.a; i4 += a2) {
                        sb2.append(str.charAt(i4));
                    }
                    String a3 = a((CharSequence) sb2.toString(), iArr2[i3]);
                    int i5 = i3;
                    int i6 = 0;
                    while (i5 < iArr2[i3] * a2) {
                        int i7 = i6 + 1;
                        sb.setCharAt(fmd.a + i5, a3.charAt(i6));
                        i5 += a2;
                        i6 = i7;
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }

    private static String a(CharSequence charSequence, int i) {
        return a(charSequence, 0, charSequence.length(), i);
    }

    private static String a(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        while (true) {
            if (i4 >= 16) {
                i4 = -1;
                break;
            } else if (a[i4] == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int[] iArr = b[i4];
            char[] cArr = new char[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                cArr[i5] = 0;
            }
            for (int i6 = 0; i6 < i2 + 0; i6++) {
                int i7 = i3 - 1;
                char charAt = cArr[i7] ^ charSequence.charAt(i6);
                while (i7 > 0) {
                    if (charAt == 0 || iArr[i7] == 0) {
                        cArr[i7] = cArr[i7 - 1];
                    } else {
                        char c2 = cArr[i7 - 1];
                        int[] iArr2 = d;
                        int[] iArr3 = c;
                        cArr[i7] = (char) (c2 ^ iArr2[(iArr3[charAt] + iArr3[iArr[i7]]) % 255]);
                    }
                    i7--;
                }
                if (charAt == 0 || iArr[0] == 0) {
                    cArr[0] = 0;
                } else {
                    int[] iArr4 = d;
                    int[] iArr5 = c;
                    cArr[0] = (char) iArr4[(iArr5[charAt] + iArr5[iArr[0]]) % 255];
                }
            }
            char[] cArr2 = new char[i3];
            for (int i8 = 0; i8 < i3; i8++) {
                cArr2[i8] = cArr[(i3 - i8) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i3)));
    }
}
