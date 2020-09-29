package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: pia reason: default package */
public final class pia extends defpackage.reu.a<a> {

    /* renamed from: pia$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            Drawable drawable = null;
            try {
                gzq bundle = gzt.custom().bundle("gradient");
                if (bundle != null) {
                    drawable = new GradientDrawable("topLeftBottomRight".equals(bundle.string("direction")) ? Orientation.TL_BR : Orientation.TOP_BOTTOM, new int[]{Color.parseColor(bundle.string("startColor")), Color.parseColor(bundle.string("endColor"))});
                }
            } catch (IllegalArgumentException unused) {
            }
            ((ViewGroup) this.a).setBackground(drawable);
            ((ViewGroup) this.a).removeAllViews();
            for (gzt gzt2 : gzt.children()) {
                gui binder = gum.d.getBinder(gum.h.resolve(gzt2));
                ViewGroup viewGroup = (ViewGroup) this.a;
                if (binder != null) {
                    View a = binder.a(viewGroup, gum);
                    binder.a(a, gzt2, gum, bVar);
                    viewGroup.addView(a);
                }
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_gradient;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.premium_page_gradient, viewGroup, false));
    }
}
