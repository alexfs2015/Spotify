package defpackage;

import java.security.SecureRandom;

/* renamed from: dbb reason: default package */
public final class dbb {
    private static final ThreadLocal<SecureRandom> a = new dbc();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }

    static /* synthetic */ SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
