package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cwq reason: default package */
final class cwq implements cvz<cvr> {
    cwq() {
    }

    private static cvr d(zzbah zzbah) {
        try {
            return c((ddz) czm.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(ddz ddz) {
        return c(ddz);
    }

    public final ddz b(zzbah zzbah) {
        try {
            return b((ddz) czo.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    public final ddz b(ddz ddz) {
        if (ddz instanceof czo) {
            return czm.b().a((czo) ddz).a().e();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.KmsAeadKey").a(((czm) b(zzbah)).f()).a(zzb.REMOTE).e();
    }

    private static cvr c(ddz ddz) {
        if (ddz instanceof czm) {
            czm czm = (czm) ddz;
            dbg.b(czm.zzdih);
            return cwc.a(czm.a().zzdmd).b();
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }
}
