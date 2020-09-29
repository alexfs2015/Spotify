package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.spotify.music.R;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;

/* renamed from: qfp reason: default package */
public final class qfp {
    private static Gender[] a = {Gender.MALE, Gender.FEMALE, Gender.NEUTRAL};
    private static final Integer[] b;
    private static final Integer[] c;

    static {
        Integer valueOf = Integer.valueOf(R.string.choose_username_gender_male);
        Integer valueOf2 = Integer.valueOf(R.string.choose_username_gender_female);
        b = new Integer[]{valueOf, valueOf2};
        c = new Integer[]{valueOf, valueOf2, Integer.valueOf(R.string.choose_username_gender_neutral)};
    }

    public static int a(Gender gender) {
        return c[gender.ordinal()].intValue();
    }

    public static String[] a(Context context, boolean z) {
        fbx a2 = fbx.a((E[]) z ? c : b);
        context.getClass();
        return (String[]) a2.a((Function<? super E, T>) new $$Lambda$59u4Z0fA0mRCDpXAOH7EMH5njwU<Object,T>(context)).a(String.class);
    }

    public static Gender a(int i) {
        return a[i];
    }
}
