package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cwn reason: default package */
final class cwn implements cvz<cvr> {
    cwn() {
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        try {
            return b((ddz) cxv.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.AesEaxKey").a(((cxs) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }

    private static cvr d(zzbah zzbah) {
        try {
            cxs a = cxs.a(zzbah);
            if (a instanceof cxs) {
                cxs cxs = a;
                dbg.b(cxs.zzdih);
                dbg.a(cxs.zzdip.a());
                if (cxs.a().zzdit != 12) {
                    if (cxs.a().zzdit != 16) {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
                return new czz(cxs.zzdip.b(), cxs.a().zzdit);
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    public final ddz b(ddz ddz) {
        if (ddz instanceof cxv) {
            cxv cxv = (cxv) ddz;
            dbg.a(cxv.zzdir);
            if (cxv.a().zzdit == 12 || cxv.a().zzdit == 16) {
                return cxs.b().a(zzbah.a(dbb.a(cxv.zzdir))).a(cxv.a()).a().e();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof cxs) {
            cxs cxs = (cxs) ddz;
            dbg.b(cxs.zzdih);
            dbg.a(cxs.zzdip.a());
            if (cxs.a().zzdit == 12 || cxs.a().zzdit == 16) {
                return new czz(cxs.zzdip.b(), cxs.a().zzdit);
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }
}
