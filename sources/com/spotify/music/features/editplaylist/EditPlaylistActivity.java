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

public class EditPlaylistActivity extends lbm implements a, mso, msr, a, uqq {
    public msl g;
    public mrj h;
    public ToastieManager i;
    public Picasso j;
    private String k;
    private Uri l;
    private LoadingView m;
    private RecyclerView n;
    private jog o;
    private mss p;
    private StateListAnimatorImageButton q;
    private StateListAnimatorButton r;
    private Drawable s;

    public static Intent a(Context context, String str) {
        if (fbo.a(str)) {
            Assertion.a("No playlistUri provided. A playlistUri MUST be provided.");
        }
        Intent intent = new Intent(context, EditPlaylistActivity.class);
        intent.putExtra("playlist_uri", str);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        msl msl = this.g;
        msl.b.a(null, "header", 0, InteractionType.HIT, UserIntent.PICTURE_CHANGE);
        if (msl.e) {
            msl.c.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        msl msl = this.g;
        msl.a.h(false);
        msl.a.i(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.g.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        msl msl = this.g;
        if (!msl.h) {
            msl.b.a(null, "toolbar", 0, InteractionType.HIT, UserIntent.CLOSE);
            if (msl.d.a()) {
                msl.c.a();
                return;
            }
            msl.a.k();
        }
    }

    public final void a(int i2, int i3) {
        this.p.h.setText(String.format(Locale.US, "%d/%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(300)}));
    }

    public final void a(Uri uri) {
        this.j.a(uri).a(this.s).b(this.s).a(this.p.d);
    }

    public final void a(String str) {
        mss mss = this.p;
        mss.a.setText(str);
        mss.b.setText(str);
    }

    public final void a(List<vle> list) {
        mrj mrj = this.h;
        mrj.a = list;
        mrj.e();
        if (this.n.c() == null) {
            this.n.a((a) this.h);
        }
    }

    public final void a(vle vle, int i2) {
        mrj mrj = this.h;
        mrj.a.add(i2 - 1, vle);
        mrj.d(i2);
    }

    public final void a(boolean z) {
        mss mss = this.p;
        int i2 = 0;
        mss.a.setVisibility(z ? 0 : 8);
        TextView textView = mss.b;
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public final sso ae_() {
        return ViewUris.aB.a(this.k);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PLAYLIST_EDIT, ae_().toString());
    }

    public final gkq aj() {
        return PageIdentifiers.PLAYLIST_EDIT;
    }

    public final void b(String str) {
        mss mss = this.p;
        mss.f.setText(str);
        mss.e.setText(str);
    }

    public final void b(String str, String str2) {
        msl msl = this.g;
        msf msf = msl.d;
        if (msc.d().a(msf.b.a.t()).b(str).c(str2).a().a((List<msd>) msf.a)) {
            msl.b.a(null, "items", 0, InteractionType.HIT, UserIntent.MOVE);
        }
    }

    public final void b(vle vle, int i2) {
        msl msl = this.g;
        msl.b.a(null, "items", 0, InteractionType.HIT, UserIntent.REMOVE);
        msl.c.a(vle, i2);
        msf msf = msl.d;
        msf.b.a((String) fbp.a(vle.d())).a((List<msd>) msf.a);
    }

    public final void b(boolean z) {
        mss mss = this.p;
        int i2 = 8;
        if (mss.d.getVisibility() != 8) {
            ImageView imageView = mss.i;
            if (z) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public final void c(boolean z) {
        this.p.f.setVisibility(z ? 0 : 8);
    }

    public final void d(boolean z) {
        this.h.f = z;
    }

    public final void e(boolean z) {
        mrj mrj = this.h;
        if (mrj.e != z) {
            mrj.e = z;
            mrj.e();
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
            jog jog = this.o;
            if (c != jog) {
                this.n.a((a) jog);
                return;
            }
        }
        if (!z) {
            mrj mrj = this.h;
            if (c != mrj) {
                this.n.a((a) mrj);
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

    public void k() {
        finish();
    }

    public final void k(boolean z) {
        mss mss = this.p;
        int i2 = 0;
        mss.d.setVisibility(z ? 0 : 8);
        ImageView imageView = mss.i;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
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

    public final void l(boolean z) {
        this.p.h.setVisibility(z ? 0 : 8);
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

    public void onBackPressed() {
        msl msl = this.g;
        if (!msl.h) {
            msl.b.a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION);
            if (msl.d.a()) {
                msl.c.a();
                return;
            }
            msl.a.k();
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "playlist_uri";
        if (bundle != null) {
            this.k = bundle.getString(str);
        } else {
            this.k = getIntent().getStringExtra(str);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.edit_playlist_activity);
        gau.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        fsy a = ftc.a(this, viewGroup);
        a.a((CharSequence) getString(R.string.edit_playlist_title));
        gav.a(a.getView(), this);
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
        vgl.b(this, this.r, R.attr.pasteActionBarTitleTextAppearance);
        this.r.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                EditPlaylistActivity.this.c(view);
            }
        });
        a.a(ToolbarSide.END, this.r, R.id.toolbar_save_button);
        this.s = gaa.e(this);
        SimpleHeaderLayout simpleHeaderLayout = (SimpleHeaderLayout) findViewById(R.id.glue_header_layout);
        SimpleHeaderView simpleHeaderView = (SimpleHeaderView) simpleHeaderLayout.findViewById(R.id.header_view);
        this.p = new mss(this, simpleHeaderView);
        mss mss = this.p;
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        if (simpleHeaderView.b != null) {
            simpleHeaderView.a.removeView(simpleHeaderView.b.getView());
        }
        simpleHeaderView.b = mss;
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
        this.p.a.addTextChangedListener(new jzg() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String trim = charSequence.toString().trim();
                msl msl = EditPlaylistActivity.this.g;
                if (!trim.equals(msl.f)) {
                    msl.b.a(null, "header", 0, InteractionType.HIT, UserIntent.NAME_CHANGE);
                    msf msf = msl.d;
                    msh.c().a(msf.b.a.t()).b(trim).a().a((List<msd>) msf.a);
                    msl.f = trim;
                }
            }
        });
        this.p.e.addTextChangedListener(new jzg() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String trim = charSequence.toString().trim();
                msl msl = EditPlaylistActivity.this.g;
                if (!trim.equals(msl.g)) {
                    msl.b.a(null, "header", 0, InteractionType.HIT, UserIntent.DESCRIPTION_CHANGE);
                    msf msf = msl.d;
                    msb.c().a(msf.b.a.t()).b(trim).a().a((List<msd>) msf.a);
                    msl.g = trim;
                    msl.a.a(trim.length(), 300);
                    msl.a.l(trim.length() >= 250);
                }
            }
        });
        this.n = (RecyclerView) findViewById(R.id.recycler_view);
        this.n.a((i) new LinearLayoutManager(this));
        oe oeVar = new oe(new mrk(this.h));
        oeVar.a(this.n);
        mrj mrj = this.h;
        mrj.d = oeVar;
        mrj.a((c) new c() {
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
        fqv.f();
        fvd a2 = fvg.a(this, this.n);
        a2.a((CharSequence) getString(R.string.edit_playlist_empty_view_title));
        a2.b().setSingleLine(false);
        a2.b().setEllipsize(null);
        a2.c().setVisibility(8);
        this.o = new jog(a2.getView(), false);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.content);
        this.m = LoadingView.a(getLayoutInflater(), this, simpleHeaderLayout);
        simpleHeaderLayout.setVisibility(4);
        viewGroup2.addView(this.m);
        viewGroup2.addView(this.p.a());
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

    public void onResume() {
        super.onResume();
        this.i.a((q) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("playlist_uri", this.k);
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

    public final String t() {
        return this.k;
    }
}
