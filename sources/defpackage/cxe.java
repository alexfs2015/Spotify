package defpackage;

import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cxe reason: default package */
final class cxe implements cvz<cwd> {
    cxe() {
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final ddz b(zzbah zzbah) {
        try {
            return b((ddz) cyx.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.HmacKey").a(((cyv) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }

    private static cwd d(zzbah zzbah) {
        daz daz;
        try {
            cyv a = cyv.a(zzbah);
            if (a instanceof cyv) {
                cyv cyv = a;
                dbg.b(cyv.zzdih);
                if (cyv.zzdip.a() >= 16) {
                    a(cyv.a());
                    zzaxa a2 = cyv.a().a();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(cyv.zzdip.b(), "HMAC");
                    int i = cyv.a().zzdkq;
                    int i2 = cxf.a[a2.ordinal()];
                    if (i2 == 1) {
                        daz = new daz("HMACSHA1", secretKeySpec, i);
                    } else if (i2 == 2) {
                        daz = new daz("HMACSHA256", secretKeySpec, i);
                    } else if (i2 == 3) {
                        daz = new daz("HMACSHA512", secretKeySpec, i);
                    } else {
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return daz;
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    public final ddz b(ddz ddz) {
        if (ddz instanceof cyx) {
            cyx cyx = (cyx) ddz;
            if (cyx.zzdir >= 16) {
                a(cyx.a());
                return cyv.b().a().a(cyx.a()).a(zzbah.a(dbb.a(cyx.zzdir))).e();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    private static void a(cyz cyz) {
        if (cyz.zzdkq >= 10) {
            int i = cxf.a[cyz.a().ordinal()];
            String str = "tag size too big";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (cyz.zzdkq > 64) {
                        throw new GeneralSecurityException(str);
                    }
                } else if (cyz.zzdkq > 32) {
                    throw new GeneralSecurityException(str);
                }
            } else if (cyz.zzdkq > 20) {
                throw new GeneralSecurityException(str);
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final /* synthetic */ Object a(ddz ddz) {
        if (ddz instanceof cyv) {
            cyv cyv = (cyv) ddz;
            dbg.b(cyv.zzdih);
            if (cyv.zzdip.a() >= 16) {
                a(cyv.a());
                zzaxa a = cyv.a().a();
                SecretKeySpec secretKeySpec = new SecretKeySpec(cyv.zzdip.b(), "HMAC");
                int i = cyv.a().zzdkq;
                int i2 = cxf.a[a.ordinal()];
                if (i2 == 1) {
                    return new daz("HMACSHA1", secretKeySpec, i);
                }
                if (i2 == 2) {
                    return new daz("HMACSHA256", secretKeySpec, i);
                }
                if (i2 == 3) {
                    return new daz("HMACSHA512", secretKeySpec, i);
                }
                throw new GeneralSecurityException("unknown hash");
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }
}
