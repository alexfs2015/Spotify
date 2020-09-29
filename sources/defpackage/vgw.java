package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: vgw reason: default package */
public final class vgw {
    public final List<WeakReference<wgx>> a = new ArrayList();
    private final List<WeakReference<ImageView>> b = new ArrayList();
    private final Picasso c;

    vgw(Picasso picasso) {
        this.c = (Picasso) fbp.a(picasso);
    }

    public final wgr a(Uri uri) {
        return new wgk(this, this.c.a(uri));
    }

    public final wgr a(String str) {
        return new wgk(this, this.c.a(str));
    }

    public final void a() {
        synchronized (this.a) {
            for (WeakReference weakReference : this.a) {
                wgx wgx = (wgx) weakReference.get();
                if (wgx != null) {
                    this.c.d(wgx);
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

    public final void a(ImageView imageView) {
        synchronized (this.b) {
            this.b.add(new WeakReference(fbp.a(imageView)));
        }
    }
}
