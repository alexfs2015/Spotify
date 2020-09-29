package androidx.work.impl;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.a;
import androidx.room.RoomDatabase.b;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends RoomDatabase {
    private static final long g = TimeUnit.DAYS.toMillis(7);

    public static WorkDatabase a(Context context, Executor executor, boolean z) {
        a aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = new a(context, cls, null);
            aVar.c = true;
        } else {
            a a = pe.a(context, cls, "androidx.work.workdb");
            a.b = executor;
            aVar = a;
        }
        AnonymousClass1 r7 = new b() {
            public final void a(pt ptVar) {
                super.a(ptVar);
                ptVar.a();
                try {
                    ptVar.c(WorkDatabase.i());
                    ptVar.c();
                } finally {
                    ptVar.b();
                }
            }
        };
        if (aVar.a == null) {
            aVar.a = new ArrayList<>();
        }
        aVar.a.add(r7);
        return (WorkDatabase) aVar.a(ti.a).a(new a(context, 2, 3)).a(ti.b).a(ti.c).a(new a(context, 5, 6)).a().b();
    }

    static String i() {
        StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        sb.append(System.currentTimeMillis() - g);
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }

    public abstract uy j();

    public abstract up k();

    public abstract vb l();

    public abstract us m();

    public abstract uv n();
}
