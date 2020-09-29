package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.R;

/* renamed from: fwc reason: default package */
class fwc extends fwa implements fwb {
    private final ImageView a;
    private final boolean b;

    fwc(View view) {
        super(view);
        this.a = (ImageView) view.findViewById(R.id.cover_art_image);
        this.b = view.getResources().getConfiguration().orientation != 2;
    }

    public final ImageView a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final int c() {
        return getView().getMeasuredWidth() / 2;
    }

    public final int d() {
        return this.a.getTop() + (this.a.getHeight() / 2);
    }
}
