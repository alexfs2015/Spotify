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

/* renamed from: gba reason: default package */
public final class gba implements MovingOrchestrator {
    gbe a;
    gaz b;
    UncaughtExceptionHandler c;
    private gbe d;
    private State e;
    private final Set<a> f = new CopyOnWriteArraySet();

    private void a(State state) {
        this.e = state;
        for (a a2 : this.f) {
            a2.a();
        }
    }

    private static void a(gbe gbe, String str) {
        gbe.a("moving-state", "sending").a("destination", str).a();
    }

    private boolean a(gbd gbd) {
        a(State.SYNCING);
        a(this.a, this.d.a.getAbsolutePath());
        b(this.d, this.a.a.getAbsolutePath());
        this.c = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(d());
        boolean b2 = b(gbd);
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

    private static boolean a(gbe gbe) {
        return "cancelled".equals(gbe.a("moving-state"));
    }

    private static void b(gbe gbe, String str) {
        gbe.a("moving-state", "receiving").a("source", str).a();
    }

    private boolean b(gbd gbd) {
        this.b = new gaz(this.a.a, this.d.a, gbd);
        return this.b.a();
    }

    private static void c(gbe gbe, String str) {
        gbe.a("moving-state", "sent").a("destination", str).a();
    }

    private UncaughtExceptionHandler d() {
        return new UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                gba.this.a.b();
                gba.this.a.a("moving-state", "cancelled").a();
                gba.this.b.a.compareAndSet(Boolean.TRUE, Boolean.FALSE);
                gba.this.c.uncaughtException(thread, th);
            }
        };
    }

    private static void d(gbe gbe, String str) {
        gbe.a("moving-state", "received").a("source", str).a();
    }

    public final State a() {
        return this.e;
    }

    public final SyncingResult a(String str, gbd gbd) {
        this.d = new gbe(str);
        try {
            return a(this.a) ? SyncingResult.AN_ERROR_WHILE_SYNCING : a(gbd) ? SyncingResult.SOMETHING_SYNCED : SyncingResult.EVERYTHING_IN_SYNC;
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

    public final void a(String str) {
        this.a = new gbe(str);
        a(State.IDLE);
        String str2 = "moving-state";
        String str3 = "destination";
        if ("sending".equals(this.a.a(str2))) {
            a(State.SYNCING);
            this.d = new gbe((String) fbp.a(this.a.a(str3)));
            return;
        }
        if ("sent".equals(this.a.a(str2))) {
            a(State.SYNCED);
            this.d = new gbe((String) fbp.a(this.a.a(str3)));
            return;
        }
        if ("received".equals(this.a.a(str2))) {
            a(State.SYNCED);
            gbe gbe = this.a;
            this.d = gbe;
            this.a = new gbe((String) fbp.a(gbe.a("source")));
            return;
        }
        if (a(this.a)) {
            a(State.CANCELLED);
            this.d = this.a;
        }
    }

    public final String b() {
        if (this.d == null || this.e == State.IDLE) {
            throw new IllegalStateException("Could not finalize move");
        }
        try {
            a(gbd.a);
            if (!a(this.a)) {
                a(State.PRUNING);
                xdj.a(this.a.a);
                this.d.b();
            }
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder("Unable to delete old cache folder: ");
            sb.append(this.a.a.getAbsolutePath());
            throw new SyncError(sb.toString());
        } catch (SyncError unused2) {
        }
        a(State.IDLE);
        this.a = new gbe(this.d.a);
        return this.a.a.getAbsolutePath();
    }

    public final void c() {
        try {
            if (this.d != null) {
                xdj.a(this.d.a);
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
}
