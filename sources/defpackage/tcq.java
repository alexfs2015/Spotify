package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag;

/* renamed from: tcq reason: default package */
public final class tcq implements tcu {
    private final fqn a;

    /* renamed from: tcq$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[NowPlayingWidgetDebugDataSourceFlag.values().length];

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
                com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag[] r0 = com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag r1 = com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag.SNPV_WIDGET_BTL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag r1 = com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag.SNPV_WIDGET_BTL_EXAMPLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag r1 = com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag.SNPV_WIDGET_STORYLINES     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag r1 = com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag.SNPV_WIDGET_LYRICS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag r1 = com.spotify.music.newplaying.scroll.flags.NowPlayingWidgetDebugDataSourceFlag.SNPV_WIDGET_PIVOTS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tcq.AnonymousClass1.<clinit>():void");
        }
    }

    public tcq(fqn fqn) {
        this.a = fqn;
    }

    public final ImmutableList<Type> a() {
        int i = AnonymousClass1.a[((NowPlayingWidgetDebugDataSourceFlag) this.a.a(tdc.a)).ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? ImmutableList.d() : ImmutableList.a(Type.PIVOTS_PODCAST, Type.PIVOTS_MUSIC) : ImmutableList.a(Type.LYRICS) : ImmutableList.a(Type.STORYLINES) : ImmutableList.a(Type.BEHIND_THE_LYRICS, Type.EXAMPLE) : ImmutableList.a(Type.BEHIND_THE_LYRICS);
    }
}
