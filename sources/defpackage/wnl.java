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

/* renamed from: wnl reason: default package */
final class wnl {
    static final wnk[] a;
    static final Map<ByteString, Integer> b;

    /* renamed from: wnl$a */
    static final class a {
        private final List<wnk> a;
        private final wom b;
        private final int c;
        private int d;
        private wnk[] e;
        private int f;
        private int g;
        private int h;

        a(int i, wpa wpa) {
            this(4096, 4096, wpa);
        }

        private a(int i, int i2, wpa wpa) {
            this.a = new ArrayList();
            this.e = new wnk[8];
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = wou.a(wpa);
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

        private int a(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    if (length < this.f || i <= 0) {
                        wnk[] wnkArr = this.e;
                        int i3 = this.f;
                        System.arraycopy(wnkArr, i3 + 1, wnkArr, i3 + 1 + i2, this.g);
                        this.f += i2;
                    } else {
                        i -= this.e[length].i;
                        this.h -= this.e[length].i;
                        this.g--;
                        i2++;
                    }
                }
                wnk[] wnkArr2 = this.e;
                int i32 = this.f;
                System.arraycopy(wnkArr2, i32 + 1, wnkArr2, i32 + 1 + i2, this.g);
                this.f += i2;
            }
            return i2;
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
                        this.a.add(wnl.a[a2]);
                    } else {
                        wnk[] wnkArr = wnl.a;
                        int b2 = b(a2 - 61);
                        if (b2 >= 0) {
                            wnk[] wnkArr2 = this.e;
                            if (b2 < wnkArr2.length) {
                                this.a.add(wnkArr2[b2]);
                            }
                        }
                        StringBuilder sb = new StringBuilder("Header index too large ");
                        sb.append(a2 + 1);
                        throw new IOException(sb.toString());
                    }
                } else if (f2 == 64) {
                    a(-1, new wnk(wnl.a(f()), f()));
                } else if ((f2 & 64) == 64) {
                    a(-1, new wnk(c(a((int) f2, 63) - 1), f()));
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
                    this.a.add(new wnk(wnl.a(f()), f()));
                } else {
                    this.a.add(new wnk(c(a((int) f2, 15) - 1), f()));
                }
            }
        }

        public final List<wnk> b() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        private int b(int i) {
            return this.f + 1 + i;
        }

        private ByteString c(int i) {
            if (d(i)) {
                return wnl.a[i].g;
            }
            wnk[] wnkArr = wnl.a;
            int b2 = b(i - 61);
            if (b2 >= 0) {
                wnk[] wnkArr2 = this.e;
                if (b2 < wnkArr2.length) {
                    return wnkArr2[b2].g;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        private static boolean d(int i) {
            if (i >= 0) {
                wnk[] wnkArr = wnl.a;
                if (i <= 60) {
                    return true;
                }
            }
            return false;
        }

        private void a(int i, wnk wnk) {
            this.a.add(wnk);
            int i2 = wnk.i;
            int i3 = this.d;
            if (i2 > i3) {
                d();
                return;
            }
            a((this.h + i2) - i3);
            int i4 = this.g + 1;
            wnk[] wnkArr = this.e;
            if (i4 > wnkArr.length) {
                wnk[] wnkArr2 = new wnk[(wnkArr.length << 1)];
                System.arraycopy(wnkArr, 0, wnkArr2, wnkArr.length, wnkArr.length);
                this.f = this.e.length - 1;
                this.e = wnkArr2;
            }
            int i5 = this.f;
            this.f = i5 - 1;
            this.e[i5] = wnk;
            this.g++;
            this.h += i2;
        }

        private int e() {
            return this.b.f() & 255;
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

        private ByteString f() {
            int e2 = e();
            boolean z = (e2 & 128) == 128;
            int a2 = a(e2, 127);
            if (z) {
                return ByteString.a(wns.a().a(this.b.h((long) a2)));
            }
            return this.b.d((long) a2);
        }
    }

    /* renamed from: wnl$b */
    static final class b {
        private final wok a;
        private final boolean b;
        private int c;
        private boolean d;
        private int e;
        private int f;
        private wnk[] g;
        private int h;
        private int i;
        private int j;

        b(wok wok) {
            this(4096, true, wok);
        }

        private b(int i2, boolean z, wok wok) {
            this.c = Integer.MAX_VALUE;
            this.g = new wnk[8];
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
            this.e = 4096;
            this.f = 4096;
            this.b = true;
            this.a = wok;
        }

        private void a() {
            Arrays.fill(this.g, null);
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        private int b(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.g.length;
                while (true) {
                    length--;
                    if (length < this.h || i2 <= 0) {
                        wnk[] wnkArr = this.g;
                        int i4 = this.h;
                        System.arraycopy(wnkArr, i4 + 1, wnkArr, i4 + 1 + i3, this.i);
                        wnk[] wnkArr2 = this.g;
                        int i5 = this.h;
                        Arrays.fill(wnkArr2, i5 + 1, i5 + 1 + i3, null);
                        this.h += i3;
                    } else {
                        i2 -= this.g[length].i;
                        this.j -= this.g[length].i;
                        this.i--;
                        i3++;
                    }
                }
                wnk[] wnkArr3 = this.g;
                int i42 = this.h;
                System.arraycopy(wnkArr3, i42 + 1, wnkArr3, i42 + 1 + i3, this.i);
                wnk[] wnkArr22 = this.g;
                int i52 = this.h;
                Arrays.fill(wnkArr22, i52 + 1, i52 + 1 + i3, null);
                this.h += i3;
            }
            return i3;
        }

        private void a(wnk wnk) {
            int i2 = wnk.i;
            int i3 = this.f;
            if (i2 > i3) {
                a();
                return;
            }
            b((this.j + i2) - i3);
            int i4 = this.i + 1;
            wnk[] wnkArr = this.g;
            if (i4 > wnkArr.length) {
                wnk[] wnkArr2 = new wnk[(wnkArr.length << 1)];
                System.arraycopy(wnkArr, 0, wnkArr2, wnkArr.length, wnkArr.length);
                this.h = this.g.length - 1;
                this.g = wnkArr2;
            }
            int i5 = this.h;
            this.h = i5 - 1;
            this.g[i5] = wnk;
            this.i++;
            this.j += i2;
        }

        /* access modifiers changed from: 0000 */
        public final void a(List<wnk> list) {
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
                wnk wnk = (wnk) list.get(i5);
                ByteString g2 = wnk.g.g();
                ByteString byteString = wnk.h;
                Integer num = (Integer) wnl.b.get(g2);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (wmk.a((Object) wnl.a[i3 - 1].h, (Object) byteString)) {
                            i2 = i3;
                        } else if (wmk.a((Object) wnl.a[i3].h, (Object) byteString)) {
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
                        if (wmk.a((Object) this.g[i6].g, (Object) g2)) {
                            if (wmk.a((Object) this.g[i6].h, (Object) byteString)) {
                                int i7 = i6 - this.h;
                                wnk[] wnkArr = wnl.a;
                                i3 = i7 + 61;
                                break;
                            } else if (i2 == -1) {
                                int i8 = i6 - this.h;
                                wnk[] wnkArr2 = wnl.a;
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
                    a(wnk);
                } else {
                    ByteString byteString2 = wnk.a;
                    if (!g2.a(0, byteString2, 0, byteString2.h()) || wnk.f.equals(g2)) {
                        a(i2, 63, 64);
                        a(byteString);
                        a(wnk);
                    } else {
                        a(i2, 15, 0);
                        a(byteString);
                    }
                }
            }
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
                wns.a();
                if (wns.a(byteString) < byteString.h()) {
                    wok wok = new wok();
                    wns.a();
                    wns.a(byteString, wok);
                    ByteString n = wok.n();
                    a(n.h(), 127, 128);
                    this.a.b(n);
                    return;
                }
            }
            a(byteString.h(), 127, 0);
            this.a.b(byteString);
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
    }

    static {
        String str = "";
        a = new wnk[]{new wnk(wnk.f, str), new wnk(wnk.c, Request.GET), new wnk(wnk.c, Request.POST), new wnk(wnk.d, "/"), new wnk(wnk.d, "/index.html"), new wnk(wnk.e, "http"), new wnk(wnk.e, "https"), new wnk(wnk.b, "200"), new wnk(wnk.b, "204"), new wnk(wnk.b, "206"), new wnk(wnk.b, "304"), new wnk(wnk.b, "400"), new wnk(wnk.b, "404"), new wnk(wnk.b, "500"), new wnk("accept-charset", str), new wnk("accept-encoding", "gzip, deflate"), new wnk("accept-language", str), new wnk("accept-ranges", str), new wnk("accept", str), new wnk("access-control-allow-origin", str), new wnk("age", str), new wnk("allow", str), new wnk("authorization", str), new wnk("cache-control", str), new wnk("content-disposition", str), new wnk("content-encoding", str), new wnk("content-language", str), new wnk("content-length", str), new wnk("content-location", str), new wnk("content-range", str), new wnk("content-type", str), new wnk("cookie", str), new wnk("date", str), new wnk("etag", str), new wnk("expect", str), new wnk("expires", str), new wnk("from", str), new wnk("host", str), new wnk("if-match", str), new wnk("if-modified-since", str), new wnk("if-none-match", str), new wnk("if-range", str), new wnk("if-unmodified-since", str), new wnk("last-modified", str), new wnk("link", str), new wnk("location", str), new wnk("max-forwards", str), new wnk("proxy-authenticate", str), new wnk("proxy-authorization", str), new wnk("range", str), new wnk("referer", str), new wnk("refresh", str), new wnk("retry-after", str), new wnk("server", str), new wnk("set-cookie", str), new wnk("strict-transport-security", str), new wnk("transfer-encoding", str), new wnk("user-agent", str), new wnk("vary", str), new wnk("via", str), new wnk("www-authenticate", str)};
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
