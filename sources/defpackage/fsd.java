package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.R;

/* renamed from: fsd reason: default package */
class fsd extends fse implements fsc {
    private final ImageView a;

    public fsd(View view) {
        super(view);
        this.a = (ImageView) view.findViewById(16908294);
        vfz.b(getView().findViewById(R.id.row_view)).a(b(), d()).b(c()).a();
    }

    public ImageView c() {
        return this.a;
    }
}
