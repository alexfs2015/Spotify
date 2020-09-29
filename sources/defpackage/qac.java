package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.features.quicksilver.triggerengine.domain.OutboundRequest;
import com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qac reason: default package */
public final class qac {
    private static ImmutableList<OutboundRequest> a(ImmutableList<OutboundRequest> immutableList, String str, String str2, String str3) {
        a g = ImmutableList.g();
        g.b((Iterable<? extends E>) immutableList);
        g.c(OutboundRequest.d().c(str3).b(str).a(str2).a());
        return g.a();
    }

    private static ImmutableList<qag> a(String str, String str2, String str3, ImmutableList<qag> immutableList) {
        a g = ImmutableList.g();
        fdz R_ = immutableList.R_();
        while (R_.hasNext()) {
            qag qag = (qag) R_.next();
            if (qag.getType().equals(str3) && qag.matches(str2) && qag.getFormat().equals(str)) {
                g.c(qag);
            }
        }
        return g.a();
    }

    public static kmw<TriggerEngineModel, qaa> a(TriggerEngineModel triggerEngineModel) {
        return kmw.a(triggerEngineModel, kmt.a(new b()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(TriggerEngineModel triggerEngineModel, a aVar) {
        return kng.b(triggerEngineModel.f().b(aVar.a).a().a(aVar.a ? ImmutableList.d() : triggerEngineModel.a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(TriggerEngineModel triggerEngineModel, d dVar) {
        return kng.b(triggerEngineModel.f().a(dVar.a).a().a(dVar.a ? ImmutableList.d() : triggerEngineModel.a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(TriggerEngineModel triggerEngineModel, e eVar) {
        String str = eVar.a;
        String str2 = eVar.b;
        if (!a(triggerEngineModel.a(), str, str2)) {
            return kng.e();
        }
        ImmutableList a = triggerEngineModel.a();
        a aVar = new a();
        for (int i = 0; i < a.size(); i++) {
            OutboundRequest outboundRequest = (OutboundRequest) a.get(i);
            if (!outboundRequest.b().equals(str) || !outboundRequest.a().equals(str2)) {
                aVar.c(outboundRequest);
            }
        }
        return kng.b(triggerEngineModel.a(aVar.a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(TriggerEngineModel triggerEngineModel, f fVar) {
        String str = fVar.a;
        String str2 = fVar.b;
        if (triggerEngineModel.d() || triggerEngineModel.c() || triggerEngineModel.b().isEmpty() || a(triggerEngineModel.a(), str, str2)) {
            return kng.e();
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
            hashSet.add(qaa.a(str3, str, str2, a));
            a4 = a(a4, str, str2, str3);
        }
        if (!a2.isEmpty()) {
            hashSet.add(qaa.a(str4, str, str2, a2));
            a4 = a(a4, str, str2, str4);
        }
        if (!a3.isEmpty()) {
            hashSet.add(qaa.a(str5, str, str2, a3));
            a4 = a(a4, str, str2, str5);
        }
        return hashSet.isEmpty() ? kng.e() : kng.a(triggerEngineModel.a(a4), hashSet);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(TriggerEngineModel triggerEngineModel, g gVar) {
        String str = gVar.b;
        String str2 = gVar.c;
        if (!a(triggerEngineModel.a(), str, str2)) {
            return kng.e();
        }
        return kng.b(triggerEngineModel.a(b(triggerEngineModel.a(), str, str2, gVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(TriggerEngineModel triggerEngineModel, h hVar) {
        String str = hVar.a;
        String str2 = hVar.b;
        String str3 = hVar.c;
        Optional<ho<qag, pxx>> optional = hVar.d;
        TriggerEngineModel a = triggerEngineModel.a(b(triggerEngineModel.a(), str2, str3, str));
        if (!optional.b()) {
            return kng.b(a);
        }
        pxx pxx = (pxx) ((ho) optional.c()).b;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -336959801) {
            if (hashCode != 94431075) {
                if (hashCode == 105008833 && str.equals("notes")) {
                    c = 2;
                }
            } else if (str.equals("cards")) {
                c = 0;
            }
        } else if (str.equals("banners")) {
            c = 1;
        }
        String str4 = c != 0 ? c != 1 ? c != 2 ? "" : ((c) pxx).a.getId() : ((a) pxx).a.getId() : ((b) pxx).a.getId();
        String triggerString = ((qag) fbp.a(((ho) optional.c()).a)).getTriggerString();
        String type = ((qag) fbp.a(((ho) optional.c()).a)).getType();
        Set set = triggerEngineModel.d() ? kmt.a(qaa.a("ads-mode-enabled", triggerString, type, str, str4)) : triggerEngineModel.c() ? kmt.a(qaa.a("car-mode-enabled", triggerString, type, str, str4)) : triggerEngineModel.e() ? kmt.a(qaa.a("app-not-active", triggerString, type, str, str4)) : !a(triggerEngineModel.a(), str2, str3) ? kmt.a(qaa.a("context-switched", triggerString, type, str, str4)) : Collections.emptySet();
        if (!set.isEmpty()) {
            return kng.a(set);
        }
        return kng.a(a, kmt.a(new d((qag) fbp.a(((ho) optional.c()).a), (pxx) fbp.a(((ho) optional.c()).b))));
    }

    public static kng<TriggerEngineModel, qaa> a(TriggerEngineModel triggerEngineModel, qab qab) {
        return (kng) qab.a(new $$Lambda$qac$DavQXfJEG7wPFusVOAFtk5ECsm8(triggerEngineModel), $$Lambda$qac$w_mZUkExmx3B5Iu93n6y8N_317o.INSTANCE, new $$Lambda$qac$ZrFo6x0HV0gE5ipXl21HFNPNUEU(triggerEngineModel), new $$Lambda$qac$CcZ0QJmmCHPHk95t_yXs3dcZWhA(triggerEngineModel), new $$Lambda$qac$szpDgixxvIO7PeVA8F08BhgmpkE(triggerEngineModel), new $$Lambda$qac$mTqBBjI454ekCeLSTjaT771oPQ(triggerEngineModel), $$Lambda$qac$H1xBo64TsO8OY6KrhhIvzLXCpzI.INSTANCE, new $$Lambda$qac$DAn2VFeBuMX5TginkVSB6Y1Pdk(triggerEngineModel), new $$Lambda$qac$7WGGmjnTJjC5QRT1rAVRPDe4g5o(triggerEngineModel), new $$Lambda$qac$lf0nU7sNrQJGLlwUXZh9jpiROY(triggerEngineModel), new $$Lambda$qac$tI65HWA7PPc5bKsP832n_2apL8U(triggerEngineModel));
    }

    private static boolean a(ImmutableList<OutboundRequest> immutableList, String str, String str2) {
        fdz R_ = immutableList.R_();
        while (R_.hasNext()) {
            OutboundRequest outboundRequest = (OutboundRequest) R_.next();
            if (outboundRequest.a().equals(str2) && outboundRequest.b().equals(str)) {
                return true;
            }
        }
        return false;
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
}
