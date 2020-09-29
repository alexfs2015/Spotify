package defpackage;

/* renamed from: awc reason: default package */
public interface awc {
    public static final awc a = new awc() {
        public final boolean a(aqe aqe) {
            String str = aqe.f;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final defpackage.awb b(defpackage.aqe r5) {
            /*
                r4 = this;
                java.lang.String r5 = r5.f
                int r0 = r5.hashCode()
                r1 = -1248341703(0xffffffffb597d139, float:-1.1311269E-6)
                r2 = 2
                r3 = 1
                if (r0 == r1) goto L_0x002c
                r1 = 1154383568(0x44ce7ed0, float:1651.9629)
                if (r0 == r1) goto L_0x0022
                r1 = 1652648887(0x62816bb7, float:1.1936958E21)
                if (r0 == r1) goto L_0x0018
                goto L_0x0036
            L_0x0018:
                java.lang.String r0 = "application/x-scte35"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = 2
                goto L_0x0037
            L_0x0022:
                java.lang.String r0 = "application/x-emsg"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = 1
                goto L_0x0037
            L_0x002c:
                java.lang.String r0 = "application/id3"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = 0
                goto L_0x0037
            L_0x0036:
                r5 = -1
            L_0x0037:
                if (r5 == 0) goto L_0x0051
                if (r5 == r3) goto L_0x004b
                if (r5 != r2) goto L_0x0043
                aww r5 = new aww
                r5.<init>()
                return r5
            L_0x0043:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported format"
                r5.<init>(r0)
                throw r5
            L_0x004b:
                awh r5 = new awh
                r5.<init>()
                return r5
            L_0x0051:
                awo r5 = new awo
                r5.<init>()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.awc.AnonymousClass1.b(aqe):awb");
        }
    };

    boolean a(aqe aqe);

    awb b(aqe aqe);
}
