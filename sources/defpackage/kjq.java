package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: kjq reason: default package */
public class kjq extends wib {
    public kju a;

    public static kjq a(kfp kfp) {
        kjq kjq = new kjq();
        kjq.g(kif.a(kfp));
        return kjq;
    }

    private String c() {
        return (String) fbp.a(l().getString("story_id"));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.stories_container_loading_fragment, viewGroup, false);
    }

    public final void aP_() {
        super.aP_();
        this.a.a((kjt) new e(c()));
    }

    public final void h() {
        this.a.a((kjt) new f(c()));
        super.h();
    }
}
