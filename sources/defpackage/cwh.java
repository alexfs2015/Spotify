package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzbah;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cwh reason: default package */
public final class cwh {
    private static final Logger a = Logger.getLogger(cwh.class.getName());
    private static final ConcurrentMap<String, cvz> b = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> c = new ConcurrentHashMap();
    private static final ConcurrentMap<String, cvt> d = new ConcurrentHashMap();

    public static <P> cvt<P> a(String str) {
        String str2;
        String str3;
        if (str != null) {
            cvt<P> cvt = (cvt) d.get(str.toLowerCase());
            if (cvt != null) {
                return cvt;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.init().";
            } else {
                if (str.toLowerCase().startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.init().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static <P> ddz a(String str, ddz ddz) {
        cvz b2 = b(str);
        if (((Boolean) c.get(str)).booleanValue()) {
            return b2.b(ddz);
        }
        String str2 = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    private static <P> P a(String str, zzbah zzbah) {
        return b(str).a(zzbah);
    }

    public static <P> P a(String str, byte[] bArr) {
        return a(str, zzbah.a(bArr));
    }

    public static synchronized <P> void a(String str, cvt<P> cvt) {
        synchronized (cwh.class) {
            if (d.containsKey(str.toLowerCase())) {
                if (!cvt.getClass().equals(((cvt) d.get(str.toLowerCase())).getClass())) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "addCatalogue";
                    String str4 = "Attempted overwrite of a catalogueName catalogue for name ";
                    String valueOf = String.valueOf(str);
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                    sb.append("catalogue for name ");
                    sb.append(str);
                    sb.append(" has been already registered");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            d.put(str.toLowerCase(), cvt);
        }
    }

    public static <P> void a(String str, cvz<P> cvz) {
        a(str, cvz, true);
    }

    public static synchronized <P> void a(String str, cvz<P> cvz, boolean z) {
        synchronized (cwh.class) {
            if (cvz != null) {
                if (b.containsKey(str)) {
                    cvz b2 = b(str);
                    boolean booleanValue = ((Boolean) c.get(str)).booleanValue();
                    if (!cvz.getClass().equals(b2.getClass()) || (!booleanValue && z)) {
                        Logger logger = a;
                        Level level = Level.WARNING;
                        String str2 = "com.google.crypto.tink.Registry";
                        String str3 = "registerKeyManager";
                        String str4 = "Attempted overwrite of a registered key manager for key type ";
                        String valueOf = String.valueOf(str);
                        logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, b2.getClass().getName(), cvz.getClass().getName()}));
                    }
                }
                b.put(str, cvz);
                c.put(str, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    private static <P> cvz<P> b(String str) {
        cvz<P> cvz = (cvz) b.get(str);
        if (cvz != null) {
            return cvz;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }

    public static <P> P b(String str, ddz ddz) {
        return b(str).a(ddz);
    }

    public static <P> zzaxi a(cze cze) {
        cvz b2 = b(cze.zzdks);
        if (((Boolean) c.get(cze.zzdks)).booleanValue()) {
            return b2.c(cze.zzdkt);
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(cze.zzdks);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public static <P> ddz b(cze cze) {
        cvz b2 = b(cze.zzdks);
        if (((Boolean) c.get(cze.zzdks)).booleanValue()) {
            return b2.b(cze.zzdkt);
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(cze.zzdks);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <P> defpackage.cwf<P> a(defpackage.cwa r9) {
        /*
            czi r0 = r9.a
            defpackage.cwi.b(r0)
            cwf r0 = new cwf
            r0.<init>()
            czi r1 = r9.a
            ddd<czi$b> r1 = r1.zzdls
            java.util.Iterator r1 = r1.iterator()
        L_0x0012:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c6
            java.lang.Object r2 = r1.next()
            czi$b r2 = (defpackage.czi.b) r2
            com.google.android.gms.internal.ads.zzaxl r3 = r2.b()
            com.google.android.gms.internal.ads.zzaxl r4 = com.google.android.gms.internal.ads.zzaxl.ENABLED
            if (r3 != r4) goto L_0x0012
            com.google.android.gms.internal.ads.zzaxi r3 = r2.a()
            java.lang.String r3 = r3.zzdks
            com.google.android.gms.internal.ads.zzaxi r4 = r2.a()
            com.google.android.gms.internal.ads.zzbah r4 = r4.zzdkt
            java.lang.Object r3 = a(r3, r4)
            cwg r4 = new cwg
            int[] r5 = defpackage.cvw.a
            com.google.android.gms.internal.ads.zzayd r6 = r2.c()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 5
            r7 = 1
            if (r5 == r7) goto L_0x0067
            r8 = 2
            if (r5 == r8) goto L_0x0067
            r8 = 3
            if (r5 == r8) goto L_0x005c
            r6 = 4
            if (r5 != r6) goto L_0x0054
            byte[] r5 = defpackage.cvv.a
            goto L_0x007a
        L_0x0054:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown output prefix type"
            r9.<init>(r0)
            throw r9
        L_0x005c:
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteBuffer r5 = r5.put(r7)
            int r6 = r2.zzdlw
            goto L_0x0072
        L_0x0067:
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r6)
            r6 = 0
            java.nio.ByteBuffer r5 = r5.put(r6)
            int r6 = r2.zzdlw
        L_0x0072:
            java.nio.ByteBuffer r5 = r5.putInt(r6)
            byte[] r5 = r5.array()
        L_0x007a:
            com.google.android.gms.internal.ads.zzaxl r6 = r2.b()
            com.google.android.gms.internal.ads.zzayd r7 = r2.c()
            r4.<init>(r3, r5, r6, r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r4)
            java.lang.String r5 = new java.lang.String
            byte[] r6 = r4.a()
            java.nio.charset.Charset r7 = defpackage.cwf.a
            r5.<init>(r6, r7)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<cwg<P>>> r6 = r0.b
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.Object r3 = r6.put(r5, r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x00ba
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.addAll(r3)
            r6.add(r4)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<cwg<P>>> r3 = r0.b
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            r3.put(r5, r6)
        L_0x00ba:
            int r2 = r2.zzdlw
            czi r3 = r9.a
            int r3 = r3.zzdlr
            if (r2 != r3) goto L_0x0012
            r0.c = r4
            goto L_0x0012
        L_0x00c6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwh.a(cwa):cwf");
    }
}
