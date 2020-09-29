package defpackage;

/* renamed from: bae reason: default package */
public interface bae {
    public static final bae a = new bae() {
        public final boolean a(aqv aqv) {
            String str = aqv.f;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final defpackage.bad b(defpackage.aqv r3) {
            /*
                r2 = this;
                java.lang.String r0 = r3.f
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1351681404: goto L_0x0072;
                    case -1248334819: goto L_0x0067;
                    case -1026075066: goto L_0x005d;
                    case -1004728940: goto L_0x0053;
                    case 691401887: goto L_0x0049;
                    case 822864842: goto L_0x003f;
                    case 930165504: goto L_0x0035;
                    case 1566015601: goto L_0x002b;
                    case 1566016562: goto L_0x0020;
                    case 1668750253: goto L_0x0016;
                    case 1693976202: goto L_0x000b;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x007d
            L_0x000b:
                java.lang.String r1 = "application/ttml+xml"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 3
                goto L_0x007e
            L_0x0016:
                java.lang.String r1 = "application/x-subrip"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 4
                goto L_0x007e
            L_0x0020:
                java.lang.String r1 = "application/cea-708"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 8
                goto L_0x007e
            L_0x002b:
                java.lang.String r1 = "application/cea-608"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 6
                goto L_0x007e
            L_0x0035:
                java.lang.String r1 = "application/x-mp4-cea-608"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 7
                goto L_0x007e
            L_0x003f:
                java.lang.String r1 = "text/x-ssa"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 1
                goto L_0x007e
            L_0x0049:
                java.lang.String r1 = "application/x-quicktime-tx3g"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 5
                goto L_0x007e
            L_0x0053:
                java.lang.String r1 = "text/vtt"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 0
                goto L_0x007e
            L_0x005d:
                java.lang.String r1 = "application/x-mp4-vtt"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 2
                goto L_0x007e
            L_0x0067:
                java.lang.String r1 = "application/pgs"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 10
                goto L_0x007e
            L_0x0072:
                java.lang.String r1 = "application/dvbsubs"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 9
                goto L_0x007e
            L_0x007d:
                r0 = -1
            L_0x007e:
                switch(r0) {
                    case 0: goto L_0x00cb;
                    case 1: goto L_0x00c3;
                    case 2: goto L_0x00bd;
                    case 3: goto L_0x00b7;
                    case 4: goto L_0x00b1;
                    case 5: goto L_0x00a9;
                    case 6: goto L_0x009f;
                    case 7: goto L_0x009f;
                    case 8: goto L_0x0097;
                    case 9: goto L_0x008f;
                    case 10: goto L_0x0089;
                    default: goto L_0x0081;
                }
            L_0x0081:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported format"
                r3.<init>(r0)
                throw r3
            L_0x0089:
                bat r3 = new bat
                r3.<init>()
                return r3
            L_0x008f:
                baq r0 = new baq
                java.util.List<byte[]> r3 = r3.h
                r0.<init>(r3)
                return r0
            L_0x0097:
                bam r0 = new bam
                int r3 = r3.x
                r0.<init>(r3)
                return r0
            L_0x009f:
                bak r0 = new bak
                java.lang.String r1 = r3.f
                int r3 = r3.x
                r0.<init>(r1, r3)
                return r0
            L_0x00a9:
                bbe r0 = new bbe
                java.util.List<byte[]> r3 = r3.h
                r0.<init>(r3)
                return r0
            L_0x00b1:
                bax r3 = new bax
                r3.<init>()
                return r3
            L_0x00b7:
                baz r3 = new baz
                r3.<init>()
                return r3
            L_0x00bd:
                bbh r3 = new bbh
                r3.<init>()
                return r3
            L_0x00c3:
                bav r0 = new bav
                java.util.List<byte[]> r3 = r3.h
                r0.<init>(r3)
                return r0
            L_0x00cb:
                bbm r3 = new bbm
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bae.AnonymousClass1.b(aqv):bad");
        }
    };

    boolean a(aqv aqv);

    bad b(aqv aqv);
}
