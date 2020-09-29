package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: weu reason: default package */
public final class weu {
    private static final wjw a = wjx.a(weu.class);
    private static final Pattern b = Pattern.compile("^(?:TLS|SSL)_((?:(?!_WITH_).)+)_WITH_(.*)_(.*)$");
    private static final Pattern c = Pattern.compile("^(?:((?:(?:EXP-)?(?:(?:DHE|EDH|ECDH|ECDHE|SRP)-(?:DSS|RSA|ECDSA)|(?:ADH|AECDH|KRB5|PSK|SRP)))|EXP)-)?(.*)-(.*)$");
    private static final Pattern d = Pattern.compile("^(AES)_([0-9]+)_CBC$");
    private static final Pattern e = Pattern.compile("^(AES)_([0-9]+)_(.*)$");
    private static final Pattern f = Pattern.compile("^(AES)([0-9]+)$");
    private static final Pattern g = Pattern.compile("^(AES)([0-9]+)-(.*)$");
    private static final ConcurrentMap<String, String> h = PlatformDependent.j();
    private static final ConcurrentMap<String, Map<String, String>> i = PlatformDependent.j();

    static String a(Iterable<String> iterable) {
        StringBuilder sb = new StringBuilder();
        for (String str : iterable) {
            if (str == null) {
                break;
            }
            String a2 = a(str);
            if (a2 != null) {
                str = a2;
            }
            sb.append(str);
            sb.append(':');
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static String a(String str) {
        String str2 = (String) h.get(str);
        if (str2 != null) {
            return str2;
        }
        return b(str);
    }

    private static String b(String str) {
        String c2 = c(str);
        if (c2 == null) {
            return null;
        }
        h.putIfAbsent(str, c2);
        String substring = str.substring(4);
        HashMap hashMap = new HashMap(4);
        hashMap.put("", substring);
        StringBuilder sb = new StringBuilder("SSL_");
        sb.append(substring);
        hashMap.put("SSL", sb.toString());
        StringBuilder sb2 = new StringBuilder("TLS_");
        sb2.append(substring);
        hashMap.put("TLS", sb2.toString());
        i.put(c2, hashMap);
        a.b("Cipher suite mapping: {} => {}", str, c2);
        return c2;
    }

    private static String c(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String d2 = d(matcher.group(1));
        String e2 = e(matcher.group(2));
        String group = matcher.group(3);
        if (d2.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(e2);
            sb.append('-');
            sb.append(group);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d2);
        sb2.append('-');
        sb2.append(e2);
        sb2.append('-');
        sb2.append(group);
        return sb2.toString();
    }

    private static String d(String str) {
        boolean endsWith = str.endsWith("_EXPORT");
        if (endsWith) {
            str = str.substring(0, str.length() - 7);
        }
        if ("RSA".equals(str)) {
            str = "";
        } else if (str.endsWith("_anon")) {
            StringBuilder sb = new StringBuilder("A");
            sb.append(str.substring(0, str.length() - 5));
            str = sb.toString();
        }
        if (endsWith) {
            if (str.length() == 0) {
                str = "EXP";
            } else {
                StringBuilder sb2 = new StringBuilder("EXP-");
                sb2.append(str);
                str = sb2.toString();
            }
        }
        return str.replace('_', '-');
    }

    private static String e(String str) {
        if (str.startsWith("AES_")) {
            Matcher matcher = d.matcher(str);
            if (matcher.matches()) {
                return matcher.replaceFirst("$1$2");
            }
            Matcher matcher2 = e.matcher(str);
            if (matcher2.matches()) {
                return matcher2.replaceFirst("$1$2-$3");
            }
        }
        if ("3DES_EDE_CBC".equals(str)) {
            return "DES-CBC3";
        }
        if ("RC4_128".equals(str) || "RC4_40".equals(str)) {
            return "RC4";
        }
        if ("DES40_CBC".equals(str) || "DES_CBC_40".equals(str)) {
            return "DES-CBC";
        }
        if ("RC2_CBC_40".equals(str)) {
            return "RC2-CBC";
        }
        return str.replace('_', '-');
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r11, java.lang.String r12) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = i
            java.lang.Object r0 = r0.get(r11)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = ""
            r2 = 95
            if (r0 != 0) goto L_0x0156
            java.util.regex.Pattern r0 = c
            java.util.regex.Matcher r0 = r0.matcher(r11)
            boolean r3 = r0.matches()
            r4 = 4
            r5 = 0
            if (r3 != 0) goto L_0x001f
            r0 = r5
            goto L_0x0108
        L_0x001f:
            r3 = 1
            java.lang.String r6 = r0.group(r3)
            if (r6 != 0) goto L_0x0028
            r6 = r1
            goto L_0x003f
        L_0x0028:
            java.lang.String r7 = "EXP-"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0035
            java.lang.String r6 = r6.substring(r4)
            goto L_0x0040
        L_0x0035:
            java.lang.String r7 = "EXP"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x003f
            r6 = r1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0049
            java.lang.String r6 = "RSA"
            goto L_0x005e
        L_0x0049:
            java.lang.String r7 = "ADH"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0054
            java.lang.String r6 = "DH_anon"
            goto L_0x005e
        L_0x0054:
            java.lang.String r7 = "AECDH"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005e
            java.lang.String r6 = "ECDH_anon"
        L_0x005e:
            r7 = 45
            java.lang.String r6 = r6.replace(r7, r2)
            if (r3 == 0) goto L_0x0077
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "_EXPORT"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
        L_0x0077:
            r8 = 2
            java.lang.String r8 = r0.group(r8)
            java.lang.String r9 = "AES"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x00aa
            java.util.regex.Pattern r9 = f
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.matches()
            if (r10 == 0) goto L_0x0097
            java.lang.String r3 = "$1_$2_CBC"
            java.lang.String r3 = r9.replaceFirst(r3)
            goto L_0x00e9
        L_0x0097:
            java.util.regex.Pattern r9 = g
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.matches()
            if (r10 == 0) goto L_0x00aa
            java.lang.String r3 = "$1_$2_$3"
            java.lang.String r3 = r9.replaceFirst(r3)
            goto L_0x00e9
        L_0x00aa:
            java.lang.String r9 = "DES-CBC3"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x00b5
            java.lang.String r3 = "3DES_EDE_CBC"
            goto L_0x00e9
        L_0x00b5:
            java.lang.String r9 = "RC4"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x00c5
            if (r3 == 0) goto L_0x00c2
            java.lang.String r3 = "RC4_40"
            goto L_0x00e9
        L_0x00c2:
            java.lang.String r3 = "RC4_128"
            goto L_0x00e9
        L_0x00c5:
            java.lang.String r9 = "DES-CBC"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x00d5
            if (r3 == 0) goto L_0x00d2
            java.lang.String r3 = "DES_CBC_40"
            goto L_0x00e9
        L_0x00d2:
            java.lang.String r3 = "DES_CBC"
            goto L_0x00e9
        L_0x00d5:
            java.lang.String r9 = "RC2-CBC"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x00e5
            if (r3 == 0) goto L_0x00e2
            java.lang.String r3 = "RC2_CBC_40"
            goto L_0x00e9
        L_0x00e2:
            java.lang.String r3 = "RC2_CBC"
            goto L_0x00e9
        L_0x00e5:
            java.lang.String r3 = r8.replace(r7, r2)
        L_0x00e9:
            r7 = 3
            java.lang.String r0 = r0.group(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "_WITH_"
            r7.append(r6)
            r7.append(r3)
            r7.append(r2)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
        L_0x0108:
            if (r0 != 0) goto L_0x010c
            r0 = r5
            goto L_0x0156
        L_0x010c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "SSL_"
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "TLS_"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r4)
            r6.put(r1, r0)
            java.lang.String r0 = "SSL"
            r6.put(r0, r3)
            java.lang.String r0 = "TLS"
            r6.put(r0, r5)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = i
            r0.putIfAbsent(r11, r6)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r0 = h
            r0.putIfAbsent(r5, r11)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r0 = h
            r0.putIfAbsent(r3, r11)
            wjw r0 = a
            java.lang.String r4 = "Cipher suite mapping: {} => {}"
            r0.b(r4, r5, r11)
            wjw r0 = a
            r0.b(r4, r3, r11)
            r0 = r6
        L_0x0156:
            java.lang.Object r11 = r0.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x0176
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r12)
            r11.append(r2)
            java.lang.Object r12 = r0.get(r1)
            java.lang.String r12 = (java.lang.String) r12
            r11.append(r12)
            java.lang.String r11 = r11.toString()
        L_0x0176:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.weu.a(java.lang.String, java.lang.String):java.lang.String");
    }

    private weu() {
    }
}
