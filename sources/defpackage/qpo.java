package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.regex.Pattern;

/* renamed from: qpo reason: default package */
final class qpo {
    private static final Pattern a = Pattern.compile("\\?.*");
    private static final Uri b = Uri.parse("https://open.spotify.com/internal/pullcontext");

    static Uri a(String str) {
        Uri parse = Uri.parse(str);
        return parse.equals(Uri.EMPTY) ? b : parse;
    }

    static Uri a(Uri uri) {
        if (!uri.isHierarchical()) {
            return Uri.parse(a.matcher(uri.toString()).replaceFirst(""));
        }
        Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("ecf")) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return clearQuery.build();
    }
}
