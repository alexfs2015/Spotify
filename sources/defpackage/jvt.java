package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.connectivity.ConnectionType;

/* renamed from: jvt reason: default package */
public final class jvt {
    private static ConnectionType a(int i) {
        switch (i) {
            case 1:
            case 4:
            case 11:
                return ConnectionType.CONNECTION_TYPE_GPRS;
            case 2:
                return ConnectionType.CONNECTION_TYPE_EDGE;
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return ConnectionType.CONNECTION_TYPE_3G;
            case 13:
                return ConnectionType.CONNECTION_TYPE_4G;
            default:
                Logger.b("Unknown mobile connection type for network %d", Integer.valueOf(i));
                return ConnectionType.CONNECTION_TYPE_UNKNOWN;
        }
    }

    public static ConnectionType a(Context context) {
        return a((ConnectivityManager) context.getSystemService("connectivity"), (TelephonyManager) context.getSystemService("phone"));
    }

    static ConnectionType a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            activeNetworkInfo = b(connectivityManager);
            if (activeNetworkInfo == null) {
                return ConnectionType.CONNECTION_TYPE_NONE;
            }
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type == 1) {
                return ConnectionType.CONNECTION_TYPE_WLAN;
            }
            if (type != 4) {
                if (type == 9) {
                    return ConnectionType.CONNECTION_TYPE_ETHERNET;
                }
                if (!(type == 6 || type == 7)) {
                    if (ConnectivityManager.isNetworkTypeValid(type)) {
                        Logger.b("Unknown connectivity type: (%d)%s", Integer.valueOf(type), activeNetworkInfo.getTypeName());
                    } else {
                        Logger.b("Invalid connectivity type returned by getType: %d", Integer.valueOf(type));
                    }
                    return ConnectionType.CONNECTION_TYPE_UNKNOWN;
                }
            }
        }
        return ConnectionType.CONNECTION_TYPE_3G;
    }

    static ConnectionType a(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        if (connectivityManager == null) {
            return ConnectionType.CONNECTION_TYPE_NONE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            activeNetworkInfo = b(connectivityManager);
            if (activeNetworkInfo == null) {
                return ConnectionType.CONNECTION_TYPE_NONE;
            }
        }
        int type = activeNetworkInfo.getType();
        switch (type) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                return a(telephonyManager.getNetworkType());
            case 1:
            case 13:
                return ConnectionType.CONNECTION_TYPE_WLAN;
            case 6:
            case 7:
            case 17:
                return ConnectionType.CONNECTION_TYPE_3G;
            case 9:
                return ConnectionType.CONNECTION_TYPE_ETHERNET;
            case 11:
                return ConnectionType.CONNECTION_TYPE_GPRS;
            case 16:
                return ConnectionType.CONNECTION_TYPE_COMPANION_PROXY;
            default:
                if (ConnectivityManager.isNetworkTypeValid(type)) {
                    Logger.b("Unknown connectivity type: (%d)%s", Integer.valueOf(type), activeNetworkInfo.getTypeName());
                } else {
                    Logger.b("Invalid connectivity type returned by getType: %d", Integer.valueOf(type));
                }
                return ConnectionType.CONNECTION_TYPE_UNKNOWN;
        }
    }

    private static NetworkInfo b(ConnectivityManager connectivityManager) {
        int i = 0;
        if (VERSION.SDK_INT >= 21) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            int length = allNetworks.length;
            while (i < length) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                if (networkInfo != null && networkInfo.isConnected()) {
                    return networkInfo;
                }
                i++;
            }
        } else {
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            int length2 = allNetworkInfo.length;
            while (i < length2) {
                NetworkInfo networkInfo2 = allNetworkInfo[i];
                if (networkInfo2 != null && networkInfo2.isConnected()) {
                    return networkInfo2;
                }
                i++;
            }
        }
        return null;
    }
}
