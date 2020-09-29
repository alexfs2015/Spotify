package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: cwl reason: default package */
class cwl implements cvz<cvr> {
    static {
        Logger.getLogger(cwl.class.getName());
    }

    cwl() {
        cwh.a("type.googleapis.com/google.crypto.tink.AesCtrKey", (cvz<P>) new cwm<P>());
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        try {
            return b((ddz) cxk.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    public final ddz b(ddz ddz) {
        if (ddz instanceof cxk) {
            cxk cxk = (cxk) ddz;
            cxm cxm = (cxm) cwh.a("type.googleapis.com/google.crypto.tink.AesCtrKey", (ddz) cxk.a());
            return cxi.c().a(cxm).a((cyv) cwh.a("type.googleapis.com/google.crypto.tink.HmacKey", (ddz) cxk.b())).a(0).e();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").a(((cxi) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }

    private static cvr d(zzbah zzbah) {
        try {
            cxi a = cxi.a(zzbah);
            if (a instanceof cxi) {
                cxi cxi = a;
                dbg.b(cxi.zzdih);
                return new dam((day) cwh.b("type.googleapis.com/google.crypto.tink.AesCtrKey", cxi.a()), (cwd) cwh.b("type.googleapis.com/google.crypto.tink.HmacKey", cxi.b()), cxi.b().a().zzdkq);
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof cxi) {
            cxi cxi = (cxi) ddz;
            dbg.b(cxi.zzdih);
            return new dam((day) cwh.b("type.googleapis.com/google.crypto.tink.AesCtrKey", cxi.a()), (cwd) cwh.b("type.googleapis.com/google.crypto.tink.HmacKey", cxi.b()), cxi.b().a().zzdkq);
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }
}
