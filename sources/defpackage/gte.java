package defpackage;

import android.app.Service;
import com.spotify.mobile.android.service.SpotifyService;

/* renamed from: gte reason: default package */
public final class gte implements wig<Class<? extends Service>> {
    private static final gte a = new gte();

    public static gte a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Class) wil.a(SpotifyService.class, "Cannot return null from a non-@Nullable @Provides method");
    }
}
