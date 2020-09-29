package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: phh reason: default package */
public class phh extends jrd implements d, fzq, jqx, tyl, uqq {
    public phm T;
    public String a;
    public phk b;

    public static phh a(String str, Bundle bundle, fqn fqn) {
        phh phh = new phh();
        Bundle bundle2 = new Bundle();
        bundle2.putString("ARGUMENT_EPISODE_URI", (String) fbp.a(str));
        if (bundle != null) {
            bundle2.putBundle("ARGUMENT_EXTRAS", bundle);
        }
        phh.g(bundle2);
        fqo.a((Fragment) phh, fqn);
        return phh;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.T.a(layoutInflater, viewGroup);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        this.T.a(fzn);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return sso.a(this.a);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PODCAST_EPISODE, null);
    }

    public final uqm ag() {
        return uqo.aE;
    }

    public final String ah() {
        Bundle bundle = ((Bundle) fbp.a(this.i)).getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return bundle.getString("extra_playback_context_uri");
        }
        return null;
    }

    public final String ai() {
        Bundle bundle = ((Bundle) fbp.a(this.i)).getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return bundle.getString("extra_playback_row_id");
        }
        return null;
    }

    public final gkq aj() {
        return PageIdentifiers.PODCAST_EPISODE;
    }

    public final a ak() {
        Bundle bundle = ((Bundle) fbp.a(this.i)).getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return (a) bundle.getParcelable("extra_playback_playlist_endpoint_configuration");
        }
        return null;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final String e() {
        return PageIdentifiers.PODCAST_EPISODE.name();
    }
}
