package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: gaz reason: default package */
public final class gaz implements gay {
    private final hfx a;
    private PublicKey b;
    private final WeakReference<Context> c;

    public gaz(Context context, hfx hfx) {
        this.b = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(R.raw.certificate))).getPublicKey();
        this.c = new WeakReference<>(context);
        this.a = hfx;
    }

    private boolean a(Uri uri, long j) {
        long j2;
        boolean z;
        Logger.c("WebsiteAutologinUtility: Validating Request: %s", uri.toString());
        String queryParameter = uri.getQueryParameter("signature");
        Uri parse = Uri.parse(uri.getQueryParameter("returnUrl"));
        String queryParameter2 = uri.getQueryParameter("signatureExpiry");
        try {
            j2 = Long.parseLong(queryParameter2);
        } catch (NumberFormatException unused) {
            j2 = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(parse);
        sb.append(queryParameter2);
        String sb2 = sb.toString();
        Logger.c("WebsiteAutologinUtility: url encoded signature: %s", queryParameter);
        try {
            byte[] decode = Base64.decode(queryParameter.getBytes(far.c), 0);
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(this.b);
            instance.update(sb2.getBytes(far.c));
            if (instance.verify(decode) && j2 > j) {
                z = true;
                Logger.c("WebsiteAutologinUtility: Autologin Signature isValid: %s", Boolean.valueOf(z));
                return z;
            }
        } catch (NoSuchAlgorithmException e) {
            Logger.e(e, "WebsiteAutologinUtility failed to get a signature", new Object[0]);
        } catch (SignatureException e2) {
            Logger.e(e2, "WebsiteAutologinUtility failed to update/verify a signature", new Object[0]);
        } catch (InvalidKeyException e3) {
            Logger.e(e3, "WebsiteAutologinUtility failed to init verify a signature", new Object[0]);
        } catch (IllegalArgumentException e4) {
            Logger.e(e4, "WebsiteAutologinUtility illegal argument exception", new Object[0]);
        }
        z = false;
        Logger.c("WebsiteAutologinUtility: Autologin Signature isValid: %s", Boolean.valueOf(z));
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.common.base.Optional<java.lang.Long> r6, android.net.Uri r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x001c
            java.lang.String r0 = r7.getScheme()
            java.lang.String r1 = "spotify"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r7.getHost()
            java.lang.String r1 = "autologin"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            java.lang.ref.WeakReference<android.content.Context> r0 = r5.c
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L_0x002b
            return
        L_0x002b:
            boolean r1 = r6.b()
            if (r1 == 0) goto L_0x0086
            java.util.Set r1 = r7.getQueryParameterNames()
            java.lang.String r2 = "returnUrl"
            boolean r3 = r1.contains(r2)
            if (r3 == 0) goto L_0x004e
            java.lang.String r3 = "signature"
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x004e
            java.lang.String r3 = "signatureExpiry"
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x004e
            goto L_0x005e
        L_0x004e:
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "%26"
            java.lang.String r3 = "&"
            java.lang.String r7 = r7.replaceAll(r1, r3)
            android.net.Uri r7 = android.net.Uri.parse(r7)
        L_0x005e:
            java.lang.Object r6 = r6.c()
            java.lang.Long r6 = (java.lang.Long) r6
            long r3 = r6.longValue()
            boolean r6 = r5.a(r7, r3)
            if (r6 != 0) goto L_0x006f
            return
        L_0x006f:
            hfx r6 = r5.a
            java.lang.String r1 = "com.spotify.mobile.android.service.action.URL_OPEN"
            android.content.Intent r6 = r6.a(r0, r1)
            java.lang.String r7 = r7.getQueryParameter(r2)
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.content.Intent r6 = r6.setData(r7)
            r0.startService(r6)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaz.a(com.google.common.base.Optional, android.net.Uri):void");
    }
}
