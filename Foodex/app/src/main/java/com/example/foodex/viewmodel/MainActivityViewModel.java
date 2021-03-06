package com.example.foodex.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.foodex.data.UserRepository;

public class MainActivityViewModel extends AndroidViewModel {

    private UserRepository userRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        userRepository = UserRepository.getInstance();
    }

    public MutableLiveData<String> getAuthenticationMessage() {
        return userRepository.getAuthenticationMessage();
    }

    public MutableLiveData<Boolean> getProgressBar() {
        return userRepository.getProgressBar();
    }

    public MutableLiveData<Boolean> getCompleted() {
        return userRepository.getCompleted();
    }


}
