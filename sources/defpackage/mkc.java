package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.connect.model.LoginRequest;
import com.spotify.mobile.android.connect.model.LogoutResponse;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

/* renamed from: mkc reason: default package */
public final class mkc implements mjp {
    public final CompositeDisposable a = new CompositeDisposable();
    private final gmm<LoginRequest> b;
    private final gmm<LogoutResponse> c;
    private final FireAndForgetResolver d;
    private final Scheduler e;

    public mkc(Scheduler scheduler, gmn gmn, FireAndForgetResolver fireAndForgetResolver) {
        this.b = gmn.a(LoginRequest.class);
        this.c = gmn.a(LogoutResponse.class);
        this.d = (FireAndForgetResolver) fbp.a(fireAndForgetResolver);
        this.e = (Scheduler) fbp.a(scheduler);
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder("sp://connect-device/v1/device/");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, LoginRequest loginRequest) {
        Logger.b("Login resolved for: %s", loginRequest.deviceId);
        aVar.a(loginRequest.deviceId, loginRequest.username, loginRequest.blob, loginRequest.clientKey, loginRequest.tokenType);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, LogoutResponse logoutResponse) {
        Logger.b(" Logout resolved for: %s", logoutResponse.deviceId);
        aVar.a(logoutResponse.deviceId);
    }

    public final void a(DiscoveredDevice discoveredDevice) {
        a(Request.PUT, a(discoveredDevice.getDeviceId()), discoveredDevice);
    }

    public void a(String str, String str2, JacksonModel jacksonModel) {
        Logger.b("Sending %s CosmosDeviceDiscovery request for %s", str, str2);
        try {
            this.d.resolve(new Request(str, str2, new HashMap(), JacksonSerializer.toBytes(jacksonModel)));
        } catch (ParserException e2) {
            Logger.e(e2, "Parsed exception for request %s", str2);
        }
    }

    public final void a(a aVar) {
        String str = Request.SUB;
        this.a.a(wit.b(this.b.resolve(new Request(str, "sp://connect-device/v1/login"))).a(this.e).a((Consumer<? super T>) new $$Lambda$mkc$rTzPeAZ9fUWFeFcCNk7ft672GOA<Object>(aVar), (Consumer<? super Throwable>) $$Lambda$mkc$LMy5Q3jQKSzpgshpW55oGjktbPY.INSTANCE));
        this.a.a(wit.b(this.c.resolve(new Request(str, "sp://connect-device/v1/logout"))).a(this.e).a((Consumer<? super T>) new $$Lambda$mkc$VeZpbqF119rCEkwPTcONWxHpWo<Object>(aVar), (Consumer<? super Throwable>) $$Lambda$mkc$8q6haBgjZIepl3mhEIbktMl9Rc.INSTANCE));
    }

    public final void b(DiscoveredDevice discoveredDevice) {
        String deviceId = discoveredDevice.getDeviceId();
        StringBuilder sb = new StringBuilder("sp://connect-device/v1/login/");
        sb.append(deviceId);
        a(Request.PUT, sb.toString(), discoveredDevice);
    }
}
