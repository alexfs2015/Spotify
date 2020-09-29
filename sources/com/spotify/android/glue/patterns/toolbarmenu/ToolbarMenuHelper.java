package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.shortcut.ShortcutInstallerService;
import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListService;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class ToolbarMenuHelper {
    private final jjf a;
    private final jsz b;
    private final udr c;

    /* renamed from: com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[AlbumCollectionState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState[] r0 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r1 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.NO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r1 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.PARTIALLY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r1 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.YES     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper.AnonymousClass1.<clinit>():void");
        }
    }

    public enum ItemType {
        AUDIO_PODCAST,
        VIDEO_PODCAST,
        ALBUM
    }

    public ToolbarMenuHelper(jjf jjf, jsz jsz, udr udr) {
        this.a = jjf;
        this.b = jsz;
        this.c = udr;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [haw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.sih r32, com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent r33, java.lang.String r34, com.spotify.music.ubi.interactions.InteractionAction r35) {
        /*
            r31 = this;
            r0 = r31
            r1 = r35
            udr r2 = r0.c
            jrp r3 = defpackage.jrf.a
            long r3 = r3.a()
            if (r1 == 0) goto L_0x0033
            hay$bi r18 = new hay$bi
            r6 = 0
            java.lang.String r7 = r2.toString()
            java.lang.String r8 = r32.toString()
            r10 = -1
            java.lang.String r14 = r33.toString()
            double r2 = (double) r3
            java.lang.String r1 = r1.mLogString
            java.lang.String r9 = "toolbar-menu"
            java.lang.String r13 = "hit"
            r5 = r18
            r12 = r34
            r15 = r2
            r17 = r1
            r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14, r15, r17)
            r1 = r18
            goto L_0x0053
        L_0x0033:
            hay$bh r1 = new hay$bh
            r20 = 0
            java.lang.String r21 = r2.toString()
            java.lang.String r22 = r32.toString()
            r24 = -1
            java.lang.String r28 = r33.toString()
            double r2 = (double) r3
            java.lang.String r23 = "toolbar-menu"
            java.lang.String r27 = "hit"
            r19 = r1
            r26 = r34
            r29 = r2
            r19.<init>(r20, r21, r22, r23, r24, r26, r27, r28, r29)
        L_0x0053:
            jjf r2 = r0.a
            r2.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper.a(sih, com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent, java.lang.String, com.spotify.music.ubi.interactions.InteractionAction):void");
    }

    public final void a(fyt fyt, sih sih, uzf uzf, Runnable runnable, Runnable runnable2) {
        a(fyt, sih, uzf, (int) R.string.options_menu_download, runnable, (int) R.string.options_menu_undownload, runnable2);
    }

    public final void a(fyt fyt, sih sih, uzf uzf, int i, Runnable runnable, int i2, Runnable runnable2) {
        fyt fyt2 = fyt;
        sih sih2 = sih;
        $$Lambda$ToolbarMenuHelper$5GSXrsrEhlYOlZWQdjCvk975Wx0 r0 = new gcs(fyt2, sih2, i, runnable) {
            private final /* synthetic */ fyt f$1;
            private final /* synthetic */ sih f$2;
            private final /* synthetic */ int f$3;
            private final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (f) obj);
            }
        };
        int i3 = i2;
        Runnable runnable3 = runnable2;
        $$Lambda$ToolbarMenuHelper$4G3OR2ann9nMvtk7Eo8fjxkx1dU r02 = new gcs(fyt2, sih2, i3, runnable3) {
            private final /* synthetic */ fyt f$1;
            private final /* synthetic */ sih f$2;
            private final /* synthetic */ int f$3;
            private final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (h) obj);
            }
        };
        $$Lambda$ToolbarMenuHelper$xfvCoyArdtYUuCfoKm6RnnIX4A r03 = new gcs(fyt2, sih2, i3, runnable3) {
            private final /* synthetic */ fyt f$1;
            private final /* synthetic */ sih f$2;
            private final /* synthetic */ int f$3;
            private final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (b) obj);
            }
        };
        $$Lambda$ToolbarMenuHelper$JtM6O9VLk04FHyLGfcROd2zhGJw r04 = new gcs(fyt2, sih2, i3, runnable3) {
            private final /* synthetic */ fyt f$1;
            private final /* synthetic */ sih f$2;
            private final /* synthetic */ int f$3;
            private final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (a) obj);
            }
        };
        int i4 = i;
        Runnable runnable4 = runnable;
        $$Lambda$ToolbarMenuHelper$X5hqNa4tSDbQxienSjR6R8eFD5c r05 = new gcs(fyt2, sih2, i4, runnable4) {
            private final /* synthetic */ fyt f$1;
            private final /* synthetic */ sih f$2;
            private final /* synthetic */ int f$3;
            private final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (c) obj);
            }
        };
        $$Lambda$ToolbarMenuHelper$6THjpU5iG6b4oJyNzzcqos29KuI r06 = new gcs(fyt2, sih2, i4, runnable4) {
            private final /* synthetic */ fyt f$1;
            private final /* synthetic */ sih f$2;
            private final /* synthetic */ int f$3;
            private final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (e) obj);
            }
        };
        $$Lambda$ToolbarMenuHelper$zp1czU6v4SQ52P4dr3M1eK1luBg r07 = new gcs(fyt2, sih2, i4, runnable4) {
            private final /* synthetic */ fyt f$1;
            private final /* synthetic */ sih f$2;
            private final /* synthetic */ int f$3;
            private final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (d) obj);
            }
        };
        $$Lambda$ToolbarMenuHelper$hpfyr0_Qk_Frd6zJD618TBoFi6U r08 = new gcs(fyt2, sih2, i4, runnable4) {
            private final /* synthetic */ fyt f$1;
            private final /* synthetic */ sih f$2;
            private final /* synthetic */ int f$3;
            private final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, (g) obj);
            }
        };
        uzf.a((gcs<f>) r0, (gcs<h>) r02, (gcs<b>) r03, (gcs<a>) r04, (gcs<c>) r05, (gcs<e>) r06, (gcs<d>) r07, (gcs<g>) r08);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyt fyt, sih sih, int i, Runnable runnable, f fVar) {
        b(fyt, sih, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyt fyt, sih sih, int i, Runnable runnable, h hVar) {
        a(fyt, sih, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyt fyt, sih sih, int i, Runnable runnable, b bVar) {
        a(fyt, sih, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyt fyt, sih sih, int i, Runnable runnable, a aVar) {
        a(fyt, sih, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyt fyt, sih sih, int i, Runnable runnable, c cVar) {
        b(fyt, sih, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyt fyt, sih sih, int i, Runnable runnable, e eVar) {
        b(fyt, sih, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyt fyt, sih sih, int i, Runnable runnable, d dVar) {
        b(fyt, sih, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyt fyt, sih sih, int i, Runnable runnable, g gVar) {
        b(fyt, sih, i, runnable);
    }

    private void a(fyt fyt, sih sih, int i, Runnable runnable) {
        fyt.a((int) R.id.options_menu_download, i, fzf.a(fyt.a(), SpotifyIconV2.DOWNLOAD)).a(new Runnable(sih, runnable) {
            private final /* synthetic */ sih f$1;
            private final /* synthetic */ Runnable f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ToolbarMenuHelper.this.b(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(sih sih, Runnable runnable) {
        a(sih, ContextMenuEvent.UNDOWNLOAD, sih.toString(), (InteractionAction) null);
        runnable.run();
    }

    private void b(fyt fyt, sih sih, int i, Runnable runnable) {
        fyt.a((int) R.id.options_menu_download, i, fzf.a(fyt.a(), SpotifyIconV2.DOWNLOAD)).a(new Runnable(sih, runnable) {
            private final /* synthetic */ sih f$1;
            private final /* synthetic */ Runnable f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sih sih, Runnable runnable) {
        a(sih, ContextMenuEvent.DOWNLOAD, sih.toString(), (InteractionAction) null);
        runnable.run();
    }

    public final void a(fyt fyt, sih sih, boolean z, boolean z2, String str, ItemType itemType, fpt fpt) {
        a(fyt, sih, z ? AlbumCollectionState.YES : AlbumCollectionState.NO, false, str, itemType, fpt);
    }

    public final void a(fyt fyt, sih sih, AlbumCollectionState albumCollectionState, boolean z, String str, ItemType itemType, fpt fpt) {
        LinkType linkType = jst.a(str).b;
        if (!(linkType == LinkType.SHOW_SHOW || linkType == LinkType.ALBUM || linkType == LinkType.COLLECTION_ALBUM)) {
            StringBuilder sb = new StringBuilder("Unsupported link type ");
            sb.append(linkType);
            Assertion.a(sb.toString());
        }
        boolean z2 = false;
        String str2 = "Uri is of type ";
        if (linkType == LinkType.SHOW_SHOW) {
            Assertion.b((Object) albumCollectionState, (Object) AlbumCollectionState.PARTIALLY);
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(linkType);
            sb2.append(" but itemType is not video or audio podcast.");
            String sb3 = sb2.toString();
            if (itemType == ItemType.VIDEO_PODCAST || itemType == ItemType.AUDIO_PODCAST) {
                z2 = true;
            }
            Assertion.a(sb3, z2);
        } else {
            StringBuilder sb4 = new StringBuilder(str2);
            sb4.append(linkType);
            sb4.append(" but itemType is not track or album.");
            String sb5 = sb4.toString();
            if (itemType == ItemType.ALBUM) {
                z2 = true;
            }
            Assertion.a(sb5, z2);
        }
        kxj kxj = new kxj(fyt.a(), sih, fpt);
        int i = AnonymousClass1.a[albumCollectionState.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                if (albumCollectionState == AlbumCollectionState.PARTIALLY && z) {
                    fyt.a((int) R.id.options_menu_add_to_collection, (int) R.string.options_menu_collection_complete_album, fzf.a(fyt.a(), SpotifyIconV2.PLUS)).a(new Runnable(sih, str, kxj) {
                        private final /* synthetic */ sih f$1;
                        private final /* synthetic */ String f$2;
                        private final /* synthetic */ kxi f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            ToolbarMenuHelper.this.b(this.f$1, this.f$2, this.f$3);
                        }
                    });
                }
                int i2 = R.string.options_menu_remove_from_collection;
                if (linkType == LinkType.SHOW_SHOW) {
                    i2 = R.string.options_menu_unfollow_in_collection;
                }
                fyt.a((int) R.id.options_menu_remove_from_collection, i2, fzf.a(fyt.a(), SpotifyIconV2.X)).a(new Runnable(sih, str, kxj) {
                    private final /* synthetic */ sih f$1;
                    private final /* synthetic */ String f$2;
                    private final /* synthetic */ kxi f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
            return;
        }
        int i3 = R.string.options_menu_add_to_collection;
        if (linkType == LinkType.SHOW_SHOW) {
            i3 = itemType == ItemType.VIDEO_PODCAST ? R.string.options_menu_follow_video_in_collection : R.string.options_menu_follow_podcast_in_collection;
        }
        fyt.a((int) R.id.options_menu_add_to_collection, i3, fzf.a(fyt.a(), SpotifyIconV2.PLUS)).a(new Runnable(sih, str, kxj) {
            private final /* synthetic */ sih f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ kxi f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                ToolbarMenuHelper.this.c(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(sih sih, String str, kxi kxi) {
        a(sih, ContextMenuEvent.ADD_TO_COLLECTION, str, upj.a(str, true));
        kxi.a(str, sih.toString(), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(sih sih, String str, kxi kxi) {
        a(sih, ContextMenuEvent.COMPLETE_ALBUM_IN_COLLECTION, str, upj.a(str, true));
        kxi.a(str, sih.toString(), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sih sih, String str, kxi kxi) {
        a(sih, ContextMenuEvent.REMOVE_FROM_COLLECTION, str, upj.a(str, false));
        kxi.a(str, true);
    }

    public final void a(fyt fyt, sih sih, String str) {
        fyt.a((int) R.id.options_menu_report_abuse, (int) R.string.options_menu_report_abuse, fzf.a(fyt.a(), SpotifyIconV2.REPORT_ABUSE)).a(new Runnable(sih, str, fyt) {
            private final /* synthetic */ sih f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ fyt f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sih sih, String str, fyt fyt) {
        a(sih, ContextMenuEvent.REPORT_ABUSE, str, (InteractionAction) null);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        fyt.a().startActivity(intent);
    }

    @Deprecated
    public static void a(fyt fyt, String str, String str2, Uri uri, String str3, iww iww) {
        fyy a2 = fyt.a((int) R.id.actionbar_item_share, (CharSequence) fyt.a().getString(R.string.actionbar_item_share), fzf.a(fyt.a(), SpotifyIconV2.SHARE_ANDROID));
        $$Lambda$ToolbarMenuHelper$03qEWEMz7oYQsZbkisIupMjbXk r0 = new Runnable(str3, uri, str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ Uri f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                iww.this.a(this.f$1, this.f$2, (String) null, this.f$3, this.f$4, (String) null, jnu.a);
            }
        };
        a2.a(r0);
    }

    public final void a(fyt fyt, sih sih, String str, String str2, fpt fpt, spi spi, Context context) {
        if (!uhq.a(fpt, str)) {
            fyy a2 = fyt.a((int) R.id.actionbar_item_radio, (CharSequence) fyt.a().getString(uhq.a(jst.a(str))), fzf.a(fyt.a(), SpotifyIconV2.RADIO));
            if (fpt.b(ufx.d)) {
                a2.a(new Runnable(sih, str, context) {
                    private final /* synthetic */ sih f$1;
                    private final /* synthetic */ String f$2;
                    private final /* synthetic */ Context f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3);
                    }
                });
                return;
            }
            $$Lambda$ToolbarMenuHelper$R97WKjBSGjZh1ek_QAyHMxIgCr0 r0 = new Runnable(str, sih, spi, str2) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ sih f$2;
                private final /* synthetic */ spi f$3;
                private final /* synthetic */ String f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    ToolbarMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4);
                }
            };
            a2.a(r0);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, sih sih, spi spi, String str2) {
        String c2 = uhq.c(str);
        if (c2 != null) {
            a(sih, ContextMenuEvent.START_RADIO, c2, (InteractionAction) null);
            spi.a(spd.a(c2).b(str2).a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sih sih, String str, Context context) {
        a(sih, ContextMenuEvent.START_RADIO, str, (InteractionAction) null);
        context.startService(RadioFormatListService.a(context, str));
    }

    public static View a(fyt fyt, OnClickListener onClickListener) {
        return a(fyt, (int) R.string.actionbar_item_shuffle_play, (int) R.id.actionbar_item_shuffle_play, SpotifyIconV2.PLAY, onClickListener);
    }

    public final fyu a(sih sih, fyt fyt, spi spi) {
        return fyt.a(R.id.actionbar_item_settings, fyt.a().getString(R.string.settings_title)).a((Drawable) new SpotifyIconDrawable(fyt.a(), SpotifyIconV2.GEARS, (float) fyt.a().getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size))).a((Runnable) new Runnable(sih, spi) {
            private final /* synthetic */ sih f$1;
            private final /* synthetic */ spi f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sih sih, spi spi) {
        a(sih, ContextMenuEvent.SETTINGS, ViewUris.U.toString(), (InteractionAction) null);
        spi.a("spotify:internal:preferences");
    }

    public static Button a(fyt fyt, int i, int i2, SpotifyIconV2 spotifyIconV2, OnClickListener onClickListener) {
        String string = fyt.a().getString(i);
        fyu a2 = fyt.a(i2, string);
        Resources resources = fyt.a().getResources();
        Button a3 = fzc.a(fyt.a(), string, spotifyIconV2, onClickListener);
        FrameLayout frameLayout = new FrameLayout(fyt.a());
        frameLayout.setLayoutParams(new LayoutParams(-2, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.actionbar_play_button_container_padding);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        a3.setLayoutParams(layoutParams);
        frameLayout.addView(a3);
        a2.a((View) frameLayout);
        return a3;
    }

    public static void a(fyt fyt, String str, String str2, String str3, sih sih) {
        fyy a2 = fyt.a((int) R.id.options_menu_add_to_home_screen, (int) R.string.options_menu_add_to_home_screen, fzf.a(fyt.a(), SpotifyIconV2.DEVICE_MOBILE));
        $$Lambda$ToolbarMenuHelper$ycnkHSrCowMAe4giRh_WOPkzBAU r1 = new Runnable(str, str2, str3, sih) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ sih f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                ShortcutInstallerService.a(fyt.this.a(), this.f$1, this.f$2, this.f$3, this.f$4);
            }
        };
        a2.a(r1);
    }
}
