package defpackage;

import android.content.Context;
import com.spotify.music.builtinauth.cache.AuthCacheRoomDatabase;

/* renamed from: ktt reason: default package */
public final class ktt implements vua<AuthCacheRoomDatabase> {
    private final wlc<Context> a;

    private ktt(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ktt a(wlc<Context> wlc) {
        return new ktt(wlc);
    }

    public static AuthCacheRoomDatabase a(Context context) {
        return (AuthCacheRoomDatabase) vuf.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
