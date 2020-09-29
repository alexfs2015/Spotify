package defpackage;

import android.graphics.Bitmap;

@cey
/* renamed from: bgy reason: default package */
final class bgy extends clp {
    final /* synthetic */ bgt a;

    private bgy(bgt bgt) {
        this.a = bgt;
    }

    /* synthetic */ bgy(bgt bgt, byte b) {
        this(bgt);
    }

    public final void s_() {
    }

    public final void a() {
        cnz y = bjl.y();
        Bitmap bitmap = (Bitmap) y.a.get(Integer.valueOf(this.a.b.o.e));
        if (bitmap != null) {
            cmd.a.post(new bgz(this, bjl.g().a(this.a.a, bitmap, this.a.b.o.c, this.a.b.o.d)));
        }
    }
}
