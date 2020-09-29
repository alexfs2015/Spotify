package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    public final esp a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            bxo.a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                this.mValue = eue.a(obj);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }
    }

    public interface OnEventListener extends etr {
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    public static final class a extends etq {
    }

    public AppMeasurement(esp esp) {
        bxo.a(esp);
        this.a = esp;
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return esp.a(context, (eri) null).h;
    }

    public void beginAdUnitExposure(String str) {
        eqw eqw = this.a.i;
        long b = this.a.l().b();
        if (str == null || str.length() == 0) {
            eqw.q().c.a("Ad unit id must be a non-empty string");
        } else {
            eqw.p().a((Runnable) new erw(eqw, str, b));
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.d().a((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        ett d = this.a.d();
        bxo.a(str);
        d.a();
        d.a(str, str2, str3, bundle);
    }

    public void endAdUnitExposure(String str) {
        eqw eqw = this.a.i;
        long b = this.a.l().b();
        if (str == null || str.length() == 0) {
            eqw.q().c.a("Ad unit id must be a non-empty string");
        } else {
            eqw.p().a((Runnable) new esv(eqw, str, b));
        }
    }

    public long generateEventId() {
        return this.a.e().f();
    }

    public String getAppInstanceId() {
        return (String) this.a.d().b.get();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.a.d().a((String) null, str, str2);
    }

    /* access modifiers changed from: protected */
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        ett d = this.a.d();
        bxo.a(str);
        d.a();
        return d.a(str, str2, str3);
    }

    public String getCurrentScreenClass() {
        return this.a.d().x();
    }

    public String getCurrentScreenName() {
        return this.a.d().w();
    }

    public String getGmpAppId() {
        return this.a.d().y();
    }

    public int getMaxUserProperties(String str) {
        this.a.d();
        bxo.a(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.d().a((String) null, str, str2, z);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        ett d = this.a.d();
        bxo.a(str);
        d.a();
        return d.a(str, str2, str3, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.d().a(str, str2, bundle);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.a.d().a((etr) onEventListener);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        ett d = this.a.d();
        bxo.a(conditionalUserProperty);
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            d.q().f.a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        d.a(conditionalUserProperty2);
    }

    /* access modifiers changed from: protected */
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        ett d = this.a.d();
        bxo.a(conditionalUserProperty);
        bxo.a(conditionalUserProperty.mAppId);
        d.a();
        d.a(new ConditionalUserProperty(conditionalUserProperty));
    }
}
