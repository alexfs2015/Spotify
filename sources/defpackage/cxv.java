package defpackage;

import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cxv reason: default package */
final class cxv implements cwq<cwu> {
    cxv() {
    }

    private static void a(czq czq) {
        if (czq.zzdkq >= 10) {
            int i = cxw.a[czq.a().ordinal()];
            String str = "tag size too big";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (czq.zzdkq > 64) {
                        throw new GeneralSecurityException(str);
                    }
                } else if (czq.zzdkq > 32) {
                    throw new GeneralSecurityException(str);
                }
            } else if (czq.zzdkq > 20) {
                throw new GeneralSecurityException(str);
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    private static cwu d(zzbah zzbah) {
        dbq dbq;
        try {
            czm a = czm.a(zzbah);
            if (a instanceof czm) {
                czm czm = a;
                dbx.b(czm.zzdih);
                if (czm.zzdip.a() >= 16) {
                    a(czm.a());
                    zzaxa a2 = czm.a().a();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(czm.zzdip.b(), "HMAC");
                    int i = czm.a().zzdkq;
                    int i2 = cxw.a[a2.ordinal()];
                    if (i2 == 1) {
                        dbq = new dbq("HMACSHA1", secretKeySpec, i);
                    } else if (i2 == 2) {
                        dbq = new dbq("HMACSHA256", secretKeySpec, i);
                    } else if (i2 == 3) {
                        dbq = new dbq("HMACSHA512", secretKeySpec, i);
                    } else {
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return dbq;
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    public final /* synthetic */ Object a(zzbah zzbah) {
        return d(zzbah);
    }

    public final /* synthetic */ Object a(deq deq) {
        if (deq instanceof czm) {
            czm czm = (czm) deq;
            dbx.b(czm.zzdih);
            if (czm.zzdip.a() >= 16) {
                a(czm.a());
                zzaxa a = czm.a().a();
                SecretKeySpec secretKeySpec = new SecretKeySpec(czm.zzdip.b(), "HMAC");
                int i = czm.a().zzdkq;
                int i2 = cxw.a[a.ordinal()];
                if (i2 == 1) {
                    return new dbq("HMACSHA1", secretKeySpec, i);
                }
                if (i2 == 2) {
                    return new dbq("HMACSHA256", secretKeySpec, i);
                }
                if (i2 == 3) {
                    return new dbq("HMACSHA512", secretKeySpec, i);
                }
                throw new GeneralSecurityException("unknown hash");
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }

    public final deq b(zzbah zzbah) {
        try {
            return b((deq) czo.a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    public final deq b(deq deq) {
        if (deq instanceof czo) {
            czo czo = (czo) deq;
            if (czo.zzdir >= 16) {
                a(czo.a());
                return czm.b().a().a(czo.a()).a(zzbah.a(dbs.a(czo.zzdir))).e();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    public final zzaxi c(zzbah zzbah) {
        return (zzaxi) zzaxi.b().a("type.googleapis.com/google.crypto.tink.HmacKey").a(((czm) b(zzbah)).f()).a(zzb.SYMMETRIC).e();
    }
}
