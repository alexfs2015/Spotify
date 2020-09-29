package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.endpoint.share.QueryParameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: khx reason: default package */
public final class khx {
    static Map<String, String> a(List<QueryParameter> list) {
        HashMap hashMap = new HashMap(list.size());
        for (QueryParameter queryParameter : list) {
            hashMap.put(queryParameter.key(), queryParameter.value());
        }
        return hashMap;
    }
}
