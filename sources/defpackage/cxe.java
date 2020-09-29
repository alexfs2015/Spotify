package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cxe reason: default package */
final class cxe implements cwq<cwi> {
    cxe() {
    }

    private static cwi d(zzbah zzbah) {
        try {
            cyj a = cyj.a(zzbah);
            if (a instanceof cyj) {
                cyj cyj = a;
                dbx.b(cyj.zzdih);
                dbx.a(cyj.zzdip.a());
                if (cyj.a().zzdit != 12) {
                    if (cyj.a().zzdit != 16) {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
                return new daq(cyj.zzdip.b(), cyj.a().zzdit);
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof cyj) {
            cyj cyj = (cyj) deq;
            dbx.b(cyj.zzdih);
            dbx.a(cyj.zzdip.a());
            if (cyj.a().zzdit == 12 || cyj.a().zzdit == 16) {
                return new daq(cyj.zzdip.b(), cyj.a().zzdit);
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    public final deq b(zzbah zzbah) {
        try {
            return b((deq) cym.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    public final deq b(deq deq) {
        if (deq instanceof cym) {
            cym cym = (cym) deq;
            dbx.a(cym.zzdir);
            if (cym.a().zzdit == 12 || cym.a().zzdit == 16) {
                return cyj.b().a(zzbah.a(dbs.a(cym.zzdir))).a(cym.a()).a().e();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.AesEaxKey").a(((cyj) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }
}
