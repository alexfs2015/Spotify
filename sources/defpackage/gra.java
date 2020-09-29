package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.model.ConnectDevice.DeviceTransferError;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.GaiaTransferError;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: gra reason: default package */
public final class gra {
    /* access modifiers changed from: private */
    public static final Map<String, fzw> a = gbo.a();

    /* renamed from: gra$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[DeviceTransferError.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.connect.model.ConnectDevice$DeviceTransferError[] r0 = com.spotify.mobile.android.connect.model.ConnectDevice.DeviceTransferError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.connect.model.ConnectDevice$DeviceTransferError r1 = com.spotify.mobile.android.connect.model.ConnectDevice.DeviceTransferError.ZEROCONF_CANNOT_LOAD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.connect.model.ConnectDevice$DeviceTransferError r1 = com.spotify.mobile.android.connect.model.ConnectDevice.DeviceTransferError.ZEROCONF_SPOTIFY_UPDATE_REQUIRED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.connect.model.ConnectDevice$DeviceTransferError r1 = com.spotify.mobile.android.connect.model.ConnectDevice.DeviceTransferError.ZEROCONF_SYSTEM_UPDATE_REQUIRED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gra.AnonymousClass4.<clinit>():void");
        }
    }

    public static fzw a(Context context, sih sih) {
        return a(context, "gaia.content_not_supported", R.string.dialog_content_not_supported_title, context.getString(R.string.dialog_content_not_supported_body), sih);
    }

    public static fzw a(Context context, GaiaDevice gaiaDevice, GaiaTransferError gaiaTransferError, sih sih) {
        int i;
        int i2 = AnonymousClass4.a[gaiaTransferError.getErrorCode().ordinal()];
        if (i2 == 1) {
            i = R.string.connect_transfer_error_can_not_load;
        } else if (i2 == 2) {
            i = R.string.connect_transfer_error_spotify_update_required;
        } else if (i2 != 3) {
            return null;
        } else {
            i = R.string.connect_transfer_error_update_required;
        }
        String modelName = gaiaDevice.getModelName();
        return a(context, gaiaTransferError.toString(), R.string.connect_transfer_error_heading, context.getString(i, new Object[]{modelName}), sih);
    }

    private static fzw a(Context context, final String str, int i, String str2, sih sih) {
        fzw fzw = (fzw) a.get(str);
        if (fzw != null && fzw.isShowing()) {
            return fzw;
        }
        a a2 = new a(context, 2132017711).a(i);
        a2.b = str2;
        a a3 = a2.a((int) R.string.dialog_content_not_supported_button, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                gra.a.remove(str);
                dialogInterface.dismiss();
            }
        });
        a3.f = new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                gra.a.remove(str);
                dialogInterface.dismiss();
            }
        };
        a3.g = new OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                gra.a.remove(str);
                dialogInterface.dismiss();
            }
        };
        fzw a4 = a3.a((rdc) context, PageIdentifiers.DIALOG_CONNECT_PLAYBACK_ERROR.mPageIdentifier, sih.toString()).a();
        a4.show();
        a.put(str, a4);
        return a4;
    }
}
