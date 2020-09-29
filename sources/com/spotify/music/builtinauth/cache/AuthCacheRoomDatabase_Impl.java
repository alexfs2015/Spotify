package com.spotify.music.builtinauth.cache;

import androidx.room.RoomDatabase.b;
import com.spotify.music.lyrics.model.TrackLyrics;
import java.util.HashMap;
import java.util.HashSet;

public final class AuthCacheRoomDatabase_Impl extends AuthCacheRoomDatabase {
    private volatile ktl g;

    public final pp b(or orVar) {
        pb pbVar = new pb(orVar, new a(1) {
            public final void b(po poVar) {
                poVar.c("CREATE TABLE IF NOT EXISTS `cachedClientInfo` (`client_id` TEXT NOT NULL, `redirect_uri` TEXT NOT NULL, `scopes` TEXT, `timestamp` INTEGER NOT NULL, `package_name` TEXT NOT NULL, `app_signature` TEXT NOT NULL, `last_used_timestamp` INTEGER NOT NULL, PRIMARY KEY(`client_id`, `redirect_uri`, `package_name`, `app_signature`))");
                poVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                poVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '83638406310a4869e579f35c5989cac5')");
            }

            public final void a(po poVar) {
                poVar.c("DROP TABLE IF EXISTS `cachedClientInfo`");
            }

            public final void d(po poVar) {
                if (AuthCacheRoomDatabase_Impl.this.e != null) {
                    int size = AuthCacheRoomDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        AuthCacheRoomDatabase_Impl.this.e.get(i);
                    }
                }
            }

            public final void c(po poVar) {
                AuthCacheRoomDatabase_Impl.this.a = poVar;
                AuthCacheRoomDatabase_Impl.this.a(poVar);
                if (AuthCacheRoomDatabase_Impl.this.e != null) {
                    int size = AuthCacheRoomDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        ((b) AuthCacheRoomDatabase_Impl.this.e.get(i)).a(poVar);
                    }
                }
            }

            public final void f(po poVar) {
                ph.a(poVar);
            }

            public final void e(po poVar) {
                HashMap hashMap = new HashMap(7);
                String str = "client_id";
                String str2 = TrackLyrics.KIND_TEXT;
                hashMap.put(str, new a(str, str2, true, 1));
                String str3 = "redirect_uri";
                hashMap.put(str3, new a(str3, str2, true, 2));
                String str4 = "scopes";
                hashMap.put(str4, new a(str4, str2, false, 0));
                String str5 = "INTEGER";
                String str6 = "timestamp";
                hashMap.put(str6, new a(str6, str5, true, 0));
                String str7 = "package_name";
                hashMap.put(str7, new a(str7, str2, true, 3));
                String str8 = "app_signature";
                hashMap.put(str8, new a(str8, str2, true, 4));
                String str9 = "last_used_timestamp";
                hashMap.put(str9, new a(str9, str5, true, 0));
                String str10 = "cachedClientInfo";
                pj pjVar = new pj(str10, hashMap, new HashSet(0), new HashSet(0));
                pj a = pj.a(poVar, str10);
                if (!pjVar.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle cachedClientInfo(com.spotify.music.builtinauth.cache.CachedClientInfoEntity).\n Expected:\n");
                    sb.append(pjVar);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "83638406310a4869e579f35c5989cac5", "24274ffe648c459b4b2b48953be86b10");
        a a = b.a(orVar.b);
        a.a = orVar.c;
        a.b = pbVar;
        return orVar.a.a(a.a());
    }

    public final ox a() {
        return new ox(this, new HashMap(0), new HashMap(0), "cachedClientInfo");
    }

    public final ktl i() {
        ktl ktl;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new ktm(this);
            }
            ktl = this.g;
        }
        return ktl;
    }
}
