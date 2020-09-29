package com.spotify.mobile.android.video.exo;

import android.text.TextUtils;
import com.spotify.mobile.android.video.exception.ErrorType;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ManifestResponseException extends IOException {
    private static final Map<String, ErrorType> b;
    private static final long serialVersionUID = 43;
    private final transient JSONObject a;
    /* access modifiers changed from: private */
    public final int mHttpStatusCode;
    /* access modifiers changed from: private */
    public final String mJsonResponse;

    static class SerializationProxy implements Serializable {
        private static final long serialVersionUID = 2414789161110589469L;
        private final int mHttpStatusCode;
        private final String mJsonResponse;

        public SerializationProxy(ManifestResponseException manifestResponseException) {
            this.mJsonResponse = manifestResponseException.mJsonResponse;
            this.mHttpStatusCode = manifestResponseException.mHttpStatusCode;
        }

        private Object readResolve() {
            return new ManifestResponseException(this.mHttpStatusCode, this.mJsonResponse);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("geoLocation", ErrorType.ERROR_GEORESTRICTED);
        b.put("GEO_RESTRICTED", ErrorType.ERROR_GEORESTRICTED);
        b.put("UNSUPPORTED_PLATFORM_VERSION", ErrorType.ERROR_UNSUPPORTED_PLATFORM_VERSION);
        b.put("UNSUPPORTED_CLIENT_VERSION", ErrorType.ERROR_UNSUPPORTED_CLIENT_VERSION);
        b.put("COUNTRY_RESTRICTED", ErrorType.ERROR_COUNTRY_RESTRICTED);
        b.put("UNAVAILABLE", ErrorType.ERROR_UNAVAILABLE);
        b.put("CATALOGUE_RESTRICTED", ErrorType.ERROR_CATALOGUE_RESTRICTED);
        b.put("MANIFEST_DELETED", ErrorType.ERROR_MANIFEST_DELETED);
    }

    public ManifestResponseException(int i, String str) {
        StringBuilder sb = new StringBuilder("http status = ");
        sb.append(i);
        sb.append("; jsonResponse");
        sb.append(str);
        super(sb.toString());
        this.mHttpStatusCode = i;
        if (i != 404 || !TextUtils.isEmpty(str)) {
            this.mJsonResponse = str;
        } else {
            this.mJsonResponse = String.format("{reason='%s'}", new Object[]{"MANIFEST_DELETED"});
        }
        this.a = b();
    }

    private JSONObject b() {
        String str = this.mJsonResponse;
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final ErrorType a() {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                ErrorType errorType = (ErrorType) b.get(jSONObject.getString("reason"));
                if (errorType != null) {
                    return errorType;
                }
            } catch (JSONException unused) {
            }
        }
        return ErrorType.ERROR_UNKNOWN;
    }

    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
}
