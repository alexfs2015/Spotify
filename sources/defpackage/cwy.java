package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzbah;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cwy reason: default package */
public final class cwy {
    private static final Logger a = Logger.getLogger(cwy.class.getName());
    private static final ConcurrentMap<String, cwq> b = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> c = new ConcurrentHashMap();
    private static final ConcurrentMap<String, cwk> d = new ConcurrentHashMap();

    public static <P> zzaxi a(czv czv) {
        cwq b2 = b(czv.zzdks);
        if (((Boolean) c.get(czv.zzdks)).booleanValue()) {
            return b2.c(czv.zzdkt);
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(czv.zzdks);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public static <P> cwk<P> a(String str) {
        String str2;
        String str3;
        if (str != null) {
            cwk<P> cwk = (cwk) d.get(str.toLowerCase());
            if (cwk != null) {
                return cwk;
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

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <P> defpackage.cww<P> a(defpackage.cwr r9) {
        /*
            czz r0 = r9.a
            defpackage.cwz.b(r0)
            cww r0 = new cww
            r0.<init>()
            czz r1 = r9.a
            ddu<czz$b> r1 = r1.zzdls
            java.util.Iterator r1 = r1.iterator()
        L_0x0012:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c6
            java.lang.Object r2 = r1.next()
            czz$b r2 = (defpackage.czz.b) r2
            com.google.android.gms.internal.ads.zzaxl r3 = r2.b()
            com.google.android.gms.internal.ads.zzaxl r4 = com.google.android.gms.internal.ads.zzaxl.ENABLED
            if (r3 != r4) goto L_0x0012
            com.google.android.gms.internal.ads.zzaxi r3 = r2.a()
            java.lang.String r3 = r3.zzdks
            com.google.android.gms.internal.ads.zzaxi r4 = r2.a()
            com.google.android.gms.internal.ads.zzbah r4 = r4.zzdkt
            java.lang.Object r3 = a(r3, r4)
            cwx r4 = new cwx
            int[] r5 = defpackage.cwn.a
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
            byte[] r5 = defpackage.cwm.a
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
            java.nio.charset.Charset r7 = defpackage.cww.a
            r5.<init>(r6, r7)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<cwx<P>>> r6 = r0.b
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.Object r3 = r6.put(r5, r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x00ba
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.addAll(r3)
            r6.add(r4)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<cwx<P>>> r3 = r0.b
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            r3.put(r5, r6)
        L_0x00ba:
            int r2 = r2.zzdlw
            czz r3 = r9.a
            int r3 = r3.zzdlr
            if (r2 != r3) goto L_0x0012
            r0.c = r4
            goto L_0x0012
        L_0x00c6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwy.a(cwr):cww");
    }

    public static <P> deq a(String str, deq deq) {
        cwq b2 = b(str);
        if (((Boolean) c.get(str)).booleanValue()) {
            return b2.b(deq);
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

    public static synchronized <P> void a(String str, cwk<P> cwk) {
        synchronized (cwy.class) {
            if (d.containsKey(str.toLowerCase())) {
                if (!cwk.getClass().equals(((cwk) d.get(str.toLowerCase())).getClass())) {
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
            d.put(str.toLowerCase(), cwk);
        }
    }

    public static <P> void a(String str, cwq<P> cwq) {
        a(str, cwq, true);
    }

    public static synchronized <P> void a(String str, cwq<P> cwq, boolean z) {
        synchronized (cwy.class) {
            if (cwq != null) {
                if (b.containsKey(str)) {
                    cwq b2 = b(str);
                    boolean booleanValue = ((Boolean) c.get(str)).booleanValue();
                    if (!cwq.getClass().equals(b2.getClass()) || (!booleanValue && z)) {
                        Logger logger = a;
                        Level level = Level.WARNING;
                        String str2 = "com.google.crypto.tink.Registry";
                        String str3 = "registerKeyManager";
                        String str4 = "Attempted overwrite of a registered key manager for key type ";
                        String valueOf = String.valueOf(str);
                        logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, b2.getClass().getName(), cwq.getClass().getName()}));
                    }
                }
                b.put(str, cwq);
                c.put(str, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    private static <P> cwq<P> b(String str) {
        cwq<P> cwq = (cwq) b.get(str);
        if (cwq != null) {
            return cwq;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }

    public static <P> deq b(czv czv) {
        cwq b2 = b(czv.zzdks);
        if (((Boolean) c.get(czv.zzdks)).booleanValue()) {
            return b2.b(czv.zzdkt);
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(czv.zzdks);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public static <P> P b(String str, deq deq) {
        return b(str).a(deq);
    }
}
