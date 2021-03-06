package androidx.work.impl;

import androidx.room.RoomDatabase.b;
import com.spotify.music.lyrics.model.TrackLyrics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile uk g;
    private volatile ub h;
    private volatile un i;
    private volatile ue j;
    private volatile uh k;

    public final pp b(or orVar) {
        pb pbVar = new pb(orVar, new a(6) {
            public final void b(po poVar) {
                poVar.c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                poVar.c("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                poVar.c("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                poVar.c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                poVar.c("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                poVar.c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                poVar.c("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                poVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                poVar.c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                poVar.c("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                poVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                poVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
            }

            public final void a(po poVar) {
                poVar.c("DROP TABLE IF EXISTS `Dependency`");
                poVar.c("DROP TABLE IF EXISTS `WorkSpec`");
                poVar.c("DROP TABLE IF EXISTS `WorkTag`");
                poVar.c("DROP TABLE IF EXISTS `SystemIdInfo`");
                poVar.c("DROP TABLE IF EXISTS `WorkName`");
            }

            public final void d(po poVar) {
                if (WorkDatabase_Impl.this.e != null) {
                    int size = WorkDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        WorkDatabase_Impl.this.e.get(i);
                    }
                }
            }

            public final void c(po poVar) {
                WorkDatabase_Impl.this.a = poVar;
                poVar.c("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.a(poVar);
                if (WorkDatabase_Impl.this.e != null) {
                    int size = WorkDatabase_Impl.this.e.size();
                    for (int i = 0; i < size; i++) {
                        ((b) WorkDatabase_Impl.this.e.get(i)).a(poVar);
                    }
                }
            }

            public final void f(po poVar) {
                ph.a(poVar);
            }

            public final void e(po poVar) {
                po poVar2 = poVar;
                HashMap hashMap = new HashMap(2);
                String str = TrackLyrics.KIND_TEXT;
                String str2 = "work_spec_id";
                hashMap.put(str2, new a(str2, str, true, 1));
                String str3 = "prerequisite_id";
                hashMap.put(str3, new a(str3, str, true, 2));
                HashSet hashSet = new HashSet(2);
                String str4 = "id";
                String str5 = str4;
                b bVar = new b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4}));
                hashSet.add(bVar);
                String str6 = "WorkSpec";
                String str7 = "CASCADE";
                String str8 = "CASCADE";
                b bVar2 = new b(str6, str7, str8, Arrays.asList(new String[]{str3}), Arrays.asList(new String[]{str5}));
                hashSet.add(bVar2);
                HashSet hashSet2 = new HashSet(2);
                String str9 = "index_Dependency_work_spec_id";
                hashSet2.add(new d(str9, false, Arrays.asList(new String[]{str2})));
                hashSet2.add(new d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{str3})));
                String str10 = "Dependency";
                pj pjVar = new pj(str10, hashMap, hashSet, hashSet2);
                pj a = pj.a(poVar2, str10);
                String str11 = "\n Found:\n";
                if (pjVar.equals(a)) {
                    HashMap hashMap2 = new HashMap(23);
                    hashMap2.put(str5, new a(str5, str, true, 1));
                    String str12 = "state";
                    String str13 = "INTEGER";
                    hashMap2.put(str12, new a(str12, str13, true, 0));
                    String str14 = "worker_class_name";
                    hashMap2.put(str14, new a(str14, str, true, 0));
                    String str15 = "input_merger_class_name";
                    hashMap2.put(str15, new a(str15, str, false, 0));
                    String str16 = "BLOB";
                    hashMap2.put("input", new a("input", str16, true, 0));
                    hashMap2.put("output", new a("output", str16, true, 0));
                    hashMap2.put("initial_delay", new a("initial_delay", str13, true, 0));
                    hashMap2.put("interval_duration", new a("interval_duration", str13, true, 0));
                    hashMap2.put("flex_duration", new a("flex_duration", str13, true, 0));
                    hashMap2.put("run_attempt_count", new a("run_attempt_count", str13, true, 0));
                    hashMap2.put("backoff_policy", new a("backoff_policy", str13, true, 0));
                    hashMap2.put("backoff_delay_duration", new a("backoff_delay_duration", str13, true, 0));
                    hashMap2.put("period_start_time", new a("period_start_time", str13, true, 0));
                    hashMap2.put("minimum_retention_duration", new a("minimum_retention_duration", str13, true, 0));
                    String str17 = "schedule_requested_at";
                    hashMap2.put(str17, new a(str17, str13, true, 0));
                    hashMap2.put("required_network_type", new a("required_network_type", str13, false, 0));
                    hashMap2.put("requires_charging", new a("requires_charging", str13, true, 0));
                    hashMap2.put("requires_device_idle", new a("requires_device_idle", str13, true, 0));
                    hashMap2.put("requires_battery_not_low", new a("requires_battery_not_low", str13, true, 0));
                    hashMap2.put("requires_storage_not_low", new a("requires_storage_not_low", str13, true, 0));
                    hashMap2.put("trigger_content_update_delay", new a("trigger_content_update_delay", str13, true, 0));
                    hashMap2.put("trigger_max_content_delay", new a("trigger_max_content_delay", str13, true, 0));
                    hashMap2.put("content_uri_triggers", new a("content_uri_triggers", str16, false, 0));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(1);
                    hashSet4.add(new d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{str17})));
                    pj pjVar2 = new pj("WorkSpec", hashMap2, hashSet3, hashSet4);
                    pj a2 = pj.a(poVar2, "WorkSpec");
                    if (pjVar2.equals(a2)) {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("tag", new a("tag", str, true, 1));
                        hashMap3.put(str2, new a(str2, str, true, 2));
                        HashSet hashSet5 = new HashSet(1);
                        String str18 = "WorkSpec";
                        String str19 = "CASCADE";
                        String str20 = "CASCADE";
                        b bVar3 = new b(str18, str19, str20, Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str5}));
                        hashSet5.add(bVar3);
                        HashSet hashSet6 = new HashSet(1);
                        String str21 = "index_WorkTag_work_spec_id";
                        hashSet6.add(new d(str21, false, Arrays.asList(new String[]{str2})));
                        pj pjVar3 = new pj("WorkTag", hashMap3, hashSet5, hashSet6);
                        pj a3 = pj.a(poVar2, "WorkTag");
                        if (pjVar3.equals(a3)) {
                            HashMap hashMap4 = new HashMap(2);
                            hashMap4.put(str2, new a(str2, str, true, 1));
                            hashMap4.put("system_id", new a("system_id", str13, true, 0));
                            HashSet hashSet7 = new HashSet(1);
                            String str22 = "WorkSpec";
                            String str23 = "CASCADE";
                            String str24 = "CASCADE";
                            b bVar4 = new b(str22, str23, str24, Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str5}));
                            hashSet7.add(bVar4);
                            pj pjVar4 = new pj("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                            pj a4 = pj.a(poVar2, "SystemIdInfo");
                            if (pjVar4.equals(a4)) {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put("name", new a("name", str, true, 1));
                                hashMap5.put(str2, new a(str2, str, true, 2));
                                HashSet hashSet8 = new HashSet(1);
                                String str25 = "WorkSpec";
                                String str26 = "CASCADE";
                                String str27 = "CASCADE";
                                b bVar5 = new b(str25, str26, str27, Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str5}));
                                hashSet8.add(bVar5);
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{str2})));
                                pj pjVar5 = new pj("WorkName", hashMap5, hashSet8, hashSet9);
                                pj a5 = pj.a(poVar2, "WorkName");
                                if (!pjVar5.equals(a5)) {
                                    StringBuilder sb = new StringBuilder("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                                    sb.append(pjVar5);
                                    sb.append(str11);
                                    sb.append(a5);
                                    throw new IllegalStateException(sb.toString());
                                }
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                            sb2.append(pjVar4);
                            sb2.append(str11);
                            sb2.append(a4);
                            throw new IllegalStateException(sb2.toString());
                        }
                        StringBuilder sb3 = new StringBuilder("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                        sb3.append(pjVar3);
                        sb3.append(str11);
                        sb3.append(a3);
                        throw new IllegalStateException(sb3.toString());
                    }
                    StringBuilder sb4 = new StringBuilder("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    sb4.append(pjVar2);
                    sb4.append(str11);
                    sb4.append(a2);
                    throw new IllegalStateException(sb4.toString());
                }
                StringBuilder sb5 = new StringBuilder("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                sb5.append(pjVar);
                sb5.append(str11);
                sb5.append(a);
                throw new IllegalStateException(sb5.toString());
            }
        }, "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        a a = b.a(orVar.b);
        a.a = orVar.c;
        a.b = pbVar;
        return orVar.a.a(a.a());
    }

    public final ox a() {
        return new ox(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    public final uk j() {
        uk ukVar;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new ul(this);
            }
            ukVar = this.g;
        }
        return ukVar;
    }

    public final ub k() {
        ub ubVar;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new uc(this);
            }
            ubVar = this.h;
        }
        return ubVar;
    }

    public final un l() {
        un unVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new uo(this);
            }
            unVar = this.i;
        }
        return unVar;
    }

    public final ue m() {
        ue ueVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new uf(this);
            }
            ueVar = this.j;
        }
        return ueVar;
    }

    public final uh n() {
        uh uhVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new ui(this);
            }
            uhVar = this.k;
        }
        return uhVar;
    }
}
