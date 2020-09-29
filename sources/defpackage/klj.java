package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.features.freetierallsongsdialog.FreeTierAllSongsDialogActivity;
import java.util.ArrayList;

/* renamed from: klj reason: default package */
public final class klj implements rfu {
    private final Activity a;
    private final Bundle b = fb.a((Context) this.a, 17432576, 17432577).a();
    private final spe c;
    private final kvk d;

    public klj(Activity activity, spe spe, kvk kvk) {
        this.a = activity;
        this.c = spe;
        this.d = kvk;
    }

    public final void a(fpt fpt, ArrayList<rft> arrayList, String str, String str2) {
        Activity activity = this.a;
        fr.a((Context) activity, FreeTierAllSongsDialogActivity.a(activity, fpt, arrayList, str, str2), this.b);
    }

    public final void b(fpt fpt, ArrayList<rft> arrayList, String str, String str2) {
        Intent a2 = FreeTierAllSongsDialogActivity.a(this.a, fpt, arrayList, str, str2);
        PlayerTrack[] playerTrackArr = new PlayerTrack[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            playerTrackArr[i] = PlayerTrack.create(((rft) arrayList.get(i)).a());
        }
        kvk kvk = this.d;
        if (a2 != null) {
            a2.setFlags(268435456);
        }
        a aVar = new a();
        aVar.a = a2;
        aVar.b = kvy.a(playerTrackArr, str, str2);
        aVar.c = true;
        kvk.a.a(aVar.a());
    }
}
