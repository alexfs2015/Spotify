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

/* renamed from: aze reason: default package */
final class aze implements bce {
    private final bce a;
    private final byte[] b;
    private final byte[] c;
    private CipherInputStream d;

    public aze(bce bce, byte[] bArr, byte[] bArr2) {
        this.a = bce;
        this.b = bArr;
        this.c = bArr2;
    }

    public final int a(byte[] bArr, int i, int i2) {
        bdl.a(this.d);
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    public final long a(bcg bcg) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                bcf bcf = new bcf(this.a, bcg);
                this.d = new CipherInputStream(bcf, instance);
                bcf.a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final Uri a() {
        return this.a.a();
    }

    public final void a(bcu bcu) {
        this.a.a(bcu);
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
}
