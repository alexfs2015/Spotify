package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.music.lyrics.model.TrackLyrics;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack extends bxf implements ReflectedParcelable {
    public static final Creator<MediaTrack> CREATOR = new brg();
    private long a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private JSONObject i;

    public MediaTrack(long j, int i2, String str, String str2, String str3, String str4, int i3, String str5) {
        this.a = j;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i3;
        this.h = str5;
        String str6 = this.h;
        if (str6 != null) {
            try {
                this.i = new JSONObject(str6);
            } catch (JSONException unused) {
                this.i = null;
                this.h = null;
            }
        } else {
            this.i = null;
        }
    }

    MediaTrack(JSONObject jSONObject) {
        this(0, 0, null, null, null, null, -1, null);
        this.a = jSONObject.getLong("trackId");
        String string = jSONObject.getString(MoatAdEvent.EVENT_TYPE);
        if (TrackLyrics.KIND_TEXT.equals(string)) {
            this.b = 1;
        } else if ("AUDIO".equals(string)) {
            this.b = 2;
        } else if ("VIDEO".equals(string)) {
            this.b = 3;
        } else {
            String str = "invalid type: ";
            String valueOf = String.valueOf(string);
            throw new JSONException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        this.c = jSONObject.optString("trackContentId", null);
        this.d = jSONObject.optString("trackContentType", null);
        this.e = jSONObject.optString("name", null);
        this.f = jSONObject.optString("language", null);
        String str2 = "subtype";
        if (jSONObject.has(str2)) {
            String string2 = jSONObject.getString(str2);
            if ("SUBTITLES".equals(string2)) {
                this.g = 1;
            } else if ("CAPTIONS".equals(string2)) {
                this.g = 2;
            } else if ("DESCRIPTIONS".equals(string2)) {
                this.g = 3;
            } else if ("CHAPTERS".equals(string2)) {
                this.g = 4;
            } else if ("METADATA".equals(string2)) {
                this.g = 5;
            } else {
                this.g = -1;
            }
        } else {
            this.g = 0;
        }
        this.i = jSONObject.optJSONObject("customData");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        if ((this.i == null) != (mediaTrack.i == null)) {
            return false;
        }
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            JSONObject jSONObject2 = mediaTrack.i;
            if (jSONObject2 != null && !bzn.a(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return this.a == mediaTrack.a && this.b == mediaTrack.b && ehl.a(this.c, mediaTrack.c) && ehl.a(this.d, mediaTrack.d) && ehl.a(this.e, mediaTrack.e) && ehl.a(this.f, mediaTrack.f) && this.g == mediaTrack.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), String.valueOf(this.i)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.b(parcel, 3, this.b);
        bxg.a(parcel, 4, this.c, false);
        bxg.a(parcel, 5, this.d, false);
        bxg.a(parcel, 6, this.e, false);
        bxg.a(parcel, 7, this.f, false);
        bxg.b(parcel, 8, this.g);
        bxg.a(parcel, 9, this.h, false);
        bxg.b(parcel, a2);
    }
}
