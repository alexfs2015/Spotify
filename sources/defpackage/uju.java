package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: uju reason: default package */
public final class uju extends defpackage.rnx.a<a> {
    private final ukc a;
    private final ukf b;

    /* renamed from: uju$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final uki b;
        private final ukc c;
        private final gwt d;
        private final ukf e;

        protected a(gwm gwm, uki uki, ukc ukc, ukf ukf) {
            super(uki.getView());
            this.b = uki;
            this.c = ukc;
            this.d = new gwt(gwm);
            this.e = ukf;
            this.b.e().a((androidx.recyclerview.widget.RecyclerView.a) this.d, false);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
            hdj.a(this.b.e(), aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.d.a(hcm.children());
            this.d.e();
            this.b.a(hcm.text().title());
            this.b.b(hcm.text().subtitle());
            this.b.d(!hcm.children().isEmpty());
            this.b.e("explicit".equals(hcm.custom().string("label")));
            this.b.c(gzg.a(hcm));
            hdl.a(gwm.c).a("click").a(hcm).a(this.b.getView()).a();
            hcp main = hcm.images().main();
            if (main == null || fbo.a(main.uri())) {
                Assertion.b("Image must not be null for SearchPodcastEpisodeRowBinding");
            } else {
                this.c.a(main, this.b.c());
            }
            this.e.a(gwm, this.b, hcm);
        }
    }

    public uju(ukc ukc, ukf ukf) {
        this.a = ukc;
        this.b = ukf;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final int b() {
        return R.id.search_podcast_episode_row;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        ukj ukj = new ukj(gab.a(viewGroup.getContext(), viewGroup, R.layout.search_podcast_episode_row));
        fqz.a(ukj);
        return new a(gwm, ukj, this.a, this.b);
    }
}
