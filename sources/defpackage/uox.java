package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.sociallistening.model.HostSession;
import com.spotify.music.sociallistening.model.Notification.Reason;
import com.spotify.music.sociallistening.model.Participant;
import com.spotify.music.sociallistening.model.Session;
import java.util.Comparator;
import java.util.List;

/* renamed from: uox reason: default package */
public final class uox {

    /* renamed from: uox$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Reason.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.sociallistening.model.Notification$Reason[] r0 = com.spotify.music.sociallistening.model.Notification.Reason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.sociallistening.model.Notification$Reason r1 = com.spotify.music.sociallistening.model.Notification.Reason.c     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.sociallistening.model.Notification$Reason r1 = com.spotify.music.sociallistening.model.Notification.Reason.a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.sociallistening.model.Notification$Reason r1 = com.spotify.music.sociallistening.model.Notification.Reason.b     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uox.AnonymousClass1.<clinit>():void");
        }
    }

    private static ImmutableList<Participant> a(List<Participant> list, String str) {
        return ImmutableList.a((Comparator<? super E>) new $$Lambda$uox$V0IgJADSKWI5zecr7D0mSfBzEOg<Object>(str), (Iterable<? extends E>) list);
    }

    public static kmw<uoy, uov> a(uoy uoy) {
        Logger.b("social listening hub: init", new Object[0]);
        return kmw.a(uoy.o().a(false).d(false).e(false).f(false).g(false).h(false).c(true).a(), kmt.a(new c()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, a aVar) {
        uoy uoy2;
        String n = uoy.n();
        String str = aVar.a;
        if (!n.isEmpty() && !n.equals(str)) {
            return kng.b(uoy.a.a(uoy.d()).a(str));
        }
        boolean q = uoy.q();
        a j = ImmutableSet.j();
        if (uoy.c().isEmpty() || fdd.c(uoy.m(), new $$Lambda$uox$R0rq83vYVlYxr8B8aQ6eRoWarcQ(str))) {
            uoy2 = uoy.o().c(str).a(a((List<Participant>) uoy.m(), str)).a();
        } else {
            uoy2 = uoy.p().a(str).a(true);
            j.b(new d());
        }
        a(uoy2, q, j);
        return kng.a(uoy2, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, b bVar) {
        if (!uoy.f()) {
            return kng.e();
        }
        boolean q = uoy.q();
        a j = ImmutableSet.j();
        uoy a = uoy.o().a(true).c(false).a();
        Session session = bVar.a;
        uoy b = session == Session.EMPTY ? a.b(true) : a(a, session);
        a(b, q, j);
        return kng.a(b, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, c cVar) {
        uoy a = uoy.o().a(true).c(false).a();
        Session session = cVar.a;
        if (session == Session.EMPTY) {
            Logger.b("social listening hub: no session available", new Object[0]);
            return kng.b(a);
        }
        boolean q = a.q();
        a j = ImmutableSet.j();
        uoy a2 = a(a, session);
        a(a2, q, j);
        return kng.a(a2, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, d dVar) {
        if (!uoy.f()) {
            return kng.e();
        }
        uoy a = uoy.o().a(true).c(false).a();
        boolean q = a.q();
        a j = ImmutableSet.j();
        HostSession hostSession = dVar.a;
        uoy b = hostSession == HostSession.EMPTY ? a.a(false).b(true) : a(a, hostSession.session());
        a(b, q, j);
        return kng.a(b, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, e eVar) {
        if (uoy.h()) {
            return kng.e();
        }
        StringBuilder sb = new StringBuilder("spotify:socialsession:");
        sb.append(eVar.a);
        String sb2 = sb.toString();
        if (sb2.equals(uoy.l())) {
            Logger.b("social listening hub: Tried to join current session", new Object[0]);
            return kng.e();
        }
        return kng.a(uoy.p().o().e(true).b(sb2).a(), kmt.a(new e(eVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, f fVar) {
        uoy uoy2;
        if (!uoy.h()) {
            return kng.e();
        }
        uoy a = uoy.o().a(true).e(false).a();
        boolean q = a.q();
        a j = ImmutableSet.j();
        Session session = fVar.a;
        if (session == Session.EMPTY) {
            Logger.e("social listening hub: joining failed", new Object[0]);
            uoy2 = a.p().o().f(true).a();
        } else {
            Logger.b("social listening hub: joining successful", new Object[0]);
            uoy2 = a(a, session);
        }
        a(uoy2, q, j);
        return kng.a(uoy2, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, g gVar) {
        if (uoy.c().isEmpty() || uoy.j()) {
            Logger.e("social listening hub: Cannot leave session with current outstanding backend requests", new Object[0]);
            return kng.e();
        }
        boolean q = uoy.q();
        a j = ImmutableSet.j();
        if (uoy.e()) {
            j.b(new a(uoy.c()));
        } else {
            j.b(new f(uoy.c()));
        }
        uoy c = uoy.p().c(true);
        a(c, q, j);
        return kng.a(c, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, h hVar) {
        if (!hVar.a) {
            return kng.a(uoy, kmt.a(new c()));
        } else if (uoy.f()) {
            Logger.e("social listening hub: Tried to obtain session while obtaining is already in progress", new Object[0]);
            return kng.e();
        } else if (uoy.h()) {
            Logger.b("social listening hub: Obtain session while a join session in progress, skipping obtain.", new Object[0]);
            return kng.e();
        } else {
            return kng.a(uoy.o().c(true).e(false).d(false).f(false).h(false).a(), kmt.a(new b()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, i iVar) {
        if (uoy.f()) {
            return kng.b(uoy.c(false));
        }
        return kng.a(uoy.o().c(true).g(false).e(false).h(false).a(), kmt.a(new d()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(uoy uoy, j jVar) {
        if (uoy.b() > jVar.a.session().timestamp()) {
            return kng.e();
        }
        if (uoy.h() || uoy.f() || uoy.j()) {
            return kng.e();
        }
        Reason reason = jVar.a.reason();
        if (reason == Reason.a || uoy.c().equals(jVar.a.session().sessionId())) {
            boolean q = uoy.q();
            a j = ImmutableSet.j();
            int i = AnonymousClass1.a[reason.ordinal()];
            if (i == 1) {
                uoy = uoy.p().o().h(true).a();
            } else if (i == 2) {
                uoy = a(uoy, jVar.a.session()).o().a(true).a();
            } else if (i == 3) {
                Session session = jVar.a.session();
                String n = uoy.n();
                if (n.isEmpty() || fdd.c(session.participants(), new $$Lambda$uox$6TxKbsv16Dg20eadml7rTeC7Sw(n))) {
                    uoy = a(uoy, session);
                } else {
                    Logger.b("social listening hub: Ending session since we are not in the participant list", new Object[0]);
                    uoy = uoy.p().a(true);
                    j.b(new d());
                }
            }
            a(uoy, q, j);
            return kng.a(uoy, j.a());
        }
        Logger.b("social listening hub: Ignoring notification from other session", new Object[0]);
        return kng.e();
    }

    public static kng<uoy, uov> a(uoy uoy, uow uow) {
        return (kng) uow.a(new $$Lambda$uox$E10xsQUbDlKRZvHcLd7zrylbbE(uoy), new $$Lambda$uox$0XU1r6l1W3O6WNDiRgPcY9pfJw(uoy), new $$Lambda$uox$9fDx7QAghz5VnY4lYJjWvDQYaI(uoy), new $$Lambda$uox$nC3EC3kpe5cbHksvwnjDceXLjzA(uoy), new $$Lambda$uox$Z9Hi32sGN0TLOdHu1rlrpFozMI(uoy), new $$Lambda$uox$5Be13tDqXb2sstZS681zS2_mqM(uoy), new $$Lambda$uox$NryGNzR0XG2wgH1ohlzaFEyLMY(uoy), new $$Lambda$uox$PrrVD_Vw2cjqTPY3LzA3zj7oPX4(uoy), new $$Lambda$uox$LXeB7kqVSxaznzTVHX3pnaQ77mU(uoy), new $$Lambda$uox$zaVOmNm6hBfyEZSn9KYkbc8tD4(uoy), new $$Lambda$uox$ix3I5FvE7R4L9B4TbcBdcTDmKwE(uoy));
    }

    private static uoy a(uoy uoy, Session session) {
        return uoy.b() > session.timestamp() ? uoy : uoy.o().a(session.timestamp()).a(session.sessionId()).b(session.isSessionOwner()).b(session.joinSessionUri()).a(a(session.participants(), uoy.n())).a();
    }

    private static void a(uoy uoy, boolean z, a<uov> aVar) {
        boolean q = uoy.q();
        if (z != q) {
            aVar.b(uov.a(q));
        }
    }
}
