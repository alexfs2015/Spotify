package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.features.freetierallsongsdialog.FreeTierAllSongsDialogActivity;
import java.util.ArrayList;

/* renamed from: kos reason: default package */
public final class kos implements row {
    private final Activity a;
    private final Bundle b = fb.a((Context) this.a, 17432576, 17432577).a();
    private final szl c;
    private final kyt d;

    public kos(Activity activity, szl szl, kyt kyt) {
        this.a = activity;
        this.c = szl;
        this.d = kyt;
    }

    public final void a(fqn fqn, ArrayList<rov> arrayList, String str, String str2) {
        Activity activity = this.a;
        fr.a((Context) activity, FreeTierAllSongsDialogActivity.a(activity, fqn, arrayList, str, str2), this.b);
    }

    public final void b(fqn fqn, ArrayList<rov> arrayList, String str, String str2) {
        Intent a2 = FreeTierAllSongsDialogActivity.a(this.a, fqn, arrayList, str, str2);
        PlayerTrack[] playerTrackArr = new PlayerTrack[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            playerTrackArr[i] = PlayerTrack.create(((rov) arrayList.get(i)).a());
        }
        kyt kyt = this.d;
        if (a2 != null) {
            a2.setFlags(268435456);
        }
        a aVar = new a();
        aVar.a = a2;
        aVar.b = kzh.a(playerTrackArr, str, str2);
        aVar.c = true;
        kyt.a.a(aVar.a());
    }
}
