package com.spotify.music.features.localfilesimport.adapter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.features.localfilesimport.fragment.ItemsFragment;
import com.spotify.music.features.localfilesimport.fragment.ItemsFragment.Type;

public final class ItemsFragmentAdapter extends ko {
    public static final int a = Page.e.length;
    private final Context b;
    private final fqn c;

    /* renamed from: com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Page.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter$Page[] r0 = com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.Page.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter$Page r1 = com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.Page.FOLDERS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter$Page r1 = com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.Page.SONGS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter$Page r1 = com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.Page.ALBUMS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter$Page r1 = com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.Page.ARTISTS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.localfilesimport.adapter.ItemsFragmentAdapter.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Page {
        FOLDERS,
        ARTISTS,
        ALBUMS,
        SONGS;
        
        public static final Page[] e = null;

        static {
            e = values();
        }
    }

    public ItemsFragmentAdapter(kk kkVar, Context context, fqn fqn) {
        super(kkVar);
        this.b = context;
        this.c = fqn;
    }

    public final Fragment a(int i) {
        Page page = Page.e[i];
        int i2 = AnonymousClass1.a[page.ordinal()];
        if (i2 == 1) {
            return ItemsFragment.a(this.c, Type.SOURCES);
        }
        if (i2 == 2) {
            return ItemsFragment.a(this.c, Type.TRACKS);
        }
        if (i2 == 3) {
            return ItemsFragment.a(this.c, Type.ALBUMS);
        }
        if (i2 == 4) {
            return ItemsFragment.a(this.c, Type.ARTISTS);
        }
        StringBuilder sb = new StringBuilder("Unsupported page ");
        sb.append(page);
        Assertion.a(sb.toString());
        return null;
    }

    public final int b() {
        return a;
    }

    public final CharSequence b(int i) {
        Page page = Page.e[i];
        int i2 = AnonymousClass1.a[page.ordinal()];
        if (i2 == 1) {
            return this.b.getString(R.string.local_files_import_title_folders);
        }
        if (i2 == 2) {
            return this.b.getString(R.string.local_files_import_title_songs);
        }
        if (i2 == 3) {
            return this.b.getString(R.string.local_files_import_title_albums);
        }
        if (i2 == 4) {
            return this.b.getString(R.string.local_files_import_title_artists);
        }
        StringBuilder sb = new StringBuilder("Unsupported page ");
        sb.append(page);
        Assertion.a(sb.toString());
        return "";
    }
}
