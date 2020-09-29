package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vsc reason: default package */
public final class vsc extends vsl {
    private final vsl a;
    private final Uri b;
    private final gbq<String, String, Void> c;

    public vsc(Picasso picasso, gbq<String, String, Void> gbq, vsl vsl, Uri uri) {
        super(picasso, uri, 0);
        this.a = vsl;
        this.b = uri;
        this.c = gbq;
    }

    public final vsl a() {
        this.a.a();
        return this;
    }

    public final vsl a(int i) {
        this.a.a(i);
        return this;
    }

    public final vsl a(Drawable drawable) {
        this.a.a(drawable);
        return this;
    }

    public final vsl b(int i) {
        this.a.b(i);
        return this;
    }

    public final vsl b(Drawable drawable) {
        this.a.b(drawable);
        return this;
    }

    public final vsl a(Object obj) {
        this.a.a(obj);
        return this;
    }

    public final vsl b() {
        this.a.b();
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final vsl c() {
        this.a.c();
        return this;
    }

    public final vsl a(int i, int i2) {
        this.a.a(i, i2);
        return this;
    }

    public final vsl b(int i, int i2) {
        this.a.b(i, i2);
        return this;
    }

    public final vsl d() {
        this.a.d();
        return this;
    }

    public final vsl e() {
        this.a.e();
        return this;
    }

    public final vsl f() {
        this.a.f();
        return this;
    }

    public final vsl a(Config config) {
        this.a.a(config);
        return this;
    }

    public final vsl a(vst vst) {
        this.a.a(vst);
        return this;
    }

    public final vsl g() {
        this.a.g();
        return this;
    }

    public final Bitmap h() {
        return this.a.h();
    }

    public final void i() {
        this.a.i();
    }

    public final void a(vrt vrt) {
        this.a.a(vrt);
    }

    public final void a(final vsr vsr) {
        this.a.a((vsr) new vsr() {
            public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                fay.a(!bitmap.isRecycled());
                vsc.a(vsc.this);
                vsr.a(bitmap, loadedFrom);
                fay.a(!bitmap.isRecycled());
            }

            public final void a(Drawable drawable) {
                vsc.b(vsc.this);
                vsr.a(drawable);
            }

            public final void b(Drawable drawable) {
                vsr.b(drawable);
            }
        });
    }

    public final void a(ImageView imageView) {
        this.a.a(imageView, (vrt) new vrt() {
            public final void a() {
                vsc.a(vsc.this);
            }

            public final void b() {
                vsc.b(vsc.this);
            }
        });
    }

    public final void a(ImageView imageView, final vrt vrt) {
        this.a.a(imageView, (vrt) new vrt() {
            public final void a() {
                vsc.a(vsc.this);
                vrt.a();
            }

            public final void b() {
                vsc.b(vsc.this);
                vrt.b();
            }
        });
    }

    static /* synthetic */ void a(vsc vsc) {
        Uri uri = vsc.b;
        if (uri != null) {
            vsc.c.apply("uri_succeeded", uri.toString());
        }
    }

    static /* synthetic */ void b(vsc vsc) {
        Uri uri = vsc.b;
        if (uri != null) {
            vsc.c.apply("uri_failed", uri.toString());
        }
    }
}
