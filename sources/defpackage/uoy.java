package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: uoy reason: default package */
public final class uoy extends defpackage.reu.a<a> {

    /* renamed from: uoy$a */
    static class a extends defpackage.gui.c.a<FrameLayout> {
        private final Button b;

        protected a(FrameLayout frameLayout) {
            super(frameLayout);
            this.b = (Button) frameLayout.findViewById(R.id.sausage);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            this.b.setText(gzt.text().title());
            Optional a = defpackage.gxx.a.a.a(gzt.images().icon());
            if (a.b()) {
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.b.getContext(), (SpotifyIconV2) a.c(), (float) uts.b(16.0f, this.b.getResources()));
                spotifyIconDrawable.a(this.b.getTextColors());
                this.b.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, null, null, null);
            }
            Button button = this.b;
            String str = "click";
            if (gzt.events().containsKey(str)) {
                has.a(gum.c).a(str).a(gzt).a(button).a();
            }
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a((View) this.b, gzt, aVar, iArr);
        }
    }

    public final int b() {
        return R.id.hub_trending_search_pill_component;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pill_inset_view, viewGroup, false));
    }
}
