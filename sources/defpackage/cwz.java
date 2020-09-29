package defpackage;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzayd;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: cwz reason: default package */
final class cwz {
    static {
        Charset.forName("UTF-8");
    }

    public static dab a(czz czz) {
        a a = dab.a().a(czz.zzdlr);
        for (b bVar : czz.zzdls) {
            a.a((b) b.a().a(bVar.a().zzdks).a(bVar.b()).a(bVar.c()).a(bVar.zzdlw).e());
        }
        return (dab) a.e();
    }

    public static void b(czz czz) {
        if (czz.a() != 0) {
            int i = czz.zzdlr;
            boolean z = false;
            boolean z2 = true;
            for (b bVar : czz.zzdls) {
                if (!(bVar.zzdlu != null)) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(bVar.zzdlw)}));
                } else if (bVar.c() == zzayd.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(bVar.zzdlw)}));
                } else if (bVar.b() != zzaxl.UNKNOWN_STATUS) {
                    if (bVar.b() == zzaxl.ENABLED && bVar.zzdlw == i) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (bVar.a().a() != zzb.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(bVar.zzdlw)}));
                }
            }
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
