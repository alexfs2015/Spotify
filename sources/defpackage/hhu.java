package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.util.List;

/* renamed from: hhu reason: default package */
public final class hhu {
    public static final boolean a = false;
    public final Context b;
    public final mc c;
    private final hhs d;
    private final vjp e;
    private final hfx f;

    public hhu(Context context, mc mcVar, hhs hhs, vjp vjp, hfx hfx) {
        this.b = context;
        this.c = mcVar;
        this.d = hhs;
        this.e = vjp;
        this.f = hfx;
    }

    public static boolean a() {
        DebugFlag debugFlag = DebugFlag.NATIVE_WAIT_FOR_DEBUGGER;
        return false;
    }

    public final a a(Intent intent) {
        a aVar = a.a;
        if (!this.e.a() || !intent.getBooleanExtra("needs_foreground_start", false)) {
            return aVar;
        }
        Logger.b("Ensuring foreground notification for %s, %s", intent.getAction(), intent.getExtras());
        hhs hhs = this.d;
        this.f.d(this.b);
        return new $$Lambda$hhu$07PgETpFuiX7PyQktkfLa9XpFg(hhs.b.a(false));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, List list) {
        Logger.b("Processing failed: %s, hiding plaholder", TextUtils.join(",", list));
        runnable.run();
    }
}
