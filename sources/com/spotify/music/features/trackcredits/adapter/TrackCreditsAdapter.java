package com.spotify.music.features.trackcredits.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import java.util.List;

public final class TrackCreditsAdapter extends a<u> {
    public final List<qvs> a = Lists.a();

    public enum ViewType {
        HEADER,
        ROW,
        REPORT_ERROR
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a(view, "https://artists.spotify.com/faq/music#this-songs-credits-are-incorrect-how-can-they-be-fixed");
    }

    private static void a(View view, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        view.getContext().startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qvs qvs, View view) {
        a(view, (String) qvs.b().c());
    }

    public final int a(int i) {
        return ((qvs) this.a.get(i)).c().ordinal();
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (i == ViewType.HEADER.ordinal()) {
            return fra.a(fqv.e().a(viewGroup.getContext(), viewGroup));
        }
        if (i == ViewType.ROW.ordinal() || i == ViewType.REPORT_ERROR.ordinal()) {
            fqv.b();
            frx a2 = fsk.a(viewGroup.getContext(), viewGroup);
            ImageButton b = jyz.b(viewGroup.getContext(), SpotifyIconV2.CHEVRON_RIGHT);
            b.setClickable(false);
            a2.a(b);
            return fra.a(fra.a(a2).a);
        }
        StringBuilder sb = new StringBuilder("Unsupported view type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(u uVar, int i) {
        int a2 = a(i);
        qvs qvs = (qvs) this.a.get(i);
        if (a2 == ViewType.HEADER.ordinal()) {
            fsm fsm = (fsm) fqz.a(uVar.o, fsm.class);
            String a3 = qvs.a();
            Context context = uVar.o.getContext();
            char c = 65535;
            switch (a3.hashCode()) {
                case -1812638661:
                    if (a3.equals("Source")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1027308992:
                    if (a3.equals("Writers")) {
                        c = 2;
                        break;
                    }
                    break;
                case -271042939:
                    if (a3.equals("Performers")) {
                        c = 0;
                        break;
                    }
                    break;
                case 952124161:
                    if (a3.equals("Producers")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a3 = context.getString(R.string.track_credits_section_header_performers);
            } else if (c == 1) {
                a3 = context.getString(R.string.track_credits_section_header_producers);
            } else if (c == 2) {
                a3 = context.getString(R.string.track_credits_section_header_writers);
            } else if (c == 3) {
                a3 = context.getString(R.string.track_credits_section_header_source);
            }
            fsm.a((CharSequence) a3);
        }
        if (a2 == ViewType.ROW.ordinal()) {
            frx frx = (frx) fqz.a(uVar.o, frx.class);
            frx.a(qvs.a());
            View a4 = frx.a();
            if (qvs.b().b()) {
                frx.getView().setOnClickListener(new OnClickListener(qvs) {
                    private final /* synthetic */ qvs f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        TrackCreditsAdapter.this.a(this.f$1, view);
                    }
                });
                a4.setVisibility(0);
            } else {
                frx.getView().setOnClickListener(null);
                a4.setVisibility(8);
            }
        }
        if (a2 == ViewType.REPORT_ERROR.ordinal()) {
            frx frx2 = (frx) fqz.a(uVar.o, frx.class);
            frx2.a(uVar.o.getContext().getString(R.string.track_credits_report_error));
            frx2.getView().setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    TrackCreditsAdapter.this.a(view);
                }
            });
        }
    }

    public final int b() {
        return this.a.size();
    }
}
