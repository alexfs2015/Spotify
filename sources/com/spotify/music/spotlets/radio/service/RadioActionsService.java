package com.spotify.music.spotlets.radio.service;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.List;
import rx.internal.util.ScalarSynchronousObservable;

public class RadioActionsService extends whv {
    /* access modifiers changed from: private */
    public static final String d = RadioActionsService.class.getSimpleName();
    public usa a;
    public hxx b;
    public hgy c;
    private final a e = new a();
    private final xok f = new xok();
    /* access modifiers changed from: private */
    public boolean g;
    private final xij<SessionState> h = new xij<SessionState>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            Logger.e(RadioActionsService.d, "Failed to get session state", th);
        }

        public final /* synthetic */ void onNext(Object obj) {
            SessionState sessionState = (SessionState) obj;
            boolean z = sessionState.connected() && !sessionState.loggingOut();
            if (z != RadioActionsService.this.g) {
                RadioActionsService.this.g = z;
                if (RadioActionsService.this.g) {
                    RadioActionsService.this.a.a();
                } else {
                    RadioActionsService.this.a.b();
                    RadioActionsService.this.stopSelf();
                }
            }
        }
    };
    private final xij<fqn> i = new xij<fqn>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            Logger.e(RadioActionsService.d, "Failed to fetch flags", th);
        }

        public final /* synthetic */ void onNext(Object obj) {
            fqn fqn = (fqn) obj;
            RadioActionsService.this.a.d = jus.c(fqn);
        }
    };

    public class a extends Binder {
        public a() {
        }

        public final xii<RadioStationModel> a(sso sso) {
            StationEntitySession a2 = RadioActionsService.this.a.c.a(sso);
            if (a2 != null) {
                return ScalarSynchronousObservable.d(a2.getRadioStationModel());
            }
            return RadioActionsService.this.a.a((String) fbp.a(ute.d(sso.toString())));
        }
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_POSITIVE_FEEDBACK_TRACK");
        return intent;
    }

    public static Intent a(Context context, RadioStationModel radioStationModel, sso sso) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.FOLLOW_STATION");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station", radioStationModel);
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", sso);
        return intent;
    }

    public static Intent a(Context context, ThumbState thumbState) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.THUMB_TRACK");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.thumbState", thumbState);
        return intent;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_NEGATIVE_FEEDBACK_TRACK");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.track_uri", str);
        return intent;
    }

    public static Intent a(Context context, String str, sso sso) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_STATION");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri", str);
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", sso);
        return intent;
    }

    private static RadioStationModel a(Intent intent) {
        return (RadioStationModel) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station");
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_POSITIVE_FEEDBACK_TRACK");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_NEGATIVE_FEEDBACK_ARTIST");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.track_uri", str);
        return intent;
    }

    public static Intent b(Context context, String str, sso sso) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.UNFOLLOW_STATION");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri", str);
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", sso);
        return intent;
    }

    private static uqm b(Intent intent) {
        uqm uqm = (uqm) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.feature_identifier");
        return uqm == null ? uqo.aI : uqm;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_NEGATIVE_FEEDBACK_TRACK");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.track_uri", str);
        return intent;
    }

    private static gkm c(Intent intent) {
        gkm a2 = defpackage.uqo.a.a(intent);
        return a2 == null ? rta.v : a2;
    }

    public static void c(Context context) {
        context.stopService(new Intent(context, RadioActionsService.class));
    }

    public static Intent d(Context context, String str) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_NEGATIVE_FEEDBACK_ARTIST");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.track_uri", str);
        return intent;
    }

    private static sso d(Intent intent) {
        sso sso = (sso) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri");
        return sso == null ? ViewUris.c : sso;
    }

    private static long e(Intent intent) {
        return intent.getLongExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seekToPosition", -1);
    }

    public IBinder onBind(Intent intent) {
        return this.e;
    }

    public void onCreate() {
        super.onCreate();
        this.f.a(wit.a((xfk<T>) this.b.a).a(this.h));
        this.f.a(wit.a((xfk<T>) this.c.a()).a(this.i));
    }

    public void onDestroy() {
        super.onDestroy();
        usa usa = this.a;
        usa.b();
        usa.a.a();
        this.f.a();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        Intent intent2 = intent;
        if (intent2 == null) {
            return 2;
        }
        String action = intent.getAction();
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.GET_ALL_STATIONS".equals(action)) {
            this.a.b.a();
        } else {
            String str = "com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri";
            if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_STATION".equals(action)) {
                this.a.b(intent2.getStringExtra(str));
            } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.FOLLOW_STATION".equals(action)) {
                this.a.a(a(intent));
            } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.FOLLOW_MULTIPLE_STATIONS".equals(action)) {
                this.a.b.a((List<RadioStationModel>) intent2.getParcelableArrayListExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.stations_list"));
            } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.UNFOLLOW_STATION".equals(action)) {
                this.a.b.a(intent2.getStringExtra(str));
            } else {
                String str2 = "com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.trackUrisToFilter";
                String str3 = "com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.startIndex";
                String str4 = "com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.createStation";
                if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION".equals(action)) {
                    String[] stringArrayExtra = intent2.getStringArrayExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seeds");
                    sso d2 = d(intent);
                    boolean booleanExtra = intent2.getBooleanExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.followState", false);
                    boolean booleanExtra2 = intent2.getBooleanExtra(str4, true);
                    int intExtra = intent2.getIntExtra(str3, -1);
                    long e2 = e(intent);
                    uqm b2 = b(intent);
                    gkm c2 = c(intent);
                    this.a.a(stringArrayExtra, booleanExtra, booleanExtra2, intExtra, e2, intent2.getStringArrayExtra(str2), new defpackage.usa.a(d2, b2, c2));
                } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION_ENTITY".equals(action)) {
                    RadioStationModel a2 = a(intent);
                    sso d3 = d(intent);
                    int intExtra2 = intent2.getIntExtra(str3, -1);
                    long e3 = e(intent);
                    uqm b3 = b(intent);
                    gkm c3 = c(intent);
                    this.a.a(a2, intExtra2, e3, intent2.getBooleanExtra(str4, true), intent2.getStringArrayExtra(str2), new defpackage.usa.a(d3, b3, c3));
                } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.THUMB_TRACK".equals(action)) {
                    this.a.a((ThumbState) intent2.getSerializableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.thumbState"));
                } else {
                    String str5 = "com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.track_uri";
                    if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_NEGATIVE_FEEDBACK_TRACK".equals(action)) {
                        this.a.c(intent2.getStringExtra(str5));
                    } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_NEGATIVE_FEEDBACK_ARTIST".equals(action)) {
                        this.a.e(intent2.getStringExtra(str5));
                    } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_NEGATIVE_FEEDBACK_TRACK".equals(action)) {
                        this.a.d(intent2.getStringExtra(str5));
                    } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_NEGATIVE_FEEDBACK_ARTIST".equals(action)) {
                        this.a.f(intent2.getStringExtra(str5));
                    } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_POSITIVE_FEEDBACK_TRACK".equals(action)) {
                        this.a.c();
                    } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_POSITIVE_FEEDBACK_TRACK".equals(action)) {
                        this.a.d();
                    } else if (!fbo.a(action)) {
                        StringBuilder sb = new StringBuilder("RadioActionsService does not know the action ");
                        sb.append(action);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return 2;
    }
}
