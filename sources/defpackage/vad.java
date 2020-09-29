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

/* renamed from: vad reason: default package */
public final class vad extends defpackage.rnw.a<a> {

    /* renamed from: vad$a */
    static class a extends defpackage.gwi.c.a<FrameLayout> {
        private final Button b;

        protected a(FrameLayout frameLayout) {
            super(frameLayout);
            this.b = (Button) frameLayout.findViewById(R.id.sausage);
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a((View) this.b, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            this.b.setText(hcm.text().title());
            Optional a = defpackage.haq.a.a.a(hcm.images().icon());
            if (a.b()) {
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.b.getContext(), (SpotifyIconV2) a.c(), (float) vfj.b(16.0f, this.b.getResources()));
                spotifyIconDrawable.a(this.b.getTextColors());
                this.b.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, null, null, null);
            }
            Button button = this.b;
            String str = "click";
            if (hcm.events().containsKey(str)) {
                hdl.a(gwm.c).a(str).a(hcm).a(button).a();
            }
        }
    }

    public final int b() {
        return R.id.hub_trending_search_pill_component;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pill_inset_view, viewGroup, false));
    }
}
