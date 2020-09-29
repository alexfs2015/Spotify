package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cxf reason: default package */
final class cxf implements cwq<cwi> {
    cxf() {
    }

    private static cwi d(zzbah zzbah) {
        String str = "expected AesGcmKey proto";
        try {
            cyq a = cyq.a(zzbah);
            if (a instanceof cyq) {
                cyq cyq = a;
                dbx.b(cyq.zzdih);
                dbx.a(cyq.zzdip.a());
                return new dar(cyq.zzdip.b());
            }
            throw new GeneralSecurityException(str);
        } catch (zzbbu unused) {
            throw new GeneralSecurityException(str);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof cyq) {
            cyq cyq = (cyq) deq;
            dbx.b(cyq.zzdih);
            dbx.a(cyq.zzdip.a());
            return new dar(cyq.zzdip.b());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    public final deq b(zzbah zzbah) {
        try {
            return b((deq) cys.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    public final deq b(deq deq) {
        if (deq instanceof cys) {
            cys cys = (cys) deq;
            dbx.a(cys.zzdir);
            return cyq.a().a(zzbah.a(dbs.a(cys.zzdir))).a().e();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.AesGcmKey").a(((cyq) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }
}
