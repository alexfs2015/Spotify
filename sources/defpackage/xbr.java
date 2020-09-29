package defpackage;

import com.spotify.cosmos.router.Request;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* renamed from: xbr reason: default package */
final class xbr {
    static final xbq[] a;
    static final Map<ByteString, Integer> b;

    /* renamed from: xbr$a */
    static final class a {
        private final List<xbq> a;
        private final xcs b;
        private final int c;
        private int d;
        private xbq[] e;
        private int f;
        private int g;
        private int h;

        private a(int i, int i2, xdg xdg) {
            this.a = new ArrayList();
            this.e = new xbq[8];
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = xda.a(xdg);
        }

        a(int i, xdg xdg) {
            this(4096, 4096, xdg);
        }

        private int a(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    if (length < this.f || i <= 0) {
                        xbq[] xbqArr = this.e;
                        int i3 = this.f;
                        System.arraycopy(xbqArr, i3 + 1, xbqArr, i3 + 1 + i2, this.g);
                        this.f += i2;
                    } else {
                        i -= this.e[length].i;
                        this.h -= this.e[length].i;
                        this.g--;
                        i2++;
                    }
                }
                xbq[] xbqArr2 = this.e;
                int i32 = this.f;
                System.arraycopy(xbqArr2, i32 + 1, xbqArr2, i32 + 1 + i2, this.g);
                this.f += i2;
            }
            return i2;
        }

        private int a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int e2 = e();
                if ((e2 & 128) == 0) {
                    return i2 + (e2 << i4);
                }
                i2 += (e2 & 127) << i4;
                i4 += 7;
            }
        }

        private void a(int i, xbq xbq) {
            this.a.add(xbq);
            int i2 = xbq.i;
            int i3 = this.d;
            if (i2 > i3) {
                d();
                return;
            }
            a((this.h + i2) - i3);
            int i4 = this.g + 1;
            xbq[] xbqArr = this.e;
            if (i4 > xbqArr.length) {
                xbq[] xbqArr2 = new xbq[(xbqArr.length << 1)];
                System.arraycopy(xbqArr, 0, xbqArr2, xbqArr.length, xbqArr.length);
                this.f = this.e.length - 1;
                this.e = xbqArr2;
            }
            int i5 = this.f;
            this.f = i5 - 1;
            this.e[i5] = xbq;
            this.g++;
            this.h += i2;
        }

        private int b(int i) {
            return this.f + 1 + i;
        }

        private ByteString c(int i) {
            if (d(i)) {
                return xbr.a[i].g;
            }
            xbq[] xbqArr = xbr.a;
            int b2 = b(i - 61);
            if (b2 >= 0) {
                xbq[] xbqArr2 = this.e;
                if (b2 < xbqArr2.length) {
                    return xbqArr2[b2].g;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        private void c() {
            int i = this.d;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    d();
                    return;
                }
                a(i2 - i);
            }
        }

        private void d() {
            Arrays.fill(this.e, null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private static boolean d(int i) {
            if (i >= 0) {
                xbq[] xbqArr = xbr.a;
                if (i <= 60) {
                    return true;
                }
            }
            return false;
        }

        private int e() {
            return this.b.f() & 255;
        }

        private ByteString f() {
            int e2 = e();
            boolean z = (e2 & 128) == 128;
            int a2 = a(e2, 127);
            return z ? ByteString.a(xby.a().a(this.b.h((long) a2))) : this.b.d((long) a2);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            while (!this.b.c()) {
                byte f2 = this.b.f() & 255;
                if (f2 == 128) {
                    throw new IOException("index == 0");
                } else if ((f2 & 128) == 128) {
                    int a2 = a((int) f2, 127) - 1;
                    if (d(a2)) {
                        this.a.add(xbr.a[a2]);
                    } else {
                        xbq[] xbqArr = xbr.a;
                        int b2 = b(a2 - 61);
                        if (b2 >= 0) {
                            xbq[] xbqArr2 = this.e;
                            if (b2 < xbqArr2.length) {
                                this.a.add(xbqArr2[b2]);
                            }
                        }
                        StringBuilder sb = new StringBuilder("Header index too large ");
                        sb.append(a2 + 1);
                        throw new IOException(sb.toString());
                    }
                } else if (f2 == 64) {
                    a(-1, new xbq(xbr.a(f()), f()));
                } else if ((f2 & 64) == 64) {
                    a(-1, new xbq(c(a((int) f2, 63) - 1), f()));
                } else if ((f2 & 32) == 32) {
                    this.d = a((int) f2, 31);
                    int i = this.d;
                    if (i < 0 || i > this.c) {
                        StringBuilder sb2 = new StringBuilder("Invalid dynamic table size update ");
                        sb2.append(this.d);
                        throw new IOException(sb2.toString());
                    }
                    c();
                } else if (f2 == 16 || f2 == 0) {
                    this.a.add(new xbq(xbr.a(f()), f()));
                } else {
                    this.a.add(new xbq(c(a((int) f2, 15) - 1), f()));
                }
            }
        }

        public final List<xbq> b() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }
    }

    /* renamed from: xbr$b */
    static final class b {
        private final xcq a;
        private final boolean b;
        private int c;
        private boolean d;
        private int e;
        private int f;
        private xbq[] g;
        private int h;
        private int i;
        private int j;

        private b(int i2, boolean z, xcq xcq) {
            this.c = Integer.MAX_VALUE;
            this.g = new xbq[8];
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
            this.e = 4096;
            this.f = 4096;
            this.b = true;
            this.a = xcq;
        }

        b(xcq xcq) {
            this(4096, true, xcq);
        }

        private void a() {
            Arrays.fill(this.g, null);
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        private void a(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.a.j(i2 | i4);
                return;
            }
            this.a.j(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.a.j(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.a.j(i5);
        }

        private void a(ByteString byteString) {
            if (this.b) {
                xby.a();
                if (xby.a(byteString) < byteString.h()) {
                    xcq xcq = new xcq();
                    xby.a();
                    xby.a(byteString, xcq);
                    ByteString n = xcq.n();
                    a(n.h(), 127, 128);
                    this.a.b(n);
                    return;
                }
            }
            a(byteString.h(), 127, 0);
            this.a.b(byteString);
        }

        private void a(xbq xbq) {
            int i2 = xbq.i;
            int i3 = this.f;
            if (i2 > i3) {
                a();
                return;
            }
            b((this.j + i2) - i3);
            int i4 = this.i + 1;
            xbq[] xbqArr = this.g;
            if (i4 > xbqArr.length) {
                xbq[] xbqArr2 = new xbq[(xbqArr.length << 1)];
                System.arraycopy(xbqArr, 0, xbqArr2, xbqArr.length, xbqArr.length);
                this.h = this.g.length - 1;
                this.g = xbqArr2;
            }
            int i5 = this.h;
            this.h = i5 - 1;
            this.g[i5] = xbq;
            this.i++;
            this.j += i2;
        }

        private int b(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.g.length;
                while (true) {
                    length--;
                    if (length < this.h || i2 <= 0) {
                        xbq[] xbqArr = this.g;
                        int i4 = this.h;
                        System.arraycopy(xbqArr, i4 + 1, xbqArr, i4 + 1 + i3, this.i);
                        xbq[] xbqArr2 = this.g;
                        int i5 = this.h;
                        Arrays.fill(xbqArr2, i5 + 1, i5 + 1 + i3, null);
                        this.h += i3;
                    } else {
                        i2 -= this.g[length].i;
                        this.j -= this.g[length].i;
                        this.i--;
                        i3++;
                    }
                }
                xbq[] xbqArr3 = this.g;
                int i42 = this.h;
                System.arraycopy(xbqArr3, i42 + 1, xbqArr3, i42 + 1 + i3, this.i);
                xbq[] xbqArr22 = this.g;
                int i52 = this.h;
                Arrays.fill(xbqArr22, i52 + 1, i52 + 1 + i3, null);
                this.h += i3;
            }
            return i3;
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2) {
            this.e = i2;
            int min = Math.min(i2, 16384);
            int i3 = this.f;
            if (i3 != min) {
                if (min < i3) {
                    this.c = Math.min(this.c, min);
                }
                this.d = true;
                this.f = min;
                int i4 = this.f;
                int i5 = this.j;
                if (i4 < i5) {
                    if (i4 == 0) {
                        a();
                        return;
                    }
                    b(i5 - i4);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(List<xbq> list) {
            int i2;
            int i3;
            if (this.d) {
                int i4 = this.c;
                if (i4 < this.f) {
                    a(i4, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                a(this.f, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                xbq xbq = (xbq) list.get(i5);
                ByteString g2 = xbq.g.g();
                ByteString byteString = xbq.h;
                Integer num = (Integer) xbr.b.get(g2);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (xaq.a((Object) xbr.a[i3 - 1].h, (Object) byteString)) {
                            i2 = i3;
                        } else if (xaq.a((Object) xbr.a[i3].h, (Object) byteString)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.h + 1;
                    int length = this.g.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (xaq.a((Object) this.g[i6].g, (Object) g2)) {
                            if (xaq.a((Object) this.g[i6].h, (Object) byteString)) {
                                int i7 = i6 - this.h;
                                xbq[] xbqArr = xbr.a;
                                i3 = i7 + 61;
                                break;
                            } else if (i2 == -1) {
                                int i8 = i6 - this.h;
                                xbq[] xbqArr2 = xbr.a;
                                i2 = i8 + 61;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    a(i3, 127, 128);
                } else if (i2 == -1) {
                    this.a.j(64);
                    a(g2);
                    a(byteString);
                    a(xbq);
                } else {
                    ByteString byteString2 = xbq.a;
                    if (!g2.a(0, byteString2, 0, byteString2.h()) || xbq.f.equals(g2)) {
                        a(i2, 63, 64);
                        a(byteString);
                        a(xbq);
                    } else {
                        a(i2, 15, 0);
                        a(byteString);
                    }
                }
            }
        }
    }

    static {
        String str = "";
        a = new xbq[]{new xbq(xbq.f, str), new xbq(xbq.c, Request.GET), new xbq(xbq.c, Request.POST), new xbq(xbq.d, "/"), new xbq(xbq.d, "/index.html"), new xbq(xbq.e, "http"), new xbq(xbq.e, "https"), new xbq(xbq.b, "200"), new xbq(xbq.b, "204"), new xbq(xbq.b, "206"), new xbq(xbq.b, "304"), new xbq(xbq.b, "400"), new xbq(xbq.b, "404"), new xbq(xbq.b, "500"), new xbq("accept-charset", str), new xbq("accept-encoding", "gzip, deflate"), new xbq("accept-language", str), new xbq("accept-ranges", str), new xbq("accept", str), new xbq("access-control-allow-origin", str), new xbq("age", str), new xbq("allow", str), new xbq("authorization", str), new xbq("cache-control", str), new xbq("content-disposition", str), new xbq("content-encoding", str), new xbq("content-language", str), new xbq("content-length", str), new xbq("content-location", str), new xbq("content-range", str), new xbq("content-type", str), new xbq("cookie", str), new xbq("date", str), new xbq("etag", str), new xbq("expect", str), new xbq("expires", str), new xbq("from", str), new xbq("host", str), new xbq("if-match", str), new xbq("if-modified-since", str), new xbq("if-none-match", str), new xbq("if-range", str), new xbq("if-unmodified-since", str), new xbq("last-modified", str), new xbq("link", str), new xbq("location", str), new xbq("max-forwards", str), new xbq("proxy-authenticate", str), new xbq("proxy-authorization", str), new xbq("range", str), new xbq("referer", str), new xbq("refresh", str), new xbq("retry-after", str), new xbq("server", str), new xbq("set-cookie", str), new xbq("strict-transport-security", str), new xbq("transfer-encoding", str), new xbq("user-agent", str), new xbq("vary", str), new xbq("via", str), new xbq("www-authenticate", str)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(a[i].g)) {
                linkedHashMap.put(a[i].g, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    static ByteString a(ByteString byteString) {
        int h = byteString.h();
        int i = 0;
        while (i < h) {
            byte a2 = byteString.a(i);
            if (a2 < 65 || a2 > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(byteString.a());
                throw new IOException(sb.toString());
            }
        }
        return byteString;
    }
}
