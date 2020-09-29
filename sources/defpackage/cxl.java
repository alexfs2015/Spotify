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

/* renamed from: cxl reason: default package */
final class cxl implements cwq<cwo> {
    cxl() {
    }

    private static cwo d(zzbah zzbah) {
        try {
            czd a = czd.a(zzbah);
            if (a instanceof czd) {
                czd czd = a;
                dbx.b(czd.zzdih);
                cxs.a(czd.a().a());
                czb a2 = czd.a().a();
                czh a3 = a2.a();
                zzayv a4 = cxs.a(a3.a());
                byte[] b = czd.zzdip.b();
                daw daw = new daw((ECPrivateKey) ((KeyFactory) dbe.e.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, b), dbb.a(a4))), a3.zzdjw.b(), cxs.a(a3.b()), cxs.a(a2.c()), new cxu(a2.b().a()));
                return daw;
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof czd) {
            czd czd = (czd) deq;
            dbx.b(czd.zzdih);
            cxs.a(czd.a().a());
            czb a = czd.a().a();
            czh a2 = a.a();
            zzayv a3 = cxs.a(a2.a());
            byte[] b = czd.zzdip.b();
            daw daw = new daw((ECPrivateKey) ((KeyFactory) dbe.e.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, b), dbb.a(a3))), a2.zzdjw.b(), cxs.a(a2.b()), cxs.a(a.c()), new cxu(a.b().a()));
            return daw;
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }

    public final deq b(zzbah zzbah) {
        try {
            return b((deq) cyz.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    public final deq b(deq deq) {
        if (deq instanceof cyz) {
            cyz cyz = (cyz) deq;
            cxs.a(cyz.a());
            KeyPair a = dbb.a(dbb.a(cxs.a(cyz.a().a().a())));
            ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
            ECPoint w = eCPublicKey.getW();
            return czd.b().a().a((czf) czf.b().a().a(cyz.a()).a(zzbah.a(w.getAffineX().toByteArray())).b(zzbah.a(w.getAffineY().toByteArray())).e()).a(zzbah.a(eCPrivateKey.getS().toByteArray())).e();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").a(((czd) b(zzbah)).f()).a(zzb.ASYMMETRIC_PRIVATE).e();
    }
}
