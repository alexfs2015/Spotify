package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: piw reason: default package */
public final class piw extends defpackage.reu.a<a> {
    /* access modifiers changed from: private */
    public static final int a = Color.parseColor("#006450");
    /* access modifiers changed from: private */
    public static final int b = Color.parseColor("#19E68C");

    /* renamed from: piw$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final TextView b = ((TextView) ((ViewGroup) this.a).findViewById(R.id.value_card_header));
        private final TextView c = ((TextView) ((ViewGroup) this.a).findViewById(R.id.value_card_premium_description));

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            int i;
            int i2;
            this.b.setText(gzt.text().title());
            this.c.setText(gzt.text().subtitle());
            try {
                gzq bundle = gzt.custom().bundle("gradient");
                if (bundle != null) {
                    i = Color.parseColor(bundle.string("startColor"));
                    i2 = Color.parseColor(bundle.string("endColor"));
                } else {
                    i = piw.a;
                    i2 = piw.b;
                }
            } catch (IllegalArgumentException unused) {
                i = piw.a;
                i2 = piw.b;
            }
            ((ViewGroup) this.a).setBackground(new GradientDrawable(Orientation.TL_BR, new int[]{i, i2}));
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_value_card_premium;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.value_card_premium, viewGroup, false));
    }
}
