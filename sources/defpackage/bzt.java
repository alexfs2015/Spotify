package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bzt reason: default package */
public final class bzt {
    private static volatile int a = -1;

    public static MessageDigest a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
