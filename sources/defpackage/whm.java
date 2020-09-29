package defpackage;

import android.util.Base64;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;

/* renamed from: whm reason: default package */
public final class whm {
    private static byte[] a = {105, -35, -88, 69, 92, 125, -44, 37, 75, -13, 83, -73, 115, 48, 78, -20};

    public static String a() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            return Base64.encodeToString(instance.generateKey().getEncoded(), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0023 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(byte[] r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            byte[] r2 = a
            r1.<init>(r2)
            java.lang.String r2 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch:{  }
            r3 = 0
            byte[] r6 = android.util.Base64.decode(r6, r3)
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r4 = "AES"
            r3.<init>(r6, r4)
            r6 = 2
            r2.init(r6, r3, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x0023, InvalidKeyException -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            return r0
        L_0x0023:
            byte[] r5 = r2.doFinal(r5)     // Catch:{ NoSuchAlgorithmException | NoSuchPaddingException -> 0x002d }
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            return r6
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whm.a(byte[], java.lang.String):java.lang.String");
    }
}
