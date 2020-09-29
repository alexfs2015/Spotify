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

public class CallingCodePickerActivity extends lbm implements glw, uqq {
    public glu g;
    private i h;
    private rxq i;

    public static Intent a(Context context, gmc gmc, ArrayList<gmc> arrayList, int i2) {
        Intent intent = new Intent(context, CallingCodePickerActivity.class);
        intent.putExtra("selected-country-code", gmc != null ? gmc.a() : null);
        intent.putParcelableArrayListExtra("calling-codes", arrayList);
        intent.putExtra("top-background-id", i2);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.a();
    }

    public final void a(int i2) {
        this.h.e(i2);
    }

    public final void a(int i2, gmc gmc) {
        Intent intent = new Intent();
        if (gmc != null) {
            intent.putExtra("calling-code", gmc);
        }
        setResult(i2, intent);
        finish();
    }

    public final void a(String str) {
        this.i.a(str);
    }

    public final void a(List<gmc> list) {
        this.i.a((List) list);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CALLING_CODE_PICKER, null);
    }

    public final gkq aj() {
        return PageIdentifiers.CALLING_CODE_PICKER;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_calling_code_picker);
        gko.a(findViewById(R.id.calling_code_picker_root), PageIdentifiers.CALLING_CODE_PICKER.a());
        int intExtra = getIntent().getIntExtra("top-background-id", 0);
        if (intExtra != 0) {
            View findViewById = findViewById(R.id.top_background);
            fbp.a(findViewById);
            fbp.b(intExtra != 0);
            findViewById.setBackground(new LayerDrawable(new Drawable[]{fr.a((Context) this, intExtra), fr.a((Context) this, (int) R.drawable.bg_fade_to_black)}));
            findViewById.setVisibility(0);
        }
        fsy a = ftc.a((GlueToolbarLayout) findViewById(R.id.toolbar));
        a.a((CharSequence) getString(R.string.title));
        ImageButton b = jyz.b(this, SpotifyIconV2.X);
        a.a(ToolbarSide.START, b, R.id.action_cancel);
        gko.a((View) b, gkp.b().a().a(ItemType.BUTTON).a("cancel-button"), InteractionIntent.CLOSE);
        b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CallingCodePickerActivity.this.a(view);
            }
        });
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        searchView.l = new b() {
            public final boolean a(String str) {
                glu glu = CallingCodePickerActivity.this.g;
                if (glu.b != null) {
                    glu.b.a(str);
                }
                return true;
            }
        };
        gko.a((View) searchView, gkp.b().a().a(ItemType.FIELD).a("filter-input-field"), InteractionIntent.FILTER);
        this.h = new LinearLayoutManager(this);
        glu glu = this.g;
        glu.getClass();
        this.i = new rxq(new a() {
            public final void onItemClick(gmc gmc) {
                glu.this.a(gmc);
            }
        });
        RecyclerView recyclerView = (RecyclerView) fbp.a(findViewById(R.id.recycler_view));
        recyclerView.a(this.h);
        recyclerView.a((a) this.i);
    }

    public void onResume() {
        super.onResume();
        findViewById(R.id.search_view_container).requestFocus();
    }

    public void onStart() {
        super.onStart();
        this.g.a(this, getIntent().getStringExtra("selected-country-code"), getIntent().getParcelableArrayListExtra("calling-codes"));
    }

    public void onStop() {
        super.onStop();
        glu glu = this.g;
        glu.a.c();
        glu.b = null;
        glu.c = null;
    }
}
