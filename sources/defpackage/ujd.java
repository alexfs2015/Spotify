package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.music.R;
import com.spotify.music.preview.PreviewOverlayDrawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: ujd reason: default package */
public final class ujd implements wgx {
    private final ImageView a;
    private ujc b;
    private String c;
    private String d;
    private PreviewOverlayDrawable e;
    private boolean f;
    private final boolean g;
    private final int h;

    private ujd(ImageView imageView, ujc ujc, String str, String str2, boolean z, boolean z2, int i) {
        this.a = imageView;
        this.b = ujc;
        this.c = str;
        this.d = str2;
        this.f = z;
        this.g = z2;
        this.h = i;
    }

    public static ujd a(ImageView imageView, ujc ujc, String str, String str2) {
        return a(imageView, ujc, str, str2, false);
    }

    public static ujd a(ImageView imageView, ujc ujc, String str, String str2, boolean z) {
        return a(imageView, ujc, str, str2, z, true, 0);
    }

    public static ujd a(ImageView imageView, ujc ujc, String str, String str2, boolean z, boolean z2, int i) {
        ImageView imageView2 = imageView;
        String str3 = str;
        String str4 = str2;
        ujd ujd = (ujd) imageView.getTag(R.id.picasso_target);
        String str5 = "";
        if (ujd == null) {
            ujd ujd2 = new ujd(imageView, ujc, (String) jvi.a(str, str5), (String) jvi.a(str2, str5), z, z2, i);
            imageView.setTag(R.id.picasso_target, ujd2);
            return ujd2;
        }
        ujc ujc2 = ujc;
        boolean z3 = z;
        ujd.a(ujc, (String) jvi.a(str, str5), (String) jvi.a(str2, str5), z);
        return ujd;
    }

    private void a(ujc ujc, String str, String str2, boolean z) {
        this.b = ujc;
        if (!TextUtils.equals(this.c, str) || !TextUtils.equals(this.d, str2) || this.f != z) {
            this.c = str;
            this.d = str2;
            this.e = null;
            this.f = z;
        }
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        ujd ujd = this;
        Bitmap bitmap2 = bitmap;
        fbp.a(!bitmap.isRecycled());
        PreviewOverlayDrawable previewOverlayDrawable = ujd.e;
        if (previewOverlayDrawable == null) {
            ujc ujc = ujd.b;
            String str = ujd.c;
            String str2 = ujd.d;
            boolean z = ujd.f;
            boolean z2 = ujd.g;
            int i = ujd.h;
            PreviewOverlayDrawable previewOverlayDrawable2 = r1;
            PreviewOverlayDrawable previewOverlayDrawable3 = new PreviewOverlayDrawable(bitmap, ujc.c, ujc.d, i, z2 ? ujc.f : null, ujc.g, ujc.e, ujc.h, str, str2, z, ujc, ujc.b, ujc.a.a());
            PreviewOverlayDrawable previewOverlayDrawable4 = previewOverlayDrawable2;
            ujd = this;
            ujd.e = previewOverlayDrawable4;
        } else if (previewOverlayDrawable.a != bitmap2) {
            previewOverlayDrawable.a = bitmap2;
            previewOverlayDrawable.a();
            previewOverlayDrawable.invalidateSelf();
        }
        ujd.a.setImageDrawable(ujd.e);
        fbp.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void b(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
