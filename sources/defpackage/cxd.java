package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cxd reason: default package */
final class cxd implements cwq<dbp> {
    cxd() {
    }

    private static void a(cyh cyh) {
        if (cyh.zzdit < 12 || cyh.zzdit > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    private static dap d(zzbah zzbah) {
        try {
            cyd a = cyd.a(zzbah);
            if (a instanceof cyd) {
                cyd cyd = a;
                dbx.b(cyd.zzdih);
                dbx.a(cyd.zzdip.a());
                a(cyd.a());
                return new dap(cyd.zzdip.b(), cyd.a().zzdit);
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof cyd) {
            cyd cyd = (cyd) deq;
            dbx.b(cyd.zzdih);
            dbx.a(cyd.zzdip.a());
            a(cyd.a());
            return new dap(cyd.zzdip.b(), cyd.a().zzdit);
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    public final deq b(zzbah zzbah) {
        try {
            return b((deq) cyf.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    public final deq b(deq deq) {
        if (deq instanceof cyf) {
            cyf cyf = (cyf) deq;
            dbx.a(cyf.zzdir);
            a(cyf.a());
            return cyd.b().a(cyf.a()).a(zzbah.a(dbs.a(cyf.zzdir))).a().e();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.AesCtrKey").a(((cyd) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }
}
