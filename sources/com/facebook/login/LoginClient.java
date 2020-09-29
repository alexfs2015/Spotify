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
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LoginClient[i];
        }
    };
    public int a = -1;
    public Fragment b;
    public b c;
    public a d;
    public c e;
    private anz[] f;
    private boolean g;
    private Map<String, String> h;
    private Map<String, String> i;
    private anx j;

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new Creator<Result>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Result(parcel, 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Result[i];
            }
        };
        public final Code a;
        public final aki b;
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

        private Result(Parcel parcel) {
            this.a = Code.valueOf(parcel.readString());
            this.b = (aki) parcel.readParcelable(aki.class.getClassLoader());
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = (c) parcel.readParcelable(c.class.getClassLoader());
            this.f = ank.a(parcel);
            this.g = ank.a(parcel);
        }

        /* synthetic */ Result(Parcel parcel, byte b2) {
            this(parcel);
        }

        private Result(c cVar, Code code, aki aki, String str, String str2) {
            anl.a((Object) code, "code");
            this.e = cVar;
            this.b = aki;
            this.c = str;
            this.a = code;
            this.d = str2;
        }

        public static Result a(c cVar, aki aki) {
            Result result = new Result(cVar, Code.SUCCESS, aki, null, null);
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
            Result result = new Result(cVar2, Code.ERROR, null, TextUtils.join(": ", ank.b((T[]) strArr)), str3);
            return result;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a.name());
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
            ank.a(parcel, this.f);
            ank.a(parcel, this.g);
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
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
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
                if (any.a(a2)) {
                    return true;
                }
            }
            return false;
        }

        public int describeContents() {
            return 0;
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

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(anz.class.getClassLoader());
        this.f = new anz[readParcelableArray.length];
        for (int i2 = 0; i2 < readParcelableArray.length; i2++) {
            anz[] anzArr = this.f;
            anzArr[i2] = (anz) readParcelableArray[i2];
            anzArr[i2].a(this);
        }
        this.a = parcel.readInt();
        this.e = (c) parcel.readParcelable(c.class.getClassLoader());
        this.h = ank.a(parcel);
        this.i = ank.a(parcel);
    }

    public LoginClient(Fragment fragment) {
        this.b = fragment;
    }

    public static int a() {
        return RequestCodeOffset.Login.a();
    }

    private int a(String str) {
        return this.b.p().checkCallingOrSelfPermission(str);
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

    private void c(Result result) {
        Result result2;
        if (result.b != null) {
            aki a2 = aki.a();
            aki aki = result.b;
            if (!(a2 == null || aki == null)) {
                try {
                    if (a2.i.equals(aki.i)) {
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

    private void d(Result result) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(result);
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

    private boolean f() {
        if (this.g) {
            return true;
        }
        if (a("android.permission.INTERNET") != 0) {
            kf p = this.b.p();
            b(Result.a(this.e, p.getString(R.string.com_facebook_internet_permission_error_title), p.getString(R.string.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.g = true;
        return true;
    }

    private void g() {
        b(Result.a(this.e, "Login attempt failed.", null));
    }

    private boolean h() {
        anz b2 = b();
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

    private anx i() {
        anx anx = this.j;
        if (anx == null || !anx.a.equals(this.e.d)) {
            this.j = new anx(this.b.p(), this.e.d);
        }
        return this.j;
    }

    public final void a(Result result) {
        if (result.b == null || !aki.b()) {
            b(result);
        } else {
            c(result);
        }
    }

    public final void a(c cVar) {
        if (!(this.e != null && this.a >= 0) && cVar != null) {
            if (this.e != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!aki.b() || f()) {
                this.e = cVar;
                ArrayList arrayList = new ArrayList();
                LoginBehavior loginBehavior = cVar.a;
                if (loginBehavior.allowsGetTokenAuth) {
                    arrayList.add(new anu(this));
                }
                if (loginBehavior.allowsKatanaAuth) {
                    arrayList.add(new anv(this));
                }
                if (loginBehavior.allowsFacebookLiteAuth) {
                    arrayList.add(new ans(this));
                }
                if (loginBehavior.allowsCustomTabAuth) {
                    arrayList.add(new ano(this));
                }
                if (loginBehavior.allowsWebViewAuth) {
                    arrayList.add(new aof(this));
                }
                if (loginBehavior.allowsDeviceAuth) {
                    arrayList.add(new anq(this));
                }
                anz[] anzArr = new anz[arrayList.size()];
                arrayList.toArray(anzArr);
                this.f = anzArr;
                c();
            }
        }
    }

    public final anz b() {
        int i2 = this.a;
        if (i2 >= 0) {
            return this.f[i2];
        }
        return null;
    }

    public final void b(Result result) {
        anz b2 = b();
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

    public final void c() {
        if (this.a >= 0) {
            a(b().a(), "skipped", null, null, b().a);
        }
        do {
            anz[] anzArr = this.f;
            if (anzArr != null) {
                int i2 = this.a;
                if (i2 < anzArr.length - 1) {
                    this.a = i2 + 1;
                }
            }
            if (this.e != null) {
                g();
            }
            return;
        } while (!h());
    }

    public final void d() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelableArray(this.f, i2);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.e, i2);
        ank.a(parcel, this.h);
        ank.a(parcel, this.i);
    }
}
