package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import com.spotify.music.R;

/* renamed from: say reason: default package */
final class say implements sax {
    private final Resources a;

    say(Resources resources) {
        this.a = resources;
    }

    public final sba a() {
        return new sar((int) TypedValue.applyDimension(1, 60.0f, this.a.getDisplayMetrics()), this.a.getDisplayMetrics().widthPixels / this.a.getInteger(R.integer.grid_columns));
    }
}
