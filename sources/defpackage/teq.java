package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: teq reason: default package */
public final class teq extends syo {
    private final Context a;

    public teq(jws jws, syu syu, Context context) {
        super(jws, syu);
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
