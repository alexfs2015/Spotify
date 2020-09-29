package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.ConnectDevice.DeviceTransferError;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.GaiaState;
import com.spotify.mobile.android.connect.model.GaiaTransferError;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause;

/* renamed from: hio reason: default package */
public final class hio extends JsonCallbackReceiver<GaiaState> {
    private final Context a;
    private final ConnectManager b;
    private final Handler c;
    private final jkp d;

    public hio(Context context, ConnectManager connectManager, Handler handler, jkp jkp) {
        super(null, GaiaState.class, ((rwl) gih.a(rwl.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a());
        this.a = context;
        this.b = connectManager;
        this.c = handler;
        this.d = jkp;
    }

    static /* synthetic */ void a(hio hio, GaiaState gaiaState) {
        jkp jkp = hio.d;
        fbp.a(jkp.A);
        jik jik = jkp.A;
        fbp.a(gaiaState);
        boolean booleanValue = gaiaState.isActive().booleanValue();
        boolean c2 = fdd.c(gaiaState.getDevices(), new fbq<GaiaDevice>() {
            public final /* synthetic */ boolean apply(Object obj) {
                GaiaDevice gaiaDevice = (GaiaDevice) obj;
                return gaiaDevice != null && gaiaDevice.isActive() && !gaiaDevice.isSelf();
            }
        });
        if (jik.a(jik.a, booleanValue) && booleanValue) {
            jik.d.a();
            jik.c.a();
        }
        if (jik.a(jik.b, c2) && c2) {
            jik.d.b();
            jik.c.b();
        }
        if ((jik.a(jik.a, booleanValue) || jik.a(jik.b, c2)) && !booleanValue && !c2) {
            jik.d.c();
            jik.c.c();
        }
        jik.a = Boolean.valueOf(booleanValue);
        jik.b = Boolean.valueOf(c2);
        GaiaTransferError transferError = gaiaState.getTransferError();
        String str = "com.spotify.music.permission.INTERNAL_BROADCAST";
        String str2 = "connect_device";
        if (!(transferError == null || transferError.getErrorCode() == DeviceTransferError.SUCCESS)) {
            GaiaDevice a2 = hio.b.a(transferError.getDeviceId());
            Logger.b("Got transfer error from core: %s", transferError.toString());
            if (a2 != null) {
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.connect.CONNECT_TRANSFER_ERROR");
                intent.putExtra("error_code", transferError.getErrorCode().mCode);
                intent.putExtra(str2, a2);
                hio.a.sendBroadcast(intent, str);
            }
        }
        String onboardingDevice = gaiaState.getOnboardingDevice();
        if (onboardingDevice != null) {
            GaiaDevice a3 = hio.b.a(onboardingDevice);
            Object[] objArr = new Object[1];
            if (a3 != null) {
                onboardingDevice = a3.toString();
            }
            objArr[0] = onboardingDevice;
            Logger.b("Got onboarding request from core: %s", objArr);
            if (a3 != null) {
                Intent intent2 = new Intent("com.spotify.mobile.android.service.broadcast.connect.CONNECT_ONBOARDING");
                intent2.putExtra(str2, a3);
                hio.a.sendBroadcast(intent2, str);
            }
        }
    }

    public final void onError(Throwable th, ErrorCause errorCause) {
        Logger.e(th, "Unable to connect to Gaia resolver due to: %s", errorCause.name());
    }

    public final /* synthetic */ void onResolved(Response response, Object obj) {
        final GaiaState gaiaState = (GaiaState) obj;
        this.c.post(new Runnable() {
            public final void run() {
                hio.a(hio.this, gaiaState);
            }
        });
    }
}
