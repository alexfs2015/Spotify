package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.fallbacks.SpotifyHubsFallbackUsageReporter;
import java.util.EnumSet;

/* renamed from: gyh reason: default package */
final class gyh implements gvl<View> {
    private final SpotifyHubsFallbackUsageReporter a;

    public gyh(a aVar) {
        this.a = new SpotifyHubsFallbackUsageReporter(aVar);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        return new Space(viewGroup.getContext());
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        this.a.a("Ignored model", gzt);
    }

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        this.a.a("Action on ignored model", gzt);
    }
}
