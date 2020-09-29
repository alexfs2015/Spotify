package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: su reason: default package */
public final class su {
    public static pf a = new pf(1, 2) {
        public final void a(po poVar) {
            poVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            poVar.c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            poVar.c("DROP TABLE IF EXISTS alarmInfo");
            poVar.c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };
    public static pf b = new pf(3, 4) {
        public final void a(po poVar) {
            if (VERSION.SDK_INT >= 23) {
                poVar.c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };
    public static pf c = new pf(4, 5) {
        public final void a(po poVar) {
            poVar.c("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            poVar.c("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    };

    /* renamed from: su$a */
    public static class a extends pf {
        private Context c;

        public a(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        public final void a(po poVar) {
            new uu(this.c).a(true);
        }
    }
}
