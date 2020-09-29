package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: arg reason: default package */
final class arg implements AudioProcessor {
    int[] b;
    private int c = -1;
    private int d = -1;
    private boolean e;
    private int[] f;
    private ByteBuffer g = a;
    private ByteBuffer h = a;
    private boolean i;

    public final int c() {
        return 2;
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z = !Arrays.equals(this.b, this.f);
        this.f = this.b;
        if (this.f == null) {
            this.e = false;
            return z;
        } else if (i4 != 2) {
            throw new UnhandledFormatException(i2, i3, i4);
        } else if (!z && this.d == i2 && this.c == i3) {
            return false;
        } else {
            this.d = i2;
            this.c = i3;
            this.e = i3 != this.f.length;
            int i5 = 0;
            while (true) {
                int[] iArr = this.f;
                if (i5 >= iArr.length) {
                    return true;
                }
                int i6 = iArr[i5];
                if (i6 < i3) {
                    this.e = (i6 != i5) | this.e;
                    i5++;
                } else {
                    throw new UnhandledFormatException(i2, i3, i4);
                }
            }
        }
    }

    public final boolean a() {
        return this.e;
    }

    public final int b() {
        int[] iArr = this.f;
        return iArr == null ? this.c : iArr.length;
    }

    public final int d() {
        return this.d;
    }

    public final void a(ByteBuffer byteBuffer) {
        bcu.b(this.f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.c * 2)) * this.f.length) << 1;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i2 : this.f) {
                this.g.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.c << 1;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    public final void e() {
        this.i = true;
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
        this.h = a;
        this.i = false;
    }

    public final void i() {
        h();
        this.g = a;
        this.c = -1;
        this.d = -1;
        this.f = null;
        this.b = null;
        this.e = false;
    }
}
