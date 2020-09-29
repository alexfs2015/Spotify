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

public class RadioActionsService extends vtp {
    /* access modifiers changed from: private */
    public static final String d = RadioActionsService.class.getSimpleName();
    public ugm a;
    public hvl b;
    public hec c;
    private final a e = new a();
    private final xag f = new xag();
    /* access modifiers changed from: private */
    public boolean g;
    private final wue<SessionState> h = new wue<SessionState>() {
        public final void onCompleted() {
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

        public final void onError(Throwable th) {
            Logger.e(RadioActionsService.d, "Failed to get session state", th);
        }
    };
    private final wue<fpt> i = new wue<fpt>() {
        public final void onCompleted() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            fpt fpt = (fpt) obj;
            RadioActionsService.this.a.d = jsl.c(fpt);
        }

        public final void onError(Throwable th) {
            Logger.e(RadioActionsService.d, "Failed to fetch flags", th);
        }
    };

    public class a extends Binder {
        public a() {
        }

        public final wud<RadioStationModel> a(sih sih) {
            StationEntitySession a2 = RadioActionsService.this.a.c.a(sih);
            if (a2 != null) {
                return ScalarSynchronousObservable.d(a2.getRadioStationModel());
            }
            return RadioActionsService.this.a.a((String) fay.a(uhq.e(sih.toString())));
        }
    }

    private static RadioStationModel a(Intent intent) {
        return (RadioStationModel) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station");
    }

    private static udr b(Intent intent) {
        udr udr = (udr) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.feature_identifier");
        return udr == null ? udt.aI : udr;
    }

    private static gjb c(Intent intent) {
        gjb a2 = defpackage.udt.a.a(intent);
        return a2 == null ? rju.v : a2;
    }

    private static sih d(Intent intent) {
        sih sih = (sih) intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri");
        return sih == null ? ViewUris.d : sih;
    }

    private static long e(Intent intent) {
        return intent.getLongExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seekToPosition", -1);
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

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_NEGATIVE_FEEDBACK_ARTIST");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.track_uri", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_NEGATIVE_FEEDBACK_TRACK");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.track_uri", str);
        return intent;
    }

    public static Intent d(Context context, String str) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_NEGATIVE_FEEDBACK_ARTIST");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.track_uri", str);
        return intent;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_POSITIVE_FEEDBACK_TRACK");
        return intent;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_POSITIVE_FEEDBACK_TRACK");
        return intent;
    }

    public static Intent a(Context context, String str, sih sih) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_STATION");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri", str);
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", sih);
        return intent;
    }

    public static Intent a(Context context, RadioStationModel radioStationModel, sih sih) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.FOLLOW_STATION");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station", radioStationModel);
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", sih);
        return intent;
    }

    public static Intent b(Context context, String str, sih sih) {
        Intent intent = new Intent(context, RadioActionsService.class);
        intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.UNFOLLOW_STATION");
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri", str);
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", sih);
        return intent;
    }

    public static void c(Context context) {
        context.stopService(new Intent(context, RadioActionsService.class));
    }

    public void onCreate() {
        super.onCreate();
        this.f.a(vun.a((wrf<T>) this.b.a).a(this.h));
        this.f.a(vun.a((wrf<T>) this.c.a()).a(this.i));
    }

    public void onDestroy() {
        super.onDestroy();
        ugm ugm = this.a;
        ugm.b();
        ugm.a.a();
        this.f.a();
    }

    public IBinder onBind(Intent intent) {
        return this.e;
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
                    sih d2 = d(intent);
                    boolean booleanExtra = intent2.getBooleanExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.followState", false);
                    boolean booleanExtra2 = intent2.getBooleanExtra(str4, true);
                    int intExtra = intent2.getIntExtra(str3, -1);
                    long e2 = e(intent);
                    udr b2 = b(intent);
                    gjb c2 = c(intent);
                    this.a.a(stringArrayExtra, booleanExtra, booleanExtra2, intExtra, e2, intent2.getStringArrayExtra(str2), new defpackage.ugm.a(d2, b2, c2));
                } else if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION_ENTITY".equals(action)) {
                    RadioStationModel a2 = a(intent);
                    sih d3 = d(intent);
                    int intExtra2 = intent2.getIntExtra(str3, -1);
                    long e3 = e(intent);
                    udr b3 = b(intent);
                    gjb c3 = c(intent);
                    this.a.a(a2, intExtra2, e3, intent2.getBooleanExtra(str4, true), intent2.getStringArrayExtra(str2), new defpackage.ugm.a(d3, b3, c3));
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
                    } else if (!fax.a(action)) {
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
