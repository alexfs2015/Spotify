package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: khd reason: default package */
public class khd extends vtv {
    public khh a;

    public static khd a(kdo kdo) {
        khd khd = new khd();
        khd.g(kfs.a(kdo));
        return khd;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.stories_container_loading_fragment, viewGroup, false);
    }

    public final void g() {
        super.g();
        this.a.a((khg) new e(c()));
    }

    public final void h() {
        this.a.a((khg) new f(c()));
        super.h();
    }

    private String c() {
        return (String) fay.a(l().getString("story_id"));
    }
}
