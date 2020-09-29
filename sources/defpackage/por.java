package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: por reason: default package */
public final class por extends defpackage.rnw.a<a> {

    /* renamed from: por$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            Drawable drawable = null;
            try {
                hcj bundle = hcm.custom().bundle("gradient");
                if (bundle != null) {
                    drawable = new GradientDrawable("topLeftBottomRight".equals(bundle.string("direction")) ? Orientation.TL_BR : Orientation.TOP_BOTTOM, new int[]{Color.parseColor(bundle.string("startColor")), Color.parseColor(bundle.string("endColor"))});
                }
            } catch (IllegalArgumentException unused) {
            }
            ((ViewGroup) this.a).setBackground(drawable);
            ((ViewGroup) this.a).removeAllViews();
            for (hcm hcm2 : hcm.children()) {
                gwi binder = gwm.d.getBinder(gwm.h.resolve(hcm2));
                ViewGroup viewGroup = (ViewGroup) this.a;
                if (binder != null) {
                    View a = binder.a(viewGroup, gwm);
                    binder.a(a, hcm2, gwm, bVar);
                    viewGroup.addView(a);
                }
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_gradient;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.premium_page_gradient, viewGroup, false));
    }
}
