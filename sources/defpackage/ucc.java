package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.sociallistening.model.HostSession;
import com.spotify.music.sociallistening.model.Notification.Reason;
import com.spotify.music.sociallistening.model.Participant;
import com.spotify.music.sociallistening.model.Session;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ucc reason: default package */
public final class ucc {

    /* renamed from: ucc$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ucc.AnonymousClass1.<clinit>():void");
        }
    }

    public static kjn<ucd, uca> a(ucd ucd) {
        return kjn.a(ucd);
    }

    public static kjx<ucd, uca> a(ucd ucd, ucb ucb) {
        return (kjx) ucb.a(new $$Lambda$ucc$Vy6s1o1NIXegHH8QyZmYgjRyZPo(ucd), new $$Lambda$ucc$3qTL8vi3ABvmnCQEKP6rprMZclE(ucd), new $$Lambda$ucc$OHjM7UOkuLqYeJMWnFHJiNxc8YI(ucd), new $$Lambda$ucc$EqJbgDEYzLmMHqITDfc58msiBWY(ucd), new $$Lambda$ucc$ZNmrBij4SfdIwxCrFh40oFcIY4(ucd), new $$Lambda$ucc$hXIFiMcAbdG0R0mGDTEUMNVEuTc(ucd), new $$Lambda$ucc$FeB6pAuXbNrXFNjSycNf2w9Bn14(ucd), new $$Lambda$ucc$3p3SSRRQbAtj1TKFzC1njtdKxCo(ucd), new $$Lambda$ucc$m4xFLJw48etKAcomeCx1romVX8(ucd), new $$Lambda$ucc$zABpIzKR8W_7tmXyS837sB_79Eg(ucd), new $$Lambda$ucc$tFbtEE5BgIk8vU2Rq_sFwwgoS4(ucd));
    }

    private static ImmutableList<Participant> a(List<Participant> list, String str) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Participant participant : list) {
            if (a(participant)) {
                arrayList2.add(participant);
                arrayList.remove(participant);
                if (participant.username().equals(str)) {
                    break;
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Participant participant2 = (Participant) it.next();
                    if (participant2.username().equals(str)) {
                        arrayList2.add(participant2);
                        arrayList.remove(participant2);
                        break;
                    }
                }
            }
        }
        arrayList2.addAll(arrayList);
        return ImmutableList.a((Collection<? extends E>) arrayList2);
    }

    private static boolean a(Participant participant) {
        if (participant.isHost() == null) {
            return false;
        }
        return participant.isHost().booleanValue();
    }

    private static void a(ucd ucd, boolean z, a<uca> aVar) {
        boolean p = ucd.p();
        if (z != p) {
            aVar.b(uca.a(p));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, i iVar) {
        if (ucd.e()) {
            return kjx.b(ucd.d(false));
        }
        return kjx.a(ucd.n().c(true).g(false).e(false).h(false).a(), kjk.a(new d()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, d dVar) {
        ucd ucd2;
        if (!ucd.e()) {
            return kjx.e();
        }
        ucd a = ucd.a(true);
        boolean p = a.p();
        a j = ImmutableSet.j();
        HostSession hostSession = dVar.a;
        if (hostSession == HostSession.EMPTY) {
            ucd2 = a.b(false).c(true);
        } else {
            ucd2 = a.n().a(hostSession.sessionId()).b(hostSession.session().isSessionOwner()).c(false).b(hostSession.joinSessionUri()).a(a(hostSession.session().participants(), a.m())).a();
        }
        a(ucd2, p, j);
        return kjx.a(ucd2, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, f fVar) {
        ucd ucd2;
        if (!ucd.g()) {
            return kjx.e();
        }
        ucd a = ucd.a(true);
        boolean p = a.p();
        a j = ImmutableSet.j();
        Session session = fVar.a;
        if (session == Session.EMPTY) {
            Logger.e("social listening hub: joining failed", new Object[0]);
            ucd2 = a.o().n().f(true).a();
        } else {
            Logger.b("social listening hub: joining successful", new Object[0]);
            ucd2 = a.n().a(session.sessionId()).b(session.isSessionOwner()).e(false).b(session.joinSessionUri()).a(a(session.participants(), a.m())).a();
        }
        a(ucd2, p, j);
        return kjx.a(ucd2, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, c cVar) {
        ucd a = ucd.a(true);
        Session session = cVar.a;
        if (session == Session.EMPTY) {
            Logger.b("social listening hub: no session available", new Object[0]);
            return kjx.b(a);
        }
        boolean p = a.p();
        a j = ImmutableSet.j();
        ucd a2 = a.n().a(session.sessionId()).b(session.isSessionOwner()).c(false).b(session.joinSessionUri()).a(ImmutableList.a((Collection<? extends E>) session.participants())).a();
        a(a2, p, j);
        return kjx.a(a2, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, b bVar) {
        ucd ucd2;
        if (!ucd.e()) {
            return kjx.e();
        }
        boolean p = ucd.p();
        a j = ImmutableSet.j();
        ucd a = ucd.a(true);
        Session session = bVar.a;
        if (session == Session.EMPTY) {
            ucd2 = a.b(false).c(true);
        } else {
            ucd2 = a.n().a(session.sessionId()).b(session.isSessionOwner()).c(false).b(session.joinSessionUri()).a(a(session.participants(), a.m())).a();
        }
        a(ucd2, p, j);
        return kjx.a(ucd2, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, a aVar) {
        ucd ucd2;
        String m = ucd.m();
        String str = aVar.a;
        if (!m.isEmpty() && !m.equals(str)) {
            return kjx.b(ucd.a.a(ucd.c()).a(str));
        }
        boolean p = ucd.p();
        a j = ImmutableSet.j();
        if (ucd.b().isEmpty() || fcl.c(ucd.l(), new $$Lambda$ucc$amiRXzV8kcSp7bC07dN_vOGRzMc(str))) {
            ucd2 = ucd.n().c(str).a(a((List<Participant>) ucd.l(), str)).a();
        } else {
            ucd2 = ucd.o().a(str).b(true);
            j.b(new d());
        }
        a(ucd2, p, j);
        return kjx.a(ucd2, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, j jVar) {
        if (ucd.g() || ucd.e() || ucd.i()) {
            return kjx.e();
        }
        Reason reason = jVar.a.reason();
        if (reason == Reason.a || ucd.b().equals(jVar.a.session().sessionId())) {
            boolean p = ucd.p();
            a j = ImmutableSet.j();
            int i = AnonymousClass1.a[reason.ordinal()];
            if (i == 1) {
                ucd = ucd.o().n().h(true).a();
            } else if (i == 2) {
                Session session = jVar.a.session();
                ucd = ucd.n().a(true).a(session.sessionId()).b(session.isSessionOwner()).b(session.joinSessionUri()).a(a(session.participants(), ucd.m())).a();
            } else if (i == 3) {
                Session session2 = jVar.a.session();
                String m = ucd.m();
                if (m.isEmpty() || fcl.c(session2.participants(), new $$Lambda$ucc$o4f5b7FJ_YkIQwbWZicdUra8Yxc(m))) {
                    ucd = ucd.n().a(session2.sessionId()).b(session2.isSessionOwner()).b(session2.joinSessionUri()).a(a(session2.participants(), ucd.m())).a();
                } else {
                    Logger.b("social listening hub: Ending session since we are not in the participant list", new Object[0]);
                    ucd = ucd.o().b(true);
                    j.b(new d());
                }
            }
            a(ucd, p, j);
            return kjx.a(ucd, j.a());
        }
        Logger.b("social listening hub: Ignoring notification from other session", new Object[0]);
        return kjx.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, g gVar) {
        if (ucd.b().isEmpty() || ucd.i()) {
            Logger.e("social listening hub: Cannot leave session with current outstanding backend requests", new Object[0]);
            return kjx.e();
        }
        boolean p = ucd.p();
        a j = ImmutableSet.j();
        if (ucd.d()) {
            j.b(new a(ucd.b()));
        } else {
            j.b(new f(ucd.b()));
        }
        ucd d = ucd.o().d(true);
        a(d, p, j);
        return kjx.a(d, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, e eVar) {
        if (ucd.g()) {
            return kjx.e();
        }
        StringBuilder sb = new StringBuilder("spotify:socialsession:");
        sb.append(eVar.a);
        String sb2 = sb.toString();
        if (sb2.equals(ucd.k())) {
            Logger.b("social listening hub: Tried to join current session", new Object[0]);
            return kjx.e();
        }
        return kjx.a(ucd.o().n().e(true).b(sb2).a(), kjk.a(new e(eVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucd ucd, h hVar) {
        if (!hVar.a) {
            return kjx.a(ucd, kjk.a(new c()));
        } else if (ucd.e()) {
            Logger.e("social listening hub: Tried to obtain session while obtaining is already in progress", new Object[0]);
            return kjx.e();
        } else if (ucd.g()) {
            Logger.b("social listening hub: Obtain session while a join session in progress, skipping obtain.", new Object[0]);
            return kjx.e();
        } else {
            return kjx.a(ucd.n().c(true).e(false).d(false).f(false).h(false).a(), kjk.a(new b()));
        }
    }
}
