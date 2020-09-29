package defpackage;

import com.crashlytics.android.core.Report;
import com.crashlytics.android.core.Report.Type;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ajv reason: default package */
final class ajv implements Report {
    private final File a;
    private final File[] b;
    private final Map<String, String> c;

    public ajv(File file) {
        this(file, Collections.emptyMap());
    }

    public ajv(File file, Map<String, String> map) {
        this.a = file;
        this.b = new File[]{file};
        this.c = new HashMap(map);
        if (this.a.length() == 0) {
            this.c.putAll(ajs.a);
        }
    }

    public final String a() {
        return this.a.getName();
    }

    public final String b() {
        String a2 = a();
        return a2.substring(0, a2.lastIndexOf(46));
    }

    public final File c() {
        return this.a;
    }

    public final File[] d() {
        return this.b;
    }

    public final Map<String, String> e() {
        return Collections.unmodifiableMap(this.c);
    }

    public final void f() {
        wji a2 = wja.a();
        StringBuilder sb = new StringBuilder("Removing report at ");
        sb.append(this.a.getPath());
        a2.a("CrashlyticsCore", sb.toString());
        this.a.delete();
    }

    public final Type g() {
        return Type.JAVA;
    }
}
