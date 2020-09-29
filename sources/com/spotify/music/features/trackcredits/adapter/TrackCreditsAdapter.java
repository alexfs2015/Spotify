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
    public final List<qnj> a = Lists.a();

    public enum ViewType {
        HEADER,
        ROW,
        REPORT_ERROR
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (i == ViewType.HEADER.ordinal()) {
            return fqg.a(fqb.e().a(viewGroup.getContext(), viewGroup));
        }
        if (i == ViewType.ROW.ordinal()) {
            fqb.b();
            return fqg.a(fqg.a(frq.a(viewGroup.getContext(), viewGroup)).a);
        } else if (i == ViewType.REPORT_ERROR.ordinal()) {
            fqb.b();
            frd a2 = frq.a(viewGroup.getContext(), viewGroup);
            ImageButton b = jwz.b(viewGroup.getContext(), SpotifyIconV2.CHEVRON_RIGHT);
            b.setClickable(false);
            a2.a(b);
            return fqg.a(fqg.a(a2).a);
        } else {
            StringBuilder sb = new StringBuilder("Unsupported view type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void a(u uVar, int i) {
        int a2 = a(i);
        if (a2 == ViewType.HEADER.ordinal()) {
            frs frs = (frs) fqf.a(uVar.o, frs.class);
            String a3 = ((qnj) this.a.get(i)).a();
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
            frs.a((CharSequence) a3);
        }
        if (a2 == ViewType.ROW.ordinal()) {
            ((frd) fqf.a(uVar.o, frd.class)).a(((qnj) this.a.get(i)).a());
        }
        if (a2 == ViewType.REPORT_ERROR.ordinal()) {
            frd frd = (frd) fqf.a(uVar.o, frd.class);
            frd.a(uVar.o.getContext().getString(R.string.track_credits_report_error));
            frd.getView().setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    TrackCreditsAdapter.this.a(view);
                }
            });
        }
    }

    public final int b() {
        return this.a.size();
    }

    public final int a(int i) {
        return ((qnj) this.a.get(i)).b().ordinal();
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://artists.spotify.com/faq/music#this-songs-credits-are-incorrect-how-can-they-be-fixed"));
        view.getContext().startActivity(intent);
    }
}
