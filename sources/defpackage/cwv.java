package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cwv reason: default package */
final class cwv implements cvz<cvy> {
    cwv() {
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final ddz b(ddz ddz) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final zzaxi c(zzbah zzbah) {
        throw new GeneralSecurityException("Not implemented.");
    }

    private static cvy d(zzbah zzbah) {
        try {
            cyo a = cyo.a(zzbah);
            if (a instanceof cyo) {
                cyo cyo = a;
                dbg.b(cyo.zzdih);
                cxb.a(cyo.a());
                cyk a2 = cyo.a();
                cyq a3 = a2.a();
                dag dag = new dag(dak.a(cxb.a(a3.a()), cyo.zzdjr.b(), cyo.zzdjs.b()), a3.zzdjw.b(), cxb.a(a3.b()), cxb.a(a2.c()), new cxd(a2.b().a()));
                return dag;
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof cyo) {
            cyo cyo = (cyo) ddz;
            dbg.b(cyo.zzdih);
            cxb.a(cyo.a());
            cyk a = cyo.a();
            cyq a2 = a.a();
            dag dag = new dag(dak.a(cxb.a(a2.a()), cyo.zzdjr.b(), cyo.zzdjs.b()), a2.zzdjw.b(), cxb.a(a2.b()), cxb.a(a.c()), new cxd(a.b().a()));
            return dag;
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }
}
