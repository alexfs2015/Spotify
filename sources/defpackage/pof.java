package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pof reason: default package */
public final class pof extends defpackage.rnw.a<a> {

    /* renamed from: pof$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final TextView b;
        private final TextView c;

        public a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.current_plan_name);
            this.c = (TextView) view.findViewById(R.id.current_plan_description);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.setText(hcm.text().title());
            this.c.setText(hcm.text().subtitle());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_current_plan_card;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.current_plan_card, viewGroup, false));
    }
}
