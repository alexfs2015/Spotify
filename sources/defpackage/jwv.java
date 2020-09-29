package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: jwv reason: default package */
public final class jwv {
    private static final Object b = new Object();
    public final Context a;
    private final Picasso c;

    jwv(Context context, Picasso picasso) {
        this.a = context;
        this.c = picasso;
    }

    public final void a(ImageView imageView, String str, Drawable drawable, utt utt) {
        vsl a2 = this.c.a(str).b(drawable).a(drawable).a(b);
        if (utt != null) {
            a2.a(uvt.a(imageView, utt));
        } else {
            a2.a(imageView);
        }
    }

    public final void a(ImageView imageView, Uri uri, Drawable drawable, utt utt) {
        vsl a2 = this.c.a(uri).b(drawable).a(drawable).a(b);
        if (utt != null) {
            a2.a(uvt.a(imageView, utt));
        } else {
            a2.b().a(imageView);
        }
    }

    public final void a(ImageView imageView, Uri uri, Drawable drawable, utt utt, vrt vrt) {
        vsl a2 = this.c.a(uri).b(drawable).a(drawable).a(b);
        if (utt != null) {
            a2.a(uvt.a(imageView, utt, vrt));
        } else if (vrt instanceof uvj) {
            a2.a(uvt.a(imageView, (uvj) vrt));
        } else {
            a2.a(imageView, vrt);
        }
    }

    public final void a(ImageView imageView, Uri uri) {
        this.c.a(uri).a(b).a(imageView);
    }

    public final void a(ImageView imageView, Uri uri, uvj uvj) {
        this.c.a(uri).a(b).a(uvt.a(imageView, uvj));
    }

    public final void a(ImageView imageView, Uri uri, utt utt) {
        a(imageView, uri, fzg.f(this.a), utt);
    }

    public final void a(ImageView imageView, String str) {
        a(imageView, str, fzg.f(this.a), uuz.a());
    }

    public final void b(ImageView imageView, String str) {
        a(imageView, str, fzg.k(this.a), uuz.a());
    }

    public final void c(ImageView imageView, String str) {
        a(imageView, str, fzg.a(this.a), uuz.a());
    }

    public final void d(ImageView imageView, String str) {
        a(imageView, str, fzg.g(this.a), uuz.a());
    }

    public final void a(ImageView imageView, Uri uri, vrt vrt) {
        a(imageView, uri, fzg.b(this.a), null, vrt);
    }

    public final void b(ImageView imageView, Uri uri) {
        this.c.a(uri).a(fzg.h(imageView.getContext())).b().a(b).a(imageView);
    }

    public final void a() {
        this.c.a(b);
    }
}
