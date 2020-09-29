package defpackage;

import android.util.Log;
import com.spotify.messages.BetamaxPlaybackErrorDevice;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: kcn reason: default package */
public final class kcn {
    public static BetamaxPlaybackErrorDevice a(jya jya, String str, Throwable th) {
        return a(jya, str, th != null ? th.hashCode() : -1, th);
    }

    private static BetamaxPlaybackErrorDevice a(jya jya, String str, int i, Throwable th) {
        return (BetamaxPlaybackErrorDevice) BetamaxPlaybackErrorDevice.k().a(i).e(b(th)).d(a(th)).f(d(th)).g(c(th)).c(jya.a()).a(str).b(jya.d()).g();
    }

    private static String a(Throwable th) {
        return th != null ? th.getClass().getSimpleName() : "";
    }

    private static String b(Throwable th) {
        String str = "";
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        return message != null ? message : str;
    }

    private static String c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        if (th != null) {
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                arrayList.add(a(cause));
            }
        }
        return new JSONArray(arrayList).toString();
    }

    private static String d(Throwable th) {
        String stackTraceString = th != null ? Log.getStackTraceString(th) : "Stack trace N/A";
        if (stackTraceString.length() > 500) {
            stackTraceString = stackTraceString.substring(0, 499);
        }
        return stackTraceString.replace(9, ' ').replace(10, ' ');
    }

    public static BetamaxPlaybackErrorDevice a(jya jya, String str, BetamaxException betamaxException) {
        return a(jya, str, betamaxException.mErrorType.mErrorCode, betamaxException);
    }
}
