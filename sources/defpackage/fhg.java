package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.zzal;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fhg reason: default package */
final class fhg {
    private static int a;
    private static PendingIntent b;
    private final dv<String, eya<Bundle>> c = new dv<>();
    private final Context d;
    private final fha e;
    private Messenger f;
    private Messenger g;
    private fhy h;

    public fhg(Context context, fha fha) {
        this.d = context;
        this.e = fha;
        this.f = new Messenger(new fhh(this, Looper.getMainLooper()));
    }

    private static synchronized String a() {
        String num;
        synchronized (fhg.class) {
            int i = a;
            a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (fhg.class) {
            if (b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", b);
        }
    }

    static /* synthetic */ void a(fhg fhg, Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new a());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof fhy) {
                    fhg.h = (fhy) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    fhg.g = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            String action = intent2.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "Unexpected response action: ";
                    String valueOf = String.valueOf(action);
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        new String(str);
                    }
                }
                return;
            }
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra(LogMessage.SEVERITY_ERROR);
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf2);
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str2 = "Received InstanceID error ";
                    String valueOf3 = String.valueOf(stringExtra2);
                    if (valueOf3.length() != 0) {
                        str2.concat(valueOf3);
                    } else {
                        new String(str2);
                    }
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length > 2) {
                        if ("ID".equals(split[1])) {
                            String str3 = split[2];
                            String str4 = split[3];
                            if (str4.startsWith(":")) {
                                str4 = str4.substring(1);
                            }
                            fhg.a(str3, intent2.putExtra(LogMessage.SEVERITY_ERROR, str4).getExtras());
                            return;
                        }
                    }
                    String str5 = "Unexpected structured response ";
                    String valueOf4 = String.valueOf(stringExtra2);
                    if (valueOf4.length() != 0) {
                        str5.concat(valueOf4);
                    } else {
                        new String(str5);
                    }
                } else {
                    synchronized (fhg.c) {
                        for (int i = 0; i < fhg.c.size(); i++) {
                            fhg.a((String) fhg.c.b(i), intent2.getExtras());
                        }
                    }
                }
            } else {
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str6 = "Unexpected response string: ";
                        String valueOf5 = String.valueOf(stringExtra);
                        if (valueOf5.length() != 0) {
                            str6.concat(valueOf5);
                        } else {
                            new String(str6);
                        }
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                fhg.a(group, extras);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r3, android.os.Bundle r4) {
        /*
            r2 = this;
            dv<java.lang.String, eya<android.os.Bundle>> r0 = r2.c
            monitor-enter(r0)
            dv<java.lang.String, eya<android.os.Bundle>> r1 = r2.c     // Catch:{ all -> 0x0029 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0029 }
            eya r1 = (defpackage.eya) r1     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0029 }
            int r1 = r3.length()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001d
            r4.concat(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0022
        L_0x001d:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0029 }
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0024:
            r1.a(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhg.a(java.lang.String, android.os.Bundle):void");
    }

    private final Bundle b(Bundle bundle) {
        Bundle c2 = c(bundle);
        if (c2 == null) {
            return c2;
        }
        String str = "google.messenger";
        if (!c2.containsKey(str)) {
            return c2;
        }
        Bundle c3 = c(bundle);
        if (c3 == null || !c3.containsKey(str)) {
            return c3;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle c(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = a()
            eya r1 = new eya
            r1.<init>()
            dv<java.lang.String, eya<android.os.Bundle>> r2 = r7.c
            monitor-enter(r2)
            dv<java.lang.String, eya<android.os.Bundle>> r3 = r7.c     // Catch:{ all -> 0x0109 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0109 }
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            fha r2 = r7.e
            int r2 = r2.a()
            if (r2 == 0) goto L_0x0101
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            fha r3 = r7.e
            int r3 = r3.a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r8)
            android.content.Context r8 = r7.d
            a(r8, r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x008d
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
        L_0x008d:
            android.os.Messenger r3 = r7.f
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.g
            if (r3 != 0) goto L_0x009c
            fhy r3 = r7.h
            if (r3 == 0) goto L_0x00b7
        L_0x009c:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.g     // Catch:{ RemoteException -> 0x00b2 }
            if (r5 == 0) goto L_0x00ac
            android.os.Messenger r5 = r7.g     // Catch:{ RemoteException -> 0x00b2 }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x00ca
        L_0x00ac:
            fhy r5 = r7.h     // Catch:{ RemoteException -> 0x00b2 }
            r5.a(r3)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x00ca
        L_0x00b2:
            java.lang.String r3 = "FirebaseInstanceId"
            android.util.Log.isLoggable(r3, r8)
        L_0x00b7:
            fha r8 = r7.e
            int r8 = r8.a()
            if (r8 != r4) goto L_0x00c5
            android.content.Context r8 = r7.d
            r8.sendBroadcast(r2)
            goto L_0x00ca
        L_0x00c5:
            android.content.Context r8 = r7.d
            r8.startService(r2)
        L_0x00ca:
            eys<TResult> r8 = r1.a     // Catch:{ InterruptedException | TimeoutException -> 0x00ec, ExecutionException -> 0x00e5 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00ec, ExecutionException -> 0x00e5 }
            java.lang.Object r8 = defpackage.eyc.a(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00ec, ExecutionException -> 0x00e5 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x00ec, ExecutionException -> 0x00e5 }
            dv<java.lang.String, eya<android.os.Bundle>> r1 = r7.c
            monitor-enter(r1)
            dv<java.lang.String, eya<android.os.Bundle>> r2 = r7.c     // Catch:{ all -> 0x00e0 }
            r2.remove(r0)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e0 }
            return r8
        L_0x00e0:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e0 }
            throw r8
        L_0x00e3:
            r8 = move-exception
            goto L_0x00f4
        L_0x00e5:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00e3 }
            r1.<init>(r8)     // Catch:{ all -> 0x00e3 }
            throw r1     // Catch:{ all -> 0x00e3 }
        L_0x00ec:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00e3 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00e3 }
            throw r8     // Catch:{ all -> 0x00e3 }
        L_0x00f4:
            dv<java.lang.String, eya<android.os.Bundle>> r1 = r7.c
            monitor-enter(r1)
            dv<java.lang.String, eya<android.os.Bundle>> r2 = r7.c     // Catch:{ all -> 0x00fe }
            r2.remove(r0)     // Catch:{ all -> 0x00fe }
            monitor-exit(r1)     // Catch:{ all -> 0x00fe }
            throw r8
        L_0x00fe:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fe }
            throw r8
        L_0x0101:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0109:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhg.c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: 0000 */
    public final Bundle a(Bundle bundle) {
        Object obj;
        if (this.e.d() < 12000000) {
            return b(bundle);
        }
        fgq a2 = fgq.a(this.d);
        exz a3 = a2.a((fgy<T>) new fgz<T>(a2.a(), bundle));
        try {
            bxo.c("Must not be called on the main application thread");
            bxo.a(a3, (Object) "Task must not be null");
            if (a3.a()) {
                obj = eyc.a(a3);
            } else {
                a aVar = new a(0);
                eyc.a(a3, aVar);
                aVar.a.await();
                obj = eyc.a(a3);
            }
            return (Bundle) obj;
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
            }
            if (!(e2.getCause() instanceof zzal) || ((zzal) e2.getCause()).errorCode != 4) {
                return null;
            }
            return b(bundle);
        }
    }
}
