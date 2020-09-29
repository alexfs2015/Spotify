package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.music.R;
import com.spotify.music.features.nowplayingbar.domain.model.Accessory;
import com.spotify.music.features.nowplayingbar.domain.model.Track;
import com.spotify.music.features.nowplayingbar.domain.model.Track.Type;
import java.util.ArrayList;

/* renamed from: nyd reason: default package */
public final class nyd {

    /* renamed from: nyd$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Accessory.values().length];
        static final /* synthetic */ int[] b = new int[Type.values().length];
        static final /* synthetic */ int[] c = new int[ConnectState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0084 */
        static {
            /*
                com.spotify.mobile.android.connect.ConnectManager$ConnectState[] r0 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r0 = 1
                int[] r1 = c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r2 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r3 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.NORMAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r4 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.CONNECTING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r4 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.DETECTED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r4 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                com.spotify.music.features.nowplayingbar.domain.model.Track$Type[] r3 = com.spotify.music.features.nowplayingbar.domain.model.Track.Type.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                b = r3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.spotify.music.features.nowplayingbar.domain.model.Track$Type r4 = com.spotify.music.features.nowplayingbar.domain.model.Track.Type.AD     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x005d }
                com.spotify.music.features.nowplayingbar.domain.model.Track$Type r4 = com.spotify.music.features.nowplayingbar.domain.model.Track.Type.INTERRUPTION     // Catch:{ NoSuchFieldError -> 0x005d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.spotify.music.features.nowplayingbar.domain.model.Track$Type r4 = com.spotify.music.features.nowplayingbar.domain.model.Track.Type.TRACK     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                com.spotify.music.features.nowplayingbar.domain.model.Accessory[] r3 = com.spotify.music.features.nowplayingbar.domain.model.Accessory.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.spotify.music.features.nowplayingbar.domain.model.Accessory r4 = com.spotify.music.features.nowplayingbar.domain.model.Accessory.HEART     // Catch:{ NoSuchFieldError -> 0x007a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.spotify.music.features.nowplayingbar.domain.model.Accessory r3 = com.spotify.music.features.nowplayingbar.domain.model.Accessory.CHEVRON     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008e }
                com.spotify.music.features.nowplayingbar.domain.model.Accessory r1 = com.spotify.music.features.nowplayingbar.domain.model.Accessory.VIDEO     // Catch:{ NoSuchFieldError -> 0x008e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nyd.AnonymousClass1.<clinit>():void");
        }
    }

    public static nyw a(nxn nxn) {
        return (nyw) nxn.a().a($$Lambda$nyd$VY02iuCunHfeI9zX_EK6Lm96Y8.INSTANCE, new $$Lambda$nyd$lVQuFGLID_hR13UbY4Wa2aRd7Kw(nxn));
    }

    private static nza a(Track track, boolean z) {
        int i = AnonymousClass1.b[track.g().ordinal()];
        if (i == 1) {
            return nza.a(track.a(), track.c(), track.d());
        }
        if (i == 2) {
            return nza.a(track.a(), (int) R.string.sas_interruption_title, (int) R.string.widget_label);
        }
        if (i != 3) {
            StringBuilder sb = new StringBuilder("Cannot map ");
            sb.append(track.g());
            sb.append(" to an instance of TrackViewData");
            throw new IllegalStateException(sb.toString());
        } else if (z) {
            return nza.a(track.a(), (int) R.string.mini_player_no_forecasting);
        } else {
            return nza.a(track.a(), track.c(), track.d());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nyw a(nxn nxn, b bVar) {
        nyn nyn;
        nyx nyx;
        nyu nyu;
        nyu cVar;
        boolean b = bVar.b.a().b();
        ArrayList arrayList = new ArrayList(3);
        if (bVar.b.a().b()) {
            arrayList.add(a((Track) bVar.b.a().c(), bVar.d.f()));
        }
        arrayList.add(a(bVar.b.b(), false));
        if (bVar.b.c().b()) {
            arrayList.add(a((Track) bVar.b.c().c(), bVar.d.e()));
        }
        nyt nyt = new nyt(arrayList, b ? 1 : 0, bVar.d.d(), bVar.d.c());
        Accessory b2 = nxn.b();
        Track b3 = bVar.b.b();
        int i = AnonymousClass1.a[b2.ordinal()];
        if (i == 1) {
            nyn = new b($$Lambda$waO5K2CQiURjAdBabK63Ubnw6g.INSTANCE, b3.f(), R.string.mini_player_content_description_like);
        } else if (i == 2) {
            nyn = new a($$Lambda$flYQYjHiQd9AQKv4GXbQIRpyHM.INSTANCE, R.string.mini_player_content_description_show_now_playing_view);
        } else if (i == 3) {
            nyn = new c();
        } else {
            StringBuilder sb = new StringBuilder("Unknown accessory type: ");
            sb.append(b2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (bVar.c.a()) {
            nyx = nyx.a($$Lambda$Zy0_3rGWmt7NZV1YXDeckKz_Tt0.INSTANCE, R.string.player_content_description_pause);
        } else {
            nyx = nyx.a($$Lambda$4cYAcxqj1LkKQitmCtCulS8zdo.INSTANCE, R.string.player_content_description_play);
        }
        nyx nyx2 = nyx;
        nyr nyr = new nyr(!bVar.d.c(), $$Lambda$gdu6mbshj2qonIt43SA5VSkJjs.INSTANCE);
        gsd c = nxn.c();
        uax d = nxn.d();
        if (bVar.d.g()) {
            cVar = new c();
        } else {
            GaiaDevice c2 = c.c();
            if (uav.a(c2, d)) {
                cVar = nyu.a(Tech.of(c2), new $$Lambda$nyd$ldEw3Xj_vRvgok6IvvluGm5fg(c2, d));
            } else {
                int i2 = AnonymousClass1.c[c.a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    cVar = new c();
                } else if (i2 == 3) {
                    nyu = new a(Tech.of(c.d()));
                    nxo nxo = bVar.c;
                    nyq nyq = new nyq(nxo.c(), nxo.b(), nxo.d());
                    b bVar2 = new b(nyt, nyn, nyx2, nyr, nyu, nyq);
                    return bVar2;
                } else if (i2 != 4 && i2 != 5) {
                    StringBuilder sb2 = new StringBuilder("Unknown Connect state: ");
                    sb2.append(c.a());
                    throw new IllegalArgumentException(sb2.toString());
                } else if (c2 == null || c2.isSelf()) {
                    cVar = new b();
                } else {
                    cVar = nyu.a(Tech.of(c2), new $$Lambda$nyd$5j6seJ08V2dAEHUKVlc9Q_nWSeY(c2));
                }
            }
        }
        nyu = cVar;
        nxo nxo2 = bVar.c;
        nyq nyq2 = new nyq(nxo2.c(), nxo2.b(), nxo2.d());
        b bVar22 = new b(nyt, nyn, nyx2, nyr, nyu, nyq2);
        return bVar22;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nyw a(a aVar) {
        return new a();
    }
}
