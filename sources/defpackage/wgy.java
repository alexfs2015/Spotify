package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: wgy reason: default package */
final class wgy extends wfv<wgx> {
    wgy(Picasso picasso, wgx wgx, wgq wgq, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, wgx, wgq, i, i2, i3, drawable, str, obj, false);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        wgx wgx = (wgx) c();
        if (wgx != null) {
            if (this.g != 0) {
                wgx.a(this.a.d.getResources().getDrawable(this.g));
                return;
            }
            wgx.a(this.h);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        if (bitmap != null) {
            wgx wgx = (wgx) c();
            if (wgx != null) {
                wgx.a(bitmap, loadedFrom);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }
}
