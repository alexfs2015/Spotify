package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: qtd reason: default package */
public final class qtd implements uqt {
    private final qyd a;

    /* renamed from: qtd$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[YourLibraryPageId.values().length];

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
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId[] r0 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.MUSIC_PLAYLISTS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.MUSIC_ARTISTS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.MUSIC_ALBUMS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.MUSIC_DOWNLOADS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.MUSIC_SONGS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qtd.AnonymousClass2.<clinit>():void");
        }
    }

    public qtd(qyd qyd) {
        this.a = qyd;
    }

    public final ImmutableList<uqs> a() {
        return ImmutableList.a(a(YourLibraryPageId.MUSIC_PLAYLISTS), a(YourLibraryPageId.MUSIC_ARTISTS), a(YourLibraryPageId.MUSIC_ALBUMS), a(YourLibraryPageId.MUSIC_DOWNLOADS), a(YourLibraryPageId.MUSIC_SONGS));
    }

    private uqs a(final YourLibraryPageId yourLibraryPageId) {
        final MusicPageId b = b(yourLibraryPageId);
        final qyb a2 = this.a.a(b);
        return new uqs() {
            public final uqr a(fpt fpt, String str) {
                return qsv.a(fpt, a2, str);
            }

            public final YourLibraryPageId a() {
                return yourLibraryPageId;
            }

            public final CharSequence b() {
                return a2.c();
            }

            public final boolean a(String str) {
                return qyd.b(b).a().contains(jst.a(str).b);
            }
        };
    }

    private static MusicPageId b(YourLibraryPageId yourLibraryPageId) {
        int i = AnonymousClass2.a[yourLibraryPageId.ordinal()];
        if (i == 1) {
            return MusicPageId.PLAYLISTS;
        }
        if (i == 2) {
            return MusicPageId.ARTISTS;
        }
        if (i == 3) {
            return MusicPageId.ALBUMS;
        }
        if (i == 4) {
            return MusicPageId.DOWNLOADS;
        }
        if (i == 5) {
            return MusicPageId.SONGS;
        }
        StringBuilder sb = new StringBuilder("Not a valid Music page ");
        sb.append(yourLibraryPageId);
        throw new AssertionError(sb.toString());
    }
}
