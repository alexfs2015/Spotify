package defpackage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: poj reason: default package */
public final class poj extends defpackage.rnw.a<a> {
    private final pnz a;
    private final pob b;

    /* renamed from: poj$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final pnz b;
        private final ViewGroup c;
        private final pob d;

        protected a(ViewGroup viewGroup, pnz pnz, pob pob) {
            super(viewGroup);
            this.b = pnz;
            this.c = viewGroup;
            this.d = pob;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.c.removeAllViews();
            pob.a(hcm, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            pnz pnz = this.b;
            List<hcm> children = hcm.children();
            ViewGroup viewGroup = this.c;
            ArrayList<View> arrayList = new ArrayList<>(children.size());
            for (hcm hcm2 : children) {
                gwi binder = gwm.d.getBinder(gwm.h.resolve(hcm2));
                if (binder != null) {
                    View a = binder.a(viewGroup, gwm);
                    binder.a(a, hcm2, gwm, bVar);
                    arrayList.add(a);
                }
            }
            for (View addView : arrayList) {
                this.c.addView(addView);
            }
            hcj bundle = hcm.custom().bundle("backgroundColor");
            if (bundle != null) {
                this.c.setBackgroundColor(Color.parseColor(bundle.string("hex")));
            }
        }
    }

    public poj(pnz pnz, pob pob) {
        this.a = pnz;
        this.b = pob;
    }

    public final int b() {
        return R.id.hubs_premium_page_flexbox_container;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flexbox_container, viewGroup, false), this.a, this.b);
    }
}
