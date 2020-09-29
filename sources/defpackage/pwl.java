package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pwl reason: default package */
public final class pwl extends c<a> {

    /* renamed from: pwl$a */
    static class a extends defpackage.gui.c.a<View> {
        private frd b;
        private TextView c = this.b.b();

        a(View view) {
            super(view);
            this.b = (frd) fqb.a(view, frd.class);
            TextView textView = this.c;
            textView.setTextColor(fr.c(textView.getContext(), R.color.glue_row_subtitle_color));
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            guj.a(gum, this.a, gzt);
            TextView textView = this.c;
            textView.setText(textView.getContext().getString(R.string.cosmos_search_clear_recents));
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        fqb.b();
        return new a(frq.c(viewGroup.getContext(), viewGroup).getView());
    }
}
