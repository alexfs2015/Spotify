package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

/* renamed from: aiq reason: default package */
final class aiq {
    private static final b b = new b(0);
    aio a;
    private final Context c;
    private final a d;

    /* renamed from: aiq$a */
    public interface a {
        File a();
    }

    /* renamed from: aiq$b */
    static final class b implements aio {
        public final aht a() {
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

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    aiq(Context context, a aVar) {
        this(context, aVar, null);
    }

    aiq(Context context, a aVar, String str) {
        this.c = context;
        this.d = aVar;
        this.a = b;
        a(str);
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.a.c();
        this.a = b;
        if (str != null) {
            if (!CommonUtils.a(this.c, "com.crashlytics.CollectCustomLogs", true)) {
                vuu.a().a("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            } else {
                a(b(str), 65536);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a.d();
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

    private void a(File file, int i) {
        this.a = new ajc(file, 65536);
    }

    private File b(String str) {
        StringBuilder sb = new StringBuilder("crashlytics-userlog-");
        sb.append(str);
        sb.append(".temp");
        return new File(this.d.a(), sb.toString());
    }
}
