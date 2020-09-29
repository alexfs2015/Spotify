package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: jyx reason: default package */
public final class jyx {
    private static final Object b = new Object();
    public final Context a;
    private final Picasso c;

    public jyx(Context context, Picasso picasso) {
        this.a = context;
        this.c = picasso;
    }

    public final void a() {
        this.c.a(b);
    }

    public final void a(ImageView imageView, Uri uri) {
        this.c.a(uri).a(b).a(imageView);
    }

    public final void a(ImageView imageView, Uri uri, Drawable drawable, vfk vfk) {
        wgr a2 = this.c.a(uri).b(drawable).a(drawable).a(b);
        if (vfk != null) {
            a2.a(vhj.a(imageView, vfk));
        } else {
            a2.b().a(imageView);
        }
    }

    public final void a(ImageView imageView, Uri uri, Drawable drawable, vfk vfk, wfz wfz) {
        wgr a2 = this.c.a(uri).b(drawable).a(drawable).a(b);
        if (vfk != null) {
            a2.a(vhj.a(imageView, vfk, wfz));
        } else if (wfz instanceof vha) {
            a2.a(vhj.a(imageView, (vha) wfz));
        } else {
            a2.a(imageView, wfz);
        }
    }

    public final void a(ImageView imageView, Uri uri, vfk vfk) {
        a(imageView, uri, gaa.f(this.a), vfk);
    }

    public final void a(ImageView imageView, Uri uri, vha vha) {
        this.c.a(uri).a(b).a(vhj.a(imageView, vha));
    }

    public final void a(ImageView imageView, Uri uri, wfz wfz) {
        a(imageView, uri, gaa.b(this.a), null, wfz);
    }

    public final void a(ImageView imageView, String str) {
        a(imageView, str, gaa.f(this.a), vgq.a());
    }

    public final void a(ImageView imageView, String str, Drawable drawable, vfk vfk) {
        wgr a2 = this.c.a(str).b(drawable).a(drawable).a(b);
        if (vfk != null) {
            a2.a(vhj.a(imageView, vfk));
        } else {
            a2.a(imageView);
        }
    }

    public final void b(ImageView imageView, Uri uri) {
        this.c.a(uri).a(gaa.h(imageView.getContext())).b().a(b).a(imageView);
    }

    public final void b(ImageView imageView, String str) {
        a(imageView, str, gaa.k(this.a), vgq.a());
    }

    public final void c(ImageView imageView, String str) {
        a(imageView, str, gaa.a(this.a), vgq.a());
    }

    public final void d(ImageView imageView, String str) {
        a(imageView, str, gaa.g(this.a), vgq.a());
    }

    public final void e(ImageView imageView, String str) {
        a(imageView, str, gaa.j(this.a), (vfk) null);
    }
}
