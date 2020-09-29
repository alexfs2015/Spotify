package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.Arrays;

/* renamed from: ugu reason: default package */
public final class ugu {
    public RadioStationModel a = null;
    public ugy b = new ugy(new RadioStationTracksModel(new PlayerTrack[0], ""), ViewUris.d);
    public String c;
    PlayerTrack d = null;
    public boolean e = false;
    boolean f = false;

    public final String a() {
        PlayerTrack playerTrack = this.d;
        if (playerTrack == null) {
            return "";
        }
        return playerTrack.uri();
    }

    public final ThumbState b() {
        return this.b.a(a());
    }

    /* access modifiers changed from: 0000 */
    public final void a(RadioStationModel radioStationModel, ugy ugy) {
        fay.a(ugy);
        this.a = radioStationModel;
        this.b = ugy;
        this.e = false;
        this.f = false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, a(), Boolean.valueOf(this.e)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ugu) {
            ugu ugu = (ugu) obj;
            if (faw.a(this.a, ugu.a) && faw.a(this.d, ugu.d) && this.e == ugu.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        if (uhq.g(this.c)) {
            RadioStationModel radioStationModel = this.a;
            if (radioStationModel == null || !radioStationModel.isMyContext(this.c)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ThumbState thumbState) {
        if (!uhq.g(this.c)) {
            return false;
        }
        this.e = true;
        b(thumbState);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(ThumbState thumbState) {
        if (!uhq.g(this.c)) {
            return false;
        }
        this.b.a(a(), thumbState);
        return true;
    }
}
