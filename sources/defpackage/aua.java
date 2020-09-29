package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;

/* renamed from: aua reason: default package */
final class aua implements aub {
    private final byte[] a = new byte[8];
    private final ArrayDeque<a> b = new ArrayDeque<>();
    private final auf c = new auf();
    private auc d;
    private int e;
    private int f;
    private long g;

    /* renamed from: aua$a */
    static final class a {
        final int a;
        final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        /* synthetic */ a(int i, long j, byte b2) {
            this(i, j);
        }
    }

    private long a(atl atl, int i) {
        atl.b(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }

    private static String b(atl atl, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        atl.b(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public final void a() {
        this.e = 0;
        this.b.clear();
        this.c.a();
    }

    public final void a(auc auc) {
        this.d = auc;
    }

    public final boolean a(atl atl) {
        int a2;
        int a3;
        bdl.b(this.d != null);
        while (true) {
            if (this.b.isEmpty() || atl.c() < ((a) this.b.peek()).b) {
                if (this.e == 0) {
                    long a4 = this.c.a(atl, true, false, 4);
                    if (a4 == -2) {
                        atl.a();
                        while (true) {
                            atl.c(this.a, 0, 4);
                            a2 = auf.a(this.a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                a3 = (int) auf.a(this.a, a2, false);
                                if (this.d.b(a3)) {
                                    break;
                                }
                            }
                            atl.b(1);
                        }
                        atl.b(a2);
                        a4 = (long) a3;
                    }
                    if (a4 == -1) {
                        return false;
                    }
                    this.f = (int) a4;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.a(atl, false, true, 8);
                    this.e = 2;
                }
                int a5 = this.d.a(this.f);
                if (a5 == 0) {
                    atl.b((int) this.g);
                    this.e = 0;
                } else if (a5 == 1) {
                    long c2 = atl.c();
                    this.b.push(new a(this.f, this.g + c2, 0));
                    this.d.a(this.f, c2, this.g);
                    this.e = 0;
                    return true;
                } else if (a5 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.a(this.f, a(atl, (int) j));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder("Invalid integer size: ");
                    sb.append(this.g);
                    throw new ParserException(sb.toString());
                } else if (a5 == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.a(this.f, b(atl, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder("String element size: ");
                    sb2.append(this.g);
                    throw new ParserException(sb2.toString());
                } else if (a5 == 4) {
                    this.d.a(this.f, (int) this.g, atl);
                    this.e = 0;
                    return true;
                } else if (a5 == 5) {
                    long j3 = this.g;
                    if (j3 == 4 || j3 == 8) {
                        auc auc = this.d;
                        int i = this.f;
                        int i2 = (int) this.g;
                        long a6 = a(atl, i2);
                        auc.a(i, i2 == 4 ? (double) Float.intBitsToFloat((int) a6) : Double.longBitsToDouble(a6));
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
}
