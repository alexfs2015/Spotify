package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: qfh reason: default package */
public final class qfh extends c<a> {

    /* renamed from: qfh$a */
    static class a extends defpackage.gwi.c.a<View> {
        private frx b;
        private TextView c = this.b.b();

        a(View view) {
            super(view);
            this.b = (frx) fqv.a(view, frx.class);
            TextView textView = this.c;
            textView.setTextColor(fr.c(textView.getContext(), R.color.glue_row_subtitle_color));
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            gwj.a(gwm, this.a, hcm);
            TextView textView = this.c;
            textView.setText(textView.getContext().getString(R.string.cosmos_search_clear_recents));
        }
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        fqv.b();
        return new a(fsk.c(viewGroup.getContext(), viewGroup).getView());
    }
}
