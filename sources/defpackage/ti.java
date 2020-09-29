package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: ti reason: default package */
public final class ti {
    public static pk a = new pk(1, 2) {
        public final void a(pt ptVar) {
            ptVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ptVar.c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            ptVar.c("DROP TABLE IF EXISTS alarmInfo");
            ptVar.c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };
    public static pk b = new pk(3, 4) {
        public final void a(pt ptVar) {
            if (VERSION.SDK_INT >= 23) {
                ptVar.c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };
    public static pk c = new pk(4, 5) {
        public final void a(pt ptVar) {
            ptVar.c("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ptVar.c("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    };

    /* renamed from: ti$a */
    public static class a extends pk {
        private Context c;

        public a(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        public final void a(pt ptVar) {
            new vi(this.c).a(true);
        }
    }
}
