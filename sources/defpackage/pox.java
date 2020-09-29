package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.R;

/* renamed from: pox reason: default package */
public final class pox extends defpackage.rnw.a<a> {
    /* access modifiers changed from: private */
    public static final int a;
    /* access modifiers changed from: private */
    public static final int b;

    /* renamed from: pox$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final LinearLayout b;

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (LinearLayout) viewGroup.findViewById(R.id.content);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            int i;
            int i2;
            try {
                hcj bundle = hcm.custom().bundle("gradient");
                if (bundle != null) {
                    i = Color.parseColor(bundle.string("startColor"));
                    i2 = Color.parseColor(bundle.string("endColor"));
                } else {
                    i = pox.a;
                    i2 = pox.b;
                }
            } catch (IllegalArgumentException unused) {
                i = pox.a;
                i2 = pox.b;
            }
            GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TL_BR, new int[]{i, i2});
            gradientDrawable.setCornerRadius(((ViewGroup) this.a).getResources().getDimension(R.dimen.corner_radius_offer_card));
            ((ViewGroup) this.a).setBackground(gradientDrawable);
            this.b.removeAllViews();
            for (hcm hcm2 : hcm.children()) {
                gwi binder = gwm.d.getBinder(gwm.h.resolve(hcm2));
                LinearLayout linearLayout = this.b;
                if (binder != null) {
                    View a = binder.a(linearLayout, gwm);
                    binder.a(a, hcm2, gwm, bVar);
                    linearLayout.addView(a);
                }
            }
        }
    }

    static {
        String str = "#404040";
        a = Color.parseColor(str);
        b = Color.parseColor(str);
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_card;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_card, viewGroup, false));
    }
}
