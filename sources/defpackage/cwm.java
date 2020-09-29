package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cwm reason: default package */
final class cwm implements cvz<day> {
    cwm() {
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        try {
            return b((ddz) cxo.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.AesCtrKey").a(((cxm) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }

    private static czy d(zzbah zzbah) {
        try {
            cxm a = cxm.a(zzbah);
            if (a instanceof cxm) {
                cxm cxm = a;
                dbg.b(cxm.zzdih);
                dbg.a(cxm.zzdip.a());
                a(cxm.a());
                return new czy(cxm.zzdip.b(), cxm.a().zzdit);
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    public final ddz b(ddz ddz) {
        if (ddz instanceof cxo) {
            cxo cxo = (cxo) ddz;
            dbg.a(cxo.zzdir);
            a(cxo.a());
            return cxm.b().a(cxo.a()).a(zzbah.a(dbb.a(cxo.zzdir))).a().e();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    private static void a(cxq cxq) {
        if (cxq.zzdit < 12 || cxq.zzdit > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof cxm) {
            cxm cxm = (cxm) ddz;
            dbg.b(cxm.zzdih);
            dbg.a(cxm.zzdip.a());
            a(cxm.a());
            return new czy(cxm.zzdip.b(), cxm.a().zzdit);
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }
}
