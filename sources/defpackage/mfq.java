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

/* renamed from: mfq reason: default package */
public final class mfq implements mfd {
    public final CompositeDisposable a = new CompositeDisposable();
    private final gky<LoginRequest> b;
    private final gky<LogoutResponse> c;
    private final FireAndForgetResolver d;
    private final Scheduler e;

    public static String a(String str) {
        StringBuilder sb = new StringBuilder("sp://connect-device/v1/device/");
        sb.append(str);
        return sb.toString();
    }

    private static String b(String str) {
        StringBuilder sb = new StringBuilder("sp://connect-device/v1/login/");
        sb.append(str);
        return sb.toString();
    }

    public mfq(Scheduler scheduler, gkz gkz, FireAndForgetResolver fireAndForgetResolver) {
        this.b = gkz.a(LoginRequest.class);
        this.c = gkz.a(LogoutResponse.class);
        this.d = (FireAndForgetResolver) fay.a(fireAndForgetResolver);
        this.e = (Scheduler) fay.a(scheduler);
    }

    public final void a(a aVar) {
        String str = Request.SUB;
        this.a.a(vun.b(this.b.resolve(new Request(str, "sp://connect-device/v1/login"))).a(this.e).a((Consumer<? super T>) new $$Lambda$mfq$KhkqhcnMbvKeNl8KJwza8Fa2dE<Object>(aVar), (Consumer<? super Throwable>) $$Lambda$mfq$oHSCQm70KBt1AIj7EeT7KoJyhJk.INSTANCE));
        this.a.a(vun.b(this.c.resolve(new Request(str, "sp://connect-device/v1/logout"))).a(this.e).a((Consumer<? super T>) new $$Lambda$mfq$o6EyMOkSlAnLyTuGP7MzVL5VL2Y<Object>(aVar), (Consumer<? super Throwable>) $$Lambda$mfq$yhzJOPNHpsj8W6SLl2nC6bwClA.INSTANCE));
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

    public final void b(DiscoveredDevice discoveredDevice) {
        a(Request.PUT, b(discoveredDevice.getDeviceId()), discoveredDevice);
    }

    public void a(String str, String str2, JacksonModel jacksonModel) {
        Logger.b("Sending %s CosmosDeviceDiscovery request for %s", str, str2);
        try {
            this.d.resolve(new Request(str, str2, new HashMap(), JacksonSerializer.toBytes(jacksonModel)));
        } catch (ParserException e2) {
            Logger.e(e2, "Parsed exception for request %s", str2);
        }
    }
}
