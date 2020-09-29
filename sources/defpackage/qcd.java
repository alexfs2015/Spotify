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

/* renamed from: qcd reason: default package */
public class qcd extends qbs<fys> implements d {
    public ToastieManager ap;
    public gkq aq;
    public qcc ar;
    private TextView as;
    /* access modifiers changed from: private */
    public boolean at;
    private final OnClickListener au = new OnClickListener() {
        public final void onClick(View view) {
            qcd qcd = qcd.this;
            qcd.a(qcd, qcd.at, (RadioStationModel) qcd.this.Y);
        }
    };

    static /* synthetic */ void a(qcd qcd, boolean z, RadioStationModel radioStationModel) {
        qcc qcc = qcd.ar;
        InteractionAction interactionAction = z ^ true ? InteractionAction.LIKE : InteractionAction.UNLIKE;
        qcc.a.a(qcd.Z, "station-header", -1, InteractionType.HIT, interactionAction.mLogString, interactionAction);
        kf kfVar = (kf) fbp.a(qcd.p());
        if (z) {
            kfVar.startService(RadioActionsService.b(kfVar, qcd.Z, qcd.ae_()));
            return;
        }
        if (qcd.Y != null) {
            kfVar.startService(RadioActionsService.a((Context) kfVar, radioStationModel, qcd.ae_()));
            qcd.ap.a(uzy.a(qcd.a((int) R.string.toast_saved_to_collection_your_library), 3000).c(R.color.cat_white).b(R.color.cat_black).a());
        }
    }

    private void ai() {
        ToggleButton toggleButton = (ToggleButton) this.af;
        if (this.ag.b(url.f)) {
            toggleButton.setVisibility(8);
        } else {
            toggleButton.setChecked(this.at);
            toggleButton.setVisibility(0);
        }
        ez.a(p());
    }

    /* access modifiers changed from: protected */
    public final fyk<fys> a(boolean z, HeaderView headerView) {
        return z ? fyk.b((Context) p()).b().b(this.af, 1).a((vhn) headerView).a((Fragment) this) : fyk.a((Context) p()).b().b(this.af, 1).b(this.aa).a((vhn) headerView).a(true).a((Fragment) this);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ((fys) this.ad.a()).b(ute.a((Context) p(), jva.a(ute.d(this.Z))));
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
        this.as.setText(o().getResources().getString(R.string.station_description_and_more, new Object[]{sb}));
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationModel radioStationModel, View view) {
        this.at = radioStationModel.explicitSave;
        super.a(radioStationModel, view);
        ai();
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationsModel radioStationsModel) {
        this.at = false;
        String str = this.Z;
        Iterator it = radioStationsModel.savedStations().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((RadioStationModel) it.next()).uri.equals(str)) {
                    this.at = true;
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

    public final void a(fzn fzn) {
    }

    /* access modifiers changed from: protected */
    public final void a(jsm jsm) {
        this.as = (TextView) LayoutInflater.from(p()).inflate(R.layout.simple_text_view, this.ad.e().a, false);
        jsm.a((ListAdapter) new joh(this.as, false), (int) R.string.station_description_header, 0);
    }

    public final rmf af() {
        return rmf.a(this.aq, null);
    }

    /* access modifiers changed from: protected */
    public final Button ah() {
        ToggleButton toggleButton = (ToggleButton) LayoutInflater.from(p()).inflate(R.layout.header_toggle_button, null);
        toggleButton.setTextOn(a((int) R.string.header_station_following));
        toggleButton.setTextOff(a((int) R.string.header_station_follow));
        toggleButton.setText(a((int) R.string.header_station_follow));
        toggleButton.setOnClickListener(this.au);
        return toggleButton;
    }

    /* access modifiers changed from: protected */
    public final RadioStationModel b(RadioStationModel radioStationModel) {
        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, radioStationModel.tracks, radioStationModel.nextPageUrl, this.at);
        return radioStationModel2;
    }

    public final String e() {
        return "station";
    }
}
