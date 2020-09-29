package com.adjust.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import org.json.JSONObject;

public class AdjustAttribution implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("trackerToken", String.class), new ObjectStreamField("trackerName", String.class), new ObjectStreamField("network", String.class), new ObjectStreamField("campaign", String.class), new ObjectStreamField("adgroup", String.class), new ObjectStreamField("creative", String.class), new ObjectStreamField("clickLabel", String.class), new ObjectStreamField("adid", String.class)};
    private static final long serialVersionUID = 1;
    public String adgroup;
    public String adid;
    public String campaign;
    public String clickLabel;
    public String creative;
    public String network;
    public String trackerName;
    public String trackerToken;

    public static AdjustAttribution a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return null;
        }
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        String str3 = "click_label";
        String str4 = "creative";
        String str5 = "adgroup";
        String str6 = "campaign";
        String str7 = "network";
        String str8 = "tracker_name";
        String str9 = "tracker_token";
        if ("unity".equals(str2)) {
            String str10 = "";
            adjustAttribution.trackerToken = jSONObject.optString(str9, str10);
            adjustAttribution.trackerName = jSONObject.optString(str8, str10);
            adjustAttribution.network = jSONObject.optString(str7, str10);
            adjustAttribution.campaign = jSONObject.optString(str6, str10);
            adjustAttribution.adgroup = jSONObject.optString(str5, str10);
            adjustAttribution.creative = jSONObject.optString(str4, str10);
            adjustAttribution.clickLabel = jSONObject.optString(str3, str10);
            if (str == null) {
                str = str10;
            }
            adjustAttribution.adid = str;
        } else {
            adjustAttribution.trackerToken = jSONObject.optString(str9, null);
            adjustAttribution.trackerName = jSONObject.optString(str8, null);
            adjustAttribution.network = jSONObject.optString(str7, null);
            adjustAttribution.campaign = jSONObject.optString(str6, null);
            adjustAttribution.adgroup = jSONObject.optString(str5, null);
            adjustAttribution.creative = jSONObject.optString(str4, null);
            adjustAttribution.clickLabel = jSONObject.optString(str3, null);
            adjustAttribution.adid = str;
        }
        return adjustAttribution;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdjustAttribution adjustAttribution = (AdjustAttribution) obj;
        return xa.a(this.trackerToken, adjustAttribution.trackerToken) && xa.a(this.trackerName, adjustAttribution.trackerName) && xa.a(this.network, adjustAttribution.network) && xa.a(this.campaign, adjustAttribution.campaign) && xa.a(this.adgroup, adjustAttribution.adgroup) && xa.a(this.creative, adjustAttribution.creative) && xa.a(this.clickLabel, adjustAttribution.clickLabel) && xa.a(this.adid, adjustAttribution.adid);
    }

    public int hashCode() {
        return ((((((((((((((xa.a(this.trackerToken) + 629) * 37) + xa.a(this.trackerName)) * 37) + xa.a(this.network)) * 37) + xa.a(this.campaign)) * 37) + xa.a(this.adgroup)) * 37) + xa.a(this.creative)) * 37) + xa.a(this.clickLabel)) * 37) + xa.a(this.adid);
    }

    public String toString() {
        return xa.a("tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s adid:%s", this.trackerToken, this.trackerName, this.network, this.campaign, this.adgroup, this.creative, this.clickLabel, this.adid);
    }
}
