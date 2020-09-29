package defpackage;

import android.os.Build.VERSION;
import com.comscore.TrackingPropertyType;
import com.crashlytics.android.answers.SessionEvent;
import com.moat.analytics.mobile.MoatAdEvent;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aib reason: default package */
final class aib implements wkw<SessionEvent> {
    aib() {
    }

    private static JSONObject a(SessionEvent sessionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            aia aia = sessionEvent.a;
            jSONObject.put("appBundleId", aia.a);
            jSONObject.put("executionId", aia.b);
            jSONObject.put("installationId", aia.c);
            jSONObject.put("limitAdTrackingEnabled", aia.d);
            jSONObject.put("betaDeviceToken", aia.e);
            jSONObject.put("buildId", aia.f);
            jSONObject.put("osVersion", aia.g);
            jSONObject.put(TrackingPropertyType.DEVICE_MODEL, aia.h);
            jSONObject.put("appVersionCode", aia.i);
            jSONObject.put("appVersionName", aia.j);
            jSONObject.put("timestamp", sessionEvent.b);
            jSONObject.put(MoatAdEvent.EVENT_TYPE, sessionEvent.c.toString());
            if (sessionEvent.d != null) {
                jSONObject.put("details", new JSONObject(sessionEvent.d));
            }
            jSONObject.put("customType", sessionEvent.e);
            if (sessionEvent.f != null) {
                jSONObject.put("customAttributes", new JSONObject(sessionEvent.f));
            }
            jSONObject.put("predefinedType", sessionEvent.g);
            if (sessionEvent.h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(sessionEvent.h));
            }
            return jSONObject;
        } catch (JSONException e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }

    public final /* synthetic */ byte[] a(Object obj) {
        return a((SessionEvent) obj).toString().getBytes("UTF-8");
    }
}
