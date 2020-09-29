package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: pdj reason: default package */
public final class pdj {

    /* renamed from: pdj$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TRACK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pdj.AnonymousClass1.<clinit>():void");
        }
    }

    public static gzz a(gzz gzz, pdm pdm) {
        return new hau(new $$Lambda$pdj$uH0HWWRr3wk4d0mXqwIYFnYEVHI(pdm)).a(gzz);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(pdm pdm, String str) {
        boolean z;
        int i = AnonymousClass1.a[jst.a(str).b.ordinal()];
        if (i == 1 || i == 2) {
            z = str.equals(pdm.b());
        } else {
            z = str.equals(pdm.a());
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt a(pdm pdm, gzt gzt) {
        if (!HubsGlue2Row.IMAGE_ROW.id().equals(gzt.componentId().id())) {
            return null;
        }
        return gzt.toBuilder().c("active", Boolean.valueOf(((Boolean) pde.a(gzt).a((Function<? super T, V>) new $$Lambda$pdj$LIuLlEjWSdtGroiANJb1MtsHgL4<Object,V>(pdm)).a(Boolean.FALSE)).booleanValue())).a();
    }
}
