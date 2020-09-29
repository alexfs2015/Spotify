package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.music.features.artistbio.view.MonthlyListenersView;
import java.util.EnumSet;

/* renamed from: lpg reason: default package */
public final class lpg extends defpackage.rev.a<a> {

    /* renamed from: lpg$a */
    static class a extends defpackage.gui.c.a<View> {
        private TextView b;
        private MonthlyListenersView c;

        a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.biography);
            this.c = (MonthlyListenersView) view.findViewById(R.id.monthly_listeners_layout);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            guj.a(gum, this.a, gzt);
            String description = gzt.text().description();
            if (description != null) {
                this.b.setText(jrw.a(description).toString());
            }
            this.c.a(gzt.custom().intValue("monthly_listeners_count", -1), gzt.custom().intValue("global_chart_position", -1));
            MonthlyListenersView monthlyListenersView = this.c;
            uuu.a(monthlyListenersView.getContext(), monthlyListenersView.a, 2132017670);
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }
    }

    public final int b() {
        return R.id.hubs_artist_biography_component;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.artist_about_card, viewGroup, false));
    }
}
