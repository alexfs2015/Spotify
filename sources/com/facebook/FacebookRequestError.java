package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.FetchedAppSettingsManager;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Creator<FacebookRequestError> CREATOR = new Creator<FacebookRequestError>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    };
    private static a g = new a(200, 299, 0);
    final int a;
    public final int b;
    public final int c;
    final String d;
    public final JSONObject e;
    public final FacebookException f;
    private final Category h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final JSONObject m;
    private final Object n;
    private final HttpURLConnection o;

    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    static class a {
        final int a;
        final int b;

        private a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        /* synthetic */ a(int i, int i2, byte b2) {
            this(200, 299);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private FacebookRequestError(int r1, int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, org.json.JSONObject r9, org.json.JSONObject r10, java.lang.Object r11, java.net.HttpURLConnection r12, com.facebook.FacebookException r13) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.i = r5
            r0.m = r9
            r0.e = r10
            r0.n = r11
            r0.o = r12
            r0.j = r6
            r0.k = r7
            r1 = 1
            if (r13 == 0) goto L_0x0020
            r0.f = r13
            r4 = 1
            goto L_0x0028
        L_0x0020:
            com.facebook.FacebookServiceException r4 = new com.facebook.FacebookServiceException
            r4.<init>(r0, r5)
            r0.f = r4
            r4 = 0
        L_0x0028:
            amq r5 = b()
            if (r4 != 0) goto L_0x00b5
            if (r8 == 0) goto L_0x0034
            com.facebook.FacebookRequestError$Category r2 = com.facebook.FacebookRequestError.Category.TRANSIENT
            goto L_0x00b7
        L_0x0034:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.a
            if (r4 == 0) goto L_0x005f
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r6)
            if (r4 == 0) goto L_0x005f
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.get(r6)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x005c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x005f
        L_0x005c:
            com.facebook.FacebookRequestError$Category r2 = com.facebook.FacebookRequestError.Category.OTHER
            goto L_0x00b7
        L_0x005f:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.c
            if (r4 == 0) goto L_0x008a
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r6)
            if (r4 == 0) goto L_0x008a
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.get(r6)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x0087
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x008a
        L_0x0087:
            com.facebook.FacebookRequestError$Category r2 = com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE
            goto L_0x00b7
        L_0x008a:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.b
            if (r4 == 0) goto L_0x00b5
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r6)
            if (r4 == 0) goto L_0x00b5
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r5.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x00b2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x00b5
        L_0x00b2:
            com.facebook.FacebookRequestError$Category r2 = com.facebook.FacebookRequestError.Category.TRANSIENT
            goto L_0x00b7
        L_0x00b5:
            com.facebook.FacebookRequestError$Category r2 = com.facebook.FacebookRequestError.Category.OTHER
        L_0x00b7:
            r0.h = r2
            com.facebook.FacebookRequestError$Category r2 = r0.h
            int[] r3 = defpackage.amq.AnonymousClass1.a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r1) goto L_0x00d3
            r1 = 2
            if (r2 == r1) goto L_0x00d0
            r1 = 3
            if (r2 == r1) goto L_0x00cd
            r1 = 0
            goto L_0x00d5
        L_0x00cd:
            java.lang.String r1 = r5.e
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r1 = r5.f
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r1 = r5.d
        L_0x00d5:
            r0.l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.json.JSONObject, org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection, com.facebook.FacebookException):void");
    }

    public FacebookRequestError(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, byte b2) {
        this(parcel);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        Exception exc2 = exc;
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc2 instanceof FacebookException ? (FacebookException) exc2 : new FacebookException((Throwable) exc2));
    }

    public static FacebookRequestError a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        int i3;
        boolean z2;
        JSONObject jSONObject2 = jSONObject;
        String str5 = "error_code";
        String str6 = LogMessage.SEVERITY_ERROR;
        String str7 = "FACEBOOK_NON_JSON_RESULT";
        String str8 = "body";
        String str9 = "code";
        try {
            if (jSONObject2.has(str9)) {
                int i4 = jSONObject2.getInt(str9);
                Object a2 = ank.a(jSONObject2, str8, str7);
                boolean z3 = true;
                if (a2 != null && (a2 instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a2;
                    String str10 = "error_subcode";
                    if (jSONObject3.has(str6)) {
                        JSONObject jSONObject4 = (JSONObject) ank.a(jSONObject3, str6, (String) null);
                        String optString = jSONObject4.optString(MoatAdEvent.EVENT_TYPE, null);
                        String optString2 = jSONObject4.optString("message", null);
                        i3 = jSONObject4.optInt(str9, -1);
                        int optInt = jSONObject4.optInt(str10, -1);
                        String optString3 = jSONObject4.optString("error_user_msg", null);
                        str2 = jSONObject4.optString("error_user_title", null);
                        z = jSONObject4.optBoolean("is_transient", false);
                        str = optString3;
                        z2 = true;
                        str3 = optString2;
                        i2 = optInt;
                        str4 = optString;
                    } else {
                        String str11 = "error_msg";
                        String str12 = "error_reason";
                        if (!jSONObject3.has(str5)) {
                            if (!jSONObject3.has(str11)) {
                                if (!jSONObject3.has(str12)) {
                                    str4 = null;
                                    str3 = null;
                                    str2 = null;
                                    str = null;
                                    z2 = false;
                                    i3 = 0;
                                    i2 = 0;
                                    z = false;
                                }
                            }
                        }
                        String optString4 = jSONObject3.optString(str12, null);
                        String optString5 = jSONObject3.optString(str11, null);
                        int optInt2 = jSONObject3.optInt(str5, -1);
                        i2 = jSONObject3.optInt(str10, -1);
                        str4 = optString4;
                        str3 = optString5;
                        str2 = null;
                        str = null;
                        z = false;
                        i3 = optInt2;
                        z2 = true;
                    }
                    if (z2) {
                        FacebookRequestError facebookRequestError = new FacebookRequestError(i4, i3, i2, str4, str3, str2, str, z, jSONObject3, jSONObject, obj, httpURLConnection, null);
                        return facebookRequestError;
                    }
                }
                a aVar = g;
                if (aVar.a > i4 || i4 > aVar.b) {
                    z3 = false;
                }
                if (!z3) {
                    FacebookRequestError facebookRequestError2 = new FacebookRequestError(i4, -1, -1, null, null, null, null, false, jSONObject2.has(str8) ? (JSONObject) ank.a(jSONObject2, str8, str7) : null, jSONObject, obj, httpURLConnection, null);
                    return facebookRequestError2;
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private static synchronized amq b() {
        synchronized (FacebookRequestError.class) {
            amu a2 = FetchedAppSettingsManager.a(akq.k());
            if (a2 == null) {
                amq a3 = amq.a();
                return a3;
            }
            amq amq = a2.h;
            return amq;
        }
    }

    public final String a() {
        String str = this.i;
        return str != null ? str : this.f.getLocalizedMessage();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.a);
        sb.append(", errorCode: ");
        sb.append(this.b);
        sb.append(", subErrorCode: ");
        sb.append(this.c);
        sb.append(", errorType: ");
        sb.append(this.d);
        sb.append(", errorMessage: ");
        sb.append(a());
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
    }
}
