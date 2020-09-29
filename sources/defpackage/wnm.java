package defpackage;

import com.spotify.pushnotifications.model.QuickAction;
import java.io.IOException;
import okio.ByteString;

/* renamed from: wnm reason: default package */
public final class wnm {
    static final ByteString a = ByteString.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] b;
    private static String[] c = new String[64];
    private static String[] d = new String[256];

    static {
        String str;
        String str2 = "PRIORITY";
        b = new String[]{"DATA", "HEADERS", str2, "RST_STREAM", QuickAction.OPEN_PUSH_SETTINGS, "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        for (int i = 0; i < 256; i++) {
            d[i] = wmk.a("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        String[] strArr = c;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        int i2 = 0;
        while (true) {
            str = "|PADDED";
            if (i2 > 0) {
                break;
            }
            int i3 = iArr[0];
            String[] strArr2 = c;
            int i4 = i3 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(c[i3]);
            sb.append(str);
            strArr2[i4] = sb.toString();
            i2++;
        }
        String[] strArr3 = c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = str2;
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                String[] strArr4 = c;
                int i9 = i8 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c[i8]);
                sb2.append('|');
                sb2.append(c[i6]);
                strArr4[i9] = sb2.toString();
                String[] strArr5 = c;
                int i10 = i9 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(c[i8]);
                sb3.append('|');
                sb3.append(c[i6]);
                sb3.append(str);
                strArr5[i10] = sb3.toString();
            }
        }
        for (int i11 = 0; i11 < 64; i11++) {
            String[] strArr6 = c;
            if (strArr6[i11] == null) {
                strArr6[i11] = d[i11];
            }
        }
    }

    private wnm() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(wmk.a(str, objArr));
    }

    static IOException b(String str, Object... objArr) {
        throw new IOException(wmk.a(str, objArr));
    }

    static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String a2 = b2 < 10 ? b[b2] : wmk.a("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : d[b3];
                } else if (!(b2 == 7 || b2 == 8)) {
                    String str2 = b3 < 64 ? c[b3] : d[b3];
                    str = (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = d[b3];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a2;
        objArr[4] = str;
        return wmk.a("%s 0x%08x %5d %-13s %s", objArr);
    }
}
