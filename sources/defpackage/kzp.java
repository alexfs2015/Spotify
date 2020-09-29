package defpackage;

import android.app.Application;
import android.content.ContentResolver;

/* renamed from: kzp reason: default package */
public final class kzp implements vua<ContentResolver> {
    private final wlc<Application> a;

    private kzp(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static kzp a(wlc<Application> wlc) {
        return new kzp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ContentResolver) vuf.a(((Application) this.a.get()).getContentResolver(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
