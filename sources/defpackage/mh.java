package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: mh reason: default package */
public final class mh {
    private static final Object f = new Object();
    private static mh g;
    final Context a;
    final HashMap<BroadcastReceiver, ArrayList<b>> b = new HashMap<>();
    final ArrayList<a> c = new ArrayList<>();
    private final HashMap<String, ArrayList<b>> d = new HashMap<>();
    private final Handler e;

    /* renamed from: mh$a */
    static final class a {
        final Intent a;
        final ArrayList<b> b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    /* renamed from: mh$b */
    static final class b {
        final IntentFilter a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private mh(Context context) {
        this.a = context;
        this.e = new Handler(context.getMainLooper()) {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
                r2 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
                if (r2 >= r1.length) goto L_0x000b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
                r3 = r1[r2];
                r4 = r3.b.size();
                r5 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
                if (r5 >= r4) goto L_0x004d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
                r6 = (defpackage.mh.b) r3.b.get(r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
                if (r6.d != false) goto L_0x004a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
                r6.b.onReceive(r10.a, r3.a);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
                r5 = r5 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
                r2 = r2 + 1;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r10) {
                /*
                    r9 = this;
                    int r0 = r10.what
                    r1 = 1
                    if (r0 == r1) goto L_0x0009
                    super.handleMessage(r10)
                    goto L_0x0017
                L_0x0009:
                    mh r10 = defpackage.mh.this
                L_0x000b:
                    java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<mh$b>> r0 = r10.b
                    monitor-enter(r0)
                    java.util.ArrayList<mh$a> r1 = r10.c     // Catch:{ all -> 0x0050 }
                    int r1 = r1.size()     // Catch:{ all -> 0x0050 }
                    if (r1 > 0) goto L_0x0018
                    monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                L_0x0017:
                    return
                L_0x0018:
                    mh$a[] r1 = new defpackage.mh.a[r1]     // Catch:{ all -> 0x0050 }
                    java.util.ArrayList<mh$a> r2 = r10.c     // Catch:{ all -> 0x0050 }
                    r2.toArray(r1)     // Catch:{ all -> 0x0050 }
                    java.util.ArrayList<mh$a> r2 = r10.c     // Catch:{ all -> 0x0050 }
                    r2.clear()     // Catch:{ all -> 0x0050 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                    r0 = 0
                    r2 = 0
                L_0x0027:
                    int r3 = r1.length
                    if (r2 >= r3) goto L_0x000b
                    r3 = r1[r2]
                    java.util.ArrayList<mh$b> r4 = r3.b
                    int r4 = r4.size()
                    r5 = 0
                L_0x0033:
                    if (r5 >= r4) goto L_0x004d
                    java.util.ArrayList<mh$b> r6 = r3.b
                    java.lang.Object r6 = r6.get(r5)
                    mh$b r6 = (defpackage.mh.b) r6
                    boolean r7 = r6.d
                    if (r7 != 0) goto L_0x004a
                    android.content.BroadcastReceiver r6 = r6.b
                    android.content.Context r7 = r10.a
                    android.content.Intent r8 = r3.a
                    r6.onReceive(r7, r8)
                L_0x004a:
                    int r5 = r5 + 1
                    goto L_0x0033
                L_0x004d:
                    int r2 = r2 + 1
                    goto L_0x0027
                L_0x0050:
                    r10 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                    goto L_0x0054
                L_0x0053:
                    throw r10
                L_0x0054:
                    goto L_0x0053
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mh.AnonymousClass1.handleMessage(android.os.Message):void");
            }
        };
    }

    public static mh a(Context context) {
        mh mhVar;
        synchronized (f) {
            if (g == null) {
                g = new mh(context.getApplicationContext());
            }
            mhVar = g;
        }
        return mhVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b bVar = (b) arrayList.get(size);
                    bVar.d = true;
                    for (int i = 0; i < bVar.a.countActions(); i++) {
                        String action = bVar.a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.d.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = (b) arrayList2.get(size2);
                                if (bVar2.b == broadcastReceiver) {
                                    bVar2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.d.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.d.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.d.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0130, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0133, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<mh$b>> r2 = r1.b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x0134 }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x0134 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0134 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x0134 }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x0134 }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x0134 }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x0134 }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x0134 }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            if (r16 == 0) goto L_0x004b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = "Resolving type "
            r3.<init>(r4)     // Catch:{ all -> 0x0134 }
            r3.append(r11)     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = " scheme "
            r3.append(r4)     // Catch:{ all -> 0x0134 }
            r3.append(r13)     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = " of intent "
            r3.append(r4)     // Catch:{ all -> 0x0134 }
            r3.append(r0)     // Catch:{ all -> 0x0134 }
        L_0x004b:
            java.util.HashMap<java.lang.String, java.util.ArrayList<mh$b>> r3 = r1.d     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x0134 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0134 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0134 }
            if (r8 == 0) goto L_0x0131
            if (r16 == 0) goto L_0x0066
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = "Action list: "
            r3.<init>(r4)     // Catch:{ all -> 0x0134 }
            r3.append(r8)     // Catch:{ all -> 0x0134 }
        L_0x0066:
            r3 = 0
            r6 = r3
            r7 = 0
        L_0x0069:
            int r3 = r8.size()     // Catch:{ all -> 0x0134 }
            if (r7 >= r3) goto L_0x0101
            java.lang.Object r3 = r8.get(r7)     // Catch:{ all -> 0x0134 }
            r5 = r3
            mh$b r5 = (defpackage.mh.b) r5     // Catch:{ all -> 0x0134 }
            if (r16 == 0) goto L_0x0084
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = "Matching against filter "
            r3.<init>(r4)     // Catch:{ all -> 0x0134 }
            android.content.IntentFilter r4 = r5.a     // Catch:{ all -> 0x0134 }
            r3.append(r4)     // Catch:{ all -> 0x0134 }
        L_0x0084:
            boolean r3 = r5.c     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x0094
            r19 = r7
            r20 = r8
            r18 = r10
            r21 = r11
            r11 = 1
            r10 = r6
            goto L_0x00f5
        L_0x0094:
            android.content.IntentFilter r3 = r5.a     // Catch:{ all -> 0x0134 }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r10
            r10 = r6
            r6 = r13
            r19 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = 1
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0134 }
            if (r3 < 0) goto L_0x00cf
            if (r16 == 0) goto L_0x00c0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = "  Filter matched!  match=0x"
            r4.<init>(r5)     // Catch:{ all -> 0x0134 }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x0134 }
            r4.append(r3)     // Catch:{ all -> 0x0134 }
        L_0x00c0:
            if (r10 != 0) goto L_0x00c8
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0134 }
            r6.<init>()     // Catch:{ all -> 0x0134 }
            goto L_0x00c9
        L_0x00c8:
            r6 = r10
        L_0x00c9:
            r6.add(r15)     // Catch:{ all -> 0x0134 }
            r15.c = r11     // Catch:{ all -> 0x0134 }
            goto L_0x00f6
        L_0x00cf:
            if (r16 == 0) goto L_0x00f5
            r4 = -4
            if (r3 == r4) goto L_0x00e9
            r4 = -3
            if (r3 == r4) goto L_0x00e6
            r4 = -2
            if (r3 == r4) goto L_0x00e3
            r4 = -1
            if (r3 == r4) goto L_0x00e0
            java.lang.String r3 = "unknown reason"
            goto L_0x00eb
        L_0x00e0:
            java.lang.String r3 = "type"
            goto L_0x00eb
        L_0x00e3:
            java.lang.String r3 = "data"
            goto L_0x00eb
        L_0x00e6:
            java.lang.String r3 = "action"
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r3 = "category"
        L_0x00eb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = "  Filter did not match: "
            r4.<init>(r5)     // Catch:{ all -> 0x0134 }
            r4.append(r3)     // Catch:{ all -> 0x0134 }
        L_0x00f5:
            r6 = r10
        L_0x00f6:
            int r7 = r19 + 1
            r10 = r18
            r8 = r20
            r11 = r21
            r9 = 1
            goto L_0x0069
        L_0x0101:
            r10 = r6
            r11 = 1
            if (r10 == 0) goto L_0x0131
            r3 = 0
        L_0x0106:
            int r4 = r10.size()     // Catch:{ all -> 0x0134 }
            if (r3 >= r4) goto L_0x0118
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x0134 }
            mh$b r4 = (defpackage.mh.b) r4     // Catch:{ all -> 0x0134 }
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x0134 }
            int r3 = r3 + 1
            goto L_0x0106
        L_0x0118:
            java.util.ArrayList<mh$a> r3 = r1.c     // Catch:{ all -> 0x0134 }
            mh$a r4 = new mh$a     // Catch:{ all -> 0x0134 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x0134 }
            r3.add(r4)     // Catch:{ all -> 0x0134 }
            android.os.Handler r0 = r1.e     // Catch:{ all -> 0x0134 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x012f
            android.os.Handler r0 = r1.e     // Catch:{ all -> 0x0134 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x0134 }
        L_0x012f:
            monitor-exit(r2)     // Catch:{ all -> 0x0134 }
            return r11
        L_0x0131:
            monitor-exit(r2)     // Catch:{ all -> 0x0134 }
            r0 = 0
            return r0
        L_0x0134:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0134 }
            goto L_0x0138
        L_0x0137:
            throw r0
        L_0x0138:
            goto L_0x0137
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh.a(android.content.Intent):boolean");
    }
}
