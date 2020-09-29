package defpackage;

import android.app.Service;
import com.spotify.mobile.android.service.SpotifyService;

/* renamed from: gre reason: default package */
public final class gre implements vua<Class<? extends Service>> {
    private static final gre a = new gre();

    public static gre a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Class) vuf.a(SpotifyService.class, "Cannot return null from a non-@Nullable @Provides method");
    }
}
