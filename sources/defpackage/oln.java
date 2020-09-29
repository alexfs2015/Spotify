package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: oln reason: default package */
public final class oln extends fxb {
    public final TextView a = ((TextView) fbp.a(getView().findViewById(R.id.title)));
    public final TextView b = ((TextView) fbp.a(getView().findViewById(R.id.subtitle)));
    public final Button c = ((Button) fbp.a(getView().findViewById(R.id.button)));
    private final ViewGroup d = ((ViewGroup) fbp.a(getView().findViewById(R.id.wrapper)));

    public oln(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.playlist_all_songs_header_content, viewGroup, false));
    }

    public final void a(int i, float f) {
        this.d.setTranslationY((float) (-i));
    }
}
