package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import java.io.IOException;

/* renamed from: bbw reason: default package */
public final class bbw implements bby {
    private final int a;

    public bbw() {
        this(-1);
    }

    public bbw(int i) {
        this.a = i;
    }

    public final long a(IOException iOException) {
        if (!(iOException instanceof InvalidResponseCodeException)) {
            return -9223372036854775807L;
        }
        int i = ((InvalidResponseCodeException) iOException).responseCode;
        if (i == 404 || i == 410) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    public final long a(IOException iOException, int i) {
        if (iOException instanceof ParserException) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i - 1) * 1000, CrashReportManager.TIME_WINDOW);
    }

    public final int a(int i) {
        int i2 = this.a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }
}
