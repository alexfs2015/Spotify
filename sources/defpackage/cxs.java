package defpackage;

import com.google.android.gms.internal.ads.zzawk;
import com.google.android.gms.internal.ads.zzawy;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzayw;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: cxs reason: default package */
final class cxs {
    public static zzayv a(zzawy zzawy) {
        int i = cxt.b[zzawy.ordinal()];
        if (i == 1) {
            return zzayv.NIST_P256;
        }
        if (i == 2) {
            return zzayv.NIST_P384;
        }
        if (i == 3) {
            return zzayv.NIST_P521;
        }
        String valueOf = String.valueOf(zzawy);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static zzayw a(zzawk zzawk) {
        int i = cxt.c[zzawk.ordinal()];
        if (i == 1) {
            return zzayw.UNCOMPRESSED;
        }
        if (i == 2) {
            return zzayw.COMPRESSED;
        }
        String valueOf = String.valueOf(zzawk);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String a(zzaxa zzaxa) {
        int i = cxt.a[zzaxa.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzaxa);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void a(czb czb) {
        dbb.a(a(czb.a().a()));
        a(czb.a().b());
        if (czb.c() != zzawk.UNKNOWN_FORMAT) {
            cwy.a(czb.b().a());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
