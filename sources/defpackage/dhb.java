package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: dhb reason: default package */
final class dhb implements Runnable {
    private dhb() {
    }

    /* synthetic */ dhb(byte b) {
        this();
    }

    public final void run() {
        try {
            dha.c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            dha.a.countDown();
            throw th;
        }
        dha.a.countDown();
    }
}
