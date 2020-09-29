package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;

/* renamed from: atj reason: default package */
final class atj implements atk {
    private final byte[] a = new byte[8];
    private final ArrayDeque<a> b = new ArrayDeque<>();
    private final ato c = new ato();
    private atl d;
    private int e;
    private int f;
    private long g;

    /* renamed from: atj$a */
    static final class a {
        final int a;
        final long b;

        /* synthetic */ a(int i, long j, byte b2) {
            this(i, j);
        }

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public final void a(atl atl) {
        this.d = atl;
    }

    public final void a() {
        this.e = 0;
        this.b.clear();
        this.c.a();
    }

    public final boolean a(asu asu) {
        double d2;
        int a2;
        int a3;
        bcu.b(this.d != null);
        while (true) {
            if (this.b.isEmpty() || asu.c() < ((a) this.b.peek()).b) {
                if (this.e == 0) {
                    long a4 = this.c.a(asu, true, false, 4);
                    if (a4 == -2) {
                        asu.a();
                        while (true) {
                            asu.c(this.a, 0, 4);
                            a2 = ato.a(this.a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                a3 = (int) ato.a(this.a, a2, false);
                                if (this.d.b(a3)) {
                                    break;
                                }
                            }
                            asu.b(1);
                        }
                        asu.b(a2);
                        a4 = (long) a3;
                    }
                    if (a4 == -1) {
                        return false;
                    }
                    this.f = (int) a4;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.a(asu, false, true, 8);
                    this.e = 2;
                }
                int a5 = this.d.a(this.f);
                if (a5 == 0) {
                    asu.b((int) this.g);
                    this.e = 0;
                } else if (a5 == 1) {
                    long c2 = asu.c();
                    this.b.push(new a(this.f, this.g + c2, 0));
                    this.d.a(this.f, c2, this.g);
                    this.e = 0;
                    return true;
                } else if (a5 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.a(this.f, a(asu, (int) j));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder("Invalid integer size: ");
                    sb.append(this.g);
                    throw new ParserException(sb.toString());
                } else if (a5 == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.a(this.f, b(asu, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder("String element size: ");
                    sb2.append(this.g);
                    throw new ParserException(sb2.toString());
                } else if (a5 == 4) {
                    this.d.a(this.f, (int) this.g, asu);
                    this.e = 0;
                    return true;
                } else if (a5 == 5) {
                    long j3 = this.g;
                    if (j3 == 4 || j3 == 8) {
                        atl atl = this.d;
                        int i = this.f;
                        int i2 = (int) this.g;
                        long a6 = a(asu, i2);
                        if (i2 == 4) {
                            d2 = (double) Float.intBitsToFloat((int) a6);
                        } else {
                            d2 = Double.longBitsToDouble(a6);
                        }
                        atl.a(i, d2);
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder("Invalid float size: ");
                    sb3.append(this.g);
                    throw new ParserException(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder("Invalid element type ");
                    sb4.append(a5);
                    throw new ParserException(sb4.toString());
                }
            } else {
                this.d.c(((a) this.b.pop()).a);
                return true;
            }
        }
    }

    private long a(asu asu, int i) {
        asu.b(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }

    private static String b(asu asu, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        asu.b(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }
}
