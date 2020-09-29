package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cxj reason: default package */
final class cxj implements cwq<cwi> {
    cxj() {
    }

    private static cwi d(zzbah zzbah) {
        try {
            dah a = dah.a(zzbah);
            if (a instanceof dah) {
                dah dah = a;
                dbx.b(dah.zzdih);
                return new cxi(dah.a().a(), cwt.a(dah.a().zzdmh).b());
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof dah) {
            dah dah = (dah) deq;
            dbx.b(dah.zzdih);
            return new cxi(dah.a().a(), cwt.a(dah.a().zzdmh).b());
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }

    public final deq b(zzbah zzbah) {
        try {
            return b((deq) dak.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    public final deq b(deq deq) {
        if (deq instanceof dak) {
            return dah.b().a((dak) deq).a().e();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").a(((dah) b(zzbah)).f()).a(zzb.REMOTE).e();
    }
}
