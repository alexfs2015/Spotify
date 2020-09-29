package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: oeh reason: default package */
public final class oeh extends fwh {
    public final TextView a = ((TextView) fay.a(getView().findViewById(R.id.title)));
    public final TextView b = ((TextView) fay.a(getView().findViewById(R.id.subtitle)));
    public final Button c = ((Button) fay.a(getView().findViewById(R.id.button)));
    private final ViewGroup d = ((ViewGroup) fay.a(getView().findViewById(R.id.wrapper)));

    public oeh(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.playlist_all_songs_header_content, viewGroup, false));
    }

    public final void a(int i, float f) {
        this.d.setTranslationY((float) (-i));
    }
}
