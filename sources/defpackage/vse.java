package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: vse reason: default package */
public final class vse extends vsl {
    private final uvf a;
    private final vsl b;

    public vse(uvf uvf, vsl vsl) {
        this.a = (uvf) fay.a(uvf);
        this.b = (vsl) fay.a(vsl);
    }

    public final vsl a() {
        this.b.a();
        return this;
    }

    public final vsl a(int i) {
        this.b.a(i);
        return this;
    }

    public final vsl a(Drawable drawable) {
        this.b.a(drawable);
        return this;
    }

    public final vsl b(int i) {
        this.b.b(i);
        return this;
    }

    public final vsl b(Drawable drawable) {
        this.b.b(drawable);
        return this;
    }

    public final vsl a(Object obj) {
        this.b.a(obj);
        return this;
    }

    public final vsl b() {
        this.b.b();
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final vsl c() {
        this.b.c();
        return this;
    }

    public final vsl a(int i, int i2) {
        this.b.a(i, i2);
        return this;
    }

    public final vsl b(int i, int i2) {
        this.b.b(i, i2);
        return this;
    }

    public final vsl d() {
        this.b.d();
        return this;
    }

    public final vsl e() {
        this.b.e();
        return this;
    }

    public final vsl f() {
        this.b.f();
        return this;
    }

    public final vsl a(Config config) {
        this.b.a(config);
        return this;
    }

    public final vsl a(vst vst) {
        this.b.a(vst);
        return this;
    }

    public final vsl g() {
        this.b.g();
        return this;
    }

    public final Bitmap h() {
        return this.b.h();
    }

    public final void i() {
        this.b.i();
    }

    public final void a(vrt vrt) {
        this.b.a(vrt);
    }

    public final void a(vsr vsr) {
        this.b.a(vsr);
        uvf uvf = this.a;
        synchronized (uvf.a) {
            uvf.a.add(new WeakReference(fay.a(vsr)));
        }
    }

    public final void a(ImageView imageView) {
        this.b.a(imageView);
        this.a.a(imageView);
    }

    public final void a(ImageView imageView, vrt vrt) {
        this.b.a(imageView, vrt);
        this.a.a(imageView);
    }
}
