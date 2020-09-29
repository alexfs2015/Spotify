package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: aib reason: default package */
final class aib {
    private final String a;
    private final vxf b;

    public aib(String str, vxf vxf) {
        this.a = str;
        this.b = vxf;
    }

    public final boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            vvc a2 = vuu.a();
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
