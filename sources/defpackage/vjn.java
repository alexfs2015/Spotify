package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: vjn reason: default package */
final class vjn implements a {
    private static final long a = TimeUnit.SECONDS.toMillis(1);
    private final Charset b = Charset.forName("UTF-8");
    private final Path c;
    private final Random d;
    private final ScheduledExecutorService e;
    private final jrp f;
    private final Object g;
    private final dv<String, ho<Future<String>, Future<Boolean>>> h;
    private final boolean i;
    private ScheduledFuture<?> j;
    private volatile long k;

    vjn(Path path, ScheduledExecutorService scheduledExecutorService, Random random, jrp jrp, boolean z) {
        this.e = scheduledExecutorService;
        this.d = random;
        this.f = jrp;
        this.i = false;
        this.c = path;
        this.h = new dv<>(10);
        this.g = new Object();
    }

    private boolean a(Future<String> future) {
        if (!future.isDone()) {
            Assertion.b("ServiceStarter process queue locked");
        }
        try {
            String str = (String) future.get();
            if (str != null) {
                return Files.deleteIfExists(this.c.resolve(str));
            }
            return false;
        } catch (IOException | InterruptedException | ExecutionException e2) {
            Logger.e(e2, "", new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r0 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.nio.file.Path r0 = r6.c     // Catch:{ IOException -> 0x0041 }
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0)     // Catch:{ IOException -> 0x0041 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x000a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0038 }
            java.nio.file.Path r2 = (java.nio.file.Path) r2     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x000a }
            byte[] r4 = java.nio.file.Files.readAllBytes(r2)     // Catch:{ IOException -> 0x000a }
            java.nio.charset.Charset r5 = r6.b     // Catch:{ IOException -> 0x000a }
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x000a }
            boolean r2 = java.nio.file.Files.deleteIfExists(r2)     // Catch:{ IOException -> 0x000a }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r4 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x000a
            com.spotify.mobile.android.util.Assertion.c(r3)     // Catch:{ all -> 0x0038 }
            goto L_0x000a
        L_0x0031:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x004a
        L_0x0037:
            return
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            if (r0 == 0) goto L_0x0040
            r0.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r1     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = ""
            com.spotify.base.java.logging.Logger.e(r0, r2, r1)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjn.a():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String b(String str, String str2, Object... objArr) {
        Path resolve = this.c.resolve(str);
        if (Files.exists(resolve, new LinkOption[0])) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(", meta=");
        sb.append(Arrays.toString(objArr));
        try {
            Files.write(resolve, sb.toString().getBytes(this.b), new OpenOption[]{StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE});
            return str;
        } catch (IOException unused) {
            return null;
        }
    }

    public final void a(Context context, Intent intent, String str, Object... objArr) {
        String format;
        if (this.j == null) {
            this.j = this.e.scheduleWithFixedDelay(new $$Lambda$3YrUP301uD4piT1dC9qOc3ZhX_c(this), 20, 300, TimeUnit.SECONDS);
        }
        long c2 = this.f.c();
        boolean z = c2 - this.k > a;
        synchronized (this.g) {
            while (true) {
                format = String.format(Locale.US, "%d%d", new Object[]{Long.valueOf(this.f.c()), Long.valueOf(this.d.nextLong())});
                if (!this.h.containsKey(format)) {
                    if (!this.i) {
                        if (!z || this.d.nextFloat() >= 0.1f) {
                            this.h.put(format, null);
                        }
                    }
                    this.k = c2;
                    ScheduledFuture schedule = this.e.schedule(new $$Lambda$vjn$SiFPR_2ujGIy_KoSIjTRIDC7hLc(this, format, str, objArr), 2, TimeUnit.SECONDS);
                    this.h.put(format, ho.a(schedule, this.e.schedule(new $$Lambda$vjn$TJsj6YKXhIG8wDq4VbZntFkAIc(this, schedule), 8, TimeUnit.SECONDS)));
                } else {
                    Intent intent2 = intent;
                    String str2 = str;
                    Object[] objArr2 = objArr;
                }
            }
            while (true) {
            }
        }
        intent.putExtra("ServiceGraveyardCaretaker.INTENT_KEY_ID", format);
        context.startForegroundService(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean b(Future future) {
        return Boolean.valueOf(a(future));
    }

    public final void a(Intent intent) {
        ho hoVar;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("ServiceGraveyardCaretaker.INTENT_KEY_ID");
            if (stringExtra != null && !stringExtra.isEmpty()) {
                synchronized (this.g) {
                    hoVar = (ho) this.h.get(stringExtra);
                }
                if (hoVar != null) {
                    if (hoVar.a != null) {
                        ((Future) hoVar.a).cancel(true);
                    }
                    if (hoVar.b != null) {
                        ((Future) hoVar.b).cancel(true);
                    }
                }
                this.e.execute(new $$Lambda$vjn$NQzrWnZozSnSuiu2YWLcwjHuJg(this, stringExtra));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        a((Future<String>) feg.a(str));
    }
}
