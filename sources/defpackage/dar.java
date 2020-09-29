package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: dar reason: default package */
public final class dar implements cwi {
    private final SecretKey a;

    public dar(byte[] bArr) {
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a2 = dbs.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            Cipher cipher = (Cipher) dbe.a.a("AES/GCM/NoPadding");
            cipher.init(1, this.a, new GCMParameterSpec(128, a2));
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
