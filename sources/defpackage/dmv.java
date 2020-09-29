package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@cfp
/* renamed from: dmv reason: default package */
public abstract class dmv {
    private static MessageDigest b;
    protected Object a = new Object();

    /* access modifiers changed from: protected */
    public final MessageDigest a() {
        synchronized (this.a) {
            if (b != null) {
                MessageDigest messageDigest = b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract byte[] a(String str);
}
