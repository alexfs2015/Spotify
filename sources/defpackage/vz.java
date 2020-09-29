package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: vz reason: default package */
public final class vz {
    static String a(Context context) {
        String a = a("wlan0");
        if (a != null) {
            return a;
        }
        String a2 = a("eth0");
        if (a2 != null) {
            return a2;
        }
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (macAddress != null) {
                return macAddress;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder("/sys/class/net/");
            sb.append(str);
            sb.append("/address");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(1000);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sb2), 1024);
            char[] cArr = new char[1024];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read != -1) {
                    sb3.append(String.valueOf(cArr, 0, read));
                } else {
                    bufferedReader.close();
                    return sb3.toString();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
