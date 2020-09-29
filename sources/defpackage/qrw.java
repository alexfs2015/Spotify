package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import java.util.Map.Entry;

/* renamed from: qrw reason: default package */
public final class qrw {
    public static kjn<qrx, qru> a(qrx qrx) {
        a j = ImmutableSet.j();
        uqu c = qrx.c();
        if (c.a()) {
            qrx = qrx.a(c.a(false));
        }
        if (qrx.b().b() && !qrx.d()) {
            j.b(qru.a((YourLibraryPageId) qrx.b().c(), false, true));
            qrx = qrx.f().a(Optional.e()).a().f().a(true).a();
        }
        return kjn.a(qrx, j.a());
    }

    public static kjx<qrx, qru> a(qrx qrx, qrv qrv) {
        return (kjx) qrv.a(new $$Lambda$qrw$hVjSTnRlszoE8eRuBYNhnfY5L8(qrx), $$Lambda$qrw$9Sh92cweL1EFp0rjOA8brGqjDcs.INSTANCE, new $$Lambda$qrw$0scqUxSt5vgiurvjguymfbSprs(qrx), new $$Lambda$qrw$WY4ZNhoDji3bwRJ_t0oLLSpFg4(qrx), new $$Lambda$qrw$zKQbN8unQaRJu70sj2yQTfceQRY(qrx), new $$Lambda$qrw$ltlo1s6pTht4xTBt2S8yE4DZ4wI(qrx), new $$Lambda$qrw$x0_qXyEe54vhL0zRWQDIRON9dOY(qrx), new $$Lambda$qrw$xSAhkWGNDnIaJphkIp8Ih3AYreY(qrx), new $$Lambda$qrw$bXHxLxnDzOcI1o4GbqLTFaKf_z0(qrx), $$Lambda$qrw$J3yw0Nvfu6jV8zn0Qv7Wj7JPpMM.INSTANCE, new $$Lambda$qrw$j_wR_SQKkaTVLU768C54BtMQra0(qrx));
    }

    private static YourLibraryPageGroup a(YourLibraryPageId yourLibraryPageId, qrx qrx) {
        fdh R_ = qrx.a().entrySet().iterator();
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

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qrx qrx, k kVar) {
        int i = kVar.a;
        uqu c = qrx.c();
        if (i == c.d()) {
            return kjx.e();
        }
        uqu a = c.e().b(i).a();
        return kjx.a(qrx.a(a), kjk.a(qru.a(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qrx qrx, b bVar) {
        uqu c = qrx.c();
        if (c.c() == bVar.a) {
            return kjx.e();
        }
        uqu a = c.e().a(bVar.a).a();
        return kjx.a(qrx.a(a), kjk.a(qru.a(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qrx qrx, j jVar) {
        if (((YourLibraryPageId) qrx.b().d()) != jVar.a) {
            return kjx.e();
        }
        return kjx.a(kjk.a(qru.a(jVar.b, jVar.c)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qrx qrx, h hVar) {
        if (!qrx.b().b() || qrx.b().c() != hVar.a) {
            return kjx.e();
        }
        boolean z = hVar.b;
        return kjx.a(qrx.a(qrx.c().e().b(z).a()), kjk.a(new g(z)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qrx qrx, i iVar) {
        if (!qrx.b().b() || qrx.b().c() != iVar.a) {
            return kjx.e();
        }
        boolean z = iVar.b;
        return kjx.a(qrx.a(qrx.c().a(z)), kjk.a(new h(z)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qrx qrx, g gVar) {
        if (!qrx.b().b()) {
            return kjx.e();
        }
        f fVar = new f((YourLibraryPageId) qrx.b().c());
        if (qrx.c().a()) {
            return kjx.a(kjk.a(fVar));
        }
        return kjx.a(kjk.a(fVar, qru.a(YourLibraryTabsCollapseState.EXPANDED, true)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qrx qrx, c cVar) {
        if (qrx.b().b() && qrx.b().c() == cVar.a) {
            return kjx.e();
        }
        return kjx.a(kjk.a(qru.a(cVar.a, cVar.b, false)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qrx qrx, e eVar) {
        YourLibraryPageId yourLibraryPageId = (YourLibraryPageId) qrx.b().d();
        YourLibraryPageId yourLibraryPageId2 = eVar.a;
        qrx a = qrx.a(yourLibraryPageId2);
        a j = ImmutableSet.j();
        c cVar = new c(eVar.b, eVar.c);
        boolean z = false;
        j.a((E[]) new qru[]{cVar, qru.a(yourLibraryPageId2, true)});
        if (yourLibraryPageId != null) {
            j.b(qru.a(yourLibraryPageId, false));
        }
        if (!(yourLibraryPageId == null || a(yourLibraryPageId, a) == a(yourLibraryPageId2, a))) {
            z = true;
        }
        if (z) {
            j.b(qru.a(YourLibraryTabsCollapseState.EXPANDED, true));
        }
        return kjx.a(a, j.a());
    }
}
