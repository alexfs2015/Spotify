package com.comscore.android.util.jni;

import android.content.Context;
import android.os.Looper;
import com.comscore.android.id.CrossPublisherId;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.android.util.Permissions;
import com.comscore.util.crashreport.CrashReport;
import com.comscore.util.crashreport.CrashReportDecorator;
import java.util.Locale;

public class AndroidCrashReportDecorator extends CrashReportDecorator {
    AndroidJniHelper a;

    AndroidCrashReportDecorator(AndroidJniHelper androidJniHelper) {
        super(androidJniHelper);
        this.a = androidJniHelper;
    }

    public void fillCrashReport(CrashReport crashReport) {
        super.fillCrashReport(crashReport);
        crashReport.getExtras().put("ns_ap_ais", this.a.getPackageManagerName());
        Context context = this.a.getContext();
        if (context != null) {
            int i = IdHelperAndroid.getCrossPublisherDeviceId(context).source;
            int source = IdHelperAndroid.getDeviceId(context).getSource();
            boolean booleanValue = Permissions.check(context, "android.permission.INTERNET").booleanValue();
            boolean booleanValue2 = Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue();
            boolean booleanValue3 = Permissions.check(context, "android.permission.ACCESS_WIFI_STATE").booleanValue();
            crashReport.getExtras().put("ns_ap_env", String.format(Locale.getDefault(), "%d-%d-%d%d%d-%d-%d", new Object[]{Integer.valueOf(i), Integer.valueOf(source), Integer.valueOf(booleanValue ? 1 : 0), Integer.valueOf(booleanValue2 ? 1 : 0), Integer.valueOf(booleanValue3 ? 1 : 0), Integer.valueOf(this.a.isLibraryInstalledUsingMaven() ? 1 : 0), Integer.valueOf(this.a.getFirstHostState())}));
            if (Looper.myLooper() != Looper.getMainLooper() && IdHelperAndroid.isAdvertisingIdEnabled(context)) {
                CrossPublisherId crossPublisherDeviceId = IdHelperAndroid.getCrossPublisherDeviceId(context);
                if (crossPublisherDeviceId != null && crossPublisherDeviceId.crossPublisherId != null && crossPublisherDeviceId.crossPublisherId.length() > 0) {
                    crashReport.getExtras().put("ns_ap_i7", sha1(crossPublisherDeviceId.crossPublisherId));
                }
            }
        }
    }
}
