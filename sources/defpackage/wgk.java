package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: wgk reason: default package */
public final class wgk extends wgr {
    private final vgw a;
    private final wgr b;

    public wgk(vgw vgw, wgr wgr) {
        this.a = (vgw) fbp.a(vgw);
        this.b = (wgr) fbp.a(wgr);
    }

    public final wgr a() {
        this.b.a();
        return this;
    }

    public final wgr a(int i) {
        this.b.a(i);
        return this;
    }

    public final wgr a(int i, int i2) {
        this.b.a(i, i2);
        return this;
    }

    public final wgr a(Config config) {
        this.b.a(config);
        return this;
    }

    public final wgr a(Drawable drawable) {
        this.b.a(drawable);
        return this;
    }

    public final wgr a(Object obj) {
        this.b.a(obj);
        return this;
    }

    public final wgr a(wgz wgz) {
        this.b.a(wgz);
        return this;
    }

    public final void a(ImageView imageView) {
        this.b.a(imageView);
        this.a.a(imageView);
    }

    public final void a(ImageView imageView, wfz wfz) {
        this.b.a(imageView, wfz);
        this.a.a(imageView);
    }

    public final void a(wfz wfz) {
        this.b.a(wfz);
    }

    public final void a(wgx wgx) {
        this.b.a(wgx);
        vgw vgw = this.a;
        synchronized (vgw.a) {
            vgw.a.add(new WeakReference(fbp.a(wgx)));
        }
    }

    public final wgr b() {
        this.b.b();
        return this;
    }

    public final wgr b(int i) {
        this.b.b(i);
        return this;
    }

    public final wgr b(int i, int i2) {
        this.b.b(i, i2);
        return this;
    }

    public final wgr b(Drawable drawable) {
        this.b.b(drawable);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final wgr c() {
        this.b.c();
        return this;
    }

    public final wgr d() {
        this.b.d();
        return this;
    }

    public final wgr e() {
        this.b.e();
        return this;
    }

    public final wgr f() {
        this.b.f();
        return this;
    }

    public final wgr g() {
        this.b.g();
        return this;
    }

    public final Bitmap h() {
        return this.b.h();
    }

    public final void i() {
        this.b.i();
    }
}
