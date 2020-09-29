package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: fzl reason: default package */
public abstract class fzl {
    protected final ByteBuffer a;
    final int b;
    private final gka c;
    private final int d;

    /* renamed from: fzl$a */
    public static class a extends fzl {
        public a(short[] sArr) {
            super(sArr.length << 1, 34963);
            this.a.position(0);
            ShortBuffer asShortBuffer = this.a.asShortBuffer();
            asShortBuffer.position(0);
            asShortBuffer.put(sArr, 0, sArr.length);
        }

        public final void a(int i) {
            GLES30.glDrawElementsInstanced(4, this.a.capacity() / 2, 5123, 0, 64);
        }
    }

    /* renamed from: fzl$b */
    public static abstract class b extends fzl {
        public b(int i) {
            super(i << 2, 34962);
        }

        /* access modifiers changed from: protected */
        public final FloatBuffer c() {
            this.a.position(0);
            return this.a.asFloatBuffer();
        }

        public static void a(int i, int i2, int i3, int i4) {
            GLES30.glVertexAttribPointer(i, i2, 5126, false, i3 << 2, i4 << 2);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public fzl(int i, int i2) {
        this(i, i2, 35044);
    }

    private fzl(int i, int i2, int i3) {
        this.c = new gka();
        this.a = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        GLES20.glGenBuffers(1, this.c.a, 0);
        this.b = i2;
        this.d = 35044;
    }

    public final void a() {
        int capacity = this.a.capacity();
        this.a.position(0);
        GLES20.glBindBuffer(this.b, this.c.a[0]);
        GLES20.glBufferData(this.b, capacity, this.a, this.d);
        b();
    }
}
