package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pho reason: default package */
public final class pho extends defpackage.reu.a<a> {

    /* renamed from: pho$a */
    static class a extends defpackage.gui.c.a<View> {
        private final TextView b;
        private final TextView c;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        public a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.current_plan_name);
            this.c = (TextView) view.findViewById(R.id.current_plan_description);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.setText(gzt.text().title());
            this.c.setText(gzt.text().subtitle());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_current_plan_card;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.current_plan_card, viewGroup, false));
    }
}
