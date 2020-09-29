package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ppn reason: default package */
public final class ppn extends defpackage.rnw.a<a> {
    /* access modifiers changed from: private */
    public static final int a = Color.parseColor("#006450");
    /* access modifiers changed from: private */
    public static final int b = Color.parseColor("#19E68C");

    /* renamed from: ppn$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final TextView b = ((TextView) ((ViewGroup) this.a).findViewById(R.id.value_card_header));
        private final TextView c = ((TextView) ((ViewGroup) this.a).findViewById(R.id.value_card_premium_description));

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            int i;
            int i2;
            this.b.setText(hcm.text().title());
            this.c.setText(hcm.text().subtitle());
            try {
                hcj bundle = hcm.custom().bundle("gradient");
                if (bundle != null) {
                    i = Color.parseColor(bundle.string("startColor"));
                    i2 = Color.parseColor(bundle.string("endColor"));
                } else {
                    i = ppn.a;
                    i2 = ppn.b;
                }
            } catch (IllegalArgumentException unused) {
                i = ppn.a;
                i2 = ppn.b;
            }
            ((ViewGroup) this.a).setBackground(new GradientDrawable(Orientation.TL_BR, new int[]{i, i2}));
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_value_card_premium;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.value_card_premium, viewGroup, false));
    }
}
