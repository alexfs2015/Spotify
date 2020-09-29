package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cwo reason: default package */
final class cwo implements cvz<cvr> {
    cwo() {
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        try {
            return b((ddz) cyb.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.AesGcmKey").a(((cxz) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }

    private static cvr d(zzbah zzbah) {
        String str = "expected AesGcmKey proto";
        try {
            cxz a = cxz.a(zzbah);
            if (a instanceof cxz) {
                cxz cxz = a;
                dbg.b(cxz.zzdih);
                dbg.a(cxz.zzdip.a());
                return new daa(cxz.zzdip.b());
            }
            throw new GeneralSecurityException(str);
        } catch (zzbbu unused) {
            throw new GeneralSecurityException(str);
        }
    }

    public final ddz b(ddz ddz) {
        if (ddz instanceof cyb) {
            cyb cyb = (cyb) ddz;
            dbg.a(cyb.zzdir);
            return cxz.a().a(zzbah.a(dbb.a(cyb.zzdir))).a().e();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof cxz) {
            cxz cxz = (cxz) ddz;
            dbg.b(cxz.zzdih);
            dbg.a(cxz.zzdip.a());
            return new daa(cxz.zzdip.b());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }
}
