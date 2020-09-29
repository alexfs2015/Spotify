package com.facebook.appevents;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

public class AppEvent implements Serializable {
    private static final HashSet<String> a = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    public final boolean isImplicit;
    public final JSONObject jsonObject;
    public final String name;

    public static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        private Object readResolve() {
            AppEvent appEvent = new AppEvent(this.jsonString, this.isImplicit, this.inBackground, null, 0);
            return appEvent;
        }
    }

    static class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        /* synthetic */ SerializationProxyV2(String str, boolean z, boolean z2, String str2, byte b) {
            this(str, z, z2, str2);
        }

        private SerializationProxyV2(String str, boolean z, boolean z2, String str2) {
            this.jsonString = str;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str2;
        }

        private Object readResolve() {
            AppEvent appEvent = new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum, 0);
            return appEvent;
        }
    }

    /* synthetic */ AppEvent(String str, boolean z, boolean z2, String str2, byte b) {
        this(str, z, z2, str2);
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        this.jsonObject = a(str, str2, d, bundle, z, z2, uuid);
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = str2;
        this.checksum = b();
    }

    private AppEvent(String str, boolean z, boolean z2, String str2) {
        this.jsonObject = new JSONObject(str);
        this.isImplicit = z;
        this.name = this.jsonObject.optString("_eventName");
        this.checksum = str2;
        this.inBackground = z2;
    }

    public final boolean a() {
        if (this.checksum == null) {
            return true;
        }
        return b().equals(this.checksum);
    }

    private static void a(String str) {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        synchronized (a) {
            contains = a.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (a) {
                a.add(str);
            }
            return;
        }
        throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    private static JSONObject a(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        a(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", b(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        String str3 = "1";
        if (z) {
            jSONObject.put("_implicitlyLogged", str3);
        }
        if (z2) {
            jSONObject.put("_inBackground", str3);
        }
        if (bundle != null) {
            for (String str4 : bundle.keySet()) {
                a(str4);
                Object obj = bundle.get(str4);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    jSONObject.put(str4, obj.toString());
                } else {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str4}));
                }
            }
        }
        if (!z) {
            amp.a(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    private Object writeReplace() {
        SerializationProxyV2 serializationProxyV2 = new SerializationProxyV2(this.jsonObject.toString(), this.isImplicit, this.inBackground, this.checksum, 0);
        return serializationProxyV2;
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()});
    }

    private String b() {
        if (VERSION.SDK_INT > 19) {
            return b(this.jsonObject.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator keys = this.jsonObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.jsonObject.optString(str));
            sb.append(10);
        }
        return b(sb.toString());
    }

    private static String b(String str) {
        String str2 = "Failed to generate checksum: ";
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte valueOf : digest) {
                stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            amw.a(str2, (Exception) e);
            return Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        } catch (UnsupportedEncodingException e2) {
            amw.a(str2, (Exception) e2);
            return "1";
        }
    }
}
