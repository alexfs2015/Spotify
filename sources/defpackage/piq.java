package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: piq reason: default package */
public final class piq extends defpackage.reu.a<a> {

    /* renamed from: piq$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final TextView b;
        private final TextView c;
        private final TextView d;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(R.id.offer_title);
            this.c = (TextView) viewGroup.findViewById(R.id.offer_price);
            this.d = (TextView) viewGroup.findViewById(R.id.offer_period);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.setText(gzt.text().title());
            this.c.setText(gzt.text().subtitle());
            this.d.setText(gzt.text().accessory());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_title_price_period;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_title_price_period, viewGroup, false));
    }
}
