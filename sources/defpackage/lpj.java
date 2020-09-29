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

/* renamed from: lpj reason: default package */
public final class lpj extends defpackage.rev.a<a> {
    private final HubsGlueImageDelegate a;

    /* renamed from: lpj$a */
    static class a extends defpackage.gui.c.a<View> {
        private final fri b;
        private final ImageView c;
        private final ImageView d;
        private final TextView e;
        private final TextView f;
        private final View g;
        private final View h;
        private final ImageView i;
        private final HubsGlueImageDelegate j;

        protected a(View view, HubsGlueImageDelegate hubsGlueImageDelegate, fri fri) {
            super(view);
            this.c = (ImageView) view.findViewById(R.id.artistspick_comment_image);
            this.e = (TextView) view.findViewById(R.id.artistspick_comment_text);
            this.g = view.findViewById(R.id.artistspick_comment);
            this.d = (ImageView) view.findViewById(R.id.artistspick_nocomment_image);
            this.f = (TextView) view.findViewById(R.id.artistspick_nocomment_text);
            this.h = view.findViewById(R.id.artistspick_nocomment);
            this.i = (ImageView) view.findViewById(R.id.artistspick_background);
            this.j = hubsGlueImageDelegate;
            this.b = fri;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            ImageView imageView;
            guj.a(gum, this.a, gzt);
            String title = gzt.text().title();
            String str = "";
            if (fax.a(title)) {
                title = str;
            }
            String subtitle = gzt.text().subtitle();
            if (fax.a(subtitle)) {
                subtitle = str;
            }
            this.b.a(title);
            this.b.b(subtitle);
            this.j.a(this.b.c(), gzt.images().main(), HubsGlueImageConfig.THUMBNAIL);
            boolean boolValue = gzt.custom().boolValue("artistAddedComment", false);
            String string = gzt.custom().string("commentText");
            gzw gzw = (gzw) gzt.images().custom().get("artistImage");
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
            if (gzw != null) {
                gzw a = gzw.toBuilder().b(Style.CIRCULAR.mSetting).a();
                this.j.a(imageView);
                this.j.a(imageView, a, HubsGlueImageConfig.THUMBNAIL);
            }
            this.j.a(this.i, gzt.images().background(), HubsGlueImageConfig.CARD);
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }
    }

    public final int b() {
        return R.id.hubs_artist_pick_card_component;
    }

    public lpj(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = hubsGlueImageDelegate;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.artistspickv2, viewGroup, false);
        fqb.b();
        fri b = frq.b(viewGroup.getContext(), null, false);
        ((ViewGroup) viewGroup2.findViewById(R.id.artistspick_description_container)).addView(b.getView());
        return new a(viewGroup2, this.a, b);
    }
}
