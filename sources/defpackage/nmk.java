package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.features.homemix.facepile.FacePileView;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger.Section;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nmk reason: default package */
public final class nmk {
    private final Picasso a;
    private final vti<jmf<ooa>> b;
    private final sih c;
    private final HomeMixInteractionLogger d;
    private final fpt e;
    private final kf f;

    public nmk(Picasso picasso, HomeMixInteractionLogger homeMixInteractionLogger, fpt fpt, kf kfVar, vti<jmf<ooa>> vti, sih sih) {
        this.a = picasso;
        this.d = homeMixInteractionLogger;
        this.e = fpt;
        this.f = kfVar;
        this.b = vti;
        this.c = sih;
    }

    public final List<View> a(Context context, ooa ooa, nlh nlh, String str, int i, HomeMix homeMix) {
        ArrayList arrayList = new ArrayList();
        if (nlh != null && !nlh.a().isEmpty()) {
            FacePileView facePileView = new FacePileView(context);
            facePileView.a(this.a, nlh);
            facePileView.setOnClickListener(new $$Lambda$nmk$_FWThVef8n46K29yIZl5jWpRtIo(this, str, i, homeMix));
            arrayList.add(facePileView);
        }
        arrayList.add(joe.a(context, jwz.c(context, SpotifyIconV2.MORE_ANDROID), (jmf) this.b.get(), ooa, this.c));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i, HomeMix homeMix, View view) {
        this.d.a(Section.ITEM_LIST, i, str, "track-face-pile-clicked", homeMix);
        if (!this.e.b(nol.h)) {
            DebugFlag debugFlag = DebugFlag.HOME_MIX_FACE_PILE_DETAIL;
        } else {
            nlj.b(this.f, str);
        }
    }
}
