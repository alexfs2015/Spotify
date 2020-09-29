package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: cxc reason: default package */
class cxc implements cwq<cwi> {
    static {
        Logger.getLogger(cxc.class.getName());
    }

    cxc() {
        cwy.a("type.googleapis.com/google.crypto.tink.AesCtrKey", (cwq<P>) new cxd<P>());
    }

    private static cwi d(zzbah zzbah) {
        try {
            cxz a = cxz.a(zzbah);
            if (a instanceof cxz) {
                cxz cxz = a;
                dbx.b(cxz.zzdih);
                return new dbd((dbp) cwy.b("type.googleapis.com/google.crypto.tink.AesCtrKey", cxz.a()), (cwu) cwy.b("type.googleapis.com/google.crypto.tink.HmacKey", cxz.b()), cxz.b().a().zzdkq);
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof cxz) {
            cxz cxz = (cxz) deq;
            dbx.b(cxz.zzdih);
            return new dbd((dbp) cwy.b("type.googleapis.com/google.crypto.tink.AesCtrKey", cxz.a()), (cwu) cwy.b("type.googleapis.com/google.crypto.tink.HmacKey", cxz.b()), cxz.b().a().zzdkq);
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    public final deq b(zzbah zzbah) {
        try {
            return b((deq) cyb.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    public final deq b(deq deq) {
        if (deq instanceof cyb) {
            cyb cyb = (cyb) deq;
            cyd cyd = (cyd) cwy.a("type.googleapis.com/google.crypto.tink.AesCtrKey", (deq) cyb.a());
            return cxz.c().a(cyd).a((czm) cwy.a("type.googleapis.com/google.crypto.tink.HmacKey", (deq) cyb.b())).a(0).e();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").a(((cxz) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }
}
