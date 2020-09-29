package defpackage;

import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: fkp reason: default package */
public class fkp implements Closeable {
    private static final char[] c = ")]}'\n".toCharArray();
    public boolean a = false;
    int b = 0;
    private final Reader d;
    private final char[] e = new char[1024];
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private long j;
    private int k;
    private String l;
    private int[] m = new int[32];
    private int n = 0;
    private String[] o;
    private int[] p;

    static {
        fjr.a = new fjr() {
            public final void a(fkp fkp) {
                if (fkp instanceof fka) {
                    fka fka = (fka) fkp;
                    fka.a(JsonToken.NAME);
                    Entry entry = (Entry) ((Iterator) fka.g()).next();
                    fka.a(entry.getValue());
                    fka.a((Object) new fjf((String) entry.getKey()));
                    return;
                }
                int i = fkp.b;
                if (i == 0) {
                    i = fkp.q();
                }
                if (i == 13) {
                    fkp.b = 9;
                } else if (i == 12) {
                    fkp.b = 8;
                } else if (i == 14) {
                    fkp.b = 10;
                } else {
                    StringBuilder sb = new StringBuilder("Expected a name but was ");
                    sb.append(fkp.f());
                    sb.append(fkp.r());
                    throw new IllegalStateException(sb.toString());
                }
            }
        };
    }

    public fkp(Reader reader) {
        int[] iArr = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr[i2] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader != null) {
            this.d = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private int a(boolean z) {
        char[] cArr = this.e;
        int i2 = this.f;
        int i3 = this.g;
        while (true) {
            if (i2 == i3) {
                this.f = i2;
                if (b(1)) {
                    i2 = this.f;
                    i3 = this.g;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder("End of input");
                    sb.append(r());
                    throw new EOFException(sb.toString());
                }
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == 10) {
                this.h++;
                this.i = i4;
            } else if (!(c2 == ' ' || c2 == 13 || c2 == 9)) {
                if (c2 == '/') {
                    this.f = i4;
                    if (i4 == i3) {
                        this.f--;
                        boolean b2 = b(2);
                        this.f++;
                        if (!b2) {
                            return c2;
                        }
                    }
                    u();
                    int i5 = this.f;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f = i5 + 1;
                        if (a("*/")) {
                            i2 = this.f + 2;
                            i3 = this.g;
                        } else {
                            throw b("Unterminated comment");
                        }
                    } else if (c3 != '/') {
                        return c2;
                    } else {
                        this.f = i5 + 1;
                        v();
                        i2 = this.f;
                        i3 = this.g;
                    }
                } else if (c2 == '#') {
                    this.f = i4;
                    u();
                    v();
                    i2 = this.f;
                    i3 = this.g;
                } else {
                    this.f = i4;
                    return c2;
                }
            }
            i2 = i4;
        }
    }

    private void a(int i2) {
        int i3 = this.n;
        int[] iArr = this.m;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            int[] iArr3 = new int[(i3 << 1)];
            String[] strArr = new String[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.p, 0, iArr3, 0, this.n);
            System.arraycopy(this.o, 0, strArr, 0, this.n);
            this.m = iArr2;
            this.p = iArr3;
            this.o = strArr;
        }
        int[] iArr4 = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        iArr4[i4] = i2;
    }

    private boolean a(char c2) {
        if (!(c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ')) {
            if (c2 != '#') {
                if (c2 != ',') {
                    if (!(c2 == '/' || c2 == '=')) {
                        if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                            if (c2 != ';') {
                                switch (c2) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            u();
        }
        return false;
    }

    private boolean a(String str) {
        int length = str.length();
        while (true) {
            int i2 = 0;
            if (this.f + length > this.g && !b(length)) {
                return false;
            }
            char[] cArr = this.e;
            int i3 = this.f;
            if (cArr[i3] == 10) {
                this.h++;
                this.i = i3 + 1;
            } else {
                while (i2 < length) {
                    if (this.e[this.f + i2] == str.charAt(i2)) {
                        i2++;
                    }
                }
                return true;
            }
            this.f++;
        }
    }

    private IOException b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(r());
        throw new MalformedJsonException(sb.toString());
    }

    private String b(char c2) {
        char[] cArr = this.e;
        StringBuilder sb = null;
        do {
            int i2 = this.f;
            int i3 = this.g;
            int i4 = i2;
            while (i2 < i3) {
                int i5 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f = i5;
                    int i6 = (i5 - i4) - 1;
                    if (sb == null) {
                        return new String(cArr, i4, i6);
                    }
                    sb.append(cArr, i4, i6);
                    return sb.toString();
                } else if (c3 == '\\') {
                    this.f = i5;
                    int i7 = (i5 - i4) - 1;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i7 + 1) << 1, 16));
                    }
                    sb.append(cArr, i4, i7);
                    sb.append(w());
                    i4 = this.f;
                    i3 = this.g;
                    i2 = i4;
                } else {
                    if (c3 == 10) {
                        this.h++;
                        this.i = i5;
                    }
                    i2 = i5;
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i4) << 1, 16));
            }
            sb.append(cArr, i4, i2 - i4);
            this.f = i2;
        } while (b(1));
        throw b("Unterminated string");
    }

    private boolean b(int i2) {
        char[] cArr = this.e;
        int i3 = this.i;
        int i4 = this.f;
        this.i = i3 - i4;
        int i5 = this.g;
        if (i5 != i4) {
            this.g = i5 - i4;
            System.arraycopy(cArr, i4, cArr, 0, this.g);
        } else {
            this.g = 0;
        }
        this.f = 0;
        do {
            Reader reader = this.d;
            int i6 = this.g;
            int read = reader.read(cArr, i6, 1024 - i6);
            if (read == -1) {
                return false;
            }
            this.g += read;
            if (this.h == 0) {
                int i7 = this.i;
                if (i7 == 0 && this.g > 0 && cArr[0] == 65279) {
                    this.f++;
                    this.i = i7 + 1;
                    i2++;
                }
            }
        } while (this.g < i2);
        return true;
    }

    private void c(char c2) {
        char[] cArr = this.e;
        do {
            int i2 = this.f;
            int i3 = this.g;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f = i4;
                    return;
                } else if (c3 == '\\') {
                    this.f = i4;
                    w();
                    i2 = this.f;
                    i3 = this.g;
                } else {
                    if (c3 == 10) {
                        this.h++;
                        this.i = i4;
                    }
                    i2 = i4;
                }
            }
            this.f = i2;
        } while (b(1));
        throw b("Unterminated string");
    }

    private int g() {
        String str;
        String str2;
        int i2;
        char c2 = this.e[this.f];
        if (c2 == 't' || c2 == 'T') {
            i2 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i2 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c2 != 'n' && c2 != 'N') {
            return 0;
        } else {
            i2 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f + i3 >= this.g && !b(i3 + 1)) {
                return 0;
            }
            char c3 = this.e[this.f + i3];
            if (c3 != str2.charAt(i3) && c3 != str.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f + length < this.g || b(length + 1)) && a(this.e[this.f + length])) {
            return 0;
        }
        this.f += length;
        this.b = i2;
        return i2;
    }

    private int s() {
        char c2;
        char[] cArr = this.e;
        int i2 = this.f;
        int i3 = 0;
        int i4 = this.g;
        int i5 = 0;
        char c3 = 0;
        boolean z = true;
        long j2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 + i5 == i4) {
                if (i5 != 1024) {
                    if (!b(i5 + 1)) {
                        break;
                    }
                    i2 = this.f;
                    i4 = this.g;
                } else {
                    return i3;
                }
            }
            c2 = cArr[i2 + i5];
            if (c2 == '+') {
                i3 = 0;
                if (c3 != 5) {
                    return 0;
                }
            } else if (c2 == 'E' || c2 == 'e') {
                i3 = 0;
                if (c3 != 2 && c3 != 4) {
                    return 0;
                }
                c3 = 5;
                i5++;
            } else {
                if (c2 == '-') {
                    i3 = 0;
                    if (c3 == 0) {
                        c3 = 1;
                        z2 = true;
                    } else if (c3 != 5) {
                        return 0;
                    }
                } else if (c2 == '.') {
                    i3 = 0;
                    if (c3 != 2) {
                        return 0;
                    }
                    c3 = 3;
                } else if (c2 >= '0' && c2 <= '9') {
                    if (c3 == 1 || c3 == 0) {
                        j2 = (long) (-(c2 - '0'));
                        i3 = 0;
                        c3 = 2;
                    } else {
                        if (c3 == 2) {
                            if (j2 == 0) {
                                return 0;
                            }
                            long j3 = (10 * j2) - ((long) (c2 - '0'));
                            boolean z3 = j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                            j2 = j3;
                            z = z3 & z;
                        } else if (c3 == 3) {
                            i3 = 0;
                            c3 = 4;
                        } else if (c3 == 5 || c3 == 6) {
                            i3 = 0;
                            c3 = 7;
                        }
                        i3 = 0;
                    }
                }
                i5++;
            }
            c3 = 6;
            i5++;
        }
        if (a(c2)) {
            return 0;
        }
        if (c3 == 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != 0 || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.j = j2;
            this.f += i5;
            this.b = 15;
            return 15;
        } else if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        } else {
            this.k = i5;
            this.b = 16;
            return 16;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        u();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String t() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L_0x0003:
            r1 = 0
        L_0x0004:
            int r3 = r6.f
            int r4 = r3 + r1
            int r5 = r6.g
            if (r4 >= r5) goto L_0x004f
            char[] r4 = r6.e
            int r3 = r3 + r1
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004b
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004b
            r4 = 61
            if (r3 == r4) goto L_0x004b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004b
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004b;
                case 93: goto L_0x005c;
                default: goto L_0x0048;
            }
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x004b:
            r6.u()
            goto L_0x005c
        L_0x004f:
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 >= r3) goto L_0x005e
            int r3 = r1 + 1
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0004
        L_0x005c:
            r0 = r1
            goto L_0x007e
        L_0x005e:
            if (r2 != 0) goto L_0x006b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r1, r3)
            r2.<init>(r3)
        L_0x006b:
            char[] r3 = r6.e
            int r4 = r6.f
            r2.append(r3, r4, r1)
            int r3 = r6.f
            int r3 = r3 + r1
            r6.f = r3
            r1 = 1
            boolean r1 = r6.b(r1)
            if (r1 != 0) goto L_0x0003
        L_0x007e:
            if (r2 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.e
            int r3 = r6.f
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r1 = r6.e
            int r3 = r6.f
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L_0x0095:
            int r2 = r6.f
            int r2 = r2 + r0
            r6.f = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkp.t():java.lang.String");
    }

    private void u() {
        if (!this.a) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void v() {
        char c2;
        do {
            if (this.f >= this.g && !b(1)) {
                break;
            }
            char[] cArr = this.e;
            int i2 = this.f;
            this.f = i2 + 1;
            c2 = cArr[i2];
            if (c2 == 10) {
                this.h++;
                this.i = this.f;
                return;
            }
        } while (c2 != 13);
    }

    private char w() {
        int i2;
        int i3;
        String str = "Unterminated escape sequence";
        if (this.f != this.g || b(1)) {
            char[] cArr = this.e;
            int i4 = this.f;
            this.f = i4 + 1;
            char c2 = cArr[i4];
            if (c2 == 10) {
                this.h++;
                this.i = this.f;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return 8;
                }
                if (c2 == 'f') {
                    return 12;
                }
                if (c2 == 'n') {
                    return 10;
                }
                if (c2 == 'r') {
                    return 13;
                }
                if (c2 == 't') {
                    return 9;
                }
                if (c2 != 'u') {
                    throw b("Invalid escape sequence");
                } else if (this.f + 4 <= this.g || b(4)) {
                    char c3 = 0;
                    int i5 = this.f;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c4 = this.e[i5];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i2 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                StringBuilder sb = new StringBuilder("\\u");
                                sb.append(new String(this.e, this.f, 4));
                                throw new NumberFormatException(sb.toString());
                            } else {
                                i2 = c4 - 'A';
                            }
                            i3 = i2 + 10;
                        } else {
                            i3 = c4 - '0';
                        }
                        c3 = (char) (c5 + i3);
                        i5++;
                    }
                    this.f += 4;
                    return c3;
                } else {
                    throw b(str);
                }
            }
            return c2;
        }
        throw b(str);
    }

    private void x() {
        a(true);
        this.f--;
        int i2 = this.f;
        char[] cArr = c;
        if (i2 + cArr.length <= this.g || b(cArr.length)) {
            int i3 = 0;
            while (true) {
                char[] cArr2 = c;
                if (i3 >= cArr2.length) {
                    this.f += cArr2.length;
                    return;
                } else if (this.e[this.f + i3] == cArr2[i3]) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public void a() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 3) {
            a(1);
            this.p[this.n - 1] = 0;
            this.b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(f());
        sb.append(r());
        throw new IllegalStateException(sb.toString());
    }

    public void b() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 4) {
            this.n--;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            this.b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(f());
        sb.append(r());
        throw new IllegalStateException(sb.toString());
    }

    public void c() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 1) {
            a(3);
            this.b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(f());
        sb.append(r());
        throw new IllegalStateException(sb.toString());
    }

    public void close() {
        this.b = 0;
        this.m[0] = 8;
        this.n = 1;
        this.d.close();
    }

    public void d() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 2) {
            this.n--;
            String[] strArr = this.o;
            int i3 = this.n;
            strArr[i3] = null;
            int[] iArr = this.p;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(f());
        sb.append(r());
        throw new IllegalStateException(sb.toString());
    }

    public boolean e() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public JsonToken f() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        switch (i2) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String h() {
        String str;
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 14) {
            str = t();
        } else if (i2 == 12) {
            str = b('\'');
        } else if (i2 == 13) {
            str = b('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(f());
            sb.append(r());
            throw new IllegalStateException(sb.toString());
        }
        this.b = 0;
        this.o[this.n - 1] = str;
        return str;
    }

    public String i() {
        String str;
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 10) {
            str = t();
        } else if (i2 == 8) {
            str = b('\'');
        } else if (i2 == 9) {
            str = b('\"');
        } else if (i2 == 11) {
            str = this.l;
            this.l = null;
        } else if (i2 == 15) {
            str = Long.toString(this.j);
        } else if (i2 == 16) {
            str = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(f());
            sb.append(r());
            throw new IllegalStateException(sb.toString());
        }
        this.b = 0;
        int[] iArr = this.p;
        int i3 = this.n - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public boolean j() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 5) {
            this.b = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.b = 0;
            int[] iArr2 = this.p;
            int i4 = this.n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(f());
            sb.append(r());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void k() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 7) {
            this.b = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(f());
        sb.append(r());
        throw new IllegalStateException(sb.toString());
    }

    public double l() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 15) {
            this.b = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.j;
        }
        if (i2 == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i2 == 8 || i2 == 9) {
            this.l = b(i2 == 8 ? '\'' : '\"');
        } else if (i2 == 10) {
            this.l = t();
        } else if (i2 != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(f());
            sb.append(r());
            throw new IllegalStateException(sb.toString());
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.l);
        if (this.a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.l = null;
            this.b = 0;
            int[] iArr2 = this.p;
            int i4 = this.n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(r());
        throw new MalformedJsonException(sb2.toString());
    }

    public long m() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        if (i2 == 15) {
            this.b = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.j;
        }
        String str = "Expected a long but was ";
        if (i2 == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.l = t();
            } else {
                this.l = b(i2 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.l);
                this.b = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder(str);
            sb.append(f());
            sb.append(r());
            throw new IllegalStateException(sb.toString());
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.l);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.l = null;
            this.b = 0;
            int[] iArr3 = this.p;
            int i5 = this.n - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(this.l);
        sb2.append(r());
        throw new NumberFormatException(sb2.toString());
    }

    public int n() {
        int i2 = this.b;
        if (i2 == 0) {
            i2 = q();
        }
        String str = "Expected an int but was ";
        if (i2 == 15) {
            long j2 = this.j;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.b = 0;
                int[] iArr = this.p;
                int i4 = this.n - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(this.j);
            sb.append(r());
            throw new NumberFormatException(sb.toString());
        }
        if (i2 == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.l = t();
            } else {
                this.l = b(i2 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.l);
                this.b = 0;
                int[] iArr2 = this.p;
                int i5 = this.n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(f());
            sb2.append(r());
            throw new IllegalStateException(sb2.toString());
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.l);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.l = null;
            this.b = 0;
            int[] iArr3 = this.p;
            int i7 = this.n - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(this.l);
        sb3.append(r());
        throw new NumberFormatException(sb3.toString());
    }

    public void o() {
        int i2;
        int i3 = 0;
        do {
            int i4 = this.b;
            if (i4 == 0) {
                i4 = q();
            }
            if (i4 == 3) {
                a(1);
            } else if (i4 == 1) {
                a(3);
            } else {
                if (i4 == 4) {
                    this.n--;
                } else if (i4 == 2) {
                    this.n--;
                } else if (i4 == 14 || i4 == 10) {
                    while (true) {
                        i2 = 0;
                        while (true) {
                            int i5 = this.f;
                            if (i5 + i2 < this.g) {
                                char c2 = this.e[i5 + i2];
                                if (!(c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ')) {
                                    if (c2 != '#') {
                                        if (c2 != ',') {
                                            if (!(c2 == '/' || c2 == '=')) {
                                                if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                                                    if (c2 != ';') {
                                                        switch (c2) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f = i5 + i2;
                                if (!b(1)) {
                                }
                            }
                        }
                    }
                    u();
                    this.f += i2;
                    this.b = 0;
                } else if (i4 == 8 || i4 == 12) {
                    c('\'');
                    this.b = 0;
                } else if (i4 == 9 || i4 == 13) {
                    c('\"');
                    this.b = 0;
                } else {
                    if (i4 == 16) {
                        this.f += this.k;
                    }
                    this.b = 0;
                }
                i3--;
                this.b = 0;
            }
            i3++;
            this.b = 0;
        } while (i3 != 0);
        int[] iArr = this.p;
        int i6 = this.n;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.o[i6 - 1] = "null";
    }

    public String p() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.n;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.m[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.p[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.o;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final int q() {
        int[] iArr = this.m;
        int i2 = this.n;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int a2 = a(true);
            if (a2 != 44) {
                if (a2 == 59) {
                    u();
                } else if (a2 == 93) {
                    this.b = 4;
                    return 4;
                } else {
                    throw b("Unterminated array");
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            this.m[this.n - 1] = 4;
            if (i3 == 5) {
                int a3 = a(true);
                if (a3 != 44) {
                    if (a3 == 59) {
                        u();
                    } else if (a3 == 125) {
                        this.b = 2;
                        return 2;
                    } else {
                        throw b("Unterminated object");
                    }
                }
            }
            int a4 = a(true);
            if (a4 == 34) {
                this.b = 13;
                return 13;
            } else if (a4 != 39) {
                String str = "Expected name";
                if (a4 != 125) {
                    u();
                    this.f--;
                    if (a((char) a4)) {
                        this.b = 14;
                        return 14;
                    }
                    throw b(str);
                } else if (i3 != 5) {
                    this.b = 2;
                    return 2;
                } else {
                    throw b(str);
                }
            } else {
                u();
                this.b = 12;
                return 12;
            }
        } else if (i3 == 4) {
            iArr[i2 - 1] = 5;
            int a5 = a(true);
            if (a5 != 58) {
                if (a5 == 61) {
                    u();
                    if (this.f < this.g || b(1)) {
                        char[] cArr = this.e;
                        int i4 = this.f;
                        if (cArr[i4] == '>') {
                            this.f = i4 + 1;
                        }
                    }
                } else {
                    throw b("Expected ':'");
                }
            }
        } else if (i3 == 6) {
            if (this.a) {
                x();
            }
            this.m[this.n - 1] = 7;
        } else if (i3 == 7) {
            if (a(false) == -1) {
                this.b = 17;
                return 17;
            }
            u();
            this.f--;
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a6 = a(true);
        if (a6 == 34) {
            this.b = 9;
            return 9;
        } else if (a6 != 39) {
            if (!(a6 == 44 || a6 == 59)) {
                if (a6 == 91) {
                    this.b = 3;
                    return 3;
                } else if (a6 != 93) {
                    if (a6 != 123) {
                        this.f--;
                        int g2 = g();
                        if (g2 != 0) {
                            return g2;
                        }
                        int s = s();
                        if (s != 0) {
                            return s;
                        }
                        if (a(this.e[this.f])) {
                            u();
                            this.b = 10;
                            return 10;
                        }
                        throw b("Expected value");
                    }
                    this.b = 1;
                    return 1;
                } else if (i3 == 1) {
                    this.b = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                u();
                this.f--;
                this.b = 7;
                return 7;
            }
            throw b("Unexpected value");
        } else {
            u();
            this.b = 8;
            return 8;
        }
    }

    /* access modifiers changed from: 0000 */
    public final String r() {
        int i2 = this.h + 1;
        int i3 = (this.f - this.i) + 1;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i2);
        sb.append(" column ");
        sb.append(i3);
        sb.append(" path ");
        sb.append(p());
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(r());
        return sb.toString();
    }
}
