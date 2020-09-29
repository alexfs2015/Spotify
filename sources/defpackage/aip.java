package defpackage;

import com.crashlytics.android.core.Report;
import com.crashlytics.android.core.Report.Type;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aip reason: default package */
final class aip implements Report {
    private final File[] a;
    private final Map<String, String> b = new HashMap(aje.a);
    private final String c;

    public aip(String str, File[] fileArr) {
        this.a = fileArr;
        this.c = str;
    }

    public final String a() {
        return this.a[0].getName();
    }

    public final String b() {
        return this.c;
    }

    public final File c() {
        return this.a[0];
    }

    public final File[] d() {
        return this.a;
    }

    public final Map<String, String> e() {
        return Collections.unmodifiableMap(this.b);
    }

    public final void f() {
        File[] fileArr;
        for (File file : this.a) {
            vvc a2 = vuu.a();
            StringBuilder sb = new StringBuilder("Removing invalid report file at ");
            sb.append(file.getPath());
            a2.a("CrashlyticsCore", sb.toString());
            file.delete();
        }
    }

    public final Type g() {
        return Type.JAVA;
    }
}
