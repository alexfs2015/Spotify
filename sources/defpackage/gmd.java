package defpackage;

import android.content.Context;
import android.os.Build;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import java.util.regex.Pattern;

/* renamed from: gmd reason: default package */
public final class gmd {
    private static final Pattern b = Pattern.compile(".+_cheets|cheets_.+");
    public final DeviceType a;

    public gmd(Context context) {
        if ((Build.DEVICE != null && b.matcher(Build.DEVICE).matches()) || context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management")) {
            this.a = GaiaTypes.CHROMEBOOK;
        } else if (jvi.c(context)) {
            this.a = GaiaTypes.TABLET;
        } else {
            this.a = GaiaTypes.SMARTPHONE;
        }
    }
}
