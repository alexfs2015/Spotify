package com.spotify.music.features.homemix.facepiledetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.spotify.playlist.models.Covers.Size;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Map;

public class FacePileDetailDialogActivity extends lbm implements nrh, uqq {
    public nra g;
    public nri h;
    private nrg i;

    public static void a(Context context, String str, String str2) {
        Intent intent = new Intent(context, FacePileDetailDialogActivity.class);
        intent.putExtra("KEY_PLAYLIST_URI", str);
        intent.putExtra("KEY_TRACK_URI", str2);
        fr.a(context, intent, fb.a(context, 17432576, 17432577).a());
    }

    public final void a(Map<String, HomeMixUser> map, List<nsr> list) {
        nre nre = this.i.f;
        nre.a = map;
        nre.d = list;
        nre.e();
    }

    public final void a(vle vle) {
        nrg nrg = this.i;
        nrg.a.a(vle.getImageUri(Size.LARGE)).a(nrg.c);
        nrg.d.setText(vle.getTitle());
        vlf b = vle.b();
        if (b != null) {
            nrg.e.setText(jve.a(b));
        }
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.HOMEMIX_GENRESPAGE, null);
    }

    public final gkq aj() {
        return PageIdentifiers.HOMEMIX_GENRESPAGE;
    }

    public final void k() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        String str3 = "KEY_PLAYLIST_URI";
        String str4 = "KEY_TRACK_URI";
        if (bundle != null) {
            str2 = bundle.getString(str4);
            str = bundle.getString(str3);
        } else {
            str2 = getIntent().getStringExtra(str4);
            str = getIntent().getStringExtra(str3);
        }
        if (fbo.a(str2) || fbo.a(str)) {
            finish();
            return;
        }
        nra nra = this.g;
        nqz nqz = new nqz((vje) nra.a(nra.a.get(), 1), (HomeMixFormatListAttributesHelper) nra.a(nra.b.get(), 2), (a) nra.a(nra.c.get(), 3), (String) nra.a(str, 4), (String) nra.a(str2, 5), (nrh) nra.a(this, 6));
        nri nri = this.h;
        this.i = new nrg((nre) nri.a(nri.a.get(), 1), (Picasso) nri.a(nri.b.get(), 2), (nqz) nri.a(nqz, 3), (LayoutInflater) nri.a(LayoutInflater.from(this), 4));
        setContentView((View) this.i.b);
    }
}
