package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: amg reason: default package */
public class amg {
    private static final String a = amg.class.getCanonicalName();
    private static HashMap<String, RegistrationListener> b = new HashMap<>();

    public static String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static boolean a(final String str) {
        if (!b()) {
            return false;
        }
        if (b.containsKey(str)) {
            return true;
        }
        final String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", akq.i().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) akq.g().getSystemService("servicediscovery");
        AnonymousClass1 r4 = new RegistrationListener() {
            public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                amg.c(str);
            }

            public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                if (!format.equals(nsdServiceInfo.getServiceName())) {
                    amg.c(str);
                }
            }

            public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            }

            public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            }
        };
        b.put(str, r4);
        nsdManager.registerService(nsdServiceInfo, 1, r4);
        return true;
    }

    public static Bitmap b(String str) {
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(2));
        try {
            fmi a2 = new flx().a(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
            int i = a2.b;
            int i2 = a2.a;
            int[] iArr = new int[(i * i2)];
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                for (int i5 = 0; i5 < i2; i5++) {
                    iArr[i4 + i5] = a2.a(i5, i3) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, Config.ARGB_8888);
            try {
                createBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                return createBitmap;
            } catch (WriterException unused) {
                return createBitmap;
            }
        } catch (WriterException unused2) {
            return null;
        }
    }

    public static boolean b() {
        return VERSION.SDK_INT >= 16 && FetchedAppSettingsManager.a(akq.k()).f.contains(SmartLoginOption.Enabled);
    }

    public static void c(String str) {
        RegistrationListener registrationListener = (RegistrationListener) b.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) akq.g().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException e) {
                ank.a(a, (Exception) e);
            }
            b.remove(str);
        }
    }
}
