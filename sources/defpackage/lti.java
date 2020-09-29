package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: lti reason: default package */
public final class lti extends defpackage.rnx.a<a> {
    private final HubsGlueImageDelegate a;

    /* renamed from: lti$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final fsc b;
        private final ImageView c;
        private final ImageView d;
        private final TextView e;
        private final TextView f;
        private final View g;
        private final View h;
        private final ImageView i;
        private final HubsGlueImageDelegate j;

        protected a(View view, HubsGlueImageDelegate hubsGlueImageDelegate, fsc fsc) {
            super(view);
            this.c = (ImageView) view.findViewById(R.id.artistspick_comment_image);
            this.e = (TextView) view.findViewById(R.id.artistspick_comment_text);
            this.g = view.findViewById(R.id.artistspick_comment);
            this.d = (ImageView) view.findViewById(R.id.artistspick_nocomment_image);
            this.f = (TextView) view.findViewById(R.id.artistspick_nocomment_text);
            this.h = view.findViewById(R.id.artistspick_nocomment);
            this.i = (ImageView) view.findViewById(R.id.artistspick_background);
            this.j = hubsGlueImageDelegate;
            this.b = fsc;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            ImageView imageView;
            gwj.a(gwm, this.a, hcm);
            String title = hcm.text().title();
            String str = "";
            if (fbo.a(title)) {
                title = str;
            }
            String subtitle = hcm.text().subtitle();
            if (fbo.a(subtitle)) {
                subtitle = str;
            }
            this.b.a(title);
            this.b.b(subtitle);
            this.j.a(this.b.c(), hcm.images().main(), HubsGlueImageConfig.THUMBNAIL);
            boolean boolValue = hcm.custom().boolValue("artistAddedComment", false);
            String string = hcm.custom().string("commentText");
            hcp hcp = (hcp) hcm.images().custom().get("artistImage");
            if (boolValue) {
                this.g.setVisibility(0);
                this.h.setVisibility(8);
                this.e.setText(string);
                imageView = this.c;
            } else {
                this.g.setVisibility(8);
                this.h.setVisibility(0);
                this.f.setText(string);
                imageView = this.d;
            }
            if (hcp != null) {
                hcp a = hcp.toBuilder().b(Style.CIRCULAR.mSetting).a();
                this.j.a(imageView);
                this.j.a(imageView, a, HubsGlueImageConfig.THUMBNAIL);
            }
            this.j.a(this.i, hcm.images().background(), HubsGlueImageConfig.CARD);
        }
    }

    public lti(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = hubsGlueImageDelegate;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final int b() {
        return R.id.hubs_artist_pick_card_component;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.artistspickv2, viewGroup, false);
        fqv.b();
        fsc b = fsk.b(viewGroup.getContext(), null, false);
        ((ViewGroup) viewGroup2.findViewById(R.id.artistspick_description_container)).addView(b.getView());
        return new a(viewGroup2, this.a, b);
    }
}
