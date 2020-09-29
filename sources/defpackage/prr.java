package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.playlist.service.PlaylistService;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import com.spotify.music.features.quicksilver.utils.QuicksilverLoggerService;
import com.spotify.music.features.quicksilver.utils.QuicksilverPlaybackService;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.libs.viewuri.ViewUris;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: prr reason: default package */
public final class prr {
    private final WeakReference<Activity> a;
    private final jke b;
    private final mbl c;
    private final FollowManager d;
    private final hbj e;

    public prr(Activity activity, jkf jkf, mbl mbl, FollowManager followManager, hbj hbj) {
        this.a = new WeakReference<>(activity);
        this.b = jkf.a(activity);
        this.c = mbl;
        this.d = followManager;
        this.e = hbj;
    }

    public final void a(QuicksilverClickAction quicksilverClickAction, fpt fpt) {
        String buttonType = quicksilverClickAction.getButtonType();
        if (buttonType != null) {
            char c2 = 65535;
            switch (buttonType.hashCode()) {
                case -1905312150:
                    if (buttonType.equals(QuicksilverClickAction.DISMISS)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -417344424:
                    if (buttonType.equals(QuicksilverClickAction.ADD_TO_PLAYLIST)) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -278342280:
                    if (buttonType.equals(QuicksilverClickAction.START_PLAYBACK)) {
                        c2 = 10;
                        break;
                    }
                    break;
                case 72248:
                    if (buttonType.equals(QuicksilverClickAction.IAP)) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 84303:
                    if (buttonType.equals("URL")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 80090870:
                    if (buttonType.equals(QuicksilverClickAction.TRIAL)) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 610406469:
                    if (buttonType.equals(QuicksilverClickAction.CALLBACK)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 924509413:
                    if (buttonType.equals("SAVE_ENTITY")) {
                        c2 = 9;
                        break;
                    }
                    break;
                case 932638427:
                    if (buttonType.equals(QuicksilverClickAction.EXTERNAL)) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1653332531:
                    if (buttonType.equals(QuicksilverClickAction.BAN_ENTITY)) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 1909123509:
                    if (buttonType.equals(QuicksilverClickAction.CREATE_PLAYLIST)) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    break;
                case 1:
                    f(quicksilverClickAction.getUrl());
                    break;
                case 2:
                    a();
                    return;
                case 3:
                    b(quicksilverClickAction.getUrl());
                    return;
                case 4:
                case 5:
                    a(quicksilverClickAction.getUrl());
                    return;
                case 6:
                    a(quicksilverClickAction.getUrl(), quicksilverClickAction.getTrackingUrl());
                    return;
                case 7:
                    b();
                    return;
                case 8:
                    a(fpt, quicksilverClickAction.getUrl());
                    return;
                case 9:
                    c(fpt, (String) fay.a(quicksilverClickAction.getUrl()));
                    return;
                case 10:
                    g(quicksilverClickAction.getUrl());
                    return;
                default:
                    Assertion.b("Unsupported Action Type");
                    return;
            }
        }
    }

    private void a(String str) {
        Context context = (Context) this.a.get();
        if (context != null && !TextUtils.isEmpty(str)) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    private void b(String str) {
        Context context = (Context) this.a.get();
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                this.c.a(context);
            } else {
                this.c.a(context, Uri.parse(str));
            }
        }
    }

    private void a() {
        if (((Context) this.a.get()) != null) {
            jke jke = this.b;
            sih sih = ViewUris.aP;
            jke.a();
        }
    }

    private void a(String str, String str2) {
        hbj hbj = this.e;
        List singletonList = Collections.singletonList(str);
        String str3 = "quicksilver";
        if (str2 == null) {
            str2 = str3;
        }
        hbj.a(singletonList, str3, str2);
    }

    private void a(fpt fpt, String str) {
        if (jst.a(str, LinkType.TRACK)) {
            b(fpt, str);
            return;
        }
        if (jst.a(str, LinkType.ARTIST)) {
            c(str);
        }
    }

    private void b(fpt fpt, String str) {
        new kxj((Context) fay.a(this.a.get()), ViewUris.aP, fpt).a(str, true);
    }

    private void c(String str) {
        this.d.b(str, true);
    }

    private void c(fpt fpt, String str) {
        if (jst.a(str, LinkType.ALBUM, LinkType.TRACK, LinkType.SHOW_SHOW)) {
            d(fpt, str);
        } else if (jst.a(str, LinkType.ARTIST)) {
            d(str);
        } else {
            if (jst.a(str, LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                e(str);
            }
        }
    }

    private void d(String str) {
        this.d.a(str, true);
    }

    private void e(String str) {
        PlaylistService.a((Context) fay.a(this.a.get()), str);
    }

    private void d(fpt fpt, String str) {
        new kxj((Context) fay.a(this.a.get()), ViewUris.aP, fpt).a(str, str, true);
    }

    private void b() {
        this.e.a(Collections.emptyList());
    }

    private void f(String str) {
        Context context = (Context) this.a.get();
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                Assertion.b("Attempted to execute callback without valid url");
            } else {
                QuicksilverLoggerService.a(context, str, null);
            }
        }
    }

    private void g(String str) {
        Context context = (Context) this.a.get();
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                Assertion.b("Attempted to start playback without valid entityUri");
            } else {
                QuicksilverPlaybackService.a(context, str);
            }
        }
    }
}
