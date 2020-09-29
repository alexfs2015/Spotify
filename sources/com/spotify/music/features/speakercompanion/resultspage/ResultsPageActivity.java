package com.spotify.music.features.speakercompanion.resultspage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse.Payload;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import java.util.List;

public class ResultsPageActivity extends lbm implements b, a, uqq {
    private static final gkq i = new gkq() {
        public final String a() {
            return "speaker-companion/page";
        }
    };
    public a g;
    public Picasso h;
    private RecyclerView j;

    public static Intent a(Context context, String str, Payload payload) {
        fbp.a(context);
        Intent intent = new Intent(context, ResultsPageActivity.class);
        intent.putExtra("RESULTS_PAGE_PAYLOAD", payload);
        intent.putExtra("INTENT_KEY_UTTERANCE_UID", str);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.b();
    }

    public final void a(List<qpy> list) {
        if (list.isEmpty()) {
            finish();
        } else {
            this.j.a((a) new qqa(list, this.h, this.g));
        }
    }

    public final sso ae_() {
        return ViewUris.bR;
    }

    public final rmf af() {
        return rmf.a(i, ViewUris.bR.toString());
    }

    public final gkq aj() {
        return i;
    }

    public final void k() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_results_page_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) this, SpotifyIconV2.X, (float) getResources().getDimensionPixelSize(R.dimen.toolbar_close_icon));
        spotifyIconDrawable.a(fr.c(this, R.color.white));
        toolbar.b((Drawable) spotifyIconDrawable);
        toolbar.a((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                ResultsPageActivity.this.a(view);
            }
        });
        this.j = (RecyclerView) findViewById(16908298);
    }

    public void onPause() {
        super.onPause();
        this.g.a();
    }

    public void onResume() {
        super.onResume();
        this.g.a((b) this, (Payload) getIntent().getParcelableExtra("RESULTS_PAGE_PAYLOAD"));
    }
}
