package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cxh reason: default package */
final class cxh implements cwq<cwi> {
    cxh() {
    }

    private static cwi c(deq deq) {
        if (deq instanceof dad) {
            dad dad = (dad) deq;
            dbx.b(dad.zzdih);
            return cwt.a(dad.a().zzdmd).b();
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    private static cwi d(zzbah zzbah) {
        try {
            return c((deq) dad.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        return c(deq);
    }

    public final deq b(zzbah zzbah) {
        try {
            return b((deq) daf.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    public final deq b(deq deq) {
        if (deq instanceof daf) {
            return dad.b().a((daf) deq).a().e();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.KmsAeadKey").a(((dad) b(zzbah)).f()).a(zzb.REMOTE).e();
    }
}
