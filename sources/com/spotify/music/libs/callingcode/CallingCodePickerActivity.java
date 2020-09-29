package com.spotify.music.libs.callingcode;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.ItemType;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

public class CallingCodePickerActivity extends kyd implements gkk, udv {
    public gki g;
    private i h;
    private rok i;

    public static Intent a(Context context, gkq gkq, ArrayList<gkq> arrayList, int i2) {
        Intent intent = new Intent(context, CallingCodePickerActivity.class);
        intent.putExtra("selected-country-code", gkq != null ? gkq.a() : null);
        intent.putParcelableArrayListExtra("calling-codes", arrayList);
        intent.putExtra("top-background-id", i2);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_calling_code_picker);
        gjd.a(findViewById(R.id.calling_code_picker_root), PageIdentifiers.CALLING_CODE_PICKER.a());
        int intExtra = getIntent().getIntExtra("top-background-id", 0);
        if (intExtra != 0) {
            View findViewById = findViewById(R.id.top_background);
            fay.a(findViewById);
            fay.b(intExtra != 0);
            findViewById.setBackground(new LayerDrawable(new Drawable[]{fr.a((Context) this, intExtra), fr.a((Context) this, (int) R.drawable.bg_fade_to_black)}));
            findViewById.setVisibility(0);
        }
        fse a = fsi.a((GlueToolbarLayout) findViewById(R.id.toolbar));
        a.a((CharSequence) getString(R.string.title));
        ImageButton b = jwz.b(this, SpotifyIconV2.X);
        a.a(ToolbarSide.START, b, R.id.action_cancel);
        gjd.a((View) b, gje.b().a().a(ItemType.BUTTON).a("cancel-button"), InteractionIntent.CLOSE);
        b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CallingCodePickerActivity.this.a(view);
            }
        });
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        searchView.l = new b() {
            public final boolean a(String str) {
                gki gki = CallingCodePickerActivity.this.g;
                if (gki.b != null) {
                    gki.b.a(str);
                }
                return true;
            }
        };
        gjd.a((View) searchView, gje.b().a().a(ItemType.FIELD).a("filter-input-field"), InteractionIntent.FILTER);
        this.h = new LinearLayoutManager(this);
        gki gki = this.g;
        gki.getClass();
        this.i = new rok(new a() {
            public final void onItemClick(gkq gkq) {
                gki.this.a(gkq);
            }
        });
        RecyclerView recyclerView = (RecyclerView) fay.a(findViewById(R.id.recycler_view));
        recyclerView.a(this.h);
        recyclerView.a((a) this.i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.a();
    }

    public void onStart() {
        super.onStart();
        this.g.a(this, getIntent().getStringExtra("selected-country-code"), getIntent().getParcelableArrayListExtra("calling-codes"));
    }

    public void onStop() {
        super.onStop();
        gki gki = this.g;
        gki.a.c();
        gki.b = null;
        gki.c = null;
    }

    public void onResume() {
        super.onResume();
        findViewById(R.id.search_view_container).requestFocus();
    }

    public final gjf aj() {
        return PageIdentifiers.CALLING_CODE_PICKER;
    }

    public final void a(List<gkq> list) {
        this.i.a((List) list);
    }

    public final void a(String str) {
        this.i.a(str);
    }

    public final void a(int i2) {
        this.h.e(i2);
    }

    public final void a(int i2, gkq gkq) {
        Intent intent = new Intent();
        if (gkq != null) {
            intent.putExtra("calling-code", gkq);
        }
        setResult(i2, intent);
        finish();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CALLING_CODE_PICKER, null);
    }
}
