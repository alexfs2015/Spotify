package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: aip reason: default package */
final class aip {
    private final String a;
    private final wll b;

    public aip(String str, wll wll) {
        this.a = str;
        this.b = wll;
    }

    public final boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            wji a2 = wja.a();
            StringBuilder sb = new StringBuilder("Error creating marker: ");
            sb.append(this.a);
            a2.c("CrashlyticsCore", sb.toString(), e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public File b() {
        return new File(this.b.a(), this.a);
    }
}
