package com.example.android.bookstoreapp.data;

import android.provider.BaseColumns;

public class BookContract {

    public static abstract class BookEntry implements BaseColumns{
        public static final String TABLE_NAME = "products";

        public static final String _ID = BaseColumns._ID ;
        public static final String COLUMN_PRODUCT_NAME = "name";
        public static final String COLUMN_PRODUCT_PRICE = "price";
        public static final String COLUMN_PRODUCT_QUANTITY = "quantity";
        public static final String COLUMN_PRODUCT_SUPPLIER_NAME = "supplierName";
        public static final String COLUMN_PRODUCT_SUPPLIER_PHONE_NUMBER = "supplierPhoneNumber";
    }
}
