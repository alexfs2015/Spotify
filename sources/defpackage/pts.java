package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

/* renamed from: pts reason: default package */
public final class pts extends ptq {
    private final sih n;
    private final udr o;
    private final gjb p;
    private RadioStationModel q;
    private String r;

    public pts(Context context, sih sih, ViewGroup viewGroup, int i, int i2, boolean z, udr udr, gjb gjb, Player player) {
        super(context, sih, viewGroup, i, i2, ptr.e, ptr.f, ptq.c, ptq.d, R.string.actionbar_item_start_radio, R.id.actionbar_item_start_radio, z, player);
        this.n = sih;
        this.o = udr;
        this.p = gjb;
    }

    public final void a(RadioStationModel radioStationModel) {
        this.q = radioStationModel;
        this.r = (radioStationModel.seeds == null || radioStationModel.seeds.length <= 0) ? null : uhq.b(radioStationModel.seeds[0]);
        e();
    }

    /* access modifiers changed from: protected */
    public final void a(ufq ufq) {
        RadioStationModel radioStationModel = this.q;
        if (radioStationModel != null && this.r != null) {
            ufq.a(radioStationModel, this.n, this.o, this.p);
        }
    }

    public final boolean a(String str) {
        String str2 = this.r;
        return str2 != null && faw.a(str2, str);
    }
}
