package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: uvf reason: default package */
public final class uvf {
    public final List<WeakReference<vsr>> a = new ArrayList();
    private final List<WeakReference<ImageView>> b = new ArrayList();
    private final Picasso c;

    uvf(Picasso picasso) {
        this.c = (Picasso) fay.a(picasso);
    }

    public final vsl a(String str) {
        return new vse(this, this.c.a(str));
    }

    public final vsl a(Uri uri) {
        return new vse(this, this.c.a(uri));
    }

    public final void a(ImageView imageView) {
        synchronized (this.b) {
            this.b.add(new WeakReference(fay.a(imageView)));
        }
    }

    public final void a() {
        synchronized (this.a) {
            for (WeakReference weakReference : this.a) {
                vsr vsr = (vsr) weakReference.get();
                if (vsr != null) {
                    this.c.d(vsr);
                }
            }
            this.a.clear();
        }
        synchronized (this.b) {
            for (WeakReference weakReference2 : this.b) {
                ImageView imageView = (ImageView) weakReference2.get();
                if (imageView != null) {
                    this.c.d(imageView);
                }
            }
            this.b.clear();
        }
    }
}
