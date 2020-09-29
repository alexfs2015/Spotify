package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

/* renamed from: gae reason: default package */
public final class gae extends jqz implements jqx {
    public static gae c() {
        return new gae();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_goldenpath_goldenpathtutorial, viewGroup, false);
    }

    public final Fragment ae() {
        return this;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.DEBUG, null);
    }

    public final uqm ag() {
        return uqo.ag;
    }

    public final String b(Context context) {
        return context.getString(R.string.golden_path_title_goldenpathtutorial);
    }

    public final String e() {
        return "golden-path-goldenpathtutorial";
    }
}
