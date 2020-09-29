package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentDiscoveryService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ffz reason: default package */
public final class ffz implements fga<Context> {
    private ffz() {
    }

    public /* synthetic */ ffz(byte b) {
        this();
    }

    private static Bundle a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
            if (serviceInfo == null) {
                return null;
            }
            return serviceInfo.metaData;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public final /* synthetic */ List a(Object obj) {
        Bundle a = a((Context) obj);
        if (a == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(a.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }
}
