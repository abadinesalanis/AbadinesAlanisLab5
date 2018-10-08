package com.abadines.alanis;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class CustomerService extends IntentService{
    public CustomerService() {
        super("CustomerService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Service", "SERVICE RUNNING AT THE SPEED OF SOUND");
    }
}