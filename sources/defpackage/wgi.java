package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: wgi reason: default package */
public final class wgi extends wgr {
    private final wgr a;
    private final Uri b;
    private final gco<String, String, Void> c;

    public wgi(Picasso picasso, gco<String, String, Void> gco, wgr wgr, Uri uri) {
        super(picasso, uri, 0);
        this.a = wgr;
        this.b = uri;
        this.c = gco;
    }

    static /* synthetic */ void a(wgi wgi) {
        Uri uri = wgi.b;
        if (uri != null) {
            wgi.c.apply("uri_succeeded", uri.toString());
        }
    }

    static /* synthetic */ void b(wgi wgi) {
        Uri uri = wgi.b;
        if (uri != null) {
            wgi.c.apply("uri_failed", uri.toString());
        }
    }

    public final wgr a() {
        this.a.a();
        return this;
    }

    public final wgr a(int i) {
        this.a.a(i);
        return this;
    }

    public final wgr a(int i, int i2) {
        this.a.a(i, i2);
        return this;
    }

    public final wgr a(Config config) {
        this.a.a(config);
        return this;
    }

    public final wgr a(Drawable drawable) {
        this.a.a(drawable);
        return this;
    }

    public final wgr a(Object obj) {
        this.a.a(obj);
        return this;
    }

    public final wgr a(wgz wgz) {
        this.a.a(wgz);
        return this;
    }

    public final void a(ImageView imageView) {
        this.a.a(imageView, (wfz) new wfz() {
            public final void a() {
                wgi.a(wgi.this);
            }

            public final void b() {
                wgi.b(wgi.this);
            }
        });
    }

    public final void a(ImageView imageView, final wfz wfz) {
        this.a.a(imageView, (wfz) new wfz() {
            public final void a() {
                wgi.a(wgi.this);
                wfz.a();
            }

            public final void b() {
                wgi.b(wgi.this);
                wfz.b();
            }
        });
    }

    public final void a(wfz wfz) {
        this.a.a(wfz);
    }

    public final void a(final wgx wgx) {
        this.a.a((wgx) new wgx() {
            public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                fbp.a(!bitmap.isRecycled());
                wgi.a(wgi.this);
                wgx.a(bitmap, loadedFrom);
                fbp.a(!bitmap.isRecycled());
            }

            public final void a(Drawable drawable) {
                wgi.b(wgi.this);
                wgx.a(drawable);
            }

            public final void b(Drawable drawable) {
                wgx.b(drawable);
            }
        });
    }

    public final wgr b() {
        this.a.b();
        return this;
    }

    public final wgr b(int i) {
        this.a.b(i);
        return this;
    }

    public final wgr b(int i, int i2) {
        this.a.b(i, i2);
        return this;
    }

    public final wgr b(Drawable drawable) {
        this.a.b(drawable);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final wgr c() {
        this.a.c();
        return this;
    }

    public final wgr d() {
        this.a.d();
        return this;
    }

    public final wgr e() {
        this.a.e();
        return this;
    }

    public final wgr f() {
        this.a.f();
        return this;
    }

    public final wgr g() {
        this.a.g();
        return this;
    }

    public final Bitmap h() {
        return this.a.h();
    }

    public final void i() {
        this.a.i();
    }
}
