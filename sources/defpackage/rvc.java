package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.spotify.music.libs.callingcode.CallingCodePickerActivity;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rvc reason: default package */
public final class rvc<H extends Parcelable> extends gmg<H> {
    private final Fragment e;

    /* renamed from: rvc$a */
    class a extends c {
        private a() {
        }

        /* synthetic */ a(rvc rvc, byte b) {
            this();
        }

        public final void a(Bundle bundle) {
            bundle.putParcelable("selected-calling-code", rvc.this.d);
        }

        public final void b(Bundle bundle) {
            rvc.b(rvc.this, bundle);
        }

        public final void a(int i, int i2, Intent intent) {
            if (i2 == -1 && i == 46 && intent != null) {
                gkq gkq = (gkq) intent.getParcelableExtra("calling-code");
                if (gkq != null) {
                    rvc.this.a(gkq);
                }
            }
        }
    }

    public rvc(Context context, Fragment fragment, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, gkl gkl, Scheduler scheduler, Scheduler scheduler2, b bVar, defpackage.gmg.a<H> aVar2) {
        super(context, gkl, scheduler, scheduler2, bVar, aVar2);
        this.e = fragment;
        aVar.a(new a(this, 0));
    }

    public final void a(List<gkq> list, gkq gkq) {
        this.e.startActivityForResult(CallingCodePickerActivity.a(this.e.o(), gkq, new ArrayList(list), R.drawable.bg_calling_code_picker), 46);
    }

    static /* synthetic */ void b(rvc rvc, Bundle bundle) {
        if (bundle != null) {
            rvc.d = (gkq) bundle.getParcelable("selected-calling-code");
        }
    }
}
