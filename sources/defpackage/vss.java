package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vss reason: default package */
final class vss extends vrp<vsr> {
    vss(Picasso picasso, vsr vsr, vsk vsk, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, vsr, vsk, i, i2, i3, drawable, str, obj, false);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        if (bitmap != null) {
            vsr vsr = (vsr) c();
            if (vsr != null) {
                vsr.a(bitmap, loadedFrom);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        vsr vsr = (vsr) c();
        if (vsr != null) {
            if (this.g != 0) {
                vsr.a(this.a.d.getResources().getDrawable(this.g));
                return;
            }
            vsr.a(this.h);
        }
    }
}
