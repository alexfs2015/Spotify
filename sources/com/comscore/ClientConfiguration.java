package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;
import java.util.HashMap;
import java.util.Map;

public abstract class ClientConfiguration extends CppJavaBinder {
    long a = 0;
    Builder b = null;

    public static abstract class Builder<T extends Builder, P extends ClientConfiguration> {
        protected String applicationDataDir;
        protected String applicationId;
        protected String applicationName;
        protected String applicationVersion;
        protected int cacheFlushingInterval;
        protected int cacheMaxBatchFiles;
        protected int cacheMaxFlushesInARow;
        protected int cacheMaxMeasurements;
        protected int cacheMeasurementExpiry;
        protected int cacheMinutesToRetry;
        protected String clientId;
        protected boolean httpRedirectCaching;
        protected boolean keepAliveMeasurement;
        protected String[] labelOrder;
        protected String liveEndPointUrl;
        protected int liveTransmissionMode;
        protected int offlineCacheMode;
        protected String offlineFlushEndpointUrl;
        protected Map<String, String> persistentLabels;
        protected boolean secureTransmission;
        protected Map<String, String> startLabels;
        protected int usagePropertiesAutoUpdateInterval;
        protected int usagePropertiesAutoUpdateMode;
        protected boolean vceEnabled;

        protected Builder() {
            try {
                this.liveTransmissionMode = ClientConfiguration.getDefaultLiveTransmissionModeNative();
                this.offlineCacheMode = ClientConfiguration.getDefaultOfflineCacheModeNative();
                this.usagePropertiesAutoUpdateMode = ClientConfiguration.getDefaultUsagePropertiesAutoUpdateModeNative();
                this.usagePropertiesAutoUpdateInterval = ClientConfiguration.getDefaultUsagePropertiesAutoUpdateIntervalNative();
                this.cacheMaxMeasurements = ClientConfiguration.getDefaultCacheMaxMeasurementsNative();
                this.cacheMaxBatchFiles = ClientConfiguration.getDefaultCacheMaxBatchFilesNative();
                this.cacheMaxFlushesInARow = ClientConfiguration.getDefaultCacheMaxFlushesInARowNative();
                this.cacheMinutesToRetry = ClientConfiguration.getDefaultCacheMinutesToRetryNative();
                this.cacheMeasurementExpiry = ClientConfiguration.getDefaultCacheMeasurementExpiryNative();
                this.cacheFlushingInterval = ClientConfiguration.getDefaultCacheFlushingIntervalNative();
                this.vceEnabled = ClientConfiguration.getDefaultVceEnabledNative();
                this.keepAliveMeasurement = ClientConfiguration.getDefaultKeepAliveMeasurementNative();
                this.secureTransmission = ClientConfiguration.getDefaultSecureTransmissionNative();
                this.labelOrder = ClientConfiguration.getDefaultLabelOrderNative();
                this.httpRedirectCaching = ClientConfiguration.getDefaultHttpRedirectCachingEnabledNative();
            } catch (UnsatisfiedLinkError e) {
                Logger.e("Error using the native library: ", (Throwable) e);
            }
            this.persistentLabels = new HashMap();
            this.startLabels = new HashMap();
        }

        protected Builder(Builder builder) {
            this.vceEnabled = builder.vceEnabled;
            this.liveEndPointUrl = builder.liveEndPointUrl;
            this.offlineFlushEndpointUrl = builder.offlineFlushEndpointUrl;
            this.liveTransmissionMode = builder.liveTransmissionMode;
            this.offlineCacheMode = builder.offlineCacheMode;
            this.persistentLabels = new HashMap(builder.persistentLabels);
            this.startLabels = new HashMap(builder.startLabels);
            this.labelOrder = builder.labelOrder;
            this.applicationName = builder.applicationName;
            this.applicationVersion = builder.applicationVersion;
            this.applicationId = builder.applicationId;
            this.applicationDataDir = builder.applicationDataDir;
            this.usagePropertiesAutoUpdateMode = builder.usagePropertiesAutoUpdateMode;
            this.usagePropertiesAutoUpdateInterval = builder.usagePropertiesAutoUpdateInterval;
            this.cacheMaxMeasurements = builder.cacheMaxMeasurements;
            this.cacheMaxBatchFiles = builder.cacheMaxBatchFiles;
            this.cacheMaxFlushesInARow = builder.cacheMaxFlushesInARow;
            this.cacheMinutesToRetry = builder.cacheMinutesToRetry;
            this.cacheMeasurementExpiry = builder.cacheMeasurementExpiry;
            this.cacheFlushingInterval = builder.cacheFlushingInterval;
            this.keepAliveMeasurement = builder.keepAliveMeasurement;
            this.secureTransmission = builder.secureTransmission;
            this.httpRedirectCaching = builder.httpRedirectCaching;
            this.clientId = builder.clientId;
        }

        /* access modifiers changed from: 0000 */
        public abstract T a();

        /* access modifiers changed from: 0000 */
        public void a(String str) {
            if (str != null) {
                int indexOf = str.indexOf(63);
                if (indexOf < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('?');
                    str = sb.toString();
                } else if (indexOf < str.length() - 1) {
                    int i = indexOf + 1;
                    for (String split : str.substring(i).split("&")) {
                        String[] split2 = split.split("=");
                        if (split2.length == 2) {
                            this.persistentLabels.put(split2[0], split2[1]);
                        }
                    }
                    str = str.substring(0, i);
                }
                this.liveEndPointUrl = str;
            }
        }

        public T applicationDataDir(String str) {
            this.applicationDataDir = str;
            return this;
        }

        public T applicationId(String str) {
            this.applicationId = str;
            return this;
        }

        public T applicationName(String str) {
            this.applicationName = str;
            return this;
        }

        public T applicationVersion(String str) {
            this.applicationVersion = str;
            return this;
        }

        public abstract P build();

        public T cacheFlushingInterval(int i) {
            if (i >= 0) {
                this.cacheFlushingInterval = i;
            }
            return this;
        }

        public T cacheMaxBatchFiles(int i) {
            if (i > 0) {
                this.cacheMaxBatchFiles = i;
            }
            return this;
        }

        public T cacheMaxFlushesInARow(int i) {
            if (i > 0) {
                this.cacheMaxFlushesInARow = i;
            }
            return this;
        }

        public T cacheMaxMeasurements(int i) {
            if (i > 0) {
                this.cacheMaxMeasurements = i;
            }
            return this;
        }

        public T cacheMeasurementExpiry(int i) {
            if (i > 0) {
                this.cacheMeasurementExpiry = i;
            }
            return this;
        }

        public T cacheMinutesToRetry(int i) {
            if (i > 0) {
                this.cacheMinutesToRetry = i;
            }
            return this;
        }

        public T httpRedirectCachingEnabled(boolean z) {
            this.httpRedirectCaching = z;
            return this;
        }

        public T keepAliveMeasurement(boolean z) {
            this.keepAliveMeasurement = z;
            return this;
        }

        public T labelOrder(String[] strArr) {
            if (strArr != null) {
                this.labelOrder = strArr;
            }
            return this;
        }

        public T liveEndpointUrl(String str) {
            a(str);
            return this;
        }

        public T liveTransmissionMode(int i) {
            if (i >= 20001 || i <= 20003) {
                this.liveTransmissionMode = i;
            }
            return this;
        }

        public T offlineCacheMode(int i) {
            if (i >= 20101 && i <= 20104) {
                this.offlineCacheMode = i;
            }
            return this;
        }

        public T offlineFlushEndpointUrl(String str) {
            this.offlineFlushEndpointUrl = str;
            return this;
        }

        public T persistentLabels(Map<String, String> map) {
            this.persistentLabels.clear();
            this.persistentLabels.putAll(map);
            return this;
        }

        public T secureTransmission(boolean z) {
            this.secureTransmission = z;
            return this;
        }

        /* access modifiers changed from: protected */
        public void setClientId(String str) {
            this.clientId = str;
        }

        public T startLabels(Map<String, String> map) {
            this.startLabels.clear();
            this.startLabels.putAll(map);
            return this;
        }

        public T usagePropertiesAutoUpdateInterval(int i) {
            if (i > 0) {
                this.usagePropertiesAutoUpdateInterval = i;
            }
            return this;
        }

        public T usagePropertiesAutoUpdateMode(int i) {
            if (i <= 20502 || i >= 20500) {
                this.usagePropertiesAutoUpdateMode = i;
            }
            return this;
        }

        public T vce(boolean z) {
            this.vceEnabled = z;
            return this;
        }
    }

    ClientConfiguration() {
    }

    ClientConfiguration(Builder builder) {
        this.b = builder.a();
    }

    private static native void addListenerNative(long j, ConfigurationListener configurationListener);

    private static native boolean containsPersistentLabelNative(long j, String str);

    private static native boolean containsStartLabelNative(long j, String str);

    private static native String getApplicationDataDirNative(long j);

    private static native String getApplicationIdNative(long j);

    private static native String getApplicationNameNative(long j);

    private static native String getApplicationVersionNative(long j);

    private static native int getCacheFlushingIntervalNative(long j);

    private static native int getCacheMaxBatchFilesNative(long j);

    private static native int getCacheMaxFlushesInARowNative(long j);

    private static native int getCacheMaxMeasurementsNative(long j);

    private static native int getCacheMeasurementExpiryNative(long j);

    private static native int getCacheMinutesToRetryNative(long j);

    /* access modifiers changed from: private */
    public static native int getDefaultCacheFlushingIntervalNative();

    /* access modifiers changed from: private */
    public static native int getDefaultCacheMaxBatchFilesNative();

    /* access modifiers changed from: private */
    public static native int getDefaultCacheMaxFlushesInARowNative();

    /* access modifiers changed from: private */
    public static native int getDefaultCacheMaxMeasurementsNative();

    /* access modifiers changed from: private */
    public static native int getDefaultCacheMeasurementExpiryNative();

    /* access modifiers changed from: private */
    public static native int getDefaultCacheMinutesToRetryNative();

    /* access modifiers changed from: private */
    public static native boolean getDefaultHttpRedirectCachingEnabledNative();

    /* access modifiers changed from: private */
    public static native boolean getDefaultKeepAliveMeasurementNative();

    /* access modifiers changed from: private */
    public static native String[] getDefaultLabelOrderNative();

    /* access modifiers changed from: private */
    public static native int getDefaultLiveTransmissionModeNative();

    /* access modifiers changed from: private */
    public static native int getDefaultOfflineCacheModeNative();

    /* access modifiers changed from: private */
    public static native boolean getDefaultSecureTransmissionNative();

    /* access modifiers changed from: private */
    public static native int getDefaultUsagePropertiesAutoUpdateIntervalNative();

    /* access modifiers changed from: private */
    public static native int getDefaultUsagePropertiesAutoUpdateModeNative();

    /* access modifiers changed from: private */
    public static native boolean getDefaultVceEnabledNative();

    private static native String[] getLabelOrderNative(long j);

    private static native String getLiveEndpointUrlNative(long j);

    private static native int getLiveTransmissionModeNative(long j);

    private static native int getOfflineCacheModeNative(long j);

    private static native String getOfflineFlushEndpointUrlNative(long j);

    private static native String getPersistentLabelNative(long j, String str);

    private static native Map<String, String> getPersistentLabelsNative(long j);

    private static native Map<String, String> getStartLabelsNative(long j);

    private static native int getUsagePropertiesAutoUpdateIntervalNative(long j);

    private static native int getUsagePropertiesAutoUpdateModeNative(long j);

    private static native boolean isHttpRedirectCachingEnabledNative(long j);

    private static native boolean isKeepAliveMeasurementNative(long j);

    private static native boolean isSecureTransmissionNative(long j);

    private static native boolean isVceNative(long j);

    private static native void removeAllPersistentLabelsNative(long j);

    private static native boolean removeListenerNative(long j, ConfigurationListener configurationListener);

    private static native void removePersistentLabelNative(long j, String str);

    private static native void setPersistentLabelNative(long j, String str, String str2);

    private static native void setPersistentLabelsNative(long j, Map<String, String> map);

    /* access modifiers changed from: 0000 */
    public long a() {
        return this.a;
    }

    public void addListener(ConfigurationListener configurationListener) {
        if (configurationListener != null) {
            try {
                addListenerNative(this.a, configurationListener);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public boolean containsPersistentLabel(String str) {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.persistentLabels.containsKey(str);
            }
        }
        try {
            return containsPersistentLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean containsStartLabel(String str) {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.startLabels.containsKey(str);
            }
        }
        try {
            return containsStartLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public String getApplicationDataDir() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.applicationDataDir;
            }
        }
        try {
            return getApplicationDataDirNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getApplicationId() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.applicationId;
            }
        }
        try {
            return getApplicationIdNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getApplicationName() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.applicationName;
            }
        }
        try {
            return getApplicationNameNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getApplicationVersion() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.applicationVersion;
            }
        }
        try {
            return getApplicationVersionNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public int getCacheFlushingInterval() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.cacheFlushingInterval;
            }
        }
        try {
            return getCacheFlushingIntervalNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMaxBatchFiles() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.cacheMaxBatchFiles;
            }
        }
        try {
            return getCacheMaxBatchFilesNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMaxFlushesInARow() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.cacheMaxFlushesInARow;
            }
        }
        try {
            return getCacheMaxFlushesInARowNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMaxMeasurements() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.cacheMaxMeasurements;
            }
        }
        try {
            return getCacheMaxMeasurementsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMeasurementExpiry() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.cacheMeasurementExpiry;
            }
        }
        try {
            return getCacheMeasurementExpiryNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMinutesToRetry() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.cacheMinutesToRetry;
            }
        }
        try {
            return getCacheMinutesToRetryNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public String[] getLabelOrder() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.labelOrder;
            }
        }
        try {
            return getLabelOrderNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getLiveEndpointUrl() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.liveEndPointUrl;
            }
        }
        try {
            return getLiveEndpointUrlNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public int getLiveTransmissionMode() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.liveTransmissionMode;
            }
        }
        try {
            return getLiveTransmissionModeNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getOfflineCacheMode() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.offlineCacheMode;
            }
        }
        try {
            return getOfflineCacheModeNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public String getOfflineFlushEndpointUrl() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.offlineFlushEndpointUrl;
            }
        }
        try {
            return getOfflineFlushEndpointUrlNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getPersistentLabel(String str) {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return (String) builder.persistentLabels.get(str);
            }
        }
        try {
            return getPersistentLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getPersistentLabels() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.persistentLabels;
            }
        }
        try {
            return getPersistentLabelsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getStartLabels() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.startLabels;
            }
        }
        try {
            return getStartLabelsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public int getUsagePropertiesAutoUpdateInterval() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.usagePropertiesAutoUpdateInterval;
            }
        }
        try {
            return getUsagePropertiesAutoUpdateIntervalNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getUsagePropertiesAutoUpdateMode() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.usagePropertiesAutoUpdateMode;
            }
        }
        try {
            return getUsagePropertiesAutoUpdateModeNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public boolean isHttpRedirectCachingEnabled() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.httpRedirectCaching;
            }
        }
        try {
            return isHttpRedirectCachingEnabledNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isKeepAliveMeasurement() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.keepAliveMeasurement;
            }
        }
        try {
            return isKeepAliveMeasurementNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isSecureTransmission() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.secureTransmission;
            }
        }
        try {
            return isSecureTransmissionNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isVce() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            Builder builder = this.b;
            if (builder != null) {
                return builder.vceEnabled;
            }
        }
        try {
            return isVceNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public void removeAllPersistentLabels() {
        try {
            removeAllPersistentLabelsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean removeListener(ConfigurationListener configurationListener) {
        if (configurationListener == null) {
            return false;
        }
        try {
            return removeListenerNative(this.a, configurationListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public void removePersistentLabel(String str) {
        try {
            removePersistentLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPersistentLabel(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                removePersistentLabel(str);
                return;
            }
            try {
                setPersistentLabelNative(this.a, str, str2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setPersistentLabels(Map<String, String> map) {
        try {
            setPersistentLabelsNative(this.a, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
