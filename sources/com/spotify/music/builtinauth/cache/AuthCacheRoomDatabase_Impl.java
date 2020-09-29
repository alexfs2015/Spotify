package com.spotify.music.builtinauth.cache;

import androidx.room.RoomDatabase.b;
import com.spotify.music.lyrics.model.TrackLyrics;
import java.util.HashMap;
import java.util.HashSet;

public final class AuthCacheRoomDatabase_Impl extends AuthCacheRoomDatabase {
    private volatile kwu g;

    public final pc a() {
        return new pc(this, new HashMap(0), new HashMap(0), "cachedClientInfo");
    }

    public final pu b(ow owVar) {
        pg pgVar = new pg(owVar, new a(1) {
            public final void a(pt ptVar) {
                ptVar.c("DROP TABLE IF EXISTS `cachedClientInfo`");
            }

            public final void b(pt ptVar) {
                ptVar.c("CREATE TABLE IF NOT EXISTS `cachedClientInfo` (`client_id` TEXT NOT NULL, `redirect_uri` TEXT NOT NULL, `scopes` TEXT, `timestamp` INTEGER NOT NULL, `package_name` TEXT NOT NULL, `app_signature` TEXT NOT NULL, `last_used_timestamp` INTEGER NOT NULL, PRIMARY KEY(`client_id`, `redirect_uri`, `package_name`, `app_signature`))");
                ptVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                ptVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '83638406310a4869e579f35c5989cac5')");
            }

            public final void c(pt ptVar) {
                AuthCacheRoomDatabase_Impl.this.a = ptVar;
                AuthCacheRoomDatabase_Impl.this.a(ptVar);
                if (AuthCacheRoomDatabase_Impl.this.e != null) {
                    int size = AuthCacheRoomDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        ((b) AuthCacheRoomDatabase_Impl.this.e.get(i)).a(ptVar);
                    }
                }
            }

            public final void d(pt ptVar) {
                if (AuthCacheRoomDatabase_Impl.this.e != null) {
                    int size = AuthCacheRoomDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        AuthCacheRoomDatabase_Impl.this.e.get(i);
                    }
                }
            }

            public final void e(pt ptVar) {
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
                po poVar = new po(str10, hashMap, new HashSet(0), new HashSet(0));
                po a = po.a(ptVar, str10);
                if (!poVar.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle cachedClientInfo(com.spotify.music.builtinauth.cache.CachedClientInfoEntity).\n Expected:\n");
                    sb.append(poVar);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }

            public final void f(pt ptVar) {
                pm.a(ptVar);
            }
        }, "83638406310a4869e579f35c5989cac5", "24274ffe648c459b4b2b48953be86b10");
        a a = b.a(owVar.b);
        a.a = owVar.c;
        a.b = pgVar;
        return owVar.a.a(a.a());
    }

    public final kwu i() {
        kwu kwu;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new kwv(this);
            }
            kwu = this.g;
        }
        return kwu;
    }
}
