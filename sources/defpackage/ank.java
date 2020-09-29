package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.Result.Code;
import com.facebook.login.LoginManager$2;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: ank reason: default package */
public class ank {
    private static final Set<String> a = Collections.unmodifiableSet(new LoginManager$2());
    private static volatile ank e;
    public LoginBehavior b = LoginBehavior.NATIVE_WITH_FALLBACK;
    public DefaultAudience c = DefaultAudience.FRIENDS;
    public String d = "rerequest";
    private final SharedPreferences f;

    /* renamed from: ank$a */
    static class a implements anp {
        private final Activity a;

        a(Activity activity) {
            amx.a((Object) activity, "activity");
            this.a = activity;
        }

        public final void a(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }

        public final Activity a() {
            return this.a;
        }
    }

    /* renamed from: ank$b */
    static class b implements anp {
        private final ami a;

        b(ami ami) {
            amx.a((Object) ami, "fragment");
            this.a = ami;
        }

        public final void a(Intent intent, int i) {
            this.a.a(intent, i);
        }

        public final Activity a() {
            return this.a.a();
        }
    }

    /* renamed from: ank$c */
    static class c {
        private static anj a;

        static synchronized anj a(Context context) {
            synchronized (c.class) {
                if (context == null) {
                    context = akc.g();
                }
                if (context == null) {
                    return null;
                }
                if (a == null) {
                    a = new anj(context, akc.k());
                }
                anj anj = a;
                return anj;
            }
        }
    }

    ank() {
        amx.a();
        this.f = akc.g().getSharedPreferences("com.facebook.loginManager", 0);
    }

    public static ank b() {
        if (e == null) {
            synchronized (ank.class) {
                if (e == null) {
                    e = new ank();
                }
            }
        }
        return e;
    }

    public final void a(ajy ajy, final aka<anm> aka) {
        if (ajy instanceof CallbackManagerImpl) {
            CallbackManagerImpl callbackManagerImpl = (CallbackManagerImpl) ajy;
            int a2 = RequestCodeOffset.Login.a();
            AnonymousClass1 r1 = new com.facebook.internal.CallbackManagerImpl.a() {
                public final boolean a(int i, Intent intent) {
                    return ank.this.a(i, intent, aka);
                }
            };
            amx.a((Object) r1, "callback");
            callbackManagerImpl.a.put(Integer.valueOf(a2), r1);
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i, Intent intent, aka<anm> aka) {
        Map map;
        Code code;
        boolean z;
        aju aju;
        com.facebook.login.LoginClient.c cVar;
        com.facebook.login.LoginClient.c cVar2;
        Map map2;
        aju aju2;
        int i2 = i;
        Intent intent2 = intent;
        Code code2 = Code.ERROR;
        FacebookException facebookException = null;
        boolean z2 = false;
        if (intent2 != null) {
            Result result = (Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                com.facebook.login.LoginClient.c cVar3 = result.e;
                Code code3 = result.a;
                if (i2 == -1) {
                    if (result.a == Code.SUCCESS) {
                        aju2 = result.b;
                    } else {
                        facebookException = new FacebookAuthorizationException(result.c);
                        aju2 = null;
                    }
                } else if (i2 == 0) {
                    aju2 = null;
                    z2 = true;
                } else {
                    aju2 = null;
                }
                map2 = result.f;
                Code code4 = code3;
                cVar2 = cVar3;
                code2 = code4;
            } else {
                aju2 = null;
                map2 = null;
                cVar2 = null;
            }
            map = map2;
            code = code2;
            z = z2;
            com.facebook.login.LoginClient.c cVar4 = cVar2;
            aju = aju2;
            cVar = cVar4;
        } else if (i2 == 0) {
            code = Code.CANCEL;
            cVar = null;
            aju = null;
            map = null;
            z = true;
        } else {
            code = code2;
            cVar = null;
            aju = null;
            map = null;
            z = false;
        }
        if (facebookException == null && aju == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, code, map, facebookException, true, cVar);
        a(aju, cVar, facebookException, z, aka);
        return true;
    }

    public final void c() {
        aju.a((aju) null);
        aki.a(null);
        a(false);
    }

    public final void a(Fragment fragment, Collection<String> collection) {
        ami ami = new ami(fragment);
        b(collection);
        a(ami, collection);
    }

    public final void a(Activity activity, Collection<String> collection) {
        b(collection);
        c(activity, collection);
    }

    private void a(ami ami, Collection<String> collection) {
        a((anp) new b(ami), a(collection));
    }

    public final void c(Activity activity, Collection<String> collection) {
        a((anp) new a(activity), a(collection));
    }

    private static void b(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (a(str)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{str}));
                }
            }
        }
    }

    public static boolean a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || a.contains(str));
    }

    /* access modifiers changed from: protected */
    public com.facebook.login.LoginClient.c a(Collection<String> collection) {
        HashSet hashSet;
        LoginBehavior loginBehavior = this.b;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        com.facebook.login.LoginClient.c cVar = new com.facebook.login.LoginClient.c(loginBehavior, Collections.unmodifiableSet(hashSet), this.c, this.d, akc.k(), UUID.randomUUID().toString());
        cVar.f = aju.b();
        return cVar;
    }

    private void a(anp anp, com.facebook.login.LoginClient.c cVar) {
        a((Context) anp.a(), cVar);
        CallbackManagerImpl.a(RequestCodeOffset.Login.a(), new com.facebook.internal.CallbackManagerImpl.a() {
            public final boolean a(int i, Intent intent) {
                return ank.this.a(i, intent, null);
            }
        });
        if (!b(anp, cVar)) {
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            a(anp.a(), Code.ERROR, null, facebookException, false, cVar);
            throw facebookException;
        }
    }

    private void a(aju aju, com.facebook.login.LoginClient.c cVar, FacebookException facebookException, boolean z, aka<anm> aka) {
        anm anm;
        if (aju != null) {
            aju.a(aju);
            aki.b();
        }
        if (aka != null) {
            if (aju != null) {
                anm = a(cVar, aju);
            } else {
                anm = null;
            }
            if (z || (anm != null && anm.a.size() == 0)) {
                aka.a();
            } else if (facebookException != null) {
                aka.a(facebookException);
            } else if (aju != null) {
                a(true);
                aka.a(anm);
            }
        }
    }

    private void a(boolean z) {
        Editor edit = this.f.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    public final void b(Activity activity, Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (!a(str)) {
                    throw new FacebookException(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[]{str}));
                }
            }
        }
        c(activity, collection);
    }

    private static void a(Context context, com.facebook.login.LoginClient.c cVar) {
        anj a2 = c.a(context);
        if (a2 != null && cVar != null) {
            a2.a(cVar);
        }
    }

    private static void a(Context context, Code code, Map<String, String> map, Exception exc, boolean z, com.facebook.login.LoginClient.c cVar) {
        anj a2 = c.a(context);
        if (a2 != null) {
            if (cVar == null) {
                a2.c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("try_login_activity", z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            a2.a(cVar.e, hashMap, code, map, exc);
        }
    }

    private boolean b(anp anp, com.facebook.login.LoginClient.c cVar) {
        Intent intent = new Intent();
        intent.setClass(akc.g(), FacebookActivity.class);
        intent.setAction(cVar.a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", cVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (!(akc.g().getPackageManager().resolveActivity(intent, 0) != null)) {
            return false;
        }
        try {
            anp.a(intent, LoginClient.a());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private static anm a(com.facebook.login.LoginClient.c cVar, aju aju) {
        Set<String> set = cVar.b;
        HashSet hashSet = new HashSet(aju.b);
        if (cVar.f) {
            hashSet.retainAll(set);
        }
        HashSet hashSet2 = new HashSet(set);
        hashSet2.removeAll(hashSet);
        return new anm(aju, hashSet, hashSet2);
    }
}
