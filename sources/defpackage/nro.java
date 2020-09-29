package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.music.R;

/* renamed from: nro reason: default package */
final class nro extends fxb {
    final ImageView a = ((ImageView) fbp.a(getView().findViewById(R.id.cover_art_image)));

    public nro(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.home_mix_header_content_view, viewGroup, false));
    }
}
