package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: upk reason: default package */
public final class upk {
    public static kmw<upl, upi> a(upl upl) {
        return kmw.a(upl);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(upl upl, c cVar) {
        uns a = upl.a();
        uns uns = cVar.a;
        ImmutableList k = uns.k();
        ImmutableList k2 = a.k();
        a j = ImmutableSet.j();
        boolean z = a.b() && a.j().equals(uns.j());
        ImmutableList a2 = ImmutableList.a(fdd.b(k, new $$Lambda$upk$quXWScnb7O4Jmdkp9tyTZcsFaQ(k2)));
        if (!a2.isEmpty()) {
            if (!a.a() || k2.size() > 1 || k.size() != 2) {
                if (a.a() && !z && k.size() > 2) {
                    Optional f = fdd.f(k, $$Lambda$upk$VtfTkq7R8LOk553QJxjiv_PJys.INSTANCE);
                    if (f.b()) {
                        j.b(new f(((Participant) f.c()).displayName(), k.size()));
                    }
                } else if (z) {
                    fdz R_ = a2.R_();
                    while (R_.hasNext()) {
                        j.b(new c(((Participant) R_.next()).displayName()));
                    }
                }
            } else if (uns.c() && z) {
                Optional f2 = fdd.f(k, $$Lambda$upk$zmClZxcXLd5CkY_oLXVSgOmPuqI.INSTANCE);
                if (f2.b()) {
                    if (upl.b()) {
                        j.b(new a(((Participant) f2.c()).displayName()));
                    } else {
                        j.b(new k(((Participant) f2.c()).displayName()));
                    }
                }
            } else if (!uns.c() && !z) {
                Optional f3 = fdd.f(k, $$Lambda$upk$DWcEOMLO3znxIfKQDW8rRIxnYqk.INSTANCE);
                if (f3.b()) {
                    if (upl.c()) {
                        j.b(new g(((Participant) f3.c()).displayName()));
                    } else {
                        j.b(new l(((Participant) f3.c()).displayName()));
                    }
                }
            }
        }
        ImmutableList a3 = ImmutableList.a(fdd.b(k2, new $$Lambda$upk$qsbaXtCdBaAfZrXElxOcwB160c0(k)));
        if (!a3.isEmpty()) {
            if (a.c() || k.size() > 1) {
                if (a.c() && !z && k2.size() >= 2 && k.size() <= 1) {
                    j.b(new e(uns.f()));
                } else if (z && uns.b()) {
                    fdz R_2 = a3.R_();
                    while (R_2.hasNext()) {
                        j.b(new d(((Participant) R_2.next()).displayName()));
                    }
                }
            } else if (uns.g()) {
                Optional f4 = fdd.f(k2, $$Lambda$upk$59Wrif2YfzKwGj0i4YItgPkD8_w.INSTANCE);
                if (f4.b()) {
                    j.b(new b(((Participant) f4.c()).displayName()));
                }
            } else {
                j.b(new h(uns.f()));
            }
        }
        return kng.a(upl.d().a(uns).a(), j.a());
    }

    public static kng<upl, upi> a(upl upl, upj upj) {
        return (kng) upj.a(new $$Lambda$upk$TVVkj1BGVwZokjVSuUVuOVKi9Y(upl), new $$Lambda$upk$5UjtPFpVHlWLLucmJXpR9z5LDqk(upl), new $$Lambda$upk$IJlF2wWts0wpKcIzPfArh0bM8TI(upl));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ImmutableList immutableList, Participant participant) {
        return !immutableList.contains(participant);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(ImmutableList immutableList, Participant participant) {
        return !immutableList.contains(participant);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(Participant participant) {
        return !((Boolean) fbm.a(((Participant) fbp.a(participant)).isHost(), Boolean.FALSE)).booleanValue();
    }
}
