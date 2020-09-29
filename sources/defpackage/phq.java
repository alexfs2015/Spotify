package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: phq reason: default package */
public final class phq extends defpackage.reu.a<a> {
    private final phk a;

    /* renamed from: phq$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final Button b;
        private final phk c;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup, phk phk) {
            super(viewGroup);
            this.b = (Button) viewGroup.findViewById(R.id.flexbox_button);
            this.c = phk;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            phk.a(gzt, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            this.b.setText(gzt.text().title());
            Button button = this.b;
            String str = "click";
            if (gzt.events().containsKey(str)) {
                has.a(gum.c).a(str).a(gzt).a(button).a();
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_flexbox_button;
    }

    public phq(phk phk) {
        this.a = phk;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flexbox_button, viewGroup, false), this.a);
    }
}
