package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.util.List;

/* renamed from: hko reason: default package */
public final class hko {
    public static final boolean a = false;
    public final Context b;
    public final mh c;
    private final hkm d;
    private final vwv e;
    private final hit f;

    public hko(Context context, mh mhVar, hkm hkm, vwv vwv, hit hit) {
        this.b = context;
        this.c = mhVar;
        this.d = hkm;
        this.e = vwv;
        this.f = hit;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, List list) {
        Logger.b("Processing failed: %s, hiding plaholder", TextUtils.join(",", list));
        runnable.run();
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
        hkm hkm = this.d;
        this.f.d(this.b);
        return new $$Lambda$hko$EoIbfFLLgSZFzcMqgq4_1_fvxw0(hkm.b.a(false));
    }
}
