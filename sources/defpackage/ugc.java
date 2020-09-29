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

/* renamed from: ugc reason: default package */
public final class ugc implements ugb {
    private final tyx a;
    private final ufp b;
    private final boolean c;
    private final ugi d;
    private final ufy e;
    private vkv[] f;
    private String g;
    private boolean h;
    private boolean i;

    public ugc(tyx tyx, ufp ufp, boolean z, ufy ufy, ugi ugi) {
        this.a = tyx;
        this.b = ufp;
        this.e = ufy;
        this.c = z;
        this.d = ugi;
    }

    private void a(uhc uhc, vkv vkv, String str, int i2, boolean z) {
        boolean a2 = a(vkv);
        uhc.a(a2);
        boolean z2 = false;
        uhc.b(a2 && this.h);
        uhc.c(vkv.k());
        Show t = vkv.t();
        uhc.a(this.a.a(t != null ? t.a() : "", vkv.s(), vkv.m(), vkv.n(), vkv.o()).c(a2).a(true).b(z).a());
        uhc.b(vkv.a());
        uhc.a(vkv, (vkv[]) fbp.a(this.f), str, i2);
        if (vkv.i()) {
            uhc.a();
        } else {
            uhc.b();
        }
        if (this.e.a() && vkv.i()) {
            z2 = true;
        }
        uhc.d(z2);
    }

    private boolean a(vkv vkv) {
        return !TextUtils.isEmpty(this.g) && TextUtils.equals(this.g, vkv.getUri());
    }

    private boolean b() {
        return this.i;
    }

    private boolean d(int i2) {
        vkv[] vkvArr = this.f;
        return (vkvArr != null && i2 >= vkvArr.length) || i2 < 0;
    }

    public final int a() {
        vkv[] vkvArr = this.f;
        if (vkvArr != null) {
            return vkvArr.length;
        }
        return 0;
    }

    public final int a(int i2) {
        if (this.f == null || d(i2)) {
            return -1;
        }
        return this.d.a(this.f[i2]);
    }

    public final void a(String str, boolean z) {
        if (z != this.h || !TextUtils.equals(str, this.g)) {
            this.g = str;
            this.h = z;
        }
    }

    public final void a(uhe uhe, int i2) {
        vkv c2 = c(i2);
        if (c2 != null) {
            String b2 = this.d.b(c2);
            if (b()) {
                boolean z = c2.u() instanceof f;
                if (c2.l() || !z) {
                    if (z) {
                        uhe.a(c2, b2, i2);
                    } else {
                        uhe.b(c2, b2, i2);
                    }
                }
            }
            Show t = c2.t();
            if (t != null) {
                uhe.e(t.a());
            } else {
                uhe.c();
            }
            Size size = Size.NORMAL;
            Show t2 = c2.t();
            uhe.c((this.c || t2 == null) ? c2.getImageUri(size) : t2.getImageUri(size));
            a(uhe, c2, b2, i2, false);
            uhe.d(c2.d());
            uhe.a(c2.n(), c2.m());
            vkv[] vkvArr = (vkv[]) fbp.a(this.f);
            uhe.c(c2, b2, i2);
            uhe.b(c2, vkvArr, b2, i2);
            uhe.c(c2, vkvArr, b2, i2);
            uhe.d(c2, b2, i2);
            uhe.d(c2, vkvArr, b2, i2);
            uhe.d();
            uhe.a(c2.u(), c2.k());
        }
    }

    public final void a(uhu uhu, int i2) {
        vkv c2 = c(i2);
        if (c2 != null) {
            uhu.a(this.b.a(c2.getHeader()));
        }
    }

    public final void a(uhw uhw, int i2) {
        vkv c2 = c(i2);
        if (c2 != null) {
            uhw.a.a(c2.getTitle());
            Show t = c2.t();
            CharSequence c3 = t != null ? t.c() : null;
            if (c3 != null) {
                uhw.a.b(c3);
            }
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.CHECK;
            float dimensionPixelSize = (float) uhw.b.getResources().getDimensionPixelSize(R.dimen.quickactions_episode_entity_row_improved_icon_radius);
            Context context = uhw.b;
            Style style = Style.AQUATIC;
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{GradientDrawable.a(Type.LINEAR, gb.b(context.getResources(), style.mStartColorRes, null), gb.b(context.getResources(), style.mEndColorRes, null), dimensionPixelSize), new vgu(new SpotifyIconDrawable(uhw.b, spotifyIconV2, (float) uhw.c), uhw.d)});
            int dimensionPixelOffset = uhw.b.getResources().getDimensionPixelOffset(R.dimen.quickactions_episode_entity_row_image_size);
            ImageView c4 = uhw.a.c();
            c4.getLayoutParams().height = dimensionPixelOffset;
            c4.getLayoutParams().width = dimensionPixelOffset;
            c4.setScaleType(ScaleType.FIT_XY);
            c4.setImageDrawable(layerDrawable);
            uhw.a(c2.getTargetUri());
        }
    }

    public final void a(uis uis, int i2) {
        vkv c2 = c(i2);
        if (c2 != null) {
            String b2 = this.d.b(c2);
            Integer n = c2.n();
            int m = (n == null || n.intValue() == 0) ? c2.m() : n.intValue();
            uis.d(String.format(Locale.US, "%02d:%02d", new Object[]{Integer.valueOf(m / 60), Integer.valueOf(m % 60)}));
            uis.c(vlh.a(c2.b(), c2.c(), (Show) fbp.a(c2.t()), Size.NORMAL));
            if (!b()) {
                uis.c(c2, b2, i2);
            }
            if (c2.l()) {
                Integer n2 = c2.n();
                if (n2 != null && n2.intValue() > 30) {
                    uis.d();
                } else if (c2.j() && n2 == null) {
                    uis.c();
                }
            }
            a(uis, c2, b2, i2, true);
        }
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void a(vkv[] vkvArr) {
        this.f = vkvArr;
    }

    public final String b(int i2) {
        if (this.f == null || d(i2)) {
            return "unknown";
        }
        return this.f[i2].w() == MediaType.AUDIO ? "is audio episode" : "is video episode";
    }

    public final vkv c(int i2) {
        if (this.f == null || d(i2)) {
            return null;
        }
        return this.f[i2];
    }
}
