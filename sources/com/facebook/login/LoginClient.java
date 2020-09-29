package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR = new Creator<LoginClient>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LoginClient[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }
    };
    public int a = -1;
    public Fragment b;
    public b c;
    public a d;
    public c e;
    private anl[] f;
    private boolean g;
    private Map<String, String> h;
    private Map<String, String> i;
    private anj j;

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new Creator<Result>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Result[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Result(parcel, 0);
            }
        };
        public final Code a;
        public final aju b;
        public final String c;
        final String d;
        public final c e;
        public Map<String, String> f;
        public Map<String, String> g;

        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR(LogMessage.SEVERITY_ERROR);
            
            public final String loggingValue;

            private Code(String str) {
                this.loggingValue = str;
            }
        }

        public final int describeContents() {
            return 0;
        }

        /* synthetic */ Result(Parcel parcel, byte b2) {
            this(parcel);
        }

        private Result(c cVar, Code code, aju aju, String str, String str2) {
            amx.a((Object) code, "code");
            this.e = cVar;
            this.b = aju;
            this.c = str;
            this.a = code;
            this.d = str2;
        }

        public static Result a(c cVar, aju aju) {
            Result result = new Result(cVar, Code.SUCCESS, aju, null, null);
            return result;
        }

        public static Result a(c cVar, String str) {
            Result result = new Result(cVar, Code.CANCEL, null, str, null);
            return result;
        }

        public static Result a(c cVar, String str, String str2) {
            return a(cVar, str, str2, null);
        }

        public static Result a(c cVar, String str, String str2, String str3) {
            String[] strArr = {str, str2};
            c cVar2 = cVar;
            Result result = new Result(cVar2, Code.ERROR, null, TextUtils.join(": ", amw.b((T[]) strArr)), str3);
            return result;
        }

        private Result(Parcel parcel) {
            this.a = Code.valueOf(parcel.readString());
            this.b = (aju) parcel.readParcelable(aju.class.getClassLoader());
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = (c) parcel.readParcelable(c.class.getClassLoader());
            this.f = amw.a(parcel);
            this.g = amw.a(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a.name());
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
            amw.a(parcel, this.f);
            amw.a(parcel, this.g);
        }
    }

    public interface a {
        void a();

        void b();
    }

    public interface b {
        void a(Result result);
    }

    public static class c implements Parcelable {
        public static final Creator<c> CREATOR = new Creator<c>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, 0);
            }
        };
        public final LoginBehavior a;
        public Set<String> b;
        public final DefaultAudience c;
        public final String d;
        public final String e;
        public boolean f;
        public String g;
        public String h;
        public String i;

        public int describeContents() {
            return 0;
        }

        /* synthetic */ c(Parcel parcel, byte b2) {
            this(parcel);
        }

        public c(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3) {
            this.f = false;
            this.a = loginBehavior;
            if (set == null) {
                set = new HashSet<>();
            }
            this.b = set;
            this.c = defaultAudience;
            this.h = str;
            this.d = str2;
            this.e = str3;
        }

        public final boolean a() {
            for (String a2 : this.b) {
                if (ank.a(a2)) {
                    return true;
                }
            }
            return false;
        }

        private c(Parcel parcel) {
            boolean z = false;
            this.f = false;
            String readString = parcel.readString();
            DefaultAudience defaultAudience = null;
            this.a = readString != null ? LoginBehavior.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                defaultAudience = DefaultAudience.valueOf(readString2);
            }
            this.c = defaultAudience;
            this.d = parcel.readString();
            this.e = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            }
            this.f = z;
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            LoginBehavior loginBehavior = this.a;
            String str = null;
            parcel.writeString(loginBehavior != null ? loginBehavior.name() : null);
            parcel.writeStringList(new ArrayList(this.b));
            DefaultAudience defaultAudience = this.c;
            if (defaultAudience != null) {
                str = defaultAudience.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeByte(this.f ? (byte) 1 : 0);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public LoginClient(Fragment fragment) {
        this.b = fragment;
    }

    public static int a() {
        return RequestCodeOffset.Login.a();
    }

    public final anl b() {
        int i2 = this.a;
        if (i2 >= 0) {
            return this.f[i2];
        }
        return null;
    }

    private boolean f() {
        if (this.g) {
            return true;
        }
        if (a("android.permission.INTERNET") != 0) {
            ka p = this.b.p();
            b(Result.a(this.e, p.getString(R.string.com_facebook_internet_permission_error_title), p.getString(R.string.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.g = true;
        return true;
    }

    public final void c() {
        if (this.a >= 0) {
            a(b().a(), "skipped", null, null, b().a);
        }
        do {
            anl[] anlArr = this.f;
            if (anlArr != null) {
                int i2 = this.a;
                if (i2 < anlArr.length - 1) {
                    this.a = i2 + 1;
                }
            }
            if (this.e != null) {
                g();
            }
            return;
        } while (!h());
    }

    private void g() {
        b(Result.a(this.e, "Login attempt failed.", null));
    }

    private void a(String str, String str2, boolean z) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        if (this.h.containsKey(str) && z) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.h.get(str));
            sb.append(",");
            sb.append(str2);
            str2 = sb.toString();
        }
        this.h.put(str, str2);
    }

    private boolean h() {
        anl b2 = b();
        if (!b2.d() || f()) {
            boolean a2 = b2.a(this.e);
            if (a2) {
                i().a(this.e.e, b2.a());
            } else {
                i().b(this.e.e, b2.a());
                a("not_tried", b2.a(), true);
            }
            return a2;
        }
        a("no_internet_permission", "1", false);
        return false;
    }

    public final void a(Result result) {
        if (result.b == null || !aju.b()) {
            b(result);
        } else {
            c(result);
        }
    }

    public final void b(Result result) {
        anl b2 = b();
        if (b2 != null) {
            a(b2.a(), result, b2.a);
        }
        Map<String, String> map = this.h;
        if (map != null) {
            result.f = map;
        }
        Map<String, String> map2 = this.i;
        if (map2 != null) {
            result.g = map2;
        }
        this.f = null;
        this.a = -1;
        this.e = null;
        this.h = null;
        d(result);
    }

    private void c(Result result) {
        Result result2;
        if (result.b != null) {
            aju a2 = aju.a();
            aju aju = result.b;
            if (!(a2 == null || aju == null)) {
                try {
                    if (a2.i.equals(aju.i)) {
                        result2 = Result.a(this.e, result.b);
                        b(result2);
                        return;
                    }
                } catch (Exception e2) {
                    b(Result.a(this.e, "Caught exception", e2.getMessage()));
                    return;
                }
            }
            result2 = Result.a(this.e, "User logged in as different Facebook user.", null);
            b(result2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    private anj i() {
        anj anj = this.j;
        if (anj == null || !anj.a.equals(this.e.d)) {
            this.j = new anj(this.b.p(), this.e.d);
        }
        return this.j;
    }

    private void d(Result result) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(result);
        }
    }

    public final void d() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void a(String str, Result result, Map<String, String> map) {
        a(str, result.a.loggingValue, result.c, result.d, map);
    }

    private void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.e == null) {
            i().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            i().a(this.e.e, str, str2, str3, str4, map);
        }
    }

    public static String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(anl.class.getClassLoader());
        this.f = new anl[readParcelableArray.length];
        for (int i2 = 0; i2 < readParcelableArray.length; i2++) {
            anl[] anlArr = this.f;
            anlArr[i2] = (anl) readParcelableArray[i2];
            anlArr[i2].a(this);
        }
        this.a = parcel.readInt();
        this.e = (c) parcel.readParcelable(c.class.getClassLoader());
        this.h = amw.a(parcel);
        this.i = amw.a(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelableArray(this.f, i2);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.e, i2);
        amw.a(parcel, this.h);
        amw.a(parcel, this.i);
    }

    public final void a(c cVar) {
        if (!(this.e != null && this.a >= 0) && cVar != null) {
            if (this.e != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!aju.b() || f()) {
                this.e = cVar;
                ArrayList arrayList = new ArrayList();
                LoginBehavior loginBehavior = cVar.a;
                if (loginBehavior.allowsGetTokenAuth) {
                    arrayList.add(new ang(this));
                }
                if (loginBehavior.allowsKatanaAuth) {
                    arrayList.add(new anh(this));
                }
                if (loginBehavior.allowsFacebookLiteAuth) {
                    arrayList.add(new ane(this));
                }
                if (loginBehavior.allowsCustomTabAuth) {
                    arrayList.add(new ana(this));
                }
                if (loginBehavior.allowsWebViewAuth) {
                    arrayList.add(new anr(this));
                }
                if (loginBehavior.allowsDeviceAuth) {
                    arrayList.add(new anc(this));
                }
                anl[] anlArr = new anl[arrayList.size()];
                arrayList.toArray(anlArr);
                this.f = anlArr;
                c();
            }
        }
    }

    private int a(String str) {
        return this.b.p().checkCallingOrSelfPermission(str);
    }
}
