package defpackage;

import android.graphics.Bitmap;

@cfp
/* renamed from: bhp reason: default package */
final class bhp extends cmg {
    final /* synthetic */ bhk a;

    private bhp(bhk bhk) {
        this.a = bhk;
    }

    /* synthetic */ bhp(bhk bhk, byte b) {
        this(bhk);
    }

    public final void a() {
        coq y = bkc.y();
        Bitmap bitmap = (Bitmap) y.a.get(Integer.valueOf(this.a.b.o.e));
        if (bitmap != null) {
            cmu.a.post(new bhq(this, bkc.g().a(this.a.a, bitmap, this.a.b.o.c, this.a.b.o.d)));
        }
    }

    public final void s_() {
    }
}
