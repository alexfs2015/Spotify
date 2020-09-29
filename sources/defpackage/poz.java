package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: poz reason: default package */
public final class poz extends defpackage.rnw.a<a> {

    /* renamed from: poz$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final Button b;

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (Button) viewGroup.findViewById(R.id.offer_cta);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.setText(hcm.text().title());
            Button button = this.b;
            String str = "click";
            if (hcm.events().containsKey(str)) {
                hdl.a(gwm.c).a(str).a(hcm).a(button).a();
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_cta;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_cta, viewGroup, false));
    }
}
