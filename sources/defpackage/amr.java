package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: amr reason: default package */
public final class amr {
    private static final String a = amr.class.getName();
    /* access modifiers changed from: private */
    public static final List<e> b = e();
    private static final List<e> c;
    private static final Map<String, List<e>> d;
    /* access modifiers changed from: private */
    public static final AtomicBoolean e = new AtomicBoolean(false);
    private static final List<Integer> f = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* renamed from: amr$a */
    static class a extends e {
        /* access modifiers changed from: protected */
        public final String a() {
            return "com.facebook.arstudio.player";
        }

        /* access modifiers changed from: protected */
        public final String b() {
            return null;
        }

        private a() {
            super(0);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: amr$b */
    static class b extends e {
        /* access modifiers changed from: protected */
        public final String a() {
            return "com.facebook.lite";
        }

        /* access modifiers changed from: protected */
        public final String b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        private b() {
            super(0);
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: amr$c */
    static class c extends e {
        /* access modifiers changed from: protected */
        public final String a() {
            return "com.facebook.katana";
        }

        /* access modifiers changed from: protected */
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private c() {
            super(0);
        }

        /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: amr$d */
    static class d extends e {
        /* access modifiers changed from: protected */
        public final String a() {
            return "com.facebook.orca";
        }

        /* access modifiers changed from: protected */
        public final String b() {
            return null;
        }

        private d() {
            super(0);
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    /* renamed from: amr$e */
    static abstract class e {
        private TreeSet<Integer> a;

        /* access modifiers changed from: protected */
        public abstract String a();

        /* access modifiers changed from: protected */
        public abstract String b();

        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        public final TreeSet<Integer> c() {
            TreeSet<Integer> treeSet = this.a;
            if (treeSet == null || treeSet.isEmpty()) {
                a(false);
            }
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            if (r0.a.isEmpty() == false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void a(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L_0x000f
                java.util.TreeSet<java.lang.Integer> r1 = r0.a     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x000f
                java.util.TreeSet<java.lang.Integer> r1 = r0.a     // Catch:{ all -> 0x0017 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x0015
            L_0x000f:
                java.util.TreeSet r1 = defpackage.amr.b(r0)     // Catch:{ all -> 0x0017 }
                r0.a = r1     // Catch:{ all -> 0x0017 }
            L_0x0015:
                monitor-exit(r0)
                return
            L_0x0017:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.amr.e.a(boolean):void");
        }
    }

    /* renamed from: amr$f */
    public static class f {
        e a;
        int b;

        public static f a(e eVar, int i) {
            f fVar = new f();
            fVar.a = eVar;
            fVar.b = i;
            return fVar;
        }

        public static f a() {
            f fVar = new f();
            fVar.b = -1;
            return fVar;
        }

        private f() {
        }
    }

    /* renamed from: amr$g */
    static class g extends e {
        /* access modifiers changed from: protected */
        public final String a() {
            return "com.facebook.wakizashi";
        }

        /* access modifiers changed from: protected */
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private g() {
            super(0);
        }

        /* synthetic */ g(byte b) {
            this();
        }
    }

    static {
        ArrayList arrayList = new ArrayList(e());
        arrayList.add(0, new a(0));
        c = arrayList;
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new d(0));
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", c);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", b);
        d = hashMap;
    }

    private static List<e> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(0));
        arrayList.add(new g(0));
        return arrayList;
    }

    private static Intent a(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && amd.a(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    public static Intent a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        Context context2 = context;
        return a(context, a(new b(0), str, collection, str2, z2, defaultAudience, str3, str4));
    }

    private static Intent a(e eVar, String str, Collection<String> collection, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4) {
        String b2 = eVar.b();
        if (b2 == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(eVar.a(), b2).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", akc.i());
        if (!amw.a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!amw.a(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z) {
            putExtra.putExtra("default_audience", defaultAudience.nativeProtocolAudience);
        }
        putExtra.putExtra("legacy_override", akc.h());
        putExtra.putExtra("auth_type", str4);
        return putExtra;
    }

    public static Intent b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        for (e a2 : b) {
            Context context2 = context;
            Intent a3 = a(context, a(a2, str, collection, str2, z2, defaultAudience, str3, str4));
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    public static final int a() {
        return ((Integer) f.get(0)).intValue();
    }

    public static boolean a(int i) {
        return f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    public static void a(Intent intent, String str, String str2, int i, Bundle bundle) {
        String k = akc.k();
        String l = akc.l();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", k);
        if (a(i)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            amw.a(bundle2, "app_name", l);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
        if (!amw.a(l)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", l);
        }
        intent.putExtras(bundle);
    }

    public static Intent a(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID a2 = a(intent);
        if (a2 == null) {
            return null;
        }
        Intent intent2 = new Intent();
        String str = "com.facebook.platform.protocol.PROTOCOL_VERSION";
        intent2.putExtra(str, intent.getIntExtra(str, 0));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", a2.toString());
        if (facebookException != null) {
            bundle2.putBundle(LogMessage.SEVERITY_ERROR, a(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    public static Intent a(Context context) {
        Intent intent;
        Iterator it = b.iterator();
        do {
            intent = null;
            if (!it.hasNext()) {
                break;
            }
            Intent addCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((e) it.next()).a()).addCategory("android.intent.category.DEFAULT");
            if (addCategory != null) {
                ResolveInfo resolveService = context.getPackageManager().resolveService(addCategory, 0);
                if (resolveService != null && amd.a(context, resolveService.serviceInfo.packageName)) {
                    intent = addCategory;
                    continue;
                }
            }
        } while (intent == null);
        return intent;
    }

    public static FacebookException a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new FacebookException(string2);
        }
        return new FacebookOperationCanceledException(string2);
    }

    public static Bundle a(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    public static int b(int i) {
        return a(b, new int[]{i}).b;
    }

    public static f a(String str, int[] iArr) {
        return a((List) d.get(str), iArr);
    }

    private static f a(List<e> list, int[] iArr) {
        b();
        if (list == null) {
            return f.a();
        }
        for (e eVar : list) {
            int a2 = a(eVar.c(), a(), iArr);
            if (a2 != -1) {
                return f.a(eVar, a2);
            }
        }
        return f.a();
    }

    public static void b() {
        if (e.compareAndSet(false, true)) {
            akc.e().execute(new Runnable() {
                public final void run() {
                    try {
                        for (e a : amr.b) {
                            a.a(true);
                        }
                    } finally {
                        amr.e.set(false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        android.util.Log.e(a, r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.TreeSet<java.lang.Integer> b(defpackage.amr.e r10) {
        /*
            java.lang.String r0 = "Failed to query content resolver."
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            android.content.Context r2 = defpackage.akc.g()
            android.content.ContentResolver r3 = r2.getContentResolver()
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r2 = "version"
            r4 = 0
            r5[r4] = r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "content://"
            r6.<init>(r7)
            java.lang.String r7 = r10.a()
            r6.append(r7)
            java.lang.String r7 = ".provider.PlatformProvider/versions"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r9 = 0
            android.content.Context r7 = defpackage.akc.g()     // Catch:{ all -> 0x008c }
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r8.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r10 = r10.a()     // Catch:{ all -> 0x008c }
            r8.append(r10)     // Catch:{ all -> 0x008c }
            java.lang.String r10 = ".provider.PlatformProvider"
            r8.append(r10)     // Catch:{ all -> 0x008c }
            java.lang.String r10 = r8.toString()     // Catch:{ all -> 0x008c }
            android.content.pm.ProviderInfo r10 = r7.resolveContentProvider(r10, r4)     // Catch:{ RuntimeException -> 0x0055 }
            goto L_0x005c
        L_0x0055:
            r10 = move-exception
            java.lang.String r4 = a     // Catch:{ all -> 0x008c }
            android.util.Log.e(r4, r0, r10)     // Catch:{ all -> 0x008c }
            r10 = r9
        L_0x005c:
            if (r10 == 0) goto L_0x0086
            r10 = 0
            r7 = 0
            r8 = 0
            r4 = r6
            r6 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x0069 }
            r9 = r10
            goto L_0x006e
        L_0x0069:
            java.lang.String r10 = a     // Catch:{ all -> 0x008c }
            android.util.Log.e(r10, r0)     // Catch:{ all -> 0x008c }
        L_0x006e:
            if (r9 == 0) goto L_0x0086
        L_0x0070:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x008c }
            if (r10 == 0) goto L_0x0086
            int r10 = r9.getColumnIndex(r2)     // Catch:{ all -> 0x008c }
            int r10 = r9.getInt(r10)     // Catch:{ all -> 0x008c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x008c }
            r1.add(r10)     // Catch:{ all -> 0x008c }
            goto L_0x0070
        L_0x0086:
            if (r9 == 0) goto L_0x008b
            r9.close()
        L_0x008b:
            return r1
        L_0x008c:
            r10 = move-exception
            if (r9 == 0) goto L_0x0092
            r9.close()
        L_0x0092:
            goto L_0x0094
        L_0x0093:
            throw r10
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amr.b(amr$e):java.util.TreeSet");
    }

    private static int a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i2 = length;
        int i3 = -1;
        while (true) {
            if (!descendingIterator.hasNext()) {
                break;
            }
            int intValue = ((Integer) descendingIterator.next()).intValue();
            i3 = Math.max(i3, intValue);
            while (i2 >= 0 && iArr[i2] > intValue) {
                i2--;
            }
            if (i2 < 0) {
                return -1;
            }
            if (iArr[i2] == intValue) {
                if (i2 % 2 == 0) {
                    return Math.min(i3, i);
                }
            }
        }
        return -1;
    }

    public static Intent a(Context context, String str, String str2, f fVar, Bundle bundle) {
        if (fVar == null) {
            return null;
        }
        e eVar = fVar.a;
        if (eVar == null) {
            return null;
        }
        Intent a2 = a(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(eVar.a()).addCategory("android.intent.category.DEFAULT"));
        if (a2 == null) {
            return null;
        }
        a(a2, str, str2, fVar.b, bundle);
        return a2;
    }

    public static UUID a(Intent intent) {
        String str;
        UUID uuid = null;
        if (intent == null) {
            return null;
        }
        if (a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str != null) {
            try {
                uuid = UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return uuid;
    }

    private static Bundle e(Intent intent) {
        if (!a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            return null;
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    public static Bundle b(Intent intent) {
        if (!a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    public static Bundle c(Intent intent) {
        int intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        Bundle extras = intent.getExtras();
        return (!a(intExtra) || extras == null) ? extras : extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
    }

    public static Bundle d(Intent intent) {
        boolean z;
        Bundle e2 = e(intent);
        String str = LogMessage.SEVERITY_ERROR;
        if (e2 != null) {
            z = e2.containsKey(str);
        } else {
            z = intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        }
        if (!z) {
            return null;
        }
        Bundle e3 = e(intent);
        if (e3 != null) {
            return e3.getBundle(str);
        }
        return intent.getExtras();
    }
}
