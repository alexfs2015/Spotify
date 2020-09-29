package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.music.features.fullscreen.story.mobius.view.FullscreenStoryViewState;
import com.spotify.stories.v1.view.proto.Chapter;
import com.spotify.stories.v1.view.proto.Chapter.ChapterCase;
import com.spotify.stories.v1.view.proto.Story;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: ngh reason: default package */
public final class ngh {
    private static Set<ngc> a(ngi ngi, ngc... ngcArr) {
        a j = ImmutableSet.j();
        j.a((E[]) ngcArr);
        j.b(ngc.a((nga) new a()));
        if (!ngi.g().b() || !((Boolean) ngi.g().c()).booleanValue()) {
            j.b(new a());
        } else {
            j.b(ngc.b(true));
        }
        return j.a();
    }

    public static kmw<ngi, ngc> a(ngi ngi) {
        return kmw.a(ngi.a(FullscreenStoryViewState.LOADING).a(true), kmt.a(ngc.a((nga) new b()), ngc.a((ngg) new o())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, c cVar) {
        int b = ngi.b();
        if (ChapterCase.a(((Chapter) ((Story) ngi.c().c()).g.get(b)).d) == ChapterCase.VIDEO_CHAPTER) {
            return kng.e();
        }
        String str = ((Chapter) ((Story) ngi.c().c()).g.get(b)).k().d;
        boolean z = !((Boolean) ngi.d().get(b)).booleanValue();
        ngf aVar = z ? new a() : new b();
        ArrayList arrayList = new ArrayList(ngi.d());
        arrayList.set(b, Boolean.valueOf(z));
        return kng.a(ngi.i().a(ImmutableList.a((Collection<? extends E>) arrayList)).a(), kmt.a(new b(str, z), new i(aVar), ngc.a((ngg) new h(b, z))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, e eVar) {
        boolean z = eVar.a;
        ngi a = !z ? ngi.a(FullscreenStoryViewState.OFFLINE) : ngi.a(FullscreenStoryViewState.LOADING);
        if (!z) {
            return kng.a(a, kmt.a(ngc.a(false)));
        } else if (!ngi.c().b()) {
            return kng.a(a, kmt.a(new c()));
        } else {
            return kng.a(a, kmt.a(a(ngi.b() >= 0 ? ngi.b() : 0, ngi.e(), ngi)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, f fVar) {
        int b = ngi.b();
        Chapter chapter = (Chapter) ((Story) ngi.c().c()).g.get(b);
        if (ChapterCase.a(chapter.d) != ChapterCase.TRACK_CHAPTER) {
            return kng.e();
        }
        return kng.a(kmt.a(new h(chapter.k()), ngc.a((ngg) new d(b))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, h hVar) {
        boolean z = hVar.a;
        if (!ngi.g().b()) {
            ngi a = ngi.i().b(Optional.b(Boolean.valueOf(z))).a();
            if (!z) {
                return kng.b(a);
            }
            return kng.a(a, kmt.a(ngc.b(false)));
        } else if (!z) {
            return kng.e();
        } else {
            return kng.a(kmt.a(ngc.a((nga) new a()), new a(), ngc.a(false), ngc.a((ngg) new e())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, i iVar) {
        ngg ngg = (ngg) iVar.a.a($$Lambda$ngh$d1UfRnyRjMZNveSMNxJuyQCo0i8.INSTANCE, $$Lambda$ngh$x0Um7sKidLeXWA5E6birRosGi4.INSTANCE, $$Lambda$ngh$IRxLtAoteL3VjCMypvEqvA6yEm4.INSTANCE, $$Lambda$ngh$pq3MROQLj_wIbHyR7KP8s9uEs.INSTANCE);
        return kng.a(ngi.a(FullscreenStoryViewState.ERROR), kmt.a(ngc.a(ngg)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, j jVar) {
        if (ngi.c().b()) {
            return b(ngi);
        }
        return kng.a(kmt.a(ngc.a(ngg.a(ngi.b()))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, k kVar) {
        int i = kVar.a;
        boolean z = i == ngi.b();
        long j = 0;
        long e = z ? ngi.e() : 0;
        if (z) {
            j = ngi.f();
        }
        return kng.b(ngi.i().a(i).a(e).b(j).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, l lVar) {
        boolean z = lVar.a;
        if (ngi.c().b() && ngi.b() >= 0) {
            if (ngi.a() == FullscreenStoryViewState.PLAYING_AUDIO || ngi.a() == FullscreenStoryViewState.PLAYING_VIDEO) {
                return kng.a(kmt.a(ngc.a(z), ngc.a(z ? new b() : new a())));
            }
        }
        return kng.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, n nVar) {
        ngc a = ngc.a((ngg) new l(ngi.b()));
        if (!ngi.c().b()) {
            return kng.a(kmt.a(a));
        }
        int b = ngi.b() - 1;
        if (b < 0) {
            return kng.a(kmt.a(a));
        }
        return kng.a(kmt.a(a(b, 0, ngi), a));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, o oVar) {
        Story story = oVar.a;
        ngi a = ngi.i().a(Optional.b(story)).a(oVar.b).a();
        return kng.a(a, kmt.a(a(0, 0, a), new g(((Story) a.c().c()).g), ngc.a((ngg) new m())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, q qVar) {
        return (kng) qVar.a.a(new $$Lambda$ngh$hW0K0m89bUxgftuCg2dKdBWD7k(ngi), new $$Lambda$ngh$5rHXLYPRJpFjiX9913Mcg0mnGIw(ngi), new $$Lambda$ngh$5fFqfDziyQMDb22obXTSdiv7Zk(ngi), $$Lambda$ngh$w5fTg_ZK2JTRWSdQGr63osZjQFE.INSTANCE, $$Lambda$ngh$g7XXUJE2dSxlEK0MENLLPv4s8Uk.INSTANCE, $$Lambda$ngh$K32Zs77JLWxC8fke6fzzYpYXVMc.INSTANCE);
    }

    public static kng<ngi, ngc> a(ngi ngi, nge nge) {
        ngi ngi2 = ngi;
        nge nge2 = nge;
        $$Lambda$ngh$TO1_nBT_MUVA0VPIZ8OGla8fEpE r2 = r3;
        $$Lambda$ngh$TO1_nBT_MUVA0VPIZ8OGla8fEpE r3 = new $$Lambda$ngh$TO1_nBT_MUVA0VPIZ8OGla8fEpE(ngi2);
        $$Lambda$ngh$FAiIryeWoGQrEijKFtbx346JCiY r32 = r4;
        $$Lambda$ngh$FAiIryeWoGQrEijKFtbx346JCiY r4 = new $$Lambda$ngh$FAiIryeWoGQrEijKFtbx346JCiY(ngi2);
        $$Lambda$ngh$NTDKwbxYfu8XJOPsy5NG5by1o1c r42 = r5;
        $$Lambda$ngh$NTDKwbxYfu8XJOPsy5NG5by1o1c r5 = new $$Lambda$ngh$NTDKwbxYfu8XJOPsy5NG5by1o1c(ngi2);
        $$Lambda$ngh$fmEGDsQfgKg_XxDdTnafhjSDtzk r52 = r6;
        $$Lambda$ngh$fmEGDsQfgKg_XxDdTnafhjSDtzk r6 = new $$Lambda$ngh$fmEGDsQfgKg_XxDdTnafhjSDtzk(ngi2);
        $$Lambda$ngh$9mw3vUuHnbZjL5xxGyi4wtz4VFw r62 = r7;
        $$Lambda$ngh$9mw3vUuHnbZjL5xxGyi4wtz4VFw r7 = new $$Lambda$ngh$9mw3vUuHnbZjL5xxGyi4wtz4VFw(ngi2);
        $$Lambda$ngh$OGsCD56Rn_FWGIRiBkjKMW0R9k r72 = r8;
        $$Lambda$ngh$OGsCD56Rn_FWGIRiBkjKMW0R9k r8 = new $$Lambda$ngh$OGsCD56Rn_FWGIRiBkjKMW0R9k(ngi2);
        $$Lambda$ngh$zZUVkK2CrvCVmUbKHBRBo0kLSG0 r82 = r9;
        $$Lambda$ngh$zZUVkK2CrvCVmUbKHBRBo0kLSG0 r9 = new $$Lambda$ngh$zZUVkK2CrvCVmUbKHBRBo0kLSG0(ngi2);
        $$Lambda$ngh$ZFmsXzssQIFJLMoxTj0Ikv2Lhck r92 = r10;
        $$Lambda$ngh$ZFmsXzssQIFJLMoxTj0Ikv2Lhck r10 = new $$Lambda$ngh$ZFmsXzssQIFJLMoxTj0Ikv2Lhck(ngi2);
        $$Lambda$ngh$AiQSE6U6B_vB_dwL62Dog2aD8 r102 = r11;
        $$Lambda$ngh$AiQSE6U6B_vB_dwL62Dog2aD8 r11 = new $$Lambda$ngh$AiQSE6U6B_vB_dwL62Dog2aD8(ngi2);
        $$Lambda$ngh$ubpUJhTRpzQsCmSOleBmy5kLbw r112 = r12;
        $$Lambda$ngh$ubpUJhTRpzQsCmSOleBmy5kLbw r12 = new $$Lambda$ngh$ubpUJhTRpzQsCmSOleBmy5kLbw(ngi2);
        $$Lambda$ngh$_cyTJ5rGd2GUR86z5mu9pwFyQN8 r122 = r13;
        $$Lambda$ngh$_cyTJ5rGd2GUR86z5mu9pwFyQN8 r13 = new $$Lambda$ngh$_cyTJ5rGd2GUR86z5mu9pwFyQN8(ngi2);
        $$Lambda$ngh$9RmbW2KFW4YZy_7IoeOSyYhpGTM r132 = $$Lambda$ngh$9RmbW2KFW4YZy_7IoeOSyYhpGTM.INSTANCE;
        $$Lambda$ngh$RElM0L7qqdRmp9B5DUDgw4x2fpY r14 = r15;
        $$Lambda$ngh$RElM0L7qqdRmp9B5DUDgw4x2fpY r15 = new $$Lambda$ngh$RElM0L7qqdRmp9B5DUDgw4x2fpY(ngi2);
        nge nge3 = nge2;
        $$Lambda$ngh$jeBtd0RgK2977be3C7wm8HXw8Bg r1 = new $$Lambda$ngh$jeBtd0RgK2977be3C7wm8HXw8Bg(ngi2);
        $$Lambda$ngh$iEBAyi7wSQboA855BUl4OvwKlC0 r16 = $$Lambda$ngh$iEBAyi7wSQboA855BUl4OvwKlC0.INSTANCE;
        $$Lambda$ngh$_Iby8HO3Clu3zXrhUFAbvxt_2I r17 = r1;
        $$Lambda$ngh$_Iby8HO3Clu3zXrhUFAbvxt_2I r18 = new $$Lambda$ngh$_Iby8HO3Clu3zXrhUFAbvxt_2I(ngi2);
        $$Lambda$ngh$IVPRRayWlPG8b6T6a2nOzZmoEQ r182 = r1;
        $$Lambda$ngh$IVPRRayWlPG8b6T6a2nOzZmoEQ r19 = new $$Lambda$ngh$IVPRRayWlPG8b6T6a2nOzZmoEQ(ngi2);
        return (kng) nge3.a(r2, r32, r42, r52, r62, r72, r82, r92, r102, r112, r122, r132, r14, r1, r16, r17, r182);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, e eVar) {
        return a(ngi, ngi.b()) ? kng.b(ngi.a(FullscreenStoryViewState.PLAYING_VIDEO)) : kng.b(ngi.a(FullscreenStoryViewState.PLAYING_AUDIO));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ngi ngi, f fVar) {
        int b = ngi.b();
        if (a(ngi, b)) {
            return kng.a(ngi.a(FullscreenStoryViewState.PLAYING_VIDEO), kmt.a(ngc.a((ngg) new p(b))));
        }
        return kng.a(ngi.a(FullscreenStoryViewState.PLAYING_AUDIO), kmt.a(ngc.a((ngg) new a(b))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(a aVar) {
        throw new IllegalStateException("Cannot happen, it's been mapped to ChapterFinished Event");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(b bVar) {
        throw new IllegalStateException("Cannot happen, it's been mapped to Error(PlaybackError) Event");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(d dVar) {
        throw new IllegalStateException("Cannot happen, it's been mapped to Error(PlaybackError) Event");
    }

    private static ngc a(int i, long j, ngi ngi) {
        return ngc.a(i, j, (Chapter) ((Story) ngi.c().c()).g.get(i));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ngg a(a aVar) {
        return new f();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ngg a(b bVar) {
        return new g();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ngg a(c cVar) {
        return new j();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ngg a(d dVar) {
        return new n();
    }

    private static boolean a(ngi ngi, int i) {
        fbp.b(ngi.c().b());
        fbp.b(i >= 0);
        return ChapterCase.a(((Chapter) ((Story) ngi.c().c()).g.get(i)).d) == ChapterCase.VIDEO_CHAPTER;
    }

    /* access modifiers changed from: private */
    public static kng<ngi, ngc> b(ngi ngi) {
        int b = ngi.b() + 1;
        if (b >= ((Story) ngi.c().c()).k()) {
            return kng.a(a(ngi, ngc.a(false)));
        }
        return kng.a(kmt.a(a(b, 0, ngi), ngc.a(ngg.a(ngi.b()))));
    }
}
