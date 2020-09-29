package com.spotify.music.sociallistening.facepile;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;

public class FacePile extends RecyclerView {

    static class a extends h {
        private final int a;

        public a(Context context) {
            this.a = vfj.b(13.0f, context.getResources());
        }

        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            if (RecyclerView.e(view) != 0) {
                rect.set(-this.a, 0, 0, 0);
            }
        }
    }

    public FacePile(Context context) {
        super(context);
    }

    public FacePile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a((i) new LinearLayoutManager(0, false));
        a((h) new a(context), -1);
    }
}
