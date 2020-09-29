package defpackage;

import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.android.storage.MovingOrchestrator.State;
import com.spotify.android.storage.MovingOrchestrator.SyncingResult;
import com.spotify.android.storage.MovingOrchestrator.a;
import com.spotify.android.storage.SyncError;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: gag reason: default package */
public final class gag implements MovingOrchestrator {
    gak a;
    gaf b;
    UncaughtExceptionHandler c;
    private gak d;
    private State e;
    private final Set<a> f = new CopyOnWriteArraySet();

    public final void a(String str) {
        this.a = new gak(str);
        a(State.IDLE);
        String str2 = "moving-state";
        String str3 = "destination";
        if ("sending".equals(this.a.a(str2))) {
            a(State.SYNCING);
            this.d = new gak((String) fay.a(this.a.a(str3)));
            return;
        }
        if ("sent".equals(this.a.a(str2))) {
            a(State.SYNCED);
            this.d = new gak((String) fay.a(this.a.a(str3)));
            return;
        }
        if ("received".equals(this.a.a(str2))) {
            a(State.SYNCED);
            gak gak = this.a;
            this.d = gak;
            this.a = new gak((String) fay.a(gak.a("source")));
            return;
        }
        if (a(this.a)) {
            a(State.CANCELLED);
            this.d = this.a;
        }
    }

    public final State a() {
        return this.e;
    }

    public final String b() {
        if (this.d == null || this.e == State.IDLE) {
            throw new IllegalStateException("Could not finalize move");
        }
        try {
            a(gaj.a);
            if (!a(this.a)) {
                a(State.PRUNING);
                wpd.a(this.a.a);
                this.d.b();
            }
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder("Unable to delete old cache folder: ");
            sb.append(this.a.a.getAbsolutePath());
            throw new SyncError(sb.toString());
        } catch (SyncError unused2) {
        }
        a(State.IDLE);
        this.a = new gak(this.d.a);
        return this.a.a.getAbsolutePath();
    }

    private boolean a(gaj gaj) {
        a(State.SYNCING);
        a(this.a, this.d.a.getAbsolutePath());
        b(this.d, this.a.a.getAbsolutePath());
        this.c = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(d());
        boolean b2 = b(gaj);
        if (a(this.a)) {
            a(State.CANCELLED);
        } else {
            c(this.a, this.d.a.getAbsolutePath());
            d(this.d, this.a.a.getAbsolutePath());
            a(State.SYNCED);
        }
        Thread.setDefaultUncaughtExceptionHandler(this.c);
        return b2;
    }

    private boolean b(gaj gaj) {
        this.b = new gaf(this.a.a, this.d.a, gaj);
        return this.b.a();
    }

    private void a(State state) {
        this.e = state;
        for (a a2 : this.f) {
            a2.a();
        }
    }

    public final SyncingResult a(String str, gaj gaj) {
        this.d = new gak(str);
        try {
            boolean a2 = a(gaj);
            if (a(this.a)) {
                return SyncingResult.AN_ERROR_WHILE_SYNCING;
            }
            return a2 ? SyncingResult.SOMETHING_SYNCED : SyncingResult.EVERYTHING_IN_SYNC;
        } catch (SyncError unused) {
            for (a b2 : this.f) {
                b2.b();
            }
            return SyncingResult.AN_ERROR_WHILE_SYNCING;
        }
    }

    public final void a(a aVar) {
        this.f.add(aVar);
    }

    public final void c() {
        try {
            if (this.d != null) {
                wpd.a(this.d.a);
            }
            this.a.b();
            a(State.IDLE);
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder("Unable to revert change: ");
            sb.append(e2.getMessage());
            throw new SyncError(sb.toString());
        } catch (Throwable th) {
            a(State.IDLE);
            throw th;
        }
    }

    private UncaughtExceptionHandler d() {
        return new UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                gag.this.a.b();
                gag.this.a.a("moving-state", "cancelled").a();
                gag.this.b.a.compareAndSet(Boolean.TRUE, Boolean.FALSE);
                gag.this.c.uncaughtException(thread, th);
            }
        };
    }

    private static boolean a(gak gak) {
        return "cancelled".equals(gak.a("moving-state"));
    }

    private static void a(gak gak, String str) {
        gak.a("moving-state", "sending").a("destination", str).a();
    }

    private static void b(gak gak, String str) {
        gak.a("moving-state", "receiving").a("source", str).a();
    }

    private static void c(gak gak, String str) {
        gak.a("moving-state", "sent").a("destination", str).a();
    }

    private static void d(gak gak, String str) {
        gak.a("moving-state", "received").a("source", str).a();
    }
}
