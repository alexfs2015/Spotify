package defpackage;

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: ajc reason: default package */
final class ajc implements aio {
    private final File a;
    private final int b;
    private vvy c;

    /* renamed from: ajc$a */
    public class a {
        public final byte[] a;
        public final int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public ajc(File file, int i) {
        this.a = file;
        this.b = i;
    }

    public final void a(long j, String str) {
        String str2 = " ";
        f();
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.b / 4;
                if (str.length() > i) {
                    StringBuilder sb = new StringBuilder("...");
                    sb.append(str.substring(str.length() - i));
                    str = sb.toString();
                }
                this.c.a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", str2).replaceAll("\n", str2)}).getBytes("UTF-8"));
                while (!this.c.b() && this.c.a() > this.b) {
                    this.c.c();
                }
            } catch (IOException e) {
                vuu.a().c("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    public final aht a() {
        a e = e();
        if (e == null) {
            return null;
        }
        return aht.a(e.a, 0, e.b);
    }

    public final byte[] b() {
        a e = e();
        if (e == null) {
            return null;
        }
        return e.a;
    }

    private a e() {
        if (!this.a.exists()) {
            return null;
        }
        f();
        vvy vvy = this.c;
        if (vvy == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[vvy.a()];
        try {
            this.c.a((c) new c() {
                public final void a(InputStream inputStream, int i) {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            vuu.a().c("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new a(bArr, iArr[0]);
    }

    public final void c() {
        CommonUtils.a((Closeable) this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    public final void d() {
        c();
        this.a.delete();
    }

    private void f() {
        if (this.c == null) {
            try {
                this.c = new vvy(this.a);
            } catch (IOException e) {
                vvc a2 = vuu.a();
                StringBuilder sb = new StringBuilder("Could not open log file: ");
                sb.append(this.a);
                a2.c("CrashlyticsCore", sb.toString(), e);
            }
        }
    }
}
