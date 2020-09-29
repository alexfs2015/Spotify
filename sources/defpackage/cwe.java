package defpackage;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cwe reason: default package */
public final class cwe {
    @Deprecated
    public static final cwa a(byte[] bArr) {
        try {
            czi a = czi.a(bArr);
            for (b bVar : a.zzdls) {
                if (bVar.a().a() == zzb.UNKNOWN_KEYMATERIAL || bVar.a().a() == zzb.SYMMETRIC || bVar.a().a() == zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            if (a != null && a.a() > 0) {
                return new cwa(a);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (zzbbu unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
