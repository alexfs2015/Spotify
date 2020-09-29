package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.spotify.music.R;

/* renamed from: ppj reason: default package */
public final class ppj extends defpackage.rnw.a<a> {

    /* renamed from: ppj$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final ViewGroup b = ((ViewGroup) ((ViewGroup) this.a).findViewById(R.id.content));

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.removeAllViews();
            for (hcm hcm2 : hcm.children()) {
                gwi binder = gwm.d.getBinder(gwm.h.resolve(hcm2));
                ViewGroup viewGroup = this.b;
                if (binder != null) {
                    View a = binder.a(viewGroup, gwm);
                    binder.a(a, hcm2, gwm, bVar);
                    viewGroup.addView(a);
                }
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_value_card;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.value_card, viewGroup, false));
    }
}
