package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ppl reason: default package */
public final class ppl extends defpackage.rnw.a<a> {

    /* renamed from: ppl$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final TextView b = ((TextView) ((ViewGroup) this.a).findViewById(R.id.value_card_header));
        private final TextView c = ((TextView) ((ViewGroup) this.a).findViewById(R.id.value_card_free_description));

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.setText(hcm.text().title());
            this.c.setText(hcm.text().subtitle());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_value_card_free;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.value_card_free, viewGroup, false));
    }
}
