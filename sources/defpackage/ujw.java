package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: ujw reason: default package */
public final class ujw extends defpackage.rnx.a<a> {
    private final ukc a;
    private final ukf b;

    /* renamed from: ujw$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final ukk b;
        private final ukc c;
        private final ukf d;

        protected a(ukk ukk, ukc ukc, ukf ukf) {
            super(ukk.getView());
            this.b = ukk;
            this.c = ukc;
            this.d = ukf;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.a(hcm.text().title());
            this.b.b(hcm.text().subtitle());
            this.b.a(hcm.custom().string("subtitle_tag"));
            hdl.a(gwm.c).a("click").a(hcm).a(this.b.getView()).a();
            hcp main = hcm.images().main();
            if (main == null || fbo.a(main.uri())) {
                Assertion.b("Image must not be null for SearchPodcastShowRowBinding");
            } else {
                this.c.a(main, this.b.c());
            }
            this.d.a(gwm, this.b, hcm);
        }
    }

    public ujw(ukc ukc, ukf ukf) {
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
        ukl ukl = new ukl(gab.a(viewGroup.getContext(), viewGroup, R.layout.search_podcast_show_row));
        fqz.a(ukl);
        return new a(ukl, this.a, this.b);
    }
}
