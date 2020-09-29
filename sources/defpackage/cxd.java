package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: cxd reason: default package */
final class cxd implements dae {
    private final String a;
    private final int b;
    private cxz c;
    private cxi d;
    private int e;

    public final int a() {
        return this.b;
    }

    cxd(cze cze) {
        this.a = cze.zzdks;
        String str = "invalid KeyFormat protobuf, expected AesGcmKeyFormat";
        if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                cyb a2 = cyb.a(cze.zzdkt);
                this.c = (cxz) cwh.b(cze);
                this.b = a2.zzdir;
            } catch (zzbbu e2) {
                throw new GeneralSecurityException(str, e2);
            }
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                cxk a3 = cxk.a(cze.zzdkt);
                this.d = (cxi) cwh.b(cze);
                this.e = a3.a().zzdir;
                this.b = this.e + a3.b().zzdir;
            } catch (zzbbu e3) {
                throw new GeneralSecurityException(str, e3);
            }
        } else {
            String str2 = "unsupported AEAD DEM key type: ";
            String valueOf = String.valueOf(this.a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public final cvr a(byte[] bArr) {
        if (bArr.length != this.b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (cvr) cwh.b(this.a, (cxz) ((a) cxz.a().a(this.c)).a(zzbah.a(bArr, 0, this.b)).e());
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
            cyv cyv = (cyv) ((a) cyv.b().a(this.d.b())).a(zzbah.a(Arrays.copyOfRange(bArr, this.e, this.b))).e();
            return (cvr) cwh.b(this.a, (cxi) cxi.c().a(this.d.zzdih).a((cxm) ((a) cxm.b().a(this.d.a())).a(zzbah.a(copyOfRange)).e()).a(cyv).e());
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
