package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.R;

/* renamed from: frf reason: default package */
public final class frf extends frg implements fre {
    private final ImageView b;

    public frf(View view) {
        super(view);
        this.b = (ImageView) view.findViewById(16908294);
        uui.b(getView().findViewById(R.id.row_view)).a(this.a).b(this.b).a();
    }

    public final ImageView c() {
        return this.b;
    }
}
