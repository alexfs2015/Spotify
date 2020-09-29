package defpackage;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ale reason: default package */
public class ale {
    private static ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    private static String b;
    private static volatile boolean c = false;

    static {
        ale.class.getSimpleName();
    }

    ale() {
    }

    public static void a() {
        if (!c) {
            ali.f().execute(new Runnable() {
                public final void run() {
                    ale.d();
                }
            });
        }
    }

    public static String b() {
        if (!c) {
            d();
        }
        a.readLock().lock();
        try {
            return b;
        } finally {
            a.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    public static void d() {
        if (!c) {
            a.writeLock().lock();
            try {
                if (!c) {
                    b = PreferenceManager.getDefaultSharedPreferences(akq.g()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    c = true;
                }
            } finally {
                a.writeLock().unlock();
            }
        }
    }
}
