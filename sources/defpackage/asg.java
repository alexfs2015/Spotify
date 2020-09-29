package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: asg reason: default package */
final class asg implements AudioProcessor {
    int b;
    int c;
    long d;
    private boolean e;
    private int f = -1;
    private int g = -1;
    private int h;
    private boolean i;
    private int j;
    private ByteBuffer k = a;
    private ByteBuffer l = a;
    private byte[] m = ben.f;
    private int n;
    private boolean o;

    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 != 0) {
            this.i = true;
            int min = Math.min(i2, this.j);
            this.d += (long) (min / this.h);
            this.j -= min;
            byteBuffer.position(position + min);
            if (this.j <= 0) {
                int i3 = i2 - min;
                int length = (this.n + i3) - this.m.length;
                if (this.k.capacity() < length) {
                    this.k = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                int a = ben.a(length, 0, this.n);
                this.k.put(this.m, 0, a);
                int a2 = ben.a(length - a, 0, i3);
                byteBuffer.limit(byteBuffer.position() + a2);
                this.k.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - a2;
                this.n -= a;
                byte[] bArr = this.m;
                System.arraycopy(bArr, a, bArr, 0, this.n);
                byteBuffer.get(this.m, this.n, i4);
                this.n += i4;
                this.k.flip();
                this.l = this.k;
            }
        }
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean a(int i2, int i3, int i4) {
        if (i4 == 2) {
            int i5 = this.n;
            if (i5 > 0) {
                this.d += (long) (i5 / this.h);
            }
            this.f = i3;
            this.g = i2;
            this.h = ben.b(2, i3);
            int i6 = this.c;
            int i7 = this.h;
            this.m = new byte[(i6 * i7)];
            this.n = 0;
            int i8 = this.b;
            this.j = i7 * i8;
            boolean z = this.e;
            this.e = (i8 == 0 && i6 == 0) ? false : true;
            this.i = false;
            return z != this.e;
        }
        throw new UnhandledFormatException(i2, i3, i4);
    }

    public final int b() {
        return this.f;
    }

    public final int c() {
        return 2;
    }

    public final int d() {
        return this.g;
    }

    public final void e() {
        this.o = true;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.l;
        if (this.o && this.n > 0 && byteBuffer == a) {
            int capacity = this.k.capacity();
            int i2 = this.n;
            if (capacity < i2) {
                this.k = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
            } else {
                this.k.clear();
            }
            this.k.put(this.m, 0, this.n);
            this.n = 0;
            this.k.flip();
            byteBuffer = this.k;
        }
        this.l = a;
        return byteBuffer;
    }

    public final boolean g() {
        return this.o && this.n == 0 && this.l == a;
    }

    public final void h() {
        this.l = a;
        this.o = false;
        if (this.i) {
            this.j = 0;
        }
        this.n = 0;
    }

    public final void i() {
        h();
        this.k = a;
        this.f = -1;
        this.g = -1;
        this.m = ben.f;
    }
}
