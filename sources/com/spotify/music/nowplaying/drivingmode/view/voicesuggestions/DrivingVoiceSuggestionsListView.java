package com.spotify.music.nowplaying.drivingmode.view.voicesuggestions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;

public class DrivingVoiceSuggestionsListView extends LinearLayoutCompat implements a<tqm> {
    private tqq a;

    public DrivingVoiceSuggestionsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public DrivingVoiceSuggestionsListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        inflate(getContext(), R.layout.driving_voice_suggestions, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.driving_voice_suggestions);
        recyclerView.a((i) new LinearLayoutManager(getContext()));
        recyclerView.q = true;
        recyclerView.a((h) new tqp(fr.a(getContext(), (int) R.drawable.driving_voice_suggestions_divider)), -1);
        this.a = new tqq(this);
        recyclerView.a((a) this.a);
    }

    public /* bridge */ /* synthetic */ void onItemClick(int i, View view, Object obj) {
    }
}
