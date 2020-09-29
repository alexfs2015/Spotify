package defpackage;

import android.content.Context;
import com.spotify.music.builtinauth.cache.AuthCacheRoomDatabase;

/* renamed from: kxc reason: default package */
public final class kxc implements wig<AuthCacheRoomDatabase> {
    private final wzi<Context> a;

    private kxc(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static AuthCacheRoomDatabase a(Context context) {
        return (AuthCacheRoomDatabase) wil.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static kxc a(wzi<Context> wzi) {
        return new kxc(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
