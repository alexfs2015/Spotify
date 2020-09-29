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

/* renamed from: ozy reason: default package */
public class ozy extends jor implements d, fyw, jol, tmq, udv {
    public pad T;
    public String a;
    public pab b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static ozy a(String str, Bundle bundle, fpt fpt) {
        ozy ozy = new ozy();
        Bundle bundle2 = new Bundle();
        bundle2.putString("ARGUMENT_EPISODE_URI", (String) fay.a(str));
        if (bundle != null) {
            bundle2.putBundle("ARGUMENT_EXTRAS", bundle);
        }
        ozy.g(bundle2);
        fpu.a((Fragment) ozy, fpt);
        return ozy;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.T.a(layoutInflater, viewGroup);
    }

    public final String e() {
        return PageIdentifiers.PODCAST_EPISODE.name();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PODCAST_EPISODE, null);
    }

    public final udr ag() {
        return udt.aE;
    }

    public final gjf aj() {
        return PageIdentifiers.PODCAST_EPISODE;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        this.T.a(fyt);
    }

    public final sih ae_() {
        return sih.a(this.a);
    }

    public final String ah() {
        Bundle bundle = ((Bundle) fay.a(this.i)).getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return bundle.getString("extra_playback_context_uri");
        }
        return null;
    }

    public final String ai() {
        Bundle bundle = ((Bundle) fay.a(this.i)).getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return bundle.getString("extra_playback_row_id");
        }
        return null;
    }

    public final a ak() {
        Bundle bundle = ((Bundle) fay.a(this.i)).getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return (a) bundle.getParcelable("extra_playback_playlist_endpoint_configuration");
        }
        return null;
    }
}
