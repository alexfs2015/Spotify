package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: pgw reason: default package */
public final class pgw {
    private static final Uri c = Uri.parse("https://www.spotify.com/legal/new-30-days-free-trial-terms-and-conditions/");
    final jro a;
    final InteractionLogger b;
    private final mbl d;

    public pgw(mbl mbl, jro jro, InteractionLogger interactionLogger) {
        this.d = mbl;
        this.a = jro;
        this.b = interactionLogger;
    }

    public static boolean a(Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", c));
        return false;
    }
}
