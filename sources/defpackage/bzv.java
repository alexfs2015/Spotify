package defpackage;

import android.util.Base64;

/* renamed from: bzv reason: default package */
public final class bzv {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }
}
