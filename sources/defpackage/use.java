package defpackage;

import android.content.Context;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

/* renamed from: use reason: default package */
public final class use implements a {
    private final Context a;

    public use(Context context) {
        this.a = context;
    }

    public final void a() {
    }

    public final void b() {
        RadioActionsService.c(this.a);
    }

    public final String c() {
        return "RadioActionsService";
    }
}
