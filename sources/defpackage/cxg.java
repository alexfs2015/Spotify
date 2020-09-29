package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cxg reason: default package */
final class cxg implements cwq<cwi> {
    cxg() {
    }

    private static cyu a() {
        return (cyu) cyu.a().a().a(zzbah.a(dbs.a(32))).e();
    }

    private static cwi d(zzbah zzbah) {
        try {
            cyu a = cyu.a(zzbah);
            if (a instanceof cyu) {
                cyu cyu = a;
                dbx.b(cyu.zzdih);
                if (cyu.zzdip.a() == 32) {
                    return new dau(cyu.zzdip.b());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof cyu) {
            cyu cyu = (cyu) deq;
            dbx.b(cyu.zzdih);
            if (cyu.zzdip.a() == 32) {
                return new dau(cyu.zzdip.b());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    public final deq b(zzbah zzbah) {
        return a();
    }

    public final deq b(deq deq) {
        return a();
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").a(a().f()).a(zzb.SYMMETRIC).e();
    }
}
