package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.internal.ads.zzcj;
import defpackage.ctm;
import defpackage.ctn;
import defpackage.ctr;
import defpackage.ctu;
import defpackage.ctx;
import java.util.Map;

@cey
/* renamed from: bfl reason: default package */
public final class bfl<T extends ctm & ctn & ctr & ctu & ctx> implements bgl<T> {
    private final Context a;
    private final dhx b;
    private final coy c;
    private final bhi d;
    private final dos e;
    private final bhc f;
    private final bfr g;
    private final bft h;
    private final bkj i;
    private final cbv j;
    private final csr k = null;

    public bfl(Context context, coy coy, dhx dhx, bhi bhi, dos dos, bfr bfr, bft bft, bhc bhc, bkj bkj, cbv cbv) {
        this.a = context;
        this.c = coy;
        this.b = dhx;
        this.d = bhi;
        this.e = dos;
        this.g = bfr;
        this.h = bft;
        this.i = bkj;
        this.j = cbv;
        this.f = bhc;
    }

    private final void a(boolean z) {
        cbv cbv = this.j;
        if (cbv != null) {
            cbv.a(z);
        }
    }

    private static boolean a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return bjl.g().b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return bjl.g().a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return bjl.g().c();
            }
        }
        return -1;
    }

    static String a(Context context, dhx dhx, String str, View view, Activity activity) {
        if (dhx == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            boolean z = false;
            if (dhx.a(parse)) {
                String[] strArr = dhx.a;
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        break;
                    }
                    if (parse.getPath().endsWith(strArr[i2])) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                parse = dhx.a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (zzcj unused) {
            return str;
        } catch (Exception e2) {
            bjl.i().a((Throwable) e2, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r5v9, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r5v10, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r5v11, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r1v30, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r5v16, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r5v18, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r5v19, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r5v20, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX INFO: used method not loaded: bfm.a(android.content.Intent):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0196, code lost:
        if (r0.a((android.content.Intent) r5) != null) goto L_0x01ea;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v6
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], android.content.Intent, android.net.Uri]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.content.Intent, android.net.Uri]
      mth insns count: 283
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(java.lang.Object r13, java.util.Map r14) {
        /*
            r12 = this;
            java.lang.String r0 = "OpenGmsgHandler.onGmsg"
            ctm r13 = (defpackage.ctm) r13
            java.lang.String r1 = "u"
            java.lang.Object r2 = r14.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r3 = r13.getContext()
            java.lang.String r2 = defpackage.ckt.a(r2, r3)
            java.lang.String r3 = "a"
            java.lang.Object r3 = r14.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 5
            if (r3 != 0) goto L_0x0023
            defpackage.cow.a(r4)
            return
        L_0x0023:
            bkj r5 = r12.i
            if (r5 == 0) goto L_0x0033
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x0033
            bkj r13 = r12.i
            r13.a(r2)
            return
        L_0x0033:
            java.lang.String r5 = "expand"
            boolean r5 = r5.equalsIgnoreCase(r3)
            r6 = 0
            if (r5 == 0) goto L_0x005a
            r0 = r13
            ctn r0 = (defpackage.ctn) r0
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x0049
            defpackage.cow.a(r4)
            return
        L_0x0049:
            r12.a(r6)
            ctr r13 = (defpackage.ctr) r13
            boolean r0 = a(r14)
            int r14 = b(r14)
            r13.a(r0, r14)
            return
        L_0x005a:
            java.lang.String r5 = "webapp"
            boolean r5 = r5.equalsIgnoreCase(r3)
            if (r5 == 0) goto L_0x008d
            r12.a(r6)
            ctr r13 = (defpackage.ctr) r13
            boolean r0 = a(r14)
            if (r2 == 0) goto L_0x0075
            int r14 = b(r14)
            r13.a(r0, r14, r2)
            return
        L_0x0075:
            int r1 = b(r14)
            java.lang.String r2 = "html"
            java.lang.Object r2 = r14.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "baseurl"
            java.lang.Object r14 = r14.get(r3)
            java.lang.String r14 = (java.lang.String) r14
            r13.a(r0, r1, r2, r14)
            return
        L_0x008d:
            java.lang.String r5 = "app"
            boolean r3 = r5.equalsIgnoreCase(r3)
            r5 = 0
            r7 = 1
            if (r3 == 0) goto L_0x01fd
            java.lang.String r3 = "system_browser"
            java.lang.Object r3 = r14.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r8 = "true"
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x01fd
            r12.a(r7)
            r13.getContext()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00b7
            defpackage.cow.a(r4)
            return
        L_0x00b7:
            bfm r0 = new bfm
            android.content.Context r2 = r13.getContext()
            r3 = r13
            ctu r3 = (defpackage.ctu) r3
            dhx r3 = r3.A()
            r8 = r13
            ctx r8 = (defpackage.ctx) r8
            android.view.View r8 = r8.o()
            r0.<init>(r2, r3, r8)
            android.content.Context r2 = r0.a
            java.lang.String r3 = "activity"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            java.lang.Object r1 = r14.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x00e6
            goto L_0x01ea
        L_0x00e6:
            android.content.Context r3 = r0.a
            dhx r8 = r0.b
            android.view.View r9 = r0.c
            java.lang.String r1 = a(r3, r8, r1, r9, r5)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r3 = "use_first_package"
            java.lang.Object r3 = r14.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            java.lang.String r8 = "use_running_process"
            java.lang.Object r8 = r14.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = java.lang.Boolean.parseBoolean(r8)
            java.lang.String r9 = "use_custom_tabs"
            java.lang.Object r14 = r14.get(r9)
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = java.lang.Boolean.parseBoolean(r14)
            if (r14 != 0) goto L_0x012e
            dsf<java.lang.Boolean> r14 = defpackage.dsp.cK
            dsn r9 = defpackage.dpn.f()
            java.lang.Object r14 = r9.a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r7 = 0
        L_0x012e:
            java.lang.String r14 = r1.getScheme()
            java.lang.String r9 = "http"
            boolean r14 = r9.equalsIgnoreCase(r14)
            java.lang.String r10 = "https"
            if (r14 == 0) goto L_0x0149
            android.net.Uri$Builder r14 = r1.buildUpon()
            android.net.Uri$Builder r14 = r14.scheme(r10)
        L_0x0144:
            android.net.Uri r5 = r14.build()
            goto L_0x015c
        L_0x0149:
            java.lang.String r14 = r1.getScheme()
            boolean r14 = r10.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x015c
            android.net.Uri$Builder r14 = r1.buildUpon()
            android.net.Uri$Builder r14 = r14.scheme(r9)
            goto L_0x0144
        L_0x015c:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            android.content.Intent r1 = defpackage.bfm.a(r1)
            android.content.Intent r5 = defpackage.bfm.a(r5)
            if (r7 == 0) goto L_0x017b
            defpackage.bjl.e()
            android.content.Context r7 = r0.a
            defpackage.cmd.b(r7, r1)
            defpackage.bjl.e()
            android.content.Context r7 = r0.a
            defpackage.cmd.b(r7, r5)
        L_0x017b:
            android.content.pm.ResolveInfo r7 = r0.a(r1, r14)
            if (r7 == 0) goto L_0x0186
            android.content.Intent r5 = defpackage.bfm.a(r1, r7)
            goto L_0x01ea
        L_0x0186:
            if (r5 == 0) goto L_0x0199
            android.content.pm.ResolveInfo r5 = r0.a(r5)
            if (r5 == 0) goto L_0x0199
            android.content.Intent r5 = defpackage.bfm.a(r1, r5)
            android.content.pm.ResolveInfo r0 = r0.a(r5)
            if (r0 == 0) goto L_0x0199
            goto L_0x01ea
        L_0x0199:
            int r0 = r14.size()
            if (r0 == 0) goto L_0x01e9
            if (r8 == 0) goto L_0x01dc
            if (r2 == 0) goto L_0x01dc
            java.util.List r0 = r2.getRunningAppProcesses()
            if (r0 == 0) goto L_0x01dc
            r2 = r14
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            r7 = 0
        L_0x01b1:
            if (r7 >= r5) goto L_0x01dc
            java.lang.Object r8 = r2.get(r7)
            int r7 = r7 + 1
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            java.util.Iterator r9 = r0.iterator()
        L_0x01bf:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b1
            java.lang.Object r10 = r9.next()
            android.app.ActivityManager$RunningAppProcessInfo r10 = (android.app.ActivityManager.RunningAppProcessInfo) r10
            java.lang.String r10 = r10.processName
            android.content.pm.ActivityInfo r11 = r8.activityInfo
            java.lang.String r11 = r11.packageName
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x01bf
            android.content.Intent r5 = defpackage.bfm.a(r1, r8)
            goto L_0x01ea
        L_0x01dc:
            if (r3 == 0) goto L_0x01e9
            java.lang.Object r14 = r14.get(r6)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r5 = defpackage.bfm.a(r1, r14)
            goto L_0x01ea
        L_0x01e9:
            r5 = r1
        L_0x01ea:
            ctr r13 = (defpackage.ctr) r13     // Catch:{ ActivityNotFoundException -> 0x01f5 }
            bgs r14 = new bgs     // Catch:{ ActivityNotFoundException -> 0x01f5 }
            r14.<init>(r5)     // Catch:{ ActivityNotFoundException -> 0x01f5 }
            r13.a(r14)     // Catch:{ ActivityNotFoundException -> 0x01f5 }
            return
        L_0x01f5:
            r13 = move-exception
            r13.getMessage()
            defpackage.cow.a(r4)
            return
        L_0x01fd:
            r12.a(r7)
            java.lang.String r1 = "intent_url"
            java.lang.Object r1 = r14.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x022d
            android.content.Intent r5 = android.content.Intent.parseUri(r1, r6)     // Catch:{ URISyntaxException -> 0x0213 }
            goto L_0x022d
        L_0x0213:
            r3 = move-exception
            java.lang.String r4 = "Error parsing the url: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r6 = r1.length()
            if (r6 == 0) goto L_0x0225
            java.lang.String r1 = r4.concat(r1)
            goto L_0x022a
        L_0x0225:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x022a:
            defpackage.clu.a(r1, r3)
        L_0x022d:
            if (r5 == 0) goto L_0x0294
            android.net.Uri r1 = r5.getData()
            if (r1 == 0) goto L_0x0294
            android.net.Uri r1 = r5.getData()
            java.lang.String r3 = r1.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0291
            android.content.Context r4 = r13.getContext()     // Catch:{ Exception -> 0x025e }
            r6 = r13
            ctu r6 = (defpackage.ctu) r6     // Catch:{ Exception -> 0x025e }
            dhx r6 = r6.A()     // Catch:{ Exception -> 0x025e }
            r7 = r13
            ctx r7 = (defpackage.ctx) r7     // Catch:{ Exception -> 0x025e }
            android.view.View r7 = r7.o()     // Catch:{ Exception -> 0x025e }
            android.app.Activity r8 = r13.d()     // Catch:{ Exception -> 0x025e }
            java.lang.String r3 = a(r4, r6, r3, r7, r8)     // Catch:{ Exception -> 0x025e }
            goto L_0x026b
        L_0x025e:
            r4 = move-exception
            java.lang.String r6 = "Error occurred while adding signals."
            defpackage.clu.a(r6, r4)
            cle r6 = defpackage.bjl.i()
            r6.a(r4, r0)
        L_0x026b:
            android.net.Uri r1 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0270 }
            goto L_0x0291
        L_0x0270:
            r4 = move-exception
            java.lang.String r6 = "Error parsing the uri: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0282
            java.lang.String r3 = r6.concat(r3)
            goto L_0x0287
        L_0x0282:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r6)
        L_0x0287:
            defpackage.clu.a(r3, r4)
            cle r3 = defpackage.bjl.i()
            r3.a(r4, r0)
        L_0x0291:
            r5.setData(r1)
        L_0x0294:
            if (r5 == 0) goto L_0x02a1
            ctr r13 = (defpackage.ctr) r13
            bgs r14 = new bgs
            r14.<init>(r5)
            r13.a(r14)
            return
        L_0x02a1:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x02c1
            android.content.Context r0 = r13.getContext()
            r1 = r13
            ctu r1 = (defpackage.ctu) r1
            dhx r1 = r1.A()
            r3 = r13
            ctx r3 = (defpackage.ctx) r3
            android.view.View r3 = r3.o()
            android.app.Activity r4 = r13.d()
            java.lang.String r2 = a(r0, r1, r2, r3, r4)
        L_0x02c1:
            r5 = r2
            ctr r13 = (defpackage.ctr) r13
            bgs r0 = new bgs
            java.lang.String r1 = "i"
            java.lang.Object r1 = r14.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "m"
            java.lang.Object r1 = r14.get(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "p"
            java.lang.Object r1 = r14.get(r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r1 = "c"
            java.lang.Object r1 = r14.get(r1)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = "f"
            java.lang.Object r1 = r14.get(r1)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = "e"
            java.lang.Object r14 = r14.get(r1)
            r10 = r14
            java.lang.String r10 = (java.lang.String) r10
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r13.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfl.zza(java.lang.Object, java.util.Map):void");
    }
}
