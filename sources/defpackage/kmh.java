package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: kmh reason: default package */
public abstract class kmh implements wgx {
    public abstract void a(Bitmap bitmap);

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fbp.a(!bitmap.isRecycled());
        a(bitmap);
        fbp.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
    }

    public final void b(Drawable drawable) {
    }
}
