package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;

/* renamed from: gai reason: default package */
public final class gai {
    private final gaf[] a;
    private final gll b = new gll();

    public gai(gaf... gafArr) {
        this.a = gafArr;
        GLES30.glGenVertexArrays(1, this.b.a, 0);
    }

    public final void a() {
        b();
        for (gaf a2 : this.a) {
            a2.a();
        }
        GLES30.glBindVertexArray(0);
        for (gaf gaf : this.a) {
            GLES20.glBindBuffer(gaf.b, 0);
        }
    }

    public final void b() {
        GLES30.glBindVertexArray(this.b.a[0]);
    }
}
