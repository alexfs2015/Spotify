package com.spotify.music.features.createplaylist;

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
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.createplaylist.CreatePlaylistLogger.UserIntent;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreatePlaylistActivity extends lbm implements mni, mnn, a, uqq {
    public mnk g;
    /* access modifiers changed from: private */
    public EditText h;
    private LoadingView i;
    private TextView j;
    private TextView k;
    private List<String> l;
    private String m;
    private String n;
    private final jzg o = new jzg() {
        public final void afterTextChanged(Editable editable) {
            mnk mnk = CreatePlaylistActivity.this.g;
            if (editable.toString().isEmpty()) {
                mnk.a.q();
            } else {
                mnk.a.n();
            }
        }
    };
    private final OnEditorActionListener p = new OnEditorActionListener() {
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            CreatePlaylistActivity.this.g.a(CreatePlaylistActivity.this.h.getText().toString().trim());
            return true;
        }
    };

    public static Intent a(Context context, String str) {
        return a(context, str, Collections.emptyList());
    }

    public static Intent a(Context context, String str, List<String> list) {
        for (String a : list) {
            fbp.a(jva.a(a, LinkType.TRACK, LinkType.ALBUM, LinkType.SHOW_EPISODE), (Object) "The item uri must be either a track, episode or an album uri.");
        }
        if (!fbo.a(str)) {
            fbp.a(jva.a(str, LinkType.COLLECTION_PLAYLIST_FOLDER), (Object) "The folder uri must be a folder uri.");
        }
        Intent intent = new Intent(context, CreatePlaylistActivity.class);
        intent.putExtra("folder_uri", str);
        intent.putStringArrayListExtra("item_uris", new ArrayList(list));
        return intent;
    }

    public static Intent a(Context context, List<String> list) {
        return a(context, null, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        mnk mnk = this.g;
        mnk.b.a("dialog-buttons", UserIntent.CLOSE);
        mnk.a.a((String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.g.a(this.h.getText().toString().trim());
    }

    public final void a(String str) {
        this.n = str;
        finish();
    }

    public final void a(boolean z) {
        if (z) {
            this.i.a();
        } else {
            this.i.b();
        }
    }

    public final sso ae_() {
        return ViewUris.aD;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PLAYLIST_CREATE, ViewUris.aD.toString());
    }

    public final gkq aj() {
        return PageIdentifiers.PLAYLIST_CREATE;
    }

    public final void k() {
        this.k.setEnabled(false);
        this.j.setEnabled(false);
    }

    public final void l() {
        this.k.setEnabled(true);
        this.j.setEnabled(true);
    }

    public final void m() {
        setRequestedOrientation(1);
    }

    public final void n() {
        this.j.setText(R.string.create_playlist_create_button);
    }

    public void onBackPressed() {
        this.g.b.a("view", UserIntent.BACK_NAVIGATION);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        String str;
        String str2 = "";
        String str3 = "folder_uri";
        String str4 = "item_uris";
        if (bundle != null) {
            arrayList = bundle.getStringArrayList(str4);
            this.m = bundle.getString(str3);
            str = bundle.getString("input_text");
        } else {
            arrayList = getIntent().getStringArrayListExtra(str4);
            this.m = getIntent().getStringExtra(str3);
            str = str2;
        }
        this.l = (List) fbm.a(arrayList, new ArrayList(0));
        super.onCreate(bundle);
        setContentView((int) R.layout.create_playlist_activity);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.container);
        relativeLayout.setBackgroundResource(R.drawable.create_playlist_background_gradient);
        this.j = (TextView) findViewById(R.id.continue_button);
        this.j.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CreatePlaylistActivity.this.b(view);
            }
        });
        this.k = (TextView) findViewById(R.id.cancel_button);
        this.k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CreatePlaylistActivity.this.a(view);
            }
        });
        this.h = (EditText) findViewById(R.id.edit_text);
        this.h.setOnEditorActionListener(this.p);
        this.h.addTextChangedListener(this.o);
        this.h.setFilters(new InputFilter[]{new LengthFilter(100)});
        wzj.a(this.h, null, 0).a(14.0f);
        this.h.setText((CharSequence) jvi.a(str, str2));
        gbx.a(this.h);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.i = LoadingView.a(getLayoutInflater());
        LoadingView loadingView = this.i;
        loadingView.b = 0;
        frameLayout.addView(loadingView);
        relativeLayout.addView(frameLayout);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("item_uris", new ArrayList(this.l));
        bundle.putString("folder_uri", this.m);
        EditText editText = this.h;
        if (editText != null) {
            bundle.putString("input_text", editText.getText().toString());
        }
    }

    public final void q() {
        this.j.setText(R.string.create_playlist_skip_button);
    }

    public final List<String> r() {
        return this.l;
    }

    public final String s() {
        return this.m;
    }
}
