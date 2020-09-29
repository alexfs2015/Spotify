package defpackage;

import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import java.util.List;

/* renamed from: sz reason: default package */
public abstract class sz {
    protected sz() {
    }

    @Deprecated
    public static sz a() {
        tj b = tj.b();
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public abstract sw a(String str);

    public abstract sw a(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, sx sxVar);

    public abstract sw a(String str, ExistingWorkPolicy existingWorkPolicy, List<sv> list);
}
