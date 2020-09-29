package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.Arrays;

/* renamed from: usi reason: default package */
public final class usi {
    public RadioStationModel a = null;
    public usm b = new usm(new RadioStationTracksModel(new PlayerTrack[0], ""), ViewUris.c);
    public String c;
    PlayerTrack d = null;
    public boolean e = false;
    boolean f = false;

    public final String a() {
        PlayerTrack playerTrack = this.d;
        return playerTrack == null ? "" : playerTrack.uri();
    }

    /* access modifiers changed from: 0000 */
    public final void a(RadioStationModel radioStationModel, usm usm) {
        fbp.a(usm);
        this.a = radioStationModel;
        this.b = usm;
        this.e = false;
        this.f = false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ThumbState thumbState) {
        if (!ute.f(this.c)) {
            return false;
        }
        this.e = true;
        b(thumbState);
        return true;
    }

    public final ThumbState b() {
        return this.b.a(a());
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(ThumbState thumbState) {
        if (!ute.f(this.c)) {
            return false;
        }
        this.b.a(a(), thumbState);
        return true;
    }

    public final boolean c() {
        if (ute.f(this.c)) {
            RadioStationModel radioStationModel = this.a;
            if (radioStationModel == null || !radioStationModel.isMyContext(this.c)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof usi) {
            usi usi = (usi) obj;
            if (fbn.a(this.a, usi.a) && fbn.a(this.d, usi.d) && this.e == usi.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, a(), Boolean.valueOf(this.e)});
    }
}
