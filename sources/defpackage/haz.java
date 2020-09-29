package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;

/* renamed from: haz reason: default package */
final class haz implements gwl {
    private static final Function<HubsComponentCategory, Integer> a = new Function<HubsComponentCategory, Integer>() {
        public final /* synthetic */ Object apply(Object obj) {
            HubsComponentCategory hubsComponentCategory = (HubsComponentCategory) obj;
            int i = AnonymousClass2.a[((HubsComponentCategory) fbp.a(hubsComponentCategory)).ordinal()];
            if (i == 1) {
                return Integer.valueOf(HubsGlueCard.a());
            }
            if (i == 2) {
                return Integer.valueOf(HubsGlueComponent.a());
            }
            if (i == 3) {
                return Integer.valueOf(HubsGlueRow.a());
            }
            if (i == 4) {
                return Integer.valueOf(HubsGlueSectionHeader.a());
            }
            if (i == 5) {
                return Integer.valueOf(HubsCommonComponent.LOADING_SPINNER.mBinderId);
            }
            StringBuilder sb = new StringBuilder("Category without a default: ");
            sb.append(hubsComponentCategory);
            throw new AssertionError(sb.toString());
        }
    };
    private final gce<HubsComponentCategory> b = gce.a(HubsComponentCategory.class);

    /* renamed from: haz$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[HubsComponentCategory.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory[] r0 = com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory r1 = com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory.CARD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory r1 = com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory.HEADER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory r1 = com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory.ROW     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory r1 = com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory.SECTION_HEADER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory r1 = com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory.SPINNER     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.haz.AnonymousClass2.<clinit>():void");
        }
    }

    haz() {
    }

    public final int resolve(hcm hcm) {
        return ((Integer) this.b.b(hcm.componentId().category()).a(a).a(Integer.valueOf(0))).intValue();
    }
}
