package defpackage;

import android.content.Context;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

/* renamed from: ugq reason: default package */
public final class ugq implements a {
    private final Context a;

    public final void a() {
    }

    public final String c() {
        return "RadioActionsService";
    }

    public ugq(Context context) {
        this.a = context;
    }

    public final void b() {
        RadioActionsService.c(this.a);
    }
}
