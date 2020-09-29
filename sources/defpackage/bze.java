package defpackage;

import android.util.Base64;

/* renamed from: bze reason: default package */
public final class bze {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }
}
