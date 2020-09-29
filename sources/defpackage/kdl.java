package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection;
import com.spotify.music.R;
import com.waze.sdk.WazeSDKManager;

/* renamed from: kdl reason: default package */
public final class kdl {
    private static final b<Object, Boolean> a = b.b("waze_onboarding_completed");
    private static final b<Object, Boolean> b = b.b("waze_is_turned_on");
    private static final b<Object, Boolean> c = b.b("waze_goto_closed");
    private final Context d;
    private final jvy e;

    public kdl(Context context, jvy jvy) {
        this.d = context;
        this.e = jvy;
    }

    public final boolean a() {
        return this.e.b(this.d).a(c, false);
    }

    public final void a(boolean z) {
        this.e.b(this.d).a().a(c, z).b();
    }

    @Deprecated
    public final boolean b() {
        return this.e.b(this.d).a(b, true);
    }

    @Deprecated
    public final void b(boolean z) {
        this.e.b(this.d).a().a(b, z).b();
    }

    public final boolean c() {
        fay.a(this.d);
        return this.e.b(this.d).a(a, false);
    }

    public final void c(boolean z) {
        fay.a(this.d);
        this.e.b(this.d).a().a(a, z).b();
    }

    public final boolean d() {
        String str = "\\.";
        WazeSDKManager.a();
        String a2 = WazeSDKManager.a(this.d);
        if (a2 == null) {
            return false;
        }
        try {
            String[] split = "4.19.0.901".split(str);
            String[] split2 = a2.split(str);
            for (int i = 0; i < split.length; i++) {
                if (split2.length - 1 < i) {
                    return false;
                }
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt2 < parseInt) {
                    return false;
                }
                if (parseInt2 > parseInt) {
                    return true;
                }
            }
            return true;
        } catch (NumberFormatException e2) {
            Logger.e(e2, "Unsupported version number: %s", a2);
            return false;
        }
    }

    public final boolean e() {
        return !c();
    }

    public final boolean f() {
        String str = "android.intent.action.VIEW";
        if (d()) {
            return false;
        }
        try {
            Intent intent = new Intent(str, Uri.parse("market://details?id=com.waze&referrer=utm_source%3Dpartner%26utm_medium%3Ddirect%26utm_campaign%3Dspotify"));
            intent.addFlags(268435456);
            this.d.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent(str, Uri.parse("https://play.google.com/store/apps/details?id=com.waze&referrer=utm_source%3Dpartner%26utm_medium%3Ddirect%26utm_campaign%3Dspotify"));
            intent2.addFlags(268435456);
            this.d.startActivity(intent2);
        }
        return true;
    }

    public static int a(WazeTransportDrivingDirection wazeTransportDrivingDirection, boolean z) {
        switch (AnonymousClass1.a[wazeTransportDrivingDirection.ordinal()]) {
            case 1:
            case 22:
                break;
            case 2:
                return R.drawable.waze_direction_left;
            case 3:
                return R.drawable.waze_direction_right;
            case 4:
                return R.drawable.waze_direction_keep_left;
            case 5:
                return R.drawable.waze_direction_keep_right;
            case 6:
                return R.drawable.waze_direction_forward;
            case 7:
                return z ? R.drawable.waze_directions_roundabout_enter_uk : R.drawable.waze_directions_roundabout_enter;
            case 8:
                return z ? R.drawable.waze_directions_roundabout_enter_uk : R.drawable.waze_directions_roundabout_enter;
            case 9:
            case 10:
                return z ? R.drawable.waze_directions_roundabout_uk_l : R.drawable.waze_directions_roundabout_l;
            case 11:
            case 12:
                return z ? R.drawable.waze_directions_roundabout_uk_s : R.drawable.waze_directions_roundabout_s;
            case 13:
                return R.drawable.waze_directions_roundabout_r;
            case 14:
                return R.drawable.waze_directions_roundabout_r_uk;
            case 15:
            case 16:
                return z ? R.drawable.waze_directions_roundabout_u_uk : R.drawable.waze_directions_roundabout_u;
            case 17:
                return R.drawable.waze_direction_end;
            case 18:
                return R.drawable.waze_direction_keep_left;
            case 19:
                return R.drawable.waze_direction_keep_right;
            case 20:
                return R.drawable.waze_direction_stop;
            case 21:
                return z ? R.drawable.waze_direction_u_turn_uk : R.drawable.waze_direction_u_turn;
            default:
                Logger.b("Unexpected direction: %s", wazeTransportDrivingDirection.name());
                break;
        }
        Logger.b("Fallback image for direction: %s", wazeTransportDrivingDirection.name());
        return R.drawable.waze_logo;
    }
}
