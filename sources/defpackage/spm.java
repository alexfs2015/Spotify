package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: spm reason: default package */
public abstract class spm {
    public static final jol b = new a(0);

    /* renamed from: spm$a */
    static class a implements jol {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final String b(Context context) {
            throw new UnsupportedOperationException();
        }

        public final String e() {
            throw new UnsupportedOperationException();
        }

        public final Fragment ae() {
            throw new UnsupportedOperationException();
        }

        public final udr ag() {
            throw new UnsupportedOperationException();
        }

        public final rdh af() {
            throw new UnsupportedOperationException();
        }
    }

    public abstract jol a(String str, String str2, SessionState sessionState);
}
