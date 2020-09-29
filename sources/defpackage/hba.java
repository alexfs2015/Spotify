package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.fallbacks.SpotifyHubsFallbackUsageReporter;
import java.util.EnumSet;

/* renamed from: hba reason: default package */
final class hba implements gxl<View> {
    private final SpotifyHubsFallbackUsageReporter a;

    public hba(a aVar) {
        this.a = new SpotifyHubsFallbackUsageReporter(aVar);
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        return new Space(viewGroup.getContext());
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        this.a.a("Action on ignored model", hcm);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        this.a.a("Ignored model", hcm);
    }
}
