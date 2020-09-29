package defpackage;

import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import java.util.List;

/* renamed from: sl reason: default package */
public abstract class sl {
    public abstract si a(String str);

    public abstract si a(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, sj sjVar);

    public abstract si a(String str, ExistingWorkPolicy existingWorkPolicy, List<sh> list);

    @Deprecated
    public static sl a() {
        sv b = sv.b();
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    protected sl() {
    }
}
