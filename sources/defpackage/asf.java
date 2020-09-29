package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: asf reason: default package */
public final class asf implements AudioProcessor {
    int b = -1;
    float c = 1.0f;
    float d = 1.0f;
    int e = -1;
    ase f;
    long g;
    long h;
    private int i = -1;
    private int j = -1;
    private ByteBuffer k = a;
    private ShortBuffer l = this.k.asShortBuffer();
    private ByteBuffer m = a;
    private boolean n;

    public final void a(ByteBuffer byteBuffer) {
        bdl.b(this.f != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.g += (long) remaining;
            ase ase = this.f;
            int remaining2 = asShortBuffer.remaining() / ase.a;
            int i2 = (ase.a * remaining2) << 1;
            ase.f = ase.a(ase.f, ase.g, remaining2);
            asShortBuffer.get(ase.f, ase.g * ase.a, i2 / 2);
            ase.g += remaining2;
            ase.b();
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
            ase ase2 = this.f;
            ShortBuffer shortBuffer = this.l;
            int min = Math.min(shortBuffer.remaining() / ase2.a, ase2.i);
            shortBuffer.put(ase2.h, 0, ase2.a * min);
            ase2.i -= min;
            System.arraycopy(ase2.h, min * ase2.a, ase2.h, 0, ase2.i * ase2.a);
            this.h += (long) i3;
            this.k.limit(i3);
            this.m = this.k;
        }
    }

    public final boolean a() {
        return this.b != -1 && (Math.abs(this.c - 1.0f) >= 0.01f || Math.abs(this.d - 1.0f) >= 0.01f || this.e != this.b);
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

    public final int b() {
        return this.i;
    }

    public final int c() {
        return 2;
    }

    public final int d() {
        return this.e;
    }

    public final void e() {
        bdl.b(this.f != null);
        ase ase = this.f;
        int i2 = ase.g;
        int i3 = ase.i + ((int) ((((((float) i2) / (ase.b / ase.c)) + ((float) ase.j)) / (ase.d * ase.c)) + 0.5f));
        ase.f = ase.a(ase.f, ase.g, (ase.e * 2) + i2);
        for (int i4 = 0; i4 < ase.e * 2 * ase.a; i4++) {
            ase.f[(ase.a * i2) + i4] = 0;
        }
        ase.g += ase.e * 2;
        ase.b();
        if (ase.i > i3) {
            ase.i = i3;
        }
        ase.g = 0;
        ase.k = 0;
        ase.j = 0;
        this.n = true;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.m;
        this.m = a;
        return byteBuffer;
    }

    public final boolean g() {
        if (this.n) {
            ase ase = this.f;
            if (ase == null || ase.i == 0) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        if (a()) {
            ase ase = this.f;
            if (ase == null) {
                ase ase2 = new ase(this.b, this.i, this.c, this.d, this.e);
                this.f = ase2;
            } else {
                ase.a();
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
