package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pph reason: default package */
public final class pph extends defpackage.rnw.a<a> {

    /* renamed from: pph$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final TextView b;
        private final TextView c;
        private final TextView d;

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(R.id.offer_title);
            this.c = (TextView) viewGroup.findViewById(R.id.offer_price);
            this.d = (TextView) viewGroup.findViewById(R.id.offer_period);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.setText(hcm.text().title());
            this.c.setText(hcm.text().subtitle());
            this.d.setText(hcm.text().accessory());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_title_price_period;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_title_price_period, viewGroup, false));
    }
}
