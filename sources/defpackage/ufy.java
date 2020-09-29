package defpackage;

import android.content.Context;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListService;

/* renamed from: ufy reason: default package */
public final class ufy {
    private final Context a;

    public ufy(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        Context context = this.a;
        context.startService(RadioFormatListService.a(context, str));
    }
}
