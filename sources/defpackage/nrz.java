package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.features.homemix.facepile.FacePileView;
import com.spotify.music.features.homemix.facepiledetail.FacePileDetailDialogActivity;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger.Section;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nrz reason: default package */
public final class nrz {
    private final Picasso a;
    private final who<jor<ovg>> b;
    private final sso c;
    private final HomeMixInteractionLogger d;
    private final fqn e;
    private final String f;

    public nrz(Picasso picasso, HomeMixInteractionLogger homeMixInteractionLogger, fqn fqn, String str, who<jor<ovg>> who, sso sso) {
        this.a = picasso;
        this.d = homeMixInteractionLogger;
        this.e = fqn;
        this.f = str;
        this.b = who;
        this.c = sso;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i, HomeMix homeMix, Context context, View view) {
        this.d.a(Section.ITEM_LIST, i, str, "track-face-pile-clicked", homeMix);
        if (!this.e.b(num.h)) {
            DebugFlag debugFlag = DebugFlag.HOME_MIX_FACE_PILE_DETAIL;
        } else {
            FacePileDetailDialogActivity.a(context, this.f, str);
        }
    }

    public final List<View> a(Context context, ovg ovg, nqx nqx, String str, int i, HomeMix homeMix) {
        ArrayList arrayList = new ArrayList();
        if (nqx != null && !nqx.a().isEmpty()) {
            FacePileView facePileView = new FacePileView(context);
            facePileView.a(this.a, nqx);
            $$Lambda$nrz$pyKQ3tQ6Aeg0WCvgSF_c4inH0e0 r3 = new $$Lambda$nrz$pyKQ3tQ6Aeg0WCvgSF_c4inH0e0(this, str, i, homeMix, context);
            facePileView.setOnClickListener(r3);
            arrayList.add(facePileView);
        }
        arrayList.add(jqq.a(context, jyz.c(context, SpotifyIconV2.MORE_ANDROID), (jor) this.b.get(), ovg, this.c));
        return arrayList;
    }
}
