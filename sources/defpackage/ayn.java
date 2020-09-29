package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ayn reason: default package */
final class ayn implements bbn {
    private final bbn a;
    private final byte[] b;
    private final byte[] c;
    private CipherInputStream d;

    public ayn(bbn bbn, byte[] bArr, byte[] bArr2) {
        this.a = bbn;
        this.b = bArr;
        this.c = bArr2;
    }

    public final void a(bcd bcd) {
        this.a.a(bcd);
    }

    public final int a(byte[] bArr, int i, int i2) {
        bcu.a(this.d);
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    public final Uri a() {
        return this.a.a();
    }

    public final Map<String, List<String>> b() {
        return this.a.b();
    }

    public final void c() {
        if (this.d != null) {
            this.d = null;
            this.a.c();
        }
    }

    public final long a(bbp bbp) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                bbo bbo = new bbo(this.a, bbp);
                this.d = new CipherInputStream(bbo, instance);
                bbo.a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
