package com.spotify.music.features.renameplaylist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.features.renameplaylist.RenamePlaylistLogger.UserIntent;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public class RenamePlaylistActivity extends kyd implements pvb, pvd, a, udv {
    public pvc g;
    /* access modifiers changed from: private */
    public EditText h;
    private TextView i;
    private TextView j;
    private String k;
    private final jxg l = new jxg() {
        public final void afterTextChanged(Editable editable) {
            RenamePlaylistActivity.this.g.a.a(!editable.toString().isEmpty());
        }
    };
    private final OnEditorActionListener m = new OnEditorActionListener() {
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            RenamePlaylistActivity.this.g.a(RenamePlaylistActivity.this.h.getText().toString().trim());
            return true;
        }
    };

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, RenamePlaylistActivity.class);
        intent.putExtra("playlist_uri", str);
        intent.putExtra("playlist_name", str2);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2 = "playlist_uri";
        if (bundle != null) {
            this.k = bundle.getString(str2);
            str = bundle.getString("input_text");
        } else {
            this.k = getIntent().getStringExtra(str2);
            str = getIntent().getStringExtra("playlist_name");
        }
        super.onCreate(bundle);
        if (fax.a(this.k)) {
            Assertion.a("No playlist uri provided. Did you use createIntent()?");
        }
        setContentView((int) R.layout.rename_playlist_activity);
        this.i = (TextView) findViewById(R.id.continue_button);
        this.i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                RenamePlaylistActivity.this.b(view);
            }
        });
        this.h = (EditText) findViewById(R.id.edit_text);
        this.h.setOnEditorActionListener(this.m);
        this.h.addTextChangedListener(this.l);
        this.h.setFilters(new InputFilter[]{new LengthFilter(100)});
        wld.a(this.h, null, 0).a(14.0f);
        this.h.setText((CharSequence) jtc.a(str, ""));
        Editable text = this.h.getText();
        if (!fax.a(text.toString())) {
            this.h.setSelection(0, text.length());
        }
        this.j = (TextView) findViewById(R.id.cancel_button);
        this.j.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                RenamePlaylistActivity.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.g.a(this.h.getText().toString().trim());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        pvc pvc = this.g;
        pvc.b.a(null, "dialog-buttons", 0, InteractionType.HIT, UserIntent.CLOSE);
        pvc.a.k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("playlist_uri", this.k);
        EditText editText = this.h;
        if (editText != null) {
            bundle.putString("input_text", editText.getText().toString());
        }
    }

    public final sih ae_() {
        return ViewUris.aF;
    }

    public final gjf aj() {
        return PageIdentifiers.PLAYLIST_RENAME;
    }

    public void k() {
        finish();
    }

    public final void a(boolean z) {
        this.i.setEnabled(z);
    }

    public void onBackPressed() {
        this.g.b.a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION);
        super.onBackPressed();
    }

    public final String l() {
        return this.k;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PLAYLIST_RENAME, ViewUris.aF.toString());
    }
}
