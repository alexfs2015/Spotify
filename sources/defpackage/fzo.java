package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;

/* renamed from: fzo reason: default package */
public final class fzo {
    private final fzl[] a;
    private final gka b = new gka();

    public fzo(fzl... fzlArr) {
        this.a = fzlArr;
        GLES30.glGenVertexArrays(1, this.b.a, 0);
    }

    public final void a() {
        b();
        for (fzl a2 : this.a) {
            a2.a();
        }
        GLES30.glBindVertexArray(0);
        for (fzl fzl : this.a) {
            GLES20.glBindBuffer(fzl.b, 0);
        }
    }

    public final void b() {
        GLES30.glBindVertexArray(this.b.a[0]);
    }
}
