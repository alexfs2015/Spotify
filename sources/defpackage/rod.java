package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.util.LinkType;
import java.util.Set;

/* renamed from: rod reason: default package */
public final class rod implements rof {
    private final vlp a;
    private final xii<Boolean> b;
    private final xiz<hcs, Boolean, hcs> c = new $$Lambda$rod$JYsb14eHqhZddzniCJx6ULpxs6g(this);

    public rod(vlp vlp, xii<Boolean> xii) {
        this.a = vlp;
        this.b = xii;
    }

    private static hcj a(String str) {
        return HubsImmutableComponentBundle.builder().a(str, true).a();
    }

    private static a a(hcm hcm) {
        if (!b(hcm)) {
            return hcm.toBuilder();
        }
        hcj custom = hcm.custom();
        Set<String> keySet = hcm.custom().keySet();
        a builder = HubsImmutableComponentBundle.builder();
        for (String str : keySet) {
            if (!"titleBadge".equals(str) && !"shuffle_badge".equals(str)) {
                builder = builder.a(str, custom.bundle(str));
            }
        }
        return hcm.toBuilder().e(builder.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcm a(Boolean bool, hcm hcm) {
        String id = hcm.componentId().id();
        if (HubsGlue2Card.LARGE.id().equals(id) || HubsGlue2Card.REGULAR.id().equals(id)) {
            a builder = hcm.toBuilder();
            if (!a(hcm, bool.booleanValue())) {
                String id2 = hcm.id();
                boolean z = id2 != null && id2.contains("offline-result");
                if (!b(hcm) && !z) {
                    builder = builder.f(HubsImmutableComponentBundle.builder().a("titleBadge", "shuffle").a());
                }
            } else {
                builder = a(hcm);
            }
            return builder.a();
        } else if ("freetier:largerRow".equals(id)) {
            a builder2 = hcm.toBuilder();
            if (a(hcm, bool.booleanValue())) {
                builder2 = a(hcm);
            } else if (!b(hcm)) {
                builder2 = builder2.f(a("shuffle_badge"));
            }
            return builder2.a();
        } else {
            String str = "shuffleBadge";
            if (id.equals("home:rowLarge")) {
                a builder3 = hcm.toBuilder();
                if (a(hcm, bool.booleanValue())) {
                    builder3 = a(hcm);
                } else if (!b(hcm)) {
                    builder3 = builder3.f(a(str));
                }
                return builder3.a();
            } else if (!id.equals("home:cardLarge") && !id.equals("home:cardMedium") && !id.equals("home:cardSmall")) {
                return null;
            } else {
                a builder4 = hcm.toBuilder();
                if (a(hcm, bool.booleanValue())) {
                    builder4 = a(hcm);
                } else if (!b(hcm)) {
                    builder4 = builder4.f(a(str));
                }
                return builder4.a();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(hcs hcs, Boolean bool) {
        return new hdn(new $$Lambda$rod$gRoc0hmxPjNm4rTm779vRuvPKY(this, bool)).a(hcs);
    }

    private boolean a(hcm hcm, boolean z) {
        if (hcm.custom().boolValue("isOnDemandInFree", false)) {
            return true;
        }
        String string = hcm.metadata().string("uri");
        if (string == null) {
            return false;
        }
        if (!((Boolean) this.a.b(string).a(Boolean.FALSE)).booleanValue()) {
            jva a2 = jva.a(string);
            if (!(LinkType.SHOW_SHOW == a2.b || LinkType.SHOW_EPISODE == a2.b)) {
                jva a3 = jva.a(string);
                return (LinkType.ARTIST == a3.b || LinkType.COLLECTION_ARTIST == a3.b) || z;
            }
        }
    }

    private static boolean b(hcm hcm) {
        Set keySet = hcm.custom().keySet();
        return keySet.contains("titleBadge") || keySet.contains("shuffle_badge") || keySet.contains("shuffleBadge");
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a((xii) obj, this.b, this.c);
    }
}
