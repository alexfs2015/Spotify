package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: pve reason: default package */
public final class pve {
    private final RxResolver a;

    pve(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public final wuh<Boolean> a(String str, String str2) {
        return vun.a((ObservableSource<T>) this.a.resolve(new Request(Request.PUT, a("hm://crowd-statements-api/v0/report-explicit/", str, str2))), BackpressureStrategy.BUFFER).f($$Lambda$pve$vvEg4QkFOX5YbUWQkE5THoSZDbw.INSTANCE).a(1).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Response response) {
        return Boolean.valueOf(response.getStatus() == 200);
    }

    public final wuh<Boolean> b(String str, String str2) {
        return vun.a((ObservableSource<T>) this.a.resolve(new Request(Request.PUT, a("hm://crowd-statements-api/v0/report-not-explicit/", str, str2))), BackpressureStrategy.BUFFER).f($$Lambda$pve$Kh8Q_tVkqvBGvGddY2Kn6CA310.INSTANCE).a(1).a();
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
}
