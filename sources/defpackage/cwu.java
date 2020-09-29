package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: cwu reason: default package */
final class cwu implements cvz<cvx> {
    cwu() {
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        try {
            return b((ddz) cyi.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    public final ddz b(ddz ddz) {
        if (ddz instanceof cyi) {
            cyi cyi = (cyi) ddz;
            cxb.a(cyi.a());
            KeyPair a = dak.a(dak.a(cxb.a(cyi.a().a().a())));
            ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
            ECPoint w = eCPublicKey.getW();
            return cym.b().a().a((cyo) cyo.b().a().a(cyi.a()).a(zzbah.a(w.getAffineX().toByteArray())).b(zzbah.a(w.getAffineY().toByteArray())).e()).a(zzbah.a(eCPrivateKey.getS().toByteArray())).e();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").a(((cym) b(zzbah)).f()).a(zzb.ASYMMETRIC_PRIVATE).e();
    }

    private static cvx d(zzbah zzbah) {
        try {
            cym a = cym.a(zzbah);
            if (a instanceof cym) {
                cym cym = a;
                dbg.b(cym.zzdih);
                cxb.a(cym.a().a());
                cyk a2 = cym.a().a();
                cyq a3 = a2.a();
                zzayv a4 = cxb.a(a3.a());
                byte[] b = cym.zzdip.b();
                daf daf = new daf((ECPrivateKey) ((KeyFactory) dan.e.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, b), dak.a(a4))), a3.zzdjw.b(), cxb.a(a3.b()), cxb.a(a2.c()), new cxd(a2.b().a()));
                return daf;
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof cym) {
            cym cym = (cym) ddz;
            dbg.b(cym.zzdih);
            cxb.a(cym.a().a());
            cyk a = cym.a().a();
            cyq a2 = a.a();
            zzayv a3 = cxb.a(a2.a());
            byte[] b = cym.zzdip.b();
            daf daf = new daf((ECPrivateKey) ((KeyFactory) dan.e.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, b), dak.a(a3))), a2.zzdjw.b(), cxb.a(a2.b()), cxb.a(a.c()), new cxd(a.b().a()));
            return daf;
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }
}
