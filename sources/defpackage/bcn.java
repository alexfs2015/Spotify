package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import java.io.IOException;

/* renamed from: bcn reason: default package */
public final class bcn implements bcp {
    private final int a;

    public bcn() {
        this(-1);
    }

    public bcn(int i) {
        this.a = i;
    }

    public final int a(int i) {
        int i2 = this.a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    public final long a(IOException iOException) {
        if (!(iOException instanceof InvalidResponseCodeException)) {
            return -9223372036854775807L;
        }
        int i = ((InvalidResponseCodeException) iOException).responseCode;
        return (i == 404 || i == 410) ? 60000 : -9223372036854775807L;
    }

    public final long a(IOException iOException, int i) {
        if (iOException instanceof ParserException) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i - 1) * 1000, CrashReportManager.TIME_WINDOW);
    }
}
