package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.features.quicksilver.triggerengine.domain.OutboundRequest;
import com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: prg reason: default package */
public final class prg {
    public static kjx<TriggerEngineModel, pre> a(TriggerEngineModel triggerEngineModel, prf prf) {
        return (kjx) prf.a(new $$Lambda$prg$zOPYRqkIW9if4igWX0BpXeIrBYk(triggerEngineModel), $$Lambda$prg$l9q8bM1rGl2QH9t9vcdLI0vi674.INSTANCE, new $$Lambda$prg$Ef6QpkqpqNM5ZaXWkLTcIuqOY28(triggerEngineModel), new $$Lambda$prg$x3d6xzf_oTjS9RKFKTDbjsBsmEQ(triggerEngineModel), new $$Lambda$prg$CLJP2wEB95lTZXR_x_G7uPV7Ti0(triggerEngineModel), new $$Lambda$prg$8vnwvcrx8zjjrhrJWRSuuzbmwIA(triggerEngineModel), $$Lambda$prg$_KvkgoT_eZKhNqntYCR5VjoUU.INSTANCE, new $$Lambda$prg$aJdqUnslI1guxuZQEgvDMJHgQM(triggerEngineModel), new $$Lambda$prg$Og5vBqFsTGUTShWSqFlizhCo2vk(triggerEngineModel), new $$Lambda$prg$DY4nPcjeu4krA4UybnnPrK4E4O8(triggerEngineModel), new $$Lambda$prg$xHx0DMOuut8Srx6RuxXdG2VNWX0(triggerEngineModel));
    }

    private static ImmutableList<prk> a(String str, String str2, String str3, ImmutableList<prk> immutableList) {
        a g = ImmutableList.g();
        fdh R_ = immutableList.R_();
        while (R_.hasNext()) {
            prk prk = (prk) R_.next();
            if (prk.getType().equals(str3) && prk.matches(str2) && prk.getFormat().equals(str)) {
                g.c(prk);
            }
        }
        return g.a();
    }

    private static ImmutableList<OutboundRequest> a(ImmutableList<OutboundRequest> immutableList, String str, String str2, String str3) {
        a g = ImmutableList.g();
        g.b((Iterable<? extends E>) immutableList);
        g.c(OutboundRequest.d().c(str3).b(str).a(str2).a());
        return g.a();
    }

    private static ImmutableList<OutboundRequest> b(ImmutableList<OutboundRequest> immutableList, String str, String str2, String str3) {
        a aVar = new a();
        for (int i = 0; i < immutableList.size(); i++) {
            OutboundRequest outboundRequest = (OutboundRequest) immutableList.get(i);
            if (!outboundRequest.b().equals(str) || !outboundRequest.a().equals(str2) || !outboundRequest.c().equals(str3)) {
                aVar.c(outboundRequest);
            }
        }
        return aVar.a();
    }

    private static boolean a(ImmutableList<OutboundRequest> immutableList, String str, String str2) {
        fdh R_ = immutableList.R_();
        while (R_.hasNext()) {
            OutboundRequest outboundRequest = (OutboundRequest) R_.next();
            if (outboundRequest.a().equals(str2) && outboundRequest.b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static kjn<TriggerEngineModel, pre> a(TriggerEngineModel triggerEngineModel) {
        return kjn.a(triggerEngineModel, kjk.a(new b()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(TriggerEngineModel triggerEngineModel, a aVar) {
        ImmutableList immutableList;
        TriggerEngineModel a = triggerEngineModel.f().b(aVar.a).a();
        if (aVar.a) {
            immutableList = ImmutableList.d();
        } else {
            immutableList = triggerEngineModel.a();
        }
        return kjx.b(a.a(immutableList));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(TriggerEngineModel triggerEngineModel, d dVar) {
        ImmutableList immutableList;
        TriggerEngineModel a = triggerEngineModel.f().a(dVar.a).a();
        if (dVar.a) {
            immutableList = ImmutableList.d();
        } else {
            immutableList = triggerEngineModel.a();
        }
        return kjx.b(a.a(immutableList));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(TriggerEngineModel triggerEngineModel, g gVar) {
        String str = gVar.b;
        String str2 = gVar.c;
        if (!a(triggerEngineModel.a(), str, str2)) {
            return kjx.e();
        }
        return kjx.b(triggerEngineModel.a(b(triggerEngineModel.a(), str, str2, gVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(TriggerEngineModel triggerEngineModel, h hVar) {
        String str;
        Set set;
        String str2 = hVar.a;
        String str3 = hVar.b;
        String str4 = hVar.c;
        Optional<ho<prk, ppb>> optional = hVar.d;
        TriggerEngineModel a = triggerEngineModel.a(b(triggerEngineModel.a(), str3, str4, str2));
        if (!optional.b()) {
            return kjx.b(a);
        }
        ppb ppb = (ppb) ((ho) optional.c()).b;
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -336959801) {
            if (hashCode != 94431075) {
                if (hashCode == 105008833 && str2.equals("notes")) {
                    c = 2;
                }
            } else if (str2.equals("cards")) {
                c = 0;
            }
        } else if (str2.equals("banners")) {
            c = 1;
        }
        if (c == 0) {
            str = ((b) ppb).a.getId();
        } else if (c == 1) {
            str = ((a) ppb).a.getId();
        } else if (c != 2) {
            str = "";
        } else {
            str = ((c) ppb).a.getId();
        }
        String triggerString = ((prk) fay.a(((ho) optional.c()).a)).getTriggerString();
        String type = ((prk) fay.a(((ho) optional.c()).a)).getType();
        if (triggerEngineModel.d()) {
            set = kjk.a(pre.a("ads-mode-enabled", triggerString, type, str2, str));
        } else if (triggerEngineModel.c()) {
            set = kjk.a(pre.a("car-mode-enabled", triggerString, type, str2, str));
        } else if (triggerEngineModel.e()) {
            set = kjk.a(pre.a("app-not-active", triggerString, type, str2, str));
        } else if (!a(triggerEngineModel.a(), str3, str4)) {
            set = kjk.a(pre.a("context-switched", triggerString, type, str2, str));
        } else {
            set = Collections.emptySet();
        }
        if (!set.isEmpty()) {
            return kjx.a(set);
        }
        return kjx.a(a, kjk.a(new d((prk) fay.a(((ho) optional.c()).a), (ppb) fay.a(((ho) optional.c()).b))));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(TriggerEngineModel triggerEngineModel, e eVar) {
        String str = eVar.a;
        String str2 = eVar.b;
        if (!a(triggerEngineModel.a(), str, str2)) {
            return kjx.e();
        }
        ImmutableList a = triggerEngineModel.a();
        a aVar = new a();
        for (int i = 0; i < a.size(); i++) {
            OutboundRequest outboundRequest = (OutboundRequest) a.get(i);
            if (!outboundRequest.b().equals(str) || !outboundRequest.a().equals(str2)) {
                aVar.c(outboundRequest);
            }
        }
        return kjx.b(triggerEngineModel.a(aVar.a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(TriggerEngineModel triggerEngineModel, f fVar) {
        String str = fVar.a;
        String str2 = fVar.b;
        if (triggerEngineModel.d() || triggerEngineModel.c() || triggerEngineModel.b().isEmpty() || a(triggerEngineModel.a(), str, str2)) {
            return kjx.e();
        }
        ImmutableList b = triggerEngineModel.b();
        HashSet hashSet = new HashSet(2);
        String str3 = "banners";
        ImmutableList a = a(str3, str, str2, b);
        String str4 = "cards";
        ImmutableList a2 = a(str4, str, str2, b);
        String str5 = "notes";
        ImmutableList a3 = a(str5, str, str2, b);
        ImmutableList a4 = triggerEngineModel.a();
        if (!a.isEmpty()) {
            hashSet.add(pre.a(str3, str, str2, a));
            a4 = a(a4, str, str2, str3);
        }
        if (!a2.isEmpty()) {
            hashSet.add(pre.a(str4, str, str2, a2));
            a4 = a(a4, str, str2, str4);
        }
        if (!a3.isEmpty()) {
            hashSet.add(pre.a(str5, str, str2, a3));
            a4 = a(a4, str, str2, str5);
        }
        if (hashSet.isEmpty()) {
            return kjx.e();
        }
        return kjx.a(triggerEngineModel.a(a4), hashSet);
    }
}
