package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import java.io.IOException;
import retrofit2.HttpException;

/* renamed from: ttz reason: default package */
final class ttz {
    public static <T> vez<T> a(Throwable th) {
        if (th instanceof IOException) {
            return vez.a(NetworkErrorReason.UNKNOWN);
        }
        if (!(th instanceof HttpException)) {
            return vez.a(th);
        }
        int i = ((HttpException) th).code;
        return i != 404 ? i != 503 ? vez.a(th) : vez.a(NetworkErrorReason.UNKNOWN) : vez.b();
    }
}
