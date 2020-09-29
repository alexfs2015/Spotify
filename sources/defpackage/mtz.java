package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: mtz reason: default package */
public final class mtz extends defpackage.rev.a<a> {

    /* renamed from: mtz$a */
    static class a extends defpackage.gui.c.a<View> {
        private final TextView b;
        private final TextView c;
        private final View d;
        private final int e;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (TextView) view.findViewById(R.id.text);
            this.d = view.findViewById(R.id.container);
            this.e = view.getResources().getDimensionPixelSize(R.dimen.information_card_corner_radius);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.setText(gzt.text().title());
            this.c.setText(gzt.text().subtitle());
            gzq bundle = gzt.custom().bundle("color");
            if (bundle != null) {
                mty mty = new mty(bundle);
                GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TL_BR, new int[]{mty.a, mty.b});
                gradientDrawable.setCornerRadius((float) this.e);
                this.d.setBackground(gradientDrawable);
                this.c.setTextColor(mty.d);
                this.b.setTextColor(mty.c);
            }
        }
    }

    public final int b() {
        return R.id.information_card;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.information_card, viewGroup, false));
    }
}
