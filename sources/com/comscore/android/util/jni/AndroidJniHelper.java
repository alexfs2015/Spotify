package com.comscore.android.util.jni;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.comscore.Analytics;
import com.comscore.PartnerConfiguration;
import com.comscore.PublisherConfiguration;
import com.comscore.android.CommonUtils;
import com.comscore.android.ConnectivityType;
import com.comscore.android.HostApplicationState;
import com.comscore.android.id.CrossPublisherId;
import com.comscore.android.id.DeviceId;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.android.util.BackgroundManager;
import com.comscore.android.util.Permissions;
import com.comscore.android.util.update.UpdateFrom5_4_x;
import com.comscore.android.vce.Vce;
import com.comscore.util.CrossPublisherIdUtil;
import com.comscore.util.crashreport.CrashReportDecorator;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AndroidJniHelper extends JniComScoreHelper {
    public static final String KEY_PACKAGE_MANAGER = "packageManager";
    private Context a;
    private BackgroundManager b;
    private UpdateFrom5_4_x c;
    private int d = -1;
    private int e = -1;

    private void a() {
        if (!Analytics.getConfiguration().isVce() && Vce.isEnabled()) {
            Vce.disable();
        }
        if (Analytics.getConfiguration().isVce()) {
            for (PublisherConfiguration publisherId : Analytics.getConfiguration().getPublisherConfigurations()) {
                Vce.getSharedInstance(this.a).addPublisherId(publisherId.getPublisherId());
            }
        }
    }

    private void b() {
        if (!Analytics.getConfiguration().isVce() && Vce.isEnabled()) {
            Vce.disable();
        }
        if (Analytics.getConfiguration().isVce()) {
            for (PartnerConfiguration partnerId : Analytics.getConfiguration().getPartnerConfigurations()) {
                Vce.getSharedInstance(this.a).addPartnerId(partnerId.getPartnerId());
            }
        }
    }

    public CrashReportDecorator createCrashReportDecorator() {
        return new AndroidCrashReportDecorator(this);
    }

    public String getAppDataDir() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return context.getFilesDir().getAbsolutePath();
    }

    public String getApplicationId() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public String getApplicationName() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return CommonUtils.getApplicationName(context);
    }

    public String getApplicationVersion() {
        return CommonUtils.getApplicationVersion(this.a);
    }

    public String getArchitecture() {
        return CommonUtils.getDeviceArchitecture();
    }

    public int getConnectivityType() {
        Context context = this.a;
        return context == null ? ConnectivityType.UNKNOWN : CommonUtils.getConnectivityType(context);
    }

    public Context getContext() {
        return this.a;
    }

    public String getCrossPublisherId() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        CrossPublisherId crossPublisherDeviceId = IdHelperAndroid.getCrossPublisherDeviceId(context);
        StringBuilder sb = new StringBuilder();
        sb.append(crossPublisherDeviceId.crossPublisherId == null ? "" : crossPublisherDeviceId.crossPublisherId);
        sb.append(" ");
        sb.append(crossPublisherDeviceId.source);
        return sb.toString();
    }

    public int getCurrentHostApplicationState() {
        int state = HostApplicationState.getState(this.a);
        int i = 1;
        if (state == -1) {
            state = 1;
        }
        if (this.d == -1) {
            if (state != 0) {
                i = 2;
            }
            this.d = i;
        }
        return state;
    }

    public String[] getDeviceIds() {
        DeviceId androidSerial = IdHelperAndroid.getAndroidSerial();
        if (androidSerial == null || !IdHelperAndroid.checkAndroidSerial(androidSerial.getId())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(androidSerial.getId());
        sb.append(" ");
        sb.append(androidSerial.getCommonness());
        sb.append(androidSerial.getPersistency());
        sb.append(" true ");
        sb.append(androidSerial.getSource());
        return new String[]{sb.toString()};
    }

    public String getDeviceModel() {
        return CommonUtils.getDeviceModel();
    }

    public int getFirstHostState() {
        return this.d;
    }

    public String[] getInvalidIds() {
        return IdHelperAndroid.INVALID_ID_VALUES;
    }

    public String getLanguage() {
        return CommonUtils.getLanguage();
    }

    public String getOsName() {
        return "android";
    }

    public String getOsVersion() {
        return CommonUtils.getOsVersion();
    }

    public String getPackageManagerName() {
        Context context = this.a;
        if (context != null) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(this.a.getPackageName());
            if (!TextUtils.isEmpty(installerPackageName)) {
                return installerPackageName;
            }
        }
        return "unknown";
    }

    public Map<String, String> getPlatformLabels(Map<String, String> map) {
        if (this.a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i = IdHelperAndroid.getCrossPublisherDeviceId(this.a).source;
        int source = IdHelperAndroid.getDeviceId(this.a).getSource();
        boolean booleanValue = Permissions.check(this.a, "android.permission.INTERNET").booleanValue();
        boolean booleanValue2 = Permissions.check(this.a, "android.permission.ACCESS_NETWORK_STATE").booleanValue();
        boolean booleanValue3 = Permissions.check(this.a, "android.permission.ACCESS_WIFI_STATE").booleanValue();
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(source), Integer.valueOf(booleanValue ? 1 : 0), Integer.valueOf(booleanValue2 ? 1 : 0), Integer.valueOf(booleanValue3 ? 1 : 0), Integer.valueOf(isLibraryInstalledUsingMaven() ? 1 : 0), Integer.valueOf(this.d)};
        String str = "ns_ap_env";
        hashMap.put(str, String.format(Locale.getDefault(), "%d-%d-%d%d%d-%d-%d", objArr));
        hashMap.put("ns_ap_res", CommonUtils.getApplicationResolution(this.a));
        if (i == 1 && !TextUtils.isEmpty((CharSequence) map.get("ns_ak"))) {
            String mD5CrossPublisherDeviceId = CrossPublisherIdUtil.getMD5CrossPublisherDeviceId();
            if (!TextUtils.isEmpty(mD5CrossPublisherDeviceId)) {
                hashMap.put("ns_ap_i3", mD5CrossPublisherDeviceId);
            }
        }
        String str2 = "ns_ap_an";
        if (TextUtils.isEmpty((CharSequence) map.get(str2))) {
            hashMap.put(str2, getApplicationName());
        }
        String str3 = "ns_ap_ver";
        if (TextUtils.isEmpty((CharSequence) map.get(str3))) {
            hashMap.put(str3, getApplicationVersion());
        }
        String str4 = "ns_ap_bi";
        if (TextUtils.isEmpty((CharSequence) map.get(str4))) {
            hashMap.put(str4, getApplicationId());
        }
        hashMap.put("ns_ap_ais", getPackageManagerName());
        return hashMap;
    }

    public String getRuntimeName() {
        return "android";
    }

    public String getRuntimeVersion() {
        return getOsVersion();
    }

    public int getScreenHeight() {
        Context context = this.a;
        if (context == null) {
            return 0;
        }
        return CommonUtils.getDisplaySize(context).y;
    }

    public int getScreenWidth() {
        Context context = this.a;
        if (context == null) {
            return 0;
        }
        return CommonUtils.getDisplaySize(context).x;
    }

    public boolean isJailBroken() {
        return CommonUtils.isDeviceRooted();
    }

    public boolean isLibraryInstalledUsingMaven() {
        if (this.e == -1) {
            try {
                this.e = "maven".equals((String) Class.forName("com.comscore.BuildConfig").getField("FLAVOR").get(null)) ? 1 : 0;
            } catch (Exception unused) {
                this.e = 0;
            }
        }
        return this.e == 1;
    }

    public void libraryPostUpdate(String str, String str2, Map<String, String> map, ArrayList<String> arrayList) {
        UpdateFrom5_4_x updateFrom5_4_x = this.c;
        if (updateFrom5_4_x != null) {
            updateFrom5_4_x.libraryPostUpdate(map, arrayList);
        }
    }

    public void libraryUpdate(String str, String str2, Map<String, String> map) {
        if ((str == null || str.length() == 0) && !map.containsKey("updated_from_versions")) {
            this.c = new UpdateFrom5_4_x(this.a);
            this.c.libraryUpdate(map);
        }
    }

    public void onConfigurationChanged(int i) {
        if (i != 20301) {
            if (i == 20302) {
                a();
            } else if (i == 20306) {
                Vce.disable();
                return;
            } else if (i == 20307 && !Analytics.getConfiguration().isVce()) {
                Vce.disable();
                return;
            }
            return;
        }
        b();
    }

    public void onCoreStarted() {
        super.onCoreStarted();
        Vce.getSharedInstance(this.a).discoverAndTrackAds();
    }

    public void setContext(Context context) {
        if (context != null) {
            this.a = context.getApplicationContext();
            return;
        }
        throw new NullPointerException("Context can not be null");
    }

    public boolean subscribeToForegroundNotification() {
        if (!(this.a instanceof Application) || VERSION.SDK_INT < 14) {
            Logger.w("Unable to detect automatically if the application is in the foreground or in the background.");
            return false;
        }
        this.b = new BackgroundManager((Application) this.a);
        this.b.register();
        return true;
    }

    public boolean unsubscribeFromForegroundNotification() {
        BackgroundManager backgroundManager = this.b;
        if (backgroundManager == null) {
            return false;
        }
        backgroundManager.unregister();
        return true;
    }
}
