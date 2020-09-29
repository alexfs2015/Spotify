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
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
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
import com.spotify.music.follow.FollowManager.a;
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
    private final ize c;
    private final jvf d;
    private final jzo e;
    private final kaj f;
    private final jqa g;
    private final ToastieManager h;
    private final jlr i;
    private final lap j;
    private final rqb k;
    private final uix l;
    private final vbn m;
    private final hfx n;
    private final FollowManager o;
    private final umw p;
    private final FireAndForgetResolver q;
    private final gcb r;
    private final tmu s;
    private final Flowable<PlayerState> t;
    private final sej u;
    private final uqm v;
    private final sso w;
    private final jqg x;
    private final fqn y;
    private final jbr z;

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

    public ContextMenuHelper(ize ize, jvf jvf, jzo jzo, kaj kaj, jqa jqa, ToastieManager toastieManager, jlr jlr, lap lap, rqb rqb, uix uix, vbn vbn, hfx hfx, FollowManager followManager, Scheduler scheduler, umw umw, FireAndForgetResolver fireAndForgetResolver, gcb gcb, tmu tmu, Flowable<PlayerState> flowable, sej sej, Activity activity, jbr jbr, uqm uqm, sso sso, ContextMenuViewModel contextMenuViewModel, jqg jqg, fqn fqn) {
        this.c = ize;
        this.d = jvf;
        this.e = jzo;
        this.f = kaj;
        this.g = jqa;
        this.h = toastieManager;
        this.i = jlr;
        this.j = lap;
        this.k = rqb;
        this.l = uix;
        this.m = vbn;
        this.n = hfx;
        this.o = followManager;
        this.A = scheduler;
        this.p = umw;
        this.q = fireAndForgetResolver;
        this.r = gcb;
        this.s = tmu;
        this.t = flowable;
        this.u = sej;
        this.a = activity;
        this.v = uqm;
        this.w = sso;
        this.b = contextMenuViewModel;
        this.x = jqg;
        this.y = fqn;
        this.z = jbr;
    }

    private static Bitmap a(Drawable drawable, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static Drawable a(Context context, Drawable drawable, int i2) {
        fbp.a(context);
        fbp.a(drawable);
        return new BitmapDrawable(context.getResources(), a(drawable, context.getResources().getDimensionPixelSize(R.dimen.context_menu_icon_size)));
    }

    private Drawable a(SpotifyIconV2 spotifyIconV2) {
        return fzz.a(this.a, spotifyIconV2);
    }

    private Drawable a(SpotifyIconV2 spotifyIconV2, int i2) {
        Activity activity = this.a;
        return fzz.a(activity, spotifyIconV2, fr.c(activity, i2));
    }

    private fva a(int i2, int i3, Drawable drawable) {
        return drawable == null ? this.b.a(i2, this.a.getText(i3)) : this.b.a(i2, this.a.getText(i3), drawable);
    }

    private fva a(int i2, int i3, SpotifyIconV2 spotifyIconV2) {
        return this.b.a(i2, this.a.getText(i3), a(spotifyIconV2));
    }

    private fva a(int i2, CharSequence charSequence, Drawable drawable, int i3) {
        return this.b.a(i2, charSequence, drawable, i3);
    }

    private fvc a(String str, ContextMenuEvent contextMenuEvent, boolean z2, fvc fvc) {
        ContextMenuEvent contextMenuEvent2 = contextMenuEvent;
        String str2 = str;
        boolean z3 = z2;
        fvc fvc2 = fvc;
        $$Lambda$ContextMenuHelper$_zrfktImmyYJmipoJbv8pJ7tcmE r0 = new fvc(contextMenuEvent, str, z2, fvc) {
            private final /* synthetic */ ContextMenuEvent f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ boolean f$3;
            private final /* synthetic */ fvc f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fva);
            }
        };
        return r0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(ShareEventLogger shareEventLogger, izp izp, Void voidR) {
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        izz izz = new izz(this.a, this.x, shareEventLogger, izp, this.i, this.z);
        jab jab = r9;
        jab jab2 = new jab(izz.a, new jaa(izz.a, izz.b, izz.c, izz.d), izz.e, izz.d, izz.f);
        return jpe.a((jpk<Void>) jab2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(String str, LinkType linkType, Object obj) {
        umw umw = this.p;
        umw umw2 = umw;
        unm unm = new unm(umw, unc.a, this.d, str, new und(this.i, jtp.a));
        return jpe.a(new unl(new unn(this.a, unm, umw, linkType)).a);
    }

    private void a(int i2, int i3, OnClickListener onClickListener) {
        uzy a2 = uzy.a(this.a.getString(i2), 3000).c(R.color.cat_white).b(R.color.cat_black).a(this.a.getString(R.string.player_toastie_undo)).a(onClickListener).a();
        if (this.h.b()) {
            this.h.a(a2);
        } else {
            this.h.a = a2;
        }
    }

    private void a(long j2, AppShareDestination appShareDestination, izp izp, ShareEventLogger shareEventLogger, izd izd) {
        izd izd2 = izd;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        izp izp2 = izp;
        $$Lambda$ContextMenuHelper$W_1AjDeGABsCSJZ26tl6Z2S3KwM r0 = new fvc(izd, shareEventLogger, izp, appShareDestination, j2) {
            private final /* synthetic */ izd f$1;
            private final /* synthetic */ ShareEventLogger f$2;
            private final /* synthetic */ izp f$3;
            private final /* synthetic */ AppShareDestination f$4;
            private final /* synthetic */ long f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, fva);
            }
        };
        a(appShareDestination.mId, appShareDestination.mNameStringResId, appShareDestination.a((Context) this.a)).a((fvc) r0);
        a(izp.a.e().h(), appShareDestination.mLogId, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, fva fva) {
        a(ContextMenuEvent.ADD_TO_QUEUE, playerTrack.uri(), (InteractionAction) null);
        QueueService.a(this.a, Collections.singletonList(playerTrack), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppShareDestination appShareDestination, izp izp, a aVar, String str, ShareEventLogger shareEventLogger, long j2, fva fva) {
        AppShareDestination appShareDestination2 = appShareDestination;
        AppShareDestination appShareDestination3 = appShareDestination;
        izp izp2 = izp;
        izp izp3 = izp;
        a(ContextMenuEvent.SHARE);
        if (appShareDestination3.mIsDeeplink) {
            izq izq = new izq(this.q, this.d);
            Activity activity = this.a;
            String a2 = izp3.a.a();
            String b2 = izp3.a.b();
            String a3 = izp.a();
            Handler handler = new Handler(Looper.getMainLooper());
            int i2 = appShareDestination3.mId;
            AnonymousClass2 r1 = r1;
            AnonymousClass2 r12 = new ResolverCallbackReceiver(handler, appShareDestination, a3, activity) {
                private /* synthetic */ AppShareDestination a;
                private /* synthetic */ String b;
                private /* synthetic */ Activity c;

                {
                    this.a = r3;
                    this.b = r4;
                    this.c = r5;
                }

                public final void onError(Throwable th) {
                    izq.this.c.a((int) R.string.toast_shared_to_external_app_error, 1, this.c.getString(this.a.mNameStringResId));
                }

                public final void onResolved(Response response) {
                    if (response.getStatus() == 200) {
                        izq izq = izq.this;
                        int i = this.a.mId;
                        Optional b2 = izq.a.indexOfKey(i) >= 0 ? Optional.b(Uri.parse(((a) izq.a.get(i)).a(response))) : Optional.e();
                        if (b2.b()) {
                            Builder buildUpon = ((Uri) b2.c()).buildUpon();
                            buildUpon.appendQueryParameter("sc_attachment", this.b);
                            buildUpon.appendQueryParameter("utm_medium", "snapchat");
                            buildUpon.appendQueryParameter("utm_source", "spotify-share-filter");
                            AppShareDestination appShareDestination = this.a;
                            Activity activity = this.c;
                            fbp.a(activity);
                            defpackage.iyz.a aVar = (defpackage.iyz.a) fbp.a(new iyz(activity.getPackageManager()).b(appShareDestination.mPackageNameSpace));
                            Activity activity2 = this.c;
                            buildUpon.build();
                            try {
                                this.c.startActivityForResult(AppShareDestination.a((Context) activity2, aVar), 9999);
                                return;
                            } catch (ActivityNotFoundException unused) {
                                izq.this.c.a((int) R.string.toast_generic_share_broadcast_error, 1, this.c.getString(this.a.mNameStringResId));
                                return;
                            }
                        }
                    }
                    izq.this.c.a((int) R.string.toast_shared_to_external_app_error, 1, this.c.getString(this.a.mNameStringResId));
                }
            };
            if (izq.a.indexOfKey(i2) >= 0) {
                izq.b.resolve(((a) izq.a.get(i2)).a(a2, b2), r12);
            } else {
                r12.sendOnError(new IllegalArgumentException(String.format("Can not fetch deeplink for specified app id: %s", new Object[]{Integer.valueOf(i2)})));
            }
        } else {
            Intent intent = new Intent(aVar.b());
            intent.setAction("android.intent.action.SEND");
            String str2 = "irs.oeEda.rTnatTdxtnit.nX";
            String str3 = str;
            intent.putExtra("android.intent.extra.TEXT", str);
            String str4 = "lttm/einpx";
            intent.setType(HttpConnection.kDefaultContentType);
            try {
                this.a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                String string = this.a.getString(appShareDestination3.mNameStringResId);
                this.d.a((int) R.string.toast_generic_share_broadcast_error, 1, string);
                String str5 = "od aosfntseC urov cthiioy rA tratlt";
                StringBuilder sb = new StringBuilder("Could not start share Activity for ");
                sb.append(string);
                Assertion.b(sb.toString());
            }
        }
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        shareEventLogger.a(izp3.b, appShareDestination3.mLogId, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ShareEventLogger shareEventLogger, izp izp, long j2, Intent intent, fva fva) {
        a(ContextMenuEvent.SHARE);
        shareEventLogger.c(izp.b, j2);
        this.a.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ShareEventLogger shareEventLogger, izp izp, long j2, fva fva) {
        izp izp2 = izp;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        jok.a(this.a, new jor(shareEventLogger, izp2) {
            private final /* synthetic */ ShareEventLogger f$1;
            private final /* synthetic */ izp f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final jpe onCreateContextMenu(Object obj) {
                return ContextMenuHelper.this.a(this.f$1, this.f$2, (Void) obj);
            }
        }, null, null);
        shareEventLogger2.a(izp2.b, Destination.FACEBOOK_POPUP, j2, Interaction.HIT, UserIntent.OPEN_MENU, Result.NO_RESULT, false, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ShareEventLogger shareEventLogger, izp izp, long j2, sso sso, fva fva) {
        a(ContextMenuEvent.SHARE);
        shareEventLogger.a(izp.b, j2);
        Activity activity = this.a;
        String str = shareEventLogger.b;
        String sso2 = sso.toString();
        Intent intent = new Intent();
        String str2 = "itennbNSotnaEc.arDd.idino.";
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", izp.a());
        String str3 = "n/ltepbxta";
        intent.setType(HttpConnection.kDefaultContentType);
        if (VERSION.SDK_INT >= 22) {
            Class<ShareResultReceiver> cls = ShareResultReceiver.class;
            Intent intent2 = new Intent(activity, ShareResultReceiver.class);
            String str4 = "ns_eositdi";
            intent2.putExtra("session_id", str);
            String str5 = "n_rteitypu";
            intent2.putExtra("entity_uri", izp.a.a());
            String str6 = "irntce_xott";
            intent2.putExtra("context_uri", izp.a.b());
            String str7 = "pes__eugsurrica";
            intent2.putExtra("source_page_uri", sso2);
            String str8 = "nnimsdexi_aotneid";
            intent2.putExtra("destination_index", j2);
            intent2.putStringArrayListExtra("test_groups", new ArrayList());
            activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share_chooser_using), PendingIntent.getBroadcast(activity, 0, intent2, 134217728).getIntentSender()));
            return;
        }
        activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share_chooser_using)));
    }

    private void a(ContextMenuEvent contextMenuEvent) {
        this.x.a(contextMenuEvent);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [hdp] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent r28, java.lang.String r29, com.spotify.music.ubi.interactions.InteractionAction r30) {
        /*
            r27 = this;
            r0 = r27
            r0 = r27
            r1 = r30
            r27.a(r28)
            if (r1 == 0) goto L_0x003a
            hdr$bh r14 = new hdr$bh
            r2 = 0
            uqm r3 = r0.v
            java.lang.String r3 = r3.toString()
            sso r4 = r0.w
            java.lang.String r4 = r4.toString()
            r6 = -1
            java.lang.String r10 = r28.toString()
            jtz r5 = defpackage.jtp.a
            long r8 = r5.a()
            double r11 = (double) r8
            java.lang.String r13 = r1.mLogString
            java.lang.String r5 = "nmtoo-uecnet"
            java.lang.String r5 = "context-menu"
            java.lang.String r9 = "iht"
            java.lang.String r9 = "hit"
            r1 = r14
            r8 = r29
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r13)
            goto L_0x006e
        L_0x003a:
            hdr$bg r1 = new hdr$bg
            r16 = 0
            uqm r2 = r0.v
            java.lang.String r17 = r2.toString()
            sso r2 = r0.w
            java.lang.String r18 = r2.toString()
            r20 = -1
            r20 = -1
            java.lang.String r24 = r28.toString()
            jtz r2 = defpackage.jtp.a
            long r2 = r2.a()
            double r2 = (double) r2
            java.lang.String r19 = "ttuxnb-neecm"
            java.lang.String r19 = "context-menu"
            java.lang.String r23 = "tih"
            java.lang.String r23 = "hit"
            r15 = r1
            r15 = r1
            r22 = r29
            r22 = r29
            r25 = r2
            r15.<init>(r16, r17, r18, r19, r20, r22, r23, r24, r25)
            r14 = r1
            r14 = r1
        L_0x006e:
            jlr r1 = r0.i
            r1.a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.a(com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent, java.lang.String, com.spotify.music.ubi.interactions.InteractionAction):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ContextMenuEvent contextMenuEvent, String str, boolean z2, fvc fvc, fva fva) {
        a(contextMenuEvent, str, (InteractionAction) null);
        OffliningLogger.a(this.w, str, SourceElement.CONTEXT_MENU, z2);
        fvc.onMenuItemClick(fva);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, View view) {
        this.o.b(aVar.a, true);
        this.h.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, boolean z2, boolean z3, fva fva) {
        FollowManager followManager = this.o;
        followManager.a(aVar);
        followManager.a(aVar.a, z2);
        a(z2 ? ContextMenuEvent.FOLLOW : ContextMenuEvent.UNFOLLOW, aVar.a, (InteractionAction) null);
        if (z2) {
            a((int) R.string.toast_liked_artist, (int) R.string.player_toastie_undo, (OnClickListener) new OnClickListener(z3, followManager, aVar) {
                private final /* synthetic */ boolean f$1;
                private final /* synthetic */ FollowManager f$2;
                private final /* synthetic */ a f$3;

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
                private final /* synthetic */ a f$2;

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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FollowManager followManager, a aVar, View view) {
        followManager.a(aVar.a, true);
        this.h.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fva fva) {
        a(ContextMenuEvent.SHOW_LYRICS, (String) null, (InteractionAction) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fvb fvb) {
        a(ContextMenuEvent.BROWSE_QUEUE, ViewUris.Y.toString(), (InteractionAction) null);
        this.s.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(izd izd, ShareEventLogger shareEventLogger, izp izp, AppShareDestination appShareDestination, long j2, fva fva) {
        izd.onShareMenuItemClick(fva);
        shareEventLogger.a(izp.b, appShareDestination.mLogId, j2);
        a(ContextMenuEvent.SHARE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(izp izp, ShareEventLogger shareEventLogger, AppShareDestination appShareDestination, long j2, fva fva) {
        a(ContextMenuEvent.SHARE);
        Activity activity = this.a;
        activity.startActivity(MessengerShareActivity.a(activity, izp));
        shareEventLogger.a(izp.b, appShareDestination.mLogId, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(izp izp, fva fva) {
        Activity activity = this.a;
        activity.startActivity(SnapchatStoryShareLoaderActivity.a(activity, (String) fbp.a(izp.a.e().h()), izp.a()));
    }

    private void a(String str, int i2, String str2, String str3) {
        a((int) R.id.context_menu_add_to_playlist, i2, SpotifyIconV2.ADD_TO_PLAYLIST).a((fvc) new fvc(str, str2, str3) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, this.f$3, fva);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ShareEventLogger shareEventLogger, izp izp, long j2, fva fva) {
        String str2 = "";
        String str3 = "";
        Assertion.a((Object) str3);
        Assertion.a((Object) str);
        String str4 = "nreoVtbtInEcod.atinindi..a";
        Intent intent = new Intent("android.intent.action.VIEW");
        String str5 = "ssm:";
        StringBuilder sb = new StringBuilder("sms:");
        sb.append(str3);
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("sms_body", str);
        Activity activity = this.a;
        activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share_chooser_sms)));
        shareEventLogger.d(izp.b, j2);
        a(ContextMenuEvent.SHARE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, LinkType linkType, fva fva) {
        a(ContextMenuEvent.OPEN_SLEEP_TIMER_MENU, str, (InteractionAction) null);
        jok.a(this.a, new jor(str, linkType) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ LinkType f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final jpe onCreateContextMenu(Object obj) {
                return ContextMenuHelper.this.a(this.f$1, this.f$2, obj);
            }
        }, null, null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fva fva) {
        a(ContextMenuEvent.HIDE_FROM_RECENTLY_PLAYED, str, (InteractionAction) null);
        RecentlyPlayedService.a(this.a, str);
    }

    private void a(String str, fvc fvc) {
        a((int) R.id.context_menu_download, (int) R.string.context_menu_undownload, a(SpotifyIconV2.DOWNLOAD, (int) R.color.cat_light_green)).a(a(str, ContextMenuEvent.UNDOWNLOAD, false, fvc));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, fva fva) {
        if (LinkType.SHOW_EPISODE != jva.a(str).b) {
            this.d.a((int) R.string.toast_undownload, 0, new Object[0]);
        }
        fvc.onMenuItemClick(fva);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, a aVar) {
        a(str, fvc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, b bVar) {
        a(str, fvc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, c cVar) {
        b(str, fvc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, d dVar) {
        b(str, fvc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, e eVar) {
        b(str, fvc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, f fVar) {
        b(str, fvc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, g gVar) {
        b(str, fvc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fvc fvc, h hVar) {
        a(str, fvc);
    }

    private void a(String str, String str2, int i2) {
        a((int) R.id.context_menu_browse_album, i2, SpotifyIconV2.ALBUM).a((fvc) new fvc(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.f(this.f$1, this.f$2, fva);
            }
        });
    }

    private void a(String str, String str2, long j2) {
        jlr jlr = this.i;
        String str3 = "";
        String str4 = "";
        String str5 = str;
        String str6 = str2;
        String str7 = str2;
        long j3 = j2;
        be beVar = new be("", uqo.aQ.toString(), str5, str7, j3, "", ImpressionType.ITEM.toString(), RenderType.LIST.toString(), (double) jtp.a.a());
        jlr.a(beVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, fva fva) {
        a(ContextMenuEvent.BROWSE_EPISODE, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(kpo.a(activity, str).a(str2).a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, fva fva) {
        a(ContextMenuEvent.INSTALL_SHORTCUT, str, (InteractionAction) null);
        ShortcutInstallerService.a(this.a, str, str2, str3, this.w);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, boolean z2, int i2, fva fva) {
        a(ContextMenuEvent.REMOVE, str, (InteractionAction) null);
        PlaylistService.a((Context) this.a, str, str2);
        if (z2) {
            uzy a2 = uzy.a(this.a.getString(i2), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
            if (this.h.b()) {
                this.h.a(a2);
            } else {
                this.h.a = a2;
            }
        } else {
            this.d.a(i2, 1, new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, lar lar, fva fva) {
        a(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, vao.a(str, false));
        lar.a(str, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, lar lar, String str2, fva fva) {
        a(ContextMenuEvent.COMPLETE_ALBUM_IN_COLLECTION, str, vao.a(str, true));
        lar.a(str, str2, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kf kfVar, fva fva) {
        wit.a((ObservableSource<T>) this.f.a().a(AndroidSchedulers.a()), BackpressureStrategy.BUFFER).a((xis<? super T>) new xis(kfVar) {
            private final /* synthetic */ kf f$1;

            {
                this.f$1 = r2;
            }

            public final void call(Object obj) {
                ContextMenuHelper.this.a(this.f$1, (kai) obj);
            }
        }, (xis<Throwable>) $$Lambda$ContextMenuHelper$Ss4Ptxh9UnzJdx8bshNfZL8q4hk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kf kfVar, izp izp, ShareEventLogger shareEventLogger, long j2, fva fva) {
        a(ContextMenuEvent.SHARE);
        ((ClipboardManager) kfVar.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(kfVar.getString(R.string.share_contextmenu_copy_link_label), izp.a()));
        this.d.a((int) R.string.toast_copy_link, 1, new Object[0]);
        shareEventLogger.b(izp.b, j2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kf kfVar, String str, Uri uri, String str2, String str3, String str4, fva fva) {
        izi izi = r0;
        kf kfVar2 = kfVar;
        izi izi2 = new izi(kfVar, this.w, this.y, this.i, this.t, this.A, this.c);
        String str5 = str;
        Uri uri2 = uri;
        izi2.a(str, uri, str2, str3, str4, (String) null, this.x);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kf kfVar, kai kai) {
        String str;
        jzo jzo = this.e;
        Activity activity = this.a;
        List<kai> list = jzo.a.a;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.a(activity.getString(R.string.video_subtitle_menu_header));
        kai a2 = kai.a((Iterable<kai>) list);
        int i2 = 1;
        for (kai kai2 : list) {
            if (jzo.a(kai2.b()) != -1) {
                boolean equals = kai2.equals(a2);
                StringBuilder sb = new StringBuilder();
                if (equals) {
                    String str2 = "t7 u32/";
                    str = "✓ ";
                } else {
                    String str3 = "";
                    str = "";
                }
                sb.append(str);
                sb.append(jzo.a(activity, kai2));
                fva a3 = contextMenuViewModel.a(i2, sb.toString()).a((fvc) new fvc(activity, kai2, null) {
                    private /* synthetic */ Context a;
                    private /* synthetic */ kai b;
                    private /* synthetic */ kan c;

                    {
                        this.a = r2;
                        this.b = r3;
                        this.c = r4;
                    }

                    public final void onMenuItemClick(fva fva) {
                        jzo.this.c.a(ContextPlayerConfiguration.fromSubtitle(this.b)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$jzo$kXg4TQl84t90CNYX6e1bCeyqt8<Object>(jzo.this, this.a, this.b), (Consumer<? super Throwable>) $$Lambda$jzo$0jiPzQzMMP2MHQjFqCaFBhlmjA.INSTANCE);
                    }
                });
                i2++;
                if (kai2.equals(a2)) {
                    a3.b(true);
                }
            }
        }
        jok.a(jpe.a(contextMenuViewModel), kfVar, null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sso sso, String str, fva fva) {
        this.u.a(sso, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, a aVar, View view) {
        if (z2) {
            this.o.a(aVar.a, true);
        } else {
            this.o.b(aVar.a, false);
        }
        this.h.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, FollowManager followManager, a aVar, View view) {
        if (z2) {
            followManager.b(aVar.a, true);
        } else {
            followManager.a(aVar.a, false);
        }
        this.h.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, fva fva) {
        boolean z3 = !z2;
        a(z2 ? ContextMenuEvent.UNSET_PUBLISHED : ContextMenuEvent.SET_PUBLISHED, str, (InteractionAction) null);
        PlaylistService.c(this.a, str, z3);
        this.d.a(z3 ? R.string.toast_published : R.string.toast_unpublished, 0, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, String str2, fva fva) {
        a(z2 ? ContextMenuEvent.MARK_AS_NOT_EXPLICIT : ContextMenuEvent.MARK_AS_EXPLICIT, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startService(ReportTrackExplicitService.a(activity, str, str2, z2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, lar lar, List list, List list2, fva fva) {
        if (z2) {
            a(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, vao.a(str, true));
            lar.a((String[]) list.toArray(new String[0]), true);
            return;
        }
        a(ContextMenuEvent.ADD_TO_COLLECTION, str, vao.a(str, true));
        lar.a((String[]) list2.toArray(new String[0]), str, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, lbb lbb, jpj jpj, fva fva) {
        boolean z3 = !z2;
        a(z2 ? ContextMenuEvent.MARK_AS_UNPLAYED : ContextMenuEvent.MARK_AS_PLAYED, str, (InteractionAction) null);
        if (z3) {
            lbb.a(str);
        } else {
            lbb.b(str);
        }
        jpj.onMarkAsPlayed(z3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, String str, boolean z3, fva fva) {
        a(z2 ? ContextMenuEvent.REMOVE : ContextMenuEvent.SUBSCRIBE, str, z2 ? InteractionAction.UNLIKE : InteractionAction.LIKE);
        if (!z2) {
            PlaylistService.a((Context) this.a, (String) fbp.a(str));
        } else {
            PlaylistService.b(this.a, (String) fbp.a(str));
        }
        rll rll = new rll(this.a, this.h, this.d);
        if (z3) {
            if (!z2) {
                rll.a(R.string.toast_liked_show_your_library);
            }
        } else if (!z2) {
            rll.a();
        } else {
            rll.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, lal lal, String str, String str2, fva fva) {
        if (z2) {
            lal.b(str, str2, false);
        } else {
            lal.a(str, str2, true);
        }
        a(z2 ? ContextMenuEvent.UNBAN : ContextMenuEvent.BAN, str, (InteractionAction) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(a aVar, boolean z2, boolean z3, fva fva) {
        this.o.a(aVar);
        this.o.b(aVar.a, z2);
        a(z2 ? ContextMenuEvent.BAN : ContextMenuEvent.UNBAN, aVar.a, (InteractionAction) null);
        if (z2) {
            a((int) R.string.toast_banned_artist, (int) R.string.player_toastie_undo, (OnClickListener) new OnClickListener(z3, aVar) {
                private final /* synthetic */ boolean f$1;
                private final /* synthetic */ a f$2;

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
                private final /* synthetic */ a f$1;

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
    public /* synthetic */ void b(izp izp, ShareEventLogger shareEventLogger, AppShareDestination appShareDestination, long j2, fva fva) {
        Activity activity = this.a;
        activity.startActivity(FacebookStoryShareLoaderActivity.a(activity, (String) fbp.a(izp.a.e().h()), izp.a()));
        shareEventLogger.a(izp.b, appShareDestination.mLogId, j2);
        a(ContextMenuEvent.SHARE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(izp izp, fva fva) {
        Activity activity = this.a;
        activity.startActivity(InstagramStoryShareLoaderActivity.a(activity, (String) fbp.a(izp.a.e().h()), izp.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, fva fva) {
        a(ContextMenuEvent.SHOW_CREDITS, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(TrackCreditsActivity.a(activity, this.y, str));
    }

    private void b(String str, fvc fvc) {
        a((int) R.id.context_menu_download, (int) R.string.context_menu_download, a(SpotifyIconV2.DOWNLOAD, (int) R.color.cat_grayscale_55)).a(a(str, ContextMenuEvent.DOWNLOAD, true, fvc));
    }

    private void b(String str, String str2, int i2) {
        a((int) R.id.context_menu_browse_artist, (int) R.string.context_menu_browse_artist, SpotifyIconV2.ARTIST).a((fvc) new fvc(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.e(this.f$1, this.f$2, fva);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, fva fva) {
        a(ContextMenuEvent.BROWSE_SHOW, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(kpo.a(activity, str).a(str2).a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, String str3, fva fva) {
        a(ContextMenuEvent.ADD_TO_PLAYLIST, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(AddToPlaylistActivity.a(activity, Collections.singletonList(str), str2, str3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, lar lar, fva fva) {
        a(ContextMenuEvent.REMOVE_FROM_COLLECTION, str, vao.a(str, false));
        lar.a(str, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, lar lar, String str2, fva fva) {
        a(ContextMenuEvent.ADD_TO_COLLECTION, str, vao.a(str, true));
        lar.a(str, str2, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(boolean z2, String str, fva fva) {
        a(z2 ? ContextMenuEvent.UNSET_COLLABORATIVE : ContextMenuEvent.SET_COLLABORATIVE, str, (InteractionAction) null);
        boolean z3 = !z2;
        PlaylistService.b(this.a, str, z3);
        this.d.a(z3 ? R.string.toast_now_collaborative : R.string.toast_now_uncollaborative, 0, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(izp izp, fva fva) {
        Activity activity = this.a;
        activity.startActivity(FacebookStoryShareLoaderActivity.a(activity, (String) fbp.a(izp.a.e().h()), izp.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, fva fva) {
        String str2 = "daoVrWanpditeIct..otEn.inn";
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.a.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, String str2, fva fva) {
        a(ContextMenuEvent.START_RADIO, str, (InteractionAction) null);
        this.a.startActivity(kpo.a(this.a, (String) fbp.a(str)).a(str2).a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, lar lar, String str2, fva fva) {
        a(ContextMenuEvent.ADD_TO_COLLECTION, str, vao.a(str, true));
        lar.a(str, str2, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(izp izp, fva fva) {
        Activity activity = this.a;
        activity.startActivity(FacebookFeedShareActivity.a(activity, izp));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, fva fva) {
        a(ContextMenuEvent.START_RADIO, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startService(RadioFormatListService.a((Context) activity, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2, fva fva) {
        a(ContextMenuEvent.REMOVE, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(ConfirmDeletionActivity.a(activity, str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(String str, fva fva) {
        a(ContextMenuEvent.BROWSE_QUEUE, str, (InteractionAction) null);
        this.s.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(String str, String str2, fva fva) {
        a(ContextMenuEvent.BROWSE_ARTIST, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(kpo.a(activity, str).a(str2).a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(String str, fva fva) {
        a(ContextMenuEvent.ADD_TO_QUEUE, str, (InteractionAction) null);
        QueueService.a(this.a, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(String str, String str2, fva fva) {
        a(ContextMenuEvent.BROWSE_ALBUM, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(kpo.a(activity, str).a(str2).a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(String str, fva fva) {
        a(ContextMenuEvent.EDIT, str, (InteractionAction) null);
        Activity activity = this.a;
        activity.startActivity(EditPlaylistActivity.a((Context) activity, str));
    }

    public final void a() {
        a((int) R.id.menu_item_show_lyrics, (int) R.string.lyrics_context_menu_show_lyrics, SpotifyIconV2.LYRICS).a((fvc) new fvc() {
            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(fva);
            }
        });
    }

    public final void a(int i2, String str) {
        a((int) R.id.menu_item_report_abuse, (CharSequence) this.a.getResources().getString(R.string.context_menu_report_abuse), a(SpotifyIconV2.REPORT_ABUSE), i2).a((fvc) new fvc(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.c(this.f$1, fva);
            }
        });
    }

    public final void a(long j2, AppShareDestination appShareDestination, a aVar, izp izp, ShareEventLogger shareEventLogger) {
        fva a2 = a(appShareDestination.mId, appShareDestination.mNameStringResId, a((Context) this.a, aVar.a(), (int) R.dimen.context_menu_icon_size));
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        AppShareDestination appShareDestination2 = appShareDestination;
        $$Lambda$ContextMenuHelper$5tFEj2vnjEo7L3Q5gHeJqOwVtko r0 = new fvc(izp, shareEventLogger, appShareDestination, j2) {
            private final /* synthetic */ izp f$1;
            private final /* synthetic */ ShareEventLogger f$2;
            private final /* synthetic */ AppShareDestination f$3;
            private final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fva fva) {
                fva fva2 = fva;
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fva);
            }
        };
        a2.a((fvc) r0);
        a(izp.a.e().h(), appShareDestination.mLogId, j2);
    }

    public final void a(long j2, AppShareDestination appShareDestination, a aVar, izp izp, String str, ShareEventLogger shareEventLogger) {
        AppShareDestination appShareDestination2 = appShareDestination;
        AppShareDestination appShareDestination3 = appShareDestination;
        $$Lambda$ContextMenuHelper$omV5Wl3GIWX0ga17DgwH_qTgGj8 r0 = r0;
        AppShareDestination appShareDestination4 = appShareDestination;
        izp izp2 = izp;
        $$Lambda$ContextMenuHelper$omV5Wl3GIWX0ga17DgwH_qTgGj8 r02 = new fvc(appShareDestination, izp, aVar, str, shareEventLogger, j2) {
            private final /* synthetic */ AppShareDestination f$1;
            private final /* synthetic */ izp f$2;
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

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, fva);
            }
        };
        a(appShareDestination3.mId, appShareDestination3.mNameStringResId, appShareDestination3.mIconResIdSmall != -1 ? appShareDestination.a((Context) this.a) : a((Context) this.a, aVar.a(), (int) R.dimen.context_menu_icon_size)).a((fvc) r02);
        izp izp3 = izp;
        long j3 = j2;
        a(izp.a.e().h(), appShareDestination3.mLogId, j2);
    }

    public final void a(long j2, AppShareDestination appShareDestination, izp izp, ShareEventLogger shareEventLogger) {
        $$Lambda$ContextMenuHelper$DFyA7_lsZLlKTEC4sfyTnAd_wKE r0 = r0;
        $$Lambda$ContextMenuHelper$DFyA7_lsZLlKTEC4sfyTnAd_wKE r02 = new fvc(izp, shareEventLogger, appShareDestination, j2) {
            private final /* synthetic */ izp f$1;
            private final /* synthetic */ ShareEventLogger f$2;
            private final /* synthetic */ AppShareDestination f$3;
            private final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fva fva) {
                fva fva2 = fva;
                ContextMenuHelper.this.b(this.f$1, this.f$2, this.f$3, this.f$4, fva);
            }
        };
        a(appShareDestination.mId, appShareDestination.mNameStringResId, appShareDestination.a((Context) this.a)).a((fvc) r02);
        a(izp.a.e().h(), appShareDestination.mLogId, j2);
    }

    public final void a(long j2, izp izp, ShareEventLogger shareEventLogger) {
        Activity activity = this.a;
        Activity activity2 = activity;
        izp izp2 = izp;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        $$Lambda$ContextMenuHelper$UnvHU2oUHgqHS__6UebkPbJDYes r1 = new fvc((kf) activity, izp, shareEventLogger, j2) {
            private final /* synthetic */ kf f$1;
            private final /* synthetic */ izp f$2;
            private final /* synthetic */ ShareEventLogger f$3;
            private final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fva);
            }
        };
        a((int) R.id.context_menu_share_copy_link, (int) R.string.share_contextmenu_copy_link, SpotifyIconV2.COPY).a((fvc) r1);
    }

    public final void a(long j2, izp izp, String str, ShareEventLogger shareEventLogger) {
        long j3 = j2;
        izp izp2 = izp;
        String str2 = "";
        String str3 = "";
        if (VERSION.SDK_INT >= 19) {
            Activity activity = this.a;
            Assertion.a((Object) activity);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(activity);
            if (defaultSmsPackage != null) {
                Assertion.a((Object) defaultSmsPackage);
                Assertion.a((Object) str);
                Intent intent = new Intent("android.intent.action.SEND");
                String str4 = "l/xtntpait";
                intent.setType(HttpConnection.kDefaultContentType);
                String str5 = str;
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setPackage(defaultSmsPackage);
                ShareEventLogger shareEventLogger2 = shareEventLogger;
                izp izp3 = izp;
                $$Lambda$ContextMenuHelper$9FIsO9rmwI9fjZ7h1Z0atQleKU r0 = new fvc(shareEventLogger, izp, j2, intent) {
                    private final /* synthetic */ ShareEventLogger f$1;
                    private final /* synthetic */ izp f$2;
                    private final /* synthetic */ long f$3;
                    private final /* synthetic */ Intent f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r6;
                    }

                    public final void onMenuItemClick(fva fva) {
                        fva fva2 = fva;
                        ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fva);
                    }
                };
                a((int) R.id.context_menu_share_sms, (int) R.string.context_menu_sms, SpotifyIconV2.SMS).a((fvc) r0);
                if (izp2.a.e() != null) {
                    str3 = izp2.a.e().h();
                }
                a(str3, AppShareDestination.GENERIC_SMS.mLogId, j3);
                return;
            }
        }
        String str6 = str;
        ShareEventLogger shareEventLogger3 = shareEventLogger;
        izp izp4 = izp;
        $$Lambda$ContextMenuHelper$_ycNI9ueFnh2nNB67IOYOJjtT8w r02 = new fvc(str, shareEventLogger, izp, j2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ ShareEventLogger f$2;
            private final /* synthetic */ izp f$3;
            private final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fva fva) {
                fva fva2 = fva;
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fva);
            }
        };
        a((int) R.id.context_menu_share_sms, (int) R.string.context_menu_sms, SpotifyIconV2.SMS).a((fvc) r02);
        if (izp2.a.e() != null) {
            str3 = izp2.a.e().h();
        }
        a(str3, AppShareDestination.GENERIC_SMS.mLogId, j3);
    }

    public final void a(long j2, izp izp, sso sso, ShareEventLogger shareEventLogger) {
        $$Lambda$ContextMenuHelper$3o7WJpYgn7dzz1IJXrj4lCgvR5I r0 = r0;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        izp izp2 = izp;
        sso sso2 = sso;
        $$Lambda$ContextMenuHelper$3o7WJpYgn7dzz1IJXrj4lCgvR5I r02 = new fvc(shareEventLogger, izp, j2, sso) {
            private final /* synthetic */ ShareEventLogger f$1;
            private final /* synthetic */ izp f$2;
            private final /* synthetic */ long f$3;
            private final /* synthetic */ sso f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
            }

            public final void onMenuItemClick(fva fva) {
                fva fva2 = fva;
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fva);
            }
        };
        a((int) R.id.context_menu_share_more, (int) R.string.share_contextmenu_more, SpotifyIconV2.MORE).a((fvc) r02);
    }

    public final void a(PlayerTrack playerTrack) {
        a((int) R.id.context_menu_queue_track_or_album, (int) R.string.context_menu_add_to_queue, SpotifyIconV2.ADD_TO_QUEUE).a((fvc) new fvc(playerTrack) {
            private final /* synthetic */ PlayerTrack f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, fva);
            }
        });
    }

    public final void a(AlbumCollectionState albumCollectionState, String str, String str2) {
        LinkType linkType = jva.a(str).b;
        if (!(LinkType.SHOW_SHOW == linkType || LinkType.SHOW_EPISODE == linkType)) {
            Object[] objArr = {linkType};
            String str3 = "posnussl rdpkt%tUe enpi ";
            Assertion.a(String.format("Unsupported link type %s", objArr));
        }
        las las = new las(this.a, this.w, this.y);
        int i2 = AnonymousClass1.b[albumCollectionState.ordinal()];
        if (i2 == 1) {
            a((int) R.id.context_menu_add_to_collection, (int) R.string.context_menu_follow_in_collection, a(SpotifyIconV2.PLUS, (int) R.color.cat_grayscale_55)).a((fvc) new fvc(str, las, str2) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ lar f$2;
                private final /* synthetic */ String f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onMenuItemClick(fva fva) {
                    ContextMenuHelper.this.c(this.f$1, this.f$2, this.f$3, fva);
                }
            });
        } else if (i2 != 2) {
            Object[] objArr2 = {albumCollectionState};
            String str4 = "unsm%t ts opraepydstptee ";
            Assertion.a(String.format("Unsupported state type %s", objArr2));
        } else {
            a((int) R.id.context_menu_remove_from_collection, (int) R.string.context_menu_unfollow_in_collection, a(SpotifyIconV2.X, (int) R.color.green)).a((fvc) new fvc(str, las) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ lar f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onMenuItemClick(fva fva) {
                    ContextMenuHelper.this.b(this.f$1, this.f$2, fva);
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r7, boolean r8, java.lang.String r9, java.lang.String r10, com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.ItemType r11) {
        /*
            r6 = this;
            r5 = 1
            jva r0 = defpackage.jva.a(r9)
            r5 = 3
            com.spotify.mobile.android.util.LinkType r0 = r0.b
            r5 = 0
            com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TRACK
            r5 = 6
            r2 = 0
            r5 = 1
            java.lang.String r3 = "Uri is of type "
            r4 = 1
            if (r0 == r1) goto L_0x006e
            r5 = 3
            com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            r5 = 0
            if (r0 == r1) goto L_0x006e
            r5 = 1
            com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ALBUM
            r5 = 3
            if (r0 == r1) goto L_0x006e
            com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.COLLECTION_ALBUM
            r5 = 4
            if (r0 != r1) goto L_0x0026
            r5 = 3
            goto L_0x006e
        L_0x0026:
            r5 = 2
            com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SHOW_SHOW
            r5 = 1
            if (r0 != r1) goto L_0x0054
            r5 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r5 = 6
            r1.<init>(r3)
            r5 = 5
            r1.append(r0)
            r5 = 2
            java.lang.String r3 = "ibeio. sd aottups to odmt oi T onvareuc yedi"
            java.lang.String r3 = " but itemType is not video or audio podcast."
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r5 = 4
            com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper$ItemType r3 = com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.ItemType.VIDEO_PODCAST
            if (r11 == r3) goto L_0x004d
            com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper$ItemType r3 = com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.ItemType.AUDIO_PODCAST
            r5 = 6
            if (r11 != r3) goto L_0x004f
        L_0x004d:
            r5 = 5
            r2 = 1
        L_0x004f:
            com.spotify.mobile.android.util.Assertion.a(r1, r2)
            r5 = 3
            goto L_0x008d
        L_0x0054:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r5 = 3
            java.lang.String r1 = "kie pbyloter p dntnuUs"
            java.lang.String r1 = "Unsupported link type "
            r5 = 4
            r11.<init>(r1)
            r5 = 5
            r11.append(r0)
            r5 = 6
            java.lang.String r11 = r11.toString()
            r5 = 6
            com.spotify.mobile.android.util.Assertion.a(r11)
            r5 = 5
            goto L_0x008d
        L_0x006e:
            r5 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r5 = 2
            r1.<init>(r3)
            r5 = 7
            r1.append(r0)
            r5 = 1
            java.lang.String r3 = " but itemType is not track, album or episode."
            r1.append(r3)
            r5 = 5
            java.lang.String r1 = r1.toString()
            com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper$ItemType r3 = com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.ItemType.TRACK_OR_ALBUM_OR_EPISODE
            if (r11 != r3) goto L_0x008a
            r5 = 4
            r2 = 1
        L_0x008a:
            com.spotify.mobile.android.util.Assertion.a(r1, r2)
        L_0x008d:
            r5 = 6
            com.spotify.mobile.android.util.LinkType r11 = com.spotify.mobile.android.util.LinkType.TRACK
            r5 = 7
            if (r0 == r11) goto L_0x009f
            r5 = 6
            com.spotify.mobile.android.util.LinkType r11 = com.spotify.mobile.android.util.LinkType.SHOW_SHOW
            r5 = 4
            if (r0 == r11) goto L_0x009f
            r5 = 4
            com.spotify.mobile.android.util.LinkType r11 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            r5 = 6
            if (r0 != r11) goto L_0x00a6
        L_0x009f:
            r5 = 7
            com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r11 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.PARTIALLY
            r5 = 1
            com.spotify.mobile.android.util.Assertion.b(r11, r7)
        L_0x00a6:
            fqn r11 = r6.y
            boolean r11 = defpackage.vbn.a(r11)
            r5 = 7
            las r0 = new las
            android.app.Activity r1 = r6.a
            sso r2 = r6.w
            r5 = 1
            fqn r3 = r6.y
            r5 = 6
            r0.<init>(r1, r2, r3)
            r5 = 5
            int[] r1 = com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.AnonymousClass1.b
            r5 = 4
            int r2 = r7.ordinal()
            r1 = r1[r2]
            r5 = 4
            r2 = 2131952655(0x7f13040f, float:1.9541759E38)
            r5 = 5
            r3 = 2131099863(0x7f0600d7, float:1.7812091E38)
            r5 = 0
            if (r1 == r4) goto L_0x0134
            r4 = 2
            r5 = r4
            if (r1 == r4) goto L_0x00da
            r5 = 5
            r4 = 3
            r5 = 2
            if (r1 == r4) goto L_0x00da
            r5 = 5
            goto L_0x0132
        L_0x00da:
            r5 = 3
            com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState r1 = com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState.PARTIALLY
            r5 = 6
            if (r7 != r1) goto L_0x010c
            r5 = 5
            r7 = 2131952190(0x7f13023e, float:1.9540816E38)
            r5 = 4
            com.spotify.android.paste.graphics.SpotifyIconV2 r1 = com.spotify.android.paste.graphics.SpotifyIconV2.PLUS
            r5 = 3
            android.graphics.drawable.Drawable r1 = r6.a(r1)
            r5 = 7
            if (r11 == 0) goto L_0x00fa
            com.spotify.android.paste.graphics.SpotifyIconV2 r7 = com.spotify.android.paste.graphics.SpotifyIconV2.HEART
            r5 = 0
            android.graphics.drawable.Drawable r1 = r6.a(r7, r3)
            r5 = 4
            r7 = 2131952655(0x7f13040f, float:1.9541759E38)
        L_0x00fa:
            r5 = 0
            r11 = 2131427807(0x7f0b01df, float:1.847724E38)
            fva r7 = r6.a(r11, r7, r1)
            r5 = 2
            com.spotify.mobile.android.ui.contextmenu.-$$Lambda$ContextMenuHelper$E6tMPLvuZRs-OJXgeQ5OGDOTXgk r11 = new com.spotify.mobile.android.ui.contextmenu.-$$Lambda$ContextMenuHelper$E6tMPLvuZRs-OJXgeQ5OGDOTXgk
            r5 = 5
            r11.<init>(r9, r0, r10)
            r7.a(r11)
        L_0x010c:
            r5 = 2
            if (r8 == 0) goto L_0x0132
            r5 = 6
            com.spotify.android.paste.graphics.SpotifyIconV2 r7 = com.spotify.android.paste.graphics.SpotifyIconV2.HEART_ACTIVE
            r5 = 2
            r8 = 2131100158(0x7f0601fe, float:1.781269E38)
            r5 = 1
            android.graphics.drawable.Drawable r7 = r6.a(r7, r8)
            r5 = 7
            r8 = 2131427832(0x7f0b01f8, float:1.8477291E38)
            r5 = 6
            r10 = 2131952657(0x7f130411, float:1.9541763E38)
            r5 = 4
            fva r7 = r6.a(r8, r10, r7)
            r5 = 3
            com.spotify.mobile.android.ui.contextmenu.-$$Lambda$ContextMenuHelper$DqaJi5qPUxwrEKyCUJ6f3dVzyP4 r8 = new com.spotify.mobile.android.ui.contextmenu.-$$Lambda$ContextMenuHelper$DqaJi5qPUxwrEKyCUJ6f3dVzyP4
            r8.<init>(r9, r0)
            r5 = 5
            r7.a(r8)
        L_0x0132:
            r5 = 5
            return
        L_0x0134:
            r5 = 6
            com.spotify.android.paste.graphics.SpotifyIconV2 r7 = com.spotify.android.paste.graphics.SpotifyIconV2.HEART
            android.graphics.drawable.Drawable r7 = r6.a(r7, r3)
            r5 = 6
            r8 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            r5 = 5
            fva r7 = r6.a(r8, r2, r7)
            com.spotify.mobile.android.ui.contextmenu.-$$Lambda$ContextMenuHelper$adC9OvYPYCJMbtq2jzppST1rAUU r8 = new com.spotify.mobile.android.ui.contextmenu.-$$Lambda$ContextMenuHelper$adC9OvYPYCJMbtq2jzppST1rAUU
            r5 = 6
            r8.<init>(r9, r0, r10)
            r5 = 2
            r7.a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.a(com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState, boolean, java.lang.String, java.lang.String, com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper$ItemType):void");
    }

    public final void a(a aVar) {
        Drawable drawable;
        int i2;
        boolean z2 = aVar.e;
        boolean z3 = aVar.d;
        boolean z4 = !z3;
        boolean b2 = jus.b(this.y);
        if (z3) {
            i2 = b2 ? R.string.context_menu_unfollow_in_collection : R.string.free_tier_context_menu_unfollow;
            drawable = b2 ? a(SpotifyIconV2.X) : a(SpotifyIconV2.FOLLOW, (int) R.color.green);
        } else {
            i2 = R.string.context_menu_follow_in_collection;
            drawable = a(SpotifyIconV2.FOLLOW);
        }
        a((int) R.id.options_menu_like_or_unlike, i2, drawable).a((fvc) new fvc(aVar, z4, z2) {
            private final /* synthetic */ a f$1;
            private final /* synthetic */ boolean f$2;
            private final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fva);
            }
        });
    }

    public final void a(a aVar, boolean z2) {
        boolean z3 = aVar.e;
        boolean z4 = aVar.d;
        boolean z5 = !z3;
        Drawable drawable = (!this.j.a(this.y) || z2) ? z3 ? a(SpotifyIconV2.BAN, (int) R.color.red) : a(SpotifyIconV2.BAN, (int) R.color.cat_grayscale_55) : z3 ? a(SpotifyIconV2.BLOCK, (int) R.color.red) : a(SpotifyIconV2.BLOCK, (int) R.color.cat_grayscale_55);
        a((int) R.id.options_menu_ban_or_unban, z3 ? R.string.context_menu_unban_artist : R.string.context_menu_ban_artist, drawable).a((fvc) new fvc(aVar, z5, z4) {
            private final /* synthetic */ a f$1;
            private final /* synthetic */ boolean f$2;
            private final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, this.f$3, fva);
            }
        });
    }

    public final void a(String str) {
        a((int) R.id.context_menu_edit_playlist, (int) R.string.context_menu_edit_playlist, SpotifyIconV2.EDIT).a((fvc) new fvc(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.g(this.f$1, fva);
            }
        });
    }

    public final void a(String str, String str2) {
        a(str, str2, (int) R.string.context_menu_browse_album);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10, java.lang.String r11, com.spotify.mobile.android.util.LinkType r12) {
        /*
            r9 = this;
            r8 = 7
            rqb r0 = r9.k
            fqn r1 = r9.y
            r8 = 2
            boolean r0 = r0.a(r1)
            r8 = 5
            r1 = 0
            r8 = 0
            if (r0 != 0) goto L_0x001e
            r8 = 5
            fqn r0 = r9.y
            r8 = 6
            boolean r0 = defpackage.uix.a(r0)
            r8 = 5
            if (r0 == 0) goto L_0x001c
            r8 = 0
            goto L_0x001e
        L_0x001c:
            r6 = 0
            goto L_0x0022
        L_0x001e:
            r8 = 3
            r0 = 1
            r8 = 3
            r6 = 1
        L_0x0022:
            r8 = 4
            int[] r0 = com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.AnonymousClass1.a
            int r2 = r12.ordinal()
            r8 = 7
            r0 = r0[r2]
            r8 = 6
            r2 = 5
            r8 = 2
            if (r0 == r2) goto L_0x0060
            r8 = 3
            r2 = 6
            r8 = 6
            if (r0 == r2) goto L_0x0056
            r8 = 1
            r2 = 7
            r8 = 4
            if (r0 == r2) goto L_0x0056
            r8 = 5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "tporeUbe  dknptisuy pn"
            java.lang.String r2 = "Unsupported link type "
            r0.<init>(r2)
            r8 = 1
            r0.append(r12)
            r8 = 6
            java.lang.String r12 = r0.toString()
            r8 = 2
            com.spotify.mobile.android.util.Assertion.a(r12)
            r8 = 4
            r7 = 0
            r8 = 4
            goto L_0x0068
        L_0x0056:
            r8 = 3
            r1 = 2131953929(0x7f130909, float:1.9544343E38)
            r8 = 2
            r7 = 2131953929(0x7f130909, float:1.9544343E38)
            r8 = 1
            goto L_0x0068
        L_0x0060:
            r8 = 6
            r1 = 2131953965(0x7f13092d, float:1.9544416E38)
            r8 = 0
            r7 = 2131953965(0x7f13092d, float:1.9544416E38)
        L_0x0068:
            lap r12 = r9.j
            r8 = 6
            fqn r0 = r9.y
            r8 = 3
            boolean r12 = r12.a(r0)
            r8 = 6
            if (r12 == 0) goto L_0x0080
            com.spotify.android.paste.graphics.SpotifyIconV2 r12 = com.spotify.android.paste.graphics.SpotifyIconV2.BLOCK
            r0 = 2131099863(0x7f0600d7, float:1.7812091E38)
            android.graphics.drawable.Drawable r12 = r9.a(r12, r0)
            r8 = 2
            goto L_0x0087
        L_0x0080:
            com.spotify.android.paste.graphics.SpotifyIconV2 r12 = com.spotify.android.paste.graphics.SpotifyIconV2.X
            r8 = 1
            android.graphics.drawable.Drawable r12 = r9.a(r12)
        L_0x0087:
            r8 = 3
            r0 = 2131427833(0x7f0b01f9, float:1.8477293E38)
            r1 = 2131952216(0x7f130258, float:1.9540868E38)
            r8 = 6
            fva r12 = r9.a(r0, r1, r12)
            r8 = 5
            com.spotify.mobile.android.ui.contextmenu.-$$Lambda$ContextMenuHelper$HjgaxIwMD3QcSD3z9nTYsDF5hyk r0 = new com.spotify.mobile.android.ui.contextmenu.-$$Lambda$ContextMenuHelper$HjgaxIwMD3QcSD3z9nTYsDF5hyk
            r2 = r0
            r2 = r0
            r3 = r9
            r4 = r10
            r4 = r10
            r5 = r11
            r8 = 7
            r2.<init>(r4, r5, r6, r7)
            r8 = 0
            r12.a(r0)
            r8 = 1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.a(java.lang.String, java.lang.String, com.spotify.mobile.android.util.LinkType):void");
    }

    public final void a(String str, String str2, String str3) {
        a(str, (int) R.string.context_menu_add_to_playlist, str2, str3);
    }

    public final void a(String str, String str2, String str3, String str4, Uri uri) {
        Activity activity = this.a;
        if (activity instanceof kf) {
            Activity activity2 = activity;
            kf kfVar = (kf) activity;
            fva a2 = a((int) R.id.context_menu_share, (int) R.string.context_menu_share, SpotifyIconV2.SHARE_ANDROID);
            Uri uri2 = uri;
            String str5 = str2;
            $$Lambda$ContextMenuHelper$rdAXAnwJoVu9MMf1QPH1gbhU8 r2 = new fvc(kfVar, str3, uri, str4, str, str2) {
                private final /* synthetic */ kf f$1;
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

                public final void onMenuItemClick(fva fva) {
                    fva fva2 = fva;
                    ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, fva);
                }
            };
            a2.a((fvc) r2);
        }
    }

    public final void a(String str, String str2, boolean z2) {
        a((int) R.id.options_menu_mark_explicit, (int) R.string.context_menu_mark_explicit, a(SpotifyIconV2.FLAG, (int) R.color.cat_grayscale_55)).a((fvc) new fvc(z2, str, str2) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fva);
            }
        });
    }

    public final void a(String str, Map<String, CollectionStateProvider.a> map) {
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList(0);
            ArrayList arrayList2 = new ArrayList(0);
            for (Entry entry : map.entrySet()) {
                if (((CollectionStateProvider.a) entry.getValue()).a()) {
                    arrayList.add(entry.getKey());
                } else {
                    arrayList2.add(entry.getKey());
                }
            }
            boolean isEmpty = arrayList2.isEmpty();
            las las = new las(this.a, this.w, this.y);
            fva a2 = a((int) R.id.context_menu_add_all_album_tracks_to_collection, isEmpty ? R.string.context_menu_remove_all_album_tracks_from_collection : R.string.context_menu_add_all_album_tracks_to_collection, isEmpty ? a(SpotifyIconV2.HEART_ACTIVE, (int) R.color.green) : a(SpotifyIconV2.HEART, (int) R.color.cat_grayscale_55));
            $$Lambda$ContextMenuHelper$ImAhWQ0b93LqflkStR6gZIf4 r1 = r1;
            String str2 = str;
            $$Lambda$ContextMenuHelper$ImAhWQ0b93LqflkStR6gZIf4 r12 = new fvc(isEmpty, str, las, arrayList, arrayList2) {
                private final /* synthetic */ boolean f$1;
                private final /* synthetic */ String f$2;
                private final /* synthetic */ lar f$3;
                private final /* synthetic */ List f$4;
                private final /* synthetic */ List f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void onMenuItemClick(fva fva) {
                    ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, fva);
                }
            };
            a2.a((fvc) r12);
        }
    }

    public final void a(String str, sso sso) {
        a((int) R.id.menu_item_report, (int) R.string.context_menu_report, a(SpotifyIconV2.FLAG)).a((fvc) new fvc(sso, str) {
            private final /* synthetic */ sso f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fva);
            }
        });
    }

    public final void a(String str, vli vli) {
        law law = new law(this.a);
        a(str, vli, (fvc) new fvc(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                lav.this.a(this.f$1);
            }
        }, (fvc) new fvc(str, new fvc(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                lav.this.b(this.f$1);
            }
        }) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fva);
            }
        });
    }

    public final void a(String str, vli vli, fvc fvc, fvc fvc2) {
        vli vli2 = vli;
        vli.a((ged<f>) new ged(str, fvc) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (f) obj);
            }
        }, (ged<h>) new ged(str, fvc2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (h) obj);
            }
        }, (ged<b>) new ged(str, fvc2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (b) obj);
            }
        }, (ged<a>) new ged(str, fvc2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (a) obj);
            }
        }, (ged<c>) new ged(str, fvc) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (c) obj);
            }
        }, (ged<e>) new ged(str, fvc) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (e) obj);
            }
        }, (ged<d>) new ged(str, fvc) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (d) obj);
            }
        }, (ged<g>) new ged(str, fvc) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ fvc f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, (g) obj);
            }
        });
    }

    public final void a(String str, boolean z2) {
        Drawable drawable;
        int i2;
        boolean a2 = hfx.a(this.y);
        if (a2) {
            i2 = z2 ? R.string.context_menu_unlike_playlist : R.string.context_menu_like_playlist;
            drawable = z2 ? a(SpotifyIconV2.HEART, (int) R.color.cat_grayscale_55) : a(SpotifyIconV2.HEART_ACTIVE, (int) R.color.green);
        } else {
            i2 = z2 ? R.string.context_menu_unsubscribe : R.string.context_menu_subscribe;
            drawable = a(z2 ? SpotifyIconV2.X : SpotifyIconV2.PLUS);
        }
        a((int) R.id.context_menu_subscribe, i2, drawable).a((fvc) new fvc(z2, str, a2) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fva);
            }
        });
    }

    public final void a(String str, boolean z2, jpj jpj) {
        int i2;
        fbp.a(str);
        lbc lbc = new lbc(new lbe(this.a));
        Drawable a2 = fzz.a(this.a, SpotifyIconV2.CHECK);
        if (z2) {
            a2 = fzz.a(this.a, SpotifyIconV2.CHECK, fr.c(this.a, R.color.cat_accessory_green));
            i2 = R.string.context_menu_mark_as_unplayed;
        } else {
            i2 = R.string.context_menu_mark_as_played;
        }
        fva a3 = a((int) R.id.menu_item_mark_as_played, i2, a2);
        $$Lambda$ContextMenuHelper$11SELSloDP13USdRMF6cm0sptk r0 = r0;
        String str2 = str;
        jpj jpj2 = jpj;
        $$Lambda$ContextMenuHelper$11SELSloDP13USdRMF6cm0sptk r02 = new fvc(z2, str, lbc, jpj) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ lbb f$3;
            private final /* synthetic */ jpj f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fva fva) {
                fva fva2 = fva;
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fva);
            }
        };
        a3.a((fvc) r02);
    }

    public final void a(String str, String... strArr) {
        fbp.a(true);
        if (!this.y.b(url.g) && this.k.a(this.y)) {
            return;
        }
        if (!ute.a(this.y, strArr[0])) {
            int a2 = ute.a(jva.a(strArr[0]));
            String b2 = ute.b(strArr[0]);
            fva a3 = a((int) R.id.menu_item_start_station, a2, SpotifyIconV2.RADIO);
            if (!this.y.b(url.d)) {
                if (!uix.a(this.y)) {
                    a3.a((fvc) new fvc(b2, str) {
                        private final /* synthetic */ String f$1;
                        private final /* synthetic */ String f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void onMenuItemClick(fva fva) {
                            ContextMenuHelper.this.c(this.f$1, this.f$2, fva);
                        }
                    });
                    return;
                }
            }
            a3.a((fvc) new fvc(strArr[0]) {
                private final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onMenuItemClick(fva fva) {
                    ContextMenuHelper.this.d(this.f$1, fva);
                }
            });
        }
    }

    public final void a(List<vku> list) {
        vku vku = (vku) fbp.a(list.get(0));
        b(vku.getUri(), vku.getName(), (int) R.string.context_menu_browse_artist);
    }

    public final void a(List<kai> list, kai kai) {
        Activity activity = this.a;
        if (activity instanceof kf) {
            kf kfVar = (kf) activity;
            List<kai> list2 = this.e.a.a;
            kai a2 = kai.a((Iterable<kai>) list2);
            StringBuilder sb = new StringBuilder(kfVar.getText(R.string.video_subtitle_menu_header));
            if (!list2.isEmpty() && (!TextUtils.isEmpty(a2.b))) {
                String str = "/ 22 0ut";
                sb.append(" • ");
                sb.append(jzo.a(kfVar, a2));
            }
            a((int) R.id.context_menu_video_subtitles, (CharSequence) sb.toString(), a(SpotifyIconV2.GEARS), 0).a((fvc) new fvc(kfVar) {
                private final /* synthetic */ kf f$1;

                {
                    this.f$1 = r2;
                }

                public final void onMenuItemClick(fva fva) {
                    ContextMenuHelper.this.a(this.f$1, fva);
                }
            }).a(!list.isEmpty());
        }
    }

    public final void a(boolean z2, String str, String str2, boolean z3) {
        int i2;
        Drawable drawable;
        lam lam = new lam(this.a, this.w, this.y);
        if (!this.j.a(this.y) || z3) {
            i2 = z2 ? R.string.context_menu_unban : R.string.context_menu_ban;
            drawable = z2 ? a(SpotifyIconV2.BAN, (int) R.color.red) : a(SpotifyIconV2.BAN, (int) R.color.cat_grayscale_55);
        } else {
            i2 = z2 ? R.string.context_menu_unhide_song : R.string.context_menu_hide_song;
            drawable = z2 ? a(SpotifyIconV2.BLOCK, (int) R.color.red) : a(SpotifyIconV2.BLOCK, (int) R.color.cat_grayscale_55);
        }
        fva a2 = a((int) R.id.options_menu_ban_or_unban, i2, drawable);
        boolean z4 = z2;
        String str3 = str2;
        $$Lambda$ContextMenuHelper$dsv8iJpaLuDhBD28q40QpPVm5u0 r0 = new fvc(z2, lam, str, str2) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ lal f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, this.f$4, fva);
            }
        };
        a2.a((fvc) r0);
    }

    public final void a(boolean z2, boolean z3, boolean z4, String str, String str2) {
        AlbumCollectionState albumCollectionState = z2 ? AlbumCollectionState.YES : AlbumCollectionState.NO;
        AlbumCollectionState albumCollectionState2 = albumCollectionState;
        String str3 = str;
        String str4 = str2;
        a(albumCollectionState, true, str, str2, ItemType.TRACK_OR_ALBUM_OR_EPISODE);
    }

    public final void b() {
        this.b.a((int) R.id.context_menu_go_to_queue, this.a.getText(R.string.context_menu_go_to_queue), ImmutableList.a(a(SpotifyIconV2.QUEUE, (int) R.color.white))).f = new a() {
            public final void onTopBarItemClicked(fvb fvb) {
                ContextMenuHelper.this.a(fvb);
            }
        };
    }

    public final void b(long j2, AppShareDestination appShareDestination, izp izp, ShareEventLogger shareEventLogger) {
        $$Lambda$ContextMenuHelper$J0y6M6ATP5cwi8qizffGUnrFtLY r0 = r0;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        $$Lambda$ContextMenuHelper$J0y6M6ATP5cwi8qizffGUnrFtLY r02 = new fvc(shareEventLogger, izp, j2) {
            private final /* synthetic */ ShareEventLogger f$1;
            private final /* synthetic */ izp f$2;
            private final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fva);
            }
        };
        a(appShareDestination.mId, appShareDestination.mNameStringResId, appShareDestination.a((Context) this.a)).a((fvc) r02);
        a(izp.a.e().h(), appShareDestination.mLogId, j2);
    }

    public final void b(String str) {
        a((int) R.id.context_menu_queue_track_or_album, (int) R.string.context_menu_add_to_queue, SpotifyIconV2.ADD_TO_QUEUE).a((fvc) new fvc(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.f(this.f$1, fva);
            }
        });
    }

    public final void b(String str, String str2) {
        a(str, str2, (int) R.string.context_menu_browse_full_album);
    }

    public final void b(String str, String str2, String str3) {
        a(str, (int) R.string.context_menu_add_to_other_playlist, str2, str3);
    }

    public final void b(String str, String str2, boolean z2) {
        a((int) R.id.context_menu_browse_show, z2 ? R.string.context_menu_browse_show_video : R.string.context_menu_browse_show, SpotifyIconV2.PODCASTS).a((fvc) new fvc(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, fva);
            }
        });
    }

    public final void b(String str, boolean z2) {
        a((int) R.id.context_menu_toggle_collaborative, z2 ? R.string.context_menu_uncollaborative : R.string.context_menu_collaborative, SpotifyIconV2.COLLABORATIVE_PLAYLIST).a((fvc) new fvc(z2, str) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.b(this.f$1, this.f$2, fva);
            }
        });
    }

    public final void c(long j2, AppShareDestination appShareDestination, izp izp, ShareEventLogger shareEventLogger) {
        izp izp2 = izp;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        a(j2, appShareDestination, izp, shareEventLogger, (izd) new izd(izp) {
            private final /* synthetic */ izp f$1;

            {
                this.f$1 = r2;
            }

            public final void onShareMenuItemClick(fva fva) {
                ContextMenuHelper.this.d(this.f$1, fva);
            }
        });
    }

    public final void c(String str) {
        a((int) R.id.context_menu_go_to_queue, (int) R.string.context_menu_go_to_queue, SpotifyIconV2.QUEUE).a((fvc) new fvc(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.e(this.f$1, fva);
            }
        });
    }

    public final void c(String str, String str2) {
        b(str, str2, (int) R.string.context_menu_browse_artist);
    }

    public final void c(String str, String str2, String str3) {
        a((int) R.id.menu_item_add_to_home_screen, (int) R.string.options_menu_add_to_home_screen, SpotifyIconV2.DEVICE_MOBILE).a((fvc) new fvc(str, str2, str3) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, this.f$3, fva);
            }
        });
    }

    public final void c(String str, boolean z2) {
        a((int) R.id.context_menu_toggle_published, z2 ? R.string.context_menu_unpublish : R.string.context_menu_publish, z2 ? SpotifyIconV2.LOCKED : SpotifyIconV2.PUBLIC).a((fvc) new fvc(z2, str) {
            private final /* synthetic */ boolean f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fva);
            }
        });
    }

    public final void d(long j2, AppShareDestination appShareDestination, izp izp, ShareEventLogger shareEventLogger) {
        AppShareDestination appShareDestination2 = appShareDestination;
        izp izp2 = izp;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        a(j2, appShareDestination, izp, shareEventLogger, (izd) new izd(izp) {
            private final /* synthetic */ izp f$1;

            {
                this.f$1 = r2;
            }

            public final void onShareMenuItemClick(fva fva) {
                ContextMenuHelper.this.c(this.f$1, fva);
            }
        });
    }

    public final void d(String str) {
        unk unk = new unk(this.p, this.a);
        LinkType linkType = jva.a(str).b;
        StringBuilder sb = new StringBuilder(15);
        sb.append(unk.a.getString(R.string.context_menu_sleep_timer));
        if (unk.b.d()) {
            String str2 = " - ";
            sb.append(" - ");
            if (unk.b.a() >= 0) {
                int ceil = (int) Math.ceil((double) (((float) unk.b.a()) / 60000.0f));
                if (ceil < 60) {
                    sb.append(String.format(unk.a.getString(R.string.context_menu_sleep_timer_mins_left), new Object[]{Integer.valueOf(ceil)}));
                } else {
                    sb.append(String.format(unk.a.getString(R.string.context_menu_sleep_timer_hours_left), new Object[]{Integer.valueOf(ceil / 60)}));
                }
            } else if (linkType == LinkType.SHOW_EPISODE) {
                sb.append(unk.a.getString(R.string.context_menu_sleep_timer_end_of_episode));
            } else {
                sb.append(unk.a.getString(R.string.context_menu_sleep_timer_end_of_track));
            }
        }
        this.b.a((int) R.id.menu_item_sleep_timer, (CharSequence) sb.toString(), unk.b.d() ? fzz.a(unk.a, SpotifyIconV2.SLEEPTIMER, fr.c(unk.a, R.color.green_light)) : fzz.a(unk.a, SpotifyIconV2.SLEEPTIMER)).a((fvc) new fvc(str, linkType) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ LinkType f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fva);
            }
        });
    }

    public final void d(String str, String str2) {
        int i2;
        jva a2 = jva.a(str2);
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
        a((int) R.id.context_menu_delete_playlist, i2, SpotifyIconV2.X).a((fvc) new fvc(str2, str) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.d(this.f$1, this.f$2, fva);
            }
        });
    }

    public final void e(long j2, AppShareDestination appShareDestination, izp izp, ShareEventLogger shareEventLogger) {
        izp izp2 = izp;
        a(j2, appShareDestination, izp, shareEventLogger, (izd) new izd(izp) {
            private final /* synthetic */ izp f$1;

            {
                this.f$1 = r2;
            }

            public final void onShareMenuItemClick(fva fva) {
                ContextMenuHelper.this.b(this.f$1, fva);
            }
        });
    }

    public final void e(String str) {
        a((int) R.id.menu_item_show_credits, (int) R.string.context_menu_show_credits, a(SpotifyIconV2.FOLLOW)).a((fvc) new fvc(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.b(this.f$1, fva);
            }
        });
    }

    public final void e(String str, String str2) {
        a((int) R.id.context_menu_browse_show, (int) R.string.context_menu_browse_episode, SpotifyIconV2.PODCASTS).a((fvc) new fvc(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, this.f$2, fva);
            }
        });
    }

    public final void f(long j2, AppShareDestination appShareDestination, izp izp, ShareEventLogger shareEventLogger) {
        AppShareDestination appShareDestination2 = appShareDestination;
        ShareEventLogger shareEventLogger2 = shareEventLogger;
        a(j2, appShareDestination, izp, shareEventLogger, (izd) new izd(izp) {
            private final /* synthetic */ izp f$1;

            {
                this.f$1 = r2;
            }

            public final void onShareMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, fva);
            }
        });
    }

    public final void f(String str) {
        fbp.a(str);
        a((int) R.id.menu_item_hide_from_recently_played, (int) R.string.context_menu_hide_from_recently_played, SpotifyIconV2.BLOCK).a((fvc) new fvc(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onMenuItemClick(fva fva) {
                ContextMenuHelper.this.a(this.f$1, fva);
            }
        });
    }
}
