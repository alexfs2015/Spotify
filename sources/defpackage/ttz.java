package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.android.glue.gradients.GlueGradients.Style;
import com.spotify.android.glue.gradients.GradientDrawable;
import com.spotify.android.glue.gradients.GradientDrawable.Type;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.MediaType;
import java.util.Locale;

/* renamed from: ttz reason: default package */
public final class ttz implements tty {
    private final tmy a;
    private final ttm b;
    private final boolean c;
    private final tuf d;
    private final ttv e;
    private uys[] f;
    private String g;
    private boolean h;
    private boolean i;

    public ttz(tmy tmy, ttm ttm, boolean z, ttv ttv, tuf tuf) {
        this.a = tmy;
        this.b = ttm;
        this.e = ttv;
        this.c = z;
        this.d = tuf;
    }

    public final void a(uys[] uysArr) {
        this.f = uysArr;
    }

    public final int a() {
        uys[] uysArr = this.f;
        if (uysArr != null) {
            return uysArr.length;
        }
        return 0;
    }

    public final int a(int i2) {
        if (this.f == null || d(i2)) {
            return -1;
        }
        return this.d.a(this.f[i2]);
    }

    public final String b(int i2) {
        if (this.f == null || d(i2)) {
            return "unknown";
        }
        return this.f[i2].w() == MediaType.AUDIO ? "is audio episode" : "is video episode";
    }

    public final uys c(int i2) {
        if (this.f == null || d(i2)) {
            return null;
        }
        return this.f[i2];
    }

    public final void a(boolean z) {
        this.i = z;
    }

    private boolean d(int i2) {
        uys[] uysArr = this.f;
        return (uysArr != null && i2 >= uysArr.length) || i2 < 0;
    }

    public final void a(twp twp, int i2) {
        uys c2 = c(i2);
        if (c2 != null) {
            String b2 = this.d.b(c2);
            Integer n = c2.n();
            int m = (n == null || n.intValue() == 0) ? c2.m() : n.intValue();
            twp.d(String.format(Locale.US, "%02d:%02d", new Object[]{Integer.valueOf(m / 60), Integer.valueOf(m % 60)}));
            twp.c(uze.a(c2.b(), c2.c(), (Show) fay.a(c2.t()), Size.NORMAL));
            if (!b()) {
                twp.c(c2, b2, i2);
            }
            if (c2.l()) {
                Integer n2 = c2.n();
                if (n2 != null && n2.intValue() > 30) {
                    twp.d();
                } else if (c2.j() && n2 == null) {
                    twp.c();
                }
            }
            a(twp, c2, b2, i2, true);
        }
    }

    public final void a(tvb tvb, int i2) {
        uys c2 = c(i2);
        if (c2 != null) {
            String b2 = this.d.b(c2);
            if (b()) {
                boolean z = c2.u() instanceof f;
                if (c2.l() || !z) {
                    if (z) {
                        tvb.a(c2, b2, i2);
                    } else {
                        tvb.b(c2, b2, i2);
                    }
                }
            }
            Show t = c2.t();
            if (t != null) {
                tvb.e(t.a());
            } else {
                tvb.c();
            }
            Size size = Size.NORMAL;
            Show t2 = c2.t();
            tvb.c((this.c || t2 == null) ? c2.getImageUri(size) : t2.getImageUri(size));
            a(tvb, c2, b2, i2, false);
            tvb.d(c2.d());
            tvb.a(c2.n(), c2.m());
            uys[] uysArr = (uys[]) fay.a(this.f);
            tvb.c(c2, b2, i2);
            tvb.b(c2, uysArr, b2, i2);
            tvb.c(c2, uysArr, b2, i2);
            tvb.d(c2, b2, i2);
            tvb.d(c2, uysArr, b2, i2);
            tvb.d();
            tvb.a(c2.u(), c2.k());
        }
    }

    private boolean b() {
        return this.i;
    }

    public final void a(tvr tvr, int i2) {
        uys c2 = c(i2);
        if (c2 != null) {
            tvr.a(this.b.a(c2.getHeader()));
        }
    }

    public final void a(tvt tvt, int i2) {
        CharSequence charSequence;
        uys c2 = c(i2);
        if (c2 != null) {
            tvt.a.a(c2.getTitle());
            Show t = c2.t();
            if (t != null) {
                charSequence = t.c();
            } else {
                charSequence = null;
            }
            if (charSequence != null) {
                tvt.a.b(charSequence);
            }
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.CHECK;
            float dimensionPixelSize = (float) tvt.b.getResources().getDimensionPixelSize(R.dimen.quickactions_episode_entity_row_improved_icon_radius);
            Context context = tvt.b;
            Style style = Style.AQUATIC;
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{GradientDrawable.a(Type.LINEAR, gb.b(context.getResources(), style.mStartColorRes, null), gb.b(context.getResources(), style.mEndColorRes, null), dimensionPixelSize), new uvd(new SpotifyIconDrawable(tvt.b, spotifyIconV2, (float) tvt.c), tvt.d)});
            int dimensionPixelOffset = tvt.b.getResources().getDimensionPixelOffset(R.dimen.quickactions_episode_entity_row_image_size);
            ImageView c3 = tvt.a.c();
            c3.getLayoutParams().height = dimensionPixelOffset;
            c3.getLayoutParams().width = dimensionPixelOffset;
            c3.setScaleType(ScaleType.FIT_XY);
            c3.setImageDrawable(layerDrawable);
            tvt.a(c2.getTargetUri());
        }
    }

    private void a(tuz tuz, uys uys, String str, int i2, boolean z) {
        boolean a2 = a(uys);
        tuz.a(a2);
        boolean z2 = false;
        tuz.b(a2 && this.h);
        tuz.c(uys.k());
        Show t = uys.t();
        tuz.a(this.a.a(t != null ? t.a() : "", uys.s(), uys.m(), uys.n(), uys.o()).c(a2).a(true).b(z).a());
        tuz.b(uys.a());
        tuz.a(uys, (uys[]) fay.a(this.f), str, i2);
        if (uys.i()) {
            tuz.a();
        } else {
            tuz.b();
        }
        if (this.e.a() && uys.i()) {
            z2 = true;
        }
        tuz.d(z2);
    }

    private boolean a(uys uys) {
        return !TextUtils.isEmpty(this.g) && TextUtils.equals(this.g, uys.getUri());
    }

    public final void a(String str, boolean z) {
        if (z != this.h || !TextUtils.equals(str, this.g)) {
            this.g = str;
            this.h = z;
        }
    }
}
