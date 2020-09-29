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

/* renamed from: hfs reason: default package */
public final class hfs extends JsonCallbackReceiver<GaiaState> {
    private final Context a;
    private final ConnectManager b;
    private final Handler c;
    private final jhz d;

    public final /* synthetic */ void onResolved(Response response, Object obj) {
        final GaiaState gaiaState = (GaiaState) obj;
        this.c.post(new Runnable() {
            public final void run() {
                hfs.a(hfs.this, gaiaState);
            }
        });
    }

    public hfs(Context context, ConnectManager connectManager, Handler handler, jhz jhz) {
        super(null, GaiaState.class, ((rnf) ggw.a(rnf.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a());
        this.a = context;
        this.b = connectManager;
        this.c = handler;
        this.d = jhz;
    }

    public final void onError(Throwable th, ErrorCause errorCause) {
        Logger.e(th, "Unable to connect to Gaia resolver due to: %s", errorCause.name());
    }

    static /* synthetic */ void a(hfs hfs, GaiaState gaiaState) {
        jhz jhz = hfs.d;
        fay.a(jhz.A);
        jfv jfv = jhz.A;
        fay.a(gaiaState);
        boolean booleanValue = gaiaState.isActive().booleanValue();
        boolean c2 = fcl.c(gaiaState.getDevices(), new faz<GaiaDevice>() {
            public final /* synthetic */ boolean apply(Object obj) {
                GaiaDevice gaiaDevice = (GaiaDevice) obj;
                return gaiaDevice != null && gaiaDevice.isActive() && !gaiaDevice.isSelf();
            }
        });
        if (jfv.a(jfv.a, booleanValue) && booleanValue) {
            jfv.d.a();
            jfv.c.a();
        }
        if (jfv.a(jfv.b, c2) && c2) {
            jfv.d.b();
            jfv.c.b();
        }
        if ((jfv.a(jfv.a, booleanValue) || jfv.a(jfv.b, c2)) && !booleanValue && !c2) {
            jfv.d.c();
            jfv.c.c();
        }
        jfv.a = Boolean.valueOf(booleanValue);
        jfv.b = Boolean.valueOf(c2);
        GaiaTransferError transferError = gaiaState.getTransferError();
        String str = "com.spotify.music.permission.INTERNAL_BROADCAST";
        String str2 = "connect_device";
        if (!(transferError == null || transferError.getErrorCode() == DeviceTransferError.SUCCESS)) {
            GaiaDevice a2 = hfs.b.a(transferError.getDeviceId());
            Logger.b("Got transfer error from core: %s", transferError.toString());
            if (a2 != null) {
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.connect.CONNECT_TRANSFER_ERROR");
                intent.putExtra("error_code", transferError.getErrorCode().mCode);
                intent.putExtra(str2, a2);
                hfs.a.sendBroadcast(intent, str);
            }
        }
        String onboardingDevice = gaiaState.getOnboardingDevice();
        if (onboardingDevice != null) {
            GaiaDevice a3 = hfs.b.a(onboardingDevice);
            Object[] objArr = new Object[1];
            if (a3 != null) {
                onboardingDevice = a3.toString();
            }
            objArr[0] = onboardingDevice;
            Logger.b("Got onboarding request from core: %s", objArr);
            if (a3 != null) {
                Intent intent2 = new Intent("com.spotify.mobile.android.service.broadcast.connect.CONNECT_ONBOARDING");
                intent2.putExtra(str2, a3);
                hfs.a.sendBroadcast(intent2, str);
            }
        }
    }
}
