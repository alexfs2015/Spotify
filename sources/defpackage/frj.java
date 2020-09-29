package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.R;

/* renamed from: frj reason: default package */
class frj extends frk implements fri {
    private final ImageView a;

    public frj(View view) {
        super(view);
        this.a = (ImageView) view.findViewById(16908294);
        uui.b(getView().findViewById(R.id.row_view)).a(b(), d()).b(c()).a();
    }

    public ImageView c() {
        return this.a;
    }
}
