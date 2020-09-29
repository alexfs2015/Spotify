package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import java.util.Map.Entry;

/* renamed from: ral reason: default package */
public final class ral {
    private static YourLibraryPageGroup a(YourLibraryPageId yourLibraryPageId, ram ram) {
        fdz R_ = ram.a().entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (((ImmutableList) entry.getValue()).contains(yourLibraryPageId)) {
                return (YourLibraryPageGroup) entry.getKey();
            }
        }
        StringBuilder sb = new StringBuilder("Group for page id ");
        sb.append(yourLibraryPageId.mId);
        sb.append(" was not found!");
        throw new IllegalArgumentException(sb.toString());
    }

    public static kmw<ram, raj> a(ram ram) {
        a j = ImmutableSet.j();
        vbz c = ram.c();
        if (c.a()) {
            ram = ram.a(c.a(false));
        }
        if (ram.b().b() && !ram.d()) {
            j.b(raj.a((YourLibraryPageId) ram.b().c(), false, true));
            ram = ram.f().a(Optional.e()).a().f().a(true).a();
        }
        return kmw.a(ram, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ram ram, b bVar) {
        vbz c = ram.c();
        if (c.c() == bVar.a) {
            return kng.e();
        }
        vbz a = c.e().a(bVar.a).a();
        return kng.a(ram.a(a), kmt.a(raj.a(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ram ram, c cVar) {
        if (ram.b().b() && ram.b().c() == cVar.a) {
            return kng.e();
        }
        return kng.a(kmt.a(raj.a(cVar.a, cVar.b, false)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ram ram, e eVar) {
        YourLibraryPageId yourLibraryPageId = (YourLibraryPageId) ram.b().d();
        YourLibraryPageId yourLibraryPageId2 = eVar.a;
        ram a = ram.a(yourLibraryPageId2);
        a j = ImmutableSet.j();
        c cVar = new c(eVar.b, eVar.c);
        boolean z = false;
        j.a((E[]) new raj[]{cVar, raj.a(yourLibraryPageId2, true)});
        if (yourLibraryPageId != null) {
            j.b(raj.a(yourLibraryPageId, false));
        }
        if (!(yourLibraryPageId == null || a(yourLibraryPageId, a) == a(yourLibraryPageId2, a))) {
            z = true;
        }
        if (z) {
            j.b(raj.a(YourLibraryTabsCollapseState.EXPANDED, true));
        }
        return kng.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ram ram, g gVar) {
        if (!ram.b().b()) {
            return kng.e();
        }
        f fVar = new f((YourLibraryPageId) ram.b().c());
        if (ram.c().a()) {
            return kng.a(kmt.a(fVar));
        }
        return kng.a(kmt.a(fVar, raj.a(YourLibraryTabsCollapseState.EXPANDED, true)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ram ram, h hVar) {
        if (!ram.b().b() || ram.b().c() != hVar.a) {
            return kng.e();
        }
        boolean z = hVar.b;
        return kng.a(ram.a(ram.c().e().b(z).a()), kmt.a(new g(z)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ram ram, i iVar) {
        if (!ram.b().b() || ram.b().c() != iVar.a) {
            return kng.e();
        }
        boolean z = iVar.b;
        return kng.a(ram.a(ram.c().a(z)), kmt.a(new h(z)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ram ram, j jVar) {
        if (((YourLibraryPageId) ram.b().d()) != jVar.a) {
            return kng.e();
        }
        return kng.a(kmt.a(raj.a(jVar.b, jVar.c)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ram ram, k kVar) {
        int i = kVar.a;
        vbz c = ram.c();
        if (i == c.d()) {
            return kng.e();
        }
        vbz a = c.e().b(i).a();
        return kng.a(ram.a(a), kmt.a(raj.a(a)));
    }

    public static kng<ram, raj> a(ram ram, rak rak) {
        return (kng) rak.a(new $$Lambda$ral$IWkchbTCcO0zvqWxpJc5hrKbyY0(ram), $$Lambda$ral$nBrn74y0xCfQeI9E5R2P2lWu1XY.INSTANCE, new $$Lambda$ral$xpgsyzT0Buekyg2xmLC2gJG5bwg(ram), new $$Lambda$ral$WuFrgy6Jm5a4xZnYaFWeDFXLyWg(ram), new $$Lambda$ral$jwfEVEPR4ZWkCBMNFHKHGHup7fM(ram), new $$Lambda$ral$_TKMuXQv0gKLyq7jaU6n4I72rK8(ram), new $$Lambda$ral$48X7ZIQUqaZ2us4kGtBszkMcZ6s(ram), new $$Lambda$ral$04uoh0f59Tv3Rqh5uspZYpMwg(ram), new $$Lambda$ral$fGDzoErUKsRBTjyqBu3MSLsurks(ram), $$Lambda$ral$tSK0SxG6OIFrjAcH9GQHYopoLY.INSTANCE, new $$Lambda$ral$4cUWaIIpPtX5ifOs7xl1oWON9Y(ram));
    }
}
