package defpackage;

import android.content.Context;
import android.content.IntentSender;
import com.spotify.mobile.android.shortcut.ShortcutPinnedReceiver;

/* renamed from: hvr reason: default package */
public final class hvr implements vua<IntentSender> {
    private final wlc<Context> a;

    public static IntentSender a(Context context) {
        return (IntentSender) vuf.a(ShortcutPinnedReceiver.a(context).getIntentSender(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
