package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import com.spotify.music.R;

/* renamed from: slf reason: default package */
final class slf implements sle {
    private final Resources a;

    slf(Resources resources) {
        this.a = resources;
    }

    public final slh a() {
        return new sky((int) TypedValue.applyDimension(1, 60.0f, this.a.getDisplayMetrics()), this.a.getDisplayMetrics().widthPixels / this.a.getInteger(R.integer.grid_columns));
    }
}
