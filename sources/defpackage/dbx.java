package defpackage;

import java.security.GeneralSecurityException;
import java.util.regex.Pattern;

/* renamed from: dbx reason: default package */
public final class dbx {
    static {
        String str = "([0-9a-zA-Z\\-\\.\\_~])+";
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{str, str, str, str}), 2);
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{str, str, str, str, str}), 2);
    }

    public static void a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new GeneralSecurityException("invalid AES key size");
        }
    }

    public static void b(int i) {
        if (i < 0 || i > 0) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(i), Integer.valueOf(0)}));
        }
    }
}
