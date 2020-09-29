package defpackage;

import android.content.Context;
import com.spotify.music.features.settings.adapter.SettingsAdapter;

/* renamed from: qmi reason: default package */
public final class qmi implements wig<qmt> {
    private final wzi<Context> a;
    private final wzi<SettingsAdapter> b;

    private qmi(wzi<Context> wzi, wzi<SettingsAdapter> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qmi a(wzi<Context> wzi, wzi<SettingsAdapter> wzi2) {
        return new qmi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (qmt) wil.a(CC.a((Context) this.a.get(), (SettingsAdapter) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
