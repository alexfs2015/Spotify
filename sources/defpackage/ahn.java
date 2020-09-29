package defpackage;

import android.os.Build.VERSION;
import com.comscore.TrackingPropertyType;
import com.crashlytics.android.answers.SessionEvent;
import com.moat.analytics.mobile.MoatAdEvent;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ahn reason: default package */
final class ahn implements vwq<SessionEvent> {
    ahn() {
    }

    public final /* synthetic */ byte[] a(Object obj) {
        return a((SessionEvent) obj).toString().getBytes("UTF-8");
    }

    private static JSONObject a(SessionEvent sessionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            ahm ahm = sessionEvent.a;
            jSONObject.put("appBundleId", ahm.a);
            jSONObject.put("executionId", ahm.b);
            jSONObject.put("installationId", ahm.c);
            jSONObject.put("limitAdTrackingEnabled", ahm.d);
            jSONObject.put("betaDeviceToken", ahm.e);
            jSONObject.put("buildId", ahm.f);
            jSONObject.put("osVersion", ahm.g);
            jSONObject.put(TrackingPropertyType.DEVICE_MODEL, ahm.h);
            jSONObject.put("appVersionCode", ahm.i);
            jSONObject.put("appVersionName", ahm.j);
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
}
