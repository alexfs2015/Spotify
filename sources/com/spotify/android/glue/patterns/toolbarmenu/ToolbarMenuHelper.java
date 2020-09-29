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
    private final jlr a;
    private final jvf b;
    private final uqm c;

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

    public ToolbarMenuHelper(jlr jlr, jvf jvf, uqm uqm) {
        this.a = jlr;
        this.b = jvf;
        this.c = uqm;
    }

    public static View a(fzn fzn, OnClickListener onClickListener) {
        return a(fzn, (int) R.string.actionbar_item_shuffle_play, (int) R.id.actionbar_item_shuffle_play, SpotifyIconV2.PLAY, onClickListener);
    }

    public static Button a(fzn fzn, int i, int i2, SpotifyIconV2 spotifyIconV2, OnClickListener onClickListener) {
        String string = fzn.a().getString(i);
        fzo a2 = fzn.a(i2, string);
        Resources resources = fzn.a().getResources();
        Button a3 = fzw.a(fzn.a(), string, spotifyIconV2, onClickListener);
        FrameLayout frameLayout = new FrameLayout(fzn.a());
        frameLayout.setLayoutParams(new LayoutParams(-2, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.actionbar_play_button_container_padding);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        a3.setLayoutParams(layoutParams);
        frameLayout.addView(a3);
        a2.a((View) frameLayout);
        return a3;
    }

    @Deprecated
    public static void a(fzn fzn, String str, String str2, Uri uri, String str3, izh izh) {
        fzs a2 = fzn.a((int) R.id.actionbar_item_share, (CharSequence) fzn.a().getString(R.string.actionbar_item_share), fzz.a(fzn.a(), SpotifyIconV2.SHARE_ANDROID));
        $$Lambda$ToolbarMenuHelper$1FOyUT9DIuRGVdRJLiIjB6v7E5g r0 = new Runnable(str3, uri, str, str2) {
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
                izh.this.a(this.f$1, this.f$2, (String) null, this.f$3, this.f$4, (String) null, jqg.a);
            }
        };
        a2.a(r0);
    }

    public static void a(fzn fzn, String str, String str2, String str3, sso sso) {
        fzs a2 = fzn.a((int) R.id.options_menu_add_to_home_screen, (int) R.string.options_menu_add_to_home_screen, fzz.a(fzn.a(), SpotifyIconV2.DEVICE_MOBILE));
        $$Lambda$ToolbarMenuHelper$g2MnNbVYgB81zmUGwC9TO1WjDA r1 = new Runnable(str, str2, str3, sso) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ sso f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                ShortcutInstallerService.a(fzn.this.a(), this.f$1, this.f$2, this.f$3, this.f$4);
            }
        };
        a2.a(r1);
    }

    private void a(fzn fzn, sso sso, int i, Runnable runnable) {
        fzn.a((int) R.id.options_menu_download, i, fzz.a(fzn.a(), SpotifyIconV2.DOWNLOAD)).a(new Runnable(sso, runnable) {
            private final /* synthetic */ sso f$1;
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
    public /* synthetic */ void a(fzn fzn, sso sso, int i, Runnable runnable, a aVar) {
        a(fzn, sso, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fzn fzn, sso sso, int i, Runnable runnable, b bVar) {
        a(fzn, sso, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fzn fzn, sso sso, int i, Runnable runnable, c cVar) {
        b(fzn, sso, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fzn fzn, sso sso, int i, Runnable runnable, d dVar) {
        b(fzn, sso, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fzn fzn, sso sso, int i, Runnable runnable, e eVar) {
        b(fzn, sso, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fzn fzn, sso sso, int i, Runnable runnable, f fVar) {
        b(fzn, sso, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fzn fzn, sso sso, int i, Runnable runnable, g gVar) {
        b(fzn, sso, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fzn fzn, sso sso, int i, Runnable runnable, h hVar) {
        a(fzn, sso, i, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, sso sso, szp szp, String str2) {
        String b2 = ute.b(str);
        if (b2 != null) {
            a(sso, ContextMenuEvent.START_RADIO, b2, (InteractionAction) null);
            szp.a(szk.a(b2).b(str2).a());
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [hdp] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.sso r32, com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent r33, java.lang.String r34, com.spotify.music.ubi.interactions.InteractionAction r35) {
        /*
            r31 = this;
            r0 = r31
            r1 = r35
            uqm r2 = r0.c
            jtz r3 = defpackage.jtp.a
            long r3 = r3.a()
            if (r1 == 0) goto L_0x0033
            hdr$bh r18 = new hdr$bh
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
            hdr$bg r1 = new hdr$bg
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
            jlr r2 = r0.a
            r2.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper.a(sso, com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent, java.lang.String, com.spotify.music.ubi.interactions.InteractionAction):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sso sso, Runnable runnable) {
        a(sso, ContextMenuEvent.DOWNLOAD, sso.toString(), (InteractionAction) null);
        runnable.run();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sso sso, String str, Context context) {
        a(sso, ContextMenuEvent.START_RADIO, str, (InteractionAction) null);
        context.startService(RadioFormatListService.a(context, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sso sso, String str, fzn fzn) {
        a(sso, ContextMenuEvent.REPORT_ABUSE, str, (InteractionAction) null);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        fzn.a().startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sso sso, String str, lar lar) {
        a(sso, ContextMenuEvent.REMOVE_FROM_COLLECTION, str, vao.a(str, false));
        lar.a(str, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sso sso, szp szp) {
        a(sso, ContextMenuEvent.SETTINGS, ViewUris.T.toString(), (InteractionAction) null);
        szp.a("spotify:internal:preferences");
    }

    private void b(fzn fzn, sso sso, int i, Runnable runnable) {
        fzn.a((int) R.id.options_menu_download, i, fzz.a(fzn.a(), SpotifyIconV2.DOWNLOAD)).a(new Runnable(sso, runnable) {
            private final /* synthetic */ sso f$1;
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
    public /* synthetic */ void b(sso sso, Runnable runnable) {
        a(sso, ContextMenuEvent.UNDOWNLOAD, sso.toString(), (InteractionAction) null);
        runnable.run();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(sso sso, String str, lar lar) {
        a(sso, ContextMenuEvent.COMPLETE_ALBUM_IN_COLLECTION, str, vao.a(str, true));
        lar.a(str, sso.toString(), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(sso sso, String str, lar lar) {
        a(sso, ContextMenuEvent.ADD_TO_COLLECTION, str, vao.a(str, true));
        lar.a(str, sso.toString(), true);
    }

    public final fzo a(sso sso, fzn fzn, szp szp) {
        return fzn.a(R.id.actionbar_item_settings, fzn.a().getString(R.string.settings_title)).a((Drawable) new SpotifyIconDrawable(fzn.a(), SpotifyIconV2.GEARS, (float) fzn.a().getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size))).a((Runnable) new Runnable(sso, szp) {
            private final /* synthetic */ sso f$1;
            private final /* synthetic */ szp f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ToolbarMenuHelper.this.a(this.f$1, this.f$2);
            }
        });
    }

    public final void a(fzn fzn, sso sso, AlbumCollectionState albumCollectionState, boolean z, String str, ItemType itemType, fqn fqn) {
        LinkType linkType = jva.a(str).b;
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
        las las = new las(fzn.a(), sso, fqn);
        int i = AnonymousClass1.a[albumCollectionState.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                if (albumCollectionState == AlbumCollectionState.PARTIALLY && z) {
                    fzn.a((int) R.id.options_menu_add_to_collection, (int) R.string.options_menu_collection_complete_album, fzz.a(fzn.a(), SpotifyIconV2.PLUS)).a(new Runnable(sso, str, las) {
                        private final /* synthetic */ sso f$1;
                        private final /* synthetic */ String f$2;
                        private final /* synthetic */ lar f$3;

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
                fzn.a((int) R.id.options_menu_remove_from_collection, i2, fzz.a(fzn.a(), SpotifyIconV2.X)).a(new Runnable(sso, str, las) {
                    private final /* synthetic */ sso f$1;
                    private final /* synthetic */ String f$2;
                    private final /* synthetic */ lar f$3;

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
        fzn.a((int) R.id.options_menu_add_to_collection, i3, fzz.a(fzn.a(), SpotifyIconV2.PLUS)).a(new Runnable(sso, str, las) {
            private final /* synthetic */ sso f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ lar f$3;

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

    public final void a(fzn fzn, sso sso, String str) {
        fzn.a((int) R.id.options_menu_report_abuse, (int) R.string.options_menu_report_abuse, fzz.a(fzn.a(), SpotifyIconV2.REPORT_ABUSE)).a(new Runnable(sso, str, fzn) {
            private final /* synthetic */ sso f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ fzn f$3;

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

    public final void a(fzn fzn, sso sso, String str, String str2, fqn fqn, szp szp, Context context) {
        if (!ute.a(fqn, str)) {
            fzs a2 = fzn.a((int) R.id.actionbar_item_radio, (CharSequence) fzn.a().getString(ute.a(jva.a(str))), fzz.a(fzn.a(), SpotifyIconV2.RADIO));
            if (fqn.b(url.d)) {
                a2.a(new Runnable(sso, str, context) {
                    private final /* synthetic */ sso f$1;
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
            $$Lambda$ToolbarMenuHelper$_TVigXIQgCA3hDrn7UWzPlXkDo r0 = new Runnable(str, sso, szp, str2) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ sso f$2;
                private final /* synthetic */ szp f$3;
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

    public final void a(fzn fzn, sso sso, vli vli, int i, Runnable runnable, int i2, Runnable runnable2) {
        fzn fzn2 = fzn;
        sso sso2 = sso;
        $$Lambda$ToolbarMenuHelper$5TDSrvD9CXbx23AIfDaOOLMXdY r0 = new ged(fzn2, sso2, i, runnable) {
            private final /* synthetic */ fzn f$1;
            private final /* synthetic */ sso f$2;
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
        $$Lambda$ToolbarMenuHelper$X8Xro3mKwq2p5wleuP_3fwEek2E r02 = new ged(fzn2, sso2, i3, runnable3) {
            private final /* synthetic */ fzn f$1;
            private final /* synthetic */ sso f$2;
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
        $$Lambda$ToolbarMenuHelper$hjpOD24PNG3nJBfkWKi8AXy0hnQ r03 = new ged(fzn2, sso2, i3, runnable3) {
            private final /* synthetic */ fzn f$1;
            private final /* synthetic */ sso f$2;
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
        $$Lambda$ToolbarMenuHelper$ENKARX4sEuo0dsy9OlrZi_1H3BE r04 = new ged(fzn2, sso2, i3, runnable3) {
            private final /* synthetic */ fzn f$1;
            private final /* synthetic */ sso f$2;
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
        $$Lambda$ToolbarMenuHelper$zx10XXerJbSWtAPII6wGO7YCI r05 = new ged(fzn2, sso2, i4, runnable4) {
            private final /* synthetic */ fzn f$1;
            private final /* synthetic */ sso f$2;
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
        $$Lambda$ToolbarMenuHelper$biZ14xzKBYJKpNAy73xR5dBJkk r06 = new ged(fzn2, sso2, i4, runnable4) {
            private final /* synthetic */ fzn f$1;
            private final /* synthetic */ sso f$2;
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
        $$Lambda$ToolbarMenuHelper$LzYPwdKTb005TfEwnleA1gXh7Q r07 = new ged(fzn2, sso2, i4, runnable4) {
            private final /* synthetic */ fzn f$1;
            private final /* synthetic */ sso f$2;
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
        $$Lambda$ToolbarMenuHelper$ned6MZHf5CSzlDgPhHp88ig3iA0 r08 = new ged(fzn2, sso2, i4, runnable4) {
            private final /* synthetic */ fzn f$1;
            private final /* synthetic */ sso f$2;
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
        vli.a((ged<f>) r0, (ged<h>) r02, (ged<b>) r03, (ged<a>) r04, (ged<c>) r05, (ged<e>) r06, (ged<d>) r07, (ged<g>) r08);
    }

    public final void a(fzn fzn, sso sso, vli vli, Runnable runnable, Runnable runnable2) {
        a(fzn, sso, vli, (int) R.string.options_menu_download, runnable, (int) R.string.options_menu_undownload, runnable2);
    }

    public final void a(fzn fzn, sso sso, boolean z, boolean z2, String str, ItemType itemType, fqn fqn) {
        a(fzn, sso, z ? AlbumCollectionState.YES : AlbumCollectionState.NO, false, str, itemType, fqn);
    }
}
