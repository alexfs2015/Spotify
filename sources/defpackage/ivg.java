package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.List;

/* renamed from: ivg reason: default package */
public class ivg extends jrd implements ivm, jqx {
    private static String T = ViewUris.ab.toString();
    public iuw a;
    public ivk b;

    public static ivg a(fqn fqn) {
        ivg ivg = new ivg();
        fqo.a((Fragment) ivg, fqn);
        return ivg;
    }

    public static boolean b(Intent intent) {
        return intent.hasExtra("event-result-arg");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(p());
        recyclerView.a((i) new LinearLayoutManager(p()));
        recyclerView.a((h) new iux((int) o().getResources().getDimension(R.dimen.concerts_list_bottom_padding)), -1);
        recyclerView.a((a) this.a);
        return recyclerView;
    }

    public final void a(List<ConcertResult> list) {
        iuw iuw = this.a;
        iuw.a.g = list;
        iuw.e();
    }

    public final void aP_() {
        super.aP_();
        ivk ivk = this.b;
        if (ivk.c != EventResult.EMPTY) {
            a(ivk.c.getConcertResults());
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CONCERTS_GROUP, null);
    }

    public final uqm ag() {
        return uqo.al;
    }

    public final String b(Context context) {
        return context.getString(R.string.events_hub_title);
    }

    public final String e() {
        return T;
    }
}
