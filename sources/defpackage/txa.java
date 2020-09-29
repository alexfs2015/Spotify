package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.music.R;
import com.spotify.music.preview.PreviewOverlayDrawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: txa reason: default package */
public final class txa implements vsr {
    private final ImageView a;
    private twz b;
    private String c;
    private String d;
    private PreviewOverlayDrawable e;
    private boolean f;
    private final boolean g;
    private final int h;

    public static txa a(ImageView imageView, twz twz, String str, String str2) {
        return a(imageView, twz, str, str2, false);
    }

    public static txa a(ImageView imageView, twz twz, String str, String str2, boolean z) {
        return a(imageView, twz, str, str2, z, true, 0);
    }

    public static txa a(ImageView imageView, twz twz, String str, String str2, boolean z, boolean z2, int i) {
        ImageView imageView2 = imageView;
        String str3 = str;
        String str4 = str2;
        txa txa = (txa) imageView.getTag(R.id.picasso_target);
        String str5 = "";
        if (txa == null) {
            txa txa2 = new txa(imageView, twz, (String) jtc.a(str, str5), (String) jtc.a(str2, str5), z, z2, i);
            imageView.setTag(R.id.picasso_target, txa2);
            return txa2;
        }
        twz twz2 = twz;
        boolean z3 = z;
        txa.a(twz, (String) jtc.a(str, str5), (String) jtc.a(str2, str5), z);
        return txa;
    }

    private txa(ImageView imageView, twz twz, String str, String str2, boolean z, boolean z2, int i) {
        this.a = imageView;
        this.b = twz;
        this.c = str;
        this.d = str2;
        this.f = z;
        this.g = z2;
        this.h = i;
    }

    private void a(twz twz, String str, String str2, boolean z) {
        this.b = twz;
        if (!TextUtils.equals(this.c, str) || !TextUtils.equals(this.d, str2) || this.f != z) {
            this.c = str;
            this.d = str2;
            this.e = null;
            this.f = z;
        }
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        txa txa = this;
        Bitmap bitmap2 = bitmap;
        fay.a(!bitmap.isRecycled());
        PreviewOverlayDrawable previewOverlayDrawable = txa.e;
        if (previewOverlayDrawable == null) {
            twz twz = txa.b;
            String str = txa.c;
            String str2 = txa.d;
            boolean z = txa.f;
            boolean z2 = txa.g;
            int i = txa.h;
            PreviewOverlayDrawable previewOverlayDrawable2 = r1;
            PreviewOverlayDrawable previewOverlayDrawable3 = new PreviewOverlayDrawable(bitmap, twz.c, twz.d, i, z2 ? twz.f : null, twz.g, twz.e, twz.h, str, str2, z, twz, twz.b, twz.a.a());
            PreviewOverlayDrawable previewOverlayDrawable4 = previewOverlayDrawable2;
            txa = this;
            txa.e = previewOverlayDrawable4;
        } else if (previewOverlayDrawable.a != bitmap2) {
            previewOverlayDrawable.a = bitmap2;
            previewOverlayDrawable.a();
            previewOverlayDrawable.invalidateSelf();
        }
        txa.a.setImageDrawable(txa.e);
        fay.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void b(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
