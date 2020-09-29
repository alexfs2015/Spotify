package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: poh reason: default package */
public final class poh extends defpackage.rnw.a<a> {
    private final pob a;

    /* renamed from: poh$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final Button b;
        private final pob c;

        protected a(ViewGroup viewGroup, pob pob) {
            super(viewGroup);
            this.b = (Button) viewGroup.findViewById(R.id.flexbox_button);
            this.c = pob;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            pob.a(hcm, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            this.b.setText(hcm.text().title());
            Button button = this.b;
            String str = "click";
            if (hcm.events().containsKey(str)) {
                hdl.a(gwm.c).a(str).a(hcm).a(button).a();
            }
        }
    }

    public poh(pob pob) {
        this.a = pob;
    }

    public final int b() {
        return R.id.hubs_premium_page_flexbox_button;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flexbox_button, viewGroup, false), this.a);
    }
}
