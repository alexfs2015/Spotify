package defpackage;

/* renamed from: dci reason: default package */
public final class dci extends dgr<dci> {
    public Long A;
    public Long B;
    public String C;
    public String D;
    public Integer E;
    public Integer F;
    public Long G;
    public Long H;
    public Long I;
    public Integer J;
    public ddc K;
    public ddc[] L;
    public ddx M;
    public Long N;
    public Long O;
    public Long P;
    public Long Q;
    public Long R;
    public String S;
    public String T;
    public Integer U;
    public Boolean V;
    public Long W;
    public dgp X;
    public String a;
    private Long aa;
    private Long ab;
    private Long ac;
    private Long ad;
    private Long ae;
    private Long af;
    private String ag;
    private Long ah;
    private Long ai;
    private dew aj;
    private Long ak;
    private Long al;
    private Long am;
    private Long an;
    private Integer ao;
    private Integer ap;
    private Integer aq;
    private Long ar;
    private String as;
    public String b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;
    public Long m;
    public String n;
    public String o;
    public Long p;
    public Long q;
    public Long r;
    public String s;
    public Long t;
    public Long u;
    public Long v;
    public Long w;
    public Long x;
    public Long y;
    public Long z;

    public dci() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.aa = null;
        this.d = null;
        this.e = null;
        this.ab = null;
        this.ac = null;
        this.ad = null;
        this.ae = null;
        this.af = null;
        this.f = null;
        this.ag = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.ah = null;
        this.ai = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.aj = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.ak = null;
        this.al = null;
        this.K = null;
        this.L = ddc.b();
        this.M = null;
        this.am = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.an = null;
        this.ar = null;
        this.T = null;
        this.V = null;
        this.as = null;
        this.W = null;
        this.X = null;
        this.Z = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dci a(defpackage.dgo r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.a()
            switch(r0) {
                case 0: goto L_0x03d0;
                case 10: goto L_0x03c8;
                case 18: goto L_0x03c0;
                case 24: goto L_0x03b4;
                case 32: goto L_0x03a8;
                case 40: goto L_0x039c;
                case 48: goto L_0x0390;
                case 56: goto L_0x0384;
                case 64: goto L_0x0378;
                case 72: goto L_0x036c;
                case 80: goto L_0x0360;
                case 88: goto L_0x0354;
                case 96: goto L_0x0348;
                case 106: goto L_0x0340;
                case 112: goto L_0x0334;
                case 120: goto L_0x0328;
                case 128: goto L_0x031c;
                case 136: goto L_0x0310;
                case 144: goto L_0x0304;
                case 152: goto L_0x02f8;
                case 160: goto L_0x02ec;
                case 168: goto L_0x02e0;
                case 176: goto L_0x02d4;
                case 184: goto L_0x02c8;
                case 194: goto L_0x02c0;
                case 200: goto L_0x02b4;
                case 208: goto L_0x027e;
                case 218: goto L_0x0276;
                case 224: goto L_0x026a;
                case 234: goto L_0x0262;
                case 242: goto L_0x025a;
                case 248: goto L_0x024e;
                case 256: goto L_0x0242;
                case 264: goto L_0x0236;
                case 274: goto L_0x022e;
                case 280: goto L_0x0222;
                case 288: goto L_0x0216;
                case 296: goto L_0x020a;
                case 306: goto L_0x01f8;
                case 312: goto L_0x01ec;
                case 320: goto L_0x01e0;
                case 328: goto L_0x01d4;
                case 336: goto L_0x01c8;
                case 346: goto L_0x0189;
                case 352: goto L_0x017d;
                case 360: goto L_0x0171;
                case 370: goto L_0x0169;
                case 378: goto L_0x0161;
                case 384: goto L_0x014d;
                case 392: goto L_0x0139;
                case 402: goto L_0x012a;
                case 408: goto L_0x011e;
                case 416: goto L_0x0112;
                case 424: goto L_0x0106;
                case 432: goto L_0x00fa;
                case 440: goto L_0x00ee;
                case 448: goto L_0x00da;
                case 458: goto L_0x00cb;
                case 464: goto L_0x00bf;
                case 472: goto L_0x00b3;
                case 480: goto L_0x00a7;
                case 488: goto L_0x009b;
                case 496: goto L_0x008f;
                case 504: goto L_0x0083;
                case 512: goto L_0x0077;
                case 520: goto L_0x0064;
                case 528: goto L_0x0051;
                case 538: goto L_0x004a;
                case 544: goto L_0x001d;
                case 1610: goto L_0x000e;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r0 = super.a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000e:
            dgp r0 = r6.X
            if (r0 != 0) goto L_0x0019
            dgp r0 = new dgp
            r0.<init>()
            r6.X = r0
        L_0x0019:
            dgp r0 = r6.X
            goto L_0x0205
        L_0x001d:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x02ac }
            if (r2 < 0) goto L_0x0031
            r3 = 3
            if (r2 > r3) goto L_0x0031
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r6.aq = r2     // Catch:{ IllegalArgumentException -> 0x02ac }
            goto L_0x0000
        L_0x0031:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02ac }
            r4 = 45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02ac }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.String r2 = " is not a valid enum DebuggerState"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x02ac }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            throw r3     // Catch:{ IllegalArgumentException -> 0x02ac }
        L_0x004a:
            java.lang.String r0 = r7.d()
            r6.S = r0
            goto L_0x0000
        L_0x0051:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x02ac }
            int r2 = defpackage.dbg.b(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r6.ap = r2     // Catch:{ IllegalArgumentException -> 0x02ac }
            goto L_0x0000
        L_0x0064:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x02ac }
            int r2 = defpackage.dbg.c(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r6.ao = r2     // Catch:{ IllegalArgumentException -> 0x02ac }
            goto L_0x0000
        L_0x0077:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.an = r0
            goto L_0x0000
        L_0x0083:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.R = r0
            goto L_0x0000
        L_0x008f:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.Q = r0
            goto L_0x0000
        L_0x009b:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.P = r0
            goto L_0x0000
        L_0x00a7:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.O = r0
            goto L_0x0000
        L_0x00b3:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.N = r0
            goto L_0x0000
        L_0x00bf:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.am = r0
            goto L_0x0000
        L_0x00cb:
            ddx r0 = r6.M
            if (r0 != 0) goto L_0x00d6
            ddx r0 = new ddx
            r0.<init>()
            r6.M = r0
        L_0x00d6:
            ddx r0 = r6.M
            goto L_0x0205
        L_0x00da:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x02ac }
            int r2 = defpackage.dbg.a(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r6.J = r2     // Catch:{ IllegalArgumentException -> 0x02ac }
            goto L_0x0000
        L_0x00ee:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.al = r0
            goto L_0x0000
        L_0x00fa:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.ak = r0
            goto L_0x0000
        L_0x0106:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.I = r0
            goto L_0x0000
        L_0x0112:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.H = r0
            goto L_0x0000
        L_0x011e:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.G = r0
            goto L_0x0000
        L_0x012a:
            ddc r0 = r6.K
            if (r0 != 0) goto L_0x0135
            ddc r0 = new ddc
            r0.<init>()
            r6.K = r0
        L_0x0135:
            ddc r0 = r6.K
            goto L_0x0205
        L_0x0139:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x02ac }
            int r2 = defpackage.dbg.a(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r6.F = r2     // Catch:{ IllegalArgumentException -> 0x02ac }
            goto L_0x0000
        L_0x014d:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x02ac }
            int r2 = defpackage.dbg.a(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r6.E = r2     // Catch:{ IllegalArgumentException -> 0x02ac }
            goto L_0x0000
        L_0x0161:
            java.lang.String r0 = r7.d()
            r6.D = r0
            goto L_0x0000
        L_0x0169:
            java.lang.String r0 = r7.d()
            r6.C = r0
            goto L_0x0000
        L_0x0171:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.B = r0
            goto L_0x0000
        L_0x017d:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A = r0
            goto L_0x0000
        L_0x0189:
            r0 = 346(0x15a, float:4.85E-43)
            int r0 = defpackage.dgz.a(r7, r0)
            ddc[] r1 = r6.L
            r2 = 0
            if (r1 != 0) goto L_0x0196
            r1 = 0
            goto L_0x0197
        L_0x0196:
            int r1 = r1.length
        L_0x0197:
            int r0 = r0 + r1
            ddc[] r0 = new defpackage.ddc[r0]
            if (r1 == 0) goto L_0x01a1
            ddc[] r3 = r6.L
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
        L_0x01a1:
            int r2 = r0.length
            int r2 = r2 + -1
            if (r1 >= r2) goto L_0x01b8
            ddc r2 = new ddc
            r2.<init>()
            r0[r1] = r2
            r2 = r0[r1]
            r7.a(r2)
            r7.a()
            int r1 = r1 + 1
            goto L_0x01a1
        L_0x01b8:
            ddc r2 = new ddc
            r2.<init>()
            r0[r1] = r2
            r1 = r0[r1]
            r7.a(r1)
            r6.L = r0
            goto L_0x0000
        L_0x01c8:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.z = r0
            goto L_0x0000
        L_0x01d4:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.y = r0
            goto L_0x0000
        L_0x01e0:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.x = r0
            goto L_0x0000
        L_0x01ec:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.w = r0
            goto L_0x0000
        L_0x01f8:
            dew r0 = r6.aj
            if (r0 != 0) goto L_0x0203
            dew r0 = new dew
            r0.<init>()
            r6.aj = r0
        L_0x0203:
            dew r0 = r6.aj
        L_0x0205:
            r7.a(r0)
            goto L_0x0000
        L_0x020a:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.v = r0
            goto L_0x0000
        L_0x0216:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.u = r0
            goto L_0x0000
        L_0x0222:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.t = r0
            goto L_0x0000
        L_0x022e:
            java.lang.String r0 = r7.d()
            r6.s = r0
            goto L_0x0000
        L_0x0236:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.r = r0
            goto L_0x0000
        L_0x0242:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.q = r0
            goto L_0x0000
        L_0x024e:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.p = r0
            goto L_0x0000
        L_0x025a:
            java.lang.String r0 = r7.d()
            r6.as = r0
            goto L_0x0000
        L_0x0262:
            java.lang.String r0 = r7.d()
            r6.o = r0
            goto L_0x0000
        L_0x026a:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.V = r0
            goto L_0x0000
        L_0x0276:
            java.lang.String r0 = r7.d()
            r6.n = r0
            goto L_0x0000
        L_0x027e:
            int r1 = r7.i()
            int r2 = r7.f()     // Catch:{ IllegalArgumentException -> 0x02ac }
            if (r2 < 0) goto L_0x0293
            r3 = 6
            if (r2 > r3) goto L_0x0293
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r6.U = r2     // Catch:{ IllegalArgumentException -> 0x02ac }
            goto L_0x0000
        L_0x0293:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02ac }
            r4 = 44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02ac }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x02ac }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.String r2 = " is not a valid enum DeviceIdType"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x02ac }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02ac }
            throw r3     // Catch:{ IllegalArgumentException -> 0x02ac }
        L_0x02ac:
            r7.e(r1)
            r6.a(r7, r0)
            goto L_0x0000
        L_0x02b4:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.W = r0
            goto L_0x0000
        L_0x02c0:
            java.lang.String r0 = r7.d()
            r6.T = r0
            goto L_0x0000
        L_0x02c8:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.m = r0
            goto L_0x0000
        L_0x02d4:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.l = r0
            goto L_0x0000
        L_0x02e0:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.ar = r0
            goto L_0x0000
        L_0x02ec:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.k = r0
            goto L_0x0000
        L_0x02f8:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.ai = r0
            goto L_0x0000
        L_0x0304:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.ah = r0
            goto L_0x0000
        L_0x0310:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.j = r0
            goto L_0x0000
        L_0x031c:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.i = r0
            goto L_0x0000
        L_0x0328:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.h = r0
            goto L_0x0000
        L_0x0334:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.g = r0
            goto L_0x0000
        L_0x0340:
            java.lang.String r0 = r7.d()
            r6.ag = r0
            goto L_0x0000
        L_0x0348:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.f = r0
            goto L_0x0000
        L_0x0354:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.af = r0
            goto L_0x0000
        L_0x0360:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.ae = r0
            goto L_0x0000
        L_0x036c:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.ad = r0
            goto L_0x0000
        L_0x0378:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.ac = r0
            goto L_0x0000
        L_0x0384:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.ab = r0
            goto L_0x0000
        L_0x0390:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.e = r0
            goto L_0x0000
        L_0x039c:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.d = r0
            goto L_0x0000
        L_0x03a8:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.aa = r0
            goto L_0x0000
        L_0x03b4:
            long r0 = r7.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.c = r0
            goto L_0x0000
        L_0x03c0:
            java.lang.String r0 = r7.d()
            r6.b = r0
            goto L_0x0000
        L_0x03c8:
            java.lang.String r0 = r7.d()
            r6.a = r0
            goto L_0x0000
        L_0x03d0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dci.a(dgo):dci");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dgq.b(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            a2 += dgq.b(2, str2);
        }
        Long l2 = this.c;
        if (l2 != null) {
            a2 += dgq.d(3, l2.longValue());
        }
        Long l3 = this.aa;
        if (l3 != null) {
            a2 += dgq.d(4, l3.longValue());
        }
        Long l4 = this.d;
        if (l4 != null) {
            a2 += dgq.d(5, l4.longValue());
        }
        Long l5 = this.e;
        if (l5 != null) {
            a2 += dgq.d(6, l5.longValue());
        }
        Long l6 = this.ab;
        if (l6 != null) {
            a2 += dgq.d(7, l6.longValue());
        }
        Long l7 = this.ac;
        if (l7 != null) {
            a2 += dgq.d(8, l7.longValue());
        }
        Long l8 = this.ad;
        if (l8 != null) {
            a2 += dgq.d(9, l8.longValue());
        }
        Long l9 = this.ae;
        if (l9 != null) {
            a2 += dgq.d(10, l9.longValue());
        }
        Long l10 = this.af;
        if (l10 != null) {
            a2 += dgq.d(11, l10.longValue());
        }
        Long l11 = this.f;
        if (l11 != null) {
            a2 += dgq.d(12, l11.longValue());
        }
        String str3 = this.ag;
        if (str3 != null) {
            a2 += dgq.b(13, str3);
        }
        Long l12 = this.g;
        if (l12 != null) {
            a2 += dgq.d(14, l12.longValue());
        }
        Long l13 = this.h;
        if (l13 != null) {
            a2 += dgq.d(15, l13.longValue());
        }
        Long l14 = this.i;
        if (l14 != null) {
            a2 += dgq.d(16, l14.longValue());
        }
        Long l15 = this.j;
        if (l15 != null) {
            a2 += dgq.d(17, l15.longValue());
        }
        Long l16 = this.ah;
        if (l16 != null) {
            a2 += dgq.d(18, l16.longValue());
        }
        Long l17 = this.ai;
        if (l17 != null) {
            a2 += dgq.d(19, l17.longValue());
        }
        Long l18 = this.k;
        if (l18 != null) {
            a2 += dgq.d(20, l18.longValue());
        }
        Long l19 = this.ar;
        if (l19 != null) {
            a2 += dgq.d(21, l19.longValue());
        }
        Long l20 = this.l;
        if (l20 != null) {
            a2 += dgq.d(22, l20.longValue());
        }
        Long l21 = this.m;
        if (l21 != null) {
            a2 += dgq.d(23, l21.longValue());
        }
        String str4 = this.T;
        if (str4 != null) {
            a2 += dgq.b(24, str4);
        }
        Long l22 = this.W;
        if (l22 != null) {
            a2 += dgq.d(25, l22.longValue());
        }
        Integer num = this.U;
        if (num != null) {
            a2 += dgq.b(26, num.intValue());
        }
        String str5 = this.n;
        if (str5 != null) {
            a2 += dgq.b(27, str5);
        }
        Boolean bool = this.V;
        if (bool != null) {
            bool.booleanValue();
            a2 += dgq.c(224) + 1;
        }
        String str6 = this.o;
        if (str6 != null) {
            a2 += dgq.b(29, str6);
        }
        String str7 = this.as;
        if (str7 != null) {
            a2 += dgq.b(30, str7);
        }
        Long l23 = this.p;
        if (l23 != null) {
            a2 += dgq.d(31, l23.longValue());
        }
        Long l24 = this.q;
        if (l24 != null) {
            a2 += dgq.d(32, l24.longValue());
        }
        Long l25 = this.r;
        if (l25 != null) {
            a2 += dgq.d(33, l25.longValue());
        }
        String str8 = this.s;
        if (str8 != null) {
            a2 += dgq.b(34, str8);
        }
        Long l26 = this.t;
        if (l26 != null) {
            a2 += dgq.d(35, l26.longValue());
        }
        Long l27 = this.u;
        if (l27 != null) {
            a2 += dgq.d(36, l27.longValue());
        }
        Long l28 = this.v;
        if (l28 != null) {
            a2 += dgq.d(37, l28.longValue());
        }
        dew dew = this.aj;
        if (dew != null) {
            a2 += dgq.b(38, (dgw) dew);
        }
        Long l29 = this.w;
        if (l29 != null) {
            a2 += dgq.d(39, l29.longValue());
        }
        Long l30 = this.x;
        if (l30 != null) {
            a2 += dgq.d(40, l30.longValue());
        }
        Long l31 = this.y;
        if (l31 != null) {
            a2 += dgq.d(41, l31.longValue());
        }
        Long l32 = this.z;
        if (l32 != null) {
            a2 += dgq.d(42, l32.longValue());
        }
        ddc[] ddcArr = this.L;
        if (ddcArr != null && ddcArr.length > 0) {
            int i2 = 0;
            while (true) {
                ddc[] ddcArr2 = this.L;
                if (i2 >= ddcArr2.length) {
                    break;
                }
                ddc ddc = ddcArr2[i2];
                if (ddc != null) {
                    a2 += dgq.b(43, (dgw) ddc);
                }
                i2++;
            }
        }
        Long l33 = this.A;
        if (l33 != null) {
            a2 += dgq.d(44, l33.longValue());
        }
        Long l34 = this.B;
        if (l34 != null) {
            a2 += dgq.d(45, l34.longValue());
        }
        String str9 = this.C;
        if (str9 != null) {
            a2 += dgq.b(46, str9);
        }
        String str10 = this.D;
        if (str10 != null) {
            a2 += dgq.b(47, str10);
        }
        Integer num2 = this.E;
        if (num2 != null) {
            a2 += dgq.b(48, num2.intValue());
        }
        Integer num3 = this.F;
        if (num3 != null) {
            a2 += dgq.b(49, num3.intValue());
        }
        ddc ddc2 = this.K;
        if (ddc2 != null) {
            a2 += dgq.b(50, (dgw) ddc2);
        }
        Long l35 = this.G;
        if (l35 != null) {
            a2 += dgq.d(51, l35.longValue());
        }
        Long l36 = this.H;
        if (l36 != null) {
            a2 += dgq.d(52, l36.longValue());
        }
        Long l37 = this.I;
        if (l37 != null) {
            a2 += dgq.d(53, l37.longValue());
        }
        Long l38 = this.ak;
        if (l38 != null) {
            a2 += dgq.d(54, l38.longValue());
        }
        Long l39 = this.al;
        if (l39 != null) {
            a2 += dgq.d(55, l39.longValue());
        }
        Integer num4 = this.J;
        if (num4 != null) {
            a2 += dgq.b(56, num4.intValue());
        }
        ddx ddx = this.M;
        if (ddx != null) {
            a2 += dgq.b(57, (dgw) ddx);
        }
        Long l40 = this.am;
        if (l40 != null) {
            a2 += dgq.d(58, l40.longValue());
        }
        Long l41 = this.N;
        if (l41 != null) {
            a2 += dgq.d(59, l41.longValue());
        }
        Long l42 = this.O;
        if (l42 != null) {
            a2 += dgq.d(60, l42.longValue());
        }
        Long l43 = this.P;
        if (l43 != null) {
            a2 += dgq.d(61, l43.longValue());
        }
        Long l44 = this.Q;
        if (l44 != null) {
            a2 += dgq.d(62, l44.longValue());
        }
        Long l45 = this.R;
        if (l45 != null) {
            a2 += dgq.d(63, l45.longValue());
        }
        Long l46 = this.an;
        if (l46 != null) {
            a2 += dgq.d(64, l46.longValue());
        }
        Integer num5 = this.ao;
        if (num5 != null) {
            a2 += dgq.b(65, num5.intValue());
        }
        Integer num6 = this.ap;
        if (num6 != null) {
            a2 += dgq.b(66, num6.intValue());
        }
        String str11 = this.S;
        if (str11 != null) {
            a2 += dgq.b(67, str11);
        }
        Integer num7 = this.aq;
        if (num7 != null) {
            a2 += dgq.b(68, num7.intValue());
        }
        dgp dgp = this.X;
        return dgp != null ? a2 + dgq.b(201, (dgw) dgp) : a2;
    }

    public final void a(dgq dgq) {
        String str = this.a;
        if (str != null) {
            dgq.a(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            dgq.a(2, str2);
        }
        Long l2 = this.c;
        if (l2 != null) {
            dgq.b(3, l2.longValue());
        }
        Long l3 = this.aa;
        if (l3 != null) {
            dgq.b(4, l3.longValue());
        }
        Long l4 = this.d;
        if (l4 != null) {
            dgq.b(5, l4.longValue());
        }
        Long l5 = this.e;
        if (l5 != null) {
            dgq.b(6, l5.longValue());
        }
        Long l6 = this.ab;
        if (l6 != null) {
            dgq.b(7, l6.longValue());
        }
        Long l7 = this.ac;
        if (l7 != null) {
            dgq.b(8, l7.longValue());
        }
        Long l8 = this.ad;
        if (l8 != null) {
            dgq.b(9, l8.longValue());
        }
        Long l9 = this.ae;
        if (l9 != null) {
            dgq.b(10, l9.longValue());
        }
        Long l10 = this.af;
        if (l10 != null) {
            dgq.b(11, l10.longValue());
        }
        Long l11 = this.f;
        if (l11 != null) {
            dgq.b(12, l11.longValue());
        }
        String str3 = this.ag;
        if (str3 != null) {
            dgq.a(13, str3);
        }
        Long l12 = this.g;
        if (l12 != null) {
            dgq.b(14, l12.longValue());
        }
        Long l13 = this.h;
        if (l13 != null) {
            dgq.b(15, l13.longValue());
        }
        Long l14 = this.i;
        if (l14 != null) {
            dgq.b(16, l14.longValue());
        }
        Long l15 = this.j;
        if (l15 != null) {
            dgq.b(17, l15.longValue());
        }
        Long l16 = this.ah;
        if (l16 != null) {
            dgq.b(18, l16.longValue());
        }
        Long l17 = this.ai;
        if (l17 != null) {
            dgq.b(19, l17.longValue());
        }
        Long l18 = this.k;
        if (l18 != null) {
            dgq.b(20, l18.longValue());
        }
        Long l19 = this.ar;
        if (l19 != null) {
            dgq.b(21, l19.longValue());
        }
        Long l20 = this.l;
        if (l20 != null) {
            dgq.b(22, l20.longValue());
        }
        Long l21 = this.m;
        if (l21 != null) {
            dgq.b(23, l21.longValue());
        }
        String str4 = this.T;
        if (str4 != null) {
            dgq.a(24, str4);
        }
        Long l22 = this.W;
        if (l22 != null) {
            dgq.b(25, l22.longValue());
        }
        Integer num = this.U;
        if (num != null) {
            dgq.a(26, num.intValue());
        }
        String str5 = this.n;
        if (str5 != null) {
            dgq.a(27, str5);
        }
        Boolean bool = this.V;
        if (bool != null) {
            dgq.a(28, bool.booleanValue());
        }
        String str6 = this.o;
        if (str6 != null) {
            dgq.a(29, str6);
        }
        String str7 = this.as;
        if (str7 != null) {
            dgq.a(30, str7);
        }
        Long l23 = this.p;
        if (l23 != null) {
            dgq.b(31, l23.longValue());
        }
        Long l24 = this.q;
        if (l24 != null) {
            dgq.b(32, l24.longValue());
        }
        Long l25 = this.r;
        if (l25 != null) {
            dgq.b(33, l25.longValue());
        }
        String str8 = this.s;
        if (str8 != null) {
            dgq.a(34, str8);
        }
        Long l26 = this.t;
        if (l26 != null) {
            dgq.b(35, l26.longValue());
        }
        Long l27 = this.u;
        if (l27 != null) {
            dgq.b(36, l27.longValue());
        }
        Long l28 = this.v;
        if (l28 != null) {
            dgq.b(37, l28.longValue());
        }
        dew dew = this.aj;
        if (dew != null) {
            dgq.a(38, (dgw) dew);
        }
        Long l29 = this.w;
        if (l29 != null) {
            dgq.b(39, l29.longValue());
        }
        Long l30 = this.x;
        if (l30 != null) {
            dgq.b(40, l30.longValue());
        }
        Long l31 = this.y;
        if (l31 != null) {
            dgq.b(41, l31.longValue());
        }
        Long l32 = this.z;
        if (l32 != null) {
            dgq.b(42, l32.longValue());
        }
        ddc[] ddcArr = this.L;
        if (ddcArr != null && ddcArr.length > 0) {
            int i2 = 0;
            while (true) {
                ddc[] ddcArr2 = this.L;
                if (i2 >= ddcArr2.length) {
                    break;
                }
                ddc ddc = ddcArr2[i2];
                if (ddc != null) {
                    dgq.a(43, (dgw) ddc);
                }
                i2++;
            }
        }
        Long l33 = this.A;
        if (l33 != null) {
            dgq.b(44, l33.longValue());
        }
        Long l34 = this.B;
        if (l34 != null) {
            dgq.b(45, l34.longValue());
        }
        String str9 = this.C;
        if (str9 != null) {
            dgq.a(46, str9);
        }
        String str10 = this.D;
        if (str10 != null) {
            dgq.a(47, str10);
        }
        Integer num2 = this.E;
        if (num2 != null) {
            dgq.a(48, num2.intValue());
        }
        Integer num3 = this.F;
        if (num3 != null) {
            dgq.a(49, num3.intValue());
        }
        ddc ddc2 = this.K;
        if (ddc2 != null) {
            dgq.a(50, (dgw) ddc2);
        }
        Long l35 = this.G;
        if (l35 != null) {
            dgq.b(51, l35.longValue());
        }
        Long l36 = this.H;
        if (l36 != null) {
            dgq.b(52, l36.longValue());
        }
        Long l37 = this.I;
        if (l37 != null) {
            dgq.b(53, l37.longValue());
        }
        Long l38 = this.ak;
        if (l38 != null) {
            dgq.b(54, l38.longValue());
        }
        Long l39 = this.al;
        if (l39 != null) {
            dgq.b(55, l39.longValue());
        }
        Integer num4 = this.J;
        if (num4 != null) {
            dgq.a(56, num4.intValue());
        }
        ddx ddx = this.M;
        if (ddx != null) {
            dgq.a(57, (dgw) ddx);
        }
        Long l40 = this.am;
        if (l40 != null) {
            dgq.b(58, l40.longValue());
        }
        Long l41 = this.N;
        if (l41 != null) {
            dgq.b(59, l41.longValue());
        }
        Long l42 = this.O;
        if (l42 != null) {
            dgq.b(60, l42.longValue());
        }
        Long l43 = this.P;
        if (l43 != null) {
            dgq.b(61, l43.longValue());
        }
        Long l44 = this.Q;
        if (l44 != null) {
            dgq.b(62, l44.longValue());
        }
        Long l45 = this.R;
        if (l45 != null) {
            dgq.b(63, l45.longValue());
        }
        Long l46 = this.an;
        if (l46 != null) {
            dgq.b(64, l46.longValue());
        }
        Integer num5 = this.ao;
        if (num5 != null) {
            dgq.a(65, num5.intValue());
        }
        Integer num6 = this.ap;
        if (num6 != null) {
            dgq.a(66, num6.intValue());
        }
        String str11 = this.S;
        if (str11 != null) {
            dgq.a(67, str11);
        }
        Integer num7 = this.aq;
        if (num7 != null) {
            dgq.a(68, num7.intValue());
        }
        dgp dgp = this.X;
        if (dgp != null) {
            dgq.a(201, (dgw) dgp);
        }
        super.a(dgq);
    }
}