package com.example.android.pets.data;

import android.provider.BaseColumns;

import com.example.android.pets.EditorActivity;

public final class PetContract {
    public static abstract class PetEntry implements BaseColumns{
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "style";
        public static final String COLUMN_PET_WEIGHT = "in_stock";
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
