package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vsb reason: default package */
final class vsb extends vrp<ImageView> {
    private vrt m;

    vsb(Picasso picasso, ImageView imageView, vsk vsk, int i, int i2, int i3, Drawable drawable, String str, Object obj, vrt vrt, boolean z) {
        super(picasso, imageView, vsk, i, i2, i3, drawable, str, obj, z);
        this.m = vrt;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.c.get();
            if (imageView != null) {
                Bitmap bitmap2 = bitmap;
                LoadedFrom loadedFrom2 = loadedFrom;
                vsi.a(imageView, this.a.d, bitmap2, loadedFrom2, this.d, this.a.k);
                vrt vrt = this.m;
                if (vrt != null) {
                    vrt.a();
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public final void a() {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            if (this.g != 0) {
                imageView.setImageResource(this.g);
            } else if (this.h != null) {
                imageView.setImageDrawable(this.h);
            }
            vrt vrt = this.m;
            if (vrt != null) {
                vrt.b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        super.b();
        if (this.m != null) {
            this.m = null;
        }
    }
}
