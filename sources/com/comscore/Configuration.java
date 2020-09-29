package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import com.comscore.util.setup.Setup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Configuration extends CppJavaBinder {
    private List<PublisherConfiguration> a = new ArrayList();
    private List<PartnerConfiguration> b = new ArrayList();

    Configuration() {
    }

    private static native void addListenerNative(ConfigurationListener configurationListener);

    private static native void addPartnerConfigurationNative(long j);

    private static native void addPublisherConfigurationNative(long j);

    private static native boolean containsPersistentLabelNative(String str);

    private static native boolean containsStartLabelNative(String str);

    private static native void disableNative();

    private static native String getApplicationIdNative();

    private static native String getApplicationNameNative();

    private static native String getApplicationVersionNative();

    private static native int getCacheFlushingIntervalNative();

    private static native int getCacheMaxBatchFilesNative();

    private static native int getCacheMaxFlushesInARowNative();

    private static native int getCacheMaxMeasurementsNative();

    private static native int getCacheMeasurementExpiryNative();

    private static native int getCacheMinutesToRetryNative();

    private static native String[] getLabelOrderNative();

    private static native String getLiveEndpointUrlNative();

    private static native int getLiveTransmissionModeNative();

    private static native int getOfflineCacheModeNative();

    private static native String getOfflineFlushEndpointUrlNative();

    private static native long getPartnerConfigurationNative(String str);

    private static native long[] getPartnerConfigurationsNative();

    private static native String getPersistentLabelNative(String str);

    private static native Map<String, String> getPersistentLabelsNative();

    private static native long getPublisherConfigurationNative(String str);

    private static native long[] getPublisherConfigurationsNative();

    private static native String getStartLabelNative(String str);

    private static native Map<String, String> getStartLabelsNative();

    private static native int getUsagePropertiesAutoUpdateIntervalNative();

    private static native int getUsagePropertiesAutoUpdateModeNative();

    private static native boolean isEnabledNative();

    private static native boolean isHttpRedirectCachingEnabledNative();

    private static native boolean isInitializedNative();

    private static native boolean isKeepAliveMeasurementNative();

    private static native boolean isSecureTransmissionNative();

    private static native boolean isVceNative();

    private static native void removeAllPersistentLabelsNative();

    private static native void removeAllStartLabelsNative();

    private static native boolean removeListenerNative(ConfigurationListener configurationListener);

    private static native void removePersistentLabelNative(String str);

    private static native void removeStartLabelNative(String str);

    private static native void setApplicationNameNative(String str);

    private static native void setApplicationVersionNative(String str);

    private static native void setKeepAliveMeasurementNative(boolean z);

    private static native void setLabelOrderNative(String[] strArr);

    private static native void setLiveTransmissionModeNative(int i);

    private static native void setOfflineCacheModeNative(int i);

    private static native void setPersistentLabelNative(String str, String str2);

    private static native void setPersistentLabelsNative(Map<String, String> map);

    private static native void setStartLabelNative(String str, String str2);

    private static native void setStartLabelsNative(Map<String, String> map);

    public void addClient(ClientConfiguration clientConfiguration) {
        try {
            if (clientConfiguration instanceof PublisherConfiguration) {
                addPublisherConfigurationNative(clientConfiguration.a());
                this.a.add((PublisherConfiguration) clientConfiguration);
                return;
            }
            if (clientConfiguration instanceof PartnerConfiguration) {
                addPartnerConfigurationNative(clientConfiguration.a());
                this.b.add((PartnerConfiguration) clientConfiguration);
            }
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addListener(ConfigurationListener configurationListener) {
        if (configurationListener != null) {
            try {
                addListenerNative(configurationListener);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public boolean containsPersistentLabel(String str) {
        try {
            return containsPersistentLabelNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean containsStartLabel(String str) {
        try {
            return containsStartLabelNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public void destroyCppObject() {
    }

    public void disable() {
        try {
            disableNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public String getApplicationId() {
        try {
            return getApplicationIdNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getApplicationName() {
        try {
            return getApplicationNameNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getApplicationVersion() {
        try {
            return getApplicationVersionNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public int getCacheFlushingInterval() {
        try {
            return getCacheFlushingIntervalNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMaxBatchFiles() {
        try {
            return getCacheMaxBatchFilesNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMaxFlushesInARow() {
        try {
            return getCacheMaxFlushesInARowNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMaxMeasurements() {
        try {
            return getCacheMaxMeasurementsNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMeasurementExpiry() {
        try {
            return getCacheMeasurementExpiryNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getCacheMinutesToRetry() {
        try {
            return getCacheMinutesToRetryNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public String[] getLabelOrder() {
        try {
            return getLabelOrderNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getLiveEndpointUrl() {
        try {
            return getLiveEndpointUrlNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public int getLiveTransmissionMode() {
        try {
            return getLiveTransmissionModeNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getOfflineCacheMode() {
        try {
            return getOfflineCacheModeNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public String getOfflineFlushEndpointUrl() {
        try {
            return getOfflineFlushEndpointUrlNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public PartnerConfiguration getPartnerConfiguration(String str) {
        try {
            long partnerConfigurationNative = getPartnerConfigurationNative(str);
            if (partnerConfigurationNative != 0) {
                return new PartnerConfiguration(partnerConfigurationNative);
            }
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
        return null;
    }

    public List<PartnerConfiguration> getPartnerConfigurations() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            return this.b;
        }
        try {
            long[] partnerConfigurationsNative = getPartnerConfigurationsNative();
            ArrayList arrayList = new ArrayList(partnerConfigurationsNative.length);
            for (long partnerConfiguration : partnerConfigurationsNative) {
                arrayList.add(new PartnerConfiguration(partnerConfiguration));
            }
            return arrayList;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return this.b;
        }
    }

    public String getPersistentLabel(String str) {
        try {
            return getPersistentLabelNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getPersistentLabels() {
        try {
            return getPersistentLabelsNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public PublisherConfiguration getPublisherConfiguration(String str) {
        try {
            long publisherConfigurationNative = getPublisherConfigurationNative(str);
            if (publisherConfigurationNative != 0) {
                return new PublisherConfiguration(publisherConfigurationNative);
            }
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
        return null;
    }

    public List<PublisherConfiguration> getPublisherConfigurations() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            return this.a;
        }
        try {
            long[] publisherConfigurationsNative = getPublisherConfigurationsNative();
            ArrayList arrayList = new ArrayList(publisherConfigurationsNative.length);
            for (long publisherConfiguration : publisherConfigurationsNative) {
                arrayList.add(new PublisherConfiguration(publisherConfiguration));
            }
            return arrayList;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return this.a;
        }
    }

    public String getStartLabel(String str) {
        try {
            return getStartLabelNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getStartLabels() {
        try {
            return getStartLabelsNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public int getUsagePropertiesAutoUpdateInterval() {
        try {
            return getUsagePropertiesAutoUpdateIntervalNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public int getUsagePropertiesAutoUpdateMode() {
        try {
            return getUsagePropertiesAutoUpdateModeNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public boolean isEnabled() {
        try {
            return isEnabledNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isHttpRedirectCachingEnabled() {
        try {
            return isHttpRedirectCachingEnabledNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isInitialized() {
        try {
            return isInitializedNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isKeepAliveMeasurement() {
        try {
            return isKeepAliveMeasurementNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isSecureTransmission() {
        try {
            return isSecureTransmissionNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isVce() {
        try {
            return isVceNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public void removeAllPersistentLabels() {
        try {
            removeAllPersistentLabelsNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeAllStartLabels() {
        try {
            removeAllStartLabelsNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean removeListener(ConfigurationListener configurationListener) {
        if (configurationListener == null) {
            return false;
        }
        try {
            return removeListenerNative(configurationListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public void removePersistentLabel(String str) {
        try {
            removePersistentLabelNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeStartLabel(String str) {
        try {
            removeStartLabelNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setApplicationName(String str) {
        try {
            setApplicationNameNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setApplicationVersion(String str) {
        try {
            setApplicationVersionNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setKeepAliveMeasurement(boolean z) {
        try {
            setKeepAliveMeasurementNative(z);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabelOrder(String[] strArr) {
        try {
            setLabelOrderNative(strArr);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLiveTransmissionMode(int i) {
        try {
            setLiveTransmissionModeNative(i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setOfflineCacheMode(int i) {
        try {
            setOfflineCacheModeNative(i);
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
                setPersistentLabelNative(str, str2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setPersistentLabels(Map<String, String> map) {
        try {
            setPersistentLabelsNative(map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setStartLabel(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                removeStartLabel(str2);
                return;
            }
            try {
                setStartLabelNative(str, str2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setStartLabels(Map<String, String> map) {
        try {
            setStartLabelsNative(map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
