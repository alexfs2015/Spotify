package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: tb reason: default package */
public abstract class tb {
    private static final String a = su.a("WorkerFactory");

    public static tb a() {
        return new tb() {
        };
    }

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                su a2 = su.a();
                String str2 = a;
                StringBuilder sb = new StringBuilder("Could not instantiate ");
                sb.append(str);
                a2.a(str2, sb.toString(), e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            su a3 = su.a();
            String str3 = a;
            StringBuilder sb2 = new StringBuilder("Class not found: ");
            sb2.append(str);
            a3.a(str3, sb2.toString(), new Throwable[0]);
            return null;
        }
    }
}
