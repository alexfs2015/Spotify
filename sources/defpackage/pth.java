package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.music.R;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.RelatedArtistModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.paste.widgets.HeaderView;
import java.util.Iterator;

/* renamed from: pth reason: default package */
public class pth extends psw<fxy> implements d {
    public ToastieManager am;
    public gjf an;
    public ptg ao;
    private TextView ap;
    /* access modifiers changed from: private */
    public boolean aq;
    private final OnClickListener ar = new OnClickListener() {
        public final void onClick(View view) {
            pth pth = pth.this;
            pth.a(pth, pth.aq, (RadioStationModel) pth.this.Y);
        }
    };

    public final void a(fyt fyt) {
    }

    public final String e() {
        return "station";
    }

    /* access modifiers changed from: protected */
    public final fxq<fxy> a(boolean z, HeaderView headerView) {
        if (z) {
            return fxq.b((Context) p()).b().b(this.af, 1).a((uvx) headerView).a((Fragment) this);
        }
        return fxq.a((Context) p()).b().b(this.af, 1).b(this.aa).a((uvx) headerView).a(true).a((Fragment) this);
    }

    /* access modifiers changed from: protected */
    public final Button ah() {
        ToggleButton toggleButton = (ToggleButton) LayoutInflater.from(p()).inflate(R.layout.header_toggle_button, null);
        toggleButton.setTextOn(a((int) R.string.header_station_following));
        toggleButton.setTextOff(a((int) R.string.header_station_follow));
        toggleButton.setText(a((int) R.string.header_station_follow));
        toggleButton.setOnClickListener(this.ar);
        return toggleButton;
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationModel radioStationModel, View view) {
        this.aq = radioStationModel.explicitSave;
        super.a(radioStationModel, view);
        ai();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ((fxy) this.ad.a()).b(uhq.a((Context) p(), jst.a(uhq.e(this.Z))));
    }

    /* access modifiers changed from: protected */
    public final void a(jqb jqb) {
        this.ap = (TextView) LayoutInflater.from(p()).inflate(R.layout.simple_text_view, this.ad.e().a, false);
        jqb.a((ListAdapter) new jlv(this.ap, false), (int) R.string.station_description_header, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationModel radioStationModel) {
        RelatedArtistModel[] relatedArtistModelArr = radioStationModel.relatedArtists;
        if (relatedArtistModelArr == null || relatedArtistModelArr.length == 0) {
            this.ae.a(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (RelatedArtistModel artistName : relatedArtistModelArr) {
            sb.append(artistName.artistName());
            sb.append(", ");
        }
        this.ap.setText(o().getResources().getString(R.string.station_description_and_more, new Object[]{sb}));
    }

    /* access modifiers changed from: protected */
    public final RadioStationModel b(RadioStationModel radioStationModel) {
        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, radioStationModel.tracks, radioStationModel.nextPageUrl, this.aq);
        return radioStationModel2;
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationsModel radioStationsModel) {
        this.aq = false;
        String str = this.Z;
        Iterator it = radioStationsModel.savedStations().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((RadioStationModel) it.next()).uri.equals(str)) {
                    this.aq = true;
                    break;
                }
            } else {
                break;
            }
        }
        ai();
        RadioStationModel radioStationModel = (RadioStationModel) this.Y;
        if (radioStationModel != null) {
            this.Y = b(radioStationModel);
        }
    }

    public final rdh af() {
        return rdh.a(this.an, null);
    }

    private void ai() {
        ToggleButton toggleButton = (ToggleButton) this.af;
        if (this.ag.b(ufx.f)) {
            toggleButton.setVisibility(8);
        } else {
            toggleButton.setChecked(this.aq);
            toggleButton.setVisibility(0);
        }
        ez.a(p());
    }

    static /* synthetic */ void a(pth pth, boolean z, RadioStationModel radioStationModel) {
        ptg ptg = pth.ao;
        InteractionAction interactionAction = z ^ true ? InteractionAction.LIKE : InteractionAction.UNLIKE;
        ptg.a.a(pth.Z, "station-header", -1, InteractionType.HIT, interactionAction.mLogString, interactionAction);
        ka kaVar = (ka) fay.a(pth.p());
        if (z) {
            kaVar.startService(RadioActionsService.b(kaVar, pth.Z, pth.ae_()));
            return;
        }
        if (pth.Y != null) {
            kaVar.startService(RadioActionsService.a((Context) kaVar, radioStationModel, pth.ae_()));
            pth.am.a(uos.a(pth.a((int) R.string.toast_saved_to_collection_your_library), 3000).c(R.color.cat_white).b(R.color.cat_black).a());
        }
    }
}
