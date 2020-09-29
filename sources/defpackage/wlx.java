package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wlx reason: default package */
public final class wlx {
    private static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final int c;
    public final List<String> d;
    public final List<String> e;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    /* renamed from: wlx$a */
    public static final class a {
        String a;
        String b;
        String c;
        String d;
        int e = -1;
        final List<String> f = new ArrayList();
        List<String> g;
        String h;

        public a() {
            String str = "";
            this.b = str;
            this.c = str;
            this.f.add(str);
        }

        public final a a(String str) {
            String str2 = "http";
            if (str.equalsIgnoreCase(str2)) {
                this.a = str2;
            } else {
                String str3 = "https";
                if (str.equalsIgnoreCase(str3)) {
                    this.a = str3;
                } else {
                    StringBuilder sb = new StringBuilder("unexpected scheme: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return this;
        }

        public final a b(String str) {
            if (str != null) {
                String e2 = e(str, 0, str.length());
                if (e2 != null) {
                    this.d = e2;
                    return this;
                }
                StringBuilder sb = new StringBuilder("unexpected host: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: 0000 */
        public final int a() {
            int i = this.e;
            return i != -1 ? i : wlx.a(this.a);
        }

        public final a c(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            } else if (str.startsWith("/")) {
                a(str, 0, str.length());
                return this;
            } else {
                StringBuilder sb = new StringBuilder("unexpected encodedPath: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public final a d(String str) {
            List<String> list;
            if (str != null) {
                list = wlx.b(wlx.a(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.g = list;
            return this;
        }

        public final a a(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(wlx.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                List<String> list = this.g;
                if (str2 != null) {
                    str3 = wlx.a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public final a b(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(wlx.a(str, " \"'<>#&=", true, false, true, true));
                List<String> list = this.g;
                if (str2 != null) {
                    str3 = wlx.a(str2, " \"'<>#&=", true, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public final wlx b() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.d != null) {
                return new wlx(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            if (!(this.e == -1 && this.a == null)) {
                int a2 = a();
                String str3 = this.a;
                if (str3 == null || a2 != wlx.a(str3)) {
                    sb.append(':');
                    sb.append(a2);
                }
            }
            wlx.a(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                wlx.b(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        public final a a(wlx wlx, String str) {
            int a2;
            int i;
            wlx wlx2 = wlx;
            String str2 = str;
            int a3 = wmk.a(str2, 0, str.length());
            int b2 = wmk.b(str2, a3, str.length());
            int b3 = b(str2, a3, b2);
            if (b3 != -1) {
                if (str.regionMatches(true, a3, "https:", 0, 6)) {
                    this.a = "https";
                    a3 += 6;
                } else {
                    if (str.regionMatches(true, a3, "http:", 0, 5)) {
                        this.a = "http";
                        a3 += 5;
                    } else {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        sb.append(str2.substring(0, b3));
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (wlx2 != null) {
                this.a = wlx2.a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int c2 = c(str2, a3, b2);
            char c3 = '?';
            char c4 = '#';
            if (c2 >= 2 || wlx2 == null || !wlx2.a.equals(this.a)) {
                int i2 = a3 + c2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = wmk.a(str2, i2, b2, "@/\\?#");
                    char charAt = a2 != b2 ? str2.charAt(a2) : 65535;
                    if (charAt == 65535 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        int i3 = a2;
                        int d2 = d(str2, i2, i3);
                        int i4 = d2 + 1;
                    } else if (charAt == '@') {
                        String str3 = "%40";
                        if (!z) {
                            int a4 = wmk.a(str2, i2, a2, ':');
                            int i5 = a4;
                            String str4 = str3;
                            i = a2;
                            String a5 = wlx.a(str, i2, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.b);
                                sb2.append(str4);
                                sb2.append(a5);
                                a5 = sb2.toString();
                            }
                            this.b = a5;
                            if (i5 != i) {
                                this.c = wlx.a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            String str5 = str3;
                            i = a2;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.c);
                            sb3.append(str5);
                            sb3.append(wlx.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.c = sb3.toString();
                        }
                        i2 = i + 1;
                        c3 = '?';
                        c4 = '#';
                    }
                }
                int i32 = a2;
                int d22 = d(str2, i2, i32);
                int i42 = d22 + 1;
                if (i42 < i32) {
                    this.d = e(str2, i2, d22);
                    this.e = f(str2, i42, i32);
                    if (this.e == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        sb4.append(str2.substring(i42, i32));
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    this.d = e(str2, i2, d22);
                    this.e = wlx.a(this.a);
                }
                if (this.d != null) {
                    a3 = i32;
                } else {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    sb5.append(str2.substring(i2, d22));
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                this.b = wlx.d();
                this.c = wlx.e();
                this.d = wlx2.b;
                this.e = wlx2.c;
                this.f.clear();
                this.f.addAll(wlx.g());
                if (a3 == b2 || str2.charAt(a3) == '#') {
                    d(wlx.h());
                }
            }
            int a6 = wmk.a(str2, a3, b2, "?#");
            a(str2, a3, a6);
            if (a6 < b2 && str2.charAt(a6) == '?') {
                int a7 = wmk.a(str2, a6, b2, '#');
                this.g = wlx.b(wlx.a(str, a6 + 1, a7, " \"'<>#", true, false, true, true, null));
                a6 = a7;
            }
            if (a6 < b2 && str2.charAt(a6) == '#') {
                this.h = wlx.a(str, 1 + a6, b2, "", true, false, false, false, null);
            }
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6 A[SYNTHETIC] */
        private void a(java.lang.String r18, int r19, int r20) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                r2 = r20
                if (r1 != r2) goto L_0x0009
                return
            L_0x0009:
                char r3 = r18.charAt(r19)
                r4 = 47
                java.lang.String r5 = ""
                r6 = 1
                if (r3 == r4) goto L_0x0024
                r4 = 92
                if (r3 != r4) goto L_0x0019
                goto L_0x0024
            L_0x0019:
                java.util.List<java.lang.String> r3 = r0.f
                int r4 = r3.size()
                int r4 = r4 - r6
                r3.set(r4, r5)
                goto L_0x0030
            L_0x0024:
                java.util.List<java.lang.String> r3 = r0.f
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.f
                r3.add(r5)
                goto L_0x00e2
            L_0x0030:
                r8 = r1
                if (r8 >= r2) goto L_0x00e6
                java.lang.String r1 = "/\\"
                r3 = r18
                int r1 = defpackage.wmk.a(r3, r8, r2, r1)
                r4 = 0
                if (r1 >= r2) goto L_0x0041
                r16 = 1
                goto L_0x0043
            L_0x0041:
                r16 = 0
            L_0x0043:
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = 1
                r15 = 0
                java.lang.String r10 = " \"<>^`{}|/\\?#"
                r7 = r18
                r9 = r1
                java.lang.String r7 = defpackage.wlx.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.String r8 = "."
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L_0x0064
                java.lang.String r8 = "%2e"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0062
                goto L_0x0064
            L_0x0062:
                r8 = 0
                goto L_0x0065
            L_0x0064:
                r8 = 1
            L_0x0065:
                if (r8 != 0) goto L_0x00e0
                java.lang.String r8 = ".."
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L_0x0087
                java.lang.String r8 = "%2e."
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 != 0) goto L_0x0087
                java.lang.String r8 = ".%2e"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 != 0) goto L_0x0087
                java.lang.String r8 = "%2e%2e"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0088
            L_0x0087:
                r4 = 1
            L_0x0088:
                if (r4 == 0) goto L_0x00b6
                java.util.List<java.lang.String> r4 = r0.f
                int r7 = r4.size()
                int r7 = r7 - r6
                java.lang.Object r4 = r4.remove(r7)
                java.lang.String r4 = (java.lang.String) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x00b0
                java.util.List<java.lang.String> r4 = r0.f
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L_0x00b0
                java.util.List<java.lang.String> r4 = r0.f
                int r7 = r4.size()
                int r7 = r7 - r6
                r4.set(r7, r5)
                goto L_0x00e0
            L_0x00b0:
                java.util.List<java.lang.String> r4 = r0.f
                r4.add(r5)
                goto L_0x00e0
            L_0x00b6:
                java.util.List<java.lang.String> r4 = r0.f
                int r8 = r4.size()
                int r8 = r8 - r6
                java.lang.Object r4 = r4.get(r8)
                java.lang.String r4 = (java.lang.String) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x00d4
                java.util.List<java.lang.String> r4 = r0.f
                int r8 = r4.size()
                int r8 = r8 - r6
                r4.set(r8, r7)
                goto L_0x00d9
            L_0x00d4:
                java.util.List<java.lang.String> r4 = r0.f
                r4.add(r7)
            L_0x00d9:
                if (r16 == 0) goto L_0x00e0
                java.util.List<java.lang.String> r4 = r0.f
                r4.add(r5)
            L_0x00e0:
                if (r16 == 0) goto L_0x0030
            L_0x00e2:
                int r1 = r1 + 1
                goto L_0x0030
            L_0x00e6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wlx.a.a(java.lang.String, int, int):void");
        }

        private static int b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        private static int c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static String e(String str, int i, int i2) {
            return wmk.a(wlx.a(str, i, i2, false));
        }

        private static int f(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(wlx.a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
    }

    wlx(a aVar) {
        this.a = aVar.a;
        this.g = a(aVar.b, false);
        this.h = a(aVar.c, false);
        this.b = aVar.d;
        this.c = aVar.a();
        this.d = a(aVar.f, false);
        String str = null;
        this.e = aVar.g != null ? a(aVar.g, true) : null;
        if (aVar.h != null) {
            str = a(aVar.h, false);
        }
        this.i = str;
        this.j = aVar.toString();
    }

    public final URL a() {
        try {
            return new URL(this.j);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final URI b() {
        a j2 = j();
        int size = j2.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            j2.f.set(i2, a((String) j2.f.get(i2), "[]", true, true, false, true));
        }
        if (j2.g != null) {
            int size2 = j2.g.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = (String) j2.g.get(i3);
                if (str != null) {
                    j2.g.set(i3, a(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (j2.h != null) {
            j2.h = a(j2.h, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar = j2.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final boolean c() {
        return this.a.equals("https");
    }

    public final String d() {
        if (this.g.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.j;
        return this.j.substring(length, wmk.a(str, length, str.length(), ":@"));
    }

    public final String e() {
        if (this.h.isEmpty()) {
            return "";
        }
        return this.j.substring(this.j.indexOf(58, this.a.length() + 3) + 1, this.j.indexOf(64));
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final String f() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        String str = this.j;
        return this.j.substring(indexOf, wmk.a(str, indexOf, str.length(), "?#"));
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) list.get(i2));
        }
    }

    public final List<String> g() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        String str = this.j;
        int a2 = wmk.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = wmk.a(this.j, i2, a2, '/');
            arrayList.add(this.j.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public final String h() {
        if (this.e == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        String str = this.j;
        return this.j.substring(indexOf, wmk.a(str, indexOf, str.length(), '#'));
    }

    public static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = (String) list.get(i2);
            String str2 = (String) list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    private String k() {
        if (this.i == null) {
            return null;
        }
        return this.j.substring(this.j.indexOf(35) + 1);
    }

    public final String i() {
        a d2 = d("/...");
        d2.b = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        d2.c = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return d2.b().toString();
    }

    public final wlx c(String str) {
        a d2 = d(str);
        if (d2 != null) {
            return d2.b();
        }
        return null;
    }

    public final a j() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = d();
        aVar.c = e();
        aVar.d = this.b;
        aVar.e = this.c != a(this.a) ? this.c : -1;
        aVar.f.clear();
        aVar.f.addAll(g());
        aVar.d(h());
        aVar.h = k();
        return aVar;
    }

    public final a d(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static wlx e(String str) {
        try {
            return f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static wlx f(String str) {
        return new a().a((wlx) null, str).b();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wlx) && ((wlx) obj).j.equals(this.j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return this.j;
    }

    private static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private static List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                wok wok = new wok();
                wok.a(str, i2, i4);
                a(wok, str, i4, i3, z);
                return wok.o();
            }
        }
        return str.substring(i2, i3);
    }

    private static void a(wok wok, String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37) {
                int i4 = i2 + 2;
                if (i4 < i3) {
                    int a2 = wmk.a(str.charAt(i2 + 1));
                    int a3 = wmk.a(str.charAt(i4));
                    if (!(a2 == -1 || a3 == -1)) {
                        wok.j((a2 << 4) + a3);
                        i2 = i4;
                        i2 += Character.charCount(codePointAt);
                    }
                    wok.a(codePointAt);
                    i2 += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                wok.j(32);
                i2 += Character.charCount(codePointAt);
            }
            wok.a(codePointAt);
            i2 += Character.charCount(codePointAt);
        }
    }

    private static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        if (i4 >= i3 || str.charAt(i2) != '%' || wmk.a(str.charAt(i2 + 1)) == -1 || wmk.a(str.charAt(i4)) == -1) {
            return false;
        }
        return true;
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i4 = i3;
        String str4 = str2;
        Charset charset2 = charset;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str3.codePointAt(i5);
            int i6 = 43;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !a(str3, i5, i4)))) || (codePointAt == 43 && z3)))) {
                wok wok = new wok();
                wok.a(str3, i2, i5);
                wok wok2 = null;
                while (i5 < i4) {
                    int codePointAt2 = str3.codePointAt(i5);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == i6 && z3) {
                            wok.b(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !a(str3, i5, i4)))))) {
                            if (wok2 == null) {
                                wok2 = new wok();
                            }
                            if (charset2 == null || charset2.equals(wmk.d)) {
                                wok2.a(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i5;
                                if (str3 == null) {
                                    throw new IllegalArgumentException("string == null");
                                } else if (i5 < 0) {
                                    StringBuilder sb = new StringBuilder("beginIndex < 0: ");
                                    sb.append(i5);
                                    throw new IllegalAccessError(sb.toString());
                                } else if (charCount < i5) {
                                    StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
                                    sb2.append(charCount);
                                    sb2.append(" < ");
                                    sb2.append(i5);
                                    throw new IllegalArgumentException(sb2.toString());
                                } else if (charCount > str.length()) {
                                    StringBuilder sb3 = new StringBuilder("endIndex > string.length: ");
                                    sb3.append(charCount);
                                    sb3.append(" > ");
                                    sb3.append(str.length());
                                    throw new IllegalArgumentException(sb3.toString());
                                } else if (charset2 == null) {
                                    throw new IllegalArgumentException("charset == null");
                                } else if (charset2.equals(wpc.a)) {
                                    wok2.a(str3, i5, charCount);
                                } else {
                                    byte[] bytes = str3.substring(i5, charCount).getBytes(charset2);
                                    wok2.c(bytes, 0, bytes.length);
                                }
                            }
                            while (!wok2.c()) {
                                byte f2 = wok2.f() & 255;
                                wok.j(37);
                                wok.j((int) f[(f2 >> 4) & 15]);
                                wok.j((int) f[f2 & 15]);
                            }
                        } else {
                            wok.a(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 43;
                }
                return wok.o();
            }
            i5 += Character.charCount(codePointAt);
        }
        int i7 = i2;
        return str.substring(i2, i3);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return a(str, 0, str.length(), str2, z, false, true, true, charset);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
