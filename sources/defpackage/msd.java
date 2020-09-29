package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.followfeed.network.models.FeedItemDataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: msd reason: default package */
public final class msd {
    public static mrz a(String str) {
        try {
            return mrz.create(msa.create(a(new JSONObject(str).getJSONObject("mutations")), Collections.emptyList()));
        } catch (JSONException e) {
            Logger.e(e, e.getMessage(), new Object[0]);
            return mrz.create(msa.create(Collections.emptyList(), Collections.emptyList()));
        }
    }

    private static List<msb> a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3 = jSONObject.getJSONArray("insertions");
        ArrayList a = Lists.a();
        int i = 0;
        while (i < jSONArray3.length()) {
            JSONObject jSONObject2 = jSONArray3.getJSONObject(i);
            String string = jSONObject2.getString("preceding_item_id");
            JSONArray jSONArray4 = jSONObject2.getJSONArray("feed_items");
            ArrayList a2 = Lists.a();
            int i2 = 0;
            while (i2 < jSONArray4.length()) {
                JSONObject jSONObject3 = jSONArray4.getJSONObject(i2);
                String str = "id";
                if (b(jSONObject3) == FeedItemDataType.MUSIC_RELEASE) {
                    String string2 = jSONObject3.getString(str);
                    FeedItemDataType b = b(jSONObject3);
                    Optional b2 = Optional.b(jSONObject3.getString("artist_pick_message"));
                    Optional b3 = Optional.b(jSONObject3.getString("release_date"));
                    List c = c(jSONObject3);
                    String str2 = "title";
                    Optional b4 = Optional.b(jSONObject3.getString(str2));
                    Optional b5 = Optional.b(jSONObject3.getString("subtitle"));
                    Optional b6 = Optional.b(jSONObject3.getString("image_url"));
                    Optional b7 = Optional.b(jSONObject3.getString("entity_uri"));
                    Optional b8 = Optional.b(Boolean.valueOf(jSONObject3.getBoolean("played")));
                    JSONArray jSONArray5 = jSONObject3.getJSONArray("tracks");
                    ArrayList a3 = Lists.a();
                    int i3 = 0;
                    while (i3 < jSONArray5.length()) {
                        JSONObject jSONObject4 = jSONArray5.getJSONObject(i3);
                        JSONArray jSONArray6 = jSONArray3;
                        JSONArray jSONArray7 = jSONArray4;
                        a3.add(msc.create(jSONObject4.getString("uri"), jSONObject4.getString(str2), c(jSONObject4)));
                        i3++;
                        jSONArray3 = jSONArray6;
                        jSONArray4 = jSONArray7;
                    }
                    jSONArray2 = jSONArray3;
                    jSONArray = jSONArray4;
                    a2.add(mry.create(string2, b, b2, b3, c, b4, b5, b6, b7, b8, a3, Optional.e()));
                } else {
                    jSONArray2 = jSONArray3;
                    jSONArray = jSONArray4;
                    a2.add(mry.create(jSONObject3.getString(str), b(jSONObject3), Optional.e(), Optional.e(), c(jSONObject3), Optional.e(), Optional.e(), Optional.e(), Optional.e(), Optional.e(), Collections.emptyList(), Optional.b(jSONObject3.getString("section_title"))));
                }
                i2++;
                jSONArray3 = jSONArray2;
                jSONArray4 = jSONArray;
            }
            JSONArray jSONArray8 = jSONArray3;
            a.add(msb.create(string, a2));
            i++;
            jSONArray3 = jSONArray8;
        }
        return a;
    }

    private static FeedItemDataType b(JSONObject jSONObject) {
        String string = jSONObject.getString(MoatAdEvent.EVENT_TYPE);
        if ("music_release".equals(string)) {
            return FeedItemDataType.MUSIC_RELEASE;
        }
        if ("follow_recs".equals(string)) {
            return FeedItemDataType.FOLLOW_RECOMMENDATION;
        }
        return FeedItemDataType.UNKNOWN;
    }

    private static List<mrr> c(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("artists");
        ArrayList a = Lists.a();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            a.add(mrr.create(jSONObject2.getString("uri"), jSONObject2.getString("display_name"), jSONObject2.getString("image_url")));
        }
        return a;
    }
}
