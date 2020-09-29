package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: pii reason: default package */
public final class pii extends defpackage.reu.a<a> {

    /* renamed from: pii$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final Button b;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (Button) viewGroup.findViewById(R.id.offer_cta);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.setText(gzt.text().title());
            Button button = this.b;
            String str = "click";
            if (gzt.events().containsKey(str)) {
                has.a(gum.c).a(str).a(gzt).a(button).a();
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_offer_cta;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_cta, viewGroup, false));
    }
}
