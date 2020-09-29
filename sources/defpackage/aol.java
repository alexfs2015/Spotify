package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.share.widget.LikeView.ObjectType;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: aol reason: default package */
public class aol {
    /* access modifiers changed from: private */
    public static final String c = aol.class.getSimpleName();
    /* access modifiers changed from: private */
    public static amv d;
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<String, aol> e = new ConcurrentHashMap<>();
    private static ann f = new ann(1);
    private static ann g = new ann(1);
    private static Handler h;
    private static String i;
    private static boolean j;
    /* access modifiers changed from: private */
    public static volatile int k;
    public boolean a;
    public boolean b;
    /* access modifiers changed from: private */
    public String l;
    /* access modifiers changed from: private */
    public ObjectType m;
    /* access modifiers changed from: private */
    public String n;
    /* access modifiers changed from: private */
    public String o;
    /* access modifiers changed from: private */
    public String p;
    /* access modifiers changed from: private */
    public String q;
    /* access modifiers changed from: private */
    public String r;
    /* access modifiers changed from: private */
    public String s;
    /* access modifiers changed from: private */
    public boolean t;
    /* access modifiers changed from: private */
    public boolean u;
    private Bundle v;
    private alk w;

    /* renamed from: aol$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[ObjectType.values().length];

        static {
            try {
                a[ObjectType.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: aol$a */
    abstract class a implements n {
        protected String a;
        protected ObjectType b;
        protected FacebookRequestError c;
        private akr d;

        protected a(String str, ObjectType objectType) {
            this.a = str;
            this.b = objectType;
        }

        public final FacebookRequestError a() {
            return this.c;
        }

        /* access modifiers changed from: protected */
        public final void a(akr akr) {
            this.d = akr;
            akr.g = akq.h();
            akr.a((defpackage.akr.b) new defpackage.akr.b() {
                public final void a(aku aku) {
                    a.this.c = aku.b;
                    if (a.this.c != null) {
                        a aVar = a.this;
                        aVar.a(aVar.c);
                        return;
                    }
                    a.this.a(aku);
                }
            });
        }

        public final void a(akt akt) {
            akt.add(this.d);
        }

        /* access modifiers changed from: protected */
        public abstract void a(aku aku);

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            and.a(LoggingBehavior.REQUESTS, aol.c, "Error running request for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
        }
    }

    /* renamed from: aol$b */
    static class b implements Runnable {
        private String a;
        private ObjectType b;
        private c c;

        b(String str, ObjectType objectType, c cVar) {
            this.a = str;
            this.b = objectType;
            this.c = cVar;
        }

        public final void run() {
            aol.b(this.a, this.b, this.c);
        }
    }

    @Deprecated
    /* renamed from: aol$c */
    public interface c {
        void a(aol aol, FacebookException facebookException);
    }

    /* renamed from: aol$d */
    class d extends a {
        String d = aol.this.n;
        String e = aol.this.o;
        String f = aol.this.p;
        String g = aol.this.q;

        d(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            a(new akr(aki.a(), str, bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(aku aku) {
            JSONObject b = ank.b(aku.a, "engagement");
            if (b != null) {
                this.d = b.optString("count_string_with_like", this.d);
                this.e = b.optString("count_string_without_like", this.e);
                this.f = b.optString("social_sentence_with_like", this.f);
                this.g = b.optString("social_sentence_without_like", this.g);
            }
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            and.a(LoggingBehavior.REQUESTS, aol.c, "Error fetching engagement for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
            aol.a(aol.this, "get_engagement", facebookRequestError);
        }
    }

    /* renamed from: aol$e */
    class e extends a {
        String d;

        e(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", str);
            a(new akr(aki.a(), "", bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(aku aku) {
            JSONObject b = ank.b(aku.a, this.a);
            if (b != null) {
                JSONObject optJSONObject = b.optJSONObject("og_object");
                if (optJSONObject != null) {
                    this.d = optJSONObject.optString("id");
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.a().contains("og_object")) {
                this.c = null;
                return;
            }
            and.a(LoggingBehavior.REQUESTS, aol.c, "Error getting the FB id for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
        }
    }

    /* renamed from: aol$f */
    class f extends a implements i {
        private boolean d = aol.this.a;
        private String e;
        private final String f;
        private final ObjectType g;

        f(String str, ObjectType objectType) {
            super(str, objectType);
            this.f = str;
            this.g = objectType;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString("object", this.f);
            a(new akr(aki.a(), "me/og.likes", bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(aku aku) {
            JSONArray c = ank.c(aku.a, "data");
            if (c != null) {
                for (int i = 0; i < c.length(); i++) {
                    JSONObject optJSONObject = c.optJSONObject(i);
                    if (optJSONObject != null) {
                        this.d = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("application");
                        aki a = aki.a();
                        if (optJSONObject2 != null && aki.b()) {
                            String str = "id";
                            if (ank.a(a.h, optJSONObject2.optString(str))) {
                                this.e = optJSONObject.optString(str);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            and.a(LoggingBehavior.REQUESTS, aol.c, "Error fetching like status for object '%s' with type '%s' : %s", this.f, this.g, facebookRequestError);
            aol.a(aol.this, "get_og_object_like", facebookRequestError);
        }

        public final boolean b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }
    }

    /* renamed from: aol$g */
    class g extends a {
        String d;
        boolean e;

        g(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            bundle.putString("ids", str);
            a(new akr(aki.a(), "", bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(aku aku) {
            JSONObject b = ank.b(aku.a, this.a);
            if (b != null) {
                this.d = b.optString("id");
                this.e = !ank.a(this.d);
            }
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            and.a(LoggingBehavior.REQUESTS, aol.c, "Error getting the FB id for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
        }
    }

    /* renamed from: aol$h */
    class h extends a implements i {
        private boolean d = aol.this.a;
        private String e;

        h(String str) {
            super(str, ObjectType.PAGE);
            this.e = str;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            aki a = aki.a();
            StringBuilder sb = new StringBuilder("me/likes/");
            sb.append(str);
            a(new akr(a, sb.toString(), bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(aku aku) {
            JSONArray c = ank.c(aku.a, "data");
            if (c != null && c.length() > 0) {
                this.d = true;
            }
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            and.a(LoggingBehavior.REQUESTS, aol.c, "Error fetching like status for page id '%s': %s", this.e, facebookRequestError);
            aol.a(aol.this, "get_page_like", facebookRequestError);
        }

        public final boolean b() {
            return this.d;
        }

        public final String c() {
            return null;
        }
    }

    /* renamed from: aol$i */
    interface i extends n {
        boolean b();

        String c();
    }

    /* renamed from: aol$j */
    static class j implements Runnable {
        private static ArrayList<String> a = new ArrayList<>();
        private String b;
        private boolean c;

        j(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        public final void run() {
            String str = this.b;
            if (str != null) {
                a.remove(str);
                a.add(0, this.b);
            }
            if (this.c && a.size() >= 128) {
                while (64 < a.size()) {
                    ArrayList<String> arrayList = a;
                    aol.e.remove((String) arrayList.remove(arrayList.size() - 1));
                }
            }
        }
    }

    /* renamed from: aol$k */
    class k extends a {
        String d;

        k(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("object", str);
            a(new akr(aki.a(), "me/og.likes", bundle, HttpMethod.POST));
        }

        /* access modifiers changed from: protected */
        public final void a(aku aku) {
            this.d = ank.a(aku.a, "id");
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.b == 3501) {
                this.c = null;
                return;
            }
            and.a(LoggingBehavior.REQUESTS, aol.c, "Error liking object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
            aol.a(aol.this, "publish_like", facebookRequestError);
        }
    }

    /* renamed from: aol$l */
    class l extends a {
        private String d;

        l(String str) {
            super(null, null);
            this.d = str;
            a(new akr(aki.a(), str, null, HttpMethod.DELETE));
        }

        /* access modifiers changed from: protected */
        public final void a(aku aku) {
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            and.a(LoggingBehavior.REQUESTS, aol.c, "Error unliking object with unlike token '%s' : %s", this.d, facebookRequestError);
            aol.a(aol.this, "publish_unlike", facebookRequestError);
        }
    }

    /* renamed from: aol$m */
    interface m {
        void a();
    }

    /* renamed from: aol$n */
    interface n {
        FacebookRequestError a();

        void a(akt akt);
    }

    /* renamed from: aol$o */
    static class o implements Runnable {
        private String a;
        private String b;

        o(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final void run() {
            aol.a(this.a, this.b);
        }
    }

    private aol(String str, ObjectType objectType) {
        this.l = str;
        this.m = objectType;
    }

    private static aol a(String str) {
        String d2 = d(str);
        aol aol = (aol) e.get(d2);
        if (aol != null) {
            f.a((Runnable) new j(d2, false), true);
        }
        return aol;
    }

    private void a(final Bundle bundle) {
        this.b = true;
        a((m) new m() {
            public final void a() {
                if (ank.a(aol.this.s)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                    aol.c(aol.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                    return;
                }
                akt akt = new akt();
                aol aol = aol.this;
                final k kVar = new k(aol.s, aol.this.m);
                kVar.a(akt);
                akt.a((defpackage.akt.a) new defpackage.akt.a() {
                    public final void a() {
                        aol.this.b = false;
                        if (kVar.a() != null) {
                            aol.this.b(false);
                            return;
                        }
                        aol.this.r = ank.a(kVar.d, (String) null);
                        aol.this.u = true;
                        aol.this.c().a("fb_like_control_did_like", (Double) null, bundle);
                        aol.a(aol.this, bundle);
                    }
                });
                akr.b(akt);
            }
        });
    }

    private static void a(final c cVar, final aol aol, final FacebookException facebookException) {
        if (cVar != null) {
            h.post(new Runnable() {
                public final void run() {
                    cVar.a(aol, facebookException);
                }
            });
        }
    }

    private void a(final m mVar) {
        if (!ank.a(this.s)) {
            mVar.a();
            return;
        }
        final e eVar = new e(this.l, this.m);
        final g gVar = new g(this.l, this.m);
        akt akt = new akt();
        eVar.a(akt);
        gVar.a(akt);
        akt.a((defpackage.akt.a) new defpackage.akt.a() {
            public final void a() {
                aol.this.s = eVar.d;
                if (ank.a(aol.this.s)) {
                    aol.this.s = gVar.d;
                    aol.this.t = gVar.e;
                }
                if (ank.a(aol.this.s)) {
                    and.a(LoggingBehavior.DEVELOPER_ERRORS, aol.c, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", aol.this.l);
                    aol.a(aol.this, "get_verified_id", gVar.a() != null ? gVar.a() : eVar.a());
                }
                m mVar = mVar;
                if (mVar != null) {
                    mVar.a();
                }
            }
        });
        akr.b(akt);
    }

    static /* synthetic */ void a(aol aol) {
        if (!aki.b()) {
            aop aop = new aop(akq.g(), akq.k(), aol.l);
            if (aop.a()) {
                aop.b = new defpackage.ang.a() {
                    public final void a(Bundle bundle) {
                        if (bundle != null) {
                            String str = "com.facebook.platform.extra.OBJECT_IS_LIKED";
                            if (bundle.containsKey(str)) {
                                boolean z = bundle.getBoolean(str);
                                String str2 = "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE";
                                String string = bundle.containsKey(str2) ? bundle.getString(str2) : aol.this.n;
                                String str3 = "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE";
                                String string2 = bundle.containsKey(str3) ? bundle.getString(str3) : aol.this.o;
                                String str4 = "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE";
                                String string3 = bundle.containsKey(str4) ? bundle.getString(str4) : aol.this.p;
                                String str5 = "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE";
                                String string4 = bundle.containsKey(str5) ? bundle.getString(str5) : aol.this.q;
                                String str6 = "com.facebook.platform.extra.UNLIKE_TOKEN";
                                aol.this.a(z, string, string2, string3, string4, bundle.containsKey(str6) ? bundle.getString(str6) : aol.this.r);
                            }
                        }
                    }
                };
            }
            return;
        }
        aol.a((m) new m() {
            public final void a() {
                final i iVar;
                if (AnonymousClass4.a[aol.this.m.ordinal()] != 1) {
                    aol aol = aol.this;
                    iVar = new f(aol.s, aol.this.m);
                } else {
                    aol aol2 = aol.this;
                    iVar = new h(aol2.s);
                }
                aol aol3 = aol.this;
                final d dVar = new d(aol3.s, aol.this.m);
                akt akt = new akt();
                iVar.a(akt);
                dVar.a(akt);
                akt.a((defpackage.akt.a) new defpackage.akt.a() {
                    public final void a() {
                        if (iVar.a() == null && dVar.a() == null) {
                            aol.this.a(iVar.b(), dVar.d, dVar.e, dVar.f, dVar.g, iVar.c());
                            return;
                        }
                        and.a(LoggingBehavior.REQUESTS, aol.c, "Unable to refresh like state for id: '%s'", aol.this.l);
                    }
                });
                akr.b(akt);
            }
        });
    }

    static /* synthetic */ void a(aol aol, int i2, int i3, Intent intent) {
        aow.a(i2, i3, intent, new aot(null, aol.v) {
            private /* synthetic */ Bundle a;

            {
                this.a = r3;
            }

            public final void a(amh amh) {
                a(amh, (FacebookException) new FacebookOperationCanceledException());
            }

            public final void a(amh amh, Bundle bundle) {
                String str;
                String str2;
                String str3;
                String str4;
                if (bundle != null) {
                    String str5 = "object_is_liked";
                    if (bundle.containsKey(str5)) {
                        boolean z = bundle.getBoolean(str5);
                        String b2 = aol.this.n;
                        String c = aol.this.o;
                        String str6 = "like_count_string";
                        if (bundle.containsKey(str6)) {
                            str2 = bundle.getString(str6);
                            str = str2;
                        } else {
                            str2 = b2;
                            str = c;
                        }
                        String d = aol.this.p;
                        String e = aol.this.q;
                        String str7 = "social_sentence";
                        if (bundle.containsKey(str7)) {
                            str4 = bundle.getString(str7);
                            str3 = str4;
                        } else {
                            str4 = d;
                            str3 = e;
                        }
                        String string = bundle.containsKey(str5) ? bundle.getString("unlike_token") : aol.this.r;
                        Bundle bundle2 = this.a;
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putString("call_id", amh.a.toString());
                        aol.this.c().b("fb_like_control_dialog_did_succeed", bundle2);
                        aol.this.a(z, str2, str, str4, str3, string);
                    }
                }
            }

            public final void a(amh amh, FacebookException facebookException) {
                and.a(LoggingBehavior.REQUESTS, aol.c, "Like Dialog failed with error : %s", facebookException);
                Bundle bundle = this.a;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("call_id", amh.a.toString());
                aol.this.a("present_dialog", bundle);
                aol.c(aol.this, "com.facebook.sdk.LikeActionController.DID_ERROR", anf.a(facebookException));
            }
        });
        aol.v = null;
        e((String) null);
    }

    static /* synthetic */ void a(aol aol, Bundle bundle) {
        boolean z = aol.a;
        if (z != aol.u && !aol.a(z, bundle)) {
            aol.b(!aol.a);
        }
    }

    private static void a(aol aol, ObjectType objectType, c cVar) {
        FacebookException facebookException;
        ObjectType a2 = aow.a(objectType, aol.m);
        if (a2 == null) {
            facebookException = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", aol.l, aol.m.toString(), objectType.toString());
            aol = null;
        } else {
            aol.m = a2;
            facebookException = null;
        }
        a(cVar, aol, facebookException);
    }

    static /* synthetic */ void a(aol aol, String str, FacebookRequestError facebookRequestError) {
        Bundle bundle = new Bundle();
        if (facebookRequestError != null) {
            JSONObject jSONObject = facebookRequestError.e;
            if (jSONObject != null) {
                bundle.putString(LogMessage.SEVERITY_ERROR, jSONObject.toString());
            }
        }
        aol.a(str, bundle);
    }

    /* access modifiers changed from: private */
    public void a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.l);
        bundle2.putString("object_type", this.m.toString());
        bundle2.putString("current_action", str);
        c().a("fb_like_control_error", (Double) null, bundle2);
    }

    @Deprecated
    public static void a(String str, ObjectType objectType, c cVar) {
        if (!j) {
            i();
        }
        aol a2 = a(str);
        if (a2 != null) {
            a(a2, objectType, cVar);
        } else {
            g.a((Runnable) new b(str, objectType, cVar), true);
        }
    }

    static /* synthetic */ void a(String str, String str2) {
        OutputStream outputStream = null;
        try {
            outputStream = d.b(str, null);
            outputStream.write(str2.getBytes());
            if (outputStream != null) {
                ank.a((Closeable) outputStream);
            }
        } catch (IOException e2) {
            Log.e(c, "Unable to serialize controller to disk", e2);
            if (outputStream != null) {
                ank.a((Closeable) outputStream);
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                ank.a((Closeable) outputStream);
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z, String str, String str2, String str3, String str4, String str5) {
        String a2 = ank.a(str, (String) null);
        String a3 = ank.a(str2, (String) null);
        String a4 = ank.a(str3, (String) null);
        String a5 = ank.a(str4, (String) null);
        String a6 = ank.a(str5, (String) null);
        if (z != this.a || !ank.a(a2, this.n) || !ank.a(a3, this.o) || !ank.a(a4, this.p) || !ank.a(a5, this.q) || !ank.a(a6, this.r)) {
            this.a = z;
            this.n = a2;
            this.o = a3;
            this.p = a4;
            this.q = a5;
            this.r = a6;
            l(this);
            c(this, "com.facebook.sdk.LikeActionController.UPDATED", null);
        }
    }

    @Deprecated
    public static boolean a(final int i2, final int i3, final Intent intent) {
        if (ank.a(i)) {
            i = akq.g().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
        }
        if (ank.a(i)) {
            return false;
        }
        a(i, ObjectType.UNKNOWN, (c) new c() {
            public final void a(aol aol, FacebookException facebookException) {
                if (facebookException == null) {
                    aol.a(aol, i2, i3, intent);
                } else {
                    ank.a(aol.c, (Exception) facebookException);
                }
            }
        });
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        defpackage.ank.a((java.io.Closeable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r5 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r5 != null) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.aol b(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.String r5 = d(r5)     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            amv r1 = d     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            java.io.InputStream r5 = r1.a(r5, r0)     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            if (r5 == 0) goto L_0x001e
            java.lang.String r1 = defpackage.ank.a(r5)     // Catch:{ IOException -> 0x001c }
            boolean r2 = defpackage.ank.a(r1)     // Catch:{ IOException -> 0x001c }
            if (r2 != 0) goto L_0x001e
            aol r0 = c(r1)     // Catch:{ IOException -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r1 = move-exception
            goto L_0x002b
        L_0x001e:
            if (r5 == 0) goto L_0x0035
        L_0x0020:
            defpackage.ank.a(r5)
            goto L_0x0035
        L_0x0024:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0037
        L_0x0029:
            r1 = move-exception
            r5 = r0
        L_0x002b:
            java.lang.String r2 = c     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "Unable to deserialize controller from disk"
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0036 }
            if (r5 == 0) goto L_0x0035
            goto L_0x0020
        L_0x0035:
            return r0
        L_0x0036:
            r0 = move-exception
        L_0x0037:
            if (r5 == 0) goto L_0x003c
            defpackage.ank.a(r5)
        L_0x003c:
            goto L_0x003e
        L_0x003d:
            throw r0
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aol.b(java.lang.String):aol");
    }

    private void b(final Bundle bundle) {
        this.b = true;
        akt akt = new akt();
        final l lVar = new l(this.r);
        lVar.a(akt);
        akt.a((defpackage.akt.a) new defpackage.akt.a() {
            public final void a() {
                aol.this.b = false;
                if (lVar.a() != null) {
                    aol.this.b(true);
                    return;
                }
                aol.this.r = null;
                aol.this.u = false;
                aol.this.c().a("fb_like_control_did_unlike", (Double) null, bundle);
                aol.a(aol.this, bundle);
            }
        });
        akr.b(akt);
    }

    static /* synthetic */ void b(String str, ObjectType objectType, c cVar) {
        aol a2 = a(str);
        if (a2 != null) {
            a(a2, objectType, cVar);
            return;
        }
        aol b2 = b(str);
        if (b2 == null) {
            b2 = new aol(str, objectType);
            l(b2);
        }
        String d2 = d(str);
        f.a((Runnable) new j(d2, true), true);
        e.put(d2, b2);
        h.post(new Runnable(b2) {
            private /* synthetic */ aol a;

            {
                this.a = r1;
            }

            public final void run() {
                aol.a(this.a);
            }
        });
        a(cVar, b2, (FacebookException) null);
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        a(z);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        c(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    private static aol c(String str) {
        aol aol = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            aol aol2 = new aol(jSONObject.getString("object_id"), ObjectType.a(jSONObject.optInt("object_type", ObjectType.UNKNOWN.intValue)));
            aol2.n = jSONObject.optString("like_count_string_with_like", null);
            aol2.o = jSONObject.optString("like_count_string_without_like", null);
            aol2.p = jSONObject.optString("social_sentence_with_like", null);
            aol2.q = jSONObject.optString("social_sentence_without_like", null);
            aol2.a = jSONObject.optBoolean("is_object_liked");
            aol2.r = jSONObject.optString("unlike_token", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                aol2.v = amk.a(optJSONObject);
            }
            aol = aol2;
            return aol;
        } catch (JSONException e2) {
            Log.e(c, "Unable to deserialize controller from JSON", e2);
        }
    }

    /* access modifiers changed from: private */
    public static void c(aol aol, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (aol != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", aol.l);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        mh.a(akq.g()).a(intent);
    }

    private static String d(String str) {
        String str2 = aki.b() ? aki.a().e : null;
        if (str2 != null) {
            str2 = ank.b(str2);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[]{str, ank.a(str2, ""), Integer.valueOf(k)});
    }

    private static void e(String str) {
        i = str;
        akq.g().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", i).apply();
    }

    private static synchronized void i() {
        synchronized (aol.class) {
            if (!j) {
                h = new Handler(Looper.getMainLooper());
                k = akq.g().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                d = new amv(c, new defpackage.amv.d());
                new akl() {
                    public final void a(aki aki) {
                        Context g = akq.g();
                        if (aki == null) {
                            aol.k = (aol.k + 1) % 1000;
                            g.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", aol.k).apply();
                            aol.e.clear();
                            amv h = aol.d;
                            File[] listFiles = h.b.listFiles(defpackage.amv.a.a());
                            h.c.set(System.currentTimeMillis());
                            if (listFiles != null) {
                                akq.e().execute(new Runnable(listFiles) {
                                    private /* synthetic */ File[] a;

                                    {
                                        this.a = r2;
                                    }

                                    public final void run() {
                                        for (File delete : this.a) {
                                            delete.delete();
                                        }
                                    }
                                });
                            }
                        }
                        aol.c(null, "com.facebook.sdk.LikeActionController.DID_RESET", null);
                    }
                };
                CallbackManagerImpl.a(RequestCodeOffset.Like.a(), new com.facebook.internal.CallbackManagerImpl.a() {
                    public final boolean a(int i, Intent intent) {
                        return aol.a(RequestCodeOffset.Like.a(), i, intent);
                    }
                });
                j = true;
            }
        }
    }

    private static void l(aol aol) {
        String m2 = m(aol);
        String d2 = d(aol.l);
        if (!ank.a(m2) && !ank.a(d2)) {
            g.a((Runnable) new o(d2, m2), true);
        }
    }

    private static String m(aol aol) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", aol.l);
            jSONObject.put("object_type", aol.m.intValue);
            jSONObject.put("like_count_string_with_like", aol.n);
            jSONObject.put("like_count_string_without_like", aol.o);
            jSONObject.put("social_sentence_with_like", aol.p);
            jSONObject.put("social_sentence_without_like", aol.q);
            jSONObject.put("is_object_liked", aol.a);
            jSONObject.put("unlike_token", aol.r);
            if (aol.v != null) {
                jSONObject.put("facebook_dialog_analytics_bundle", amk.a(aol.v));
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.e(c, "Unable to serialize controller to JSON", e2);
            return null;
        }
    }

    @Deprecated
    public final String a() {
        return this.a ? this.n : this.o;
    }

    public void a(Activity activity, amw amw, Bundle bundle) {
        aoo.d();
        aoo.e();
        a("present_dialog", bundle);
        ank.b(c, "Cannot show the Like Dialog on this device.");
        c(null, "com.facebook.sdk.LikeActionController.UPDATED", null);
    }

    public void a(boolean z) {
        a(z, this.n, this.o, this.p, this.q, this.r);
    }

    public boolean a(boolean z, Bundle bundle) {
        if (d()) {
            if (z) {
                a(bundle);
                return true;
            } else if (!ank.a(this.r)) {
                b(bundle);
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final String b() {
        return this.a ? this.p : this.q;
    }

    public alk c() {
        if (this.w == null) {
            this.w = new alk(akq.g());
        }
        return this.w;
    }

    public boolean d() {
        aki a2 = aki.a();
        return !this.t && this.s != null && aki.b() && a2.b != null && a2.b.contains("publish_actions");
    }
}
