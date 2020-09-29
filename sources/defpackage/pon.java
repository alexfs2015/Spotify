package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pon reason: default package */
public final class pon extends defpackage.rnw.a<a> {
    private final pob a;

    /* renamed from: pon$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final TextView b;
        private final pob c;

        protected a(ViewGroup viewGroup, pob pob) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(R.id.flexbox_subtitle);
            this.c = pob;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            pob.a(hcm, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            this.b.setText(hcm.text().subtitle());
        }
    }

    public pon(pob pob) {
        this.a = pob;
    }

    public final int b() {
        return R.id.hubs_premium_page_flexbox_subtitle;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flexbox_subtitle, viewGroup, false), this.a);
    }
}
