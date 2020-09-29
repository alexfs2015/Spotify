package defpackage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: phs reason: default package */
public final class phs extends defpackage.reu.a<a> {
    private final phi a;
    private final phk b;

    /* renamed from: phs$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final phi b;
        private final ViewGroup c;
        private final phk d;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup, phi phi, phk phk) {
            super(viewGroup);
            this.b = phi;
            this.c = viewGroup;
            this.d = phk;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.c.removeAllViews();
            phk.a(gzt, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            phi phi = this.b;
            List<gzt> children = gzt.children();
            ViewGroup viewGroup = this.c;
            ArrayList<View> arrayList = new ArrayList<>(children.size());
            for (gzt gzt2 : children) {
                gui binder = gum.d.getBinder(gum.h.resolve(gzt2));
                if (binder != null) {
                    View a = binder.a(viewGroup, gum);
                    binder.a(a, gzt2, gum, bVar);
                    arrayList.add(a);
                }
            }
            for (View addView : arrayList) {
                this.c.addView(addView);
            }
            gzq bundle = gzt.custom().bundle("backgroundColor");
            if (bundle != null) {
                this.c.setBackgroundColor(Color.parseColor(bundle.string("hex")));
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_flexbox_container;
    }

    public phs(phi phi, phk phk) {
        this.a = phi;
        this.b = phk;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flexbox_container, viewGroup, false), this.a, this.b);
    }
}
