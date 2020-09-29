package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: ivr reason: default package */
public final class ivr extends ivq {
    /* access modifiers changed from: private */
    public final int a;
    private final ColorDrawable b;
    /* access modifiers changed from: private */
    public final uvb c;
    private final ColorDrawable d;
    private final a e;

    /* renamed from: ivr$a */
    static final class a implements vsr {
        uvj a;

        public final void b(Drawable drawable) {
        }

        a() {
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fay.a(!bitmap.isRecycled());
            uus.a(bitmap).a(new $$Lambda$ivr$a$oSAWKcCnW4Or6IGbu_Fnt3EalAE(this));
            fay.a(!bitmap.isRecycled());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(uus uus) {
            this.a.a(uus);
        }

        public final void a(Drawable drawable) {
            uvj uvj = this.a;
        }
    }

    public ivr(Context context, uvb uvb, ColorDrawable colorDrawable, ColorDrawable colorDrawable2) {
        this(context, new Drawable[]{uvb}, uvb, colorDrawable, colorDrawable2);
    }

    private ivr(Context context, Drawable[] drawableArr, uvb uvb, ColorDrawable colorDrawable, ColorDrawable colorDrawable2) {
        super(drawableArr);
        this.e = new a();
        this.c = uvb;
        this.d = colorDrawable;
        this.b = colorDrawable2;
        this.a = uuu.b(context, 16842836);
        this.e.a = new uvj() {
            public final void a(int i) {
                ivr.this.c.a(uvp.a(i, ivr.this.a), true);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivr)) {
            return false;
        }
        ivr ivr = (ivr) obj;
        if (this.b.equals(ivr.b) && this.c.equals(ivr.c)) {
            return this.d.equals(ivr.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
