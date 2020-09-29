package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    public final ery a;

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
            bwx.a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                this.mValue = etn.a(obj);
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

    public interface OnEventListener extends eta {
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    public static final class a extends esz {
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return ery.a(context, (eqr) null).h;
    }

    public AppMeasurement(ery ery) {
        bwx.a(ery);
        this.a = ery;
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.d().a(str, str2, bundle);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.a.d().a((eta) onEventListener);
    }

    public String getCurrentScreenName() {
        return this.a.d().w();
    }

    public String getCurrentScreenClass() {
        return this.a.d().x();
    }

    public String getAppInstanceId() {
        return (String) this.a.d().b.get();
    }

    public String getGmpAppId() {
        return this.a.d().y();
    }

    public long generateEventId() {
        return this.a.e().f();
    }

    public void beginAdUnitExposure(String str) {
        eqf eqf = this.a.i;
        long b = this.a.l().b();
        if (str == null || str.length() == 0) {
            eqf.q().c.a("Ad unit id must be a non-empty string");
        } else {
            eqf.p().a((Runnable) new erf(eqf, str, b));
        }
    }

    public void endAdUnitExposure(String str) {
        eqf eqf = this.a.i;
        long b = this.a.l().b();
        if (str == null || str.length() == 0) {
            eqf.q().c.a("Ad unit id must be a non-empty string");
        } else {
            eqf.p().a((Runnable) new ese(eqf, str, b));
        }
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        etc d = this.a.d();
        bwx.a(conditionalUserProperty);
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            d.q().f.a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        d.a(conditionalUserProperty2);
    }

    /* access modifiers changed from: protected */
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        etc d = this.a.d();
        bwx.a(conditionalUserProperty);
        bwx.a(conditionalUserProperty.mAppId);
        d.a();
        d.a(new ConditionalUserProperty(conditionalUserProperty));
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.d().a((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        etc d = this.a.d();
        bwx.a(str);
        d.a();
        d.a(str, str2, str3, bundle);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.d().a((String) null, str, str2, z);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        etc d = this.a.d();
        bwx.a(str);
        d.a();
        return d.a(str, str2, str3, z);
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.a.d().a((String) null, str, str2);
    }

    /* access modifiers changed from: protected */
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        etc d = this.a.d();
        bwx.a(str);
        d.a();
        return d.a(str, str2, str3);
    }

    public int getMaxUserProperties(String str) {
        this.a.d();
        bwx.a(str);
        return 25;
    }
}
