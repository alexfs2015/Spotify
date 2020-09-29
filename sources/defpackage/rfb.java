package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.util.LinkType;
import java.util.Set;

/* renamed from: rfb reason: default package */
public final class rfb implements rfd {
    private final uzm a;
    private final wud<Boolean> b;
    private final wuu<gzz, Boolean, gzz> c = new $$Lambda$rfb$sOpnScwBnCBrmPCENSwpmBH3OUc(this);

    public final /* synthetic */ Object call(Object obj) {
        return wud.a((wud) obj, this.b, this.c);
    }

    public rfb(uzm uzm, wud<Boolean> wud) {
        this.a = uzm;
        this.b = wud;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(gzz gzz, Boolean bool) {
        return new hau(new $$Lambda$rfb$CKS78loSGEYhq69hzwQcyuzp4P4(this, bool)).a(gzz);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzt a(Boolean bool, gzt gzt) {
        String id = gzt.componentId().id();
        if (HubsGlue2Card.LARGE.id().equals(id) || HubsGlue2Card.REGULAR.id().equals(id)) {
            a builder = gzt.toBuilder();
            if (!a(gzt, bool.booleanValue())) {
                String id2 = gzt.id();
                boolean z = id2 != null && id2.contains("offline-result");
                if (!b(gzt) && !z) {
                    builder = builder.f(HubsImmutableComponentBundle.builder().a("titleBadge", "shuffle").a());
                }
            } else {
                builder = a(gzt);
            }
            return builder.a();
        } else if ("freetier:largerRow".equals(id)) {
            a builder2 = gzt.toBuilder();
            if (a(gzt, bool.booleanValue())) {
                builder2 = a(gzt);
            } else if (!b(gzt)) {
                builder2 = builder2.f(a("shuffle_badge"));
            }
            return builder2.a();
        } else {
            String str = "shuffleBadge";
            if (id.equals("home:rowLarge")) {
                a builder3 = gzt.toBuilder();
                if (a(gzt, bool.booleanValue())) {
                    builder3 = a(gzt);
                } else if (!b(gzt)) {
                    builder3 = builder3.f(a(str));
                }
                return builder3.a();
            } else if (!id.equals("home:cardLarge") && !id.equals("home:cardMedium") && !id.equals("home:cardSmall")) {
                return null;
            } else {
                a builder4 = gzt.toBuilder();
                if (a(gzt, bool.booleanValue())) {
                    builder4 = a(gzt);
                } else if (!b(gzt)) {
                    builder4 = builder4.f(a(str));
                }
                return builder4.a();
            }
        }
    }

    private static a a(gzt gzt) {
        if (!b(gzt)) {
            return gzt.toBuilder();
        }
        gzq custom = gzt.custom();
        Set<String> keySet = gzt.custom().keySet();
        a builder = HubsImmutableComponentBundle.builder();
        for (String str : keySet) {
            if (!"titleBadge".equals(str) && !"shuffle_badge".equals(str)) {
                builder = builder.a(str, custom.bundle(str));
            }
        }
        return gzt.toBuilder().e(builder.a());
    }

    private static boolean b(gzt gzt) {
        Set keySet = gzt.custom().keySet();
        return keySet.contains("titleBadge") || keySet.contains("shuffle_badge") || keySet.contains("shuffleBadge");
    }

    private boolean a(gzt gzt, boolean z) {
        if (gzt.custom().boolValue("isOnDemandInFree", false)) {
            return true;
        }
        String string = gzt.metadata().string("uri");
        if (string == null) {
            return false;
        }
        if (!((Boolean) this.a.b(string).a(Boolean.FALSE)).booleanValue()) {
            jst a2 = jst.a(string);
            if (!(LinkType.SHOW_SHOW == a2.b || LinkType.SHOW_EPISODE == a2.b)) {
                jst a3 = jst.a(string);
                return (LinkType.ARTIST == a3.b || LinkType.COLLECTION_ARTIST == a3.b) || z;
            }
        }
    }

    private static gzq a(String str) {
        return HubsImmutableComponentBundle.builder().a(str, true).a();
    }
}
