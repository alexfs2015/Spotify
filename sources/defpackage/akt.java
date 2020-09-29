package defpackage;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AccessTokenAppIdPair.SerializationProxyV1;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.PersistedEvents;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: akt reason: default package */
class akt {

    /* renamed from: akt$a */
    static class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public final ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(SerializationProxyV1.class);
            }
            return readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(AppEvent.SerializationProxyV1.class) : readClassDescriptor;
        }
    }

    akt() {
    }

    static {
        akt.class.getName();
    }

    public static synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, akx akx) {
        synchronized (akt.class) {
            PersistedEvents a2 = a();
            if (a2.events.containsKey(accessTokenAppIdPair)) {
                a2.a(accessTokenAppIdPair).addAll(akx.b());
            } else {
                a2.a(accessTokenAppIdPair, akx.b());
            }
            a(a2);
        }
    }

    public static synchronized void a(akr akr) {
        synchronized (akt.class) {
            PersistedEvents a2 = a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : akr.a()) {
                a2.a(accessTokenAppIdPair, akr.a(accessTokenAppIdPair).b());
            }
            a(a2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:16|17|19|20|21|22|23|24|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x004f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x005b A[SYNTHETIC, Splitter:B:43:0x005b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0031=Splitter:B:19:0x0031, B:24:0x003d=Splitter:B:24:0x003d, B:37:0x004f=Splitter:B:37:0x004f} */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.appevents.PersistedEvents a() {
        /*
            java.lang.Class<akt> r0 = defpackage.akt.class
            monitor-enter(r0)
            android.content.Context r1 = defpackage.akc.g()     // Catch:{ all -> 0x0062 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x004e, Exception -> 0x003e, all -> 0x0030 }
            akt$a r4 = new akt$a     // Catch:{ FileNotFoundException -> 0x004e, Exception -> 0x003e, all -> 0x0030 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x004e, Exception -> 0x003e, all -> 0x0030 }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x004e, Exception -> 0x003e, all -> 0x0030 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x004e, Exception -> 0x003e, all -> 0x0030 }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x004f, Exception -> 0x003f, all -> 0x002c }
            com.facebook.appevents.PersistedEvents r3 = (com.facebook.appevents.PersistedEvents) r3     // Catch:{ FileNotFoundException -> 0x004f, Exception -> 0x003f, all -> 0x002c }
            defpackage.amw.a(r4)     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x002a }
            r1.delete()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            r2 = r3
            goto L_0x0059
        L_0x002c:
            r2 = move-exception
            r3 = r2
            r2 = r4
            goto L_0x0031
        L_0x0030:
            r3 = move-exception
        L_0x0031:
            defpackage.amw.a(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x003d }
            r1.delete()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            throw r3     // Catch:{ all -> 0x0062 }
        L_0x003e:
            r4 = r2
        L_0x003f:
            defpackage.amw.a(r4)     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x004c }
        L_0x0048:
            r1.delete()     // Catch:{ Exception -> 0x004c }
            goto L_0x0059
        L_0x004c:
            goto L_0x0059
        L_0x004e:
            r4 = r2
        L_0x004f:
            defpackage.amw.a(r4)     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x004c }
            goto L_0x0048
        L_0x0059:
            if (r2 != 0) goto L_0x0060
            com.facebook.appevents.PersistedEvents r2 = new com.facebook.appevents.PersistedEvents     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
        L_0x0060:
            monitor-exit(r0)
            return r2
        L_0x0062:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0066
        L_0x0065:
            throw r1
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akt.a():com.facebook.appevents.PersistedEvents");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r6 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v3 java.io.ObjectOutputStream) = (r2v0 java.io.ObjectOutputStream), (r2v2 java.io.ObjectOutputStream), (r2v2 java.io.ObjectOutputStream), (r2v0 java.io.ObjectOutputStream) binds: [B:1:0x0007, B:12:0x0024, B:13:?, B:2:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.facebook.appevents.PersistedEvents r6) {
        /*
            java.lang.String r0 = "AppEventsLogger.persistedevents"
            android.content.Context r1 = defpackage.akc.g()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            r5 = 0
            java.io.FileOutputStream r5 = r1.openFileOutput(r0, r5)     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0022 }
            r3.writeObject(r6)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            defpackage.amw.a(r3)
            return
        L_0x001d:
            r6 = move-exception
            r2 = r3
            goto L_0x002c
        L_0x0020:
            r2 = r3
            goto L_0x0024
        L_0x0022:
            r6 = move-exception
            goto L_0x002c
        L_0x0024:
            java.io.File r6 = r1.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0030, all -> 0x0022 }
            r6.delete()     // Catch:{ Exception -> 0x0030, all -> 0x0022 }
            goto L_0x0030
        L_0x002c:
            defpackage.amw.a(r2)
            throw r6
        L_0x0030:
            defpackage.amw.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akt.a(com.facebook.appevents.PersistedEvents):void");
    }
}
