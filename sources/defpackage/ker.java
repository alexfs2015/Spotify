package defpackage;

import android.util.Log;
import com.spotify.messages.BetamaxPlaybackErrorDevice;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: ker reason: default package */
public final class ker {
    private static BetamaxPlaybackErrorDevice a(kaa kaa, String str, int i, Throwable th) {
        return (BetamaxPlaybackErrorDevice) BetamaxPlaybackErrorDevice.k().a(i).e(b(th)).d(a(th)).f(d(th)).g(c(th)).c(kaa.a()).a(str).b(kaa.d()).g();
    }

    public static BetamaxPlaybackErrorDevice a(kaa kaa, String str, BetamaxException betamaxException) {
        return a(kaa, str, betamaxException.mErrorType.mErrorCode, betamaxException);
    }

    public static BetamaxPlaybackErrorDevice a(kaa kaa, String str, Throwable th) {
        return a(kaa, str, th != null ? th.hashCode() : -1, th);
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
        if (stackTraceString.length() > 2500) {
            stackTraceString = stackTraceString.substring(0, 2499);
        }
        return stackTraceString.replace(9, ' ').replace(10, ' ');
    }
}
