package com.spotify.eventsender;

import androidx.room.RoomDatabase.b;
import com.spotify.music.lyrics.model.TrackLyrics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class EventSenderDatabase_Impl extends EventSenderDatabase {
    private volatile ghc g;
    private volatile ggx h;
    private volatile gha i;

    public final pc a() {
        return new pc(this, new HashMap(0), new HashMap(0), "Events", "EventSequenceNumbers");
    }

    public final pu b(ow owVar) {
        pg pgVar = new pg(owVar, new a(7) {
            public final void a(pt ptVar) {
                ptVar.c("DROP TABLE IF EXISTS `Events`");
                ptVar.c("DROP TABLE IF EXISTS `EventSequenceNumbers`");
            }

            public final void b(pt ptVar) {
                ptVar.c("CREATE TABLE IF NOT EXISTS `Events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `authenticated` INTEGER, `eventName` TEXT, `sequenceId` BLOB, `sequenceNumber` INTEGER NOT NULL, `fragments` BLOB)");
                ptVar.c("CREATE  INDEX `index_Events_eventName` ON `Events` (`eventName`)");
                ptVar.c("CREATE TABLE IF NOT EXISTS `EventSequenceNumbers` (`eventName` TEXT NOT NULL, `sequenceNumberNext` INTEGER NOT NULL, PRIMARY KEY(`eventName`))");
                ptVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                ptVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f3aecea5b0cd72ec979a87668d0962cf')");
            }

            public final void c(pt ptVar) {
                EventSenderDatabase_Impl.this.a = ptVar;
                EventSenderDatabase_Impl.this.a(ptVar);
                if (EventSenderDatabase_Impl.this.e != null) {
                    int size = EventSenderDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        ((b) EventSenderDatabase_Impl.this.e.get(i)).a(ptVar);
                    }
                }
            }

            public final void d(pt ptVar) {
                if (EventSenderDatabase_Impl.this.e != null) {
                    int size = EventSenderDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        EventSenderDatabase_Impl.this.e.get(i);
                    }
                }
            }

            public final void e(pt ptVar) {
                HashMap hashMap = new HashMap(6);
                String str = "id";
                String str2 = "INTEGER";
                hashMap.put(str, new a(str, str2, true, 1));
                String str3 = "authenticated";
                hashMap.put(str3, new a(str3, str2, false, 0));
                String str4 = TrackLyrics.KIND_TEXT;
                String str5 = "eventName";
                hashMap.put(str5, new a(str5, str4, false, 0));
                String str6 = "BLOB";
                String str7 = "sequenceId";
                hashMap.put(str7, new a(str7, str6, false, 0));
                String str8 = "sequenceNumber";
                hashMap.put(str8, new a(str8, str2, true, 0));
                String str9 = "fragments";
                hashMap.put(str9, new a(str9, str6, false, 0));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                String str10 = "index_Events_eventName";
                hashSet2.add(new d(str10, false, Arrays.asList(new String[]{str5})));
                String str11 = "Events";
                po poVar = new po(str11, hashMap, hashSet, hashSet2);
                po a = po.a(ptVar, str11);
                String str12 = "\n Found:\n";
                if (poVar.equals(a)) {
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put(str5, new a(str5, str4, true, 1));
                    String str13 = "sequenceNumberNext";
                    hashMap2.put(str13, new a(str13, str2, true, 0));
                    String str14 = "EventSequenceNumbers";
                    po poVar2 = new po(str14, hashMap2, new HashSet(0), new HashSet(0));
                    po a2 = po.a(ptVar, str14);
                    if (!poVar2.equals(a2)) {
                        StringBuilder sb = new StringBuilder("Migration didn't properly handle EventSequenceNumbers(com.spotify.eventsender.dao.EventSequenceNumberEntity).\n Expected:\n");
                        sb.append(poVar2);
                        sb.append(str12);
                        sb.append(a2);
                        throw new IllegalStateException(sb.toString());
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Migration didn't properly handle Events(com.spotify.eventsender.dao.EventEntity).\n Expected:\n");
                sb2.append(poVar);
                sb2.append(str12);
                sb2.append(a);
                throw new IllegalStateException(sb2.toString());
            }

            public final void f(pt ptVar) {
                pm.a(ptVar);
            }
        }, "f3aecea5b0cd72ec979a87668d0962cf", "f94dbe2530c30b673a1e57980e8f9332");
        a a = b.a(owVar.b);
        a.a = owVar.c;
        a.b = pgVar;
        return owVar.a.a(a.a());
    }

    public final ghc i() {
        ghc ghc;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new ghd(this);
            }
            ghc = this.g;
        }
        return ghc;
    }

    public final ggx j() {
        ggx ggx;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new ggy(this);
            }
            ggx = this.h;
        }
        return ggx;
    }

    public final gha k() {
        gha gha;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new ghb(this);
            }
            gha = this.i;
        }
        return gha;
    }
}
