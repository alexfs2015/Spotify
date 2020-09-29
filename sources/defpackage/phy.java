package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: phy reason: default package */
public final class phy extends defpackage.reu.a<a> {
    private final phk a;

    /* renamed from: phy$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final TextView b;
        private final phk c;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup, phk phk) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(R.id.flexbox_title);
            this.c = phk;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            phk.a(gzt, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            this.b.setText(gzt.text().title());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_flexbox_title;
    }

    public phy(phk phk) {
        this.a = phk;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flexbox_title, viewGroup, false), this.a);
    }
}
