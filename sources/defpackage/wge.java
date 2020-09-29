package defpackage;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: wge reason: default package */
final class wge extends wfv<Object> {
    private final Object m = new Object();
    private wfz n;

    wge(Picasso picasso, wgq wgq, int i, int i2, Object obj, String str, wfz wfz) {
        super(picasso, null, wgq, i, i2, 0, null, str, obj, false);
        this.n = wfz;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        wfz wfz = this.n;
        if (wfz != null) {
            wfz.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        wfz wfz = this.n;
        if (wfz != null) {
            wfz.a();
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
