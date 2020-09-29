package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: aro reason: default package */
public final class aro implements AudioProcessor {
    int b = -1;
    float c = 1.0f;
    float d = 1.0f;
    int e = -1;
    arn f;
    long g;
    long h;
    private int i = -1;
    private int j = -1;
    private ByteBuffer k = a;
    private ShortBuffer l = this.k.asShortBuffer();
    private ByteBuffer m = a;
    private boolean n;

    public final int c() {
        return 2;
    }

    public final boolean a(int i2, int i3, int i4) {
        if (i4 == 2) {
            int i5 = this.j;
            if (i5 == -1) {
                i5 = i2;
            }
            if (this.b == i2 && this.i == i3 && this.e == i5) {
                return false;
            }
            this.b = i2;
            this.i = i3;
            this.e = i5;
            this.f = null;
            return true;
        }
        throw new UnhandledFormatException(i2, i3, i4);
    }

    public final boolean a() {
        return this.b != -1 && (Math.abs(this.c - 1.0f) >= 0.01f || Math.abs(this.d - 1.0f) >= 0.01f || this.e != this.b);
    }

    public final int b() {
        return this.i;
    }

    public final int d() {
        return this.e;
    }

    public final void a(ByteBuffer byteBuffer) {
        bcu.b(this.f != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.g += (long) remaining;
            arn arn = this.f;
            int remaining2 = asShortBuffer.remaining() / arn.a;
            int i2 = (arn.a * remaining2) << 1;
            arn.f = arn.a(arn.f, arn.g, remaining2);
            asShortBuffer.get(arn.f, arn.g * arn.a, i2 / 2);
            arn.g += remaining2;
            arn.b();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = (this.f.i * this.i) << 1;
        if (i3 > 0) {
            if (this.k.capacity() < i3) {
                this.k = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.l = this.k.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            arn arn2 = this.f;
            ShortBuffer shortBuffer = this.l;
            int min = Math.min(shortBuffer.remaining() / arn2.a, arn2.i);
            shortBuffer.put(arn2.h, 0, arn2.a * min);
            arn2.i -= min;
            System.arraycopy(arn2.h, min * arn2.a, arn2.h, 0, arn2.i * arn2.a);
            this.h += (long) i3;
            this.k.limit(i3);
            this.m = this.k;
        }
    }

    public final void e() {
        bcu.b(this.f != null);
        arn arn = this.f;
        int i2 = arn.g;
        int i3 = arn.i + ((int) ((((((float) i2) / (arn.b / arn.c)) + ((float) arn.j)) / (arn.d * arn.c)) + 0.5f));
        arn.f = arn.a(arn.f, arn.g, (arn.e * 2) + i2);
        for (int i4 = 0; i4 < arn.e * 2 * arn.a; i4++) {
            arn.f[(arn.a * i2) + i4] = 0;
        }
        arn.g += arn.e * 2;
        arn.b();
        if (arn.i > i3) {
            arn.i = i3;
        }
        arn.g = 0;
        arn.k = 0;
        arn.j = 0;
        this.n = true;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.m;
        this.m = a;
        return byteBuffer;
    }

    public final boolean g() {
        if (this.n) {
            arn arn = this.f;
            if (arn == null || arn.i == 0) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        if (a()) {
            arn arn = this.f;
            if (arn == null) {
                arn arn2 = new arn(this.b, this.i, this.c, this.d, this.e);
                this.f = arn2;
            } else {
                arn.a();
            }
        }
        this.m = a;
        this.g = 0;
        this.h = 0;
        this.n = false;
    }

    public final void i() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.i = -1;
        this.b = -1;
        this.e = -1;
        this.k = a;
        this.l = this.k.asShortBuffer();
        this.m = a;
        this.j = -1;
        this.f = null;
        this.g = 0;
        this.h = 0;
        this.n = false;
    }
}
