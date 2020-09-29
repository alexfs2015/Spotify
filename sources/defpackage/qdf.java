package defpackage;

import android.content.Context;
import com.spotify.music.features.settings.adapter.SettingsAdapter;

/* renamed from: qdf reason: default package */
public final class qdf implements vua<qdq> {
    private final wlc<Context> a;
    private final wlc<SettingsAdapter> b;

    private qdf(wlc<Context> wlc, wlc<SettingsAdapter> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qdf a(wlc<Context> wlc, wlc<SettingsAdapter> wlc2) {
        return new qdf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (qdq) vuf.a(CC.a((Context) this.a.get(), (SettingsAdapter) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
