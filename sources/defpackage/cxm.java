package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cxm reason: default package */
final class cxm implements cwq<cwp> {
    cxm() {
    }

    private static cwp d(zzbah zzbah) {
        try {
            czf a = czf.a(zzbah);
            if (a instanceof czf) {
                czf czf = a;
                dbx.b(czf.zzdih);
                cxs.a(czf.a());
                czb a2 = czf.a();
                czh a3 = a2.a();
                dax dax = new dax(dbb.a(cxs.a(a3.a()), czf.zzdjr.b(), czf.zzdjs.b()), a3.zzdjw.b(), cxs.a(a3.b()), cxs.a(a2.c()), new cxu(a2.b().a()));
                return dax;
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof czf) {
            czf czf = (czf) deq;
            dbx.b(czf.zzdih);
            cxs.a(czf.a());
            czb a = czf.a();
            czh a2 = a.a();
            dax dax = new dax(dbb.a(cxs.a(a2.a()), czf.zzdjr.b(), czf.zzdjs.b()), a2.zzdjw.b(), cxs.a(a2.b()), cxs.a(a.c()), new cxu(a.b().a()));
            return dax;
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    public final deq b(zzbah zzbah) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final deq b(deq deq) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final zzaxi c(zzbah zzbah) {
        throw new GeneralSecurityException("Not implemented.");
    }
}
