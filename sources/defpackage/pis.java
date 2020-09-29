package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.spotify.music.R;

/* renamed from: pis reason: default package */
public final class pis extends defpackage.reu.a<a> {

    /* renamed from: pis$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final ViewGroup b = ((ViewGroup) ((ViewGroup) this.a).findViewById(R.id.content));

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.removeAllViews();
            for (gzt gzt2 : gzt.children()) {
                gui binder = gum.d.getBinder(gum.h.resolve(gzt2));
                ViewGroup viewGroup = this.b;
                if (binder != null) {
                    View a = binder.a(viewGroup, gum);
                    binder.a(a, gzt2, gum, bVar);
                    viewGroup.addView(a);
                }
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_value_card;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.value_card, viewGroup, false));
    }
}
