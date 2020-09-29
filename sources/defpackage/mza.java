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

/* renamed from: mza reason: default package */
public final class mza extends defpackage.rnx.a<a> {

    /* renamed from: mza$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final TextView b;
        private final TextView c;
        private final View d;
        private final int e;

        protected a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (TextView) view.findViewById(R.id.text);
            this.d = view.findViewById(R.id.container);
            this.e = view.getResources().getDimensionPixelSize(R.dimen.information_card_corner_radius);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.setText(hcm.text().title());
            this.c.setText(hcm.text().subtitle());
            hcj bundle = hcm.custom().bundle("color");
            if (bundle != null) {
                myz myz = new myz(bundle);
                GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TL_BR, new int[]{myz.a, myz.b});
                gradientDrawable.setCornerRadius((float) this.e);
                this.d.setBackground(gradientDrawable);
                this.c.setTextColor(myz.d);
                this.b.setTextColor(myz.c);
            }
        }
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD);
    }

    public final int b() {
        return R.id.information_card;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.information_card, viewGroup, false));
    }
}
