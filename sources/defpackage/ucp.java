package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: ucp reason: default package */
public final class ucp {
    public static kjx<ucq, ucn> a(ucq ucq, uco uco) {
        return (kjx) uco.a(new $$Lambda$ucp$FGX4nOkKJzcOZGmBl5Kf5HjQcUg(ucq), new $$Lambda$ucp$myuLuGaSx3UN3XrJHG9P7K4oTfo(ucq), new $$Lambda$ucp$jcheGQpRju8rzUoRA_kslNDAcQI(ucq));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(ImmutableList immutableList, Participant participant) {
        return !immutableList.contains(participant);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ImmutableList immutableList, Participant participant) {
        return !immutableList.contains(participant);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(Participant participant) {
        return !((Boolean) fav.a(((Participant) fay.a(participant)).isHost(), Boolean.FALSE)).booleanValue();
    }

    public static kjn<ucq, ucn> a(ucq ucq) {
        return kjn.a(ucq, kjk.a(new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ucq ucq, c cVar) {
        uax a = ucq.a();
        uax uax = cVar.a;
        ImmutableList k = uax.k();
        ImmutableList k2 = a.k();
        a j = ImmutableSet.j();
        boolean z = a.b() && a.j().equals(uax.j());
        ImmutableList a2 = ImmutableList.a(fcl.b(k, new $$Lambda$ucp$EYLM7fUd8XDLmLpO0knyQUfox3Q(k2)));
        if (!a2.isEmpty()) {
            if (!a.a() || k2.size() > 1 || k.size() != 2) {
                if (a.a() && !z && k.size() > 2) {
                    Optional f = fcl.f(k, $$Lambda$ucp$bziaV8aMhmgFNIgfqnUCiYksARU.INSTANCE);
                    if (f.b()) {
                        j.b(new g(((Participant) f.c()).displayName(), k.size()));
                    }
                } else if (z) {
                    fdh R_ = a2.R_();
                    while (R_.hasNext()) {
                        j.b(new d(((Participant) R_.next()).displayName()));
                    }
                }
            } else if (uax.c() && z) {
                Optional f2 = fcl.f(k, $$Lambda$ucp$tRcfeJcHxMBzbXbki1wybwfwas.INSTANCE);
                if (f2.b()) {
                    if (ucq.b()) {
                        j.b(new b(((Participant) f2.c()).displayName()));
                    } else {
                        j.b(new l(((Participant) f2.c()).displayName()));
                    }
                }
            } else if (!uax.c() && !z) {
                Optional f3 = fcl.f(k, $$Lambda$ucp$vVh8KapWxbWy5g3o6zwDJPFWmcc.INSTANCE);
                if (f3.b()) {
                    if (ucq.c()) {
                        j.b(new h(((Participant) f3.c()).displayName()));
                    } else {
                        j.b(new m(((Participant) f3.c()).displayName()));
                    }
                }
            }
        }
        ImmutableList a3 = ImmutableList.a(fcl.b(k2, new $$Lambda$ucp$gyO4HMOxrdZ0sszKFYUE62lLpiA(k)));
        if (!a3.isEmpty()) {
            if (a.c() || k.size() > 1) {
                if (a.c() && !z && k2.size() >= 2 && k.size() <= 1) {
                    j.b(new f(uax.f()));
                } else if (z && uax.b()) {
                    fdh R_2 = a3.R_();
                    while (R_2.hasNext()) {
                        j.b(new e(((Participant) R_2.next()).displayName()));
                    }
                }
            } else if (uax.g()) {
                Optional f4 = fcl.f(k2, $$Lambda$ucp$w1NbHi2BgRTc1p0cu8Bju2Q_o.INSTANCE);
                if (f4.b()) {
                    j.b(new c(((Participant) f4.c()).displayName()));
                }
            } else {
                j.b(new i(uax.f()));
            }
        }
        return kjx.a(ucq.d().a(uax).a(), j.a());
    }
}
