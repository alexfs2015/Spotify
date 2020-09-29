package defpackage;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vry reason: default package */
final class vry extends vrp<Object> {
    private final Object m = new Object();
    private vrt n;

    vry(Picasso picasso, vsk vsk, int i, int i2, Object obj, String str, vrt vrt) {
        super(picasso, null, vsk, i, i2, 0, null, str, obj, false);
        this.n = vrt;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        vrt vrt = this.n;
        if (vrt != null) {
            vrt.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        vrt vrt = this.n;
        if (vrt != null) {
            vrt.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        super.b();
        this.n = null;
    }

    /* access modifiers changed from: 0000 */
    public final Object c() {
        return this.m;
    }
}
