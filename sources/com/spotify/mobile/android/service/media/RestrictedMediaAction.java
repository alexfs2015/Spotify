package com.spotify.mobile.android.service.media;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public final class RestrictedMediaAction {
    public final Type a;
    public final List<String> b;

    /* renamed from: com.spotify.mobile.android.service.media.RestrictedMediaAction$1 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.service.media.RestrictedMediaAction$Type[] r0 = com.spotify.mobile.android.service.media.RestrictedMediaAction.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.service.media.RestrictedMediaAction$Type r1 = com.spotify.mobile.android.service.media.RestrictedMediaAction.Type.SKIP_NEXT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.service.media.RestrictedMediaAction$Type r1 = com.spotify.mobile.android.service.media.RestrictedMediaAction.Type.SEEK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.service.media.RestrictedMediaAction$Type r1 = com.spotify.mobile.android.service.media.RestrictedMediaAction.Type.SKIP_PREVIOUS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.media.RestrictedMediaAction.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Type {
        SKIP_NEXT,
        SKIP_PREVIOUS,
        SEEK
    }

    RestrictedMediaAction(Type type, List<String> list) {
        this.a = type;
        this.b = ImmutableList.a((Collection<? extends E>) list);
    }
}
