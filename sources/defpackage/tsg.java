package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: tsg reason: default package */
public final class tsg implements fqe {
    public final ViewGroup a;

    public static tsg a(Context context, ViewGroup viewGroup) {
        return new tsg(context, viewGroup);
    }

    public final View getView() {
        return this.a;
    }

    private tsg(Context context, ViewGroup viewGroup) {
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.podcast_topics_section, viewGroup, false);
    }
}
