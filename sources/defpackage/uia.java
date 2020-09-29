package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;

/* renamed from: uia reason: default package */
public final class uia {
    private final Context a;
    private final shg b;

    public uia(Context context, shg shg) {
        this.a = context;
        this.b = shg;
    }

    public static void a(ucs ucs, int i, int i2, boolean z) {
        if (z && i == 0) {
            ucs.a(1);
            ucs.b(1);
            ucs.g();
        } else if (i <= 0 || i2 <= 0) {
            ucs.h();
        } else {
            ucs.a(i2);
            ucs.b(i);
            ucs.g();
        }
    }

    public static void a(ucs ucs, vkv vkv, boolean z) {
        Size size = Size.NORMAL;
        Show t = vkv.t();
        ucs.a((z || t == null) ? vkv.getImageUri(size) : t.getImageUri(size));
    }

    public static void a(ucv ucv, OnClickListener onClickListener) {
        ucv.m().setOnClickListener(onClickListener);
    }

    public static void a(ucv ucv, vkv vkv) {
        if (TextUtils.isEmpty(vkv.d())) {
            ucv.l();
            return;
        }
        ucv.d(uiq.a(vkv.d()));
        ucv.k();
    }

    public static void b(ucs ucs, vkv vkv) {
        if (vkv.i()) {
            ucs.i();
        } else {
            ucs.j();
        }
    }

    public static void b(ucv ucv, boolean z) {
        ucv.m().setEnabled(z);
    }

    public final void a(String str, ucv ucv, vli vli) {
        ucv.f(false);
        ucv.h(false);
        LottieAnimationView m = ucv.m();
        m.setVisibility(0);
        Object tag = m.getTag();
        shk a2 = tag instanceof shk ? (shk) tag : this.b.a();
        m.setTag(a2);
        sif.a(vli, m, a2, str);
    }

    public final void a(ucs ucs, vkv vkv) {
        boolean o = vkv.o();
        int m = vkv.m();
        int intValue = ((Integer) jvi.a(vkv.n(), Integer.valueOf(m))).intValue();
        if (intValue > m) {
            intValue = m;
        }
        a(ucs, m - intValue, m, o);
    }

    public final void a(ucv ucv, vli vli) {
        boolean z = vli instanceof b;
        boolean z2 = vli instanceof h;
        boolean z3 = vli instanceof a;
        if (z || z2 || z3) {
            if (z) {
                ucv.f(true);
            } else if (z2) {
                ucv.f(true);
            } else {
                ucv.f(false);
            }
            ucv.f(this.a.getString(R.string.content_description_downloaded));
            ucv.c(ucx.a(this.a));
            return;
        }
        ucv.f(false);
        ucv.f(this.a.getString(R.string.content_description_download));
        ucv.c(ucx.b(this.a));
    }

    public final void a(ucv ucv, boolean z) {
        if (z) {
            ucv.a((Drawable) ucx.e(this.a));
            ucv.b(this.a.getString(R.string.content_description_pause_button));
            return;
        }
        ucv.a((Drawable) ucx.d(this.a));
        ucv.b(this.a.getString(R.string.content_description_play_button));
    }
}
