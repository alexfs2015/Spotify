package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.music.search.podcasts.SearchPodcastComponent;
import com.spotify.searchview.proto.Entity.EntityCase;

/* renamed from: qle reason: default package */
public final class qle implements sjr {

    /* renamed from: qle$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[EntityCase.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.searchview.proto.Entity$EntityCase[] r0 = com.spotify.searchview.proto.Entity.EntityCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.searchview.proto.Entity$EntityCase r1 = com.spotify.searchview.proto.Entity.EntityCase.AUDIO_SHOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.searchview.proto.Entity$EntityCase r1 = com.spotify.searchview.proto.Entity.EntityCase.AUDIO_EPISODE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qle.AnonymousClass1.<clinit>():void");
        }
    }

    public final hck a(EntityCase entityCase) {
        int i = AnonymousClass1.a[entityCase.ordinal()];
        return i != 1 ? i != 2 ? HubsGlueRow.NORMAL : SearchPodcastComponent.EPISODE_ROW : SearchPodcastComponent.SHOW_ROW;
    }
}