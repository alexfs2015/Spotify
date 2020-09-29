package defpackage;

import android.content.Context;
import com.spotify.music.builtinauth.cache.AuthCacheRoomDatabase;

/* renamed from: kxb reason: default package */
public interface kxb {

    /* renamed from: kxb$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static AuthCacheRoomDatabase a(Context context) {
            return (AuthCacheRoomDatabase) pe.a(context.getApplicationContext(), AuthCacheRoomDatabase.class, "auth-cache.db").b();
        }
    }
}
