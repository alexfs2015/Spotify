package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

/* renamed from: usf reason: default package */
public final class usf {
    public uqm a;
    public gkm b;
    public RadioStationModel c;
    public sso d;
    public String[] e;
    public String[] f;
    public Long g;
    private Integer h;
    private Boolean i;
    private Boolean j;

    public final Intent a(Context context) {
        fbp.a(context);
        boolean z = false;
        fbp.a((this.e == null && this.c == null) ? false : true, (Object) "Need seeds or station model");
        fbp.a(this.e == null || this.c == null, (Object) "Cannot play both seeds and station model");
        Intent intent = new Intent(context, RadioActionsService.class);
        if (this.c != null) {
            intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION_ENTITY");
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station", this.c);
        } else {
            String[] strArr = this.e;
            if (strArr != null) {
                if (strArr.length > 0) {
                    z = true;
                }
                fbp.a(z);
                intent.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION");
                intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seeds", this.e);
            }
        }
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", this.d);
        Boolean bool = this.i;
        if (bool != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.followState", bool.booleanValue());
        }
        Boolean bool2 = this.j;
        if (bool2 != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.createStation", bool2.booleanValue());
        }
        Integer num = this.h;
        if (num != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.startIndex", num.intValue());
        }
        Long l = this.g;
        if (l != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seekToPosition", l.longValue());
        }
        intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.feature_identifier", this.a);
        gkm gkm = this.b;
        if (gkm != null) {
            a.a(intent, gkm);
        }
        String[] strArr2 = this.f;
        if (strArr2 != null) {
            intent.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.trackUrisToFilter", strArr2);
        }
        return intent;
    }

    public final usf a(int i2) {
        this.h = Integer.valueOf(i2);
        return this;
    }

    public final usf a(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public final usf b(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }
}
