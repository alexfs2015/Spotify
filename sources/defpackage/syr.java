package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: syr reason: default package */
public final class syr implements vsr {
    private final a a;

    /* renamed from: syr$a */
    public interface a {
        void a();

        void a(int i);
    }

    public final void b(Drawable drawable) {
    }

    syr(a aVar) {
        this.a = aVar;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fay.a(!bitmap.isRecycled());
        if (bitmap.getHeight() == 1 && bitmap.getWidth() == 1 && bitmap.getConfig() == Config.ARGB_8888) {
            this.a.a(bitmap.getPixel(0, 0));
        } else {
            Logger.e("The loaded bitmap is not a 1x1 color bitmap. Use ColorExtractorTransformation in the chain before loading the bitmap or check if the bitmap has a valid color config.", new Object[0]);
            this.a.a();
        }
        fay.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        this.a.a();
    }
}
