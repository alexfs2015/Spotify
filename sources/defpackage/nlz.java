package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.music.R;

/* renamed from: nlz reason: default package */
final class nlz extends fwh {
    final ImageView a = ((ImageView) fay.a(getView().findViewById(R.id.cover_art_image)));

    public nlz(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.home_mix_header_content_view, viewGroup, false));
    }
}
