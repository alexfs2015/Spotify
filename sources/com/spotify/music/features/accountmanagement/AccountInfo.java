package com.spotify.music.features.accountmanagement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@JsonDeserialize(using = AccountInfo_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountInfo implements Parcelable, JacksonModel {
    public static final Creator<AccountInfo> CREATOR = new Creator<AccountInfo>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AccountInfo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AccountInfo[i];
        }
    };
    @JsonProperty("current_product")
    private final Product mCurrentProduct;
    @JsonProperty("expiry_date")
    private final Date mExpiryDate;
    @JsonProperty("grace_period")
    private final boolean mGracePeriod;
    @JsonProperty("has_subscription")
    private final boolean mHasSubscription;
    @JsonProperty("next_billing_date")
    private final Date mNextBillingDate;
    @JsonProperty("next_product")
    private final Product mNextProduct;
    @JsonProperty("recurring_details")
    private final PaymentProvider mPaymentProvider;
    @JsonProperty("will_recur")
    private final boolean mWillRecur;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PaymentProvider implements Parcelable, JacksonModel {
        private static final String ADYEN_CARDS = "adyen_cards";
        public static final Creator<PaymentProvider> CREATOR = new Creator<PaymentProvider>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new PaymentProvider(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new PaymentProvider[i];
            }
        };
        private static final String DIGITALRIVER = "digitalriver";
        private static final String DIGITALRIVER_NETGIRO = "digitalriver_netgiro";
        private static final Set<String> creditCardProviders = new HashSet(Arrays.asList(new String[]{ADYEN_CARDS, DIGITALRIVER, DIGITALRIVER_NETGIRO}));
        private final String mCountry;
        private final String mDescription;
        private final String mProvider;

        protected PaymentProvider(Parcel parcel) {
            this.mProvider = parcel.readString();
            this.mDescription = parcel.readString();
            this.mCountry = parcel.readString();
        }

        @JsonCreator
        public PaymentProvider(@JsonProperty("provider") String str, @JsonProperty("description") String str2, @JsonProperty("country") String str3) {
            this.mProvider = str;
            this.mDescription = str2;
            this.mCountry = str3;
        }

        public int describeContents() {
            return 0;
        }

        public String getCountry() {
            return this.mCountry;
        }

        public String getDescription() {
            return this.mDescription;
        }

        public String getProvider() {
            return this.mProvider;
        }

        public boolean isCreditCard() {
            return creditCardProviders.contains(this.mProvider);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mProvider);
            parcel.writeString(this.mDescription);
            parcel.writeString(this.mCountry);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Product implements Parcelable, JacksonModel {
        public static final Creator<Product> CREATOR = new Creator<Product>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Product(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Product[i];
            }
        };
        private final String mCountry;
        private final boolean mHasAdditionalTax;
        private final String mPrice;

        protected Product(Parcel parcel) {
            this.mCountry = parcel.readString();
            this.mHasAdditionalTax = juo.a(parcel);
            this.mPrice = parcel.readString();
        }

        @JsonCreator
        public Product(@JsonProperty("country") String str, @JsonProperty("country_has_additional_tax") boolean z, @JsonProperty("price") String str2) {
            this.mCountry = str;
            this.mHasAdditionalTax = z;
            this.mPrice = str2;
        }

        public int describeContents() {
            return 0;
        }

        public String getCountry() {
            return this.mCountry;
        }

        public String getPrice() {
            return this.mPrice;
        }

        public boolean hasAdditionalTax() {
            return this.mHasAdditionalTax;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mCountry);
            juo.a(parcel, this.mHasAdditionalTax);
            parcel.writeString(this.mPrice);
        }
    }

    private AccountInfo(Parcel parcel) {
        this.mHasSubscription = juo.a(parcel);
        this.mWillRecur = juo.a(parcel);
        this.mGracePeriod = juo.a(parcel);
        this.mCurrentProduct = (Product) juo.b(parcel, Product.CREATOR);
        this.mNextProduct = (Product) juo.b(parcel, Product.CREATOR);
        long readLong = parcel.readLong();
        Date date = null;
        this.mNextBillingDate = readLong == -1 ? null : new Date(readLong);
        long readLong2 = parcel.readLong();
        if (readLong2 != -1) {
            date = new Date(readLong2);
        }
        this.mExpiryDate = date;
        this.mPaymentProvider = (PaymentProvider) juo.b(parcel, PaymentProvider.CREATOR);
    }

    @JsonCreator
    public AccountInfo(@JsonProperty("has_subscription") boolean z, @JsonProperty("will_recur") boolean z2, @JsonProperty("grace_period") boolean z3, @JsonProperty("current_product") Product product, @JsonProperty("next_product") Product product2, @JsonProperty("next_billing_date") String str, @JsonProperty("expiry_date") String str2, @JsonProperty("recurring_details") PaymentProvider paymentProvider) {
        this.mHasSubscription = z;
        this.mWillRecur = z2;
        this.mGracePeriod = z3;
        this.mCurrentProduct = product;
        this.mNextProduct = product2;
        this.mNextBillingDate = lqi.a(str);
        this.mExpiryDate = lqi.a(str2);
        this.mPaymentProvider = paymentProvider;
    }

    public int describeContents() {
        return 0;
    }

    @JsonGetter("next_billing_date")
    public Date getNextBillingDate() {
        return this.mNextBillingDate;
    }

    @JsonGetter("next_product")
    public Product getNextProduct() {
        return this.mNextProduct;
    }

    @JsonGetter("recurring_details")
    public PaymentProvider getPaymentProvider() {
        return this.mPaymentProvider;
    }

    @JsonGetter("has_subscription")
    public boolean hasSubscription() {
        return this.mHasSubscription;
    }

    @JsonGetter("grace_period")
    public boolean isGracePeriod() {
        return this.mGracePeriod;
    }

    @JsonGetter("will_recur")
    public boolean willRecur() {
        return this.mWillRecur;
    }

    public void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.mHasSubscription);
        juo.a(parcel, this.mWillRecur);
        juo.a(parcel, this.mGracePeriod);
        juo.a(parcel, (Parcelable) this.mCurrentProduct, i);
        juo.a(parcel, (Parcelable) this.mNextProduct, i);
        Date date = this.mNextBillingDate;
        long j = -1;
        parcel.writeLong(date == null ? -1 : date.getTime());
        Date date2 = this.mExpiryDate;
        if (date2 != null) {
            j = date2.getTime();
        }
        parcel.writeLong(j);
        juo.a(parcel, (Parcelable) this.mPaymentProvider, i);
    }
}
