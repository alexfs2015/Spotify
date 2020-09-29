package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: sn reason: default package */
public abstract class sn {
    private static final String a = sg.a("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                sg a2 = sg.a();
                String str2 = a;
                StringBuilder sb = new StringBuilder("Could not instantiate ");
                sb.append(str);
                a2.a(str2, sb.toString(), e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            sg a3 = sg.a();
            String str3 = a;
            StringBuilder sb2 = new StringBuilder("Class not found: ");
            sb2.append(str);
            a3.a(str3, sb2.toString(), new Throwable[0]);
            return null;
        }
    }

    public static sn a() {
        return new sn() {
        };
    }
}
