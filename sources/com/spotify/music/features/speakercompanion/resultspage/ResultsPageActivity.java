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

public class ResultsPageActivity extends kyd implements b, a, udv {
    private static final gjf i = new gjf() {
        public final String a() {
            return "speaker-companion/page";
        }
    };
    public a g;
    public Picasso h;
    private RecyclerView j;

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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.b();
    }

    public void onResume() {
        super.onResume();
        this.g.a((b) this, (Payload) getIntent().getParcelableExtra("RESULTS_PAGE_PAYLOAD"));
    }

    public void onPause() {
        super.onPause();
        this.g.a();
    }

    public final void a(List<qhk> list) {
        if (list.isEmpty()) {
            finish();
        } else {
            this.j.a((a) new qhm(list, this.h, this.g));
        }
    }

    public final void k() {
        finish();
    }

    public final rdh af() {
        return rdh.a(i, ViewUris.bS.toString());
    }

    public static Intent a(Context context, String str, Payload payload) {
        fay.a(context);
        Intent intent = new Intent(context, ResultsPageActivity.class);
        intent.putExtra("RESULTS_PAGE_PAYLOAD", payload);
        intent.putExtra("INTENT_KEY_UTTERANCE_UID", str);
        return intent;
    }

    public final sih ae_() {
        return ViewUris.bS;
    }

    public final gjf aj() {
        return i;
    }
}
