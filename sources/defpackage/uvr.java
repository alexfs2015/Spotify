package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: uvr reason: default package */
public final class uvr implements vsr {
    private final View a;

    public final void b(Drawable drawable) {
    }

    public uvr(View view) {
        this.a = (View) fay.a(view);
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fay.a(!bitmap.isRecycled());
        View view = this.a;
        ip.a(view, (Drawable) new BitmapDrawable(view.getResources(), bitmap));
        fay.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        ip.a(this.a, (Drawable) null);
    }
}
