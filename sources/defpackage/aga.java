package defpackage;

import android.os.Process;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: aga reason: default package */
final class aga extends age {
    private static final SimpleDateFormat d = new SimpleDateFormat("MM-dd HH:mm:ss");
    private final String c;
    private agd e;

    aga(String str, String str2, String str3) {
        super(str2);
        this.c = str;
        this.e = agc.a(str3);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        this.e.a();
    }

    /* access modifiers changed from: protected */
    public final void a(int i, String str, Object... objArr) {
        String str2;
        if (i >= a) {
            if (str != null) {
                String format = String.format("[atid=%d,apid=%d,tid=%d] %s: %s", new Object[]{Integer.valueOf(a()), Integer.valueOf(b()), Long.valueOf(Thread.currentThread().getId()), this.b, str});
                if (objArr == null && format != null) {
                    format = format.replace('%', '?');
                }
                str2 = String.format(Locale.ENGLISH, format, objArr);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append(": No message to log");
                str2 = sb.toString();
            }
            if (!(i == 2 || i == 3 || i == 4 || i == 5)) {
                if (i != 6) {
                    new StringBuilder("Unsupported log level: ").append(i);
                } else {
                    Log.e(this.c, str2);
                }
            }
            if (i != 7) {
                agd agd = this.e;
                String str3 = this.c;
                String str4 = i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "NONE" : "ERROR" : "WARN" : "INFO" : "DEBUG" : "VERBOSE";
                agd.a(String.format("%s\t[%s]\t%s\t%s\r\n", new Object[]{d.format(new Date()).toString(), str3, str4, str2}));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        return Process.myTid();
    }

    /* access modifiers changed from: 0000 */
    public final int b() {
        return Process.myPid();
    }
}
