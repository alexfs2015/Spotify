package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;

/* renamed from: pu reason: default package */
public interface pu {

    /* renamed from: pu$a */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
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

        public abstract void a(pt ptVar);

        public abstract void a(pt ptVar, int i, int i2);

        public void b(pt ptVar) {
        }

        public void b(pt ptVar, int i, int i2) {
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }
    }

    /* renamed from: pu$b */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;

        /* renamed from: pu$b$a */
        public static class a {
            public String a;
            public a b;
            private Context c;

            a(Context context) {
                this.c = context;
            }

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

    /* renamed from: pu$c */
    public interface c {
        pu a(b bVar);
    }

    pt a();

    void a(boolean z);
}
