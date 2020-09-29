package com.spotify.eventsender;

import androidx.room.RoomDatabase.b;
import com.spotify.music.lyrics.model.TrackLyrics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class EventSenderDatabase_Impl extends EventSenderDatabase {
    private volatile gfr g;
    private volatile gfm h;
    private volatile gfp i;

    public final pp b(or orVar) {
        pb pbVar = new pb(orVar, new a(7) {
            public final void b(po poVar) {
                poVar.c("CREATE TABLE IF NOT EXISTS `Events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `authenticated` INTEGER, `eventName` TEXT, `sequenceId` BLOB, `sequenceNumber` INTEGER NOT NULL, `fragments` BLOB)");
                poVar.c("CREATE  INDEX `index_Events_eventName` ON `Events` (`eventName`)");
                poVar.c("CREATE TABLE IF NOT EXISTS `EventSequenceNumbers` (`eventName` TEXT NOT NULL, `sequenceNumberNext` INTEGER NOT NULL, PRIMARY KEY(`eventName`))");
                poVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                poVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f3aecea5b0cd72ec979a87668d0962cf')");
            }

            public final void a(po poVar) {
                poVar.c("DROP TABLE IF EXISTS `Events`");
                poVar.c("DROP TABLE IF EXISTS `EventSequenceNumbers`");
            }

            public final void d(po poVar) {
                if (EventSenderDatabase_Impl.this.e != null) {
                    int size = EventSenderDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        EventSenderDatabase_Impl.this.e.get(i);
                    }
                }
            }

            public final void c(po poVar) {
                EventSenderDatabase_Impl.this.a = poVar;
                EventSenderDatabase_Impl.this.a(poVar);
                if (EventSenderDatabase_Impl.this.e != null) {
                    int size = EventSenderDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        ((b) EventSenderDatabase_Impl.this.e.get(i)).a(poVar);
                    }
                }
            }

            public final void f(po poVar) {
                ph.a(poVar);
            }

            public final void e(po poVar) {
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
                pj pjVar = new pj(str11, hashMap, hashSet, hashSet2);
                pj a = pj.a(poVar, str11);
                String str12 = "\n Found:\n";
                if (pjVar.equals(a)) {
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put(str5, new a(str5, str4, true, 1));
                    String str13 = "sequenceNumberNext";
                    hashMap2.put(str13, new a(str13, str2, true, 0));
                    String str14 = "EventSequenceNumbers";
                    pj pjVar2 = new pj(str14, hashMap2, new HashSet(0), new HashSet(0));
                    pj a2 = pj.a(poVar, str14);
                    if (!pjVar2.equals(a2)) {
                        StringBuilder sb = new StringBuilder("Migration didn't properly handle EventSequenceNumbers(com.spotify.eventsender.dao.EventSequenceNumberEntity).\n Expected:\n");
                        sb.append(pjVar2);
                        sb.append(str12);
                        sb.append(a2);
                        throw new IllegalStateException(sb.toString());
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Migration didn't properly handle Events(com.spotify.eventsender.dao.EventEntity).\n Expected:\n");
                sb2.append(pjVar);
                sb2.append(str12);
                sb2.append(a);
                throw new IllegalStateException(sb2.toString());
            }
        }, "f3aecea5b0cd72ec979a87668d0962cf", "f94dbe2530c30b673a1e57980e8f9332");
        a a = b.a(orVar.b);
        a.a = orVar.c;
        a.b = pbVar;
        return orVar.a.a(a.a());
    }

    public final ox a() {
        return new ox(this, new HashMap(0), new HashMap(0), "Events", "EventSequenceNumbers");
    }

    public final gfr i() {
        gfr gfr;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new gfs(this);
            }
            gfr = this.g;
        }
        return gfr;
    }

    public final gfm j() {
        gfm gfm;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new gfn(this);
            }
            gfm = this.h;
        }
        return gfm;
    }

    public final gfp k() {
        gfp gfp;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new gfq(this);
            }
            gfp = this.i;
        }
        return gfp;
    }
}
