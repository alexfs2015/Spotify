package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: qea reason: default package */
public final class qea {
    private final RxResolver a;

    qea(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Response response) {
        return Boolean.valueOf(response.getStatus() == 200);
    }

    private static String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        if (str3 != null) {
            sb.append("?context=");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Response response) {
        return Boolean.valueOf(response.getStatus() == 200);
    }

    public final xim<Boolean> a(String str, String str2) {
        return wit.a((ObservableSource<T>) this.a.resolve(new Request(Request.PUT, a("hm://crowd-statements-api/v0/report-explicit/", str, str2))), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$qea$jrilNudNwJ0aLTvhXHDQAsGZiig.INSTANCE).a(1).a();
    }

    public final xim<Boolean> b(String str, String str2) {
        return wit.a((ObservableSource<T>) this.a.resolve(new Request(Request.PUT, a("hm://crowd-statements-api/v0/report-not-explicit/", str, str2))), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$qea$drIe9YPpDmYrmSzTK5HyY9vM1FU.INSTANCE).a(1).a();
    }
}
