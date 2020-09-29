package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;

/* renamed from: pp reason: default package */
public interface pp {

    /* renamed from: pp$a */
    public static abstract class a {
        public final int a;

        public abstract void a(po poVar);

        public abstract void a(po poVar, int i, int i2);

        public void b(po poVar) {
        }

        public a(int i) {
            this.a = i;
        }

        public void b(po poVar, int i, int i2) {
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }

        public static void a(String str) {
            String str2 = "SupportSQLite";
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                new StringBuilder("deleting the database file: ").append(str);
                try {
                    if (VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            StringBuilder sb = new StringBuilder("Could not delete the database file ");
                            sb.append(str);
                            Log.e(str2, sb.toString());
                        }
                    } catch (Exception e) {
                        Log.e(str2, "error while deleting corrupted database file", e);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: pp$b */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;

        /* renamed from: pp$b$a */
        public static class a {
            public String a;
            public a b;
            private Context c;

            public final b a() {
                a aVar = this.b;
                if (aVar != null) {
                    Context context = this.c;
                    if (context != null) {
                        return new b(context, this.a, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            a(Context context) {
                this.c = context;
            }
        }

        b(Context context, String str, a aVar) {
            this.a = context;
            this.b = str;
            this.c = aVar;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: pp$c */
    public interface c {
        pp a(b bVar);
    }

    po a();

    void a(boolean z);
}
