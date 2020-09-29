package defpackage;

import java.security.SecureRandom;

/* renamed from: dbs reason: default package */
public final class dbs {
    private static final ThreadLocal<SecureRandom> a = new dbt();

    static /* synthetic */ SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
