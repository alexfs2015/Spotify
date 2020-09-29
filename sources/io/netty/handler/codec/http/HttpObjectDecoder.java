package io.netty.handler.codec.http;

import io.netty.handler.codec.PrematureChannelClosureException;
import io.netty.handler.codec.TooLongFrameException;
import java.util.List;

public abstract class HttpObjectDecoder extends wrc {
    private static /* synthetic */ boolean r = (!HttpObjectDecoder.class.desiredAssertionStatus());
    protected final boolean e;
    private final int f;
    private final boolean g;
    private final a h;
    private final b i;
    private wsi j;
    private long k;
    private long l;
    private volatile boolean m;
    private CharSequence n;
    private CharSequence o;
    private wsu p;
    private State q;

    enum State {
        SKIP_CONTROL_CHARS,
        READ_INITIAL,
        READ_HEADER,
        READ_VARIABLE_LENGTH_CONTENT,
        READ_FIXED_LENGTH_CONTENT,
        READ_CHUNK_SIZE,
        READ_CHUNKED_CONTENT,
        READ_CHUNK_DELIMITER,
        READ_CHUNK_FOOTER,
        BAD_MESSAGE,
        UPGRADED
    }

    static class a implements wvg {
        int a;
        private final wxe b;
        private final int c;

        a(wxe wxe, int i) {
            this.b = wxe;
            this.c = i;
        }

        /* access modifiers changed from: protected */
        public TooLongFrameException a(int i) {
            StringBuilder sb = new StringBuilder("HTTP header is larger than ");
            sb.append(i);
            sb.append(" bytes.");
            return new TooLongFrameException(sb.toString());
        }

        public wxe a(wnb wnb) {
            int i = this.a;
            this.b.b = 0;
            int a2 = wnb.a((wvg) this);
            if (a2 == -1) {
                this.a = i;
                return null;
            }
            wnb.a(a2 + 1);
            return this.b;
        }

        public final boolean a(byte b2) {
            char c2 = (char) b2;
            if (c2 == 13) {
                return true;
            }
            if (c2 == 10) {
                return false;
            }
            int i = this.a + 1;
            this.a = i;
            int i2 = this.c;
            if (i <= i2) {
                this.b.append(c2);
                return true;
            }
            throw a(i2);
        }
    }

    static final class b extends a {
        b(wxe wxe, int i) {
            super(wxe, i);
        }

        /* access modifiers changed from: protected */
        public final TooLongFrameException a(int i) {
            StringBuilder sb = new StringBuilder("An HTTP line is larger than ");
            sb.append(i);
            sb.append(" bytes.");
            return new TooLongFrameException(sb.toString());
        }

        public final wxe a(wnb wnb) {
            this.a = 0;
            return super.a(wnb);
        }
    }

    protected HttpObjectDecoder() {
        this(4096, 8192, 8192, true);
    }

    private HttpObjectDecoder(int i2, int i3, int i4, boolean z) {
        this(4096, 8192, 8192, true, true);
    }

    protected HttpObjectDecoder(int i2, int i3, int i4, boolean z, boolean z2) {
        this(i2, i3, i4, z, z2, 128);
    }

    private HttpObjectDecoder(int i2, int i3, int i4, boolean z, boolean z2, int i5) {
        this.l = Long.MIN_VALUE;
        this.q = State.SKIP_CONTROL_CHARS;
        if (i2 <= 0) {
            StringBuilder sb = new StringBuilder("maxInitialLineLength must be a positive integer: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 <= 0) {
            StringBuilder sb2 = new StringBuilder("maxHeaderSize must be a positive integer: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i4 > 0) {
            wxe wxe = new wxe(128);
            this.i = new b(wxe, i2);
            this.h = new a(wxe, i3);
            this.f = i4;
            this.g = z;
            this.e = z2;
        } else {
            StringBuilder sb3 = new StringBuilder("maxChunkSize must be a positive integer: ");
            sb3.append(i4);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private static int a(String str) {
        String trim = str.trim();
        int i2 = 0;
        while (true) {
            if (i2 >= trim.length()) {
                break;
            }
            char charAt = trim.charAt(i2);
            if (charAt == ';' || Character.isWhitespace(charAt) || Character.isISOControl(charAt)) {
                trim = trim.substring(0, i2);
            } else {
                i2++;
            }
        }
        trim = trim.substring(0, i2);
        return Integer.parseInt(trim, 16);
    }

    private static int a(wxe wxe, int i2) {
        while (i2 < wxe.length()) {
            if (!Character.isWhitespace(wxe.a[i2])) {
                return i2;
            }
            i2++;
        }
        return wxe.length();
    }

    private wsi a(wnb wnb, Exception exc) {
        this.q = State.BAD_MESSAGE;
        wnb.w(wnb.g());
        wsi wsi = this.j;
        if (wsi != null) {
            wsi.a(wrf.a(exc));
        } else {
            this.j = e();
            this.j.a(wrf.a(exc));
        }
        wsi wsi2 = this.j;
        this.j = null;
        return wsi2;
    }

    private wsu a(wnb wnb) {
        wxe a2 = this.h.a(wnb);
        if (a2 == null) {
            return null;
        }
        if (a2.length() <= 0) {
            return wsu.a;
        }
        wsu wsu = this.p;
        if (wsu == null) {
            wsu = new wrw(woc.a, this.e);
            this.p = wsu;
        }
        wsu wsu2 = wsu;
        CharSequence charSequence = null;
        do {
            char charAt = a2.charAt(0);
            if (charSequence == null || !(charAt == ' ' || charAt == 9)) {
                a(a2);
                CharSequence charSequence2 = this.n;
                if (!wse.b.a(charSequence2) && !wse.k.a(charSequence2) && !wse.j.a(charSequence2)) {
                    wsu2.c().a(charSequence2, (Object) this.o);
                }
                CharSequence charSequence3 = this.n;
                this.n = null;
                this.o = null;
                charSequence = charSequence3;
            } else {
                List c = wsu2.c().c(charSequence);
                if (!c.isEmpty()) {
                    int size = c.size() - 1;
                    String trim = a2.toString().trim();
                    CharSequence charSequence4 = (CharSequence) c.get(size);
                    StringBuilder sb = new StringBuilder(charSequence4.length() + trim.length());
                    sb.append(charSequence4);
                    sb.append(trim);
                    c.set(size, sb.toString());
                }
            }
            a2 = this.h.a(wnb);
            if (a2 == null) {
                return null;
            }
        } while (a2.length() > 0);
        this.p = null;
        return wsu2;
    }

    private void a(wxe wxe) {
        int length = wxe.length();
        int a2 = a(wxe, 0);
        int i2 = a2;
        while (i2 < length) {
            char charAt = wxe.charAt(i2);
            if (charAt == ':' || Character.isWhitespace(charAt)) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        while (true) {
            if (i3 >= length) {
                break;
            } else if (wxe.charAt(i3) == ':') {
                i3++;
                break;
            } else {
                i3++;
            }
        }
        this.n = wxe.a(a2, i2);
        int a3 = a(wxe, i3);
        if (a3 == length) {
            this.o = "";
        } else {
            this.o = wxe.a(a3, b(wxe));
        }
    }

    private static int b(wxe wxe) {
        for (int length = wxe.length() - 1; length > 0; length--) {
            if (!Character.isWhitespace(wxe.a[length])) {
                return length + 1;
            }
        }
        return 0;
    }

    private static int b(wxe wxe, int i2) {
        while (i2 < wxe.length()) {
            if (Character.isWhitespace(wxe.a[i2])) {
                return i2;
            }
            i2++;
        }
        return wxe.length();
    }

    private wsc b(wnb wnb, Exception exc) {
        this.q = State.BAD_MESSAGE;
        wnb.w(wnb.g());
        wrw wrw = new wrw(woc.a);
        wrw.a(wrf.a(exc));
        this.j = null;
        this.p = null;
        return wrw;
    }

    private void f() {
        wsi wsi = this.j;
        this.j = null;
        this.n = null;
        this.o = null;
        this.l = Long.MIN_VALUE;
        this.i.a = 0;
        this.h.a = 0;
        this.p = null;
        wsp wsp = (wsp) wsi;
        if (wsp == null || wsp.f().b != 101) {
            this.m = false;
            this.q = State.SKIP_CONTROL_CHARS;
            return;
        }
        this.q = State.UPGRADED;
    }

    private long g() {
        if (this.l == Long.MIN_VALUE) {
            this.l = wss.a(this.j, -1);
        }
        return this.l;
    }

    /* access modifiers changed from: protected */
    public abstract wsi a(String[] strArr);

    /* JADX INFO: used method not loaded: wsg.a(java.lang.CharSequence, java.lang.Object):null, types can be incorrect */
    /* JADX INFO: used method not loaded: wss.a(wsi, boolean):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c2, code lost:
        if (r8 != 9) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c4, code lost:
        r8 = new java.lang.StringBuilder((r12.o.length() + r6.length()) + 1);
        r8.append(r12.o);
        r8.append(' ');
        r8.append(r6.toString().trim());
        r12.o = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f1, code lost:
        if (r12.n == null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f3, code lost:
        r5.a(r12.n, (java.lang.Object) r12.o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fa, code lost:
        a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fd, code lost:
        r6 = r12.h.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0203, code lost:
        if (r6 != null) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x020a, code lost:
        if (r6.length() > 0) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020e, code lost:
        if (r12.n == null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0210, code lost:
        r5.a(r12.n, (java.lang.Object) r12.o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0217, code lost:
        r12.n = null;
        r12.o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021f, code lost:
        if (a(r13) == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0221, code lost:
        defpackage.wss.a(r13, false);
        r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0226, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022c, code lost:
        if (defpackage.wss.a(r13) == false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022e, code lost:
        r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0237, code lost:
        if (g() < 0) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0239, code lost:
        r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x023c, code lost:
        r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023f, code lost:
        if (r7 != null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0241, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0242, code lost:
        r12.q = r7;
        r13 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.a[r7.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x024c, code lost:
        if (r13 == 1) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x024e, code lost:
        if (r13 == 2) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0250, code lost:
        r3 = g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0256, code lost:
        if (r3 == 0) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0258, code lost:
        r13 = (r3 > -1 ? 1 : (r3 == -1 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x025e, code lost:
        if (r != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0262, code lost:
        if (r7 == io.netty.handler.codec.http.HttpObjectDecoder.State.e) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0266, code lost:
        if (r7 != io.netty.handler.codec.http.HttpObjectDecoder.State.d) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x026e, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x026f, code lost:
        r15.add(r12.j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0276, code lost:
        if (r7 != io.netty.handler.codec.http.HttpObjectDecoder.State.e) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0278, code lost:
        r12.k = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x027a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x027b, code lost:
        r15.add(r12.j);
        r15.add(defpackage.wsu.a);
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0288, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x028b, code lost:
        if (r12.g == false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x028d, code lost:
        r15.add(r12.j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0292, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x029a, code lost:
        throw new java.lang.IllegalArgumentException("Chunked messages not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x029b, code lost:
        r15.add(r12.j);
        r15.add(defpackage.wsu.a);
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a9, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02aa, code lost:
        r15.add(a(r14, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02b2, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02b3, code lost:
        r15.add(a(r14, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c8, code lost:
        if (r12.k > 2147483647L) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d0, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        r13 = java.lang.Math.min(java.lang.Math.min((int) r12.k, r12.f), r14.g());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e2, code lost:
        if (r13 != 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e5, code lost:
        r0 = new defpackage.wrq(r14.v(r13));
        r12.k -= (long) r13;
        r15.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fb, code lost:
        if (r12.k == 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r12.q = io.netty.handler.codec.http.HttpObjectDecoder.State.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0102, code lost:
        r13 = r14.d();
        r15 = r14.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        if (r13 <= r15) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        r0 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        if (r14.e(r15) != 10) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        r12.q = io.netty.handler.codec.http.HttpObjectDecoder.State.f;
        r15 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        r15 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
        r14.a(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0121, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r13 = r12.i.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015e, code lost:
        if (r13 != null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0160, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0161, code lost:
        r5 = a(r13, 0);
        r6 = b(r13, r5);
        r7 = a(r13, r6);
        r8 = b(r13, r7);
        r9 = a(r13, r8);
        r10 = b(r13);
        r11 = new java.lang.String[3];
        r11[0] = r13.a(r5, r6);
        r11[1] = r13.a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0188, code lost:
        if (r9 >= r10) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018a, code lost:
        r13 = r13.a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x018f, code lost:
        r13 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0191, code lost:
        r11[2] = r13;
        r12.j = a(r11);
        r12.q = io.netty.handler.codec.http.HttpObjectDecoder.State.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r13 = r12.j;
        r5 = r13.d();
        r6 = r12.h.a(r14);
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01aa, code lost:
        if (r6 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b2, code lost:
        if (r6.length() <= 0) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b4, code lost:
        r8 = r6.charAt(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ba, code lost:
        if (r12.n == null) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01be, code lost:
        if (r8 == ' ') goto L_0x01c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.wpb r13, defpackage.wnb r14, java.util.List<java.lang.Object> r15) {
        /*
            r12 = this;
            boolean r13 = r12.m
            if (r13 == 0) goto L_0x0007
            r12.f()
        L_0x0007:
            int[] r13 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.a
            io.netty.handler.codec.http.HttpObjectDecoder$State r0 = r12.q
            int r0 = r0.ordinal()
            r13 = r13[r0]
            r0 = 2
            r1 = 0
            r3 = 0
            r4 = 1
            switch(r13) {
                case 1: goto L_0x012b;
                case 2: goto L_0x009e;
                case 3: goto L_0x0158;
                case 4: goto L_0x019d;
                case 5: goto L_0x0085;
                case 6: goto L_0x0049;
                case 7: goto L_0x00bd;
                case 8: goto L_0x0102;
                case 9: goto L_0x0032;
                case 10: goto L_0x002a;
                case 11: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x02ba
        L_0x001b:
            int r13 = r14.g()
            if (r13 <= 0) goto L_0x02ba
            wnb r13 = r14.u(r13)
            r15.add(r13)
            goto L_0x02ba
        L_0x002a:
            int r13 = r14.g()
            r14.w(r13)
            return
        L_0x0032:
            wsu r13 = r12.a(r14)     // Catch:{ Exception -> 0x0040 }
            if (r13 != 0) goto L_0x0039
            return
        L_0x0039:
            r15.add(r13)     // Catch:{ Exception -> 0x0040 }
            r12.f()     // Catch:{ Exception -> 0x0040 }
            return
        L_0x0040:
            r13 = move-exception
            wsc r13 = r12.b(r14, r13)
            r15.add(r13)
            return
        L_0x0049:
            int r13 = r14.g()
            if (r13 != 0) goto L_0x0050
            return
        L_0x0050:
            int r0 = r12.f
            int r13 = java.lang.Math.min(r13, r0)
            long r3 = (long) r13
            long r5 = r12.k
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            int r13 = (int) r5
        L_0x005e:
            wnb r14 = r14.v(r13)
            long r3 = r12.k
            long r5 = (long) r13
            long r3 = r3 - r5
            r12.k = r3
            long r3 = r12.k
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x007c
            wrw r13 = new wrw
            boolean r0 = r12.e
            r13.<init>(r14, r0)
            r15.add(r13)
            r12.f()
            return
        L_0x007c:
            wrq r13 = new wrq
            r13.<init>(r14)
            r15.add(r13)
            return
        L_0x0085:
            int r13 = r14.g()
            int r0 = r12.f
            int r13 = java.lang.Math.min(r13, r0)
            if (r13 <= 0) goto L_0x009d
            wnb r13 = r14.v(r13)
            wrq r14 = new wrq
            r14.<init>(r13)
            r15.add(r14)
        L_0x009d:
            return
        L_0x009e:
            io.netty.handler.codec.http.HttpObjectDecoder$b r13 = r12.i     // Catch:{ Exception -> 0x0122 }
            wxe r13 = r13.a(r14)     // Catch:{ Exception -> 0x0122 }
            if (r13 != 0) goto L_0x00a7
            return
        L_0x00a7:
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0122 }
            int r13 = a(r13)     // Catch:{ Exception -> 0x0122 }
            long r3 = (long) r13     // Catch:{ Exception -> 0x0122 }
            r12.k = r3     // Catch:{ Exception -> 0x0122 }
            if (r13 != 0) goto L_0x00b9
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_FOOTER     // Catch:{ Exception -> 0x0122 }
            r12.q = r13     // Catch:{ Exception -> 0x0122 }
            return
        L_0x00b9:
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNKED_CONTENT     // Catch:{ Exception -> 0x0122 }
            r12.q = r13     // Catch:{ Exception -> 0x0122 }
        L_0x00bd:
            boolean r13 = r
            if (r13 != 0) goto L_0x00d1
            long r3 = r12.k
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 > 0) goto L_0x00cb
            goto L_0x00d1
        L_0x00cb:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        L_0x00d1:
            long r3 = r12.k
            int r13 = (int) r3
            int r0 = r12.f
            int r13 = java.lang.Math.min(r13, r0)
            int r0 = r14.g()
            int r13 = java.lang.Math.min(r13, r0)
            if (r13 != 0) goto L_0x00e5
            return
        L_0x00e5:
            wrq r0 = new wrq
            wnb r3 = r14.v(r13)
            r0.<init>(r3)
            long r3 = r12.k
            long r5 = (long) r13
            long r3 = r3 - r5
            r12.k = r3
            r15.add(r0)
            long r3 = r12.k
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 == 0) goto L_0x00fe
            return
        L_0x00fe:
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_DELIMITER
            r12.q = r13
        L_0x0102:
            int r13 = r14.d()
            int r15 = r14.c()
        L_0x010a:
            if (r13 <= r15) goto L_0x011e
            int r0 = r15 + 1
            byte r15 = r14.e(r15)
            r1 = 10
            if (r15 != r1) goto L_0x011c
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_SIZE
            r12.q = r13
            r15 = r0
            goto L_0x011e
        L_0x011c:
            r15 = r0
            goto L_0x010a
        L_0x011e:
            r14.a(r15)
            return
        L_0x0122:
            r13 = move-exception
            wsc r13 = r12.b(r14, r13)
            r15.add(r13)
            return
        L_0x012b:
            int r13 = r14.d()
            int r5 = r14.c()
        L_0x0133:
            if (r13 <= r5) goto L_0x014d
            int r6 = r5 + 1
            short r5 = r14.g(r5)
            boolean r7 = java.lang.Character.isISOControl(r5)
            if (r7 != 0) goto L_0x014b
            boolean r5 = java.lang.Character.isWhitespace(r5)
            if (r5 != 0) goto L_0x014b
            int r5 = r6 + -1
            r13 = 1
            goto L_0x014e
        L_0x014b:
            r5 = r6
            goto L_0x0133
        L_0x014d:
            r13 = 0
        L_0x014e:
            r14.a(r5)
            if (r13 != 0) goto L_0x0154
            return
        L_0x0154:
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_INITIAL
            r12.q = r13
        L_0x0158:
            io.netty.handler.codec.http.HttpObjectDecoder$b r13 = r12.i     // Catch:{ Exception -> 0x02b2 }
            wxe r13 = r13.a(r14)     // Catch:{ Exception -> 0x02b2 }
            if (r13 != 0) goto L_0x0161
            return
        L_0x0161:
            int r5 = a(r13, r3)     // Catch:{ Exception -> 0x02b2 }
            int r6 = b(r13, r5)     // Catch:{ Exception -> 0x02b2 }
            int r7 = a(r13, r6)     // Catch:{ Exception -> 0x02b2 }
            int r8 = b(r13, r7)     // Catch:{ Exception -> 0x02b2 }
            int r9 = a(r13, r8)     // Catch:{ Exception -> 0x02b2 }
            int r10 = b(r13)     // Catch:{ Exception -> 0x02b2 }
            r11 = 3
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r5 = r13.a(r5, r6)     // Catch:{ Exception -> 0x02b2 }
            r11[r3] = r5     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r5 = r13.a(r7, r8)     // Catch:{ Exception -> 0x02b2 }
            r11[r4] = r5     // Catch:{ Exception -> 0x02b2 }
            if (r9 >= r10) goto L_0x018f
            java.lang.String r13 = r13.a(r9, r10)     // Catch:{ Exception -> 0x02b2 }
            goto L_0x0191
        L_0x018f:
            java.lang.String r13 = ""
        L_0x0191:
            r11[r0] = r13     // Catch:{ Exception -> 0x02b2 }
            wsi r13 = r12.a(r11)     // Catch:{ Exception -> 0x02b2 }
            r12.j = r13     // Catch:{ Exception -> 0x02b2 }
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_HEADER     // Catch:{ Exception -> 0x02b2 }
            r12.q = r13     // Catch:{ Exception -> 0x02b2 }
        L_0x019d:
            wsi r13 = r12.j     // Catch:{ Exception -> 0x02a9 }
            wsg r5 = r13.d()     // Catch:{ Exception -> 0x02a9 }
            io.netty.handler.codec.http.HttpObjectDecoder$a r6 = r12.h     // Catch:{ Exception -> 0x02a9 }
            wxe r6 = r6.a(r14)     // Catch:{ Exception -> 0x02a9 }
            r7 = 0
            if (r6 != 0) goto L_0x01ae
            goto L_0x023f
        L_0x01ae:
            int r8 = r6.length()     // Catch:{ Exception -> 0x02a9 }
            if (r8 <= 0) goto L_0x020c
        L_0x01b4:
            char r8 = r6.charAt(r3)     // Catch:{ Exception -> 0x02a9 }
            java.lang.CharSequence r9 = r12.n     // Catch:{ Exception -> 0x02a9 }
            if (r9 == 0) goto L_0x01ef
            r9 = 32
            if (r8 == r9) goto L_0x01c4
            r10 = 9
            if (r8 != r10) goto L_0x01ef
        L_0x01c4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a9 }
            java.lang.CharSequence r10 = r12.o     // Catch:{ Exception -> 0x02a9 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x02a9 }
            int r11 = r6.length()     // Catch:{ Exception -> 0x02a9 }
            int r10 = r10 + r11
            int r10 = r10 + r4
            r8.<init>(r10)     // Catch:{ Exception -> 0x02a9 }
            java.lang.CharSequence r10 = r12.o     // Catch:{ Exception -> 0x02a9 }
            r8.append(r10)     // Catch:{ Exception -> 0x02a9 }
            r8.append(r9)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r6 = r6.trim()     // Catch:{ Exception -> 0x02a9 }
            r8.append(r6)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x02a9 }
            r12.o = r6     // Catch:{ Exception -> 0x02a9 }
            goto L_0x01fd
        L_0x01ef:
            java.lang.CharSequence r8 = r12.n     // Catch:{ Exception -> 0x02a9 }
            if (r8 == 0) goto L_0x01fa
            java.lang.CharSequence r8 = r12.n     // Catch:{ Exception -> 0x02a9 }
            java.lang.CharSequence r9 = r12.o     // Catch:{ Exception -> 0x02a9 }
            r5.a(r8, r9)     // Catch:{ Exception -> 0x02a9 }
        L_0x01fa:
            r12.a(r6)     // Catch:{ Exception -> 0x02a9 }
        L_0x01fd:
            io.netty.handler.codec.http.HttpObjectDecoder$a r6 = r12.h     // Catch:{ Exception -> 0x02a9 }
            wxe r6 = r6.a(r14)     // Catch:{ Exception -> 0x02a9 }
            if (r6 != 0) goto L_0x0206
            goto L_0x023f
        L_0x0206:
            int r8 = r6.length()     // Catch:{ Exception -> 0x02a9 }
            if (r8 > 0) goto L_0x01b4
        L_0x020c:
            java.lang.CharSequence r6 = r12.n     // Catch:{ Exception -> 0x02a9 }
            if (r6 == 0) goto L_0x0217
            java.lang.CharSequence r6 = r12.n     // Catch:{ Exception -> 0x02a9 }
            java.lang.CharSequence r8 = r12.o     // Catch:{ Exception -> 0x02a9 }
            r5.a(r6, r8)     // Catch:{ Exception -> 0x02a9 }
        L_0x0217:
            r12.n = r7     // Catch:{ Exception -> 0x02a9 }
            r12.o = r7     // Catch:{ Exception -> 0x02a9 }
            boolean r5 = r12.a(r13)     // Catch:{ Exception -> 0x02a9 }
            if (r5 == 0) goto L_0x0228
            defpackage.wss.a(r13, r3)     // Catch:{ Exception -> 0x02a9 }
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.SKIP_CONTROL_CHARS     // Catch:{ Exception -> 0x02a9 }
        L_0x0226:
            r7 = r13
            goto L_0x023f
        L_0x0228:
            boolean r13 = defpackage.wss.a(r13)     // Catch:{ Exception -> 0x02a9 }
            if (r13 == 0) goto L_0x0231
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_CHUNK_SIZE     // Catch:{ Exception -> 0x02a9 }
            goto L_0x0226
        L_0x0231:
            long r5 = r12.g()     // Catch:{ Exception -> 0x02a9 }
            int r13 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r13 < 0) goto L_0x023c
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_FIXED_LENGTH_CONTENT     // Catch:{ Exception -> 0x02a9 }
            goto L_0x0226
        L_0x023c:
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_VARIABLE_LENGTH_CONTENT     // Catch:{ Exception -> 0x02a9 }
            goto L_0x0226
        L_0x023f:
            if (r7 != 0) goto L_0x0242
            return
        L_0x0242:
            r12.q = r7     // Catch:{ Exception -> 0x02a9 }
            int[] r13 = io.netty.handler.codec.http.HttpObjectDecoder.AnonymousClass1.a     // Catch:{ Exception -> 0x02a9 }
            int r3 = r7.ordinal()     // Catch:{ Exception -> 0x02a9 }
            r13 = r13[r3]     // Catch:{ Exception -> 0x02a9 }
            if (r13 == r4) goto L_0x029b
            if (r13 == r0) goto L_0x0289
            long r3 = r12.g()     // Catch:{ Exception -> 0x02a9 }
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 == 0) goto L_0x027b
            r0 = -1
            int r13 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            boolean r13 = r     // Catch:{ Exception -> 0x02a9 }
            if (r13 != 0) goto L_0x026f
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_FIXED_LENGTH_CONTENT     // Catch:{ Exception -> 0x02a9 }
            if (r7 == r13) goto L_0x026f
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_VARIABLE_LENGTH_CONTENT     // Catch:{ Exception -> 0x02a9 }
            if (r7 != r13) goto L_0x0269
            goto L_0x026f
        L_0x0269:
            java.lang.AssertionError r13 = new java.lang.AssertionError     // Catch:{ Exception -> 0x02a9 }
            r13.<init>()     // Catch:{ Exception -> 0x02a9 }
            throw r13     // Catch:{ Exception -> 0x02a9 }
        L_0x026f:
            wsi r13 = r12.j     // Catch:{ Exception -> 0x02a9 }
            r15.add(r13)     // Catch:{ Exception -> 0x02a9 }
            io.netty.handler.codec.http.HttpObjectDecoder$State r13 = io.netty.handler.codec.http.HttpObjectDecoder.State.READ_FIXED_LENGTH_CONTENT     // Catch:{ Exception -> 0x02a9 }
            if (r7 != r13) goto L_0x027a
            r12.k = r3     // Catch:{ Exception -> 0x02a9 }
        L_0x027a:
            return
        L_0x027b:
            wsi r13 = r12.j     // Catch:{ Exception -> 0x02a9 }
            r15.add(r13)     // Catch:{ Exception -> 0x02a9 }
            wsu r13 = defpackage.wsu.a     // Catch:{ Exception -> 0x02a9 }
            r15.add(r13)     // Catch:{ Exception -> 0x02a9 }
            r12.f()     // Catch:{ Exception -> 0x02a9 }
            return
        L_0x0289:
            boolean r13 = r12.g     // Catch:{ Exception -> 0x02a9 }
            if (r13 == 0) goto L_0x0293
            wsi r13 = r12.j     // Catch:{ Exception -> 0x02a9 }
            r15.add(r13)     // Catch:{ Exception -> 0x02a9 }
            return
        L_0x0293:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r0 = "Chunked messages not supported"
            r13.<init>(r0)     // Catch:{ Exception -> 0x02a9 }
            throw r13     // Catch:{ Exception -> 0x02a9 }
        L_0x029b:
            wsi r13 = r12.j     // Catch:{ Exception -> 0x02a9 }
            r15.add(r13)     // Catch:{ Exception -> 0x02a9 }
            wsu r13 = defpackage.wsu.a     // Catch:{ Exception -> 0x02a9 }
            r15.add(r13)     // Catch:{ Exception -> 0x02a9 }
            r12.f()     // Catch:{ Exception -> 0x02a9 }
            return
        L_0x02a9:
            r13 = move-exception
            wsi r13 = r12.a(r14, r13)
            r15.add(r13)
            return
        L_0x02b2:
            r13 = move-exception
            wsi r13 = r12.a(r14, r13)
            r15.add(r13)
        L_0x02ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.http.HttpObjectDecoder.a(wpb, wnb, java.util.List):void");
    }

    /* access modifiers changed from: protected */
    public boolean a(wsi wsi) {
        if (wsi instanceof wsp) {
            wsp wsp = (wsp) wsi;
            int i2 = wsp.f().b;
            if (i2 >= 100 && i2 < 200) {
                return i2 != 101 || wsp.d().d((CharSequence) wse.i) || !wsp.d().a((CharSequence) wse.l, (CharSequence) wsf.c, true);
            }
            if (i2 == 204 || i2 == 205 || i2 == 304) {
                return true;
            }
        }
        return false;
    }

    public final void b(wpb wpb, Object obj) {
        if (obj instanceof wsd) {
            int i2 = AnonymousClass1.a[this.q.ordinal()];
            if (i2 == 2 || i2 == 5 || i2 == 6) {
                this.m = true;
            }
        }
        super.b(wpb, obj);
    }

    public final void b(wpb wpb, wnb wnb, List<Object> list) {
        super.b(wpb, wnb, list);
        if (this.m) {
            f();
        }
        wsi wsi = this.j;
        if (wsi != null) {
            boolean a2 = wss.a(wsi);
            if (this.q == State.READ_VARIABLE_LENGTH_CONTENT && !wnb.f() && !a2) {
                list.add(wsu.a);
                f();
            } else if (this.q == State.READ_HEADER) {
                list.add(a(woc.a, (Exception) new PrematureChannelClosureException("Connection closed before received headers")));
                f();
            } else {
                boolean z = true;
                if (!a2 && g() <= 0) {
                    z = false;
                }
                if (!z) {
                    list.add(wsu.a);
                }
                f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract wsi e();
}
