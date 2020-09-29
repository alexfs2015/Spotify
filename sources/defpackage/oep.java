package defpackage;

import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.music.R;
import com.spotify.music.features.nowplayingbar.domain.model.Accessory;
import com.spotify.music.features.nowplayingbar.domain.model.Track;
import com.spotify.music.features.nowplayingbar.domain.model.Track.Type;
import java.util.ArrayList;

/* renamed from: oep reason: default package */
public final class oep {

    /* renamed from: oep$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oep.AnonymousClass1.<clinit>():void");
        }
    }

    public static ofi a(oea oea) {
        return (ofi) oea.a().a($$Lambda$oep$BX2mD5t5HINwnZS0iD8W34Hi0RA.INSTANCE, new $$Lambda$oep$Hs6EtyJlLdcaB83dozZt0P0xO8(oea));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ofi a(oea oea, b bVar) {
        oez oez;
        ofg ofg;
        ofg cVar;
        boolean b = bVar.b.a().b();
        ArrayList arrayList = new ArrayList(3);
        if (bVar.b.a().b()) {
            arrayList.add(a((Track) bVar.b.a().c(), bVar.d.f()));
        }
        arrayList.add(a(bVar.b.b(), false));
        if (bVar.b.c().b()) {
            arrayList.add(a((Track) bVar.b.c().c(), bVar.d.e()));
        }
        off off = new off(arrayList, b ? 1 : 0, bVar.d.d(), bVar.d.c());
        Accessory b2 = oea.b();
        Track b3 = bVar.b.b();
        int i = AnonymousClass1.a[b2.ordinal()];
        if (i == 1) {
            oez = new b($$Lambda$d1V58X2o1U4tHcn1LQheGrlK5g4.INSTANCE, b3.f(), b3.f() ? R.string.player_content_description_unlike : R.string.player_content_description_like);
        } else if (i == 2) {
            oez = new a($$Lambda$dIJMIPc32lessjFa5gQcmSc9Nc.INSTANCE, R.string.mini_player_content_description_show_now_playing_view);
        } else if (i == 3) {
            oez = new c();
        } else {
            StringBuilder sb = new StringBuilder("Unknown accessory type: ");
            sb.append(b2);
            throw new IllegalArgumentException(sb.toString());
        }
        ofj a = bVar.c.a() ? ofj.a($$Lambda$M8ZOJ3Nm04yadBbogIfqFj0LQ2k.INSTANCE, R.string.player_content_description_pause) : ofj.a($$Lambda$6KxD3LkvOoXsMLWWxhBZ_uOHok.INSTANCE, R.string.player_content_description_play);
        ofd ofd = new ofd(!bVar.d.c(), $$Lambda$46MxTvK9TXVcfi3j9pMVe1YImk0.INSTANCE);
        gud c = oea.c();
        uns d = oea.d();
        if (bVar.d.g()) {
            cVar = new c();
        } else {
            GaiaDevice c2 = c.c();
            if (unq.a(c2, d)) {
                cVar = ofg.a(Tech.of(c2), new $$Lambda$oep$1OcTSCVrs6yy8uEX2ESXmMg1Ec(c2, d));
            } else {
                int i2 = AnonymousClass1.c[c.a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    cVar = new c();
                } else if (i2 == 3) {
                    ofg = new a(Tech.of(c.d()));
                    oeb oeb = bVar.c;
                    ofc ofc = new ofc(oeb.c(), oeb.b(), oeb.d());
                    fbp.a(oea.a() instanceof b, (Object) "NowPlayingBarLoggingModel can only be created from a NowPlayingBarModel that has tracks");
                    b bVar2 = (b) oea.a();
                    Track b4 = bVar2.b.b();
                    b bVar3 = new b(off, oez, a, ofd, ofg, ofc, new oen(b4.b(), b4.f(), bVar2.c.a(), oea.b()));
                    return bVar3;
                } else if (i2 == 4 || i2 == 5) {
                    cVar = (c2 == null || c2.isSelf()) ? new b() : ofg.a(Tech.of(c2), new $$Lambda$oep$5W2JJ9efp9aPtaVw8vTTdSjpqc(c2));
                } else {
                    StringBuilder sb2 = new StringBuilder("Unknown Connect state: ");
                    sb2.append(c.a());
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        ofg = cVar;
        oeb oeb2 = bVar.c;
        ofc ofc2 = new ofc(oeb2.c(), oeb2.b(), oeb2.d());
        fbp.a(oea.a() instanceof b, (Object) "NowPlayingBarLoggingModel can only be created from a NowPlayingBarModel that has tracks");
        b bVar22 = (b) oea.a();
        Track b42 = bVar22.b.b();
        b bVar32 = new b(off, oez, a, ofd, ofg, ofc2, new oen(b42.b(), b42.f(), bVar22.c.a(), oea.b()));
        return bVar32;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ofi a(a aVar) {
        return new a();
    }

    private static ofm a(Track track, boolean z) {
        int i = AnonymousClass1.b[track.g().ordinal()];
        if (i == 1) {
            return ofm.a(track.a(), track.c(), track.d());
        }
        if (i == 2) {
            return ofm.a(track.a(), (int) R.string.sas_interruption_title, (int) R.string.widget_label);
        }
        if (i == 3) {
            return z ? ofm.a(track.a(), (int) R.string.mini_player_no_forecasting) : ofm.a(track.a(), track.c(), track.d());
        }
        StringBuilder sb = new StringBuilder("Cannot map ");
        sb.append(track.g());
        sb.append(" to an instance of TrackViewData");
        throw new IllegalStateException(sb.toString());
    }
}
