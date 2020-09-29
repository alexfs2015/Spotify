package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

/* renamed from: gad reason: default package */
public final class gad extends jqz implements jqx {
    public static gad c() {
        return new gad();
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
        return "Hello World!";
    }

    public final String e() {
        return "golden-path-goldenpathtutorial";
    }
}
