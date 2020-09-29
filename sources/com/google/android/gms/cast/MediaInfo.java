package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaInfo extends bxw implements ReflectedParcelable {
    public static final Creator<MediaInfo> CREATOR = new brt();
    public int a;
    public boc b;
    public long c;
    public List<bnv> d;
    private final String e;
    private String f;
    private List<MediaTrack> g;
    private boi h;
    private String i;
    private List<bnu> j;
    private String k;
    private boj l;
    private long m;
    private JSONObject n;

    public MediaInfo(String str, int i2, String str2, boc boc, long j2, List<MediaTrack> list, boi boi, String str3, List<bnv> list2, List<bnu> list3, String str4, boj boj, long j3) {
        this.e = str;
        this.a = i2;
        this.f = str2;
        this.b = boc;
        this.c = j2;
        this.g = list;
        this.h = boi;
        this.i = str3;
        String str5 = this.i;
        if (str5 != null) {
            try {
                this.n = new JSONObject(str5);
            } catch (JSONException unused) {
                this.n = null;
                this.i = null;
            }
        } else {
            this.n = null;
        }
        this.d = list2;
        this.j = list3;
        this.k = str4;
        this.l = boj;
        this.m = j3;
    }

    public MediaInfo(JSONObject jSONObject) {
        MediaInfo mediaInfo;
        this(jSONObject.getString("contentId"), -1, null, null, -1, null, null, null, null, null, null, null, -1);
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString("streamType");
        String str = "NONE";
        if (str.equals(string)) {
            mediaInfo = this;
            mediaInfo.a = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(string)) {
                mediaInfo.a = 1;
            } else if ("LIVE".equals(string)) {
                mediaInfo.a = 2;
            } else {
                mediaInfo.a = -1;
            }
        }
        mediaInfo.f = jSONObject2.optString("contentType", null);
        String str2 = "metadata";
        if (jSONObject2.has(str2)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(str2);
            mediaInfo.b = new boc(jSONObject3.getInt("metadataType"));
            mediaInfo.b.a(jSONObject3);
        }
        mediaInfo.c = -1;
        String str3 = "duration";
        if (jSONObject2.has(str3) && !jSONObject2.isNull(str3)) {
            double optDouble = jSONObject2.optDouble(str3, 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                mediaInfo.c = (long) (optDouble * 1000.0d);
            }
        }
        String str4 = "tracks";
        if (jSONObject2.has(str4)) {
            mediaInfo.g = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray(str4);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                mediaInfo.g.add(new MediaTrack(jSONArray.getJSONObject(i2)));
            }
        } else {
            mediaInfo.g = null;
        }
        String str5 = "textTrackStyle";
        String str6 = "customData";
        if (jSONObject2.has(str5)) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject(str5);
            boi boi = new boi();
            boi.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            boi.b = boi.a(jSONObject4.optString("foregroundColor"));
            boi.c = boi.a(jSONObject4.optString("backgroundColor"));
            String str7 = "edgeType";
            if (jSONObject4.has(str7)) {
                String string2 = jSONObject4.getString(str7);
                if (str.equals(string2)) {
                    boi.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    boi.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    boi.d = 2;
                } else if ("RAISED".equals(string2)) {
                    boi.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    boi.d = 4;
                }
            }
            boi.e = boi.a(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if (str.equals(string3)) {
                    boi.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    boi.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    boi.f = 2;
                }
            }
            boi.g = boi.a(jSONObject4.optString("windowColor"));
            if (boi.f == 2) {
                boi.h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            boi.i = jSONObject4.optString("fontFamily", null);
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    boi.j = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    boi.j = 1;
                } else if ("SERIF".equals(string4)) {
                    boi.j = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    boi.j = 3;
                } else if ("CASUAL".equals(string4)) {
                    boi.j = 4;
                } else if ("CURSIVE".equals(string4)) {
                    boi.j = 5;
                } else if ("SMALL_CAPITALS".equals(string4)) {
                    boi.j = 6;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    boi.k = 0;
                } else if ("BOLD".equals(string5)) {
                    boi.k = 1;
                } else if ("ITALIC".equals(string5)) {
                    boi.k = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    boi.k = 3;
                }
            }
            boi.l = jSONObject4.optJSONObject(str6);
            mediaInfo.h = boi;
        } else {
            mediaInfo.h = null;
        }
        a(jSONObject);
        mediaInfo.n = jSONObject2.optJSONObject(str6);
        if (jSONObject2.has("entity")) {
            mediaInfo.k = jSONObject2.getString("entity");
        }
        mediaInfo.l = boj.a(jSONObject2.optJSONObject("vmapAdsRequest"));
        if (eik.b) {
            String str8 = "startAbsoluteTime";
            if (jSONObject2.has(str8) && !jSONObject2.isNull(str8)) {
                double optDouble2 = jSONObject2.optDouble(str8);
                if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                    mediaInfo.m = (long) (optDouble2 * 1000.0d);
                }
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        String str = "breaks";
        int i2 = 0;
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            this.d = new ArrayList(jSONArray.length());
            int i3 = 0;
            while (true) {
                if (i3 >= jSONArray.length()) {
                    break;
                }
                bnv a2 = bnv.a(jSONArray.getJSONObject(i3));
                if (a2 == null) {
                    this.d.clear();
                    break;
                } else {
                    this.d.add(a2);
                    i3++;
                }
            }
        }
        String str2 = "breakClips";
        if (jSONObject.has(str2)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
            this.j = new ArrayList(jSONArray2.length());
            while (i2 < jSONArray2.length()) {
                bnu a3 = bnu.a(jSONArray2.getJSONObject(i2));
                if (a3 != null) {
                    this.j.add(a3);
                    i2++;
                } else {
                    this.j.clear();
                    return;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if ((this.n == null) != (mediaInfo.n == null)) {
            return false;
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            JSONObject jSONObject2 = mediaInfo.n;
            if (jSONObject2 != null && !cae.a(jSONObject, jSONObject2)) {
                return false;
            }
        }
        return eic.a(this.e, mediaInfo.e) && this.a == mediaInfo.a && eic.a(this.f, mediaInfo.f) && eic.a(this.b, mediaInfo.b) && this.c == mediaInfo.c && eic.a(this.g, mediaInfo.g) && eic.a(this.h, mediaInfo.h) && eic.a(this.d, mediaInfo.d) && eic.a(this.j, mediaInfo.j) && eic.a(this.k, mediaInfo.k) && eic.a(this.l, mediaInfo.l) && this.m == mediaInfo.m;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Integer.valueOf(this.a), this.f, this.b, Long.valueOf(this.c), String.valueOf(this.n), this.g, this.h, this.d, this.j, this.k, this.l, Long.valueOf(this.m)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.n;
        List list = null;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.e, false);
        bxx.b(parcel, 3, this.a);
        bxx.a(parcel, 4, this.f, false);
        bxx.a(parcel, 5, (Parcelable) this.b, i2, false);
        bxx.a(parcel, 6, this.c);
        bxx.b(parcel, 7, this.g, false);
        bxx.a(parcel, 8, (Parcelable) this.h, i2, false);
        bxx.a(parcel, 9, this.i, false);
        List<bnv> list2 = this.d;
        bxx.b(parcel, 10, list2 == null ? null : Collections.unmodifiableList(list2), false);
        List<bnu> list3 = this.j;
        if (list3 != null) {
            list = Collections.unmodifiableList(list3);
        }
        bxx.b(parcel, 11, list, false);
        bxx.a(parcel, 12, this.k, false);
        bxx.a(parcel, 13, (Parcelable) this.l, i2, false);
        bxx.a(parcel, 14, this.m);
        bxx.b(parcel, a2);
    }
}
