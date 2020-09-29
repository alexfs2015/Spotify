package com.spotify.mobile.android.service;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.io.File;
import java.util.Locale;
import java.util.Random;

public final class StateRestoreFileDeleter {
    public static final b<Object, Integer> a = b.a("service_crash_count");
    public static final b<Object, Integer> b = b.a("deletion-policy");
    public final SpSharedPreferences<Object> c;
    public final Random d;

    public enum DeletionPolicy {
        BASIC {
            /* access modifiers changed from: 0000 */
            public final boolean a(String str) {
                return str.equals("state.restore");
            }
        },
        INTERMEDIATE {
            public final boolean a(String str) {
                return !str.equals("orbit.settings") && !str.equals("offline2") && !str.equals("offline_lists.bnk");
            }
        },
        EXTREME {
            /* access modifiers changed from: 0000 */
            public final boolean a(String str) {
                return true;
            }
        };
        
        private static DeletionPolicy[] d;

        /* access modifiers changed from: 0000 */
        public abstract boolean a(String str);

        static {
            d = values();
        }

        public static DeletionPolicy a(int i) {
            if (i >= 0) {
                DeletionPolicy[] deletionPolicyArr = d;
                if (i < deletionPolicyArr.length) {
                    return deletionPolicyArr[i];
                }
            }
            return BASIC;
        }

        public String toString() {
            return super.toString().toLowerCase(Locale.US);
        }
    }

    public StateRestoreFileDeleter(SpSharedPreferences<Object> spSharedPreferences, Random random) {
        this.c = spSharedPreferences;
        this.d = random;
    }

    public static void a(String str, DeletionPolicy deletionPolicy) {
        File file = new File(str, "Users");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(deletionPolicy, file2);
                    }
                }
            }
        }
    }

    private static void a(DeletionPolicy deletionPolicy, File file) {
        Logger.e("SpotifyService: Deleting state files", new Object[0]);
        Logger.b("Deleting state files", new Object[0]);
        StringBuilder sb = new StringBuilder();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && deletionPolicy.a(file2.getName()) && file2.delete()) {
                    sb.append("Deleted ");
                    sb.append(file2.getName());
                    sb.append(". ");
                }
            }
        }
        Logger.b(sb.toString(), new Object[0]);
        Logger.e("SpotifyService %s", sb.toString());
    }

    public static void a(SpSharedPreferences<Object> spSharedPreferences, DeletionPolicy deletionPolicy) {
        int ordinal = deletionPolicy.ordinal() + 1;
        if (ordinal > DeletionPolicy.EXTREME.ordinal()) {
            ordinal = DeletionPolicy.BASIC.ordinal();
        }
        spSharedPreferences.a().a(b, ordinal).a();
    }
}
