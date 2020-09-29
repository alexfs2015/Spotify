package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okio.ByteString;

/* renamed from: xag reason: default package */
public final class xag extends xak {
    public static final xaf a = xaf.a("multipart/mixed");
    public static final xaf b = xaf.a("multipart/form-data");
    private static final byte[] c = {58, 32};
    private static final byte[] d = {13, 10};
    private static final byte[] e = {45, 45};
    private final ByteString f;
    private final xaf g;
    private final xaf h;
    private final List<b> i;
    private long j = -1;

    /* renamed from: xag$a */
    public static final class a {
        private final ByteString a;
        private xaf b;
        private final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        private a(String str) {
            this.b = xag.a;
            this.c = new ArrayList();
            this.a = ByteString.a(str);
        }

        public final a a(xac xac, xak xak) {
            return a(b.a(xac, xak));
        }

        public final a a(xaf xaf) {
            if (xaf == null) {
                throw new NullPointerException("type == null");
            } else if (xaf.a.equals("multipart")) {
                this.b = xaf;
                return this;
            } else {
                StringBuilder sb = new StringBuilder("multipart != ");
                sb.append(xaf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public final a a(b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public final xag a() {
            if (!this.c.isEmpty()) {
                return new xag(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: xag$b */
    public static final class b {
        final xac a;
        final xak b;

        private b(xac xac, xak xak) {
            this.a = xac;
            this.b = xak;
        }

        public static b a(String str, String str2) {
            xak a2 = xak.a((xaf) null, str2);
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                xag.a(sb, str);
                return a(new defpackage.xac.a().b("Content-Disposition", sb.toString()).a(), a2);
            }
            throw new NullPointerException("name == null");
        }

        public static b a(xac xac, xak xak) {
            if (xak == null) {
                throw new NullPointerException("body == null");
            } else if (xac != null && xac.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (xac == null || xac.a("Content-Length") == null) {
                return new b(xac, xak);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }
    }

    static {
        xaf.a("multipart/alternative");
        xaf.a("multipart/digest");
        xaf.a("multipart/parallel");
    }

    xag(ByteString byteString, xaf xaf, List<b> list) {
        this.f = byteString;
        this.g = xaf;
        StringBuilder sb = new StringBuilder();
        sb.append(xaf);
        sb.append("; boundary=");
        sb.append(byteString.a());
        this.h = xaf.a(sb.toString());
        this.i = xaq.a(list);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [xcr] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r13v3, types: [xcq] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long a(defpackage.xcr r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            xcq r13 = new xcq
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<xag$b> r1 = r12.i
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = 0
        L_0x0015:
            if (r3 >= r1) goto L_0x00a8
            java.util.List<xag$b> r6 = r12.i
            java.lang.Object r6 = r6.get(r3)
            xag$b r6 = (defpackage.xag.b) r6
            xac r7 = r6.a
            xak r6 = r6.b
            byte[] r8 = e
            r13.c(r8)
            okio.ByteString r8 = r12.f
            r13.b(r8)
            byte[] r8 = d
            r13.c(r8)
            if (r7 == 0) goto L_0x005a
            java.lang.String[] r8 = r7.a
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = 0
        L_0x003a:
            if (r9 >= r8) goto L_0x005a
            java.lang.String r10 = r7.a(r9)
            xcr r10 = r13.b(r10)
            byte[] r11 = c
            xcr r10 = r10.c(r11)
            java.lang.String r11 = r7.b(r9)
            xcr r10 = r10.b(r11)
            byte[] r11 = d
            r10.c(r11)
            int r9 = r9 + 1
            goto L_0x003a
        L_0x005a:
            xaf r7 = r6.a()
            if (r7 == 0) goto L_0x0073
            java.lang.String r8 = "Content-Type: "
            xcr r8 = r13.b(r8)
            java.lang.String r7 = r7.toString()
            xcr r7 = r8.b(r7)
            byte[] r8 = d
            r7.c(r8)
        L_0x0073:
            long r7 = r6.b()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008d
            java.lang.String r9 = "Content-Length: "
            xcr r9 = r13.b(r9)
            xcr r9 = r9.n(r7)
            byte[] r10 = d
            r9.c(r10)
            goto L_0x0093
        L_0x008d:
            if (r14 == 0) goto L_0x0093
            r0.r()
            return r9
        L_0x0093:
            byte[] r9 = d
            r13.c(r9)
            if (r14 == 0) goto L_0x009c
            long r4 = r4 + r7
            goto L_0x009f
        L_0x009c:
            r6.a(r13)
        L_0x009f:
            byte[] r6 = d
            r13.c(r6)
            int r3 = r3 + 1
            goto L_0x0015
        L_0x00a8:
            byte[] r1 = e
            r13.c(r1)
            okio.ByteString r1 = r12.f
            r13.b(r1)
            byte[] r1 = e
            r13.c(r1)
            byte[] r1 = d
            r13.c(r1)
            if (r14 == 0) goto L_0x00c4
            long r13 = r0.b
            long r4 = r4 + r13
            r0.r()
        L_0x00c4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xag.a(xcr, boolean):long");
    }

    static StringBuilder a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    public final xaf a() {
        return this.h;
    }

    public final void a(xcr xcr) {
        a(xcr, false);
    }

    public final long b() {
        long j2 = this.j;
        if (j2 != -1) {
            return j2;
        }
        long a2 = a((xcr) null, true);
        this.j = a2;
        return a2;
    }
}
