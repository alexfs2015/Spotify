package com.spotify.mobile.android.ui.contextmenu;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.provider.Telephony.Sms;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.core.http.HttpConnection;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.playlist.service.PlaylistService;
import com.spotify.mobile.android.recentlyplayed.RecentlyPlayedService;
import com.spotify.mobile.android.shortcut.ShortcutInstallerService;
import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;
import com.spotify.mobile.android.spotlets.share.ShareResultReceiver;
import com.spotify.mobile.android.spotlets.share.facebook.FacebookFeedShareActivity;
import com.spotify.mobile.android.spotlets.share.facebook.MessengerShareActivity;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.Destination;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.Interaction;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.Result;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.UserIntent;
import com.spotify.mobile.android.spotlets.share.stories.ui.FacebookStoryShareLoaderActivity;
import com.spotify.mobile.android.spotlets.share.stories.ui.InstagramStoryShareLoaderActivity;
import com.spotify.mobile.android.spotlets.share.stories.ui.SnapchatStoryShareLoaderActivity;
import com.spotify.mobile.android.ui.activity.ConfirmDeletionActivity;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.video.model.ContextPlayerConfiguration;
import com.spotify.music.R;
import com.spotify.music.features.addtoplaylist.AddToPlaylistActivity;
import com.spotify.music.features.editplaylist.EditPlaylistActivity;
import com.spotify.music.features.queue.service.QueueService;
import com.spotify.music.features.reportexplicit.ReportTrackExplicitService;
import com.spotify.music.features.trackcredits.TrackCreditsActivity;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListService;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.music.ubi.interactions.InteractionAction;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ContextMenuHelper {
    private final Scheduler A;
    public final Activity a;
    public final ContextMenuViewModel b;
    private final iwt c;
    private final jsz d;
    private final jxo e;
    private final jyj f;
    private final jno g;
    private final ToastieManager h;
    private final jjf i;
    private final kxg j;
    private final rgz k;
    private final twu l;
    private final uqi m;
    private final hdb n;
    private final FollowManager o;
    private final uab p;
    private final FireAndForgetResolver q;
    private final gbd r;
    private final tcn s;
    private final Flowable<PlayerState> t;
    private final ruz u;
    private final udr v;
    private final sih w;
    private final jnu x;
    private final fpt y;
    private final izg z;

    /* renamed from: com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];
        static final /* synthetic */ int[] b = new int[AlbumCollectionState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        static {
            /*
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState[] r0 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r2 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.NO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r3 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.YES     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r4 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.PARTIALLY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.spotify.mobile.android.util.LinkType[] r3 = com.spotify.mobile.android.util.LinkType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.spotify.mobile.android.util.LinkType r4 = com.spotify.mobile.android.util.LinkType.COLLECTION_PLAYLIST_FOLDER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TOPLIST     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TRACK     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE_TIMESTAMP     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.AnonymousClass1.<clinit>():void");
        }
    }

    public enum ItemType {
        AUDIO_PODCAST,
        VIDEO_PODCAST,
        TRACK_OR_ALBUM_OR_EPISODE
    }

    public ContextMenuHelper(iwt iwt, jsz jsz, jxo jxo, jyj jyj, jno jno, ToastieManager toastieManager, jjf jjf, kxg kxg, rgz rgz, twu twu, uqi uqi, hdb hdb, FollowManager followManager, Scheduler scheduler, uab uab, FireAndForgetResolver fireAndForgetResolver, gbd gbd, tcn tcn, Flowable<PlayerState> flowable, ruz ruz, Activity activity, izg izg, udr udr, sih sih, ContextMenuViewModel contextMenuViewModel, jnu jnu, fpt fpt) {
        this.c = iwt;
        this.d = jsz;
        this.e = jxo;
        this.f = jyj;
        this.g = jno;
        this.h = toastieManager;
        this.i = jjf;
        this.j = kxg;
        this.k = rgz;
        this.l = twu;
        this.m = uqi;
        this.n = hdb;
        this.o = followManager;
        this.A = scheduler;
        this.p = uab;
        this.q = fireAndForgetResolver;
        this.r = gbd;
        this.s = tcn;
        this.t = flowable;
        this.u = ruz;
        this.a = activity;
        this.v = udr;
        this.w = sih;
        this.b = contextMenuViewModel;
        this.x = jnu;
        this.y = fpt;
        this.z = izg;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [haw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent r28, java.lang.String r29, com.spotify.music.ubi.interactions.InteractionAction r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r30
            r27.a(r28)
            if (r1 == 0) goto L_0x0032
            hay$bi r14 = new hay$bi
            r2 = 0
            udr r3 = r0.v
            java.lang.String r3 = r3.toString()
            sih r4 = r0.w
            java.lang.String r4 = r4.toString()
            r6 = -1
            java.lang.String r10 = r28.toString()
            jrp r5 = defpackage.jrf.a
            long r8 = r5.a()
            double r11 = (double) r8
            java.lang.String r13 = r1.mLogString
            java.lang.String r5 = "context-menu"
            java.lang.String r9 = "hit"
            r1 = r14
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r13)
            goto L_0x005c
        L_0x0032:
            hay$bh r1 = new hay$bh
            r16 = 0
            udr r2 = r0.v
            java.lang.String r17 = r2.toString()
            sih r2 = r0.w
            java.lang.String r18 = r2.toString()
            r20 = -1
            java.lang.String r24 = r28.toString()
            jrp r2 = defpackage.jrf.a
            long r2 = r2.a()
            double r2 = (double) r2
            java.lang.String r19 = "context-menu"
            java.lang.String r23 = "hit"
            r15 = r1
            r22 = r29
            r25 = r2
            r15.<init>(r16, r17, r18, r19, r20, r22, r23, r24, r25)
            r14 = r1
        L_0x005c:
            jjf r1 = r0.i
            r1.a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.a(com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent, java.lang.String, com.spotify.music.ubi.interactions.InteractionAction):void");
    }

    private void a(ContextMenuEvent contextMenuEvent) {
        this.x.a(contextMenuEvent);
    }

    public final void a(String str, uzf uzf) {
        kxn kxn = new kxn(this.a);
        a(str, uzf, (fui) new fui(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                kxm.this.a(this.f$1);
            }
        }, (fui) new fui(str, new fui(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                kxm.this.b(this.f$1);
            }
        }) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fug);
            }
        });
    }

    public final void a(String str, uzf uzf, fui fui, fui fui2) {
        uzf.a((gcs<f>) new gcs(str, fui) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (f) obj);
            }
        }, (gcs<h>) new gcs(str, fui2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (h) obj);
            }
        }, (gcs<b>) new gcs(str, fui2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (b) obj);
            }
        }, (gcs<a>) new gcs(str, fui2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (a) obj);
            }
        }, (gcs<c>) new gcs(str, fui) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (c) obj);
            }
        }, (gcs<e>) new gcs(str, fui) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (e) obj);
            }
        }, (gcs<d>) new gcs(str, fui) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (d) obj);
            }
        }, (gcs<g>) new gcs(str, fui) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fui f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (g) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, f fVar) {
        b(str, fui);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, h hVar) {
        a(str, fui);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, b bVar) {
        a(str, fui);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, a aVar) {
        a(str, fui);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, c cVar) {
        b(str, fui);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, e eVar) {
        b(str, fui);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, d dVar) {
        b(str, fui);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, g gVar) {
        b(str, fui);
    }

    private void a(String str, fui fui) {
        a((int) R.id.context_menu_download, (int) R.string.context_menu_undownload, a(SpotifyIconV2.DOWNLOAD, (int) R.color.cat_light_green)).a(a(str, ContextMenuEvent.UNDOWNLOAD, false, fui));
    }

    private void b(String str, fui fui) {
        a((int) R.id.context_menu_download, (int) R.string.context_menu_download, a(SpotifyIconV2.DOWNLOAD, (int) R.color.cat_grayscale_55)).a(a(str, ContextMenuEvent.DOWNLOAD, true, fui));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fui fui, fug fug) {
        if (LinkType.SHOW_EPISODE != jst.a(str).b) {
            this.d.a((int) R.string.toast_undownload, 0, new Object[0]);
        }
        fui.onMenuItemClick(fug);
    }

    private fui a(String str, ContextMenuEvent contextMenuEvent, boolean z2, fui fui) {
        $$Lambda$ContextMenuHelper$vHc4Nl6UfBtgJ2w9rgku4TLJS4 r0 = new fui(contextMenuEvent, str, z2, fui) {
            private final /* synthetic */ ContextMenuEvent f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ boolean f$3;
            private final /* synthetic */ fui f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        return r0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ContextMenuEvent contextMenuEvent, String str, boolean z2, fui fui, fug fug) {
        a(contextMenuEvent, str, (InteractionAction) null);
        OffliningLogger.a(this.w, str, SourceElement.CONTEXT_MENU, z2);
        fui.onMenuItemClick(fug);
    }

    public final void a(String str, boolean z2) {
        Drawable drawable;
        int i2;
        boolean a2 = hdb.a(this.y);
        if (a2) {
            i2 = z2 ? R.string.context_menu_unlike_playlist : R.string.context_menu_like_playlist;
            if (z2) {
                drawable = a(SpotifyIconV2.HEART, (int) R.color.cat_grayscale_55);
            } else {
                drawable = a(SpotifyIconV2.HEART_ACTIVE, (int) R.color.green);
            }
        } else {
            i2 = z2 ? R.string.context_menu_unsubscribe : R.string.context_menu_subscribe;
            drawable = a(z2 ? SpotifyIconV2.X : SpotifyIconV2.PLUS);
        }
        a((int) R.id.context_menu_subscribe, i2, drawable).a((fui) new fui(z2, str, a2) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, boolean z3, fug fug) {
        a(z2 ? ContextMenuEvent.REMOVE : ContextMenuEvent.SUBSCRIBE, str, z2 ? InteractionAction.UNLIKE : InteractionAction.LIKE);
        if (!z2) {
            PlaylistService.a((Context) this.a, (String) fay.a(str));
        } else {
            PlaylistService.b(this.a, (String) fay.a(str));
        }
        rcn rcn = new rcn(this.a, this.h, this.d);
        if (z3) {
            if (!z2) {
                rcn.a(R.string.toast_liked_show_your_library);
            }
        } else if (!z2) {
            rcn.a();
        } else {
            rcn.b();
        }
    }

    public final void a(String str, String str2) {
        a(str, str2, (int) R.string.context_menu_browse_album);
    }

    public final void b(String str, String str2) {
        a(str, str2, (int) R.string.context_menu_browse_full_album);
    }

    private void a(String str, String str2, int i2) {
        a((int) R.id.context_menu_browse_album, i2, SpotifyIconV2.ALBUM).a((fui) new fui(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.f(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(String str, String str2, fug fug) {
        a(ContextMenuEvent.BROWSE_ALBUM, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(kmf.a(activity, str).a(str2).a);
    }

    public final void a(List<uyr> list) {
        uyr uyr = (uyr) fay.a(list.get(0));
        b(uyr.getUri(), uyr.getName(), (int) R.string.context_menu_browse_artist);
    }

    public final void c(String str, String str2) {
        b(str, str2, (int) R.string.context_menu_browse_artist);
    }

    private void b(String str, String str2, int i2) {
        a((int) R.id.context_menu_browse_artist, (int) R.string.context_menu_browse_artist, SpotifyIconV2.ARTIST).a((fui) new fui(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.e(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(String str, String str2, fug fug) {
        a(ContextMenuEvent.BROWSE_ARTIST, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(kmf.a(activity, str).a(str2).a);
    }

    public final void a(String str) {
        a((int) R.id.context_menu_edit_playlist, (int) R.string.context_menu_edit_playlist, SpotifyIconV2.EDIT).a((fui) new fui(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.g(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(String str, fug fug) {
        a(ContextMenuEvent.EDIT, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(EditPlaylistActivity.a((Context) activity, str));
    }

    public final void d(String str, String str2) {
        int i2;
        jst a2 = jst.a(str2);
        int i3 = AnonymousClass1.a[a2.b.ordinal()];
        boolean z2 = true;
        if (i3 == 1) {
            i2 = R.string.context_menu_delete_folder;
        } else if (i3 == 2 || i3 == 3 || i3 == 4) {
            i2 = R.string.context_menu_delete_playlist;
        } else {
            StringBuilder sb = new StringBuilder("Trying to add 'Remove Playlist or Folder' for other link type: ");
            sb.append(a2.b);
            Assertion.a(sb.toString());
            i2 = -1;
        }
        if (i2 < 0) {
            z2 = false;
        }
        Assertion.a("Unsupported uri type.", z2);
        a((int) R.id.context_menu_delete_playlist, i2, SpotifyIconV2.X).a((fui) new fui(str2, str) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.d(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2, fug fug) {
        a(ContextMenuEvent.REMOVE, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(ConfirmDeletionActivity.a(activity, str2, str));
    }

    public final void a(String str, String str2, LinkType linkType) {
        int i2;
        Drawable drawable;
        boolean z2 = this.k.a(this.y) || twu.a(this.y);
        int i3 = AnonymousClass1.a[linkType.ordinal()];
        if (i3 == 5) {
            i2 = R.string.toast_track_removed;
        } else if (i3 == 6 || i3 == 7) {
            i2 = R.string.toast_episode_removed;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported link type ");
            sb.append(linkType);
            Assertion.a(sb.toString());
            i2 = 0;
        }
        if (this.j.a(this.y)) {
            drawable = a(SpotifyIconV2.BLOCK, (int) R.color.cat_grayscale_55);
        } else {
            drawable = a(SpotifyIconV2.X);
        }
        fug a2 = a((int) R.id.context_menu_remove_item_from_playlist, (int) R.string.context_menu_remove_item_from_playlist, drawable);
        $$Lambda$ContextMenuHelper$WvETRg8Ja0UkptUKJnbovQl1aIY r2 = new fui(str, str2, z2, i2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ boolean f$3;
            private final /* synthetic */ int f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        a2.a((fui) r2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, boolean z2, int i2, fug fug) {
        a(ContextMenuEvent.REMOVE, str, (InteractionAction) null);
        PlaylistService.a((Context) this.a, str, str2);
        if (z2) {
            uos a2 = uos.a(this.a.getString(i2), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
            if (this.h.b()) {
                this.h.a(a2);
            } else {
                this.h.a = a2;
            }
        } else {
            this.d.a(i2, 1, new Object[0]);
        }
    }

    public final void b(String str) {
        a((int) R.id.context_menu_queue_track_or_album, (int) R.string.context_menu_add_to_queue, SpotifyIconV2.ADD_TO_QUEUE).a((fui) new fui(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.f(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(String str, fug fug) {
        a(ContextMenuEvent.ADD_TO_QUEUE, str, (InteractionAction) null);
        QueueService.a(this.a, str);
    }

    public final void c(String str) {
        a((int) R.id.context_menu_go_to_queue, (int) R.string.context_menu_go_to_queue, SpotifyIconV2.QUEUE).a((fui) new fui(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.e(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(String str, fug fug) {
        a(ContextMenuEvent.BROWSE_QUEUE, str, (InteractionAction) null);
        this.s.b();
    }

    public final void a(PlayerTrack playerTrack) {
        a((int) R.id.context_menu_queue_track_or_album, (int) R.string.context_menu_add_to_queue, SpotifyIconV2.ADD_TO_QUEUE).a((fui) new fui(playerTrack) {
            private final /* synthetic */ PlayerTrack f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, fug fug) {
        a(ContextMenuEvent.ADD_TO_QUEUE, playerTrack.uri(), (InteractionAction) null);
        QueueService.a(this.a, Collections.singletonList(playerTrack), true);
    }

    public final void a(String str, String str2, String str3) {
        a(str, (int) R.string.context_menu_add_to_playlist, str2, str3);
    }

    public final void b(String str, String str2, String str3) {
        a(str, (int) R.string.context_menu_add_to_other_playlist, str2, str3);
    }

    private void a(String str, int i2, String str2, String str3) {
        a((int) R.id.context_menu_add_to_playlist, i2, SpotifyIconV2.ADD_TO_PLAYLIST).a((fui) new fui(str, str2, str3) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, this.f$3, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, String str3, fug fug) {
        a(ContextMenuEvent.ADD_TO_PLAYLIST, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(AddToPlaylistActivity.a(activity, Collections.singletonList(str), str2, str3));
    }

    public final void a(String str, String str2, String str3, String str4, Uri uri) {
        Activity activity = this.a;
        if (activity instanceof ka) {
            ka kaVar = (ka) activity;
            fug a2 = a((int) R.id.context_menu_share, (int) R.string.context_menu_share, SpotifyIconV2.SHARE_ANDROID);
            $$Lambda$ContextMenuHelper$k2GYUkYTtEM4WD5aL63QvgDAcr8 r2 = new fui(kaVar, str3, uri, str4, str, str2) {
                private final /* synthetic */ ka f$1;
                private final /* synthetic */ String f$2;
                private final /* synthetic */ Uri f$3;
                private final /* synthetic */ String f$4;
                private final /* synthetic */ String f$5;
                private final /* synthetic */ String f$6;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r7;
                }

                public final void onMenuItemClick(fug fug) {
                    ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, fug);
                }
            };
            a2.a((fui) r2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ka kaVar, String str, Uri uri, String str2, String str3, String str4, fug fug) {
        iwx iwx = new iwx(kaVar, this.w, this.y, this.i, this.t, this.A, this.c);
        iwx.a(str, uri, str2, str3, str4, (String) null, this.x);
    }

    public final void a(long j2, ixe ixe, ShareEventLogger shareEventLogger) {
        $$Lambda$ContextMenuHelper$pTjkHywWgcpdEoYkHucVf4QVW80 r1 = new fui((ka) this.a, ixe, shareEventLogger, j2) {
            private final /* synthetic */ ka f$1;
            private final /* synthetic */ ixe f$2;
            private final /* synthetic */ ShareEventLogger f$3;
            private final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        a((int) R.id.context_menu_share_copy_link, (int) R.string.share_contextmenu_copy_link, SpotifyIconV2.COPY).a((fui) r1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ka kaVar, ixe ixe, ShareEventLogger shareEventLogger, long j2, fug fug) {
        a(ContextMenuEvent.SHARE);
        ((ClipboardManager) kaVar.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(kaVar.getString(R.string.share_contextmenu_copy_link_label), ixe.a()));
        this.d.a((int) R.string.toast_copy_link, 1, new Object[0]);
        shareEventLogger.b(ixe.b, j2);
    }

    public final void a(long j2, ixe ixe, String str, ShareEventLogger shareEventLogger) {
        long j3 = j2;
        ixe ixe2 = ixe;
        String str2 = "";
        if (VERSION.SDK_INT >= 19) {
            Activity activity = this.a;
            Assertion.a((Object) activity);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(activity);
            if (defaultSmsPackage != null) {
                Assertion.a((Object) defaultSmsPackage);
                Assertion.a((Object) str);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType(HttpConnection.kDefaultContentType);
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setPackage(defaultSmsPackage);
                $$Lambda$ContextMenuHelper$LlS49A3GwyTTlyTG015xOkr_a8Q r0 = new fui(shareEventLogger, ixe, j2, intent) {
                    private final /* synthetic */ ShareEventLogger f$1;
                    private final /* synthetic */ ixe f$2;
                    private final /* synthetic */ long f$3;
                    private final /* synthetic */ Intent f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r6;
                    }

                    public final void onMenuItemClick(fug fug) {
                        ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
                    }
                };
                a((int) R.id.context_menu_share_sms, (int) R.string.context_menu_sms, SpotifyIconV2.SMS).a((fui) r0);
                if (ixe2.a.e() != null) {
                    str2 = ixe2.a.e().h();
                }
                a(str2, AppShareDestination.GENERIC_SMS.mLogId, j3);
                return;
            }
        }
        String str3 = str;
        $$Lambda$ContextMenuHelper$aKa0FbbGPCpLjFR1FiP8iWlB0k r02 = new fui(str, shareEventLogger, ixe, j2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ ShareEventLogger f$2;
            private final /* synthetic */ ixe f$3;
            private final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        a((int) R.id.context_menu_share_sms, (int) R.string.context_menu_sms, SpotifyIconV2.SMS).a((fui) r02);
        if (ixe2.a.e() != null) {
            str2 = ixe2.a.e().h();
        }
        a(str2, AppShareDestination.GENERIC_SMS.mLogId, j3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ShareEventLogger shareEventLogger, ixe ixe, long j2, Intent intent, fug fug) {
        a(ContextMenuEvent.SHARE);
        shareEventLogger.c(ixe.b, j2);
        this.a.startActivity(intent);
    }

    public final void a(long j2, ixe ixe, sih sih, ShareEventLogger shareEventLogger) {
        $$Lambda$ContextMenuHelper$0Lar3Fr7_s___UWJ6WHmblUQC4 r0 = new fui(shareEventLogger, ixe, j2, sih) {
            private final /* synthetic */ ShareEventLogger f$1;
            private final /* synthetic */ ixe f$2;
            private final /* synthetic */ long f$3;
            private final /* synthetic */ sih f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        a((int) R.id.context_menu_share_more, (int) R.string.share_contextmenu_more, SpotifyIconV2.MORE).a((fui) r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ShareEventLogger shareEventLogger, ixe ixe, long j2, sih sih, fug fug) {
        a(ContextMenuEvent.SHARE);
        shareEventLogger.a(ixe.b, j2);
        Activity activity = this.a;
        String str = shareEventLogger.b;
        String sih2 = sih.toString();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", ixe.a());
        intent.setType(HttpConnection.kDefaultContentType);
        if (VERSION.SDK_INT >= 22) {
            Intent intent2 = new Intent(activity, ShareResultReceiver.class);
            intent2.putExtra("session_id", str);
            intent2.putExtra("entity_uri", ixe.a.a());
            intent2.putExtra("context_uri", ixe.a.b());
            intent2.putExtra("source_page_uri", sih2);
            intent2.putExtra("destination_index", j2);
            intent2.putStringArrayListExtra("test_groups", new ArrayList());
            activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share_chooser_using), PendingIntent.getBroadcast(activity, 0, intent2, 134217728).getIntentSender()));
            return;
        }
        activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share_chooser_using)));
    }

    public final void a(long j2, AppShareDestination appShareDestination, a aVar, ixe ixe, String str, ShareEventLogger shareEventLogger) {
        Drawable drawable;
        AppShareDestination appShareDestination2 = appShareDestination;
        $$Lambda$ContextMenuHelper$FuCZJRGh5P06JvuqD_8oIwybewM r0 = new fui(appShareDestination, ixe, aVar, str, shareEventLogger, j2) {
            private final /* synthetic */ AppShareDestination f$1;
            private final /* synthetic */ ixe f$2;
            private final /* synthetic */ a f$3;
            private final /* synthetic */ String f$4;
            private final /* synthetic */ ShareEventLogger f$5;
            private final /* synthetic */ long f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, fug);
            }
        };
        if (appShareDestination2.mIconResIdSmall != -1) {
            drawable = appShareDestination.a((Context) this.a);
        } else {
            drawable = a((Context) this.a, aVar.a(), (int) R.dimen.context_menu_icon_size);
        }
        a(appShareDestination2.mId, appShareDestination2.mNameStringResId, drawable).a((fui) r0);
        long j3 = j2;
        a(ixe.a.e().h(), appShareDestination2.mLogId, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppShareDestination appShareDestination, ixe ixe, a aVar, String str, ShareEventLogger shareEventLogger, long j2, fug fug) {
        AppShareDestination appShareDestination2 = appShareDestination;
        ixe ixe2 = ixe;
        a(ContextMenuEvent.SHARE);
        if (appShareDestination2.mIsDeeplink) {
            ixf ixf = new ixf(this.q, this.d);
            Activity activity = this.a;
            String a2 = ixe2.a.a();
            String b2 = ixe2.a.b();
            String a3 = ixe.a();
            Handler handler = new Handler(Looper.getMainLooper());
            int i2 = appShareDestination2.mId;
            AnonymousClass2 r1 = new ResolverCallbackReceiver(handler, appShareDestination, a3, activity) {
                private /* synthetic */ AppShareDestination a;
                private /* synthetic */ String b;
                private /* synthetic */ Activity c;

                {
                    this.a = r3;
                    this.b = r4;
                    this.c = r5;
                }

                public final void onResolved(Response response) {
                    Optional optional;
                    if (response.getStatus() == 200) {
                        ixf ixf = ixf.this;
                        int i = this.a.mId;
                        if (ixf.a.indexOfKey(i) >= 0) {
                            optional = Optional.b(Uri.parse(((a) ixf.a.get(i)).a(response)));
                        } else {
                            optional = Optional.e();
                        }
                        if (optional.b()) {
                            Builder buildUpon = ((Uri) optional.c()).buildUpon();
                            buildUpon.appendQueryParameter("sc_attachment", this.b);
                            buildUpon.appendQueryParameter("utm_medium", "snapchat");
                            buildUpon.appendQueryParameter("utm_source", "spotify-share-filter");
                            AppShareDestination appShareDestination = this.a;
                            Activity activity = this.c;
                            fay.a(activity);
                            defpackage.iwo.a aVar = (defpackage.iwo.a) fay.a(new iwo(activity.getPackageManager()).b(appShareDestination.mPackageNameSpace));
                            Activity activity2 = this.c;
                            buildUpon.build();
                            try {
                                this.c.startActivityForResult(AppShareDestination.a((Context) activity2, aVar), 9999);
                                return;
                            } catch (ActivityNotFoundException unused) {
                                String string = this.c.getString(this.a.mNameStringResId);
                                ixf.this.c.a((int) R.string.toast_generic_share_broadcast_error, 1, string);
                                return;
                            }
                        }
                    }
                    ixf.this.c.a((int) R.string.toast_shared_to_external_app_error, 1, this.c.getString(this.a.mNameStringResId));
                }

                public final void onError(Throwable th) {
                    ixf.this.c.a((int) R.string.toast_shared_to_external_app_error, 1, this.c.getString(this.a.mNameStringResId));
                }
            };
            if (ixf.a.indexOfKey(i2) >= 0) {
                ixf.b.resolve(((a) ixf.a.get(i2)).a(a2, b2), r1);
            } else {
                r1.sendOnError(new IllegalArgumentException(String.format("Can not fetch deeplink for specified app id: %s", new Object[]{Integer.valueOf(i2)})));
            }
        } else {
            Intent intent = new Intent(aVar.b());
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType(HttpConnection.kDefaultContentType);
            try {
                this.a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                String string = this.a.getString(appShareDestination2.mNameStringResId);
                this.d.a((int) R.string.toast_generic_share_broadcast_error, 1, string);
                StringBuilder sb = new StringBuilder("Could not start share Activity for ");
                sb.append(string);
                Assertion.b(sb.toString());
            }
        }
        shareEventLogger.a(ixe2.b, appShareDestination2.mLogId, j2);
    }

    public final void a(long j2, AppShareDestination appShareDestination, ixe ixe, ShareEventLogger shareEventLogger) {
        $$Lambda$ContextMenuHelper$kNrWx7qsPw00onjkNjAvmo6H7hY r0 = new fui(ixe, shareEventLogger, appShareDestination, j2) {
            private final /* synthetic */ ixe f$1;
            private final /* synthetic */ ShareEventLogger f$2;
            private final /* synthetic */ AppShareDestination f$3;
            private final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        a(appShareDestination.mId, appShareDestination.mNameStringResId, appShareDestination.a((Context) this.a)).a((fui) r0);
        a(ixe.a.e().h(), appShareDestination.mLogId, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ixe ixe, ShareEventLogger shareEventLogger, AppShareDestination appShareDestination, long j2, fug fug) {
        Activity activity = this.a;
        activity.startActivity(FacebookStoryShareLoaderActivity.a(activity, (String) fay.a(ixe.a.e().h()), ixe.a()));
        shareEventLogger.a(ixe.b, appShareDestination.mLogId, j2);
        a(ContextMenuEvent.SHARE);
    }

    private void a(long j2, AppShareDestination appShareDestination, ixe ixe, ShareEventLogger shareEventLogger, iws iws) {
        $$Lambda$ContextMenuHelper$u_XDPpLmEDkguMbcT73wTqRnZ3o r0 = new fui(iws, shareEventLogger, ixe, appShareDestination, j2) {
            private final /* synthetic */ iws f$1;
            private final /* synthetic */ ShareEventLogger f$2;
            private final /* synthetic */ ixe f$3;
            private final /* synthetic */ AppShareDestination f$4;
            private final /* synthetic */ long f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, fug);
            }
        };
        a(appShareDestination.mId, appShareDestination.mNameStringResId, appShareDestination.a((Context) this.a)).a((fui) r0);
        a(ixe.a.e().h(), appShareDestination.mLogId, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(iws iws, ShareEventLogger shareEventLogger, ixe ixe, AppShareDestination appShareDestination, long j2, fug fug) {
        iws.onShareMenuItemClick(fug);
        shareEventLogger.a(ixe.b, appShareDestination.mLogId, j2);
        a(ContextMenuEvent.SHARE);
    }

    public final void b(long j2, AppShareDestination appShareDestination, ixe ixe, ShareEventLogger shareEventLogger) {
        $$Lambda$ContextMenuHelper$agpdU8UGVbUQJGknN4zGsSQqBy8 r0 = new fui(shareEventLogger, ixe, j2) {
            private final /* synthetic */ ShareEventLogger f$1;
            private final /* synthetic */ ixe f$2;
            private final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fug);
            }
        };
        a(appShareDestination.mId, appShareDestination.mNameStringResId, appShareDestination.a((Context) this.a)).a((fui) r0);
        a(ixe.a.e().h(), appShareDestination.mLogId, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ShareEventLogger shareEventLogger, ixe ixe, long j2, fug fug) {
        ixe ixe2 = ixe;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        jly.a(this.a, new jmf(shareEventLogger, ixe2) {
            private final /* synthetic */ ShareEventLogger f$1;
            private final /* synthetic */ ixe f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final jms onCreateContextMenu(Object obj) {
                return ContextMenuHelper.this.a(this.f$1, this.f$2, (Void) obj);
            }
        }, null, null);
        shareEventLogger2.a(ixe2.b, Destination.FACEBOOK_POPUP, j2, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(ShareEventLogger shareEventLogger, ixe ixe, Void voidR) {
        ixo ixo = new ixo(this.a, this.x, shareEventLogger, ixe, this.i, this.z);
        ixq ixq = new ixq(ixo.a, new ixp(ixo.a, ixo.b, ixo.c, ixo.d), ixo.e, ixo.d, ixo.f);
        return jms.a((jmy<Void>) ixq);
    }

    public final void c(long j2, AppShareDestination appShareDestination, ixe ixe, ShareEventLogger shareEventLogger) {
        a(j2, appShareDestination, ixe, shareEventLogger, (iws) new iws(ixe) {
            private final /* synthetic */ ixe f$1;

            {
                this.f$1 = r2;
            }

            public final void onShareMenuItemClick(fug fug) {
                ContextMenuHelper.this.d(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(ixe ixe, fug fug) {
        Activity activity = this.a;
        activity.startActivity(FacebookFeedShareActivity.a(activity, ixe));
    }

    public final void d(long j2, AppShareDestination appShareDestination, ixe ixe, ShareEventLogger shareEventLogger) {
        a(j2, appShareDestination, ixe, shareEventLogger, (iws) new iws(ixe) {
            private final /* synthetic */ ixe f$1;

            {
                this.f$1 = r2;
            }

            public final void onShareMenuItemClick(fug fug) {
                ContextMenuHelper.this.c(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(ixe ixe, fug fug) {
        Activity activity = this.a;
        activity.startActivity(FacebookStoryShareLoaderActivity.a(activity, (String) fay.a(ixe.a.e().h()), ixe.a()));
    }

    public final void e(long j2, AppShareDestination appShareDestination, ixe ixe, ShareEventLogger shareEventLogger) {
        a(j2, appShareDestination, ixe, shareEventLogger, (iws) new iws(ixe) {
            private final /* synthetic */ ixe f$1;

            {
                this.f$1 = r2;
            }

            public final void onShareMenuItemClick(fug fug) {
                ContextMenuHelper.this.b(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ixe ixe, fug fug) {
        Activity activity = this.a;
        activity.startActivity(InstagramStoryShareLoaderActivity.a(activity, (String) fay.a(ixe.a.e().h()), ixe.a()));
    }

    public final void f(long j2, AppShareDestination appShareDestination, ixe ixe, ShareEventLogger shareEventLogger) {
        a(j2, appShareDestination, ixe, shareEventLogger, (iws) new iws(ixe) {
            private final /* synthetic */ ixe f$1;

            {
                this.f$1 = r2;
            }

            public final void onShareMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ixe ixe, fug fug) {
        Activity activity = this.a;
        activity.startActivity(SnapchatStoryShareLoaderActivity.a(activity, (String) fay.a(ixe.a.e().h()), ixe.a()));
    }

    private void a(String str, String str2, long j2) {
        jjf jjf = this.i;
        String str3 = str;
        String str4 = str2;
        long j3 = j2;
        bf bfVar = new bf("", udt.aQ.toString(), str3, str4, j3, "", ImpressionType.ITEM.toString(), RenderType.LIST.toString(), (double) jrf.a.a());
        jjf.a(bfVar);
    }

    private static Drawable a(Context context, Drawable drawable, int i2) {
        fay.a(context);
        fay.a(drawable);
        return new BitmapDrawable(context.getResources(), a(drawable, context.getResources().getDimensionPixelSize(R.dimen.context_menu_icon_size)));
    }

    private static Bitmap a(Drawable drawable, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final void a(long j2, AppShareDestination appShareDestination, a aVar, ixe ixe, ShareEventLogger shareEventLogger) {
        fug a2 = a(appShareDestination.mId, appShareDestination.mNameStringResId, a((Context) this.a, aVar.a(), (int) R.dimen.context_menu_icon_size));
        $$Lambda$ContextMenuHelper$YG8zngxoDfkPKtX9i9MMQtGnBw r0 = new fui(ixe, shareEventLogger, appShareDestination, j2) {
            private final /* synthetic */ ixe f$1;
            private final /* synthetic */ ShareEventLogger f$2;
            private final /* synthetic */ AppShareDestination f$3;
            private final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        a2.a((fui) r0);
        a(ixe.a.e().h(), appShareDestination.mLogId, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ixe ixe, ShareEventLogger shareEventLogger, AppShareDestination appShareDestination, long j2, fug fug) {
        a(ContextMenuEvent.SHARE);
        Activity activity = this.a;
        activity.startActivity(MessengerShareActivity.a(activity, ixe));
        shareEventLogger.a(ixe.b, appShareDestination.mLogId, j2);
    }

    public final void a(String str, String... strArr) {
        fay.a(true);
        if ((this.y.b(ufx.g) || !this.k.a(this.y)) && !uhq.a(this.y, strArr[0])) {
            int a2 = uhq.a(jst.a(strArr[0]));
            String c2 = uhq.c(strArr[0]);
            fug a3 = a((int) R.id.menu_item_start_station, a2, SpotifyIconV2.RADIO);
            if (this.y.b(ufx.d) || twu.a(this.y)) {
                a3.a((fui) new fui(strArr[0]) {
                    private final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onMenuItemClick(fug fug) {
                        ContextMenuHelper.this.d(this.f$1, fug);
                    }
                });
            } else {
                a3.a((fui) new fui(c2, str) {
                    private final /* synthetic */ String f$1;
                    private final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onMenuItemClick(fug fug) {
                        ContextMenuHelper.this.c(this.f$1, this.f$2, fug);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, String str2, fug fug) {
        a(ContextMenuEvent.START_RADIO, str, (InteractionAction) null);
        this.a.startActivity(kmf.a(this.a, (String) fay.a(str)).a(str2).a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, fug fug) {
        a(ContextMenuEvent.START_RADIO, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startService(RadioFormatListService.a((Context) activity, str));
    }

    public final void a() {
        a((int) R.id.menu_item_show_lyrics, (int) R.string.lyrics_context_menu_show_lyrics, SpotifyIconV2.LYRICS).a((fui) new fui() {
            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fug fug) {
        a(ContextMenuEvent.SHOW_LYRICS, (String) null, (InteractionAction) null);
    }

    public final void c(String str, String str2, String str3) {
        a((int) R.id.menu_item_add_to_home_screen, (int) R.string.options_menu_add_to_home_screen, SpotifyIconV2.DEVICE_MOBILE).a((fui) new fui(str, str2, str3) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, fug fug) {
        a(ContextMenuEvent.INSTALL_SHORTCUT, str, (InteractionAction) null);
        ShortcutInstallerService.a(this.a, str, str2, str3, this.w);
    }

    public final void a(int i2, String str) {
        a((int) R.id.menu_item_report_abuse, (CharSequence) this.a.getResources().getString(R.string.context_menu_report_abuse), a(SpotifyIconV2.REPORT_ABUSE), i2).a((fui) new fui(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.c(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, fug fug) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.a.startActivity(intent);
    }

    public final void d(String str) {
        Drawable drawable;
        uap uap = new uap(this.p, this.a);
        LinkType linkType = jst.a(str).b;
        StringBuilder sb = new StringBuilder(15);
        sb.append(uap.a.getString(R.string.context_menu_sleep_timer));
        if (uap.b.d()) {
            sb.append(" - ");
            if (uap.b.a() >= 0) {
                int ceil = (int) Math.ceil((double) (((float) uap.b.a()) / 60000.0f));
                if (ceil < 60) {
                    sb.append(String.format(uap.a.getString(R.string.context_menu_sleep_timer_mins_left), new Object[]{Integer.valueOf(ceil)}));
                } else {
                    int i2 = ceil / 60;
                    sb.append(String.format(uap.a.getString(R.string.context_menu_sleep_timer_hours_left), new Object[]{Integer.valueOf(i2)}));
                }
            } else if (linkType == LinkType.SHOW_EPISODE) {
                sb.append(uap.a.getString(R.string.context_menu_sleep_timer_end_of_episode));
            } else {
                sb.append(uap.a.getString(R.string.context_menu_sleep_timer_end_of_track));
            }
        }
        String sb2 = sb.toString();
        if (uap.b.d()) {
            drawable = fzf.a(uap.a, SpotifyIconV2.SLEEPTIMER, fr.c(uap.a, R.color.green_light));
        } else {
            drawable = fzf.a(uap.a, SpotifyIconV2.SLEEPTIMER);
        }
        this.b.a((int) R.id.menu_item_sleep_timer, (CharSequence) sb2, drawable).a((fui) new fui(str, linkType) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ LinkType f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, LinkType linkType, fug fug) {
        a(ContextMenuEvent.OPEN_SLEEP_TIMER_MENU, str, (InteractionAction) null);
        jly.a(this.a, new jmf(str, linkType) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ LinkType f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final jms onCreateContextMenu(Object obj) {
                return ContextMenuHelper.this.a(this.f$1, this.f$2, obj);
            }
        }, null, null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(String str, LinkType linkType, Object obj) {
        uab uab = this.p;
        uar uar = new uar(uab, uah.a, this.d, str, new uai(this.i, gbd.a()));
        return jms.a(new uaq(new uas(this.a, uar, uab, linkType)).a);
    }

    public final void e(String str) {
        a((int) R.id.menu_item_show_credits, (int) R.string.context_menu_show_credits, a(SpotifyIconV2.FOLLOW)).a((fui) new fui(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.b(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, fug fug) {
        a(ContextMenuEvent.SHOW_CREDITS, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(TrackCreditsActivity.a(activity, this.y, str));
    }

    public final void a(String str, sih sih) {
        a((int) R.id.menu_item_report, (int) R.string.context_menu_report, a(SpotifyIconV2.FLAG)).a((fui) new fui(sih, str) {
            private final /* synthetic */ sih f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sih sih, String str, fug fug) {
        this.u.a(sih, str);
    }

    public final void a(AlbumCollectionState albumCollectionState, String str, String str2) {
        LinkType linkType = jst.a(str).b;
        if (!(LinkType.SHOW_SHOW == linkType || LinkType.SHOW_EPISODE == linkType)) {
            Assertion.a(String.format("Unsupported link type %s", new Object[]{linkType}));
        }
        kxj kxj = new kxj(this.a, this.w, this.y);
        int i2 = AnonymousClass1.b[albumCollectionState.ordinal()];
        if (i2 == 1) {
            a((int) R.id.context_menu_add_to_collection, (int) R.string.context_menu_follow_in_collection, a(SpotifyIconV2.PLUS, (int) R.color.cat_grayscale_55)).a((fui) new fui(str, kxj, str2) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ kxi f$2;
                private final /* synthetic */ String f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onMenuItemClick(fug fug) {
                    ContextMenuHelper.this.c(this.f$1, this.f$2, this.f$3, fug);
                }
            });
        } else if (i2 != 2) {
            Assertion.a(String.format("Unsupported state type %s", new Object[]{albumCollectionState}));
        } else {
            a((int) R.id.context_menu_remove_from_collection, (int) R.string.context_menu_unfollow_in_collection, a(SpotifyIconV2.X, (int) R.color.green)).a((fui) new fui(str, kxj) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ kxi f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onMenuItemClick(fug fug) {
                    ContextMenuHelper.this.b(this.f$1, this.f$2, fug);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, kxi kxi, String str2, fug fug) {
        a(ContextMenuEvent.ADD_TO_COLLECTION, str, upj.a(str, true));
        kxi.a(str, str2, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, kxi kxi, fug fug) {
        a(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, upj.a(str, false));
        kxi.a(str, true);
    }

    public final void a(boolean z2, boolean z3, boolean z4, String str, String str2) {
        a(z2 ? AlbumCollectionState.YES : AlbumCollectionState.NO, true, str, str2, ItemType.TRACK_OR_ALBUM_OR_EPISODE);
    }

    public final void a(AlbumCollectionState albumCollectionState, boolean z2, String str, String str2, ItemType itemType) {
        LinkType linkType = jst.a(str).b;
        boolean z3 = false;
        String str3 = "Uri is of type ";
        if (linkType == LinkType.TRACK || linkType == LinkType.SHOW_EPISODE || linkType == LinkType.ALBUM || linkType == LinkType.COLLECTION_ALBUM) {
            StringBuilder sb = new StringBuilder(str3);
            sb.append(linkType);
            sb.append(" but itemType is not track, album or episode.");
            String sb2 = sb.toString();
            if (itemType == ItemType.TRACK_OR_ALBUM_OR_EPISODE) {
                z3 = true;
            }
            Assertion.a(sb2, z3);
        } else if (linkType == LinkType.SHOW_SHOW) {
            StringBuilder sb3 = new StringBuilder(str3);
            sb3.append(linkType);
            sb3.append(" but itemType is not video or audio podcast.");
            String sb4 = sb3.toString();
            if (itemType == ItemType.VIDEO_PODCAST || itemType == ItemType.AUDIO_PODCAST) {
                z3 = true;
            }
            Assertion.a(sb4, z3);
        } else {
            StringBuilder sb5 = new StringBuilder("Unsupported link type ");
            sb5.append(linkType);
            Assertion.a(sb5.toString());
        }
        if (linkType == LinkType.TRACK || linkType == LinkType.SHOW_SHOW || linkType == LinkType.SHOW_EPISODE) {
            Assertion.b((Object) AlbumCollectionState.PARTIALLY, (Object) albumCollectionState);
        }
        boolean a2 = this.m.a(this.y);
        kxj kxj = new kxj(this.a, this.w, this.y);
        int i2 = AnonymousClass1.b[albumCollectionState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                if (albumCollectionState == AlbumCollectionState.PARTIALLY) {
                    int i3 = R.string.context_menu_collection_complete_album;
                    Drawable a3 = a(SpotifyIconV2.PLUS);
                    if (a2) {
                        a3 = a(SpotifyIconV2.HEART, (int) R.color.cat_grayscale_55);
                        i3 = R.string.free_tier_context_menu_like;
                    }
                    a((int) R.id.context_menu_add_full_album_to_collection, i3, a3).a((fui) new fui(str, kxj, str2) {
                        private final /* synthetic */ String f$1;
                        private final /* synthetic */ kxi f$2;
                        private final /* synthetic */ String f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void onMenuItemClick(fug fug) {
                            ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fug);
                        }
                    });
                }
                if (z2) {
                    a((int) R.id.context_menu_remove_from_collection, (int) R.string.free_tier_context_menu_unlike, a(SpotifyIconV2.HEART_ACTIVE, (int) R.color.green)).a((fui) new fui(str, kxj) {
                        private final /* synthetic */ String f$1;
                        private final /* synthetic */ kxi f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void onMenuItemClick(fug fug) {
                            ContextMenuHelper.this.a(this.f$1, this.f$2, fug);
                        }
                    });
                }
            }
            return;
        }
        a((int) R.id.context_menu_add_to_collection, (int) R.string.free_tier_context_menu_like, a(SpotifyIconV2.HEART, (int) R.color.cat_grayscale_55)).a((fui) new fui(str, kxj, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ kxi f$2;
            private final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, this.f$3, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, kxi kxi, String str2, fug fug) {
        a(ContextMenuEvent.ADD_TO_COLLECTION, str, upj.a(str, true));
        kxi.a(str, str2, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, kxi kxi, String str2, fug fug) {
        a(ContextMenuEvent.COMPLETE_ALBUM_IN_COLLECTION, str, upj.a(str, true));
        kxi.a(str, str2, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, kxi kxi, fug fug) {
        a(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, upj.a(str, false));
        kxi.a(str, true);
    }

    public final void a(String str, Map<String, a> map) {
        Drawable drawable;
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList(0);
            ArrayList arrayList2 = new ArrayList(0);
            for (Entry entry : map.entrySet()) {
                if (((a) entry.getValue()).a()) {
                    arrayList.add(entry.getKey());
                } else {
                    arrayList2.add(entry.getKey());
                }
            }
            boolean isEmpty = arrayList2.isEmpty();
            kxj kxj = new kxj(this.a, this.w, this.y);
            if (isEmpty) {
                drawable = a(SpotifyIconV2.HEART_ACTIVE, (int) R.color.green);
            } else {
                drawable = a(SpotifyIconV2.HEART, (int) R.color.cat_grayscale_55);
            }
            fug a2 = a((int) R.id.context_menu_add_all_album_tracks_to_collection, isEmpty ? R.string.context_menu_remove_all_album_tracks_from_collection : R.string.context_menu_add_all_album_tracks_to_collection, drawable);
            $$Lambda$ContextMenuHelper$W32Dmn8nMfn3W9r6bmZzGULivo r1 = new fui(isEmpty, str, kxj, arrayList, arrayList2) {
                private final /* synthetic */ boolean f$1;
                private final /* synthetic */ String f$2;
                private final /* synthetic */ kxi f$3;
                private final /* synthetic */ List f$4;
                private final /* synthetic */ List f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void onMenuItemClick(fug fug) {
                    ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, fug);
                }
            };
            a2.a((fui) r1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, kxi kxi, List list, List list2, fug fug) {
        if (z2) {
            a(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, upj.a(str, true));
            kxi.a((String[]) list.toArray(new String[0]), true);
            return;
        }
        a(ContextMenuEvent.ADD_TO_COLLECTION, str, upj.a(str, true));
        kxi.a((String[]) list2.toArray(new String[0]), str, true);
    }

    public final void a(boolean z2, String str, String str2, boolean z3) {
        int i2;
        Drawable drawable;
        kxd kxd = new kxd(this.a, this.w, this.y);
        if (!this.j.a(this.y) || z3) {
            i2 = z2 ? R.string.context_menu_unban : R.string.context_menu_ban;
            if (z2) {
                drawable = a(SpotifyIconV2.BAN, (int) R.color.red);
            } else {
                drawable = a(SpotifyIconV2.BAN, (int) R.color.cat_grayscale_55);
            }
        } else {
            i2 = z2 ? R.string.context_menu_unhide_song : R.string.context_menu_hide_song;
            if (z2) {
                drawable = a(SpotifyIconV2.BLOCK, (int) R.color.red);
            } else {
                drawable = a(SpotifyIconV2.BLOCK, (int) R.color.cat_grayscale_55);
            }
        }
        fug a2 = a((int) R.id.options_menu_ban_or_unban, i2, drawable);
        $$Lambda$ContextMenuHelper$wMAqV17jkm8DXnedL7EORyDAmM r0 = new fui(z2, kxd, str, str2) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ kxc f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        a2.a((fui) r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, kxc kxc, String str, String str2, fug fug) {
        if (z2) {
            kxc.b(str, str2, false);
        } else {
            kxc.a(str, str2, true);
        }
        a(z2 ? ContextMenuEvent.UNBAN : ContextMenuEvent.BAN, str, (InteractionAction) null);
    }

    public final void a(String str, String str2, boolean z2) {
        a((int) R.id.options_menu_mark_explicit, (int) R.string.context_menu_mark_explicit, a(SpotifyIconV2.FLAG, (int) R.color.cat_grayscale_55)).a((fui) new fui(z2, str, str2) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, String str2, fug fug) {
        ContextMenuEvent contextMenuEvent;
        if (z2) {
            contextMenuEvent = ContextMenuEvent.MARK_AS_NOT_EXPLICIT;
        } else {
            contextMenuEvent = ContextMenuEvent.MARK_AS_EXPLICIT;
        }
        a(contextMenuEvent, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startService(ReportTrackExplicitService.a(activity, str, str2, z2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(FollowManager.a aVar, boolean z2, boolean z3, fug fug) {
        ContextMenuEvent contextMenuEvent;
        this.o.a(aVar);
        this.o.b(aVar.a, z2);
        if (z2) {
            contextMenuEvent = ContextMenuEvent.BAN;
        } else {
            contextMenuEvent = ContextMenuEvent.UNBAN;
        }
        a(contextMenuEvent, aVar.a, (InteractionAction) null);
        if (z2) {
            a((int) R.string.toast_banned_artist, (int) R.string.player_toastie_undo, (OnClickListener) new OnClickListener(z3, aVar) {
                private final /* synthetic */ boolean f$1;
                private final /* synthetic */ FollowManager.a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    ContextMenuHelper.this.a(this.f$1, this.f$2, view);
                }
            });
        } else {
            a((int) R.string.toast_ok_got_it, (int) R.string.player_toastie_undo, (OnClickListener) new OnClickListener(aVar) {
                private final /* synthetic */ FollowManager.a f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    ContextMenuHelper.this.a(this.f$1, view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, FollowManager.a aVar, View view) {
        if (z2) {
            this.o.a(aVar.a, true);
        } else {
            this.o.b(aVar.a, false);
        }
        this.h.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FollowManager.a aVar, View view) {
        this.o.b(aVar.a, true);
        this.h.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FollowManager.a aVar, boolean z2, boolean z3, fug fug) {
        ContextMenuEvent contextMenuEvent;
        FollowManager followManager = this.o;
        followManager.a(aVar);
        followManager.a(aVar.a, z2);
        if (z2) {
            contextMenuEvent = ContextMenuEvent.FOLLOW;
        } else {
            contextMenuEvent = ContextMenuEvent.UNFOLLOW;
        }
        a(contextMenuEvent, aVar.a, (InteractionAction) null);
        if (z2) {
            a((int) R.string.toast_liked_artist, (int) R.string.player_toastie_undo, (OnClickListener) new OnClickListener(z3, followManager, aVar) {
                private final /* synthetic */ boolean f$1;
                private final /* synthetic */ FollowManager f$2;
                private final /* synthetic */ FollowManager.a f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, view);
                }
            });
        } else {
            a((int) R.string.toast_ok_got_it, (int) R.string.player_toastie_undo, (OnClickListener) new OnClickListener(followManager, aVar) {
                private final /* synthetic */ FollowManager f$1;
                private final /* synthetic */ FollowManager.a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    ContextMenuHelper.this.a(this.f$1, this.f$2, view);
                }
            });
        }
    }

    public final void b(String str, boolean z2) {
        a((int) R.id.context_menu_toggle_collaborative, z2 ? R.string.context_menu_uncollaborative : R.string.context_menu_collaborative, SpotifyIconV2.COLLABORATIVE_PLAYLIST).a((fui) new fui(z2, str) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(boolean z2, String str, fug fug) {
        a(z2 ? ContextMenuEvent.UNSET_COLLABORATIVE : ContextMenuEvent.SET_COLLABORATIVE, str, (InteractionAction) null);
        boolean z3 = !z2;
        PlaylistService.b(this.a, str, z3);
        this.d.a(z3 ? R.string.toast_now_collaborative : R.string.toast_now_uncollaborative, 0, new Object[0]);
    }

    public final void c(String str, boolean z2) {
        a((int) R.id.context_menu_toggle_published, z2 ? R.string.context_menu_unpublish : R.string.context_menu_publish, z2 ? SpotifyIconV2.LOCKED : SpotifyIconV2.PUBLIC).a((fui) new fui(z2, str) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, fug fug) {
        boolean z3 = !z2;
        a(z2 ? ContextMenuEvent.UNSET_PUBLISHED : ContextMenuEvent.SET_PUBLISHED, str, (InteractionAction) null);
        PlaylistService.c(this.a, str, z3);
        this.d.a(z3 ? R.string.toast_published : R.string.toast_unpublished, 0, new Object[0]);
    }

    public final void f(String str) {
        fay.a(str);
        a((int) R.id.menu_item_hide_from_recently_played, (int) R.string.context_menu_hide_from_recently_played, SpotifyIconV2.BLOCK).a((fui) new fui(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fug fug) {
        a(ContextMenuEvent.HIDE_FROM_RECENTLY_PLAYED, str, (InteractionAction) null);
        RecentlyPlayedService.a(this.a, str);
    }

    public final void a(String str, boolean z2, jmx jmx) {
        int i2;
        fay.a(str);
        kxt kxt = new kxt(new kxv(this.a));
        Drawable a2 = fzf.a(this.a, SpotifyIconV2.CHECK);
        if (z2) {
            a2 = fzf.a(this.a, SpotifyIconV2.CHECK, fr.c(this.a, R.color.cat_accessory_green));
            i2 = R.string.context_menu_mark_as_unplayed;
        } else {
            i2 = R.string.context_menu_mark_as_played;
        }
        fug a3 = a((int) R.id.menu_item_mark_as_played, i2, a2);
        $$Lambda$ContextMenuHelper$cb7jpq6QslG14RRGditrokaN2ik r0 = new fui(z2, str, kxt, jmx) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ kxs f$3;
            private final /* synthetic */ jmx f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fug);
            }
        };
        a3.a((fui) r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, kxs kxs, jmx jmx, fug fug) {
        boolean z3 = !z2;
        a(z2 ? ContextMenuEvent.MARK_AS_UNPLAYED : ContextMenuEvent.MARK_AS_PLAYED, str, (InteractionAction) null);
        if (z3) {
            kxs.a(str);
        } else {
            kxs.b(str);
        }
        jmx.onMarkAsPlayed(z3);
    }

    public final void b(String str, String str2, boolean z2) {
        a((int) R.id.context_menu_browse_show, z2 ? R.string.context_menu_browse_show_video : R.string.context_menu_browse_show, SpotifyIconV2.PODCASTS).a((fui) new fui(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, fug fug) {
        a(ContextMenuEvent.BROWSE_SHOW, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(kmf.a(activity, str).a(str2).a);
    }

    public final void e(String str, String str2) {
        a((int) R.id.context_menu_browse_show, (int) R.string.context_menu_browse_episode, SpotifyIconV2.PODCASTS).a((fui) new fui(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, fug fug) {
        a(ContextMenuEvent.BROWSE_EPISODE, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(kmf.a(activity, str).a(str2).a);
    }

    public final void a(List<jyi> list, jyi jyi) {
        Activity activity = this.a;
        if (activity instanceof ka) {
            ka kaVar = (ka) activity;
            List<jyi> list2 = this.e.a.a;
            jyi a2 = jyi.a((Iterable<jyi>) list2);
            StringBuilder sb = new StringBuilder(kaVar.getText(R.string.video_subtitle_menu_header));
            if (!list2.isEmpty() && (!TextUtils.isEmpty(a2.b))) {
                sb.append(" • ");
                sb.append(jxo.a(kaVar, a2));
            }
            a((int) R.id.context_menu_video_subtitles, (CharSequence) sb.toString(), a(SpotifyIconV2.GEARS), 0).a((fui) new fui(kaVar) {
                private final /* synthetic */ ka f$1;

                {
                    this.f$1 = r2;
                }

                public final void onMenuItemClick(fug fug) {
                    ContextMenuHelper.this.a(this.f$1, fug);
                }
            }).a(!list.isEmpty());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ka kaVar, fug fug) {
        vun.a((ObservableSource<T>) this.f.a().a(AndroidSchedulers.a()), BackpressureStrategy.BUFFER).a((wun<? super T>) new wun(kaVar) {
            private final /* synthetic */ ka f$1;

            {
                this.f$1 = r2;
            }

            public final void call(Object obj) {
                ContextMenuHelper.this.a(this.f$1, (jyi) obj);
            }
        }, (wun<Throwable>) $$Lambda$ContextMenuHelper$MNBoASomlr0EfLjnvJ0hRp7x_TA.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ka kaVar, jyi jyi) {
        jxo jxo = this.e;
        Activity activity = this.a;
        List<jyi> list = jxo.a.a;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.a(activity.getString(R.string.video_subtitle_menu_header));
        jyi a2 = jyi.a((Iterable<jyi>) list);
        int i2 = 1;
        for (jyi jyi2 : list) {
            if (jxo.a(jyi2.b()) != -1) {
                boolean equals = jyi2.equals(a2);
                StringBuilder sb = new StringBuilder();
                sb.append(equals ? "✓ " : "");
                sb.append(jxo.a(activity, jyi2));
                fug a3 = contextMenuViewModel.a(i2, sb.toString()).a((fui) new fui(activity, jyi2, null) {
                    private /* synthetic */ Context a;
                    private /* synthetic */ jyi b;
                    private /* synthetic */ jyn c;

                    {
                        this.a = r2;
                        this.b = r3;
                        this.c = r4;
                    }

                    public final void onMenuItemClick(fug fug) {
                        jxo.this.c.a(ContextPlayerConfiguration.fromSubtitle(this.b)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$jxo$Eb674mhsJsgAuMN0cK8rGXyJ_yU<Object>(jxo.this, this.a, this.b), (Consumer<? super Throwable>) $$Lambda$jxo$2eoU83kkf6gadysRJG36f_FucnU.INSTANCE);
                    }
                });
                i2++;
                if (jyi2.equals(a2)) {
                    a3.b(true);
                }
            }
        }
        jly.a(jms.a(contextMenuViewModel), kaVar, null);
    }

    public final void b() {
        this.b.a((int) R.id.context_menu_go_to_queue, this.a.getText(R.string.context_menu_go_to_queue), ImmutableList.a(a(SpotifyIconV2.QUEUE, (int) R.color.white))).f = new a() {
            public final void onTopBarItemClicked(fuh fuh) {
                ContextMenuHelper.this.a(fuh);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fuh fuh) {
        a(ContextMenuEvent.BROWSE_QUEUE, ViewUris.Z.toString(), (InteractionAction) null);
        this.s.b();
    }

    private fug a(int i2, CharSequence charSequence, Drawable drawable, int i3) {
        return this.b.a(i2, charSequence, drawable, i3);
    }

    private fug a(int i2, int i3, SpotifyIconV2 spotifyIconV2) {
        return this.b.a(i2, this.a.getText(i3), a(spotifyIconV2));
    }

    private Drawable a(SpotifyIconV2 spotifyIconV2) {
        return fzf.a(this.a, spotifyIconV2);
    }

    private Drawable a(SpotifyIconV2 spotifyIconV2, int i2) {
        Activity activity = this.a;
        return fzf.a(activity, spotifyIconV2, fr.c(activity, i2));
    }

    private fug a(int i2, int i3, Drawable drawable) {
        if (drawable == null) {
            return this.b.a(i2, this.a.getText(i3));
        }
        return this.b.a(i2, this.a.getText(i3), drawable);
    }

    private void a(int i2, int i3, OnClickListener onClickListener) {
        uos a2 = uos.a(this.a.getString(i2), 3000).c(R.color.cat_white).b(R.color.cat_black).a(this.a.getString(R.string.player_toastie_undo)).a(onClickListener).a();
        if (this.h.b()) {
            this.h.a(a2);
        } else {
            this.h.a = a2;
        }
    }

    public final void a(FollowManager.a aVar, boolean z2) {
        Drawable drawable;
        boolean z3 = aVar.e;
        boolean z4 = aVar.d;
        boolean z5 = !z3;
        if (!this.j.a(this.y) || z2) {
            if (z3) {
                drawable = a(SpotifyIconV2.BAN, (int) R.color.red);
            } else {
                drawable = a(SpotifyIconV2.BAN, (int) R.color.cat_grayscale_55);
            }
        } else if (z3) {
            drawable = a(SpotifyIconV2.BLOCK, (int) R.color.red);
        } else {
            drawable = a(SpotifyIconV2.BLOCK, (int) R.color.cat_grayscale_55);
        }
        a((int) R.id.options_menu_ban_or_unban, z3 ? R.string.context_menu_unban_artist : R.string.context_menu_ban_artist, drawable).a((fui) new fui(aVar, z5, z4) {
            private final /* synthetic */ FollowManager.a f$1;
            private final /* synthetic */ boolean f$2;
            private final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, this.f$3, fug);
            }
        });
    }

    public final void a(FollowManager.a aVar) {
        Drawable drawable;
        int i2;
        boolean z2 = aVar.e;
        boolean z3 = aVar.d;
        boolean z4 = !z3;
        boolean b2 = jsl.b(this.y);
        if (z3) {
            i2 = b2 ? R.string.context_menu_unfollow_in_collection : R.string.free_tier_context_menu_unfollow;
            if (b2) {
                drawable = a(SpotifyIconV2.X);
            } else {
                drawable = a(SpotifyIconV2.FOLLOW, (int) R.color.green);
            }
        } else {
            i2 = R.string.context_menu_follow_in_collection;
            drawable = a(SpotifyIconV2.FOLLOW);
        }
        a((int) R.id.options_menu_like_or_unlike, i2, drawable).a((fui) new fui(aVar, z4, z2) {
            private final /* synthetic */ FollowManager.a f$1;
            private final /* synthetic */ boolean f$2;
            private final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fug fug) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fug);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FollowManager followManager, FollowManager.a aVar, View view) {
        followManager.a(aVar.a, true);
        this.h.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, FollowManager followManager, FollowManager.a aVar, View view) {
        if (z2) {
            followManager.b(aVar.a, true);
        } else {
            followManager.a(aVar.a, false);
        }
        this.h.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ShareEventLogger shareEventLogger, ixe ixe, long j2, fug fug) {
        String str2 = "";
        Assertion.a((Object) str2);
        Assertion.a((Object) str);
        Intent intent = new Intent("android.intent.action.VIEW");
        StringBuilder sb = new StringBuilder("sms:");
        sb.append(str2);
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("sms_body", str);
        Activity activity = this.a;
        activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share_chooser_sms)));
        shareEventLogger.d(ixe.b, j2);
        a(ContextMenuEvent.SHARE);
    }
}
