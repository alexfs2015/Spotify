package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: tiy reason: default package */
public final class tiy implements wgx {
    private final a a;

    /* renamed from: tiy$a */
    public interface a {
        void a();

        void a(int i);
    }

    tiy(a aVar) {
        this.a = aVar;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fbp.a(!bitmap.isRecycled());
        if (bitmap.getHeight() == 1 && bitmap.getWidth() == 1 && bitmap.getConfig() == Config.ARGB_8888) {
            this.a.a(bitmap.getPixel(0, 0));
        } else {
            Logger.e("The loaded bitmap is not a 1x1 color bitmap. Use ColorExtractorTransformation in the chain before loading the bitmap or check if the bitmap has a valid color config.", new Object[0]);
            this.a.a();
        }
        fbp.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        this.a.a();
    }

    public final void b(Drawable drawable) {
    }
}
