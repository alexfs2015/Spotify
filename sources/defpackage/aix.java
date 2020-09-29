package defpackage;

import com.crashlytics.android.core.Report;
import com.crashlytics.android.core.Report.Type;
import java.io.File;
import java.util.Map;

/* renamed from: aix reason: default package */
final class aix implements Report {
    private final File a;

    public final String a() {
        return null;
    }

    public final File c() {
        return null;
    }

    public final Map<String, String> e() {
        return null;
    }

    public aix(File file) {
        this.a = file;
    }

    public final String b() {
        return this.a.getName();
    }

    public final File[] d() {
        return this.a.listFiles();
    }

    public final Type g() {
        return Type.NATIVE;
    }

    public final void f() {
        File[] listFiles = this.a.listFiles();
        int length = listFiles.length;
        int i = 0;
        while (true) {
            String str = "CrashlyticsCore";
            if (i < length) {
                File file = listFiles[i];
                vvc a2 = vuu.a();
                StringBuilder sb = new StringBuilder("Removing native report file at ");
                sb.append(file.getPath());
                a2.a(str, sb.toString());
                file.delete();
                i++;
            } else {
                vvc a3 = vuu.a();
                StringBuilder sb2 = new StringBuilder("Removing native report directory at ");
                sb2.append(this.a);
                a3.a(str, sb2.toString());
                this.a.delete();
                return;
            }
        }
    }
}
