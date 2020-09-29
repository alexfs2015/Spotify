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

/* renamed from: rez reason: default package */
public final class rez {

    /* renamed from: rez$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rez.AnonymousClass1.<clinit>():void");
        }
    }

    public static kmw<MusicPagesModel, rex> a(MusicPagesModel musicPagesModel) {
        if (!musicPagesModel.s()) {
            vbl t = musicPagesModel.t();
            vbl a = t.f().a(musicPagesModel.a().d().b()).a();
            musicPagesModel = musicPagesModel.a(a.f().b(musicPagesModel.a().d().c()).a().a(d(musicPagesModel)));
        }
        a j = ImmutableSet.j();
        j.a((E[]) new rex[]{new c(e(musicPagesModel), musicPagesModel.a().e(), musicPagesModel.a().s()), new am(e(musicPagesModel), musicPagesModel.a().f(), musicPagesModel.a().t()), new an(e(musicPagesModel))});
        return kmw.a(musicPagesModel, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, a aVar) {
        if (!musicPagesModel.o()) {
            return kng.e();
        }
        return kng.a(kmt.a(new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, aa aaVar) {
        vca vca = aaVar.a;
        if (((vca) musicPagesModel.b().a(vca.a)).equals(vca)) {
            return kng.e();
        }
        MusicPagesModel a = musicPagesModel.a(vca);
        a j = ImmutableSet.j();
        if (b(a)) {
            j.b(c(a));
        }
        j.b(new av(e(a), (vca) fbp.a(vca)));
        return kng.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, ab abVar) {
        Optional f = fdd.f(musicPagesModel.a().d().a(), new $$Lambda$rez$DUWiKl67z2Ne5Z1IiIni82oykQI(abVar));
        MusicPagesModel a = musicPagesModel.a(f.b() ? vca.a((SortOption) f.c()) : musicPagesModel.a().e());
        if (!b(a)) {
            return kng.b(a);
        }
        return kng.a(a, kmt.a(c(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, ac acVar) {
        if (!musicPagesModel.o()) {
            return kng.e();
        }
        MusicPagesModel a = musicPagesModel.w().a(!musicPagesModel.s() && musicPagesModel.o()).a("").c(false).a();
        a j = ImmutableSet.j();
        j.a((E[]) new rex[]{c(a), rex.d(false), rex.c(false), rex.a(YourLibraryTabsCollapseState.EXPANDED, false), new al()});
        if (a.s()) {
            j.b(rex.e(false));
        } else {
            j.b(rex.b(false));
        }
        return kng.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, ad adVar) {
        MusicPagesModel a = musicPagesModel.w().a(adVar.a).a();
        a j = ImmutableSet.j();
        if (b(a)) {
            j.a((E[]) new rex[]{c(a), rex.a(false)});
        }
        return kng.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, af afVar) {
        MusicItem musicItem = afVar.a;
        if (!musicItem.v()) {
            return kng.e();
        }
        boolean z = !musicItem.w().b();
        bk bkVar = new bk(musicItem.j(), musicItem.w().j(), z);
        if (z) {
            return kng.a(kmt.a(bkVar, new h(musicItem.j(), afVar.b), rex.c((String) fbp.a(musicItem.w().i()))));
        }
        return kng.a(kmt.a(bkVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, ag agVar) {
        MusicItem musicItem = agVar.a;
        if (musicItem.v()) {
            vca vca = (vca) musicPagesModel.b().d();
            if (vca == null) {
                Assertion.b("Active sort option was null!");
                return kng.e();
            }
            a j = ImmutableSet.j();
            f w = musicItem.w();
            if (musicItem.a() == Type.TRACK_SHUFFLE_ONLY) {
                j.b(rex.a(musicItem.j(), agVar.b, w.g(), false));
                if (!((Boolean) musicPagesModel.i().a(Boolean.FALSE)).booleanValue() || !w.e()) {
                    String i = w.i();
                    if (!fbo.a(i)) {
                        j.b(rex.b(i));
                    }
                } else {
                    j.b(rex.b(musicItem.j(), w.j()));
                }
            } else {
                j.b(new z(agVar.a.j(), agVar.b, w.g()));
                if (!((Boolean) musicPagesModel.i().a(Boolean.FALSE)).booleanValue() || !w.e()) {
                    j.b(new aq(musicItem, musicPagesModel.a().c(), vca));
                } else {
                    j.b(rex.b(musicItem.j(), w.j()));
                }
            }
            return kng.a((Set<? extends F>) j.a());
        }
        throw new IllegalArgumentException("Unsupported music item clicked");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, ah ahVar) {
        MusicItem musicItem = ahVar.a;
        if (musicItem.v()) {
            a j = ImmutableSet.j();
            f w = musicItem.w();
            j.b(rex.a(musicItem.j(), ahVar.b, w.g(), true));
            if (!((Boolean) musicPagesModel.i().a(Boolean.FALSE)).booleanValue() || !w.e()) {
                String i = musicItem.w().i();
                if (fbo.a(i)) {
                    return kng.a((Set<? extends F>) j.a());
                }
                j.b(rex.b(i));
                return kng.a((Set<? extends F>) j.a());
            }
            j.b(rex.b(musicItem.j(), w.j()));
            return kng.a((Set<? extends F>) j.a());
        }
        throw new IllegalArgumentException("Unsupported music item clicked");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.kng a(com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel r10, defpackage.rey.ai r11) {
        /*
            rdc r11 = r11.a
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
            rdc r2 = r10.h()
            boolean r2 = r2.j()
            if (r1 != 0) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            if (r0 == 0) goto L_0x002f
            kng r10 = defpackage.kng.e()
            return r10
        L_0x002f:
            rdb r1 = r11.m()
            if (r1 == 0) goto L_0x0046
            rdb$b r1 = r1.c()
            java.lang.String r1 = r1.b()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            -$$Lambda$rez$KYjkz5jgbnsUgjbodJ6X9M14JnE r2 = defpackage.$$Lambda$rez$KYjkz5jgbnsUgjbodJ6X9M14JnE.INSTANCE
            r5 = r11
        L_0x004a:
            if (r5 == 0) goto L_0x0059
            boolean r6 = r2.apply(r5)
            if (r6 == 0) goto L_0x0054
            r2 = 1
            goto L_0x005a
        L_0x0054:
            rdc r5 = r5.g()
            goto L_0x004a
        L_0x0059:
            r2 = 0
        L_0x005a:
            boolean r5 = r11.j()
            if (r2 == 0) goto L_0x008d
            -$$Lambda$rez$jg9Dukcdq4j5Aez6S5w1JpefoZI r2 = defpackage.$$Lambda$rez$jg9Dukcdq4j5Aez6S5w1JpefoZI.INSTANCE
            r6 = r11
            r7 = 0
        L_0x0064:
            if (r6 == 0) goto L_0x0089
            com.google.common.collect.ImmutableList r8 = r6.d()
            fdz r8 = r8.R_()
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
            rdc r6 = r6.g()
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
            rex$al r0 = new rex$al
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
            rgq r1 = r10.a()
            rkm r1 = r1.d()
            rgq r2 = r10.a()
            boolean r2 = r2.o()
            if (r2 == 0) goto L_0x00db
            rkm r2 = defpackage.rkm.f
            if (r1 == r2) goto L_0x00db
            if (r5 != 0) goto L_0x00db
            r2 = 1
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            rgq r7 = r10.a()
            boolean r7 = r7.n()
            if (r7 == 0) goto L_0x00ed
            rkm r7 = defpackage.rkm.f
            if (r1 == r7) goto L_0x00ed
            if (r5 != 0) goto L_0x00ed
            r3 = 1
        L_0x00ed:
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$a r1 = r10.w()
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$a r11 = r1.a(r11)
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$a r11 = r11.a(r0)
            vbl r10 = r10.t()
            vbl$a r10 = r10.f()
            vbl$a r10 = r10.b(r2)
            vbl r10 = r10.a()
            vbl$a r10 = r10.f()
            vbl$a r10 = r10.a(r3)
            vbl r10 = r10.a()
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel$a r10 = r11.a(r10)
            com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel r10 = r10.a()
            com.google.common.collect.ImmutableSet r11 = r6.a()
            kng r10 = defpackage.kng.a(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rez.a(com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel, rey$ai):kng");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, aj ajVar) {
        MusicPagesModel a = musicPagesModel.w().a(ajVar.a).b(ajVar.b).a();
        if (!b(a)) {
            return kng.b(a);
        }
        return kng.a(a, kmt.a(c(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, b bVar) {
        a j = ImmutableSet.j();
        fdz R_ = ((ImmutableMap) musicPagesModel.c().a(ImmutableMap.f())).entrySet().iterator();
        while (R_.hasNext()) {
            j.b(rex.a((String) fbp.a(musicPagesModel.a().b().d()), (String) ((Entry) R_.next()).getKey(), Boolean.FALSE));
        }
        j.b(new d());
        return kng.a((Set<? extends F>) j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, c cVar) {
        a j = ImmutableSet.j();
        String a = cVar.a.a();
        j.b(rex.a((String) fbp.a(musicPagesModel.a().b().d()), a, Boolean.FALSE));
        j.b(new e(a));
        return kng.a((Set<? extends F>) j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, e eVar) {
        boolean z = eVar.a == 0;
        if (musicPagesModel.m().b() && ((Boolean) musicPagesModel.m().c()).booleanValue() == z) {
            return kng.e();
        }
        return kng.b(musicPagesModel.w().h(Optional.b(Boolean.valueOf(z))).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, f fVar) {
        rgq a = musicPagesModel.a();
        int i = AnonymousClass1.c[a.a().ordinal()];
        if (i == 1) {
            return kng.a(kmt.a(rex.a((String) fbp.a(a.b().d())), new k()));
        } else if (i == 2) {
            return kng.a(kmt.a(new ag(), new k()));
        } else if (i == 3) {
            return kng.a(kmt.a(new af(), new g()));
        } else if (i == 4) {
            return kng.e();
        } else {
            if (i == 5) {
                return kng.e();
            }
            throw new IllegalArgumentException("Unsupported music item clicked");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, h hVar) {
        MusicPagesModel a = musicPagesModel.w().b(Optional.b(hVar.a)).a();
        MusicPagesModel a2 = a.a(a.t().a(d(a)));
        if (!b(a2)) {
            return kng.b(a2);
        }
        return kng.a(a2, kmt.a(c(a2)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, k kVar) {
        Set set;
        MusicItem musicItem = kVar.a;
        if (musicItem.v()) {
            boolean z = !musicItem.w().a();
            bl blVar = new bl(musicItem.j(), musicItem.w().j(), z);
            if (z) {
                return kng.a(kmt.a(blVar, new r(musicItem.j(), kVar.b)));
            }
            return kng.a(kmt.a(blVar, new ad(musicItem.j(), kVar.b), rex.c((String) fbp.a(musicItem.w().i()))));
        } else if (musicItem.a() != Type.ALBUM) {
            return kng.e();
        } else {
            boolean z2 = !musicItem.e();
            bh bhVar = new bh(musicItem.j(), z2);
            if (z2) {
                set = kmt.a(bhVar, new q(musicItem.j(), kVar.b));
            } else {
                set = kmt.a(bhVar);
            }
            return kng.a(set);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, l lVar) {
        MusicItem musicItem = lVar.a;
        switch (musicItem.a()) {
            case CREATE_PLAYLIST_BUTTON:
                rgq a = musicPagesModel.a();
                if (a.a() == MusicPageId.FOLDER) {
                    return kng.a(kmt.a(rex.a((String) fbp.a(a.b().d())), new j()));
                }
                return kng.a(kmt.a(new ag(), new j()));
            case ADD_ARTISTS_BUTTON:
                if (!musicItem.d()) {
                    return kng.e();
                }
                return kng.a(kmt.a(new af(), new f()));
            case FAVORITE_SONGS_EMPTY:
            case FAVORITE_SONGS:
                return kng.a(kmt.a(rex.a(musicItem.k(), musicItem.h()), new t()));
            case FOLDER:
            case PLAYLIST:
            case ALBUM:
            case ARTIST:
            case ARTIST_TWO_LINES:
                if (musicItem.d()) {
                    return kng.a(kmt.a(rex.a(musicItem.k(), musicItem.h()), new s(musicItem.k(), lVar.b)));
                }
                return kng.a(kmt.a(new be(R.string.your_library_music_pages_artists_artist_clicked_offline_message, SpotifyIconV2.OFFLINE)));
            case GROUP_HEADER_ALBUM:
            case GROUP_HEADER_ARTIST:
                return kng.a(kmt.a(rex.a(musicItem.k(), musicItem.h()), new w(musicItem.k(), lVar.b)));
            case BANNED_ARTISTS:
                if (!musicItem.d()) {
                    return kng.e();
                }
                return kng.a(kmt.a(new ai(), new u()));
            case BANNED_TRACKS:
                return kng.a(kmt.a(new aj(), new v()));
            default:
                throw new IllegalArgumentException("Unsupported music item clicked");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, o oVar) {
        if (musicPagesModel.k().b() && ((Boolean) musicPagesModel.k().c()).booleanValue() == oVar.a) {
            return kng.e();
        }
        MusicPagesModel a = musicPagesModel.w().f(Optional.b(Boolean.valueOf(oVar.a))).g(Optional.b(Boolean.valueOf(musicPagesModel.r() && oVar.a))).a();
        if (!b(a)) {
            return kng.b(a);
        }
        return kng.a(a, kmt.a(c(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, p pVar) {
        if (AnonymousClass1.b[musicPagesModel.a().p().ordinal()] == 1) {
            return kng.a(kmt.a(new bf(musicPagesModel.h(), musicPagesModel.a().c()), new ac()));
        }
        throw new IllegalArgumentException("Unsupported action");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, q qVar) {
        if (musicPagesModel.p() == qVar.a) {
            return kng.e();
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
        return kng.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, r rVar) {
        MusicPagesModel a = musicPagesModel.w().c(Optional.b(rVar.a)).a();
        if (!b(a)) {
            return kng.b(a);
        }
        return kng.a(a, kmt.a(c(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, w wVar) {
        rex a = rex.a((String) fbp.a(musicPagesModel.a().a() == MusicPageId.FOLDER ? "spotify:playlists" : (String) fbp.a(musicPagesModel.a().b().d())), wVar.a, wVar.b);
        if (musicPagesModel.s()) {
            return kng.a(kmt.a(a));
        }
        return kng.a(kmt.a(a, new n(wVar.a, wVar.b.booleanValue())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, y yVar) {
        MusicPagesModel a = musicPagesModel.w().c(true).a();
        a j = ImmutableSet.j();
        j.a((E[]) new rex[]{rex.b(true), rex.a(YourLibraryTabsCollapseState.COLLAPSED, false), rex.c(true), rex.d(true)});
        if (a.s()) {
            j.b(rex.e(true));
        } else {
            j.b(new aa());
        }
        return kng.a(a, j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(MusicPagesModel musicPagesModel, z zVar) {
        MusicPagesModel a = musicPagesModel.w().e(Optional.b(Boolean.valueOf(zVar.a))).a();
        if (!b(a)) {
            return kng.b(a);
        }
        return kng.a(a, kmt.a(c(a)));
    }

    public static kng<MusicPagesModel, rex> a(MusicPagesModel musicPagesModel, rey rey) {
        MusicPagesModel musicPagesModel2 = musicPagesModel;
        rey rey2 = rey;
        $$Lambda$rez$mheOGnnxpFOfygpmlP6L1oKsBv4 r2 = r3;
        $$Lambda$rez$mheOGnnxpFOfygpmlP6L1oKsBv4 r3 = new $$Lambda$rez$mheOGnnxpFOfygpmlP6L1oKsBv4(musicPagesModel2);
        $$Lambda$rez$wpkTSwtcTgk1bMhgpOTdfZ6P94Y r32 = r4;
        $$Lambda$rez$wpkTSwtcTgk1bMhgpOTdfZ6P94Y r4 = new $$Lambda$rez$wpkTSwtcTgk1bMhgpOTdfZ6P94Y(musicPagesModel2);
        $$Lambda$rez$KYe0vNy52XjHcEkuq5JVVP6i3E r42 = r5;
        $$Lambda$rez$KYe0vNy52XjHcEkuq5JVVP6i3E r5 = new $$Lambda$rez$KYe0vNy52XjHcEkuq5JVVP6i3E(musicPagesModel2);
        $$Lambda$rez$qoozMCJMvwwwC4U_l1EFQgJ5Ic r52 = r6;
        $$Lambda$rez$qoozMCJMvwwwC4U_l1EFQgJ5Ic r6 = new $$Lambda$rez$qoozMCJMvwwwC4U_l1EFQgJ5Ic(musicPagesModel2);
        $$Lambda$rez$AB8sg793i3LBeZLPhUFjfcZurs r62 = r7;
        $$Lambda$rez$AB8sg793i3LBeZLPhUFjfcZurs r7 = new $$Lambda$rez$AB8sg793i3LBeZLPhUFjfcZurs(musicPagesModel2);
        $$Lambda$rez$fqIPftq_cTfvzcbkOdCyqZkaAoI r72 = r8;
        $$Lambda$rez$fqIPftq_cTfvzcbkOdCyqZkaAoI r8 = new $$Lambda$rez$fqIPftq_cTfvzcbkOdCyqZkaAoI(musicPagesModel2);
        $$Lambda$rez$tdZB6siYmE5R_sY7kpkL7QWVb0 r82 = r9;
        $$Lambda$rez$tdZB6siYmE5R_sY7kpkL7QWVb0 r9 = new $$Lambda$rez$tdZB6siYmE5R_sY7kpkL7QWVb0(musicPagesModel2);
        $$Lambda$rez$MNZs7H7OkPkeYldQqgSgvSvD2g r92 = r10;
        $$Lambda$rez$MNZs7H7OkPkeYldQqgSgvSvD2g r10 = new $$Lambda$rez$MNZs7H7OkPkeYldQqgSgvSvD2g(musicPagesModel2);
        $$Lambda$rez$z6_cPJGDVWd2FiyUOlOQ4DWN7OI r102 = r11;
        $$Lambda$rez$z6_cPJGDVWd2FiyUOlOQ4DWN7OI r11 = new $$Lambda$rez$z6_cPJGDVWd2FiyUOlOQ4DWN7OI(musicPagesModel2);
        $$Lambda$rez$_6WJ8c5YUAUgtkdpQAMHCiH5o5Y r112 = r12;
        $$Lambda$rez$_6WJ8c5YUAUgtkdpQAMHCiH5o5Y r12 = new $$Lambda$rez$_6WJ8c5YUAUgtkdpQAMHCiH5o5Y(musicPagesModel2);
        $$Lambda$rez$eOrKhPG875ICTH681M_WA8yA0 r122 = r13;
        $$Lambda$rez$eOrKhPG875ICTH681M_WA8yA0 r13 = new $$Lambda$rez$eOrKhPG875ICTH681M_WA8yA0(musicPagesModel2);
        $$Lambda$rez$H1phFNvznmIuDPUPrfPQMe8HDo r132 = r14;
        $$Lambda$rez$H1phFNvznmIuDPUPrfPQMe8HDo r14 = new $$Lambda$rez$H1phFNvznmIuDPUPrfPQMe8HDo(musicPagesModel2);
        $$Lambda$rez$6kRddsmKE8bOpie6nclC8CgnPiY r142 = r15;
        $$Lambda$rez$6kRddsmKE8bOpie6nclC8CgnPiY r15 = new $$Lambda$rez$6kRddsmKE8bOpie6nclC8CgnPiY(musicPagesModel2);
        rey rey3 = rey2;
        $$Lambda$rez$3lZee_YXqo19rzgJZ9bfiqGnhk r1 = new $$Lambda$rez$3lZee_YXqo19rzgJZ9bfiqGnhk(musicPagesModel2);
        $$Lambda$rez$pCHXwN1EFK4ZOyvv6kFopQvh0ag r16 = r1;
        $$Lambda$rez$pCHXwN1EFK4ZOyvv6kFopQvh0ag r17 = new $$Lambda$rez$pCHXwN1EFK4ZOyvv6kFopQvh0ag(musicPagesModel2);
        $$Lambda$rez$VHZNHcHOYlx_p0mR6Li5nQW3IU r172 = r1;
        $$Lambda$rez$VHZNHcHOYlx_p0mR6Li5nQW3IU r18 = new $$Lambda$rez$VHZNHcHOYlx_p0mR6Li5nQW3IU(musicPagesModel2);
        $$Lambda$rez$aPhG2aQkz1EfQ6EAM0ebjLllsAA r182 = r1;
        $$Lambda$rez$aPhG2aQkz1EfQ6EAM0ebjLllsAA r19 = new $$Lambda$rez$aPhG2aQkz1EfQ6EAM0ebjLllsAA(musicPagesModel2);
        $$Lambda$rez$PxkJSFKn0ZdZyGYVR3tSf61oyA r192 = r1;
        $$Lambda$rez$PxkJSFKn0ZdZyGYVR3tSf61oyA r110 = new $$Lambda$rez$PxkJSFKn0ZdZyGYVR3tSf61oyA(musicPagesModel2);
        $$Lambda$rez$zSOgiTbE3MuMDtOhoxuS77WVI r20 = r1;
        $$Lambda$rez$zSOgiTbE3MuMDtOhoxuS77WVI r111 = new $$Lambda$rez$zSOgiTbE3MuMDtOhoxuS77WVI(musicPagesModel2);
        $$Lambda$rez$nDnOu81ZYLuvb4335scmj_ky1Zc r21 = r1;
        $$Lambda$rez$nDnOu81ZYLuvb4335scmj_ky1Zc r113 = new $$Lambda$rez$nDnOu81ZYLuvb4335scmj_ky1Zc(musicPagesModel2);
        $$Lambda$rez$YCvMZuU5rcfatEeUPuMjelGOr6g r22 = r1;
        $$Lambda$rez$YCvMZuU5rcfatEeUPuMjelGOr6g r114 = new $$Lambda$rez$YCvMZuU5rcfatEeUPuMjelGOr6g(musicPagesModel2);
        $$Lambda$rez$2bO1ko3N4p5mL7Q39oX96Q0IdtI r23 = r1;
        $$Lambda$rez$2bO1ko3N4p5mL7Q39oX96Q0IdtI r115 = new $$Lambda$rez$2bO1ko3N4p5mL7Q39oX96Q0IdtI(musicPagesModel2);
        $$Lambda$rez$LlG11_0UDpugCAukMw0yoUSX5Z8 r24 = r1;
        $$Lambda$rez$LlG11_0UDpugCAukMw0yoUSX5Z8 r116 = new $$Lambda$rez$LlG11_0UDpugCAukMw0yoUSX5Z8(musicPagesModel2);
        $$Lambda$rez$OrQuMWHOeBRJ8ZA3EcNCcfu8p9Q r25 = r1;
        $$Lambda$rez$OrQuMWHOeBRJ8ZA3EcNCcfu8p9Q r117 = new $$Lambda$rez$OrQuMWHOeBRJ8ZA3EcNCcfu8p9Q(musicPagesModel2);
        $$Lambda$rez$DOx8RU3Cle59Z9vcnChOfwg8Ow r26 = r1;
        $$Lambda$rez$DOx8RU3Cle59Z9vcnChOfwg8Ow r118 = new $$Lambda$rez$DOx8RU3Cle59Z9vcnChOfwg8Ow(musicPagesModel2);
        $$Lambda$rez$gWWqb5e1w1JygwxB3KWoDnCdDf4 r27 = r1;
        $$Lambda$rez$gWWqb5e1w1JygwxB3KWoDnCdDf4 r119 = new $$Lambda$rez$gWWqb5e1w1JygwxB3KWoDnCdDf4(musicPagesModel2);
        $$Lambda$rez$rAkF1oLCpJV_Miu_1mnGE6UM r28 = r1;
        $$Lambda$rez$rAkF1oLCpJV_Miu_1mnGE6UM r120 = new $$Lambda$rez$rAkF1oLCpJV_Miu_1mnGE6UM(musicPagesModel2);
        $$Lambda$rez$msYGBUxaqdaSwESM5AddNUCi4TQ r29 = r1;
        $$Lambda$rez$msYGBUxaqdaSwESM5AddNUCi4TQ r121 = new $$Lambda$rez$msYGBUxaqdaSwESM5AddNUCi4TQ(musicPagesModel2);
        $$Lambda$rez$mLtazqwS6911xiMOl4HecjIFByo r30 = r1;
        $$Lambda$rez$mLtazqwS6911xiMOl4HecjIFByo r123 = new $$Lambda$rez$mLtazqwS6911xiMOl4HecjIFByo(musicPagesModel2);
        $$Lambda$rez$pkxCAnStWLsHwr01rjmK4AHkNyY r31 = r1;
        $$Lambda$rez$pkxCAnStWLsHwr01rjmK4AHkNyY r124 = new $$Lambda$rez$pkxCAnStWLsHwr01rjmK4AHkNyY(musicPagesModel2);
        $$Lambda$rez$g12PdwZ41RAeRYy8NiKP8b1OXc r322 = r1;
        $$Lambda$rez$g12PdwZ41RAeRYy8NiKP8b1OXc r125 = new $$Lambda$rez$g12PdwZ41RAeRYy8NiKP8b1OXc(musicPagesModel2);
        $$Lambda$rez$6RWldmJjVrEoAsqSbw3aNIyjqyw r33 = $$Lambda$rez$6RWldmJjVrEoAsqSbw3aNIyjqyw.INSTANCE;
        $$Lambda$rez$8azR2lytw17vzpgFzNeXC57DPJI r34 = r1;
        $$Lambda$rez$8azR2lytw17vzpgFzNeXC57DPJI r126 = new $$Lambda$rez$8azR2lytw17vzpgFzNeXC57DPJI(musicPagesModel2);
        $$Lambda$rez$VK9CGfM71yV3nKaFiC1W8pdO71c r35 = r1;
        $$Lambda$rez$VK9CGfM71yV3nKaFiC1W8pdO71c r127 = new $$Lambda$rez$VK9CGfM71yV3nKaFiC1W8pdO71c(musicPagesModel2);
        $$Lambda$rez$Wk6lGyxQ7m8EtE9kugcUNpNNNPg r36 = r1;
        $$Lambda$rez$Wk6lGyxQ7m8EtE9kugcUNpNNNPg r128 = new $$Lambda$rez$Wk6lGyxQ7m8EtE9kugcUNpNNNPg(musicPagesModel2);
        $$Lambda$rez$9US6x6mPE8cxE3kJE4IQC5krQU r37 = r1;
        $$Lambda$rez$9US6x6mPE8cxE3kJE4IQC5krQU r129 = new $$Lambda$rez$9US6x6mPE8cxE3kJE4IQC5krQU(musicPagesModel2);
        $$Lambda$rez$IYJobiD5ZosvAPk6QWteijG0590 r38 = r1;
        $$Lambda$rez$IYJobiD5ZosvAPk6QWteijG0590 r130 = new $$Lambda$rez$IYJobiD5ZosvAPk6QWteijG0590(musicPagesModel2);
        return (kng) rey3.a(r2, r32, r42, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142, r1, r16, r172, r182, r192, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r322, r33, r34, r35, r36, r37, r38);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(MusicItem musicItem) {
        return musicItem != null && musicItem.a() == Type.FILTER_INDICATOR;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(rdc rdc) {
        if (rdc == null) {
            return false;
        }
        rdb f = rdc.f();
        return f != null && f.c().d().containsValue(Boolean.TRUE);
    }

    private static boolean b(MusicPagesModel musicPagesModel) {
        return musicPagesModel.p() && musicPagesModel.j().b() && musicPagesModel.b().b() && musicPagesModel.c().b() && musicPagesModel.d().b();
    }

    private static rex c(MusicPagesModel musicPagesModel) {
        return rex.a(rdb.j().a(musicPagesModel.f()).b(musicPagesModel.g()).a(b.f().a(juy.a(((vca) musicPagesModel.b().a(musicPagesModel.a().e())).a())).a(musicPagesModel.o() || !musicPagesModel.e().isEmpty()).a(musicPagesModel.e()).a((ImmutableMap) musicPagesModel.c().a(musicPagesModel.a().f())).a()).a(ImmutableMap.a(((PagePrefs) fbp.a(musicPagesModel.d().d())).options())).a(!((Boolean) musicPagesModel.j().a(Boolean.FALSE)).booleanValue()).b(((Boolean) musicPagesModel.l().a(Boolean.FALSE)).booleanValue()).a((Boolean) musicPagesModel.k().d()).a());
    }

    private static ImmutableList<b> d(MusicPagesModel musicPagesModel) {
        if (!musicPagesModel.a().o() || musicPagesModel.n() == LoadingState.LOADED_EMPTY) {
            return ImmutableList.d();
        }
        ImmutableList.a g = ImmutableList.g();
        fdz R_ = musicPagesModel.a().d().e().R_();
        while (R_.hasNext()) {
            b bVar = (b) R_.next();
            String a = bVar.a();
            boolean z = musicPagesModel.c().b() && ((Boolean) fbm.a(((ImmutableMap) musicPagesModel.c().c()).get(a), Boolean.FALSE)).booleanValue();
            g.c(new a().a(a).a(z).b(z ? bVar.c() : bVar.b()).a(z ? bVar.e() : bVar.d()).a());
        }
        return g.a();
    }

    private static String e(MusicPagesModel musicPagesModel) {
        return musicPagesModel.a().a() == MusicPageId.FOLDER ? "spotify:playlists" : musicPagesModel.a().a() == MusicPageId.SONGS ? ViewUris.bi.toString() : (String) fbp.a(musicPagesModel.a().b().d());
    }
}
