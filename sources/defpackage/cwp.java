package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cwp reason: default package */
final class cwp implements cvz<cvr> {
    cwp() {
    }

    private static cyd a() {
        return (cyd) cyd.a().a().a(zzbah.a(dbb.a(32))).e();
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        return a();
    }

    public final ddz b(ddz ddz) {
        return a();
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").a(a().f()).a(zzb.SYMMETRIC).e();
    }

    private static cvr d(zzbah zzbah) {
        try {
            cyd a = cyd.a(zzbah);
            if (a instanceof cyd) {
                cyd cyd = a;
                dbg.b(cyd.zzdih);
                if (cyd.zzdip.a() == 32) {
                    return new dad(cyd.zzdip.b());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof cyd) {
            cyd cyd = (cyd) ddz;
            dbg.b(cyd.zzdih);
            if (cyd.zzdip.a() == 32) {
                return new dad(cyd.zzdip.b());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }
}
