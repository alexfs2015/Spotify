package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: twq reason: default package */
public final class twq implements twp {
    private final frl a;
    private final tuz b;
    private final tsu c;
    private final Context d;
    private final Picasso e;
    private final int f;

    public final void a(uys uys, String str, int i) {
    }

    public final void b(uys uys, String str, int i) {
    }

    public twq(frl frl, tuz tuz, tsu tsu, Context context, Picasso picasso) {
        this.a = frl;
        this.b = tuz;
        this.c = tsu;
        this.d = context;
        this.f = context.getResources().getDimensionPixelSize(R.dimen.episode_icon_size);
        this.e = picasso;
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void b(boolean z) {
        this.b.b(z);
    }

    public final void c(boolean z) {
        this.b.c(z);
    }

    public final void a(String str) {
        this.b.a(str);
    }

    public final void b(String str) {
        this.b.b(str);
    }

    public final void d(boolean z) {
        this.b.d(z);
    }

    public final void c(String str) {
        int dimensionPixelOffset = this.d.getResources().getDimensionPixelOffset(R.dimen.tile_image_landscape_image_width);
        int dimensionPixelOffset2 = this.d.getResources().getDimensionPixelOffset(R.dimen.tile_image_landscape_image_height);
        Drawable c2 = fzg.c(this.d);
        ImageView c3 = this.a.c();
        LayoutParams layoutParams = c3.getLayoutParams();
        layoutParams.width = dimensionPixelOffset;
        layoutParams.height = dimensionPixelOffset2;
        c3.setLayoutParams(layoutParams);
        c3.setScaleType(ScaleType.FIT_CENTER);
        this.e.d(c3);
        this.e.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(c2).b(dimensionPixelOffset, dimensionPixelOffset2).d().a(c3);
    }

    public final void a(uys uys, uys[] uysArr, String str, int i) {
        this.b.a(uys, uysArr, str, i);
    }

    public final void c() {
        Drawable drawable = (Drawable) fay.a(fr.a(this.d, (int) R.drawable.episode_dot));
        int i = this.f;
        drawable.setBounds(0, 0, i, i);
        a(drawable);
    }

    public final void d() {
        Drawable drawable = (Drawable) fay.a(fr.a(this.d, (int) R.drawable.episode_half_dot));
        int i = this.f;
        drawable.setBounds(0, 0, i, i);
        a(drawable);
    }

    public final void a() {
        this.b.a();
    }

    public final void b() {
        this.b.b();
    }

    public final void c(uys uys, String str, int i) {
        this.b.c(uys, str, i);
    }

    public final void d(String str) {
        this.a.d(str);
    }

    private void a(Drawable drawable) {
        this.a.d().setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
    }
}
