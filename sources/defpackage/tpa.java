package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: tpa reason: default package */
public final class tpa extends tiv {
    private final Context a;

    public tpa(jyu jyu, tjb tjb, Context context) {
        super(jyu, tjb);
        this.a = context;
    }

    /* renamed from: a */
    public final void onChanged(Integer num) {
        if (num.intValue() == fr.c(this.a, R.color.black)) {
            num = Integer.valueOf(fr.c(this.a, R.color.driving_npv_fallback_color));
        }
        super.onChanged(num);
    }
}
