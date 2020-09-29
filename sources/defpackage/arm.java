package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: arm reason: default package */
public final class arm implements AudioProcessor {
    boolean b;
    long c;
    private int d = -1;
    private int e = -1;
    private int f;
    private ByteBuffer g = a;
    private ByteBuffer h = a;
    private boolean i;
    private byte[] j = bdw.f;
    private byte[] k = bdw.f;
    private int l;
    private int m;
    private int n;
    private boolean o;

    public final int c() {
        return 2;
    }

    public final boolean a(int i2, int i3, int i4) {
        if (i4 != 2) {
            throw new UnhandledFormatException(i2, i3, i4);
        } else if (this.e == i2 && this.d == i3) {
            return false;
        } else {
            this.e = i2;
            this.d = i3;
            this.f = i3 << 1;
            return true;
        }
    }

    public final boolean a() {
        return this.e != -1 && this.b;
    }

    public final int b() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final void a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.h.hasRemaining()) {
            int i2 = this.l;
            if (i2 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.j.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs(byteBuffer.get(limit2)) > 4) {
                        int i3 = this.f;
                        position = ((limit2 / i3) * i3) + i3;
                        break;
                    } else {
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.l = 1;
                } else {
                    byteBuffer.limit(position);
                    a(byteBuffer.remaining());
                    this.g.put(byteBuffer);
                    this.g.flip();
                    this.h = this.g;
                }
                byteBuffer.limit(limit);
            } else if (i2 == 1) {
                int limit3 = byteBuffer.limit();
                int b2 = b(byteBuffer);
                int position2 = b2 - byteBuffer.position();
                byte[] bArr = this.j;
                int length = bArr.length;
                int i4 = this.m;
                int i5 = length - i4;
                if (b2 >= limit3 || position2 >= i5) {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.j, this.m, min);
                    this.m += min;
                    int i6 = this.m;
                    byte[] bArr2 = this.j;
                    if (i6 == bArr2.length) {
                        if (this.o) {
                            a(bArr2, this.n);
                            this.c += (long) ((this.m - (this.n << 1)) / this.f);
                        } else {
                            this.c += (long) ((i6 - this.n) / this.f);
                        }
                        a(byteBuffer, this.j, this.m);
                        this.m = 0;
                        this.l = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    a(bArr, i4);
                    this.m = 0;
                    this.l = 0;
                }
            } else if (i2 == 2) {
                int limit4 = byteBuffer.limit();
                int b3 = b(byteBuffer);
                byteBuffer.limit(b3);
                this.c += (long) (byteBuffer.remaining() / this.f);
                a(byteBuffer, this.k, this.n);
                if (b3 < limit4) {
                    a(this.k, this.n);
                    this.l = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void e() {
        this.i = true;
        int i2 = this.m;
        if (i2 > 0) {
            a(this.j, i2);
        }
        if (!this.o) {
            this.c += (long) (this.n / this.f);
        }
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.h;
        this.h = a;
        return byteBuffer;
    }

    public final boolean g() {
        return this.i && this.h == a;
    }

    public final void h() {
        if (a()) {
            int a = a(150000) * this.f;
            if (this.j.length != a) {
                this.j = new byte[a];
            }
            this.n = a(20000) * this.f;
            int length = this.k.length;
            int i2 = this.n;
            if (length != i2) {
                this.k = new byte[i2];
            }
        }
        this.l = 0;
        this.h = a;
        this.i = false;
        this.c = 0;
        this.m = 0;
        this.o = false;
    }

    public final void i() {
        this.b = false;
        h();
        this.g = a;
        this.d = -1;
        this.e = -1;
        this.n = 0;
        this.j = bdw.f;
        this.k = bdw.f;
    }

    private void a(byte[] bArr, int i2) {
        a(i2);
        this.g.put(bArr, 0, i2);
        this.g.flip();
        this.h = this.g;
    }

    private void a(int i2) {
        if (this.g.capacity() < i2) {
            this.g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        if (i2 > 0) {
            this.o = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.n);
        int i3 = this.n - min;
        System.arraycopy(bArr, i2 - i3, this.k, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.k, i3, min);
    }

    private int a(long j2) {
        return (int) ((j2 * ((long) this.e)) / 1000000);
    }

    private int b(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.get(position)) > 4) {
                int i2 = this.f;
                return i2 * (position / i2);
            }
        }
        return byteBuffer.limit();
    }
}
