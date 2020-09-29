package com.spotify.music.features.editplaylist;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.c;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.internal.StateListAnimatorButton;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.editplaylist.EditPlaylistLogger.UserIntent;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.playlist.ui.SimpleHeaderLayout;
import com.spotify.music.playlist.ui.SimpleHeaderView;
import com.spotify.music.toastie.ToastieManager;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.List;
import java.util.Locale;

public class EditPlaylistActivity extends kyd implements a, mnv, mny, a, udv {
    public mns g;
    public mmq h;
    public ToastieManager i;
    public Picasso j;
    private String k;
    private Uri l;
    private LoadingView m;
    private RecyclerView n;
    private jlu o;
    private mnz p;
    private StateListAnimatorImageButton q;
    private StateListAnimatorButton r;
    private Drawable s;

    public void onCreate(Bundle bundle) {
        String str = "playlist_uri";
        if (bundle != null) {
            this.k = bundle.getString(str);
        } else {
            this.k = getIntent().getStringExtra(str);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.edit_playlist_activity);
        gaa.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        fse a = fsi.a(this, viewGroup);
        a.a((CharSequence) getString(R.string.edit_playlist_title));
        gab.a(a.getView(), this);
        viewGroup.addView(a.getView());
        this.q = new StateListAnimatorImageButton(this);
        ip.a((View) this.q, (Drawable) null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) this, SpotifyIconV2.X, (float) getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(getBaseContext(), R.color.white));
        this.q.setImageDrawable(spotifyIconDrawable);
        this.q.setContentDescription(getString(R.string.generic_content_description_close));
        this.q.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                EditPlaylistActivity.this.d(view);
            }
        });
        a.a(ToolbarSide.START, this.q, R.id.toolbar_up_button);
        this.r = new StateListAnimatorButton(this);
        ip.a((View) this.r, (Drawable) null);
        this.r.setText(R.string.edit_playlist_save_button);
        uuu.b(this, this.r, R.attr.pasteActionBarTitleTextAppearance);
        this.r.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                EditPlaylistActivity.this.c(view);
            }
        });
        a.a(ToolbarSide.END, this.r, R.id.toolbar_save_button);
        this.s = fzg.e(this);
        SimpleHeaderLayout simpleHeaderLayout = (SimpleHeaderLayout) findViewById(R.id.glue_header_layout);
        SimpleHeaderView simpleHeaderView = (SimpleHeaderView) simpleHeaderLayout.findViewById(R.id.header_view);
        this.p = new mnz(this, simpleHeaderView);
        mnz mnz = this.p;
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        if (simpleHeaderView.b != null) {
            simpleHeaderView.a.removeView(simpleHeaderView.b.getView());
        }
        simpleHeaderView.b = mnz;
        if (simpleHeaderView.b != null) {
            simpleHeaderView.a.addView(simpleHeaderView.b.getView(), layoutParams);
        }
        this.p.g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                EditPlaylistActivity.this.b(view);
            }
        });
        this.p.d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                EditPlaylistActivity.this.a(view);
            }
        });
        this.p.a.addTextChangedListener(new jxg() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String trim = charSequence.toString().trim();
                mns mns = EditPlaylistActivity.this.g;
                if (!trim.equals(mns.f)) {
                    mns.b.a(null, "header", 0, InteractionType.HIT, UserIntent.NAME_CHANGE);
                    mnm mnm = mns.d;
                    mno.c().a(mnm.b.a.t()).b(trim).a().a((List<mnk>) mnm.a);
                    mns.f = trim;
                }
            }
        });
        this.p.e.addTextChangedListener(new jxg() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String trim = charSequence.toString().trim();
                mns mns = EditPlaylistActivity.this.g;
                if (!trim.equals(mns.g)) {
                    mns.b.a(null, "header", 0, InteractionType.HIT, UserIntent.DESCRIPTION_CHANGE);
                    mnm mnm = mns.d;
                    mni.c().a(mnm.b.a.t()).b(trim).a().a((List<mnk>) mnm.a);
                    mns.g = trim;
                    mns.a.a(trim.length(), 300);
                    mns.a.l(trim.length() >= 250);
                }
            }
        });
        this.n = (RecyclerView) findViewById(R.id.recycler_view);
        this.n.a((i) new LinearLayoutManager(this));
        nz nzVar = new nz(new mmr(this.h));
        nzVar.a(this.n);
        mmq mmq = this.h;
        mmq.d = nzVar;
        mmq.a((c) new c() {
            public final void a() {
                EditPlaylistActivity.this.g.a(EditPlaylistActivity.this.h.a());
            }

            public final void b(int i, int i2) {
                EditPlaylistActivity.this.g.a(EditPlaylistActivity.this.h.a());
            }

            public final void c(int i, int i2) {
                EditPlaylistActivity.this.g.a(EditPlaylistActivity.this.h.a());
            }
        });
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) findViewById(R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.a(this.n);
        recyclerViewFastScroller.setEnabled(true);
        this.n.setVerticalScrollBarEnabled(false);
        fqb.f();
        fuj a2 = fum.a(this, this.n);
        a2.a((CharSequence) getString(R.string.edit_playlist_empty_view_title));
        a2.b().setSingleLine(false);
        a2.b().setEllipsize(null);
        a2.c().setVisibility(8);
        this.o = new jlu(a2.getView(), false);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.content);
        this.m = LoadingView.a(getLayoutInflater(), this, simpleHeaderLayout);
        simpleHeaderLayout.setVisibility(4);
        viewGroup2.addView(this.m);
        viewGroup2.addView(this.p.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        mns mns = this.g;
        if (!mns.h) {
            mns.b.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.CLOSE);
            if (mns.d.a()) {
                mns.c.a();
                return;
            }
            mns.a.k();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.g.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        mns mns = this.g;
        mns.a.h(false);
        mns.a.i(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        mns mns = this.g;
        mns.b.a(null, "header", 0, InteractionType.HIT, UserIntent.PICTURE_CHANGE);
        if (mns.e) {
            mns.c.b();
        }
    }

    public void onResume() {
        super.onResume();
        this.i.a((q) this);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 8 && i3 == -1) {
            if (!(intent == null || intent.getData() == null)) {
                this.g.a(Uri.parse(intent.getData().toString()));
            }
        } else if (i2 == 4 && i3 == -1) {
            getContentResolver().notifyChange(this.l, null);
            this.g.a(this.l);
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.g.a.m();
            }
            return;
        }
        if (i2 == 2 && iArr.length > 0 && iArr[0] == 0) {
            this.g.a.l();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("playlist_uri", this.k);
    }

    public void onBackPressed() {
        mns mns = this.g;
        if (!mns.h) {
            mns.b.a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION);
            if (mns.d.a()) {
                mns.c.a();
                return;
            }
            mns.a.k();
        }
    }

    public void k() {
        finish();
    }

    public final void a(String str) {
        mnz mnz = this.p;
        mnz.a.setText(str);
        mnz.b.setText(str);
    }

    public final void a(Uri uri) {
        this.j.a(uri).a(this.s).b(this.s).a(this.p.d);
    }

    public final void b(String str) {
        mnz mnz = this.p;
        mnz.f.setText(str);
        mnz.e.setText(str);
    }

    public final void a(boolean z) {
        mnz mnz = this.p;
        int i2 = 0;
        mnz.a.setVisibility(z ? 0 : 8);
        TextView textView = mnz.b;
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public final void b(boolean z) {
        mnz mnz = this.p;
        int i2 = 8;
        if (mnz.d.getVisibility() != 8) {
            ImageView imageView = mnz.i;
            if (z) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public final void c(boolean z) {
        this.p.f.setVisibility(z ? 0 : 8);
    }

    public final void a(List<uzb> list) {
        mmq mmq = this.h;
        mmq.a = list;
        mmq.e();
        if (this.n.c() == null) {
            this.n.a((a) this.h);
        }
    }

    public final void d(boolean z) {
        this.h.f = z;
    }

    public final void e(boolean z) {
        mmq mmq = this.h;
        if (mmq.e != z) {
            mmq.e = z;
            mmq.e();
        }
    }

    public final void f(boolean z) {
        if (z) {
            this.m.c();
            this.m.a();
            return;
        }
        this.m.b();
    }

    public final void g(boolean z) {
        a c = this.n.c();
        if (z) {
            jlu jlu = this.o;
            if (c != jlu) {
                this.n.a((a) jlu);
                return;
            }
        }
        if (!z) {
            mmq mmq = this.h;
            if (c != mmq) {
                this.n.a((a) mmq);
            }
        }
    }

    public final void h(boolean z) {
        this.p.g.setVisibility(z ? 0 : 8);
    }

    public final void i(boolean z) {
        this.p.e.setVisibility(z ? 0 : 8);
    }

    public final void j(boolean z) {
        this.p.c.setVisibility(z ? 0 : 8);
    }

    public final void k(boolean z) {
        mnz mnz = this.p;
        int i2 = 0;
        mnz.d.setVisibility(z ? 0 : 8);
        ImageView imageView = mnz.i;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    public final void a(uzb uzb, int i2) {
        mmq mmq = this.h;
        mmq.a.add(i2 - 1, uzb);
        mmq.d(i2);
    }

    public final void l(boolean z) {
        this.p.h.setVisibility(z ? 0 : 8);
    }

    public final void a(int i2, int i3) {
        this.p.h.setText(String.format(Locale.US, "%d/%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(300)}));
    }

    public final void l() {
        Intent intent;
        if (VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
        }
        intent.setType("image/*");
        startActivityForResult(intent, 8);
    }

    public final void m() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(Environment.getExternalStorageDirectory(), "coverart.jpg");
        intent.putExtra("output", Uri.fromFile(file));
        this.l = Uri.fromFile(file);
        startActivityForResult(intent, 4);
    }

    public final void n() {
        if (VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
        }
    }

    public final boolean q() {
        return VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.CAMERA") != 0;
    }

    public final boolean r() {
        return VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
    }

    public final void s() {
        if (VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 2);
        }
    }

    public final void b(uzb uzb, int i2) {
        mns mns = this.g;
        mns.b.a(null, "items", 0, InteractionType.HIT, UserIntent.REMOVE);
        mns.c.a(uzb, i2);
        mnm mnm = mns.d;
        mnm.b.a((String) fay.a(uzb.d())).a((List<mnk>) mnm.a);
    }

    public final void b(String str, String str2) {
        mns mns = this.g;
        mnm mnm = mns.d;
        if (mnj.d().a(mnm.b.a.t()).b(str).c(str2).a().a((List<mnk>) mnm.a)) {
            mns.b.a(null, "items", 0, InteractionType.HIT, UserIntent.MOVE);
        }
    }

    public final gjf aj() {
        return PageIdentifiers.PLAYLIST_EDIT;
    }

    public final sih ae_() {
        return ViewUris.aC.a(this.k);
    }

    public final String t() {
        return this.k;
    }

    public static Intent a(Context context, String str) {
        if (fax.a(str)) {
            Assertion.a("No playlistUri provided. A playlistUri MUST be provided.");
        }
        Intent intent = new Intent(context, EditPlaylistActivity.class);
        intent.putExtra("playlist_uri", str);
        return intent;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PLAYLIST_EDIT, ae_().toString());
    }
}
