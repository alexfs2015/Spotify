package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: piu reason: default package */
public final class piu extends defpackage.reu.a<a> {

    /* renamed from: piu$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final TextView b = ((TextView) ((ViewGroup) this.a).findViewById(R.id.value_card_header));
        private final TextView c = ((TextView) ((ViewGroup) this.a).findViewById(R.id.value_card_free_description));

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.setText(gzt.text().title());
            this.c.setText(gzt.text().subtitle());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_value_card_free;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.value_card_free, viewGroup, false));
    }
}
