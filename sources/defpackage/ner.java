package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.video.model.PlayerError;

/* renamed from: ner reason: default package */
public final class ner implements wig<String> {
    private final wzi<nek> a;

    private ner(wzi<nek> wzi) {
        this.a = wzi;
    }

    public static ner a(wzi<nek> wzi) {
        return new ner(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Bundle) fbp.a(((nek) this.a.get()).i)).getString(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY), "Cannot return null from a non-@Nullable @Provides method");
    }
}
