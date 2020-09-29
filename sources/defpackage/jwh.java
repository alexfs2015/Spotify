package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.regex.Pattern;

/* renamed from: jwh reason: default package */
public final class jwh {
    public static final ImmutableList<Pattern> b = ImmutableList.a(Pattern.compile("^SM-G97[0357]U.*$"), Pattern.compile("^SM-F900U.*$"), Pattern.compile("^SM-F977[UPT].*$"), Pattern.compile("^SM-N97[05]U.*$"), Pattern.compile("^SM-N875U.*$"), Pattern.compile("^SM-N976V.*$"));
    public final String a;

    jwh(String str) {
        this.a = str;
    }
}
