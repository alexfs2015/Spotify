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

/* renamed from: sem reason: default package */
public final class sem<H extends Parcelable> extends gnv<H> {
    private final Fragment e;

    /* renamed from: sem$a */
    class a extends c {
        private a() {
        }

        /* synthetic */ a(sem sem, byte b) {
            this();
        }

        public final void a(int i, int i2, Intent intent) {
            if (i2 == -1 && i == 46 && intent != null) {
                gmc gmc = (gmc) intent.getParcelableExtra("calling-code");
                if (gmc != null) {
                    sem.this.a(gmc);
                }
            }
        }

        public final void a(Bundle bundle) {
            bundle.putParcelable("selected-calling-code", sem.this.d);
        }

        public final void b(Bundle bundle) {
            sem.b(sem.this, bundle);
        }
    }

    public sem(Context context, Fragment fragment, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, glx glx, Scheduler scheduler, Scheduler scheduler2, b bVar, defpackage.gnv.a<H> aVar2) {
        super(context, glx, scheduler, scheduler2, bVar, aVar2);
        this.e = fragment;
        aVar.a(new a(this, 0));
    }

    static /* synthetic */ void b(sem sem, Bundle bundle) {
        if (bundle != null) {
            sem.d = (gmc) bundle.getParcelable("selected-calling-code");
        }
    }

    public final void a(List<gmc> list, gmc gmc) {
        this.e.startActivityForResult(CallingCodePickerActivity.a(this.e.o(), gmc, new ArrayList(list), R.drawable.bg_calling_code_picker), 46);
    }
}
