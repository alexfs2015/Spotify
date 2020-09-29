package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: qwk reason: default package */
public final class qwk {

    /* renamed from: qwk$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b = new int[PageAction.values().length];
        static final /* synthetic */ int[] c = new int[MusicPageId.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00e0 */
        static {
            /*
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId[] r0 = com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r0 = 1
                int[] r1 = c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r2 = com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId.FOLDER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r3 = com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId.PLAYLISTS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r4 = com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId.ARTISTS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = c     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r5 = com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId.ALBUMS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = c     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId r6 = com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId.SONGS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                com.spotify.music.features.yourlibrary.musicpages.pages.PageAction[] r5 = com.spotify.music.features.yourlibrary.musicpages.pages.PageAction.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                b = r5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.spotify.music.features.yourlibrary.musicpages.pages.PageAction r6 = com.spotify.music.features.yourlibrary.musicpages.pages.PageAction.SHUFFLE_PLAY     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type[] r5 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                a = r5
                int[] r5 = a     // Catch:{ NoSuchFieldError -> 0x0066 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r6 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.CREATE_PLAYLIST_BUTTON     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0070 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r5 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.ADD_ARTISTS_BUTTON     // Catch:{ NoSuchFieldError -> 0x0070 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0070 }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.FAVORITE_SONGS_EMPTY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.FAVORITE_SONGS     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008e }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.FOLDER     // Catch:{ NoSuchFieldError -> 0x008e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.PLAYLIST     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a4 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.ALBUM     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b0 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.ARTIST     // Catch:{ NoSuchFieldError -> 0x00b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b0 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b0 }
            L_0x00b0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00bc }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.ARTIST_TWO_LINES     // Catch:{ NoSuchFieldError -> 0x00bc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bc }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bc }
            L_0x00bc:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c8 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.GROUP_HEADER_ALBUM     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00d4 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.GROUP_HEADER_ARTIST     // Catch:{ NoSuchFieldError -> 0x00d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d4 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d4 }
            L_0x00d4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00e0 }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.BANNED_ARTISTS     // Catch:{ NoSuchFieldError -> 0x00e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e0 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e0 }
            L_0x00e0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00ec }
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem$Type r1 = com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type.BANNED_TRACKS     // Catch:{ NoSuchFieldError -> 0x00ec }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ec }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ec }
            L_0x00ec:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qwk.AnonymousClass1.<clinit>():void");
        }
    }

    public static kjn<MusicPagesModel, qwi> a(MusicPagesModel musicPagesModel) {
        if (!musicPagesModel.s()) {
            uqg t = musicPagesModel.t();
            uqg a = t.f().a(musicPagesModel.a().d().b()).a();
            musicPagesModel = musicPagesModel.a(a.f().b(musicPagesModel.a().d().c()).a().a(d(musicPagesModel)));
        }
        a j = ImmutableSet.j();
        j.a((E[]) new qwi[]{new c(e(musicPagesModel), musicPagesModel.a().e(), musicPagesModel.a().s()), new am(e(musicPagesModel), musicPagesModel.a().f(), musicPagesModel.a().t()), new an(e(musicPagesModel))});
        return kjn.a(musicPagesModel, j.a());
    }

    public static kjx<MusicPagesModel, qwi> a(MusicPagesModel musicPagesModel, qwj qwj) {
        MusicPagesModel musicPagesModel2 = musicPagesModel;
        qwj qwj2 = qwj;
        $$Lambda$qwk$yFaRWkpJ2ZN57eOwMGcIh7oL9co r2 = r3;
        $$Lambda$qwk$yFaRWkpJ2ZN57eOwMGcIh7oL9co r3 = new $$Lambda$qwk$yFaRWkpJ2ZN57eOwMGcIh7oL9co(musicPagesModel2);
        $$Lambda$qwk$6CLlfsV0MmCuSOrLhCc2kHekeZc r32 = r4;
        $$Lambda$qwk$6CLlfsV0MmCuSOrLhCc2kHekeZc r4 = new $$Lambda$qwk$6CLlfsV0MmCuSOrLhCc2kHekeZc(musicPagesModel2);
        $$Lambda$qwk$dM3863VXGjuVIJzXHNLdSlko r42 = r5;
        $$Lambda$qwk$dM3863VXGjuVIJzXHNLdSlko r5 = new $$Lambda$qwk$dM3863VXGjuVIJzXHNLdSlko(musicPagesModel2);
        $$Lambda$qwk$553itGONbDtTXIXzSdczWOErS7k r52 = r6;
        $$Lambda$qwk$553itGONbDtTXIXzSdczWOErS7k r6 = new $$Lambda$qwk$553itGONbDtTXIXzSdczWOErS7k(musicPagesModel2);
        $$Lambda$qwk$YbTzSqR_4QtbAkhLw5W7rbOJMyc r62 = r7;
        $$Lambda$qwk$YbTzSqR_4QtbAkhLw5W7rbOJMyc r7 = new $$Lambda$qwk$YbTzSqR_4QtbAkhLw5W7rbOJMyc(musicPagesModel2);
        $$Lambda$qwk$EglfHcV9xnVCoCbeZY1J_bK81o4 r72 = r8;
        $$Lambda$qwk$EglfHcV9xnVCoCbeZY1J_bK81o4 r8 = new $$Lambda$qwk$EglfHcV9xnVCoCbeZY1J_bK81o4(musicPagesModel2);
        $$Lambda$qwk$AEOlOLSLzr3pldK6Jq0HPqnrg0 r82 = r9;
        $$Lambda$qwk$AEOlOLSLzr3pldK6Jq0HPqnrg0 r9 = new $$Lambda$qwk$AEOlOLSLzr3pldK6Jq0HPqnrg0(musicPagesModel2);
        $$Lambda$qwk$OP5dWAj_2n266sE6v7PL9olYxKQ r92 = r10;
        $$Lambda$qwk$OP5dWAj_2n266sE6v7PL9olYxKQ r10 = new $$Lambda$qwk$OP5dWAj_2n266sE6v7PL9olYxKQ(musicPagesModel2);
        $$Lambda$qwk$qHfEBKPqhg66zf30dSw2FM989VY r102 = r11;
        $$Lambda$qwk$qHfEBKPqhg66zf30dSw2FM989VY r11 = new $$Lambda$qwk$qHfEBKPqhg66zf30dSw2FM989VY(musicPagesModel2);
        $$Lambda$qwk$IhFNUEniAzO0iPu0KGCQa7gDtDg r112 = r12;
        $$Lambda$qwk$IhFNUEniAzO0iPu0KGCQa7gDtDg r12 = new $$Lambda$qwk$IhFNUEniAzO0iPu0KGCQa7gDtDg(musicPagesModel2);
        $$Lambda$qwk$yu4W6Q6yDklTH8XpErHCwEOWSmQ r122 = r13;
        $$Lambda$qwk$yu4W6Q6yDklTH8XpErHCwEOWSmQ r13 = new $$Lambda$qwk$yu4W6Q6yDklTH8XpErHCwEOWSmQ(musicPagesModel2);
        $$Lambda$qwk$U9ELQxF72uNLq3Qb8CWFS2gVkuA r132 = r14;
        $$Lambda$qwk$U9ELQxF72uNLq3Qb8CWFS2gVkuA r14 = new $$Lambda$qwk$U9ELQxF72uNLq3Qb8CWFS2gVkuA(musicPagesModel2);
        $$Lambda$qwk$0wguAyBdS1Rxm5wygoELO0nPP9w r142 = r15;
        $$Lambda$qwk$0wguAyBdS1Rxm5wygoELO0nPP9w r15 = new $$Lambda$qwk$0wguAyBdS1Rxm5wygoELO0nPP9w(musicPagesModel2);
        qwj qwj3 = qwj2;
        $$Lambda$qwk$LDTuvKenHFryezZjn97Fm8NkYzc r1 = new $$Lambda$qwk$LDTuvKenHFryezZjn97Fm8NkYzc(musicPagesModel2);
        $$Lambda$qwk$4687lX9qBf0dDQgOtIAjtgNDAac r16 = r1;
        $$Lambda$qwk$4687lX9qBf0dDQgOtIAjtgNDAac r17 = new $$Lambda$qwk$4687lX9qBf0dDQgOtIAjtgNDAac(musicPagesModel2);
        $$Lambda$qwk$CIOh627x1veEiLH4XfgeNbe2M r172 = r1;
        $$Lambda$qwk$CIOh627x1veEiLH4XfgeNbe2M r18 = new $$Lambda$qwk$CIOh627x1veEiLH4XfgeNbe2M(musicPagesModel2);
        $$Lambda$qwk$ZNZX0hMWC67mYqfa8QSOjqj3YS4 r182 = r1;
        $$Lambda$qwk$ZNZX0hMWC67mYqfa8QSOjqj3YS4 r19 = new $$Lambda$qwk$ZNZX0hMWC67mYqfa8QSOjqj3YS4(musicPagesModel2);
        $$Lambda$qwk$jvUgyFNlPF2z1iw3C4Ke4pntZUU r192 = r1;
        $$Lambda$qwk$jvUgyFNlPF2z1iw3C4Ke4pntZUU r110 = new $$Lambda$qwk$jvUgyFNlPF2z1iw3C4Ke4pntZUU(musicPagesModel2);
        $$Lambda$qwk$lwDTgRUnm2T3WS4A6nlG0w5Tpu0 r20 = r1;
        $$Lambda$qwk$lwDTgRUnm2T3WS4A6nlG0w5Tpu0 r111 = new $$Lambda$qwk$lwDTgRUnm2T3WS4A6nlG0w5Tpu0(musicPagesModel2);
        $$Lambda$qwk$NVSMKZ_64Lo4reGZLDUGqnJkbvM r21 = r1;
        $$Lambda$qwk$NVSMKZ_64Lo4reGZLDUGqnJkbvM r113 = new $$Lambda$qwk$NVSMKZ_64Lo4reGZLDUGqnJkbvM(musicPagesModel2);
        $$Lambda$qwk$dLzBumtZJuF9Vat1LtAqQsRug7E r22 = r1;
        $$Lambda$qwk$dLzBumtZJuF9Vat1LtAqQsRug7E r114 = new $$Lambda$qwk$dLzBumtZJuF9Vat1LtAqQsRug7E(musicPagesModel2);
        $$Lambda$qwk$gC3R5Vb0hCJwux5lcQ04fN7XsM r23 = r1;
        $$Lambda$qwk$gC3R5Vb0hCJwux5lcQ04fN7XsM r115 = new $$Lambda$qwk$gC3R5Vb0hCJwux5lcQ04fN7XsM(musicPagesModel2);
        $$Lambda$qwk$blwOEEkNBjmcB8dl3ixTp70vhEc r24 = r1;
        $$Lambda$qwk$blwOEEkNBjmcB8dl3ixTp70vhEc r116 = new $$Lambda$qwk$blwOEEkNBjmcB8dl3ixTp70vhEc(musicPagesModel2);
        $$Lambda$qwk$kaYy2BzX9M3lejHZIu5c_0O0 r25 = r1;
        $$Lambda$qwk$kaYy2BzX9M3lejHZIu5c_0O0 r117 = new $$Lambda$qwk$kaYy2BzX9M3lejHZIu5c_0O0(musicPagesModel2);
        $$Lambda$qwk$8Dp9nYe_q3FNfpUCZ5GFldJDC_g r26 = r1;
        $$Lambda$qwk$8Dp9nYe_q3FNfpUCZ5GFldJDC_g r118 = new $$Lambda$qwk$8Dp9nYe_q3FNfpUCZ5GFldJDC_g(musicPagesModel2);
        $$Lambda$qwk$XEjbMgCOzlqBUKiTuU4kd_oV7I r27 = r1;
        $$Lambda$qwk$XEjbMgCOzlqBUKiTuU4kd_oV7I r119 = new $$Lambda$qwk$XEjbMgCOzlqBUKiTuU4kd_oV7I(musicPagesModel2);
        $$Lambda$qwk$z1nhUQaSyhdA3cx48REVDmWdUqo r28 = r1;
        $$Lambda$qwk$z1nhUQaSyhdA3cx48REVDmWdUqo r120 = new $$Lambda$qwk$z1nhUQaSyhdA3cx48REVDmWdUqo(musicPagesModel2);
        $$Lambda$qwk$gUQV8zbwtyRsI2pxaiq8jCCkSLk r29 = r1;
        $$Lambda$qwk$gUQV8zbwtyRsI2pxaiq8jCCkSLk r121 = new $$Lambda$qwk$gUQV8zbwtyRsI2pxaiq8jCCkSLk(musicPagesModel2);
        $$Lambda$qwk$QWnahEZnlkrSGEGKxRVE4I_97OY r30 = r1;
        $$Lambda$qwk$QWnahEZnlkrSGEGKxRVE4I_97OY r123 = new $$Lambda$qwk$QWnahEZnlkrSGEGKxRVE4I_97OY(musicPagesModel2);
        $$Lambda$qwk$JCrA5EwjJTduR6ZCsQVLpVm2wiE r31 = r1;
        $$Lambda$qwk$JCrA5EwjJTduR6ZCsQVLpVm2wiE r124 = new $$Lambda$qwk$JCrA5EwjJTduR6ZCsQVLpVm2wiE(musicPagesModel2);
        $$Lambda$qwk$oqyhePGjNPOh6kUJzgpChQbc_LY r322 = r1;
        $$Lambda$qwk$oqyhePGjNPOh6kUJzgpChQbc_LY r125 = new $$Lambda$qwk$oqyhePGjNPOh6kUJzgpChQbc_LY(musicPagesModel2);
        $$Lambda$qwk$vENQlUevGeAuo83MQufS6gVWaUw r33 = $$Lambda$qwk$vENQlUevGeAuo83MQufS6gVWaUw.INSTANCE;
        $$Lambda$qwk$Kefw6BnZnnEmR1LRTme2XXfGUc r34 = r1;
        $$Lambda$qwk$Kefw6BnZnnEmR1LRTme2XXfGUc r126 = new $$Lambda$qwk$Kefw6BnZnnEmR1LRTme2XXfGUc(musicPagesModel2);
        $$Lambda$qwk$k82U1NiaKbVl3ABNaxjjNegu6nI r35 = r1;
        $$Lambda$qwk$k82U1NiaKbVl3ABNaxjjNegu6nI r127 = new $$Lambda$qwk$k82U1NiaKbVl3ABNaxjjNegu6nI(musicPagesModel2);
        $$Lambda$qwk$_OAPDd8sbV5D0FFfuD8pCmziPMs r36 = r1;
        $$Lambda$qwk$_OAPDd8sbV5D0FFfuD8pCmziPMs r128 = new $$Lambda$qwk$_OAPDd8sbV5D0FFfuD8pCmziPMs(musicPagesModel2);
        $$Lambda$qwk$JavxgMKCRnvKzxbutiysDUubnrA r37 = r1;
        $$Lambda$qwk$JavxgMKCRnvKzxbutiysDUubnrA r129 = new $$Lambda$qwk$JavxgMKCRnvKzxbutiysDUubnrA(musicPagesModel2);
        $$Lambda$qwk$F6OtIcWZ2ojSmExZVbuuEEZsEqc r38 = r1;
        $$Lambda$qwk$F6OtIcWZ2ojSmExZVbuuEEZsEqc r130 = new $$Lambda$qwk$F6OtIcWZ2ojSmExZVbuuEEZsEqc(musicPagesModel2);
        return (kjx) qwj3.a(r2, r32, r42, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142, r1, r16, r172, r182, r192, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r322, r33, r34, r35, r36, r37, r38);
    }

    private static boolean b(MusicPagesModel musicPagesModel) {
        return musicPagesModel.p() && musicPagesModel.j().b() && musicPagesModel.b().b() && musicPagesModel.c().b() && musicPagesModel.d().b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(qun qun) {
        if (qun == null) {
            return false;
        }
        qum f = qun.f();
        if (f == null || !f.c().d().containsValue(Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(MusicItem musicItem) {
        return musicItem != null && musicItem.a() == Type.FILTER_INDICATOR;
    }

    private static qwi c(MusicPagesModel musicPagesModel) {
        return qwi.a(qum.j().a(musicPagesModel.f()).b(musicPagesModel.g()).a(b.f().a(jsr.a(((uqv) musicPagesModel.b().a(musicPagesModel.a().e())).a())).a(musicPagesModel.o() || !musicPagesModel.e().isEmpty()).a(musicPagesModel.e()).a((ImmutableMap) musicPagesModel.c().a(musicPagesModel.a().f())).a()).a(ImmutableMap.a(((PagePrefs) fay.a(musicPagesModel.d().d())).options())).a(!((Boolean) musicPagesModel.j().a(Boolean.FALSE)).booleanValue()).b(((Boolean) musicPagesModel.l().a(Boolean.FALSE)).booleanValue()).a((Boolean) musicPagesModel.k().d()).a());
    }

    private static ImmutableList<b> d(MusicPagesModel musicPagesModel) {
        String str;
        if (!musicPagesModel.a().o() || musicPagesModel.n() == LoadingState.LOADED_EMPTY) {
            return ImmutableList.d();
        }
        ImmutableList.a g = ImmutableList.g();
        fdh R_ = musicPagesModel.a().d().e().R_();
        while (R_.hasNext()) {
            b bVar = (b) R_.next();
            String a = bVar.a();
            boolean z = musicPagesModel.c().b() && ((Boolean) fav.a(((ImmutableMap) musicPagesModel.c().c()).get(a), Boolean.FALSE)).booleanValue();
            a a2 = new a().a(a).a(z);
            if (z) {
                str = bVar.c();
            } else {
                str = bVar.b();
            }
            g.c(a2.b(str).a(z ? bVar.e() : bVar.d()).a());
        }
        return g.a();
    }

    private static String e(MusicPagesModel musicPagesModel) {
        if (musicPagesModel.a().a() == MusicPageId.FOLDER) {
            return "spotify:playlists";
        }
        if (musicPagesModel.a().a() == MusicPageId.SONGS) {
            return ViewUris.bj.toString();
        }
        return (String) fay.a(musicPagesModel.a().b().d());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, e eVar) {
        boolean z = eVar.a == 0;
        if (musicPagesModel.m().b() && ((Boolean) musicPagesModel.m().c()).booleanValue() == z) {
            return kjx.e();
        }
        return kjx.b(musicPagesModel.w().h(Optional.b(Boolean.valueOf(z))).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, a aVar) {
        if (!musicPagesModel.o()) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, y yVar) {
        MusicPagesModel a = musicPagesModel.w().c(true).a();
        a j = ImmutableSet.j();
        j.a((E[]) new qwi[]{qwi.b(true), qwi.a(YourLibraryTabsCollapseState.COLLAPSED, false), qwi.c(true), qwi.d(true)});
        if (a.s()) {
            j.b(qwi.e(true));
        } else {
            j.b(new aa());
        }
        return kjx.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, f fVar) {
        qyb a = musicPagesModel.a();
        int i = AnonymousClass1.c[a.a().ordinal()];
        if (i == 1) {
            return kjx.a(kjk.a(qwi.a((String) fay.a(a.b().d())), new k()));
        } else if (i == 2) {
            return kjx.a(kjk.a(new ag(), new k()));
        } else if (i == 3) {
            return kjx.a(kjk.a(new af(), new g()));
        } else if (i == 4) {
            return kjx.e();
        } else {
            if (i == 5) {
                return kjx.e();
            }
            throw new IllegalArgumentException("Unsupported music item clicked");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.kjx a(com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel r10, defpackage.qwj.ai r11) {
        /*
            qun r11 = r11.a
            boolean r0 = r11.l()
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r1 = r10.n()
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r2 = com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState.LOADING
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x001b
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r1 = r10.n()
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r2 = com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState.LOADED_PARTIALLY
            if (r1 != r2) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            qun r2 = r10.h()
            boolean r2 = r2.j()
            if (r1 != 0) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            if (r0 == 0) goto L_0x002f
            kjx r10 = defpackage.kjx.e()
            return r10
        L_0x002f:
            qum r1 = r11.m()
            if (r1 == 0) goto L_0x0046
            qum$b r1 = r1.c()
            java.lang.String r1 = r1.b()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            -$$Lambda$qwk$Pp_Yt3_49Uo5-xXvBja7qVGNWgI r2 = defpackage.$$Lambda$qwk$Pp_Yt3_49Uo5xXvBja7qVGNWgI.INSTANCE
            r5 = r11
        L_0x004a:
            if (r5 == 0) goto L_0x0059
            boolean r6 = r2.apply(r5)
            if (r6 == 0) goto L_0x0054
            r2 = 1
            goto L_0x005a
        L_0x0054:
            qun r5 = r5.g()
            goto L_0x004a
        L_0x0059:
            r2 = 0
        L_0x005a:
            boolean r5 = r11.j()
            if (r2 == 0) goto L_0x008d
            -$$Lambda$qwk$9pCY2ds06RhFOiRCiKT49SPeEKQ r2 = defpackage.$$Lambda$qwk$9pCY2ds06RhFOiRCiKT49SPeEKQ.INSTANCE
            r6 = r11
            r7 = 0
        L_0x0064:
            if (r6 == 0) goto L_0x0089
            com.google.common.collect.ImmutableList r8 = r6.d()
            fdh r8 = r8.R_()
        L_0x006e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0084
            java.lang.Object r7 = r8.next()
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r7 = (com.spotify.music.features.yourlibrary.musicpages.item.MusicItem) r7
            boolean r7 = r2.apply(r7)
            if (r7 != 0) goto L_0x0082
            r7 = 0
            goto L_0x0089
        L_0x0082:
            r7 = 1
            goto L_0x006e
        L_0x0084:
            qun r6 = r6.g()
            goto L_0x0064
        L_0x0089:
            if (r7 == 0) goto L_0x008d
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            com.google.common.collect.ImmutableSet$a r6 = com.google.common.collect.ImmutableSet.j()
            if (r0 == 0) goto L_0x009c
            if (r5 == 0) goto L_0x0099
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r0 = com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState.LOADING
            goto L_0x00c1
        L_0x0099:
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r0 = com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState.LOADED_PARTIALLY
            goto L_0x00c1
        L_0x009c:
            boolean r0 = r10.p()
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r10.o()
            if (r0 != 0) goto L_0x00b0
            qwi$al r0 = new qwi$al
            r0.<init>()
            r6.b(r0)
        L_0x00b0:
            if (r5 == 0) goto L_0x00ba
            if (r1 == 0) goto L_0x00b7
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r0 = com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER
            goto L_0x00c1
        L_0x00b7:
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r0 = com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState.LOADED_EMPTY
            goto L_0x00c1
        L_0x00ba:
            if (r2 == 0) goto L_0x00bf
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r0 = com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState.LOADED_EMPTY_WITH_FILTER
            goto L_0x00c1
        L_0x00bf:
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$LoadingState r0 = com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState.LOADED
        L_0x00c1:
            qyb r1 = r10.a()
            rbq r1 = r1.d()
            qyb r2 = r10.a()
            boolean r2 = r2.o()
            if (r2 == 0) goto L_0x00db
            rbq r2 = defpackage.rbq.f
            if (r1 == r2) goto L_0x00db
            if (r5 != 0) goto L_0x00db
            r2 = 1
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            qyb r7 = r10.a()
            boolean r7 = r7.n()
            if (r7 == 0) goto L_0x00ed
            rbq r7 = defpackage.rbq.f
            if (r1 == r7) goto L_0x00ed
            if (r5 != 0) goto L_0x00ed
            r3 = 1
        L_0x00ed:
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$a r1 = r10.w()
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$a r11 = r1.a(r11)
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$a r11 = r11.a(r0)
            uqg r10 = r10.t()
            uqg$a r10 = r10.f()
            uqg$a r10 = r10.b(r2)
            uqg r10 = r10.a()
            uqg$a r10 = r10.f()
            uqg$a r10 = r10.a(r3)
            uqg r10 = r10.a()
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$a r10 = r11.a(r10)
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel r10 = r10.a()
            com.google.common.collect.ImmutableSet r11 = r6.a()
            kjx r10 = defpackage.kjx.a(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwk.a(com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel, qwj$ai):kjx");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, aj ajVar) {
        MusicPagesModel a = musicPagesModel.w().a(ajVar.a).b(ajVar.b).a();
        if (!b(a)) {
            return kjx.b(a);
        }
        return kjx.a(a, kjk.a(c(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, c cVar) {
        a j = ImmutableSet.j();
        String a = cVar.a.a();
        j.b(qwi.a((String) fay.a(musicPagesModel.a().b().d()), a, Boolean.FALSE));
        j.b(new e(a));
        return kjx.a((Set<? extends F>) j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, b bVar) {
        a j = ImmutableSet.j();
        fdh R_ = ((ImmutableMap) musicPagesModel.c().a(ImmutableMap.f())).entrySet().iterator();
        while (R_.hasNext()) {
            j.b(qwi.a((String) fay.a(musicPagesModel.a().b().d()), (String) ((Entry) R_.next()).getKey(), Boolean.FALSE));
        }
        j.b(new d());
        return kjx.a((Set<? extends F>) j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, r rVar) {
        MusicPagesModel a = musicPagesModel.w().c(Optional.b(rVar.a)).a();
        if (!b(a)) {
            return kjx.b(a);
        }
        return kjx.a(a, kjk.a(c(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, h hVar) {
        MusicPagesModel a = musicPagesModel.w().b(Optional.b(hVar.a)).a();
        MusicPagesModel a2 = a.a(a.t().a(d(a)));
        if (!b(a2)) {
            return kjx.b(a2);
        }
        return kjx.a(a2, kjk.a(c(a2)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, w wVar) {
        String str;
        if (musicPagesModel.a().a() == MusicPageId.FOLDER) {
            str = "spotify:playlists";
        } else {
            str = (String) fay.a(musicPagesModel.a().b().d());
        }
        qwi a = qwi.a((String) fay.a(str), wVar.a, wVar.b);
        if (musicPagesModel.s()) {
            return kjx.a(kjk.a(a));
        }
        return kjx.a(kjk.a(a, new n(wVar.a, wVar.b.booleanValue())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, ab abVar) {
        uqv uqv;
        Optional f = fcl.f(musicPagesModel.a().d().a(), new $$Lambda$qwk$crbiFoerU4YrhUCZEEbHwwN3QE(abVar));
        if (f.b()) {
            uqv = uqv.a((SortOption) f.c());
        } else {
            uqv = musicPagesModel.a().e();
        }
        MusicPagesModel a = musicPagesModel.a(uqv);
        if (!b(a)) {
            return kjx.b(a);
        }
        return kjx.a(a, kjk.a(c(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, aa aaVar) {
        uqv uqv = aaVar.a;
        if (((uqv) musicPagesModel.b().a(uqv.a)).equals(uqv)) {
            return kjx.e();
        }
        MusicPagesModel a = musicPagesModel.a(uqv);
        a j = ImmutableSet.j();
        if (b(a)) {
            j.b(c(a));
        }
        j.b(new av(e(a), (uqv) fay.a(uqv)));
        return kjx.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, ad adVar) {
        MusicPagesModel a = musicPagesModel.w().a(adVar.a).a();
        a j = ImmutableSet.j();
        if (b(a)) {
            j.a((E[]) new qwi[]{c(a), qwi.a(false)});
        }
        return kjx.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, ac acVar) {
        if (!musicPagesModel.o()) {
            return kjx.e();
        }
        MusicPagesModel a = musicPagesModel.w().a(!musicPagesModel.s() && musicPagesModel.o()).a("").c(false).a();
        a j = ImmutableSet.j();
        j.a((E[]) new qwi[]{c(a), qwi.d(false), qwi.c(false), qwi.a(YourLibraryTabsCollapseState.EXPANDED, false), new al()});
        if (a.s()) {
            j.b(qwi.e(false));
        } else {
            j.b(qwi.b(false));
        }
        return kjx.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, q qVar) {
        if (musicPagesModel.p() == qVar.a) {
            return kjx.e();
        }
        MusicPagesModel a = musicPagesModel.w().b(qVar.a).a();
        a j = ImmutableSet.j();
        LoadingState n = a.n();
        if (qVar.a && (n == LoadingState.LOADED || n == LoadingState.LOADED_EMPTY)) {
            j.b(new al());
        }
        if (b(a)) {
            j.b(c(a));
        }
        return kjx.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, p pVar) {
        if (AnonymousClass1.b[musicPagesModel.a().p().ordinal()] == 1) {
            return kjx.a(kjk.a(new bf(musicPagesModel.h(), musicPagesModel.a().c()), new ac()));
        }
        throw new IllegalArgumentException("Unsupported action");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, af afVar) {
        MusicItem musicItem = afVar.a;
        if (!musicItem.v()) {
            return kjx.e();
        }
        boolean z = !musicItem.w().b();
        bk bkVar = new bk(musicItem.j(), musicItem.w().j(), z);
        if (z) {
            return kjx.a(kjk.a(bkVar, new h(musicItem.j(), afVar.b), qwi.c((String) fay.a(musicItem.w().i()))));
        }
        return kjx.a(kjk.a(bkVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, k kVar) {
        Set set;
        MusicItem musicItem = kVar.a;
        if (musicItem.v()) {
            boolean z = !musicItem.w().a();
            bl blVar = new bl(musicItem.j(), musicItem.w().j(), z);
            if (z) {
                return kjx.a(kjk.a(blVar, new r(musicItem.j(), kVar.b)));
            }
            return kjx.a(kjk.a(blVar, new ad(musicItem.j(), kVar.b), qwi.c((String) fay.a(musicItem.w().i()))));
        } else if (musicItem.a() != Type.ALBUM) {
            return kjx.e();
        } else {
            boolean z2 = !musicItem.e();
            bh bhVar = new bh(musicItem.j(), z2);
            if (z2) {
                set = kjk.a(bhVar, new q(musicItem.j(), kVar.b));
            } else {
                set = kjk.a(bhVar);
            }
            return kjx.a(set);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, ah ahVar) {
        MusicItem musicItem = ahVar.a;
        if (musicItem.v()) {
            a j = ImmutableSet.j();
            f w = musicItem.w();
            j.b(qwi.a(musicItem.j(), ahVar.b, w.g(), true));
            if (!((Boolean) musicPagesModel.i().a(Boolean.FALSE)).booleanValue() || !w.e()) {
                String i = musicItem.w().i();
                if (fax.a(i)) {
                    return kjx.a((Set<? extends F>) j.a());
                }
                j.b(qwi.b(i));
                return kjx.a((Set<? extends F>) j.a());
            }
            j.b(qwi.b(musicItem.j(), w.j()));
            return kjx.a((Set<? extends F>) j.a());
        }
        throw new IllegalArgumentException("Unsupported music item clicked");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, ag agVar) {
        MusicItem musicItem = agVar.a;
        if (musicItem.v()) {
            uqv uqv = (uqv) musicPagesModel.b().d();
            if (uqv == null) {
                Assertion.b("Active sort option was null!");
                return kjx.e();
            }
            a j = ImmutableSet.j();
            f w = musicItem.w();
            if (musicItem.a() == Type.TRACK_SHUFFLE_ONLY) {
                j.b(qwi.a(musicItem.j(), agVar.b, w.g(), false));
                if (!((Boolean) musicPagesModel.i().a(Boolean.FALSE)).booleanValue() || !w.e()) {
                    String i = w.i();
                    if (!fax.a(i)) {
                        j.b(qwi.b(i));
                    }
                } else {
                    j.b(qwi.b(musicItem.j(), w.j()));
                }
            } else {
                j.b(new z(agVar.a.j(), agVar.b, w.g()));
                if (!((Boolean) musicPagesModel.i().a(Boolean.FALSE)).booleanValue() || !w.e()) {
                    j.b(new aq(musicItem, musicPagesModel.a().c(), uqv));
                } else {
                    j.b(qwi.b(musicItem.j(), w.j()));
                }
            }
            return kjx.a((Set<? extends F>) j.a());
        }
        throw new IllegalArgumentException("Unsupported music item clicked");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, l lVar) {
        MusicItem musicItem = lVar.a;
        switch (musicItem.a()) {
            case CREATE_PLAYLIST_BUTTON:
                qyb a = musicPagesModel.a();
                if (a.a() == MusicPageId.FOLDER) {
                    return kjx.a(kjk.a(qwi.a((String) fay.a(a.b().d())), new j()));
                }
                return kjx.a(kjk.a(new ag(), new j()));
            case ADD_ARTISTS_BUTTON:
                if (!musicItem.d()) {
                    return kjx.e();
                }
                return kjx.a(kjk.a(new af(), new f()));
            case FAVORITE_SONGS_EMPTY:
            case FAVORITE_SONGS:
                return kjx.a(kjk.a(qwi.a(musicItem.k(), musicItem.h()), new t()));
            case FOLDER:
            case PLAYLIST:
            case ALBUM:
            case ARTIST:
            case ARTIST_TWO_LINES:
                if (musicItem.d()) {
                    return kjx.a(kjk.a(qwi.a(musicItem.k(), musicItem.h()), new s(musicItem.k(), lVar.b)));
                }
                return kjx.a(kjk.a(new be(R.string.your_library_music_pages_artists_artist_clicked_offline_message, SpotifyIconV2.OFFLINE)));
            case GROUP_HEADER_ALBUM:
            case GROUP_HEADER_ARTIST:
                return kjx.a(kjk.a(qwi.a(musicItem.k(), musicItem.h()), new w(musicItem.k(), lVar.b)));
            case BANNED_ARTISTS:
                if (!musicItem.d()) {
                    return kjx.e();
                }
                return kjx.a(kjk.a(new ai(), new u()));
            case BANNED_TRACKS:
                return kjx.a(kjk.a(new aj(), new v()));
            default:
                throw new IllegalArgumentException("Unsupported music item clicked");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, o oVar) {
        if (musicPagesModel.k().b() && ((Boolean) musicPagesModel.k().c()).booleanValue() == oVar.a) {
            return kjx.e();
        }
        MusicPagesModel a = musicPagesModel.w().f(Optional.b(Boolean.valueOf(oVar.a))).g(Optional.b(Boolean.valueOf(musicPagesModel.r() && oVar.a))).a();
        if (!b(a)) {
            return kjx.b(a);
        }
        return kjx.a(a, kjk.a(c(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(MusicPagesModel musicPagesModel, z zVar) {
        MusicPagesModel a = musicPagesModel.w().e(Optional.b(Boolean.valueOf(zVar.a))).a();
        if (!b(a)) {
            return kjx.b(a);
        }
        return kjx.a(a, kjk.a(c(a)));
    }
}
