package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.R;

/* renamed from: pig reason: default package */
public final class pig extends defpackage.reu.a<a> {
    /* access modifiers changed from: private */
    public static final int a;
    /* access modifiers changed from: private */
    public static final int b;

    /* renamed from: pig$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final LinearLayout b;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (LinearLayout) viewGroup.findViewById(R.id.content);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            int i;
            int i2;
            try {
                gzq bundle = gzt.custom().bundle("gradient");
                if (bundle != null) {
                    i = Color.parseColor(bundle.string("startColor"));
                    i2 = Color.parseColor(bundle.string("endColor"));
                } else {
                    i = pig.a;
                    i2 = pig.b;
                }
            } catch (IllegalArgumentException unused) {
                i = pig.a;
                i2 = pig.b;
            }
            GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TL_BR, new int[]{i, i2});
            gradientDrawable.setCornerRadius(((ViewGroup) this.a).getResources().getDimension(R.dimen.corner_radius_offer_card));
            ((ViewGroup) this.a).setBackground(gradientDrawable);
            this.b.removeAllViews();
            for (gzt gzt2 : gzt.children()) {
                gui binder = gum.d.getBinder(gum.h.resolve(gzt2));
                LinearLayout linearLayout = this.b;
                if (binder != null) {
                    View a = binder.a(linearLayout, gum);
                    binder.a(a, gzt2, gum, bVar);
                    linearLayout.addView(a);
                }
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_card;
    }

    static {
        String str = "#404040";
        a = Color.parseColor(str);
        b = Color.parseColor(str);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_card, viewGroup, false));
    }
}
