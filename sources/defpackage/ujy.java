package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: ujy reason: default package */
public final class ujy extends defpackage.rnw.a<a> {

    /* renamed from: ujy$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final ukm b;

        protected a(ukm ukm) {
            super(ukm.getView());
            this.b = ukm;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.a(hcm.text().title());
        }
    }

    public final int b() {
        return R.id.search_podcast_episode_row_tag;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(new ukn(viewGroup));
    }
}
