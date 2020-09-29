package com.spotify.music.features.speakercompanion.entityfeedback;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.features.speakercompanion.model.EntityFeedback;
import com.spotify.music.libs.viewuri.ViewUris;
import com.squareup.picasso.Picasso;

public class EntityFeedbackActivity extends kyd implements OnClickListener, b {
    public Picasso g;
    public a h;
    private TextView i;
    private ImageView j;

    public static Intent a(Context context, EntityFeedback entityFeedback) {
        fay.a(context);
        Intent intent = new Intent(context, EntityFeedbackActivity.class);
        intent.putExtra("EXTRA_ENTITY_FEEDBACK_RESPONSE", entityFeedback);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.fragment_entity_feedback);
        findViewById(R.id.button_yes).setOnClickListener(this);
        findViewById(R.id.button_no).setOnClickListener(this);
        findViewById(R.id.button_dismiss).setOnClickListener(this);
        findViewById(R.id.entity_feedback_container).setOnClickListener(this);
        this.j = (ImageView) findViewById(R.id.entity_image);
        this.i = (TextView) findViewById(R.id.entity_title);
    }

    public void onStart() {
        super.onStart();
        this.h.a((b) this);
    }

    public void onResume() {
        super.onResume();
        this.h.a((EntityFeedback) getIntent().getParcelableExtra("EXTRA_ENTITY_FEEDBACK_RESPONSE"));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_yes) {
            this.h.b();
        } else if (id == R.id.button_no) {
            this.h.c();
        } else {
            if (id == R.id.button_dismiss || id == R.id.entity_feedback_container) {
                this.h.a();
            }
        }
    }

    public final void k() {
        setResult(-1);
        finish();
    }

    public final void a(String str) {
        this.i.setText(str);
    }

    public final void b(String str, String str2) {
        qgd.a(this.g, this, this.j, str, str2);
    }

    public void onBackPressed() {
        this.h.a();
    }

    public final rdh af() {
        return rdh.a(new gjf() {
            public final String a() {
                return "dialog/entity-feedback";
            }
        }, ViewUris.bR.toString());
    }
}
