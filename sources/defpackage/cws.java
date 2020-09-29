package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cws reason: default package */
final class cws implements cvz<cvr> {
    cws() {
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        try {
            return b((ddz) czt.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    public final ddz b(ddz ddz) {
        if (ddz instanceof czt) {
            return czq.b().a((czt) ddz).a().e();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").a(((czq) b(zzbah)).f()).a(zzb.REMOTE).e();
    }

    private static cvr d(zzbah zzbah) {
        try {
            czq a = czq.a(zzbah);
            if (a instanceof czq) {
                czq czq = a;
                dbg.b(czq.zzdih);
                return new cwr(czq.a().a(), cwc.a(czq.a().zzdmh).b());
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof czq) {
            czq czq = (czq) ddz;
            dbg.b(czq.zzdih);
            return new cwr(czq.a().a(), cwc.a(czq.a().zzdmh).b());
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }
}
