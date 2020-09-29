package defpackage;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;

/* renamed from: cwv reason: default package */
public final class cwv {
    @Deprecated
    public static final cwr a(byte[] bArr) {
        try {
            czz a = czz.a(bArr);
            for (b bVar : a.zzdls) {
                if (bVar.a().a() == zzb.UNKNOWN_KEYMATERIAL || bVar.a().a() == zzb.SYMMETRIC || bVar.a().a() == zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            if (a != null && a.a() > 0) {
                return new cwr(a);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (zzbbu unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
