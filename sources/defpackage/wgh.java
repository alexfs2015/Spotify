package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: wgh reason: default package */
final class wgh extends wfv<ImageView> {
    private wfz m;

    wgh(Picasso picasso, ImageView imageView, wgq wgq, int i, int i2, int i3, Drawable drawable, String str, Object obj, wfz wfz, boolean z) {
        super(picasso, imageView, wgq, i, i2, i3, drawable, str, obj, z);
        this.m = wfz;
    }

    public final void a() {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            if (this.g != 0) {
                imageView.setImageResource(this.g);
            } else if (this.h != null) {
                imageView.setImageDrawable(this.h);
            }
            wfz wfz = this.m;
            if (wfz != null) {
                wfz.b();
            }
        }
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.c.get();
            if (imageView != null) {
                Bitmap bitmap2 = bitmap;
                LoadedFrom loadedFrom2 = loadedFrom;
                wgo.a(imageView, this.a.d, bitmap2, loadedFrom2, this.d, this.a.k);
                wfz wfz = this.m;
                if (wfz != null) {
                    wfz.a();
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        super.b();
        if (this.m != null) {
            this.m = null;
        }
    }
}
