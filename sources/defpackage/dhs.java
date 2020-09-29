package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: dhs reason: default package */
final class dhs implements Runnable {
    private dhs() {
    }

    /* synthetic */ dhs(byte b) {
        this();
    }

    public final void run() {
        try {
            dhr.c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            dhr.a.countDown();
            throw th;
        }
        dhr.a.countDown();
    }
}
