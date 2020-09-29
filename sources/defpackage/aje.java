package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

/* renamed from: aje reason: default package */
final class aje {
    private static final b b = new b(0);
    ajc a;
    private final Context c;
    private final a d;

    /* renamed from: aje$a */
    public interface a {
        File a();
    }

    /* renamed from: aje$b */
    static final class b implements ajc {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final aih a() {
            return null;
        }

        public final void a(long j, String str) {
        }

        public final byte[] b() {
            return null;
        }

        public final void c() {
        }

        public final void d() {
        }
    }

    aje(Context context, a aVar) {
        this(context, aVar, null);
    }

    aje(Context context, a aVar, String str) {
        this.c = context;
        this.d = aVar;
        this.a = b;
        a(str);
    }

    private void a(File file, int i) {
        this.a = new ajq(file, 65536);
    }

    private File b(String str) {
        StringBuilder sb = new StringBuilder("crashlytics-userlog-");
        sb.append(str);
        sb.append(".temp");
        return new File(this.d.a(), sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a.d();
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.a.c();
        this.a = b;
        if (str != null) {
            if (!CommonUtils.a(this.c, "com.crashlytics.CollectCustomLogs", true)) {
                wja.a().a("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            } else {
                a(b(str), 65536);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Set<String> set) {
        File[] listFiles = this.d.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(".temp");
                if (lastIndexOf != -1) {
                    name = name.substring(20, lastIndexOf);
                }
                if (!set.contains(name)) {
                    file.delete();
                }
            }
        }
    }
}
