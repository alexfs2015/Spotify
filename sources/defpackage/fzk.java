package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

/* renamed from: fzk reason: default package */
public final class fzk extends jon implements jol {
    public final Fragment ae() {
        return this;
    }

    public final String e() {
        return "golden-path-goldenpathtutorial";
    }

    public static fzk c() {
        return new fzk();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_goldenpath_goldenpathtutorial, viewGroup, false);
    }

    public final String b(Context context) {
        return context.getString(R.string.golden_path_title_goldenpathtutorial);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.DEBUG, null);
    }

    public final udr ag() {
        return udt.ag;
    }
}
