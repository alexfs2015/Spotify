package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: wlm reason: default package */
public final class wlm {
    static final Comparator<String> a = new Comparator<String>() {
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[PHI: r2 
          PHI: (r2v2 int) = (r2v1 int), (r2v0 int), (r2v0 int) binds: [B:12:0x0034, B:10:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L_0x0011:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L_0x0026
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L_0x0023
                if (r4 >= r5) goto L_0x0022
                goto L_0x0035
            L_0x0022:
                return r3
            L_0x0023:
                int r1 = r1 + 1
                goto L_0x0011
            L_0x0026:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L_0x0034
                if (r7 >= r8) goto L_0x0033
                goto L_0x0035
            L_0x0033:
                return r3
            L_0x0034:
                r2 = 0
            L_0x0035:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wlm.AnonymousClass1.compare(java.lang.Object, java.lang.Object):int");
        }
    };
    public static final wlm b = b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final wlm c = b("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final wlm d = b("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final wlm e = b("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final wlm f = b("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final wlm g = b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final wlm h = b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final wlm i = b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final wlm j = b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final wlm k = b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final wlm l = b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final wlm m = b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final wlm n = b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final wlm o = b("TLS_AES_128_GCM_SHA256");
    public static final wlm p = b("TLS_AES_256_GCM_SHA384");
    public static final wlm q = b("TLS_CHACHA20_POLY1305_SHA256");
    public static final wlm r = b("TLS_AES_128_CCM_SHA256");
    public static final wlm s = b("TLS_AES_256_CCM_8_SHA256");
    private static final Map<String, wlm> u = new LinkedHashMap();
    final String t;

    static {
        b("SSL_RSA_WITH_NULL_MD5");
        b("SSL_RSA_WITH_NULL_SHA");
        b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b("SSL_RSA_WITH_RC4_128_MD5");
        b("SSL_RSA_WITH_RC4_128_SHA");
        b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_RSA_WITH_DES_CBC_SHA");
        b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b("SSL_DH_anon_WITH_RC4_128_MD5");
        b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DH_anon_WITH_DES_CBC_SHA");
        b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b("TLS_KRB5_WITH_DES_CBC_SHA");
        b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b("TLS_KRB5_WITH_RC4_128_SHA");
        b("TLS_KRB5_WITH_DES_CBC_MD5");
        b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b("TLS_KRB5_WITH_RC4_128_MD5");
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b("TLS_RSA_WITH_NULL_SHA256");
        b("TLS_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_RSA_WITH_AES_256_CBC_SHA256");
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_PSK_WITH_RC4_128_SHA");
        b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b("TLS_PSK_WITH_AES_128_CBC_SHA");
        b("TLS_PSK_WITH_AES_256_CBC_SHA");
        b("TLS_RSA_WITH_SEED_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b("TLS_FALLBACK_SCSV");
        b("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_NULL_SHA");
        b("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_RSA_WITH_NULL_SHA");
        b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_anon_WITH_NULL_SHA");
        b("TLS_ECDH_anon_WITH_RC4_128_SHA");
        b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    }

    public static synchronized wlm a(String str) {
        wlm wlm;
        String str2;
        synchronized (wlm.class) {
            wlm = (wlm) u.get(str);
            if (wlm == null) {
                Map<String, wlm> map = u;
                if (str.startsWith("TLS_")) {
                    StringBuilder sb = new StringBuilder("SSL_");
                    sb.append(str.substring(4));
                    str2 = sb.toString();
                } else if (str.startsWith("SSL_")) {
                    StringBuilder sb2 = new StringBuilder("TLS_");
                    sb2.append(str.substring(4));
                    str2 = sb2.toString();
                } else {
                    str2 = str;
                }
                wlm = (wlm) map.get(str2);
                if (wlm == null) {
                    wlm = new wlm(str);
                }
                u.put(str, wlm);
            }
        }
        return wlm;
    }

    static List<wlm> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a2 : strArr) {
            arrayList.add(a(a2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private wlm(String str) {
        if (str != null) {
            this.t = str;
            return;
        }
        throw new NullPointerException();
    }

    private static wlm b(String str) {
        wlm wlm = new wlm(str);
        u.put(str, wlm);
        return wlm;
    }

    public final String toString() {
        return this.t;
    }
}
