package defpackage;

import com.squareup.wire.FieldEncoding;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: whg reason: default package */
public final class whg {
    public final xcs a;
    public FieldEncoding b;
    private long c = 0;
    private long d = Long.MAX_VALUE;
    private int e;
    private int f = 2;
    private int g = -1;
    private long h = -1;

    public whg(xcs xcs) {
        this.a = xcs;
    }

    private void a(int i) {
        while (this.c < this.d && !this.a.c()) {
            int h2 = h();
            if (h2 != 0) {
                int i2 = h2 >> 3;
                int i3 = h2 & 7;
                if (i3 == 0) {
                    this.f = 0;
                    d();
                } else if (i3 == 1) {
                    this.f = 1;
                    f();
                } else if (i3 == 2) {
                    long h3 = (long) h();
                    this.c += h3;
                    this.a.i(h3);
                } else if (i3 == 3) {
                    a(i2);
                } else if (i3 != 4) {
                    if (i3 == 5) {
                        this.f = 5;
                        e();
                    } else {
                        StringBuilder sb = new StringBuilder("Unexpected field encoding: ");
                        sb.append(i3);
                        throw new ProtocolException(sb.toString());
                    }
                } else if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    private void b(int i) {
        if (this.f == i) {
            this.f = 6;
            return;
        }
        long j = this.c;
        long j2 = this.d;
        if (j > j2) {
            StringBuilder sb = new StringBuilder("Expected to end at ");
            sb.append(this.d);
            sb.append(" but was ");
            sb.append(this.c);
            throw new IOException(sb.toString());
        } else if (j == j2) {
            this.d = this.h;
            this.h = -1;
            this.f = 6;
        } else {
            this.f = 7;
        }
    }

    private int h() {
        byte b2;
        int i;
        this.c++;
        byte f2 = this.a.f();
        if (f2 >= 0) {
            return f2;
        }
        byte b3 = f2 & Byte.MAX_VALUE;
        this.c++;
        byte f3 = this.a.f();
        if (f3 >= 0) {
            i = f3 << 7;
        } else {
            b3 |= (f3 & Byte.MAX_VALUE) << 7;
            this.c++;
            byte f4 = this.a.f();
            if (f4 >= 0) {
                i = f4 << 14;
            } else {
                b3 |= (f4 & Byte.MAX_VALUE) << 14;
                this.c++;
                byte f5 = this.a.f();
                if (f5 >= 0) {
                    i = f5 << 21;
                } else {
                    byte b4 = b3 | ((f5 & Byte.MAX_VALUE) << 21);
                    this.c++;
                    byte f6 = this.a.f();
                    b2 = b4 | (f6 << 28);
                    if (f6 < 0) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            this.c++;
                            if (this.a.f() >= 0) {
                                return b2;
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return b2;
                }
            }
        }
        b2 = b3 | i;
        return b2;
    }

    public final long a() {
        if (this.f == 2) {
            int i = this.e + 1;
            this.e = i;
            if (i <= 65) {
                long j = this.h;
                this.h = -1;
                this.f = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    public final void a(long j) {
        if (this.f == 6) {
            int i = this.e - 1;
            this.e = i;
            if (i < 0 || this.h != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.c == this.d || this.e == 0) {
                this.d = j;
            } else {
                StringBuilder sb = new StringBuilder("Expected to end at ");
                sb.append(this.d);
                sb.append(" but was ");
                sb.append(this.c);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }

    public final int b() {
        int i = this.f;
        if (i == 7) {
            this.f = 2;
            return this.g;
        } else if (i == 6) {
            while (this.c < this.d && !this.a.c()) {
                int h2 = h();
                if (h2 != 0) {
                    this.g = h2 >> 3;
                    int i2 = h2 & 7;
                    if (i2 == 0) {
                        this.b = FieldEncoding.VARINT;
                        this.f = 0;
                        return this.g;
                    } else if (i2 == 1) {
                        this.b = FieldEncoding.FIXED64;
                        this.f = 1;
                        return this.g;
                    } else if (i2 == 2) {
                        this.b = FieldEncoding.LENGTH_DELIMITED;
                        this.f = 2;
                        int h3 = h();
                        if (h3 < 0) {
                            StringBuilder sb = new StringBuilder("Negative length: ");
                            sb.append(h3);
                            throw new ProtocolException(sb.toString());
                        } else if (this.h == -1) {
                            this.h = this.d;
                            this.d = this.c + ((long) h3);
                            if (this.d <= this.h) {
                                return this.g;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i2 == 3) {
                        a(this.g);
                    } else if (i2 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i2 == 5) {
                        this.b = FieldEncoding.FIXED32;
                        this.f = 5;
                        return this.g;
                    } else {
                        StringBuilder sb2 = new StringBuilder("Unexpected field encoding: ");
                        sb2.append(i2);
                        throw new ProtocolException(sb2.toString());
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    public final int c() {
        int i = this.f;
        if (i == 0 || i == 2) {
            int h2 = h();
            b(0);
            return h2;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f);
        throw new ProtocolException(sb.toString());
    }

    public final long d() {
        int i = this.f;
        if (i == 0 || i == 2) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                this.c++;
                byte f2 = this.a.f();
                j |= ((long) (f2 & Byte.MAX_VALUE)) << i2;
                if ((f2 & 128) == 0) {
                    b(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f);
        throw new ProtocolException(sb.toString());
    }

    public final int e() {
        int i = this.f;
        if (i == 5 || i == 2) {
            this.a.a(4);
            this.c += 4;
            int j = this.a.j();
            b(5);
            return j;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.f);
        throw new ProtocolException(sb.toString());
    }

    public final long f() {
        int i = this.f;
        if (i == 1 || i == 2) {
            this.a.a(8);
            this.c += 8;
            long k = this.a.k();
            b(1);
            return k;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.f);
        throw new ProtocolException(sb.toString());
    }

    public long g() {
        if (this.f == 2) {
            long j = this.d - this.c;
            this.a.a(j);
            this.f = 6;
            this.c = this.d;
            this.d = this.h;
            this.h = -1;
            return j;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.f);
        throw new ProtocolException(sb.toString());
    }
}
