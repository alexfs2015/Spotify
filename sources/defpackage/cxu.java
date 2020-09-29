package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: cxu reason: default package */
final class cxu implements dav {
    private final String a;
    private final int b;
    private cyq c;
    private cxz d;
    private int e;

    cxu(czv czv) {
        this.a = czv.zzdks;
        String str = "invalid KeyFormat protobuf, expected AesGcmKeyFormat";
        if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                cys a2 = cys.a(czv.zzdkt);
                this.c = (cyq) cwy.b(czv);
                this.b = a2.zzdir;
            } catch (zzbbu e2) {
                throw new GeneralSecurityException(str, e2);
            }
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                cyb a3 = cyb.a(czv.zzdkt);
                this.d = (cxz) cwy.b(czv);
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

    public final int a() {
        return this.b;
    }

    public final cwi a(byte[] bArr) {
        if (bArr.length != this.b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (cwi) cwy.b(this.a, (cyq) ((a) cyq.a().a(this.c)).a(zzbah.a(bArr, 0, this.b)).e());
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
            czm czm = (czm) ((a) czm.b().a(this.d.b())).a(zzbah.a(Arrays.copyOfRange(bArr, this.e, this.b))).e();
            return (cwi) cwy.b(this.a, (cxz) cxz.c().a(this.d.zzdih).a((cyd) ((a) cyd.b().a(this.d.a())).a(zzbah.a(copyOfRange)).e()).a(czm).e());
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
