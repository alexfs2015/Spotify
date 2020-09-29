package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: psm reason: default package */
public final class psm extends fxb {
    final ImageView a;
    final TextView b;

    public psm(View view) {
        super(view);
        this.a = (ImageView) view.findViewById(R.id.profile_image);
        this.b = (TextView) view.findViewById(R.id.profile_title);
    }
}
