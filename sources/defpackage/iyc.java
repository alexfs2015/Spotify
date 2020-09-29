package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: iyc reason: default package */
public final class iyc extends iyb {
    /* access modifiers changed from: private */
    public final int a;
    private final ColorDrawable b;
    /* access modifiers changed from: private */
    public final vgs c;
    private final ColorDrawable d;
    private final a e;

    /* renamed from: iyc$a */
    static final class a implements wgx {
        vha a;

        a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(vgj vgj) {
            this.a.a(vgj);
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fbp.a(!bitmap.isRecycled());
            vgj.a(bitmap).a(new $$Lambda$iyc$a$NCVor1YSA4alMnqYIkxGJN1NaLg(this));
            fbp.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            vha vha = this.a;
        }

        public final void b(Drawable drawable) {
        }
    }

    public iyc(Context context, vgs vgs, ColorDrawable colorDrawable, ColorDrawable colorDrawable2) {
        this(context, new Drawable[]{vgs}, vgs, colorDrawable, colorDrawable2);
    }

    private iyc(Context context, Drawable[] drawableArr, vgs vgs, ColorDrawable colorDrawable, ColorDrawable colorDrawable2) {
        super(drawableArr);
        this.e = new a();
        this.c = vgs;
        this.d = colorDrawable;
        this.b = colorDrawable2;
        this.a = vgl.b(context, 16842836);
        this.e.a = new vha() {
            public final void a(int i) {
                iyc.this.c.a(vhg.a(i, iyc.this.a), true);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyc)) {
            return false;
        }
        iyc iyc = (iyc) obj;
        if (this.b.equals(iyc.b) && this.c.equals(iyc.c)) {
            return this.d.equals(iyc.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
