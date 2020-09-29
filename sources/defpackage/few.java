package defpackage;

import java.util.Arrays;

/* renamed from: few reason: default package */
public final class few {

    /* renamed from: few$a */
    static final class a {
        private static final byte[] a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, -1);
            for (int i = 0; i <= 9; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 <= 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            a = bArr;
        }

        static int a(char c) {
            if (c < 128) {
                return a[c];
            }
            return -1;
        }
    }
}
