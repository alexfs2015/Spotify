package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wzo reason: default package */
public final class wzo {
    public static final wzo a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private String n;

    /* renamed from: wzo$a */
    public static final class a {
        public boolean a;
        public boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;

        public final wzo a() {
            return new wzo(this);
        }
    }

    static {
        a aVar = new a();
        aVar.a = true;
        aVar.a();
        a aVar2 = new a();
        aVar2.f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        a = aVar2.a();
    }

    wzo(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.k = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = aVar.d;
        this.i = aVar.e;
        this.j = aVar.f;
        this.l = false;
        this.m = false;
    }

    private wzo(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.k = i3;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i4;
        this.i = i5;
        this.j = z6;
        this.l = z7;
        this.m = z8;
        this.n = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.wzo a(defpackage.xac r22) {
        /*
            r0 = r22
            java.lang.String[] r1 = r0.a
            int r1 = r1.length
            int r1 = r1 / 2
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001b:
            if (r6 >= r1) goto L_0x0137
            java.lang.String r2 = r0.a(r6)
            java.lang.String r4 = r0.b(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            r8 = r4
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0130
        L_0x003a:
            r7 = 0
        L_0x003b:
            r2 = 0
        L_0x003c:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0130
            java.lang.String r3 = "=,;"
            int r3 = defpackage.xbh.a(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x009a
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x009a
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0067
            goto L_0x009a
        L_0x0067:
            int r3 = r3 + 1
            int r0 = defpackage.xbh.a(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x008a
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x008a
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = defpackage.xbh.a(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009e
        L_0x008a:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = defpackage.xbh.a(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009e
        L_0x009a:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009e:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ab
            r9 = 1
        L_0x00a7:
            r0 = r22
            r2 = r3
            goto L_0x003c
        L_0x00ab:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r10 = 1
            goto L_0x00a7
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c3
            r5 = -1
            int r11 = defpackage.xbh.b(r0, r5)
            goto L_0x00a7
        L_0x00c3:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d1
            r5 = -1
            int r12 = defpackage.xbh.b(r0, r5)
            goto L_0x00a7
        L_0x00d1:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00db
            r13 = 1
            goto L_0x00a7
        L_0x00db:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e5
            r14 = 1
            goto L_0x00a7
        L_0x00e5:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ef
            r15 = 1
            goto L_0x00a7
        L_0x00ef:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ff
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = defpackage.xbh.b(r0, r2)
            goto L_0x00a7
        L_0x00ff:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x010d
            r5 = -1
            int r17 = defpackage.xbh.b(r0, r5)
            goto L_0x00a7
        L_0x010d:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0119
            r18 = 1
            goto L_0x00a7
        L_0x0119:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0124
            r19 = 1
            goto L_0x00a7
        L_0x0124:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00a7
            r20 = 1
            goto L_0x00a7
        L_0x0130:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001b
        L_0x0137:
            if (r7 != 0) goto L_0x013c
            r21 = 0
            goto L_0x013e
        L_0x013c:
            r21 = r8
        L_0x013e:
            wzo r0 = new wzo
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzo.a(xac):wzo");
    }

    public final String toString() {
        String str;
        String str2 = this.n;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        if (this.b) {
            sb.append("no-cache, ");
        }
        if (this.c) {
            sb.append("no-store, ");
        }
        String str3 = ", ";
        if (this.d != -1) {
            sb.append("max-age=");
            sb.append(this.d);
            sb.append(str3);
        }
        if (this.k != -1) {
            sb.append("s-maxage=");
            sb.append(this.k);
            sb.append(str3);
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        if (this.h != -1) {
            sb.append("max-stale=");
            sb.append(this.h);
            sb.append(str3);
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(str3);
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.l) {
            sb.append("no-transform, ");
        }
        if (this.m) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            str = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
        }
        this.n = str;
        return str;
    }
}
