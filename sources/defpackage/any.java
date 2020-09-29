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

/* renamed from: any reason: default package */
public class any {
    private static final Set<String> a = Collections.unmodifiableSet(new LoginManager$2());
    private static volatile any e;
    public LoginBehavior b = LoginBehavior.NATIVE_WITH_FALLBACK;
    public DefaultAudience c = DefaultAudience.FRIENDS;
    public String d = "rerequest";
    private final SharedPreferences f;

    /* renamed from: any$a */
    static class a implements aod {
        private final Activity a;

        a(Activity activity) {
            anl.a((Object) activity, "activity");
            this.a = activity;
        }

        public final Activity a() {
            return this.a;
        }

        public final void a(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: any$b */
    static class b implements aod {
        private final amw a;

        b(amw amw) {
            anl.a((Object) amw, "fragment");
            this.a = amw;
        }

        public final Activity a() {
            return this.a.a();
        }

        public final void a(Intent intent, int i) {
            this.a.a(intent, i);
        }
    }

    /* renamed from: any$c */
    static class c {
        private static anx a;

        static synchronized anx a(Context context) {
            synchronized (c.class) {
                if (context == null) {
                    context = akq.g();
                }
                if (context == null) {
                    return null;
                }
                if (a == null) {
                    a = new anx(context, akq.k());
                }
                anx anx = a;
                return anx;
            }
        }
    }

    any() {
        anl.a();
        this.f = akq.g().getSharedPreferences("com.facebook.loginManager", 0);
    }

    private static aoa a(com.facebook.login.LoginClient.c cVar, aki aki) {
        Set<String> set = cVar.b;
        HashSet hashSet = new HashSet(aki.b);
        if (cVar.f) {
            hashSet.retainAll(set);
        }
        HashSet hashSet2 = new HashSet(set);
        hashSet2.removeAll(hashSet);
        return new aoa(aki, hashSet, hashSet2);
    }

    private void a(aki aki, com.facebook.login.LoginClient.c cVar, FacebookException facebookException, boolean z, ako<aoa> ako) {
        if (aki != null) {
            aki.a(aki);
            akw.b();
        }
        if (ako != null) {
            aoa a2 = aki != null ? a(cVar, aki) : null;
            if (z || (a2 != null && a2.a.size() == 0)) {
                ako.a();
            } else if (facebookException != null) {
                ako.a(facebookException);
            } else if (aki != null) {
                a(true);
                ako.a(a2);
            }
        }
    }

    private void a(amw amw, Collection<String> collection) {
        a((aod) new b(amw), a(collection));
    }

    private static void a(Context context, Code code, Map<String, String> map, Exception exc, boolean z, com.facebook.login.LoginClient.c cVar) {
        anx a2 = c.a(context);
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

    private static void a(Context context, com.facebook.login.LoginClient.c cVar) {
        anx a2 = c.a(context);
        if (a2 != null && cVar != null) {
            a2.a(cVar);
        }
    }

    private void a(aod aod, com.facebook.login.LoginClient.c cVar) {
        a((Context) aod.a(), cVar);
        CallbackManagerImpl.a(RequestCodeOffset.Login.a(), new com.facebook.internal.CallbackManagerImpl.a() {
            public final boolean a(int i, Intent intent) {
                return any.this.a(i, intent, null);
            }
        });
        if (!b(aod, cVar)) {
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            a(aod.a(), Code.ERROR, null, facebookException, false, cVar);
            throw facebookException;
        }
    }

    private void a(boolean z) {
        Editor edit = this.f.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    public static boolean a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || a.contains(str));
    }

    public static any b() {
        if (e == null) {
            synchronized (any.class) {
                if (e == null) {
                    e = new any();
                }
            }
        }
        return e;
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

    private boolean b(aod aod, com.facebook.login.LoginClient.c cVar) {
        Intent intent = new Intent();
        intent.setClass(akq.g(), FacebookActivity.class);
        intent.setAction(cVar.a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", cVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (!(akq.g().getPackageManager().resolveActivity(intent, 0) != null)) {
            return false;
        }
        try {
            aod.a(intent, LoginClient.a());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
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
        com.facebook.login.LoginClient.c cVar = new com.facebook.login.LoginClient.c(loginBehavior, Collections.unmodifiableSet(hashSet), this.c, this.d, akq.k(), UUID.randomUUID().toString());
        cVar.f = aki.b();
        return cVar;
    }

    public final void a(akm akm, final ako<aoa> ako) {
        if (akm instanceof CallbackManagerImpl) {
            CallbackManagerImpl callbackManagerImpl = (CallbackManagerImpl) akm;
            int a2 = RequestCodeOffset.Login.a();
            AnonymousClass1 r1 = new com.facebook.internal.CallbackManagerImpl.a() {
                public final boolean a(int i, Intent intent) {
                    return any.this.a(i, intent, ako);
                }
            };
            anl.a((Object) r1, "callback");
            callbackManagerImpl.a.put(Integer.valueOf(a2), r1);
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    public final void a(Activity activity, Collection<String> collection) {
        b(collection);
        c(activity, collection);
    }

    public final void a(Fragment fragment, Collection<String> collection) {
        amw amw = new amw(fragment);
        b(collection);
        a(amw, collection);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i, Intent intent, ako<aoa> ako) {
        Map map;
        Code code;
        boolean z;
        aki aki;
        com.facebook.login.LoginClient.c cVar;
        com.facebook.login.LoginClient.c cVar2;
        Map map2;
        aki aki2;
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
                        aki2 = result.b;
                    } else {
                        facebookException = new FacebookAuthorizationException(result.c);
                        aki2 = null;
                    }
                } else if (i2 == 0) {
                    aki2 = null;
                    z2 = true;
                } else {
                    aki2 = null;
                }
                map2 = result.f;
                Code code4 = code3;
                cVar2 = cVar3;
                code2 = code4;
            } else {
                aki2 = null;
                map2 = null;
                cVar2 = null;
            }
            map = map2;
            code = code2;
            z = z2;
            com.facebook.login.LoginClient.c cVar4 = cVar2;
            aki = aki2;
            cVar = cVar4;
        } else if (i2 == 0) {
            code = Code.CANCEL;
            cVar = null;
            aki = null;
            map = null;
            z = true;
        } else {
            code = code2;
            cVar = null;
            aki = null;
            map = null;
            z = false;
        }
        if (facebookException == null && aki == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, code, map, facebookException, true, cVar);
        a(aki, cVar, facebookException, z, ako);
        return true;
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

    public final void c() {
        aki.a((aki) null);
        akw.a(null);
        a(false);
    }

    public final void c(Activity activity, Collection<String> collection) {
        a((aod) new a(activity), a(collection));
    }
}
