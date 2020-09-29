package defpackage;

import android.content.Context;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListService;

/* renamed from: urm reason: default package */
public final class urm {
    private final Context a;

    public urm(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        Context context = this.a;
        context.startService(RadioFormatListService.a(context, str));
    }
}
