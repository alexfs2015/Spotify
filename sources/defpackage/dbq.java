package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: dbq reason: default package */
public final class dbq implements cwu {
    private Mac a;
    private final int b;
    private final String c;
    private final Key d;

    public dbq(String str, Key key, int i) {
        if (i >= 10) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c2 = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c2 = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c2 = 0;
            }
            String str2 = "tag size too big";
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        String str3 = "unknown Hmac algorithm: ";
                        String valueOf = String.valueOf(str);
                        throw new NoSuchAlgorithmException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    } else if (i > 64) {
                        throw new InvalidAlgorithmParameterException(str2);
                    }
                } else if (i > 32) {
                    throw new InvalidAlgorithmParameterException(str2);
                }
            } else if (i > 20) {
                throw new InvalidAlgorithmParameterException(str2);
            }
            this.c = str;
            this.b = i;
            this.d = key;
            this.a = (Mac) dbe.b.a(str);
            this.a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final byte[] a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (Mac) dbe.b.a(this.c);
            mac.init(this.d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.b);
        return bArr2;
    }
}
