package defpackage;

import android.content.Context;
import com.spotify.music.builtinauth.cache.AuthCacheRoomDatabase;

/* renamed from: kts reason: default package */
public interface kts {

    /* renamed from: kts$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static AuthCacheRoomDatabase a(Context context) {
            return (AuthCacheRoomDatabase) oz.a(context.getApplicationContext(), AuthCacheRoomDatabase.class, "auth-cache.db").b();
        }
    }
}
