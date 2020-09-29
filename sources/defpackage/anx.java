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
/* renamed from: anx reason: default package */
public class anx {
    /* access modifiers changed from: private */
    public static final String c = anx.class.getSimpleName();
    /* access modifiers changed from: private */
    public static amh d;
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<String, anx> e = new ConcurrentHashMap<>();
    private static amz f = new amz(1);
    private static amz g = new amz(1);
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
    private akw w;

    /* renamed from: anx$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[ObjectType.values().length];

        static {
            try {
                a[ObjectType.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: anx$a */
    abstract class a implements n {
        protected String a;
        protected ObjectType b;
        protected FacebookRequestError c;
        private akd d;

        /* access modifiers changed from: protected */
        public abstract void a(akg akg);

        protected a(String str, ObjectType objectType) {
            this.a = str;
            this.b = objectType;
        }

        public final void a(akf akf) {
            akf.add(this.d);
        }

        public final FacebookRequestError a() {
            return this.c;
        }

        /* access modifiers changed from: protected */
        public final void a(akd akd) {
            this.d = akd;
            akd.g = akc.h();
            akd.a((defpackage.akd.b) new defpackage.akd.b() {
                public final void a(akg akg) {
                    a.this.c = akg.b;
                    if (a.this.c != null) {
                        a aVar = a.this;
                        aVar.a(aVar.c);
                        return;
                    }
                    a.this.a(akg);
                }
            });
        }

        /* access modifiers changed from: protected */
        public void a(FacebookRequestError facebookRequestError) {
            amp.a(LoggingBehavior.REQUESTS, anx.c, "Error running request for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
        }
    }

    /* renamed from: anx$b */
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
            anx.b(this.a, this.b, this.c);
        }
    }

    @Deprecated
    /* renamed from: anx$c */
    public interface c {
        void a(anx anx, FacebookException facebookException);
    }

    /* renamed from: anx$d */
    class d extends a {
        String d = anx.this.n;
        String e = anx.this.o;
        String f = anx.this.p;
        String g = anx.this.q;

        d(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            a(new akd(aju.a(), str, bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            amp.a(LoggingBehavior.REQUESTS, anx.c, "Error fetching engagement for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
            anx.a(anx.this, "get_engagement", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        public final void a(akg akg) {
            JSONObject b = amw.b(akg.a, "engagement");
            if (b != null) {
                this.d = b.optString("count_string_with_like", this.d);
                this.e = b.optString("count_string_without_like", this.e);
                this.f = b.optString("social_sentence_with_like", this.f);
                this.g = b.optString("social_sentence_without_like", this.g);
            }
        }
    }

    /* renamed from: anx$e */
    class e extends a {
        String d;

        e(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", str);
            a(new akd(aju.a(), "", bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.a().contains("og_object")) {
                this.c = null;
                return;
            }
            amp.a(LoggingBehavior.REQUESTS, anx.c, "Error getting the FB id for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
        }

        /* access modifiers changed from: protected */
        public final void a(akg akg) {
            JSONObject b = amw.b(akg.a, this.a);
            if (b != null) {
                JSONObject optJSONObject = b.optJSONObject("og_object");
                if (optJSONObject != null) {
                    this.d = optJSONObject.optString("id");
                }
            }
        }
    }

    /* renamed from: anx$f */
    class f extends a implements i {
        private boolean d = anx.this.a;
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
            a(new akd(aju.a(), "me/og.likes", bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            amp.a(LoggingBehavior.REQUESTS, anx.c, "Error fetching like status for object '%s' with type '%s' : %s", this.f, this.g, facebookRequestError);
            anx.a(anx.this, "get_og_object_like", facebookRequestError);
        }

        public final boolean b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        /* access modifiers changed from: protected */
        public final void a(akg akg) {
            JSONArray c = amw.c(akg.a, "data");
            if (c != null) {
                for (int i = 0; i < c.length(); i++) {
                    JSONObject optJSONObject = c.optJSONObject(i);
                    if (optJSONObject != null) {
                        this.d = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("application");
                        aju a = aju.a();
                        if (optJSONObject2 != null && aju.b()) {
                            String str = "id";
                            if (amw.a(a.h, optJSONObject2.optString(str))) {
                                this.e = optJSONObject.optString(str);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: anx$g */
    class g extends a {
        String d;
        boolean e;

        g(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            bundle.putString("ids", str);
            a(new akd(aju.a(), "", bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            amp.a(LoggingBehavior.REQUESTS, anx.c, "Error getting the FB id for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
        }

        /* access modifiers changed from: protected */
        public final void a(akg akg) {
            JSONObject b = amw.b(akg.a, this.a);
            if (b != null) {
                this.d = b.optString("id");
                this.e = !amw.a(this.d);
            }
        }
    }

    /* renamed from: anx$h */
    class h extends a implements i {
        private boolean d = anx.this.a;
        private String e;

        public final String c() {
            return null;
        }

        h(String str) {
            super(str, ObjectType.PAGE);
            this.e = str;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            aju a = aju.a();
            StringBuilder sb = new StringBuilder("me/likes/");
            sb.append(str);
            a(new akd(a, sb.toString(), bundle, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            amp.a(LoggingBehavior.REQUESTS, anx.c, "Error fetching like status for page id '%s': %s", this.e, facebookRequestError);
            anx.a(anx.this, "get_page_like", facebookRequestError);
        }

        public final boolean b() {
            return this.d;
        }

        /* access modifiers changed from: protected */
        public final void a(akg akg) {
            JSONArray c = amw.c(akg.a, "data");
            if (c != null && c.length() > 0) {
                this.d = true;
            }
        }
    }

    /* renamed from: anx$i */
    interface i extends n {
        boolean b();

        String c();
    }

    /* renamed from: anx$j */
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
                    anx.e.remove((String) arrayList.remove(arrayList.size() - 1));
                }
            }
        }
    }

    /* renamed from: anx$k */
    class k extends a {
        String d;

        k(String str, ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("object", str);
            a(new akd(aju.a(), "me/og.likes", bundle, HttpMethod.POST));
        }

        /* access modifiers changed from: protected */
        public final void a(akg akg) {
            this.d = amw.a(akg.a, "id");
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.b == 3501) {
                this.c = null;
                return;
            }
            amp.a(LoggingBehavior.REQUESTS, anx.c, "Error liking object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
            anx.a(anx.this, "publish_like", facebookRequestError);
        }
    }

    /* renamed from: anx$l */
    class l extends a {
        private String d;

        /* access modifiers changed from: protected */
        public final void a(akg akg) {
        }

        l(String str) {
            super(null, null);
            this.d = str;
            a(new akd(aju.a(), str, null, HttpMethod.DELETE));
        }

        /* access modifiers changed from: protected */
        public final void a(FacebookRequestError facebookRequestError) {
            amp.a(LoggingBehavior.REQUESTS, anx.c, "Error unliking object with unlike token '%s' : %s", this.d, facebookRequestError);
            anx.a(anx.this, "publish_unlike", facebookRequestError);
        }
    }

    /* renamed from: anx$m */
    interface m {
        void a();
    }

    /* renamed from: anx$n */
    interface n {
        FacebookRequestError a();

        void a(akf akf);
    }

    /* renamed from: anx$o */
    static class o implements Runnable {
        private String a;
        private String b;

        o(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final void run() {
            anx.a(this.a, this.b);
        }
    }

    @Deprecated
    public static boolean a(final int i2, final int i3, final Intent intent) {
        if (amw.a(i)) {
            i = akc.g().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
        }
        if (amw.a(i)) {
            return false;
        }
        a(i, ObjectType.UNKNOWN, (c) new c() {
            public final void a(anx anx, FacebookException facebookException) {
                if (facebookException == null) {
                    anx.a(anx, i2, i3, intent);
                } else {
                    amw.a(anx.c, (Exception) facebookException);
                }
            }
        });
        return true;
    }

    @Deprecated
    public static void a(String str, ObjectType objectType, c cVar) {
        if (!j) {
            i();
        }
        anx a2 = a(str);
        if (a2 != null) {
            a(a2, objectType, cVar);
        } else {
            g.a((Runnable) new b(str, objectType, cVar), true);
        }
    }

    private static void a(anx anx, ObjectType objectType, c cVar) {
        FacebookException facebookException;
        ObjectType a2 = aoi.a(objectType, anx.m);
        if (a2 == null) {
            facebookException = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", anx.l, anx.m.toString(), objectType.toString());
            anx = null;
        } else {
            anx.m = a2;
            facebookException = null;
        }
        a(cVar, anx, facebookException);
    }

    private static synchronized void i() {
        synchronized (anx.class) {
            if (!j) {
                h = new Handler(Looper.getMainLooper());
                k = akc.g().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                d = new amh(c, new defpackage.amh.d());
                new ajx() {
                    public final void a(aju aju) {
                        Context g = akc.g();
                        if (aju == null) {
                            anx.k = (anx.k + 1) % 1000;
                            g.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", anx.k).apply();
                            anx.e.clear();
                            amh h = anx.d;
                            File[] listFiles = h.b.listFiles(defpackage.amh.a.a());
                            h.c.set(System.currentTimeMillis());
                            if (listFiles != null) {
                                akc.e().execute(new Runnable(listFiles) {
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
                        anx.c(null, "com.facebook.sdk.LikeActionController.DID_RESET", null);
                    }
                };
                CallbackManagerImpl.a(RequestCodeOffset.Like.a(), new com.facebook.internal.CallbackManagerImpl.a() {
                    public final boolean a(int i, Intent intent) {
                        return anx.a(RequestCodeOffset.Like.a(), i, intent);
                    }
                });
                j = true;
            }
        }
    }

    private static void a(final c cVar, final anx anx, final FacebookException facebookException) {
        if (cVar != null) {
            h.post(new Runnable() {
                public final void run() {
                    cVar.a(anx, facebookException);
                }
            });
        }
    }

    private static anx a(String str) {
        String d2 = d(str);
        anx anx = (anx) e.get(d2);
        if (anx != null) {
            f.a((Runnable) new j(d2, false), true);
        }
        return anx;
    }

    private static void l(anx anx) {
        String m2 = m(anx);
        String d2 = d(anx.l);
        if (!amw.a(m2) && !amw.a(d2)) {
            g.a((Runnable) new o(d2, m2), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        defpackage.amw.a((java.io.Closeable) r5);
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
    private static defpackage.anx b(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.String r5 = d(r5)     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            amh r1 = d     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            java.io.InputStream r5 = r1.a(r5, r0)     // Catch:{ IOException -> 0x0029, all -> 0x0024 }
            if (r5 == 0) goto L_0x001e
            java.lang.String r1 = defpackage.amw.a(r5)     // Catch:{ IOException -> 0x001c }
            boolean r2 = defpackage.amw.a(r1)     // Catch:{ IOException -> 0x001c }
            if (r2 != 0) goto L_0x001e
            anx r0 = c(r1)     // Catch:{ IOException -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r1 = move-exception
            goto L_0x002b
        L_0x001e:
            if (r5 == 0) goto L_0x0035
        L_0x0020:
            defpackage.amw.a(r5)
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
            defpackage.amw.a(r5)
        L_0x003c:
            goto L_0x003e
        L_0x003d:
            throw r0
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anx.b(java.lang.String):anx");
    }

    private static anx c(String str) {
        anx anx = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            anx anx2 = new anx(jSONObject.getString("object_id"), ObjectType.a(jSONObject.optInt("object_type", ObjectType.UNKNOWN.intValue)));
            anx2.n = jSONObject.optString("like_count_string_with_like", null);
            anx2.o = jSONObject.optString("like_count_string_without_like", null);
            anx2.p = jSONObject.optString("social_sentence_with_like", null);
            anx2.q = jSONObject.optString("social_sentence_without_like", null);
            anx2.a = jSONObject.optBoolean("is_object_liked");
            anx2.r = jSONObject.optString("unlike_token", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                anx2.v = alw.a(optJSONObject);
            }
            anx = anx2;
            return anx;
        } catch (JSONException e2) {
            Log.e(c, "Unable to deserialize controller from JSON", e2);
        }
    }

    private static String m(anx anx) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", anx.l);
            jSONObject.put("object_type", anx.m.intValue);
            jSONObject.put("like_count_string_with_like", anx.n);
            jSONObject.put("like_count_string_without_like", anx.o);
            jSONObject.put("social_sentence_with_like", anx.p);
            jSONObject.put("social_sentence_without_like", anx.q);
            jSONObject.put("is_object_liked", anx.a);
            jSONObject.put("unlike_token", anx.r);
            if (anx.v != null) {
                jSONObject.put("facebook_dialog_analytics_bundle", alw.a(anx.v));
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.e(c, "Unable to serialize controller to JSON", e2);
            return null;
        }
    }

    private static String d(String str) {
        String str2;
        aju a2 = aju.a();
        if (aju.b()) {
            str2 = a2.e;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str2 = amw.b(str2);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[]{str, amw.a(str2, ""), Integer.valueOf(k)});
    }

    /* access modifiers changed from: private */
    public static void c(anx anx, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (anx != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", anx.l);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        mc.a(akc.g()).a(intent);
    }

    private anx(String str, ObjectType objectType) {
        this.l = str;
        this.m = objectType;
    }

    @Deprecated
    public final String a() {
        return this.a ? this.n : this.o;
    }

    @Deprecated
    public final String b() {
        return this.a ? this.p : this.q;
    }

    public akw c() {
        if (this.w == null) {
            this.w = new akw(akc.g());
        }
        return this.w;
    }

    public boolean a(boolean z, Bundle bundle) {
        if (d()) {
            if (z) {
                a(bundle);
                return true;
            } else if (!amw.a(this.r)) {
                b(bundle);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        a(z);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        c(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    public void a(boolean z) {
        a(z, this.n, this.o, this.p, this.q, this.r);
    }

    /* access modifiers changed from: private */
    public void a(boolean z, String str, String str2, String str3, String str4, String str5) {
        String a2 = amw.a(str, (String) null);
        String a3 = amw.a(str2, (String) null);
        String a4 = amw.a(str3, (String) null);
        String a5 = amw.a(str4, (String) null);
        String a6 = amw.a(str5, (String) null);
        if (z != this.a || !amw.a(a2, this.n) || !amw.a(a3, this.o) || !amw.a(a4, this.p) || !amw.a(a5, this.q) || !amw.a(a6, this.r)) {
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

    public void a(Activity activity, ami ami, Bundle bundle) {
        aoa.d();
        aoa.e();
        a("present_dialog", bundle);
        amw.b(c, "Cannot show the Like Dialog on this device.");
        c(null, "com.facebook.sdk.LikeActionController.UPDATED", null);
    }

    private static void e(String str) {
        i = str;
        akc.g().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", i).apply();
    }

    public boolean d() {
        aju a2 = aju.a();
        return !this.t && this.s != null && aju.b() && a2.b != null && a2.b.contains("publish_actions");
    }

    private void a(final Bundle bundle) {
        this.b = true;
        a((m) new m() {
            public final void a() {
                if (amw.a(anx.this.s)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                    anx.c(anx.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                    return;
                }
                akf akf = new akf();
                anx anx = anx.this;
                final k kVar = new k(anx.s, anx.this.m);
                kVar.a(akf);
                akf.a((defpackage.akf.a) new defpackage.akf.a() {
                    public final void a() {
                        anx.this.b = false;
                        if (kVar.a() != null) {
                            anx.this.b(false);
                            return;
                        }
                        anx.this.r = amw.a(kVar.d, (String) null);
                        anx.this.u = true;
                        anx.this.c().a("fb_like_control_did_like", (Double) null, bundle);
                        anx.a(anx.this, bundle);
                    }
                });
                akd.b(akf);
            }
        });
    }

    private void b(final Bundle bundle) {
        this.b = true;
        akf akf = new akf();
        final l lVar = new l(this.r);
        lVar.a(akf);
        akf.a((defpackage.akf.a) new defpackage.akf.a() {
            public final void a() {
                anx.this.b = false;
                if (lVar.a() != null) {
                    anx.this.b(true);
                    return;
                }
                anx.this.r = null;
                anx.this.u = false;
                anx.this.c().a("fb_like_control_did_unlike", (Double) null, bundle);
                anx.a(anx.this, bundle);
            }
        });
        akd.b(akf);
    }

    private void a(final m mVar) {
        if (!amw.a(this.s)) {
            mVar.a();
            return;
        }
        final e eVar = new e(this.l, this.m);
        final g gVar = new g(this.l, this.m);
        akf akf = new akf();
        eVar.a(akf);
        gVar.a(akf);
        akf.a((defpackage.akf.a) new defpackage.akf.a() {
            public final void a() {
                FacebookRequestError facebookRequestError;
                anx.this.s = eVar.d;
                if (amw.a(anx.this.s)) {
                    anx.this.s = gVar.d;
                    anx.this.t = gVar.e;
                }
                if (amw.a(anx.this.s)) {
                    amp.a(LoggingBehavior.DEVELOPER_ERRORS, anx.c, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", anx.this.l);
                    anx anx = anx.this;
                    if (gVar.a() != null) {
                        facebookRequestError = gVar.a();
                    } else {
                        facebookRequestError = eVar.a();
                    }
                    anx.a(anx, "get_verified_id", facebookRequestError);
                }
                m mVar = mVar;
                if (mVar != null) {
                    mVar.a();
                }
            }
        });
        akd.b(akf);
    }

    /* access modifiers changed from: private */
    public void a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.l);
        bundle2.putString("object_type", this.m.toString());
        bundle2.putString("current_action", str);
        c().a("fb_like_control_error", (Double) null, bundle2);
    }

    static /* synthetic */ void a(anx anx, int i2, int i3, Intent intent) {
        aoi.a(i2, i3, intent, new aof(null, anx.v) {
            private /* synthetic */ Bundle a;

            {
                this.a = r3;
            }

            public final void a(alt alt, Bundle bundle) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                if (bundle != null) {
                    String str6 = "object_is_liked";
                    if (bundle.containsKey(str6)) {
                        boolean z = bundle.getBoolean(str6);
                        String b2 = anx.this.n;
                        String c = anx.this.o;
                        String str7 = "like_count_string";
                        if (bundle.containsKey(str7)) {
                            str2 = bundle.getString(str7);
                            str = str2;
                        } else {
                            str2 = b2;
                            str = c;
                        }
                        String d = anx.this.p;
                        String e = anx.this.q;
                        String str8 = "social_sentence";
                        if (bundle.containsKey(str8)) {
                            str4 = bundle.getString(str8);
                            str3 = str4;
                        } else {
                            str4 = d;
                            str3 = e;
                        }
                        if (bundle.containsKey(str6)) {
                            str5 = bundle.getString("unlike_token");
                        } else {
                            str5 = anx.this.r;
                        }
                        String str9 = str5;
                        Bundle bundle2 = this.a;
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putString("call_id", alt.a.toString());
                        anx.this.c().b("fb_like_control_dialog_did_succeed", bundle2);
                        anx.this.a(z, str2, str, str4, str3, str9);
                    }
                }
            }

            public final void a(alt alt, FacebookException facebookException) {
                amp.a(LoggingBehavior.REQUESTS, anx.c, "Like Dialog failed with error : %s", facebookException);
                Bundle bundle = this.a;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("call_id", alt.a.toString());
                anx.this.a("present_dialog", bundle);
                anx.c(anx.this, "com.facebook.sdk.LikeActionController.DID_ERROR", amr.a(facebookException));
            }

            public final void a(alt alt) {
                a(alt, (FacebookException) new FacebookOperationCanceledException());
            }
        });
        anx.v = null;
        e((String) null);
    }

    static /* synthetic */ void a(anx anx) {
        if (!aju.b()) {
            aob aob = new aob(akc.g(), akc.k(), anx.l);
            if (aob.a()) {
                aob.b = new defpackage.ams.a() {
                    public final void a(Bundle bundle) {
                        String str;
                        String str2;
                        String str3;
                        String str4;
                        String str5;
                        if (bundle != null) {
                            String str6 = "com.facebook.platform.extra.OBJECT_IS_LIKED";
                            if (bundle.containsKey(str6)) {
                                boolean z = bundle.getBoolean(str6);
                                String str7 = "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE";
                                if (bundle.containsKey(str7)) {
                                    str = bundle.getString(str7);
                                } else {
                                    str = anx.this.n;
                                }
                                String str8 = str;
                                String str9 = "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE";
                                if (bundle.containsKey(str9)) {
                                    str2 = bundle.getString(str9);
                                } else {
                                    str2 = anx.this.o;
                                }
                                String str10 = str2;
                                String str11 = "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE";
                                if (bundle.containsKey(str11)) {
                                    str3 = bundle.getString(str11);
                                } else {
                                    str3 = anx.this.p;
                                }
                                String str12 = str3;
                                String str13 = "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE";
                                if (bundle.containsKey(str13)) {
                                    str4 = bundle.getString(str13);
                                } else {
                                    str4 = anx.this.q;
                                }
                                String str14 = str4;
                                String str15 = "com.facebook.platform.extra.UNLIKE_TOKEN";
                                if (bundle.containsKey(str15)) {
                                    str5 = bundle.getString(str15);
                                } else {
                                    str5 = anx.this.r;
                                }
                                anx.this.a(z, str8, str10, str12, str14, str5);
                            }
                        }
                    }
                };
            }
            return;
        }
        anx.a((m) new m() {
            public final void a() {
                final i iVar;
                if (AnonymousClass4.a[anx.this.m.ordinal()] != 1) {
                    anx anx = anx.this;
                    iVar = new f(anx.s, anx.this.m);
                } else {
                    anx anx2 = anx.this;
                    iVar = new h(anx2.s);
                }
                anx anx3 = anx.this;
                final d dVar = new d(anx3.s, anx.this.m);
                akf akf = new akf();
                iVar.a(akf);
                dVar.a(akf);
                akf.a((defpackage.akf.a) new defpackage.akf.a() {
                    public final void a() {
                        if (iVar.a() == null && dVar.a() == null) {
                            anx.this.a(iVar.b(), dVar.d, dVar.e, dVar.f, dVar.g, iVar.c());
                            return;
                        }
                        amp.a(LoggingBehavior.REQUESTS, anx.c, "Unable to refresh like state for id: '%s'", anx.this.l);
                    }
                });
                akd.b(akf);
            }
        });
    }

    static /* synthetic */ void a(anx anx, Bundle bundle) {
        boolean z = anx.a;
        if (z != anx.u && !anx.a(z, bundle)) {
            anx.b(!anx.a);
        }
    }

    static /* synthetic */ void a(anx anx, String str, FacebookRequestError facebookRequestError) {
        Bundle bundle = new Bundle();
        if (facebookRequestError != null) {
            JSONObject jSONObject = facebookRequestError.e;
            if (jSONObject != null) {
                bundle.putString(LogMessage.SEVERITY_ERROR, jSONObject.toString());
            }
        }
        anx.a(str, bundle);
    }

    static /* synthetic */ void a(String str, String str2) {
        OutputStream outputStream = null;
        try {
            outputStream = d.b(str, null);
            outputStream.write(str2.getBytes());
            if (outputStream != null) {
                amw.a((Closeable) outputStream);
            }
        } catch (IOException e2) {
            Log.e(c, "Unable to serialize controller to disk", e2);
            if (outputStream != null) {
                amw.a((Closeable) outputStream);
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                amw.a((Closeable) outputStream);
            }
            throw th;
        }
    }

    static /* synthetic */ void b(String str, ObjectType objectType, c cVar) {
        anx a2 = a(str);
        if (a2 != null) {
            a(a2, objectType, cVar);
            return;
        }
        anx b2 = b(str);
        if (b2 == null) {
            b2 = new anx(str, objectType);
            l(b2);
        }
        String d2 = d(str);
        f.a((Runnable) new j(d2, true), true);
        e.put(d2, b2);
        h.post(new Runnable(b2) {
            private /* synthetic */ anx a;

            {
                this.a = r1;
            }

            public final void run() {
                anx.a(this.a);
            }
        });
        a(cVar, b2, (FacebookException) null);
    }
}
