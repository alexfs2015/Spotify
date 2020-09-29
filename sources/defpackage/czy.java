package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: czy reason: default package */
public final class czy implements day {
    private final SecretKeySpec a;
    private final int b;
    private final int c = ((Cipher) dan.a.a("AES/CTR/NoPadding")).getBlockSize();

    public czy(byte[] bArr, int i) {
        this.a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a2 = dbb.a(i);
            System.arraycopy(a2, 0, bArr2, 0, this.b);
            int length2 = bArr.length;
            int i2 = this.b;
            Cipher cipher = (Cipher) dan.a.a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.c];
            System.arraycopy(a2, 0, bArr3, 0, this.b);
            cipher.init(1, this.a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i3 = Integer.MAX_VALUE - i;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i3);
        throw new GeneralSecurityException(sb.toString());
    }
}
