package com.example.android.miwok;

public class Word {

    private String  mDefaultTranslation;
    private String  mMiwokTranslation;
    private int mImageResourceId = NO_IMGAE_PROVIDED;
    private static final  int NO_IMGAE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int audioresourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioresourceId;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioresourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioresourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId!=NO_IMGAE_PROVIDED;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
