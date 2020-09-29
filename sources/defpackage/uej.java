package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: uej reason: default package */
public final class uej implements fqy {
    public final ViewGroup a;

    private uej(Context context, ViewGroup viewGroup) {
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.podcast_topics_section, viewGroup, false);
    }

    public static uej a(Context context, ViewGroup viewGroup) {
        return new uej(context, viewGroup);
    }

    public final View getView() {
        return this.a;
    }
}
