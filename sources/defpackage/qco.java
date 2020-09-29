package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

/* renamed from: qco reason: default package */
public final class qco extends qcm {
    private final sso n;
    private final uqm o;
    private final gkm p;
    private RadioStationModel q;
    private String r;

    public qco(Context context, sso sso, ViewGroup viewGroup, int i, int i2, boolean z, uqm uqm, gkm gkm, Player player, ure ure, boolean z2) {
        super(context, sso, viewGroup, i, i2, qcn.e, qcn.f, qcm.c, qcm.d, R.string.actionbar_item_start_radio, R.id.actionbar_item_start_radio, z, player, ure, z2);
        this.n = sso;
        this.o = uqm;
        this.p = gkm;
    }

    public final void a(RadioStationModel radioStationModel) {
        this.q = radioStationModel;
        this.r = (radioStationModel.seeds == null || radioStationModel.seeds.length <= 0) ? null : ute.a(radioStationModel.seeds[0]);
        e();
    }

    /* access modifiers changed from: protected */
    public final void a(ure ure) {
        RadioStationModel radioStationModel = this.q;
        if (radioStationModel != null && this.r != null) {
            ure.a(radioStationModel, this.n, this.o, this.p);
        }
    }

    public final boolean a(String str) {
        String str2 = this.r;
        return str2 != null && fbn.a(str2, str);
    }
}
